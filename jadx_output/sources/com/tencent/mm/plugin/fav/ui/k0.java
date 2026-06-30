package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class k0 implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavBaseUI f101211d;

    public k0(com.tencent.mm.plugin.fav.ui.FavBaseUI favBaseUI) {
        this.f101211d = favBaseUI;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "MicroMsg.FavoriteBaseUI#notifyAdapterJob";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.FavBaseUI favBaseUI = this.f101211d;
        com.tencent.mm.plugin.fav.ui.adapter.b d76 = favBaseUI.d7();
        d76.a();
        d76.c();
        favBaseUI.n7();
    }
}
