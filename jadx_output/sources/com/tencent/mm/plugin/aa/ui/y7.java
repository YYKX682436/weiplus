package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class y7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.z7 f72901d;

    public y7(com.tencent.mm.plugin.aa.ui.z7 z7Var) {
        this.f72901d = z7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.aa.ui.z7 z7Var = this.f72901d;
        g0Var.d(13721, 4, 12, java.lang.Integer.valueOf(z7Var.f72916c.R));
        com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI = z7Var.f72916c;
        if (paylistAAUI.f72549n == null) {
            paylistAAUI.f72549n = db5.e1.O(paylistAAUI, null, 3, com.tencent.mm.R.style.f494256i6, paylistAAUI.getString(com.tencent.mm.R.string.ggc), true, true, new com.tencent.mm.plugin.aa.ui.w7(this));
        }
        ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(z7Var.f72914a.E, new com.tencent.mm.plugin.aa.ui.x7(this));
    }
}
