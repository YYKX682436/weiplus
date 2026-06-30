package com.google.protobuf;

/* loaded from: classes16.dex */
public class g8 implements com.google.protobuf.f8 {
    @Override // com.google.protobuf.f8
    public java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.d8 d8Var = (com.google.protobuf.d8) obj;
        com.google.protobuf.d8 d8Var2 = (com.google.protobuf.d8) obj2;
        if (!d8Var.f45025a) {
            new com.google.protobuf.d8(d8Var.f45029e, com.google.protobuf.c8.MAP, com.google.protobuf.e8.c(d8Var.e()));
        }
        ((com.google.protobuf.b8) d8Var.g()).putAll(com.google.protobuf.e8.c(d8Var2.e()));
        return d8Var;
    }

    @Override // com.google.protobuf.f8
    public com.google.protobuf.u7 b(java.lang.Object obj) {
        return ((com.google.protobuf.t7) obj).f45551f;
    }

    @Override // com.google.protobuf.f8
    public java.lang.Object c(java.lang.Object obj) {
        ((com.google.protobuf.d8) obj).f45025a = false;
        return obj;
    }

    @Override // com.google.protobuf.f8
    public int d(int i17, java.lang.Object obj, java.lang.Object obj2) {
        int i18 = 0;
        if (obj != null) {
            java.util.Map e17 = ((com.google.protobuf.d8) obj).e();
            com.google.protobuf.t7 t7Var = (com.google.protobuf.t7) obj2;
            if (!e17.isEmpty()) {
                for (java.util.Map.Entry entry : e17.entrySet()) {
                    int p17 = com.google.protobuf.k0.p(i17);
                    int a17 = com.google.protobuf.v7.a(t7Var.f45551f, entry.getKey(), entry.getValue());
                    i18 += p17 + com.google.protobuf.k0.r(a17) + a17;
                }
            }
        }
        return i18;
    }

    @Override // com.google.protobuf.f8
    public java.util.Map e(java.lang.Object obj) {
        return ((com.google.protobuf.d8) obj).g();
    }

    @Override // com.google.protobuf.f8
    public java.lang.Object f(java.lang.Object obj) {
        return new com.google.protobuf.d8((com.google.protobuf.t7) obj, com.google.protobuf.c8.MAP, new java.util.LinkedHashMap());
    }

    @Override // com.google.protobuf.f8
    public java.util.Map g(java.lang.Object obj) {
        return ((com.google.protobuf.d8) obj).e();
    }

    @Override // com.google.protobuf.f8
    public boolean h(java.lang.Object obj) {
        return !((com.google.protobuf.d8) obj).f45025a;
    }
}
