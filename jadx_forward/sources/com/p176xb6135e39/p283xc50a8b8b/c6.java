package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class c6 extends com.p176xb6135e39.p283xc50a8b8b.b6 {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.reflect.Method f126515c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Method f126516d;

    public c6(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.String str, java.lang.Class cls, java.lang.Class cls2) {
        super(b4Var, str, cls, cls2);
        this.f126515c = com.p176xb6135e39.p283xc50a8b8b.l6.m20738xbf18579f(this.f126457a, "newBuilder", new java.lang.Class[0]);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 10);
        sb6.append("get");
        sb6.append(str);
        sb6.append("Builder");
        this.f126516d = com.p176xb6135e39.p283xc50a8b8b.l6.m20738xbf18579f(cls2, sb6.toString(), new java.lang.Class[]{java.lang.Integer.TYPE});
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.b6, com.p176xb6135e39.p283xc50a8b8b.v5
    public void d(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, java.lang.Object obj) {
        super.d(q5Var, p(obj));
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.b6, com.p176xb6135e39.p283xc50a8b8b.v5
    public void f(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, int i17, java.lang.Object obj) {
        super.f(q5Var, i17, p(obj));
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.b6, com.p176xb6135e39.p283xc50a8b8b.v5
    public com.p176xb6135e39.p283xc50a8b8b.j8 i(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, int i17) {
        return (com.p176xb6135e39.p283xc50a8b8b.j8) com.p176xb6135e39.p283xc50a8b8b.l6.m20739xbf185b60(this.f126516d, q5Var, new java.lang.Object[]{java.lang.Integer.valueOf(i17)});
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.b6, com.p176xb6135e39.p283xc50a8b8b.v5
    /* renamed from: newBuilder */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20575x3136c9db() {
        return (com.p176xb6135e39.p283xc50a8b8b.j8) com.p176xb6135e39.p283xc50a8b8b.l6.m20739xbf185b60(this.f126515c, null, new java.lang.Object[0]);
    }

    public final java.lang.Object p(java.lang.Object obj) {
        if (this.f126457a.isInstance(obj)) {
            return obj;
        }
        return ((com.p176xb6135e39.p283xc50a8b8b.j8) com.p176xb6135e39.p283xc50a8b8b.l6.m20739xbf185b60(this.f126515c, null, new java.lang.Object[0])).mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) obj).mo20556x59bc66e();
    }
}
