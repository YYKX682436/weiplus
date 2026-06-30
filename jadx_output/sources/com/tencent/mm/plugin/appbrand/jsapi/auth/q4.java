package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class q4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f79696a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.u4 f79697b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f79698c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f79699d;

    public q4(com.tencent.mm.plugin.appbrand.y yVar, com.tencent.mm.plugin.appbrand.jsapi.auth.u4 u4Var, int i17, java.lang.String str) {
        this.f79696a = yVar;
        this.f79697b = u4Var;
        this.f79698c = i17;
        this.f79699d = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.j14 j14Var;
        r45.n24 n24Var = (r45.n24) obj;
        java.lang.Integer valueOf = (n24Var == null || (j14Var = n24Var.f381015d) == null) ? null : java.lang.Integer.valueOf(j14Var.f377491d);
        if (valueOf == null || valueOf.intValue() != -12000) {
            return n24Var;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.appbrand.jsapi.auth.p4(this.f79696a, km5.u.c(), this.f79697b, this.f79698c, this.f79699d, n24Var));
        return null;
    }
}
