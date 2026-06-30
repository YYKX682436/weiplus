package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class s2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f79727a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79728b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.w2 f79729c;

    public s2(com.tencent.mm.plugin.appbrand.y yVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.auth.w2 w2Var) {
        this.f79727a = yVar;
        this.f79728b = i17;
        this.f79729c = w2Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.j14 j14Var;
        r45.l24 l24Var = (r45.l24) obj;
        java.lang.Integer valueOf = (l24Var == null || (j14Var = l24Var.f379086d) == null) ? null : java.lang.Integer.valueOf(j14Var.f377491d);
        if (valueOf == null || valueOf.intValue() != -12000) {
            return new jz5.o(l24Var != null ? l24Var.f379086d : null, l24Var != null ? l24Var.f379087e : null, "/cgi-bin/mmbiz-bin/js-login");
        }
        km5.b c17 = km5.u.c();
        java.util.LinkedList linkedList = l24Var.f379088f;
        if (linkedList == null || linkedList.isEmpty()) {
            this.f79727a.a(this.f79728b, this.f79729c.o("fail:internal error scope empty"));
            return null;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.appbrand.jsapi.auth.r2(this.f79727a, c17, this.f79729c, l24Var, this.f79728b));
        return null;
    }
}
