package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class db implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandUserProfileAuthorizeUI f89670a;

    public db(com.tencent.mm.plugin.appbrand.ui.AppBrandUserProfileAuthorizeUI appBrandUserProfileAuthorizeUI) {
        this.f89670a = appBrandUserProfileAuthorizeUI;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        int i17 = com.tencent.mm.plugin.appbrand.ui.AppBrandUserProfileAuthorizeUI.f89458q;
        com.tencent.mm.plugin.appbrand.ui.AppBrandUserProfileAuthorizeUI appBrandUserProfileAuthorizeUI = this.f89670a;
        appBrandUserProfileAuthorizeUI.getClass();
        com.tencent.mm.plugin.appbrand.ui.nb nbVar = new com.tencent.mm.plugin.appbrand.ui.nb(appBrandUserProfileAuthorizeUI);
        com.tencent.mm.plugin.appbrand.ui.ob obVar = new com.tencent.mm.plugin.appbrand.ui.ob(appBrandUserProfileAuthorizeUI, z17);
        if (z17 || appBrandUserProfileAuthorizeUI.f89462g) {
            obVar.invoke();
            return;
        }
        appBrandUserProfileAuthorizeUI.f89462g = true;
        vj1.a aVar = vj1.b.f437659a;
        androidx.appcompat.app.AppCompatActivity context = appBrandUserProfileAuthorizeUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        aVar.a(context, new com.tencent.mm.plugin.appbrand.ui.kb(obVar), new com.tencent.mm.plugin.appbrand.ui.lb(nbVar), new com.tencent.mm.plugin.appbrand.ui.mb(nbVar), appBrandUserProfileAuthorizeUI.f89468p);
    }
}
