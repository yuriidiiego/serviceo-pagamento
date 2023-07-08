package br.org.portalfadesp.servicopagamento.domain.pagamento.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PagamentoNotFoundException extends RuntimeException {

  public PagamentoNotFoundException() {
    super("Pagamento não encontrado");
  }
}
