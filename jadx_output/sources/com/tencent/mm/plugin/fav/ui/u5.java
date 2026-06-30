package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class u5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f101469d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.v5 f101470e;

    public u5(com.tencent.mm.plugin.fav.ui.v5 v5Var, android.app.Dialog dialog) {
        this.f101470e = v5Var;
        this.f101469d = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.app.Dialog dialog = this.f101469d;
        if (dialog != null) {
            dialog.dismiss();
        }
        com.tencent.mm.plugin.fav.ui.FavSelectUI favSelectUI = this.f101470e.f101491b;
        com.tencent.mm.ui.widget.snackbar.j.c(favSelectUI.getString(com.tencent.mm.R.string.c9u), null, favSelectUI, null, null);
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.fav.ui.t5(this), 2000L);
    }
}
