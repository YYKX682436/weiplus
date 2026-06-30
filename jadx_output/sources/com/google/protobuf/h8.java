package com.google.protobuf;

/* loaded from: classes16.dex */
public class h8 implements com.google.protobuf.f8 {
    @Override // com.google.protobuf.f8
    public java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.e8 e8Var = (com.google.protobuf.e8) obj;
        com.google.protobuf.e8 e8Var2 = (com.google.protobuf.e8) obj2;
        if (!e8Var2.isEmpty()) {
            if (!e8Var.f45063d) {
                e8Var = e8Var.f();
            }
            e8Var.d();
            if (!e8Var2.isEmpty()) {
                e8Var.putAll(e8Var2);
            }
        }
        return e8Var;
    }

    @Override // com.google.protobuf.f8
    public com.google.protobuf.u7 b(java.lang.Object obj) {
        return ((com.google.protobuf.v7) obj).f45612a;
    }

    @Override // com.google.protobuf.f8
    public java.lang.Object c(java.lang.Object obj) {
        ((com.google.protobuf.e8) obj).f45063d = false;
        return obj;
    }

    @Override // com.google.protobuf.f8
    public int d(int i17, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.e8 e8Var = (com.google.protobuf.e8) obj;
        com.google.protobuf.v7 v7Var = (com.google.protobuf.v7) obj2;
        int i18 = 0;
        if (!e8Var.isEmpty()) {
            for (java.util.Map.Entry entry : e8Var.entrySet()) {
                java.lang.Object key = entry.getKey();
                java.lang.Object value = entry.getValue();
                v7Var.getClass();
                int p17 = com.google.protobuf.k0.p(i17);
                int a17 = com.google.protobuf.v7.a(v7Var.f45612a, key, value);
                i18 += p17 + com.google.protobuf.k0.r(a17) + a17;
            }
        }
        return i18;
    }

    @Override // com.google.protobuf.f8
    public java.util.Map e(java.lang.Object obj) {
        return (com.google.protobuf.e8) obj;
    }

    @Override // com.google.protobuf.f8
    public java.lang.Object f(java.lang.Object obj) {
        return com.google.protobuf.e8.f45062e.f();
    }

    @Override // com.google.protobuf.f8
    public java.util.Map g(java.lang.Object obj) {
        return (com.google.protobuf.e8) obj;
    }

    @Override // com.google.protobuf.f8
    public boolean h(java.lang.Object obj) {
        return !((com.google.protobuf.e8) obj).f45063d;
    }
}
