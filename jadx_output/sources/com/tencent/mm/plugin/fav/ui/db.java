package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class db implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f100596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f100597e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f100598f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavoriteIndexUI f100599g;

    public db(com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI, android.app.Dialog dialog, java.lang.String str, java.util.List list) {
        this.f100599g = favoriteIndexUI;
        this.f100596d = dialog;
        this.f100597e = str;
        this.f100598f = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f100596d.dismiss();
        boolean a17 = com.tencent.mm.repairer.config.forward.RepairerConfigForwardSnackBarJumpChatting.f192214a.a();
        com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI = this.f100599g;
        if (!a17) {
            com.tencent.mm.ui.widget.snackbar.j.c(favoriteIndexUI.getString(com.tencent.mm.R.string.c9u), null, favoriteIndexUI, null, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteIndexUI", "EnterChattingAfterTrans done config disabled");
        }
        com.tencent.mm.plugin.fav.ui.ec.f(favoriteIndexUI, this.f100597e, this.f100598f, true);
    }
}
