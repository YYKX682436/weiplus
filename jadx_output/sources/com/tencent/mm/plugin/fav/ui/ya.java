package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class ya implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.ab f101633d;

    public ya(com.tencent.mm.plugin.fav.ui.ab abVar) {
        this.f101633d = abVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.fav.ui.ab abVar = this.f101633d;
        com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI = abVar.f100470a;
        androidx.appcompat.app.AppCompatActivity context = favoriteIndexUI.getContext();
        com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI2 = abVar.f100470a;
        com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.o7(favoriteIndexUI, context, 4105, favoriteIndexUI2.T, favoriteIndexUI2.f100439p1);
    }
}
