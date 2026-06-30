package a82;

/* loaded from: classes5.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final a82.u f83707a = new a82.u();

    public final boolean a(java.lang.String str, java.lang.String str2) {
        java.lang.String P0;
        boolean z17;
        if ((str == null || str.length() == 0) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.f(str) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.g(str)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.FavCdnImageUtil", "wxam2jpg fallback triggered, dataId=" + str2 + ", CDN unexpectedly returned wxam");
        long k17 = com.p314xaae8f345.mm.vfs.w6.k(str);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            P0 = m11.b1.Di().P0(str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavCdnImageUtil", "wxam2jpg fallback exception, dataId=" + str2 + ", error=" + e17.getMessage());
        }
        if (P0 != null && P0.length() != 0) {
            z17 = false;
            if (!z17 || !com.p314xaae8f345.mm.vfs.w6.j(P0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavCdnImageUtil", "wxam2jpg fallback failed, jpgPath is empty or not exists, dataId=" + str2);
                return true;
            }
            long d17 = com.p314xaae8f345.mm.vfs.w6.d(P0, str, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavCdnImageUtil", "wxam2jpg fallback success, dataId=" + str2 + ", beforeSize=" + k17 + ", afterSize=" + com.p314xaae8f345.mm.vfs.w6.k(str) + ", cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms, copyRet=" + d17);
            com.p314xaae8f345.mm.vfs.w6.f(P0);
            return true;
        }
        z17 = true;
        if (!z17) {
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavCdnImageUtil", "wxam2jpg fallback failed, jpgPath is empty or not exists, dataId=" + str2);
        return true;
    }
}
