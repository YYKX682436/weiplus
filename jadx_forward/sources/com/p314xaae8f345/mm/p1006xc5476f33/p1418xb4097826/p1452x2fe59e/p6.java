package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes5.dex */
public final class p6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 f190240d;

    public p6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var) {
        this.f190240d = a7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.app.Dialog dialog;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var = this.f190240d;
        android.app.Dialog dialog2 = a7Var.F1;
        boolean z17 = false;
        if (dialog2 != null && dialog2.isShowing()) {
            z17 = true;
        }
        if (!z17 || (dialog = a7Var.F1) == null) {
            return;
        }
        dialog.dismiss();
    }
}
