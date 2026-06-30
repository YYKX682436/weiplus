package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes8.dex */
public class o0 implements ak1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI f89893a;

    public o0(com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI) {
        this.f89893a = appBrandAuthorizeUI;
    }

    @Override // ak1.b
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "onCallback");
        com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI = this.f89893a;
        ((com.tencent.mm.ui.base.preference.h0) appBrandAuthorizeUI.f89308n).m("preference_key_voip_device_list", false);
        appBrandAuthorizeUI.W.clear();
        appBrandAuthorizeUI.X.clear();
        ak1.e eVar = ak1.e.f5572a;
        java.util.ArrayList arrayList = ak1.e.f5573b;
        if (!arrayList.isEmpty()) {
            appBrandAuthorizeUI.W.addAll(arrayList);
        }
        java.util.ArrayList arrayList2 = ak1.e.f5574c;
        if (arrayList2.isEmpty()) {
            return;
        }
        appBrandAuthorizeUI.X.addAll(arrayList2);
    }
}
