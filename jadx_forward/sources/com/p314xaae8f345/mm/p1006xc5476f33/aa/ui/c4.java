package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class c4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.d4 f154125d;

    public c4(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.d4 d4Var) {
        this.f154125d = d4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.d4 d4Var = this.f154125d;
        android.app.Dialog dialog = d4Var.f154144h.U;
        if (dialog != null) {
            dialog.dismiss();
        }
        dp.a.m125853x26a183b(d4Var.f154138b, com.p314xaae8f345.mm.R.C30867xcad56011.f573915ga2, 1).show();
    }
}
