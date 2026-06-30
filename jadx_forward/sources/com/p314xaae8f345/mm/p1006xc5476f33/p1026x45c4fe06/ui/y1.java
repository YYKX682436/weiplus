package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public final class y1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI f171876d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI appBrandDebugUI) {
        super(1);
        this.f171876d = appBrandDebugUI;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.C27745x1c1b08fe it = (com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.C27745x1c1b08fe) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        boolean h17 = it.h();
        com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI appBrandDebugUI = this.f171876d;
        if (h17) {
            java.lang.Boolean bool = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.t7.f171761a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a.a();
            if (a17 != null) {
                a17.X(new java.lang.String[]{"enable_single_task_dispatch", "enable_three_proc_tasks_dispatch", "pref_key_run_in_mm_strategy_mmkv_config"});
            }
            com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI.U6(appBrandDebugUI, it, true);
            android.preference.Preference c17 = appBrandDebugUI.f301660z.c("pref_key_enable_single_task_dispatch");
            com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI.U6(appBrandDebugUI, c17 instanceof com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.C27745x1c1b08fe ? (com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.C27745x1c1b08fe) c17 : null, false);
            android.preference.Preference c18 = appBrandDebugUI.f301660z.c("pref_key_enable_three_proc_tasks_dispatch");
            com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI.U6(appBrandDebugUI, c18 instanceof com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.C27745x1c1b08fe ? (com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.C27745x1c1b08fe) c18 : null, false);
            android.preference.Preference c19 = appBrandDebugUI.f301660z.c("pref_key_appbrand_runtime_run_in_mm_process");
            com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI.U6(appBrandDebugUI, c19 instanceof com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.C27745x1c1b08fe ? (com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.C27745x1c1b08fe) c19 : null, false);
        } else {
            com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI.U6(appBrandDebugUI, it, false);
        }
        return jz5.f0.f384359a;
    }
}
