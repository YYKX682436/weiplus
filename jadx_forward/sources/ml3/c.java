package ml3;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ml3.c f409932a = new ml3.c();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 f409933b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r2(20);

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 f409934c = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r2(20);

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 f409935d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r2(20);

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 f409936e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r2(20);

    /* renamed from: f, reason: collision with root package name */
    public static ka0.n0 f409937f;

    public final void a(java.util.LinkedList linkedList) {
        if (linkedList == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicLiveLinkCacheHelper", "saveMid2urlMap, map size:" + linkedList.size());
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.cs4 cs4Var = (r45.cs4) it.next();
            if (cs4Var.f453341d == 0) {
                r45.as4 as4Var = cs4Var.f453343f;
                jz5.f0 f0Var = null;
                if (as4Var != null) {
                    java.lang.String mid = as4Var.f451774e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mid, "mid");
                    java.lang.String url = cs4Var.f453344g;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(url, "url");
                    int i17 = cs4Var.f453345h;
                    boolean z17 = cs4Var.f453346i;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicLiveLinkCacheHelper", "saveTempPlayUrl, mid:" + mid + ", url:" + url);
                    if (!android.text.TextUtils.isEmpty(mid) && !android.text.TextUtils.isEmpty(url)) {
                        f409933b.put(mid, url);
                        f409935d.put(mid, java.lang.Integer.valueOf(i17));
                        f409936e.put(mid, java.lang.Boolean.valueOf(z17));
                        f409934c.put(mid, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                        ka0.n0 n0Var = f409937f;
                        if (n0Var != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.d8 d8Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.d8) n0Var;
                            d8Var.f232635a.V6(d8Var.f232636b);
                            ((ja0.i0) ((ka0.o0) i95.n0.c(ka0.o0.class))).getClass();
                            f409937f = null;
                        }
                    }
                    f0Var = jz5.f0.f384359a;
                }
                if (f0Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MusicLiveLinkCacheHelper", "linkInfo.info is null");
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MusicLiveLinkCacheHelper", "errCode:" + cs4Var.f453341d + ", errMsg:" + cs4Var.f453342e);
            }
        }
    }
}
