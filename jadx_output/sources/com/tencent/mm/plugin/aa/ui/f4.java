package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class f4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.g4 f72639d;

    public f4(com.tencent.mm.plugin.aa.ui.g4 g4Var) {
        this.f72639d = g4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.aa.ui.g4 g4Var = this.f72639d;
        android.app.Dialog dialog = g4Var.f72662e.U;
        if (dialog != null) {
            dialog.dismiss();
        }
        dp.a.makeText(g4Var.f72658a, com.tencent.mm.R.string.f492382ga2, 1).show();
    }
}
