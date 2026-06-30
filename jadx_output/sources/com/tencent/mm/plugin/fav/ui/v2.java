package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public final class v2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f101482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavFinderFilterUI f101483e;

    public v2(android.app.Dialog dialog, com.tencent.mm.plugin.fav.ui.FavFinderFilterUI favFinderFilterUI) {
        this.f101482d = dialog;
        this.f101483e = favFinderFilterUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.app.Dialog dialog = this.f101482d;
        if (dialog != null) {
            dialog.dismiss();
        }
        com.tencent.mm.plugin.fav.ui.FavFinderFilterUI favFinderFilterUI = this.f101483e;
        com.tencent.mm.ui.widget.snackbar.j.c(favFinderFilterUI.getString(com.tencent.mm.R.string.c9u), null, favFinderFilterUI, null, null);
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.fav.ui.u2(favFinderFilterUI), 2000L);
    }
}
