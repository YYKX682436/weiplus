package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes4.dex */
public class j6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f182733d;

    public j6(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.i6 i6Var, android.app.Dialog dialog) {
        this.f182733d = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.app.Dialog dialog = this.f182733d;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* renamed from: toString */
    public java.lang.String m55358x9616526c() {
        return super.toString() + "|batchAddFavTags";
    }
}
