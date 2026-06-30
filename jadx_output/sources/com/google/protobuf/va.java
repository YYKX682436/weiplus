package com.google.protobuf;

/* loaded from: classes16.dex */
public final class va extends com.google.protobuf.g {
    @Override // com.google.protobuf.e9
    public java.lang.Object parsePartialFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        int F;
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        do {
            try {
                F = d0Var.F();
                if (F == 0) {
                    break;
                }
            } catch (com.google.protobuf.y6 e17) {
                e17.f45739d = b17.build();
                throw e17;
            } catch (java.io.IOException e18) {
                com.google.protobuf.y6 y6Var = new com.google.protobuf.y6(e18);
                y6Var.f45739d = b17.build();
                throw y6Var;
            }
        } while (b17.e(F, d0Var));
        return b17.build();
    }
}
