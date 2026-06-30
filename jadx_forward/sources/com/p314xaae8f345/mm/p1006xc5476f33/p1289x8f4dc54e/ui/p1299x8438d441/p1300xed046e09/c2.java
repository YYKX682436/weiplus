package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09;

/* loaded from: classes5.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.c2 f175736a = new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.c2();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f175737b = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.b2.f175724d);

    public static final java.lang.String b(java.lang.String url) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append((java.lang.String) ((jz5.n) f175737b).mo141623x754a37bb());
        sb6.append("pic_");
        try {
            str = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(java.net.URLDecoder.decode(android.net.Uri.parse(url).buildUpon().clearQuery().build().toString(), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
        } catch (java.lang.RuntimeException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebImagePreloadLogic", "parse url fail: " + e17.getMessage());
            str = null;
        }
        sb6.append(str);
        return sb6.toString();
    }

    public final java.io.InputStream a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        java.lang.String b17 = b(str);
        if (com.p314xaae8f345.mm.vfs.w6.j(b17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebImagePreloadLogic", "get cachePath ok, url = " + str + ", path = " + b17);
            return com.p314xaae8f345.mm.vfs.w6.E(b17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebImagePreloadLogic", "get cachePath fail, url = " + str + ", path = " + b17);
        return null;
    }

    public final void c(java.util.List list, int i17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadPics, length = ");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
        sb6.append(list.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebImagePreloadLogic", sb6.toString());
        for (java.lang.String str : kz5.n0.K0(list, 3)) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            o11.f fVar = new o11.f();
            fVar.f423611b = true;
            fVar.f423610a = false;
            fVar.f423615f = b(str);
            n11.a.b().i(str, null, fVar.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.a2(currentTimeMillis, null));
        }
    }
}
