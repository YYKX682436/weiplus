package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes8.dex */
public class o2 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI f72755d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI launchAAByPersonAmountSelectUI) {
        super(false);
        this.f72755d = launchAAByPersonAmountSelectUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI launchAAByPersonAmountSelectUI = this.f72755d;
        java.util.Map map = launchAAByPersonAmountSelectUI.f72488q;
        if (map != null && ((java.util.HashMap) map).size() > 0) {
            try {
                com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(launchAAByPersonAmountSelectUI);
                i0Var.d(com.tencent.mm.R.string.f489718r);
                i0Var.f(com.tencent.mm.R.string.f489719s);
                i0Var.f211821b.E = new com.tencent.mm.plugin.aa.ui.m2(this);
                i0Var.e(com.tencent.mm.R.string.f489720t);
                i0Var.f211821b.F = new com.tencent.mm.plugin.aa.ui.n2(this);
                i0Var.h();
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LaunchAAByPersonAmountSelectUI", "clear amount error");
            }
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13721, 3, 8);
    }
}
