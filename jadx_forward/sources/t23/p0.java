package t23;

/* loaded from: classes10.dex */
public final class p0 {

    /* renamed from: n, reason: collision with root package name */
    public static boolean f496755n = false;

    /* renamed from: o, reason: collision with root package name */
    public static boolean f496756o = false;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f496757p = false;

    /* renamed from: q, reason: collision with root package name */
    public static boolean f496758q = false;

    /* renamed from: r, reason: collision with root package name */
    public static volatile t23.p0 f496759r = null;

    /* renamed from: s, reason: collision with root package name */
    public static int f496760s = 0;

    /* renamed from: t, reason: collision with root package name */
    public static int f496761t = -1;

    /* renamed from: a, reason: collision with root package name */
    public t23.x1 f496762a;

    /* renamed from: b, reason: collision with root package name */
    public t23.j f496763b;

    /* renamed from: c, reason: collision with root package name */
    public t23.y0 f496764c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f496765d = null;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedHashSet f496766e = new java.util.LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f496767f = new java.util.HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f496768g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f496769h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f496770i = new java.util.HashMap();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.Map f496771j = new java.util.HashMap();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.Map f496772k = new java.util.HashMap();

    /* renamed from: l, reason: collision with root package name */
    public final java.util.List f496773l = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final android.util.SparseArray f496774m = new android.util.SparseArray();

