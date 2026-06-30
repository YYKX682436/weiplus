package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class g2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f100860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.h2 f100861e;

    public g2(com.tencent.mm.plugin.fav.ui.h2 h2Var, android.app.Dialog dialog) {
        this.f100861e = h2Var;
        this.f100860d = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.app.Dialog dialog = this.f100860d;
        if (dialog != null) {
            dialog.dismiss();
        }
        com.tencent.mm.plugin.fav.ui.FavFilterUI favFilterUI = this.f100861e.f101127b.f101193d;
        com.tencent.mm.ui.widget.snackbar.j.c(favFilterUI.getString(com.tencent.mm.R.string.c9u), null, favFilterUI, null, null);
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.fav.ui.f2(this), 2000L);
    }
}
