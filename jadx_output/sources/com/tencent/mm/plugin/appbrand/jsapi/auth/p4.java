package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class p4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f79683d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km5.b f79684e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.u4 f79685f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f79686g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f79687h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.n24 f79688i;

    public p4(com.tencent.mm.plugin.appbrand.y yVar, km5.b bVar, com.tencent.mm.plugin.appbrand.jsapi.auth.u4 u4Var, int i17, java.lang.String str, r45.n24 n24Var) {
        this.f79683d = yVar;
        this.f79684e = bVar;
        this.f79685f = u4Var;
        this.f79686g = i17;
        this.f79687h = str;
        this.f79688i = n24Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xi1.g r0Var;
        com.tencent.mm.plugin.appbrand.y yVar = this.f79683d;
        if (!yVar.isRunning()) {
            this.f79684e.a(com.tencent.mm.plugin.appbrand.jsapi.auth.s.f79724d);
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.auth.o4 o4Var = new com.tencent.mm.plugin.appbrand.jsapi.auth.o4(this.f79686g, this.f79684e, this.f79683d, this.f79685f, this.f79687h);
        com.tencent.mm.plugin.appbrand.jsapi.auth.u4 u4Var = this.f79685f;
        android.content.Context b17 = u4Var.b(yVar);
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = yVar.t3();
        if (t37 == null || (r0Var = t37.getWindowAndroid()) == null) {
            r0Var = new com.tencent.mm.plugin.appbrand.platform.window.activity.r0();
        }
        fl1.o oVar = new fl1.o(b17, r0Var, o4Var);
        r45.n24 n24Var = this.f79688i;
        oVar.setAppBrandName(n24Var.f381018g);
        oVar.setRequestDesc(n24Var.f381017f.f378132e);
        oVar.setApplyWording(n24Var.f381024p);
        oVar.setNegativeButtonText(n24Var.f381022n);
        oVar.setPositiveButtonText(n24Var.f381023o);
        oVar.setIconUrl(n24Var.f381019h);
        oVar.setFunctionButtonText("");
        xi1.g windowAndroid = yVar.getWindowAndroid();
        boolean z17 = false;
        if (windowAndroid != null && windowAndroid.isLargeScreenWindow()) {
            z17 = true;
        }
        if (z17) {
            oVar.s(1);
        }
        if (kotlin.jvm.internal.o.b("scope.userInfo", n24Var.f381017f.f378131d)) {
            bf.i iVar = (bf.i) i95.n0.c(bf.i.class);
            if (iVar == null) {
                iVar = new com.tencent.mm.plugin.appbrand.jsapi.auth.n4(n24Var);
            }
            u4Var.e(u4Var.b(yVar), null, iVar.fi(), "scope.userInfo", oVar);
            iVar.Oa(new com.tencent.mm.plugin.appbrand.jsapi.auth.l4(u4Var, yVar, iVar, oVar));
        } else {
            java.lang.String Scope = n24Var.f381017f.f378131d;
            kotlin.jvm.internal.o.f(Scope, "Scope");
            oVar.f263835z = Scope;
        }
        fl1.g2 dialogContainer = yVar.getDialogContainer();
        kotlin.jvm.internal.o.d(dialogContainer);
        dialogContainer.c(oVar);
    }
}
