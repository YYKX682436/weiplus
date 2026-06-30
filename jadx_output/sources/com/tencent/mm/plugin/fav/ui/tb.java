package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class tb implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavoriteIndexUI f101460d;

    public tb(com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI) {
        this.f101460d = favoriteIndexUI;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteIndexUI", "onUsedCapacityChanged");
        this.f101460d.f100279t.post(new com.tencent.mm.plugin.fav.ui.sb(this));
    }
}
