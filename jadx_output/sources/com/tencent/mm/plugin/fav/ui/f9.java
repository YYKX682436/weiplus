package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes.dex */
public final class f9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f100853d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.da f100854e;

    public f9(android.app.Dialog dialog, com.tencent.mm.plugin.fav.ui.da daVar) {
        this.f100853d = dialog;
        this.f100854e = daVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.app.Dialog dialog = this.f100853d;
        if (dialog != null) {
            dialog.dismiss();
        }
        com.tencent.mm.plugin.fav.ui.da daVar = this.f100854e;
        com.tencent.mm.ui.widget.snackbar.j.c(daVar.getString(com.tencent.mm.R.string.c9u), null, daVar.getContext(), null, null);
    }
}
