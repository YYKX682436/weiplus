package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes8.dex */
public class xb implements ak1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandVoIPDeviceListAuthorizeUI f90340a;

    public xb(com.tencent.mm.plugin.appbrand.ui.AppBrandVoIPDeviceListAuthorizeUI appBrandVoIPDeviceListAuthorizeUI) {
        this.f90340a = appBrandVoIPDeviceListAuthorizeUI;
    }

    @Override // ak1.b
    public void a() {
        com.tencent.mm.plugin.appbrand.ui.AppBrandVoIPDeviceListAuthorizeUI appBrandVoIPDeviceListAuthorizeUI = this.f90340a;
        appBrandVoIPDeviceListAuthorizeUI.f89489h.clear();
        appBrandVoIPDeviceListAuthorizeUI.f89490i.clear();
        ak1.e eVar = ak1.e.f5572a;
        java.util.ArrayList arrayList = ak1.e.f5573b;
        if (!arrayList.isEmpty()) {
            appBrandVoIPDeviceListAuthorizeUI.f89489h.addAll(arrayList);
        }
        java.util.ArrayList arrayList2 = ak1.e.f5574c;
        if (!arrayList2.isEmpty()) {
            appBrandVoIPDeviceListAuthorizeUI.f89490i.addAll(arrayList2);
        }
        appBrandVoIPDeviceListAuthorizeUI.Y6();
    }
}
