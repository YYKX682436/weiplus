package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class x2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.ui.x2 f90324d = new com.tencent.mm.plugin.appbrand.ui.x2();

    public x2() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.weui.base.preference.CheckBoxPreference it = (com.tencent.weui.base.preference.CheckBoxPreference) obj;
        kotlin.jvm.internal.o.g(it, "it");
        boolean h17 = it.h();
        jz5.g gVar = com.tencent.mm.plugin.appbrand.ui.e4.f89679a;
        com.tencent.mm.plugin.appbrand.app.PluginAppBrand.getProcessSharedPrefs().edit().putBoolean("AppBrandDebugUI.SHOW_DEBUG_HINT_FOR_WXA_APP_LAUNCH_PROCESS", h17).apply();
        return jz5.f0.f302826a;
    }
}
