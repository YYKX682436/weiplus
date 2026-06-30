package so4;

/* loaded from: classes10.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static so4.a f492313e;

    /* renamed from: f, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc f492314f;

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.List f492317i;

    /* renamed from: a, reason: collision with root package name */
    public static final so4.g f492309a = new so4.g();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f492310b = lp0.b.e() + "image_enhancement_result";

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.LinkedList f492311c = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.LinkedList f492312d = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.HashMap f492315g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashMap f492316h = new java.util.HashMap();

    static {
        uq5.o[] m168422xcee59d22 = uq5.o.m168422xcee59d22();
        java.util.ArrayList arrayList = new java.util.ArrayList(m168422xcee59d22.length);
        for (uq5.o oVar : m168422xcee59d22) {
            arrayList.add(java.lang.Integer.valueOf(oVar.ordinal()));
        }
        f492317i = arrayList;
    }

    public final int a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return -1;
        }
        android.util.Pair pair = (android.util.Pair) f492316h.get(str);
        java.lang.Integer num = pair != null ? (java.lang.Integer) pair.first : null;
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public final synchronized void b(com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc c22979xbb268bc) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocalEffectManager", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
        if (f492314f == null && fp.q.b("xlab")) {
            if (c22979xbb268bc == null) {
                c22979xbb268bc = new com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc();
            }
            f492314f = c22979xbb268bc;
        }
        f492313e = new so4.a(null, 0, 3, null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initVideoEnhancementEffect effectId:");
        so4.a aVar = f492313e;
        sb6.append(aVar != null ? java.lang.Long.valueOf(aVar.a()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocalEffectManager", sb6.toString());
    }

    public final synchronized void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocalEffectManager", "reset");
        com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc c22979xbb268bc = f492314f;
        if (c22979xbb268bc != null) {
            c22979xbb268bc.f();
        }
        f492315g.clear();
    }

    public final void d(java.util.List pathList) {
        android.graphics.Bitmap bitmap;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pathList, "pathList");
        f492315g.clear();
        rm5.l lVar = rm5.l.f479053a;
        int i17 = rm5.l.f479054b;
        rm5.l.f479054b = 2000;
        lVar.a();
        java.util.Iterator it = pathList.iterator();
        while (it.hasNext()) {
            java.lang.String path = (java.lang.String) it.next();
            so4.g gVar = f492309a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
            java.lang.Object obj = new java.lang.Object();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocalEffectManager", "getImageEnhancementBitmap path:".concat(path));
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1(path, 1, 0);
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1(kz5.b0.c(i1Var));
                gVar.f(h1Var, true);
                int a17 = gVar.a(path);
                if (((java.util.ArrayList) f492317i).contains(java.lang.Integer.valueOf(a17))) {
                    gVar.g(a17);
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                h1Var.q(f492314f);
                rm5.h b17 = rm5.h.f479022h.b(h1Var.e());
                rm5.j jVar = i1Var.f257160l;
                b17.mo122876x76500f83(jVar.f479042k, jVar.f479043l);
                b17.a(kz5.b0.c(100L), new so4.c(i1Var, h0Var, obj));
                synchronized (obj) {
                    try {
                        obj.wait();
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LocalEffectManager", e17, "", new java.lang.Object[0]);
                    }
                }
                gVar.f(h1Var, false);
                bitmap = (android.graphics.Bitmap) h0Var.f391656d;
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LocalEffectManager", "getImageEnhancementBitmap parse track fail path:" + path + ", error:" + e18.getLocalizedMessage());
                bitmap = null;
            }
            if (bitmap != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(f492310b);
                sb6.append('/');
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                sb6.append(android.os.SystemClock.elapsedRealtime());
                java.lang.String sb7 = sb6.toString();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, sb7, false);
                java.util.HashMap hashMap = f492315g;
                hashMap.put(path, sb7);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocalEffectManager", "save enhancement image result in " + sb7 + ", origin:" + path);
                if (hashMap.size() == pathList.size()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocalEffectManager", "save enhancement image result finish");
                }
            }
        }
        rm5.l lVar2 = rm5.l.f479053a;
        rm5.l.f479054b = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocalEffectManager", "save enhancement image result finish return");
    }

    public final void e(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 track, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(track, "track");
        java.util.Iterator it = f492311c.iterator();
        if (it.hasNext()) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
            throw null;
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(null);
        com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc c22979xbb268bc = f492314f;
        rm5.j jVar = track.f257160l;
        if (c22979xbb268bc != null) {
            uq5.y yVar = jVar.f479048q.f479063b;
            c22979xbb268bc.n(yVar != null ? yVar.f511800a : 0L);
        }
        rm5.n nVar = jVar.f479048q;
        nVar.f479063b = null;
        track.f257158j = -1;
        nVar.f479062a = "";
        nVar.f479064c = 0L;
    }

    public final void f(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var, boolean z17) {
        uq5.p pVar;
        so4.a aVar = f492313e;
        if (aVar != null) {
            if (z17 && aVar.f492299a == null) {
                com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc c22979xbb268bc = f492314f;
                uq5.y g17 = c22979xbb268bc != null ? c22979xbb268bc.g(uq5.k.ImageEnhanceEffect) : null;
                com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc c22979xbb268bc2 = f492314f;
                if (c22979xbb268bc2 != null) {
                    c22979xbb268bc2.c(g17);
                }
                aVar.f492299a = g17 instanceof uq5.p ? (uq5.p) g17 : null;
            } else if (!z17 && (pVar = aVar.f492299a) != null) {
                com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc c22979xbb268bc3 = f492314f;
                if (c22979xbb268bc3 != null) {
                    c22979xbb268bc3.n(pVar.f511800a);
                }
                aVar.f492299a = null;
            }
            if (h1Var != null) {
                h1Var.f257136i = z17;
            }
            if (z17) {
                dp4.b.f323795a.a();
                if (h1Var != null) {
                    h1Var.f257128a.a(new so4.e(h1Var));
                }
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setVideoEnhancement enable:");
        sb6.append(z17);
        sb6.append(", effectId:");
        so4.a aVar2 = f492313e;
        sb6.append(aVar2 != null ? java.lang.Long.valueOf(aVar2.a()) : null);
        sb6.append(", rangeId:");
        so4.a aVar3 = f492313e;
        sb6.append(aVar3 != null ? aVar3.f492299a : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocalEffectManager", sb6.toString());
    }

    public final void g(int i17) {
        if (i17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LocalEffectManager", "setVideoEnhancementScene error:" + i17);
            return;
        }
        so4.a aVar = f492313e;
        if (aVar != null) {
            if (aVar.a() > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocalEffectManager", "setVideoEnhancementScene, effectId:" + aVar.a() + ", scene:" + i17);
                uq5.p pVar = aVar.f492299a;
                if (pVar != null) {
                    com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22985x615f1ce6.f39989x4fbc8495.m83860x6315c81d(pVar.f511802c, i17);
                }
                aVar.f492300b = i17;
            }
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("FINDER_CONFIG_USER_KEY").getInt("USERINFO_FINDER_SHOW_IMAGE_ENHANCEMENT_FACE_LANDMARKS_INT_SYNC", 0) == 1;
            so4.a aVar2 = f492313e;
            if (aVar2 == null || aVar2.a() <= 0) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocalEffectManager", "setVideoEnhancementShowFaceLandmarks, show:" + z17);
            uq5.p pVar2 = aVar2.f492299a;
            if (pVar2 != null) {
                com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22985x615f1ce6.f39989x4fbc8495.m83861x8d5376cf(pVar2.f511802c, z17);
            }
        }
    }

    public final void h() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        p05.a3 a3Var = p05.a3.f431972a;
        sb6.append(p05.a3.f431976e);
        sb6.append('/');
        sb6.append(p05.a3.f431982k);
        if (!com.p314xaae8f345.mm.vfs.w6.j(sb6.toString())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LocalEffectManager", "tryCreateX3DGlobalContext model not exist!");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocalEffectManager", "start tryCreateX3DGlobalContext");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocalEffectManager", "tryCreateX3DGlobalContext finish");
        }
    }

    public final synchronized void i() {
        f492311c.clear();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocalEffectManager", "clear");
        f492316h.clear();
        com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc c22979xbb268bc = f492314f;
        if (c22979xbb268bc != null) {
            c22979xbb268bc.k();
        }
        f492314f = null;
        f492313e = null;
        com.p314xaae8f345.mm.vfs.w6.f(f492310b);
        f492315g.clear();
    }
}