    public p0() {
        if (this.f496762a == null) {
            this.f496762a = new t23.x1();
        }
        if (this.f496764c == null) {
            this.f496764c = new t23.y0();
        }
        if (this.f496763b == null) {
            this.f496763b = new t23.j();
        }
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_album_local_name, "", true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryCore", "localAlbumName: %s.", Zi);
        try {
            cl0.e f17 = new cl0.g(Zi).f("localAlbumName");
            for (int i17 = 0; i17 < f17.mo15056xbe0e3ae6(); i17++) {
                cl0.g k17 = f17.k(i17);
                t23.c1 c1Var = new t23.c1();
                c1Var.f496654a = k17.mo15082x48bce8a4("key");
                c1Var.f496655b = k17.mo15082x48bce8a4(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
                c1Var.f496656c = k17.mo15082x48bce8a4("default");
                int b17 = j33.d0.b(c1Var.f496655b);
                c1Var.f496657d = b17;
                this.f496774m.put(b17, c1Var);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public static java.lang.String a(java.lang.String str, java.lang.String str2, int i17) {
        ((java.util.HashMap) j().f496772k).put(str2, java.lang.Integer.valueOf(i17));
        ((java.util.HashMap) j().f496772k).put(str, java.lang.Integer.valueOf(i17));
        ((java.util.ArrayList) j().f496773l).add(str2);
        java.util.Iterator it = ((java.util.HashMap) j().f496771j).keySet().iterator();
        java.lang.String str3 = null;
        boolean z17 = false;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.String str4 = (java.lang.String) it.next();
            if (str4 != null) {
                str3 = (java.lang.String) ((java.util.HashMap) j().f496771j).get(str4);
                z17 = str.equals(str4) || (!android.text.TextUtils.isEmpty(str2) && !android.text.TextUtils.isEmpty(str3) && str3.equals(str2));
                if (z17) {
                    ((java.util.HashMap) j().f496771j).put(str4, str2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryCore", "alreadyFind, key = %s, editPath = %s, rawPath = %s", str4, str2, str);
                    break;
                }
            }
        }
        if (z17) {
            return str3;
        }
        ((java.util.HashMap) j().f496771j).put(str, str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryCore", "rawPath = %s start to do edit, editPath = %s", str, str2);
        return null;
    }

    public static boolean b() {
        int i17 = f496760s;
        if (i17 > 0) {
            f496760s = i17 - 1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryCore", "pennqin, defGallery %d.", java.lang.Integer.valueOf(f496760s));
        if (f496760s != 0) {
            return false;
        }
        if (f496759r != null && f496759r.f496764c != null && f496759r.f496763b != null) {
            if (f496760s != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GalleryCore", "oh, ref count not right!!! Maybe because quick enter/back.");
            } else {
                if (j().f496763b != null) {
                    t23.z1 z1Var = t23.z1.f496846d;
                    z1Var.f496847a.clear();
                    z1Var.f496848b.clear();
                    h().b();
                    f496759r.f496763b.h(null);
                    t23.o0 o0Var = f496759r.f496763b.f496719a;
                    kk.j jVar = o0Var.f496743a;
                    if (jVar != null) {
                        ((lt0.f) jVar).c(new t23.l0(o0Var));
                        o0Var.f496743a = null;
                    }
                    synchronized (o0Var.f496748f) {
                        t23.t0 t0Var = o0Var.f496744b;
                        if (t0Var != null) {
                            t0Var.i();
                            t0Var.b();
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).edit().putInt("com.tencent.mm.gallery.cache.suffix", t0Var.f496804e).apply();
                            o0Var.f496744b = null;
                        }
                    }
                    f496759r.f496763b = null;
                }
                f496759r.f496762a = null;
                if (f496759r.f496764c != null) {
                    t23.y0 y0Var = f496759r.f496764c;
                    if (y0Var.f496836d == null && y0Var.f496834b != null) {
                        y0Var.f496836d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(y0Var.f496834b.getLooper());
                    }
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = y0Var.f496836d;
                    if (n3Var != null) {
                        n3Var.mo50302x6b17ad39(null);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GalleryHandlerThread", "assistHandler is null.");
                    }
                    f496759r.f496764c.a().mo50302x6b17ad39(null);
                    t23.y0 y0Var2 = f496759r.f496764c;
                    if (y0Var2.f496842j == null && y0Var2.f496841i != null) {
                        y0Var2.f496842j = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(y0Var2.f496841i.getLooper());
                    }
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var2 = y0Var2.f496842j;
                    if (n3Var2 != null) {
                        n3Var2.mo50302x6b17ad39(null);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GalleryHandlerThread", "querySubHandler is null.");
                    }
                    t23.y0 y0Var3 = f496759r.f496764c;
                    if (y0Var3.f496835c == null && y0Var3.f496833a != null) {
                        y0Var3.f496835c = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(y0Var3.f496833a.getLooper());
                    }
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var3 = y0Var3.f496835c;
                    if (n3Var3 != null) {
                        n3Var3.mo50302x6b17ad39(null);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GalleryHandlerThread", "querySubHandler is null.");
                    }
                    t23.y0 y0Var4 = f496759r.f496764c;
                    android.os.HandlerThread handlerThread = y0Var4.f496834b;
                    if (handlerThread != null) {
                        handlerThread.quit();
                        y0Var4.f496834b = null;
                    }
                    y0Var4.f496836d = null;
                    y0Var4.f496837e = null;
                    java.util.concurrent.ExecutorService executorService = y0Var4.f496838f;
                    if (executorService != null) {
                        ((ku5.f) executorService).shutdown();
                        y0Var4.f496838f = null;
                    }
                    java.util.concurrent.ExecutorService executorService2 = y0Var4.f496839g;
                    if (executorService2 != null) {
                        ((ku5.f) executorService2).shutdown();
                        y0Var4.f496839g = null;
                    }
                    java.util.concurrent.ExecutorService executorService3 = y0Var4.f496840h;
                    if (executorService3 != null) {
                        ((ku5.f) executorService3).shutdown();
                        y0Var4.f496840h = null;
                    }
                    android.os.HandlerThread handlerThread2 = y0Var4.f496841i;
                    if (handlerThread2 != null) {
                        handlerThread2.quit();
                        y0Var4.f496841i = null;
                    }
                    y0Var4.f496842j = null;
                    android.os.HandlerThread handlerThread3 = y0Var4.f496833a;
                    if (handlerThread3 != null) {
                        handlerThread3.quit();
                        y0Var4.f496833a = null;
                    }
                    y0Var4.f496835c = null;
                    f496759r.f496764c = null;
                }
                f496759r = null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryCore", "stopServices: finish.");
            }
        }
        return true;
    }

    public static void c() {
        java.util.Map map = j().f496771j;
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashMap hashMap = (java.util.HashMap) map;
        for (java.lang.String str : hashMap.keySet()) {
            java.lang.String str2 = (java.lang.String) hashMap.get(str);
            arrayList.add(str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryCore", "[deleteAllEditMedia] origin path = " + str + ", album edit path = " + str2);
        }
        ((java.util.HashMap) j().f496771j).clear();
        ((java.util.ArrayList) j().f496773l).clear();
        ((java.util.HashMap) j().f496772k).clear();
        ((ku5.t0) ku5.t0.f394148d).q(new java.lang.Runnable() { // from class: t23.p0$$a
            @Override // java.lang.Runnable
            public final void run() {
                int i17 = 0;
                while (true) {
                    java.util.List list = arrayList;
                    if (i17 >= list.size()) {
                        return;
                    }
                    java.lang.String str3 = (java.lang.String) list.get(i17);
                    com.p314xaae8f345.mm.vfs.w6.h(str3);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryCore", "[deleteAllEditMedia] VFSFileOp.deleteFile = " + str3);
                    i17++;
                }
            }
        });
    }

    public static void d(final java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        int indexOf;
        java.util.Map map = j().f496771j;
        final java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.HashMap hashMap = (java.util.HashMap) map;
        for (java.lang.String str : hashMap.keySet()) {
            java.lang.String str2 = (java.lang.String) hashMap.get(str);
            arrayList3.add(str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryCore", "origin path = " + str + ", album edit path = " + str2);
        }
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            arrayList3.remove((java.lang.String) arrayList.get(i17));
        }
        ((java.util.HashMap) j().f496771j).clear();
        final boolean z17 = !((java.util.ArrayList) j().f496773l).isEmpty();
        ((java.util.ArrayList) j().f496773l).clear();
        final java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str3 = (java.lang.String) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 e17 = e(str3);
            if (e17 == null) {
                e17 = g(str3);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = e17;
            if (abstractC15633xee433078 == null && arrayList2 != null && (indexOf = arrayList2.indexOf(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078.b(0, 0L, str3, "", ""))) >= 0 && indexOf < arrayList2.size()) {
                abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) arrayList2.get(indexOf);
            }
            if (abstractC15633xee433078 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15631xba892b3b) {
                hashMap2.put(str3, abstractC15633xee433078);
            }
        }
        ((ku5.t0) ku5.t0.f394148d).q(new java.lang.Runnable() { // from class: t23.p0$$b
            @Override // java.lang.Runnable
            public final void run() {
                int i18 = 0;
                while (true) {
                    java.util.List list = arrayList3;
                    if (i18 >= list.size()) {
                        break;
                    }
                    java.lang.String str4 = (java.lang.String) list.get(i18);
                    com.p314xaae8f345.mm.vfs.w6.h(str4);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryCore", "[deleteEditMedia] VFSFileOp.deleteFile = " + str4);
                    i18++;
                }
                if (!z17) {
                    return;
                }
                int i19 = 0;
                while (true) {
                    java.util.ArrayList arrayList4 = arrayList;
                    if (i19 >= arrayList4.size()) {
                        ((java.util.HashMap) t23.p0.j().f496772k).clear();
                        return;
                    }
                    java.lang.String str5 = (java.lang.String) arrayList4.get(i19);
                    if (str5 != null && ((java.util.HashMap) t23.p0.j().f496772k).get(str5) != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee4330782 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) hashMap2.get(str5);
                        if (abstractC15633xee4330782 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15631xba892b3b) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15631xba892b3b c15631xba892b3b = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15631xba892b3b) abstractC15633xee4330782;
                            if (c15631xba892b3b.f219958w) {
                                bs.b wi6 = ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).wi("check_file");
                                bs.b wi7 = ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).wi("check_permission");
                                if (wi6 == null || wi7 == null) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GalleryCore", "create checkFileChain error");
                                } else {
                                    java.lang.String a17 = q75.c.a("jpg");
                                    qk.r7 r7Var = (qk.r7) i95.n0.c(qk.r7.class);
                                    wi7.b(wi6);
                                    aq.t0 t0Var = new aq.t0(c15631xba892b3b.f219960y, c15631xba892b3b.f219959x, a17, 0L, new android.os.Bundle());
                                    t23.q0 q0Var = new t23.q0();
                                    ((hs.v) r7Var).getClass();
                                    qp.b.f447207a.a(wi7, t0Var, q0Var);
                                }
                            }
                        }
                        int intValue = ((java.lang.Integer) ((java.util.HashMap) t23.p0.j().f496772k).get(str5)).intValue();
                        if (intValue > 0) {
                            t23.p0 j17 = t23.p0.j();
                            boolean z18 = intValue == 1;
                            j17.getClass();
                            if (z18) {
                                java.lang.String a18 = q75.c.a("jpg");
                                zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
                                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                                ((yb0.g) b0Var).getClass();
                                com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.b(context, str5, a18);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryCore", "exportPhotoToSystemAlbum = %s", a18);
                            } else {
                                java.lang.String b17 = q75.c.b("mp4");
                                ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ai(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str5, b17);
                                q75.c.f(b17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryCore", "exportVideoToSystemAlbum = %s", b17);
                            }
                        }
                    }
                    i19++;
                }
            }
        });
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 e(java.lang.String str) {
        int indexOf;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078.b(0, 0L, str, "", "");
        if (l() == null || (indexOf = l().indexOf(b17)) < 0) {
            return null;
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) l().get(indexOf);
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 f(java.lang.String str) {
        if (l() == null) {
            return null;
        }
        java.util.Iterator it = l().iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it.next();
            java.lang.String str2 = abstractC15633xee433078.f219964f;
            if (str2 != null && str2.equals(str)) {
                return abstractC15633xee433078;
            }
        }
        return null;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 g(java.lang.String str) {
        java.util.LinkedHashSet m17;
        java.util.Iterator it;
        if (str == null || (m17 = m()) == null || (it = m17.iterator()) == null) {
            return null;
        }
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it.next();
            if (str.equals(abstractC15633xee433078.f219963e)) {
                return abstractC15633xee433078;
            }
        }
        return null;
    }

    public static t23.j h() {
        if (j().f496763b == null) {
            j().f496763b = new t23.j();
        }
        return j().f496763b;
    }

    public static java.util.HashSet i() {
        return j().f496767f;
    }

    public static t23.p0 j() {
        if (f496759r == null) {
            f496759r = new t23.p0();
        }
        return f496759r;
    }

    public static t23.x1 k() {
        if (j().f496762a == null) {
            j().f496762a = new t23.x1();
        }
        return j().f496762a;
    }

    public static java.util.ArrayList l() {
        return j().f496765d;
    }

    public static java.util.LinkedHashSet m() {
        return j().f496766e;
    }

    public static t23.y0 n() {
        if (j().f496764c == null) {
            j().f496764c = new t23.y0();
        }
        return j().f496764c;
    }

    public static void o() {
        int i17 = f496760s + 1;
        f496760s = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryCore", "pennqin, refGallery %d.", java.lang.Integer.valueOf(i17));
    }

    public static void p(java.util.ArrayList arrayList) {
        j().f496765d = arrayList;
    }
}
