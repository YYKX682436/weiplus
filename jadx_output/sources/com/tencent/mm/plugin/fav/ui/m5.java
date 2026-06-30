package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class m5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f101271d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.n5 f101272e;

    public m5(com.tencent.mm.plugin.fav.ui.n5 n5Var, android.app.Dialog dialog) {
        this.f101272e = n5Var;
        this.f101271d = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.app.Dialog dialog = this.f101271d;
        if (dialog != null) {
            dialog.dismiss();
        }
        com.tencent.mm.plugin.fav.ui.FavSearchUI favSearchUI = this.f101272e.f101290b.f101335d;
        com.tencent.mm.ui.widget.snackbar.j.c(favSearchUI.getString(com.tencent.mm.R.string.c9u), null, favSearchUI, null, null);
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.fav.ui.l5(this), 2000L);
    }
}
