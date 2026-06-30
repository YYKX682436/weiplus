package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class m0 implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f182784d;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800 abstractActivityC13548xbf543800) {
        this.f182784d = new java.lang.ref.WeakReference(abstractActivityC13548xbf543800);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteBaseUI", "[doFavSync] sync finish");
        final com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800 abstractActivityC13548xbf543800 = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800) this.f182784d.get();
        if (abstractActivityC13548xbf543800 == null) {
            return null;
        }
        abstractActivityC13548xbf543800.runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fav.ui.m0$$a
            @Override // java.lang.Runnable
            public final void run() {
                boolean b17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ia.f182713a.b();
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800 abstractActivityC13548xbf5438002 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800.this;
                if (b17) {
                    abstractActivityC13548xbf5438002.X6(false);
                }
                abstractActivityC13548xbf5438002.l7();
                abstractActivityC13548xbf5438002.d7().c();
                abstractActivityC13548xbf5438002.n7();
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800.U6(abstractActivityC13548xbf5438002);
            }
        });
        return null;
    }
}
