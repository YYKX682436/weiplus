package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes.dex */
public final class f9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f182386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da f182387e;

    public f9(android.app.Dialog dialog, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da daVar) {
        this.f182386d = dialog;
        this.f182387e = daVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.app.Dialog dialog = this.f182386d;
        if (dialog != null) {
            dialog.dismiss();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da daVar = this.f182387e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(daVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.c9u), null, daVar.m80379x76847179(), null, null);
    }
}
