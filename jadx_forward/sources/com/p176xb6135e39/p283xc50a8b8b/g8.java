package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public class g8 implements com.p176xb6135e39.p283xc50a8b8b.f8 {
    @Override // com.p176xb6135e39.p283xc50a8b8b.f8
    public java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        com.p176xb6135e39.p283xc50a8b8b.d8 d8Var = (com.p176xb6135e39.p283xc50a8b8b.d8) obj;
        com.p176xb6135e39.p283xc50a8b8b.d8 d8Var2 = (com.p176xb6135e39.p283xc50a8b8b.d8) obj2;
        if (!d8Var.f126558a) {
            new com.p176xb6135e39.p283xc50a8b8b.d8(d8Var.f126562e, com.p176xb6135e39.p283xc50a8b8b.c8.MAP, com.p176xb6135e39.p283xc50a8b8b.e8.c(d8Var.e()));
        }
        ((com.p176xb6135e39.p283xc50a8b8b.b8) d8Var.g()).putAll(com.p176xb6135e39.p283xc50a8b8b.e8.c(d8Var2.e()));
        return d8Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.f8
    public com.p176xb6135e39.p283xc50a8b8b.u7 b(java.lang.Object obj) {
        return ((com.p176xb6135e39.p283xc50a8b8b.t7) obj).f127084f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.f8
    public java.lang.Object c(java.lang.Object obj) {
        ((com.p176xb6135e39.p283xc50a8b8b.d8) obj).f126558a = false;
        return obj;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.f8
    public int d(int i17, java.lang.Object obj, java.lang.Object obj2) {
        int i18 = 0;
        if (obj != null) {
            java.util.Map e17 = ((com.p176xb6135e39.p283xc50a8b8b.d8) obj).e();
            com.p176xb6135e39.p283xc50a8b8b.t7 t7Var = (com.p176xb6135e39.p283xc50a8b8b.t7) obj2;
            if (!e17.isEmpty()) {
                for (java.util.Map.Entry entry : e17.entrySet()) {
                    int p17 = com.p176xb6135e39.p283xc50a8b8b.k0.p(i17);
                    int a17 = com.p176xb6135e39.p283xc50a8b8b.v7.a(t7Var.f127084f, entry.getKey(), entry.getValue());
                    i18 += p17 + com.p176xb6135e39.p283xc50a8b8b.k0.r(a17) + a17;
                }
            }
        }
        return i18;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.f8
    public java.util.Map e(java.lang.Object obj) {
        return ((com.p176xb6135e39.p283xc50a8b8b.d8) obj).g();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.f8
    public java.lang.Object f(java.lang.Object obj) {
        return new com.p176xb6135e39.p283xc50a8b8b.d8((com.p176xb6135e39.p283xc50a8b8b.t7) obj, com.p176xb6135e39.p283xc50a8b8b.c8.MAP, new java.util.LinkedHashMap());
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.f8
    public java.util.Map g(java.lang.Object obj) {
        return ((com.p176xb6135e39.p283xc50a8b8b.d8) obj).e();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.f8
    public boolean h(java.lang.Object obj) {
        return !((com.p176xb6135e39.p283xc50a8b8b.d8) obj).f126558a;
    }
}
