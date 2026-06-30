package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class e2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.ui.e2 f89677d = new com.tencent.mm.plugin.appbrand.ui.e2();

    public e2() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.weui.base.preference.CheckBoxPreference it = (com.tencent.weui.base.preference.CheckBoxPreference) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.appbrand.launching.g5 g5Var = com.tencent.mm.plugin.appbrand.launching.g5.f84619a;
        com.tencent.mm.plugin.appbrand.app.PluginAppBrand.getProcessSharedPrefs().edit().putBoolean("com.tencent.mm.plugin.appbrand.launching.isForcedCloseDemoCheckForWarmLaunchWxaApp", it.h()).apply();
        return jz5.f0.f302826a;
    }
}
