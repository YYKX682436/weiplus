package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes5.dex */
public final class p6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f108707d;

    public p6(com.tencent.mm.plugin.finder.feed.a7 a7Var) {
        this.f108707d = a7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.app.Dialog dialog;
        com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f108707d;
        android.app.Dialog dialog2 = a7Var.F1;
        boolean z17 = false;
        if (dialog2 != null && dialog2.isShowing()) {
            z17 = true;
        }
        if (!z17 || (dialog = a7Var.F1) == null) {
            return;
        }
        dialog.dismiss();
    }
}
