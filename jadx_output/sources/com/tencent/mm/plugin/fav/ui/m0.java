package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class m0 implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f101251d;

    public m0(com.tencent.mm.plugin.fav.ui.FavBaseUI favBaseUI) {
        this.f101251d = new java.lang.ref.WeakReference(favBaseUI);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", "[doFavSync] sync finish");
        final com.tencent.mm.plugin.fav.ui.FavBaseUI favBaseUI = (com.tencent.mm.plugin.fav.ui.FavBaseUI) this.f101251d.get();
        if (favBaseUI == null) {
            return null;
        }
        favBaseUI.runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fav.ui.m0$$a
            @Override // java.lang.Runnable
            public final void run() {
                boolean b17 = com.tencent.mm.plugin.fav.ui.ia.f101180a.b();
                com.tencent.mm.plugin.fav.ui.FavBaseUI favBaseUI2 = com.tencent.mm.plugin.fav.ui.FavBaseUI.this;
                if (b17) {
                    favBaseUI2.X6(false);
                }
                favBaseUI2.l7();
                favBaseUI2.d7().c();
                favBaseUI2.n7();
                com.tencent.mm.plugin.fav.ui.FavBaseUI.U6(favBaseUI2);
            }
        });
        return null;
    }
}
