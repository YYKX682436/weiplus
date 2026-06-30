package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class re extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.ue f87065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f87066e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f87067f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.ne f87068g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re(com.tencent.mm.plugin.appbrand.page.ue ueVar, android.content.Context context, com.tencent.mm.plugin.appbrand.page.n7 n7Var, com.tencent.mm.plugin.appbrand.page.ne neVar) {
        super(1);
        this.f87065d = ueVar;
        this.f87066e = context;
        this.f87067f = n7Var;
        this.f87068g = neVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String username = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(username, "username");
        int i17 = com.tencent.mm.plugin.appbrand.page.ue.f87151b;
        com.tencent.mm.plugin.appbrand.page.ue ueVar = this.f87065d;
        ueVar.getClass();
        com.tencent.mars.xlog.Log.i(ueVar.f87152a, "performRecentlyForwardClick, toUser: ".concat(username));
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f87067f;
        com.tencent.mm.plugin.appbrand.report.v0.e(n7Var.getAppId(), n7Var.X1(), 50, "", com.tencent.mm.sdk.platformtools.t8.i1(), 1, 0);
        com.tencent.mm.plugin.appbrand.menu.u0 H1 = n7Var.H1(3);
        com.tencent.mm.plugin.appbrand.menu.z0.b(this.f87066e, n7Var, H1, new com.tencent.mm.plugin.appbrand.page.oe(H1, username));
        com.tencent.mm.plugin.appbrand.page.ne neVar = this.f87068g;
        neVar.getClass();
        com.tencent.mars.xlog.Log.i(neVar.f86931a, "onRecentForwardClick, username: ".concat(username));
        neVar.f86932b = username;
        neVar.a(true);
        return jz5.f0.f302826a;
    }
}
