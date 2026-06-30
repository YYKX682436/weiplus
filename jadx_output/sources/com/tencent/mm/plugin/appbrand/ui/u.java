package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes4.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI f90244d;

    public u(com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI, boolean z17) {
        this.f90244d = appBrandAuthorizeUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI = this.f90244d;
        com.tencent.mm.ui.base.preference.Preference preference = new com.tencent.mm.ui.base.preference.Preference(appBrandAuthorizeUI);
        preference.f197785v = false;
        preference.C("preference_key_tip");
        preference.G = com.tencent.mm.R.layout.f488010ec;
        preference.L(appBrandAuthorizeUI.getString(com.tencent.mm.R.string.f490044jc, appBrandAuthorizeUI.f89306i.f77500f));
        ((com.tencent.mm.ui.base.preference.h0) appBrandAuthorizeUI.f89308n).w("preference_key_tip");
        ((com.tencent.mm.ui.base.preference.h0) appBrandAuthorizeUI.f89308n).d(preference, -1);
        ((com.tencent.mm.ui.base.preference.h0) appBrandAuthorizeUI.f89308n).notifyDataSetChanged();
    }
}
