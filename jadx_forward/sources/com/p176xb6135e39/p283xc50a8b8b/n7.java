package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes13.dex */
public class n7 implements com.p176xb6135e39.p283xc50a8b8b.m8 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.m8[] f126871a;

    public n7(com.p176xb6135e39.p283xc50a8b8b.m8... m8VarArr) {
        this.f126871a = m8VarArr;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.m8
    public com.p176xb6135e39.p283xc50a8b8b.l8 a(java.lang.Class cls) {
        for (com.p176xb6135e39.p283xc50a8b8b.m8 m8Var : this.f126871a) {
            if (m8Var.b(cls)) {
                return m8Var.a(cls);
            }
        }
        java.lang.String name = cls.getName();
        throw new java.lang.UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new java.lang.String("No factory is available for message type: "));
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.m8
    public boolean b(java.lang.Class cls) {
        for (com.p176xb6135e39.p283xc50a8b8b.m8 m8Var : this.f126871a) {
            if (m8Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
