package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes4.dex */
public class l6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f182775d;

    public l6(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.k6 k6Var, android.app.Dialog dialog) {
        this.f182775d = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.app.Dialog dialog = this.f182775d;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* renamed from: toString */
    public java.lang.String m55363x9616526c() {
        return super.toString() + "|batchAddFavTags";
    }
}
