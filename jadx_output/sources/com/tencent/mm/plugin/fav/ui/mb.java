package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class mb implements java.lang.Runnable {
    public mb(com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI) {
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.List A0 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().A0();
        if (A0 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteIndexUI", "initInvalidFavItem getInvalid favitems , size = %d,start time = %s", java.lang.Integer.valueOf(A0.size()), java.lang.Long.valueOf(currentTimeMillis));
            if (A0.size() == 0) {
                return;
            }
            int size = A0.size();
            for (int i17 = 0; i17 < size; i17++) {
                o72.r2 r2Var = (o72.r2) A0.get(i17);
                ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().Re(r2Var);
                ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).ij().c(r2Var, "", 31, 2);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteIndexUI", "initInvalidFavItem  cost time = %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        }
    }
}
