package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public final class a3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f100453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.c3 f100454e;

    public a3(android.app.Dialog dialog, com.tencent.mm.plugin.fav.ui.c3 c3Var) {
        this.f100453d = dialog;
        this.f100454e = c3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.app.Dialog dialog = this.f100453d;
        if (dialog != null) {
            dialog.dismiss();
        }
        com.tencent.mm.plugin.fav.ui.c3 c3Var = this.f100454e;
        com.tencent.mm.ui.MMActivity mMActivity = c3Var.f100538e;
        com.tencent.mm.ui.widget.snackbar.j.c(i65.a.r(mMActivity, com.tencent.mm.R.string.c9u), null, mMActivity, null, null);
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.fav.ui.z2(c3Var), 2000L);
    }
}
