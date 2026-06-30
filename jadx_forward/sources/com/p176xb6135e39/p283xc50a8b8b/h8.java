package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public class h8 implements com.p176xb6135e39.p283xc50a8b8b.f8 {
    @Override // com.p176xb6135e39.p283xc50a8b8b.f8
    public java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        com.p176xb6135e39.p283xc50a8b8b.e8 e8Var = (com.p176xb6135e39.p283xc50a8b8b.e8) obj;
        com.p176xb6135e39.p283xc50a8b8b.e8 e8Var2 = (com.p176xb6135e39.p283xc50a8b8b.e8) obj2;
        if (!e8Var2.isEmpty()) {
            if (!e8Var.f126596d) {
                e8Var = e8Var.f();
            }
            e8Var.d();
            if (!e8Var2.isEmpty()) {
                e8Var.putAll(e8Var2);
            }
        }
        return e8Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.f8
    public com.p176xb6135e39.p283xc50a8b8b.u7 b(java.lang.Object obj) {
        return ((com.p176xb6135e39.p283xc50a8b8b.v7) obj).f127145a;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.f8
    public java.lang.Object c(java.lang.Object obj) {
        ((com.p176xb6135e39.p283xc50a8b8b.e8) obj).f126596d = false;
        return obj;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.f8
    public int d(int i17, java.lang.Object obj, java.lang.Object obj2) {
        com.p176xb6135e39.p283xc50a8b8b.e8 e8Var = (com.p176xb6135e39.p283xc50a8b8b.e8) obj;
        com.p176xb6135e39.p283xc50a8b8b.v7 v7Var = (com.p176xb6135e39.p283xc50a8b8b.v7) obj2;
        int i18 = 0;
        if (!e8Var.isEmpty()) {
            for (java.util.Map.Entry entry : e8Var.entrySet()) {
                java.lang.Object key = entry.getKey();
                java.lang.Object value = entry.getValue();
                v7Var.getClass();
                int p17 = com.p176xb6135e39.p283xc50a8b8b.k0.p(i17);
                int a17 = com.p176xb6135e39.p283xc50a8b8b.v7.a(v7Var.f127145a, key, value);
                i18 += p17 + com.p176xb6135e39.p283xc50a8b8b.k0.r(a17) + a17;
            }
        }
        return i18;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.f8
    public java.util.Map e(java.lang.Object obj) {
        return (com.p176xb6135e39.p283xc50a8b8b.e8) obj;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.f8
    public java.lang.Object f(java.lang.Object obj) {
        return com.p176xb6135e39.p283xc50a8b8b.e8.f126595e.f();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.f8
    public java.util.Map g(java.lang.Object obj) {
        return (com.p176xb6135e39.p283xc50a8b8b.e8) obj;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.f8
    public boolean h(java.lang.Object obj) {
        return !((com.p176xb6135e39.p283xc50a8b8b.e8) obj).f126596d;
    }
}
