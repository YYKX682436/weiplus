package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class u5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f183002d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.v5 f183003e;

    public u5(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.v5 v5Var, android.app.Dialog dialog) {
        this.f183003e = v5Var;
        this.f183002d = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.app.Dialog dialog = this.f183002d;
        if (dialog != null) {
            dialog.dismiss();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13571xe8c83cab activityC13571xe8c83cab = this.f183003e.f183024b;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(activityC13571xe8c83cab.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c9u), null, activityC13571xe8c83cab, null, null);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.t5(this), 2000L);
    }
}
