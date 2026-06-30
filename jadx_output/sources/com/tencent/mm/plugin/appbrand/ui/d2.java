package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class d2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI f89656d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI appBrandDebugUI) {
        super(1);
        this.f89656d = appBrandDebugUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.weui.base.preference.CheckBoxPreference it = (com.tencent.weui.base.preference.CheckBoxPreference) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.appbrand.debugger.a aVar = com.tencent.mm.plugin.appbrand.debugger.a.f77593a;
        boolean h17 = it.h();
        aVar.getClass();
        com.tencent.mm.plugin.appbrand.debugger.a.f77596d.b(aVar, com.tencent.mm.plugin.appbrand.debugger.a.f77594b[1], java.lang.Boolean.valueOf(h17));
        if (it.h()) {
            com.tencent.mm.plugin.appbrand.launching.g5 g5Var = com.tencent.mm.plugin.appbrand.launching.g5.f84619a;
            com.tencent.mm.plugin.appbrand.app.PluginAppBrand.getProcessSharedPrefs().edit().putBoolean("com.tencent.mm.plugin.appbrand.launching.isForcedOpenWxaAppForTypedDemo", false).apply();
            com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI appBrandDebugUI = this.f89656d;
            android.preference.Preference c17 = appBrandDebugUI.f220127z.c("pref_key_force_open_wxa_app_for_typed_demo");
            com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI.U6(appBrandDebugUI, c17 instanceof com.tencent.weui.base.preference.CheckBoxPreference ? (com.tencent.weui.base.preference.CheckBoxPreference) c17 : null, false);
        }
        return jz5.f0.f302826a;
    }
}
