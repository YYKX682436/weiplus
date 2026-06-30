package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class c4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.d4 f72592d;

    public c4(com.tencent.mm.plugin.aa.ui.d4 d4Var) {
        this.f72592d = d4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.aa.ui.d4 d4Var = this.f72592d;
        android.app.Dialog dialog = d4Var.f72611h.U;
        if (dialog != null) {
            dialog.dismiss();
        }
        dp.a.makeText(d4Var.f72605b, com.tencent.mm.R.string.f492382ga2, 1).show();
    }
}
