package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class m5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f182804d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.n5 f182805e;

    public m5(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.n5 n5Var, android.app.Dialog dialog) {
        this.f182805e = n5Var;
        this.f182804d = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.app.Dialog dialog = this.f182804d;
        if (dialog != null) {
            dialog.dismiss();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257 activityC13570xd6b9f257 = this.f182805e.f182823b.f182868d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(activityC13570xd6b9f257.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c9u), null, activityC13570xd6b9f257, null, null);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.l5(this), 2000L);
    }
}
