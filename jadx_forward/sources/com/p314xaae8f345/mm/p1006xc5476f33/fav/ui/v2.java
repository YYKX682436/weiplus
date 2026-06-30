package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public final class v2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f183015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13567x4039ba2d f183016e;

    public v2(android.app.Dialog dialog, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13567x4039ba2d activityC13567x4039ba2d) {
        this.f183015d = dialog;
        this.f183016e = activityC13567x4039ba2d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.app.Dialog dialog = this.f183015d;
        if (dialog != null) {
            dialog.dismiss();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13567x4039ba2d activityC13567x4039ba2d = this.f183016e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(activityC13567x4039ba2d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c9u), null, activityC13567x4039ba2d, null, null);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u2(activityC13567x4039ba2d), 2000L);
    }
}
