package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI f90360d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI appBrandDebugUI) {
        super(1);
        this.f90360d = appBrandDebugUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.weui.base.preference.CheckBoxPreference it = (com.tencent.weui.base.preference.CheckBoxPreference) obj;
        kotlin.jvm.internal.o.g(it, "it");
        boolean h17 = it.h();
        com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI appBrandDebugUI = this.f90360d;
        if (h17) {
            com.tencent.mm.plugin.appbrand.ui.t7.e(false);
            com.tencent.mm.plugin.appbrand.ui.t7.f(false);
            com.tencent.mm.plugin.appbrand.ui.t7.c(false);
            com.tencent.mm.plugin.appbrand.ui.t7.d(true);
            com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI.U6(appBrandDebugUI, it, true);
            android.preference.Preference c17 = appBrandDebugUI.f220127z.c("pref_key_enable_single_task_dispatch");
            com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI.U6(appBrandDebugUI, c17 instanceof com.tencent.weui.base.preference.CheckBoxPreference ? (com.tencent.weui.base.preference.CheckBoxPreference) c17 : null, false);
            android.preference.Preference c18 = appBrandDebugUI.f220127z.c("pref_key_enable_three_proc_tasks_dispatch");
            com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI.U6(appBrandDebugUI, c18 instanceof com.tencent.weui.base.preference.CheckBoxPreference ? (com.tencent.weui.base.preference.CheckBoxPreference) c18 : null, false);
            android.preference.Preference c19 = appBrandDebugUI.f220127z.c("pref_key_enable_legacy_tasks_dispatch");
            com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI.U6(appBrandDebugUI, c19 instanceof com.tencent.weui.base.preference.CheckBoxPreference ? (com.tencent.weui.base.preference.CheckBoxPreference) c19 : null, false);
            android.preference.Preference c27 = appBrandDebugUI.f220127z.c("pref_key_appbrand_runtime_fallback_to_run_in_mm_process_if_no_appbrand_process");
            com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI.U6(appBrandDebugUI, c27 instanceof com.tencent.weui.base.preference.CheckBoxPreference ? (com.tencent.weui.base.preference.CheckBoxPreference) c27 : null, false);
        } else {
            com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI.U6(appBrandDebugUI, it, false);
            com.tencent.mm.plugin.appbrand.ui.t7.d(false);
        }
        return jz5.f0.f302826a;
    }
}
