package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class qa implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandUserInfoAuthorizeUI f89962a;

    public qa(com.tencent.mm.plugin.appbrand.ui.AppBrandUserInfoAuthorizeUI appBrandUserInfoAuthorizeUI) {
        this.f89962a = appBrandUserInfoAuthorizeUI;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        int i17 = com.tencent.mm.plugin.appbrand.ui.AppBrandUserInfoAuthorizeUI.f89447q;
        com.tencent.mm.plugin.appbrand.ui.AppBrandUserInfoAuthorizeUI appBrandUserInfoAuthorizeUI = this.f89962a;
        appBrandUserInfoAuthorizeUI.getClass();
        com.tencent.mm.plugin.appbrand.ui.ab abVar = new com.tencent.mm.plugin.appbrand.ui.ab(appBrandUserInfoAuthorizeUI);
        com.tencent.mm.plugin.appbrand.ui.bb bbVar = new com.tencent.mm.plugin.appbrand.ui.bb(appBrandUserInfoAuthorizeUI, z17);
        if (z17 || appBrandUserInfoAuthorizeUI.f89451g) {
            bbVar.invoke();
            return;
        }
        appBrandUserInfoAuthorizeUI.f89451g = true;
        vj1.a aVar = vj1.b.f437659a;
        androidx.appcompat.app.AppCompatActivity context = appBrandUserInfoAuthorizeUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        aVar.a(context, new com.tencent.mm.plugin.appbrand.ui.xa(bbVar), new com.tencent.mm.plugin.appbrand.ui.ya(abVar), new com.tencent.mm.plugin.appbrand.ui.za(abVar), appBrandUserInfoAuthorizeUI.f89457p);
    }
}
