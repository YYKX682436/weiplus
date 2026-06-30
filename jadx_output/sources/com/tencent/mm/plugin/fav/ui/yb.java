package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class yb implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.zb f101634d;

    public yb(com.tencent.mm.plugin.fav.ui.zb zbVar) {
        this.f101634d = zbVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.fav.ui.zb zbVar = this.f101634d;
        com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI = zbVar.f101680g;
        androidx.appcompat.app.AppCompatActivity context = favoriteIndexUI.getContext();
        com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI2 = zbVar.f101680g;
        com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.o7(favoriteIndexUI, context, 4106, favoriteIndexUI2.T, favoriteIndexUI2.f100439p1);
    }
}
