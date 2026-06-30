package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public class b6 implements com.p176xb6135e39.p283xc50a8b8b.v5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f126457a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.z5 f126458b;

    public b6(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.String str, java.lang.Class cls, java.lang.Class cls2) {
        com.p176xb6135e39.p283xc50a8b8b.a6 a6Var = new com.p176xb6135e39.p283xc50a8b8b.a6(b4Var, str, cls, cls2);
        this.f126457a = a6Var.f126395c.getReturnType();
        this.f126458b = a6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.v5
    public java.lang.Object a(com.p176xb6135e39.p283xc50a8b8b.l6 l6Var) {
        return m(l6Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.v5
    public int b(com.p176xb6135e39.p283xc50a8b8b.l6 l6Var) {
        return ((java.lang.Integer) com.p176xb6135e39.p283xc50a8b8b.l6.m20739xbf185b60(((com.p176xb6135e39.p283xc50a8b8b.a6) this.f126458b).f126399g, l6Var, new java.lang.Object[0])).intValue();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.v5
    public void c(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, java.lang.Object obj) {
        k(q5Var);
        java.util.Iterator it = ((java.util.List) obj).iterator();
        while (it.hasNext()) {
            d(q5Var, it.next());
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.v5
    public void d(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, java.lang.Object obj) {
        com.p176xb6135e39.p283xc50a8b8b.l6.m20739xbf185b60(((com.p176xb6135e39.p283xc50a8b8b.a6) this.f126458b).f126398f, q5Var, new java.lang.Object[]{obj});
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.v5
    public boolean e(com.p176xb6135e39.p283xc50a8b8b.l6 l6Var) {
        throw new java.lang.UnsupportedOperationException("hasField() called on a repeated field.");
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.v5
    public void f(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, int i17, java.lang.Object obj) {
        com.p176xb6135e39.p283xc50a8b8b.a6 a6Var = (com.p176xb6135e39.p283xc50a8b8b.a6) this.f126458b;
        com.p176xb6135e39.p283xc50a8b8b.l6.m20739xbf185b60(a6Var.f126397e, q5Var, new java.lang.Object[]{java.lang.Integer.valueOf(i17), obj});
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.v5
    public java.lang.Object g(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, int i17) {
        com.p176xb6135e39.p283xc50a8b8b.a6 a6Var = (com.p176xb6135e39.p283xc50a8b8b.a6) this.f126458b;
        return com.p176xb6135e39.p283xc50a8b8b.l6.m20739xbf185b60(a6Var.f126396d, q5Var, new java.lang.Object[]{java.lang.Integer.valueOf(i17)});
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.v5
    public boolean h(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        throw new java.lang.UnsupportedOperationException("hasField() called on a repeated field.");
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.v5
    public com.p176xb6135e39.p283xc50a8b8b.j8 i(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, int i17) {
        throw new java.lang.UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.v5
    public int j(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        return ((java.lang.Integer) com.p176xb6135e39.p283xc50a8b8b.l6.m20739xbf185b60(((com.p176xb6135e39.p283xc50a8b8b.a6) this.f126458b).f126400h, q5Var, new java.lang.Object[0])).intValue();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.v5
    public void k(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        com.p176xb6135e39.p283xc50a8b8b.l6.m20739xbf185b60(((com.p176xb6135e39.p283xc50a8b8b.a6) this.f126458b).f126401i, q5Var, new java.lang.Object[0]);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.v5
    public com.p176xb6135e39.p283xc50a8b8b.j8 l(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        throw new java.lang.UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.v5
    public java.lang.Object m(com.p176xb6135e39.p283xc50a8b8b.l6 l6Var) {
        return com.p176xb6135e39.p283xc50a8b8b.l6.m20739xbf185b60(((com.p176xb6135e39.p283xc50a8b8b.a6) this.f126458b).f126393a, l6Var, new java.lang.Object[0]);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.v5
    public java.lang.Object n(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        return com.p176xb6135e39.p283xc50a8b8b.l6.m20739xbf185b60(((com.p176xb6135e39.p283xc50a8b8b.a6) this.f126458b).f126394b, q5Var, new java.lang.Object[0]);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.v5
    /* renamed from: newBuilder */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20575x3136c9db() {
        throw new java.lang.UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.v5
    public java.lang.Object o(com.p176xb6135e39.p283xc50a8b8b.l6 l6Var, int i17) {
        com.p176xb6135e39.p283xc50a8b8b.a6 a6Var = (com.p176xb6135e39.p283xc50a8b8b.a6) this.f126458b;
        return com.p176xb6135e39.p283xc50a8b8b.l6.m20739xbf185b60(a6Var.f126395c, l6Var, new java.lang.Object[]{java.lang.Integer.valueOf(i17)});
    }
}
