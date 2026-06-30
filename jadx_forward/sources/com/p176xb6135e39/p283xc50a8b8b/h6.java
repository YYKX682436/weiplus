package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class h6 extends com.p176xb6135e39.p283xc50a8b8b.g6 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.reflect.Method f126697f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.reflect.Method f126698g;

    public h6(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.String str, java.lang.Class cls, java.lang.Class cls2, java.lang.String str2) {
        super(b4Var, str, cls, cls2, str2);
        this.f126697f = com.p176xb6135e39.p283xc50a8b8b.l6.m20738xbf18579f(this.f126668a, "newBuilder", new java.lang.Class[0]);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 10);
        sb6.append("get");
        sb6.append(str);
        sb6.append("Builder");
        this.f126698g = com.p176xb6135e39.p283xc50a8b8b.l6.m20738xbf18579f(cls2, sb6.toString(), new java.lang.Class[0]);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.g6, com.p176xb6135e39.p283xc50a8b8b.v5
    public void c(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, java.lang.Object obj) {
        if (!this.f126668a.isInstance(obj)) {
            obj = ((com.p176xb6135e39.p283xc50a8b8b.j8) com.p176xb6135e39.p283xc50a8b8b.l6.m20739xbf185b60(this.f126697f, null, new java.lang.Object[0])).mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) obj).mo20557x85702333();
        }
        super.c(q5Var, obj);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.g6, com.p176xb6135e39.p283xc50a8b8b.v5
    public com.p176xb6135e39.p283xc50a8b8b.j8 l(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        return (com.p176xb6135e39.p283xc50a8b8b.j8) com.p176xb6135e39.p283xc50a8b8b.l6.m20739xbf185b60(this.f126698g, q5Var, new java.lang.Object[0]);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.g6, com.p176xb6135e39.p283xc50a8b8b.v5
    /* renamed from: newBuilder */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20575x3136c9db() {
        return (com.p176xb6135e39.p283xc50a8b8b.j8) com.p176xb6135e39.p283xc50a8b8b.l6.m20739xbf185b60(this.f126697f, null, new java.lang.Object[0]);
    }
}
