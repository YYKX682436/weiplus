package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public final /* synthetic */ class FavBaseUI$$l implements yz5.a {
    @Override // yz5.a
    public final java.lang.Object invoke() {
        int i17 = com.tencent.mm.plugin.fav.ui.FavBaseUI.R;
        s72.p0 p0Var = (s72.p0) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).zj();
        if (!p0Var.X6() || !p0Var.f404133s || p0Var.f404124g == -1) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", "[onActivityResult] batchget done after safe auth, retry pin on top");
        p0Var.a7();
        return null;
    }
}
