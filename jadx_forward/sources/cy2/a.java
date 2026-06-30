package cy2;

/* loaded from: classes3.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final cy2.a f306273d = new cy2.a();

    public a() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = cy2.b.f306274a;
        boolean o17 = gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_WHATS_NEW_SHOWN_BOOLEAN_SYNC, false);
        if (1 == com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273972b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.WhatNewsController", "[GET] This is GP Version, just ignore.");
        } else if (o45.wf.f424566k) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.WhatNewsController", "[GET] This is alpha Version, just ignore.");
        } else {
            java.util.List list = j45.l.f379246a;
            synchronized (j45.l.class) {
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.m()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.WhatNewsController", "[GET] showFinderEntry=" + ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el() + " isShown=" + o17 + " style=0 isAvailableBoot=false");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.WhatNewsController", "[GET] This is not Chinese Language , just ignore.");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1305L, 20L, 1L);
            }
        }
        return java.lang.Boolean.FALSE;
    }
}
