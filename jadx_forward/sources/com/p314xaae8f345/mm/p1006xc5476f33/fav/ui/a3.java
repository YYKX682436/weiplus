package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public final class a3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f181986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.c3 f181987e;

    public a3(android.app.Dialog dialog, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.c3 c3Var) {
        this.f181986d = dialog;
        this.f181987e = c3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.app.Dialog dialog = this.f181986d;
        if (dialog != null) {
            dialog.dismiss();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.c3 c3Var = this.f181987e;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = c3Var.f182071e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(i65.a.r(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30867xcad56011.c9u), null, abstractActivityC21394xb3d2c0cf, null, null);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z2(c3Var), 2000L);
    }
}
