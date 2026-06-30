package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes4.dex */
public class l6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f101242d;

    public l6(com.tencent.mm.plugin.fav.ui.k6 k6Var, android.app.Dialog dialog) {
        this.f101242d = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.app.Dialog dialog = this.f101242d;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public java.lang.String toString() {
        return super.toString() + "|batchAddFavTags";
    }
}
