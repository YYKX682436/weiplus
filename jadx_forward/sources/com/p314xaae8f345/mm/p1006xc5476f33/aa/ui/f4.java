package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class f4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.g4 f154172d;

    public f4(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.g4 g4Var) {
        this.f154172d = g4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.g4 g4Var = this.f154172d;
        android.app.Dialog dialog = g4Var.f154195e.U;
        if (dialog != null) {
            dialog.dismiss();
        }
        dp.a.m125853x26a183b(g4Var.f154191a, com.p314xaae8f345.mm.R.C30867xcad56011.f573915ga2, 1).show();
    }
}
