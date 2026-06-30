package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class g2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f182393d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.h2 f182394e;

    public g2(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.h2 h2Var, android.app.Dialog dialog) {
        this.f182394e = h2Var;
        this.f182393d = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.app.Dialog dialog = this.f182393d;
        if (dialog != null) {
            dialog.dismiss();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13566x76c62427 activityC13566x76c62427 = this.f182394e.f182660b.f182726d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(activityC13566x76c62427.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c9u), null, activityC13566x76c62427, null, null);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.f2(this), 2000L);
    }
}
