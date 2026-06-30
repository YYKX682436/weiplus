package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes4.dex */
public class j6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f101200d;

    public j6(com.tencent.mm.plugin.fav.ui.i6 i6Var, android.app.Dialog dialog) {
        this.f101200d = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.app.Dialog dialog = this.f101200d;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public java.lang.String toString() {
        return super.toString() + "|batchAddFavTags";
    }
}
