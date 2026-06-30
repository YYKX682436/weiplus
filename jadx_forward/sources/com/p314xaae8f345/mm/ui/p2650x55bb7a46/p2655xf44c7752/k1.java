package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes12.dex */
public class k1 extends db5.p8 {
    public static boolean B = false;
    public static long C = -1;
    public static boolean D;
    public static final java.util.HashMap E = new java.util.HashMap();
    public static final java.util.Set F = new java.util.HashSet();
    public final java.util.Map A;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b f282625g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d2 f282626h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f282627i;

    /* renamed from: n, reason: collision with root package name */
    public boolean f282629n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t2 f282630o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.j1 f282631p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t4 f282632q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.g2 f282633r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f282634s;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f282636u;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.q3 f282638w;

    /* renamed from: x, reason: collision with root package name */
    public final vh5.s f282639x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f282640y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6353x78343da0 f282641z;

    /* renamed from: m, reason: collision with root package name */
    public boolean f282628m = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f282635t = false;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f282637v = true;

    public k1(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b, long j17, java.lang.String str, boolean z17, long j18, boolean z18, java.lang.String str2, java.lang.Boolean bool, int i17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.q3 q3Var) {
        this.f282629n = false;
        this.f282634s = false;
        this.f282636u = null;
        wh5.f fVar = wh5.f.f527585a;
        this.f282639x = new vh5.s(fVar.a());
        this.f282640y = true;
        new java.util.ArrayList();
        this.f282641z = null;
        this.A = new java.util.HashMap();
        this.f282638w = q3Var;
        boolean booleanExtra = viewOnClickListenerC21748xb3d38e6b.getIntent().getBooleanExtra("img_gallery_is_mp_video_without_msg", false);
        this.f282634s = booleanExtra;
        if (!booleanExtra) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MicroMsg.ImageGalleryAdapter, invalid argument, context = ");
            sb6.append(viewOnClickListenerC21748xb3d38e6b);
            sb6.append(", currentMsgId = ");
            sb6.append(j17);
            sb6.append(", talker = ");
            sb6.append(str);
            sb6.append(", stack = ");
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            iz5.a.g(sb6.toString(), j17 > 0 && str != null && str.length() > 0);
        }
        this.f282625g = viewOnClickListenerC21748xb3d38e6b;
        D = z17;
        C = j18;
        this.f282636u = str;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d2 d2Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d2(j17, str, this, bool, i17);
        this.f282626h = d2Var;
        this.f282629n = z18;
        this.f282627i = str2;
        this.f282630o = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t2(this, new int[(d2Var.f282385c - d2Var.f282387e) + com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d2.f282382o + 1]);
        this.f282631p = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja(this);
        this.f282632q = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t4(this);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20025xc6e1c289()) == 1) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - wh5.f.f527586b >= 300000) {
                wh5.f.f527586b = currentTimeMillis;
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("live实验: ");
                sb7.append(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C19989xd599637f()) == 1);
                sb7.append(" 设备支持情况: ");
                ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).getClass();
                sb7.append(qp.b.f447211e);
                dp.a.m125854x26a183b(context, sb7.toString(), 1).show();
            }
        }
        B = fVar.a();
    }

    public static com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.f2 B(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (K(f9Var)) {
            return com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.f2.liveImage;
        }
        if (G(f9Var)) {
            return com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.f2.appimage;
        }
        if (L(f9Var)) {
            return com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.f2.image;
        }
        if (E(f9Var)) {
            return com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.f2.sight;
        }
        boolean N = N(f9Var);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.f2 f2Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.f2.video;
        return (N || M(f9Var)) ? f2Var : com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.f2.unkown;
    }

    public static boolean E(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        r45.uf6 uf6Var;
        if (f9Var == null || f9Var.M2()) {
            return false;
        }
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String z07 = f9Var.z0();
        ((vf0.y1) x1Var).getClass();
        t21.v2 h17 = t21.d3.h(z07);
        if (h17 != null && (uf6Var = h17.E) != null) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(uf6Var.f468866d)) {
                return true;
            }
            r45.uf6 uf6Var2 = h17.E;
            if (uf6Var2.f468867e > 0 || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(uf6Var2.f468868f) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.E.f468869g) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.E.f468870h) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.E.f468871i) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.E.f468872m) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.E.f468873n)) {
                return true;
            }
        }
        return false;
    }

    public static boolean F(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return f9Var != null && f9Var.mo78013xfb85f7b0() == 49;
    }

    public static boolean G(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return f9Var != null && f9Var.mo78013xfb85f7b0() == 268435505;
    }

    public static boolean J(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null) {
            return false;
        }
        return f9Var.mo78013xfb85f7b0() == 3 || f9Var.mo78013xfb85f7b0() == 39 || f9Var.mo78013xfb85f7b0() == 13;
    }

    public static boolean K(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null || !B) {
            return false;
        }
        if (!(f9Var.mo78013xfb85f7b0() == 3 || f9Var.mo78013xfb85f7b0() == 39 || f9Var.mo78013xfb85f7b0() == 13) || wh5.f.f527585a.b(f9Var)) {
            return false;
        }
        long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
        java.util.HashMap hashMap = E;
        if (hashMap.containsKey(java.lang.Long.valueOf(m124847x74d37ac6))) {
            return java.lang.Boolean.TRUE.equals(hashMap.get(java.lang.Long.valueOf(m124847x74d37ac6)));
        }
        j15.d dVar = new j15.d();
        java.lang.String j17 = f9Var.j();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (j17 == null) {
            j17 = "";
        }
        dVar.m126728xdc93280d(j17);
        boolean b17 = xs.l1.b(dVar, f9Var.A0() == 1);
        hashMap.put(java.lang.Long.valueOf(m124847x74d37ac6), java.lang.Boolean.valueOf(b17));
        return b17;
    }

    public static boolean L(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (K(f9Var)) {
            return false;
        }
        return J(f9Var);
    }

    public static boolean M(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return f9Var != null && f9Var.mo78013xfb85f7b0() == 62;
    }

    public static boolean N(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null || E(f9Var)) {
            return false;
        }
        return f9Var.mo78013xfb85f7b0() == 43 || f9Var.mo78013xfb85f7b0() == 486539313 || f9Var.mo78013xfb85f7b0() == 44 || f9Var.mo78013xfb85f7b0() == 62;
    }

    public static void Q(java.lang.String str, android.net.Uri uri, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        int intValue = ((java.lang.Integer) ((a80.b) ((xs.w0) i95.n0.c(xs.w0.class))).hj(f9Var).f384366d).intValue();
        if (intValue != 3 && intValue != 2) {
            h90.w wVar = (h90.w) i95.n0.c(h90.w.class);
            h90.a[] aVarArr = h90.a.f361204d;
            ((g90.u) wVar).Ui(f9Var, 4, str, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryAdapter", "insert DeviceFileExtInfo, %s, %s, %s", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), f9Var.Q0(), str);
        h90.w wVar2 = (h90.w) i95.n0.c(h90.w.class);
        h90.a[] aVarArr2 = h90.a.f361204d;
        ((g90.u) wVar2).Ui(f9Var, 1, str, null);
        if (uri != null) {
            ((g90.u) ((h90.w) i95.n0.c(h90.w.class))).aj(f9Var.Q0(), f9Var.m124847x74d37ac6(), android.content.ContentUris.parseId(uri), 1);
        }
    }

    public static void i(android.content.Context context, java.util.List list) {
        if (context == null || list == null || list.size() <= 0) {
            return;
        }
        zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.s1 s1Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.s1(list, context);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t1 t1Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t1(context);
        ((yb0.g) b0Var).getClass();
        com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.h(context, s1Var, t1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0163, code lost:
    
        if (r11 != (-4)) goto L104;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean j(android.content.Context r17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.j(android.content.Context, com.tencent.mm.storage.f9, boolean):boolean");
    }

    public static void k(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.e2 e2Var) {
        if (context == null || f9Var == null) {
            return;
        }
        zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.z1 z1Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.z1(context, f9Var, z17, e2Var);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.l1 l1Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.l1(z17, context);
        ((yb0.g) b0Var).getClass();
        com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.h(context, z1Var, l1Var);
    }

    public static boolean l(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17) {
        java.lang.String str;
        boolean z18;
        java.lang.String str2;
        if (f9Var == null) {
            if (z17) {
                com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.m(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k7a));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImageGalleryAdapter", "doExportVideo, msg is null or is clean, just return");
            return false;
        }
        if (f9Var.z2()) {
            ((c35.m) i95.n0.c(c35.m.class)).getClass();
        }
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        t21.v2 g17 = t21.o2.Ui().g(f9Var.z0());
        if (g17 != null) {
            int wi6 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(g17.h()) ? ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(g17.h()) : 0;
            z18 = g17.i();
            str2 = g17.S;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(106L, 216L, 1L, false);
            str = "MicroMsg.ImageGalleryAdapter";
            g0Var.d(12084, java.lang.Integer.valueOf(g17.f496541f), java.lang.Integer.valueOf(g17.f496548m * 1000), 0, 2, g17.h(), java.lang.Integer.valueOf(wi6), t21.v2.c(g17.g()), java.lang.Long.valueOf(g17.f496545j));
        } else {
            str = "MicroMsg.ImageGalleryAdapter";
            z18 = false;
            str2 = null;
        }
        ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
        t21.v2 h17 = t21.d3.h(str2);
        boolean i17 = h17 != null ? h17.i() : false;
        java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(f9Var, bm5.f0.f104104s, f9Var.z0(), false);
        java.lang.String rj7 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(f9Var, bm5.f0.f104103r, f9Var.z0(), false);
        boolean z19 = f9Var.A0() == 1;
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(rj6);
        boolean j18 = com.p314xaae8f345.mm.vfs.w6.j(rj7);
        if (!z18 && !i17) {
            if (!z19 || (!j17 && !j18)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "do export video but video had not download finish.");
                if (z17) {
                    com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.m(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k7a));
                }
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "do export video for sending video, compressExists=%b, originExists=%b", java.lang.Boolean.valueOf(j17), java.lang.Boolean.valueOf(j18));
        }
        if (i17 && j18) {
            rj6 = rj7;
        }
        zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.w1 w1Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.w1(i17, f9Var);
        ((yb0.g) b0Var).getClass();
        java.lang.String g18 = com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.g(context, rj6, null, w1Var);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g18)) {
            if (z17) {
                com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.m(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k7a));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "doExportVideo, export video fail, video path = " + rj6);
            return false;
        }
        if (z17) {
            ((c35.m) i95.n0.c(c35.m.class)).getClass();
            ((ku5.t0) ku5.t0.f394148d).D(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.x1(context));
        }
        x51.x0.f533642a.a(com.p314xaae8f345.mm.vfs.w6.p(g18), c01.ia.v(f9Var.G));
        q75.c.g(g18, context);
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.y1(f9Var, rj6, g17), "MsgVideoExportReport");
        return true;
    }

    public static void m(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.e2 e2Var) {
        if (context == null || f9Var == null) {
            return;
        }
        zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.u1 u1Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.u1(context, f9Var, z17, e2Var);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.v1 v1Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.v1(z17, context);
        ((yb0.g) b0Var).getClass();
        com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.h(context, u1Var, v1Var);
    }

    public static java.lang.String s(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.lang.String str;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d D0;
        ot0.q v17 = ot0.q.v(f9Var.j());
        if (v17 == null || (str = v17.f430227p) == null || str.length() <= 0 || (D0 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().D0(v17.f430227p)) == null) {
            return null;
        }
        return D0.f68099xfeae815;
    }

    public java.lang.Boolean A(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.util.Map map = this.A;
        if (map.containsKey(f9Var)) {
            return (java.lang.Boolean) map.get(f9Var);
        }
        return null;
    }

    public android.view.View C(int i17) {
        android.view.View e17 = e(i17);
        if (e17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageGalleryAdapter", "position : %s getVideoViewByPosition is null", java.lang.Integer.valueOf(i17));
            return null;
        }
        android.view.View findViewById = e17.findViewById(com.p314xaae8f345.mm.R.id.oy9);
        if (findViewById == null) {
            findViewById = e17.findViewById(com.p314xaae8f345.mm.R.id.oy7);
        }
        if (findViewById == null || findViewById.getVisibility() == 8) {
            return null;
        }
        return findViewById;
    }

    @Override // db5.p8
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public android.view.View d(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar;
        vh5.q qVar;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 y17 = y(i17);
        if (view == null) {
            view = android.view.View.inflate(this.f282625g, com.p314xaae8f345.mm.R.C30864xbddafb2a.bka, null);
            taVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta(this, view, y17);
            view.setTag(taVar);
        } else {
            taVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta) view.getTag();
        }
        final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.q3 q3Var = this.f282638w;
        if (q3Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryOPLayer", "instantiateItem: " + i17);
            android.util.SparseArray sparseArray = q3Var.f282825a;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.g4 g4Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.g4) sparseArray.get(i17);
            if (g4Var != null) {
                if (!(!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(g4Var.f282481c, g4Var.f282479a.f346937a))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryOPLayer", "instantiateItem: rebind container");
                    android.view.View view2 = g4Var.f282481c;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryOPLayer", "rebindContainer: " + view);
                    g4Var.f282481c = view;
                    ((android.view.ViewGroup) view).addView(view2, new android.view.ViewGroup.LayoutParams(-1, -1));
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(g4Var.f282481c, view)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryOPLayer", "instantiateItem: skip create");
                }
            }
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) view.findViewById(com.p314xaae8f345.mm.R.id.cn9);
            if (relativeLayout != null) {
                sparseArray.put(i17, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.g4(fq.d.a(relativeLayout), i17, view, new p3321xbce91901.jvm.p3324x21ffc6bd.s(q3Var) { // from class: com.tencent.mm.ui.chatting.gallery.n3
                    @Override // p3321xbce91901.jvm.p3324x21ffc6bd.s, f06.s
                    public java.lang.Object get() {
                        return java.lang.Boolean.valueOf(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.q3) this.f72685xcfcbe9ef).f282829e);
                    }
                }));
            } else {
                android.view.ViewStub viewStub = (android.view.ViewStub) view.findViewById(com.p314xaae8f345.mm.R.id.u3v);
                if (viewStub != null) {
                    viewStub.setOnInflateListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p3(q3Var, i17, view));
                    viewStub.inflate();
                }
            }
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.f2 B2 = B(y17);
        taVar.e(i17, B2, y17);
        vh5.s sVar = this.f282639x;
        sVar.getClass();
        boolean z17 = sVar.f518772a;
        android.view.ViewGroup viewGroup2 = taVar.E;
        if (z17) {
            java.lang.Object tag = viewGroup2.getTag();
            vh5.q qVar2 = tag instanceof vh5.q ? (vh5.q) tag : null;
            if (qVar2 != null && qVar2.f518765f != i17) {
                viewGroup2.setVisibility(8);
                qVar2.mo129548x408b7293();
            }
        }
        if (((G(y17) || L(y17) || K(y17)) && ((java.util.HashMap) this.A).containsKey(y17) && !U(i17)) ? A(y17).booleanValue() : false) {
            r(taVar, y17, i17);
            this.f282640y = false;
            return view;
        }
        int ordinal = B2.ordinal();
        if (ordinal == 1) {
            this.f282630o.j(taVar, y17, i17, (w() == null || y17 == null || w().m124847x74d37ac6() != y17.m124847x74d37ac6()) ? false : true);
        } else if (ordinal == 2) {
            this.f282631p.i(taVar, y17, i17);
        } else if (ordinal == 3) {
            this.f282632q.i(taVar, y17, i17);
        } else if (ordinal == 4) {
            q(taVar, y17, i17);
        } else if (ordinal == 5) {
            m11.b0 x17 = x(y17, false);
            if (z17 && y17 != null && x17 != null) {
                android.content.Context context = taVar.f282956a.getContext();
                if (viewGroup2.getTag() instanceof vh5.q) {
                    java.lang.Object tag2 = viewGroup2.getTag();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag2, "null cannot be cast to non-null type com.tencent.mm.ui.media.chat.legacy.LegacyMediaHolder");
                    qVar = (vh5.q) tag2;
                } else {
                    android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ejc, viewGroup2, false);
                    viewGroup2.addView(inflate, new android.view.ViewGroup.LayoutParams(-1, -1));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
                    vh5.q qVar3 = new vh5.q(inflate, mf3.u.f407658g);
                    qVar3.u(viewGroup2);
                    viewGroup2.setTag(qVar3);
                    qVar = qVar3;
                }
                viewGroup2.setVisibility(0);
                sVar.f518776e.put(i17, qVar);
                if (qVar.f518765f != i17) {
                    qVar.t(new mf3.s(wh5.h0.f527601a.a(y17, x17), i17, i17 == com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d2.f282382o));
                }
            }
            if (i17 == com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d2.f282382o && sVar.f518773b) {
                sVar.f518775d.mo8333x510f45c9(i17);
                vh5.k kVar = sVar.f518774c;
                if (kVar != null) {
                    kVar.a(i17);
                }
                sVar.f518773b = false;
            }
        }
        this.f282640y = false;
        return view;
    }

    public boolean H(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, m11.b0 b0Var) {
        if (f9Var == null || b0Var == null) {
            return false;
        }
        return ((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).h(b0Var.f404166a, tg3.l1.a(f9Var), 1);
    }

    public final void O(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17, int i17) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t2 t2Var = this.f282630o;
        dm.aa bj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0) ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z.class))).bj(t2Var.y(f9Var, t2Var.w(f9Var, false), false));
        wh5.m0 m0Var = new wh5.m0(z17, "", bj6 != null ? bj6.f65916x970b0f9e : null);
        vh5.s sVar = this.f282639x;
        sVar.getClass();
        vh5.q a17 = sVar.a(i17);
        if (a17 != null) {
            a17.c(i17, m0Var);
        }
    }

    public void P(int i17) {
        t21.v2 p17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t4 t4Var = this.f282632q;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 y17 = t4Var.f282419d.y(i17);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta k17 = t4Var.k(i17);
        if (y17 == null || k17 == null || (p17 = t4Var.p(y17)) == null) {
            return;
        }
        if (y17.A0() == 0) {
            int i18 = p17.f496544i;
            if (i18 == 113 || i18 == 111 || i18 == 112) {
                t4Var.n(p17, k17);
                return;
            } else if (i18 == 198) {
                t4Var.n(p17, k17);
                return;
            }
        }
        t4Var.r(y17, k17);
    }

    public void R(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryAdapter", "setTranslateStatus() called with: msg = [" + f9Var.m124847x74d37ac6() + "], translate = [" + z17 + "], position = [" + i17 + "]");
        if (G(f9Var) || L(f9Var) || K(f9Var)) {
            ((java.util.HashMap) this.A).put(f9Var, java.lang.Boolean.valueOf(z17));
            v().e(i17, G(f9Var) ? com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.f2.appimage : L(f9Var) ? com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.f2.image : K(f9Var) ? com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.f2.liveImage : null, f9Var);
            java.util.Set set = F;
            if (z17) {
                ((java.util.HashSet) set).add(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
                if (U(i17)) {
                    O(f9Var, z17, i17);
                    return;
                } else {
                    r(v(), f9Var, i17);
                    return;
                }
            }
            ((java.util.HashSet) set).remove(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
            if (U(i17)) {
                O(f9Var, z17, i17);
            } else if (G(f9Var)) {
                q(v(), f9Var, i17);
            } else if (L(f9Var)) {
                this.f282630o.i(v(), f9Var, i17);
            }
        }
    }

    public void S(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17) {
        if (f9Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 w17 = w();
        if (w17 == null || w17.m124847x74d37ac6() != f9Var.m124847x74d37ac6()) {
            w17.getClass();
            return;
        }
        long I0 = f9Var.I0();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6353x78343da0 c6353x78343da0 = this.f282641z;
        if (c6353x78343da0 != null && (c6353x78343da0.f137019f != I0 || c6353x78343da0.f137021h != z17)) {
            c6353x78343da0.f137026m = c6353x78343da0.i();
            c6353x78343da0.f137027n = cm.b.cancel;
            c6353x78343da0.k();
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6353x78343da0 c6353x78343da02 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6353x78343da0();
        this.f282641z = c6353x78343da02;
        c6353x78343da02.f137025l = c6353x78343da02.i();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6353x78343da0 c6353x78343da03 = this.f282641z;
        c6353x78343da03.f137019f = I0;
        c6353x78343da03.f137020g = f9Var.mo78012x3fdd41df();
        c6353x78343da03.f137021h = z17;
        java.lang.String str = this.f282636u;
        int wi6 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str) ? ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str) : 2;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6353x78343da0 c6353x78343da04 = this.f282641z;
        c6353x78343da04.f137017d = c6353x78343da04.b("ChatName", str, true);
        c6353x78343da04.f137018e = wi6;
    }

    public void T(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, m11.b0 b0Var, int i17, cm.b bVar) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6353x78343da0 c6353x78343da0;
        long j17;
        long j18;
        long j19;
        if (f9Var == null || (c6353x78343da0 = this.f282641z) == null) {
            return;
        }
        c6353x78343da0.f137026m = c6353x78343da0.i();
        c6353x78343da0.f137027n = bVar;
        long I0 = f9Var.I0();
        boolean z17 = i17 == 1;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6353x78343da0 c6353x78343da02 = this.f282641z;
        long j27 = c6353x78343da02.f137019f;
        if (j27 != I0 && c6353x78343da02.f137021h != z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImageGalleryAdapter", "waiting img[%d] download finish but other img[%d] download finish callback don't report", java.lang.Long.valueOf(j27), java.lang.Long.valueOf(I0));
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6353x78343da0 c6353x78343da03 = this.f282641z;
            c6353x78343da03.f137027n = cm.b.cancel;
            c6353x78343da03.k();
            return;
        }
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (bVar == cm.b.ok) {
            java.lang.String x17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t2.x(f9Var, b0Var, false);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x17)) {
                j17 = com.p314xaae8f345.mm.vfs.w6.k(x17);
                this.f282630o.getClass();
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                android.graphics.Bitmap d17 = com.p314xaae8f345.mm.p786x600aa8b.e.d(x17, options);
                if (d17 != null) {
                    d17.recycle();
                }
                j18 = options.outWidth;
                j19 = options.outHeight;
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6353x78343da0 c6353x78343da04 = this.f282641z;
                c6353x78343da04.f137022i = j17;
                c6353x78343da04.f137024k = j19;
                c6353x78343da04.f137023j = j18;
                c6353x78343da04.k();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryAdapter", "stopWaitingImg [%d] [%s]", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), this.f282641z.m());
                this.f282641z = null;
            }
        }
        j17 = 0;
        j18 = 0;
        j19 = 0;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6353x78343da0 c6353x78343da042 = this.f282641z;
        c6353x78343da042.f137022i = j17;
        c6353x78343da042.f137024k = j19;
        c6353x78343da042.f137023j = j18;
        c6353x78343da042.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryAdapter", "stopWaitingImg [%d] [%s]", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), this.f282641z.m());
        this.f282641z = null;
    }

    public boolean U(int i17) {
        return K(y(i17));
    }

    public void V(int i17, boolean z17) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t2 t2Var = this.f282630o;
        t2Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryHolderImage", "viewHdImg, pos = " + i17);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 y17 = t2Var.f282419d.y(i17);
        if (y17 == null || y17.m124847x74d37ac6() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageGalleryHolderImage", "msg is null");
            return;
        }
        if (!L(y17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageGalleryHolderImage", "not img can't download hd");
            return;
        }
        m11.b0 w17 = t2Var.w(y17, true);
        if (w17 == null || w17.f404166a == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("viewHdImg fail, msgLocalId = ");
            sb6.append(java.lang.Long.valueOf(y17.m124847x74d37ac6()));
            sb6.append(", imgLocalId = ");
            sb6.append(w17 == null ? "null" : java.lang.Long.valueOf(w17.f404166a));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageGalleryHolderImage", sb6.toString());
            return;
        }
        if (!z17) {
            t2Var.F(y17, 3);
            if (t2Var.k(i17) != null) {
                t2Var.n(t2Var.k(i17), y17, w17, true, false, i17);
            }
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var = t2Var.f282419d;
        if (k1Var != null) {
            k1Var.S(y17, true);
        }
        if (!z17) {
            ((rq3.k) ((cc0.l) i95.n0.c(cc0.l.class))).Zi(y17.m124847x74d37ac6(), y17.Q0(), 2);
            ((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).b(w17.f404166a, tg3.l1.a(y17), 1, java.lang.Integer.valueOf(i17), com.p314xaae8f345.mm.R.C30861xcebc809e.bzt, t2Var, 0, false);
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ua a17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ua.a();
        a17.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageHDDownloadAndSaveMgr", "[oreh download_and_save] startScene, msgLoacalID:%d", java.lang.Long.valueOf(y17.m124847x74d37ac6()));
        a17.f283030d.add(tg3.l1.a(y17));
        ((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).b(w17.f404166a, tg3.l1.a(y17), 1, java.lang.Integer.valueOf(i17), com.p314xaae8f345.mm.R.C30861xcebc809e.bzt, a17, 0, false);
    }

    @Override // db5.p8
    public boolean a() {
        return this.f282637v;
    }

    @Override // db5.p8
    public int b() {
        return com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d2.f282382o - this.f282626h.f282387e;
    }

    @Override // db5.p8
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c(int i17, boolean z17) {
        android.view.View e17 = e(i17);
        if (e17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageGalleryAdapter", "position : %s getMultiTouchImageViewByPosition is null", java.lang.Integer.valueOf(i17));
            return null;
        }
        if (U(i17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryAdapter", "position : %s getMultiTouchImageViewByPosition null , useMultiLayer", java.lang.Integer.valueOf(i17));
            return null;
        }
        android.view.View findViewById = e17.findViewById(com.p314xaae8f345.mm.R.id.h88);
        if (findViewById == null || (z17 && findViewById.getVisibility() == 8)) {
            return null;
        }
        return (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) findViewById;
    }

    @Override // db5.p8, p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: destroyItem */
    public void mo7741x89d2022d(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        viewGroup.removeView((android.view.View) obj);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.q3 q3Var = this.f282638w;
        if (q3Var != null) {
            q3Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryOPLayer", "destroyItem: " + i17);
            q3Var.f282825a.remove(i17);
        }
        super.mo7741x89d2022d(viewGroup, i17, obj);
    }

    @Override // db5.p8
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f f(int i17, boolean z17) {
        android.view.View e17 = e(i17);
        if (e17 == null) {
            return null;
        }
        if (U(i17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryAdapter", "position : %s getWxImageViewByPosition null , useMultiLayer", java.lang.Integer.valueOf(i17));
            return null;
        }
        android.view.View findViewById = e17.findViewById(com.p314xaae8f345.mm.R.id.pr8);
        if (findViewById == null || (z17 && findViewById.getVisibility() == 8)) {
            return null;
        }
        return (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) findViewById;
    }

    @Override // db5.p8
    public int g() {
        int i17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d2.f282382o;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d2 d2Var = this.f282626h;
        return ((i17 - d2Var.f282387e) + d2Var.f282385c) - 1;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d2 d2Var = this.f282626h;
        return (d2Var.f282385c - d2Var.f282387e) + com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d2.f282382o + 1;
    }

    @Override // db5.p8, p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getItemPosition */
    public int mo8339xb2fa47d2(java.lang.Object obj) {
        if (this.f282635t) {
            return -2;
        }
        return super.mo8339xb2fa47d2(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r25) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.n(com.tencent.mm.storage.f9):void");
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: notifyDataSetChanged */
    public void mo8343xced61ae5() {
        super.mo8343xced61ae5();
        this.f282635t = false;
    }

    public void o(int i17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 y17 = y(i17);
        int ordinal = B(y17).ordinal();
        if (ordinal == 2 || ordinal == 3) {
            p(y17);
            return;
        }
        if (ordinal != 4) {
            n(y17);
            return;
        }
        java.lang.String s17 = s(y17);
        android.content.Intent intent = new android.content.Intent(this.f282625g, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
        intent.putExtra("Retr_File_Name", s17);
        intent.putExtra("Retr_Msg_Id", y17.m124847x74d37ac6());
        intent.putExtra("Retr_MsgTalker", y17.Q0());
        intent.putExtra("Retr_Msg_Type", 16);
        intent.putExtra("Retr_Msg_content", y17.j());
        intent.putExtra("Retr_Compress_Type", 0);
        intent.putExtra("ForwardParams_ReportFromScene", 9);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f282625g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(viewOnClickListenerC21748xb3d38e6b, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryAdapter", "doRestransmitAppImg", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        viewOnClickListenerC21748xb3d38e6b.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(viewOnClickListenerC21748xb3d38e6b, "com/tencent/mm/ui/chatting/gallery/ImageGalleryAdapter", "doRestransmitAppImg", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).qc(5);
    }

    /* renamed from: onPageSelected */
    public void m79606x510f45c9(int i17) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t2 t2Var = this.f282630o;
        if (t2Var != null && L(y(i17))) {
            t2Var.f282919h.mo8333x510f45c9(i17);
        }
        vh5.s sVar = this.f282639x;
        sVar.f518775d.mo8333x510f45c9(i17);
        vh5.k kVar = sVar.f518774c;
        if (kVar != null) {
            kVar.a(i17);
        }
        ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).Ai(y(i17));
    }

    public void p(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        boolean E2 = c01.d9.b().E();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f282625g;
        if (!E2) {
            db5.t7.k(viewOnClickListenerC21748xb3d38e6b, null);
            return;
        }
        if (f9Var.M2()) {
            ot0.m1 r17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.j1.r(f9Var);
            if (r17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageGalleryAdapter", "doRestransmitVideo mpShareVideoInfo should not be null");
                return;
            }
            if (viewOnClickListenerC21748xb3d38e6b.f282152i == null) {
                viewOnClickListenerC21748xb3d38e6b.f282152i = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.n0();
            }
            viewOnClickListenerC21748xb3d38e6b.f282152i.f267340a = r17;
            boolean z17 = this.f282634s;
            r17.f430120y = viewOnClickListenerC21748xb3d38e6b.f282209y.f282706m;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.j0.f267319a.b(viewOnClickListenerC21748xb3d38e6b, r17.f454876h, "", r17.f454875g, r17.f454880o, z17 ? 1 : 0);
            return;
        }
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String z07 = f9Var.z0();
        ((vf0.y1) x1Var).getClass();
        t21.v2 h17 = t21.d3.h(z07);
        if (h17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageGalleryAdapter", "videoInfo should not be null");
            return;
        }
        boolean fj6 = ((vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class))).fj(vf0.j3.f517738g);
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.S) || !((xf0.u) ((wf0.y1) i95.n0.c(wf0.y1.class))).fj(f9Var);
        if (fj6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryAdapter", "start forward video " + f9Var.m124847x74d37ac6() + " launch forward UIC , forceForwardCompress %b", java.lang.Boolean.valueOf(z18));
            jd5.c cVar = new jd5.c();
            long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
            int i17 = cVar.f125235d;
            cVar.set(i17 + 0, java.lang.Long.valueOf(m124847x74d37ac6));
            cVar.set(i17 + 2, java.lang.Long.valueOf(f9Var.I0()));
            cVar.set(i17 + 3, java.lang.Integer.valueOf(f9Var.mo78013xfb85f7b0()));
            java.lang.String Q0 = f9Var.Q0();
            if (Q0 == null) {
                Q0 = "";
            }
            cVar.set(i17 + 1, Q0);
            cVar.q(h17.f496548m);
            cVar.l(z18);
            n13.r rVar = new n13.r();
            rVar.f415650a = true;
            rVar.f415653d.f415672a = 1;
            ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(viewOnClickListenerC21748xb3d38e6b, cVar, rVar);
        } else {
            android.content.Intent intent = new android.content.Intent(viewOnClickListenerC21748xb3d38e6b, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
            intent.putExtra("Retr_length", h17.f496548m);
            intent.putExtra("Retr_File_Name", f9Var.z0());
            intent.putExtra("Retr_video_isexport", h17.f496555t);
            intent.putExtra("Retr_Msg_Type", M(f9Var) ? 11 : 1);
            intent.putExtra("Retr_Msg_Id", f9Var.m124847x74d37ac6());
            intent.putExtra("Retr_MsgTalker", f9Var.Q0());
            intent.putExtra("Retr_From", "gallery");
            intent.putExtra("ForwardParams_ReportFromScene", 9);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b2 = this.f282625g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(viewOnClickListenerC21748xb3d38e6b2, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryAdapter", "doRestransmitVideo", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            viewOnClickListenerC21748xb3d38e6b2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(viewOnClickListenerC21748xb3d38e6b2, "com/tencent/mm/ui/chatting/gallery/ImageGalleryAdapter", "doRestransmitVideo", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).qc(5);
    }

    public final void q(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17) {
        android.graphics.Bitmap Ai;
        taVar.f(taVar.C, 0);
        taVar.f(taVar.f282976u, 8);
        android.widget.ProgressBar progressBar = taVar.f282980y;
        taVar.f(progressBar, 8);
        taVar.f(taVar.f282981z, 8);
        taVar.f(taVar.f282972q, 8);
        java.lang.String s17 = s(f9Var);
        try {
            Ai = x51.w0.c(s17);
        } catch (java.lang.OutOfMemoryError unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImageGalleryAdapter", "[tomys] Oops, app img [%s] is too large, use resample version.", s17);
            java.lang.Runtime.getRuntime().gc();
            java.lang.Runtime.getRuntime().runFinalization();
            Ai = ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).Ai(s17);
        }
        if (Ai == null) {
            y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
            x60.e eVar = (x60.e) fVar;
            Ai = eVar.Ai(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).mj(f9Var, f9Var.z0(), true));
            taVar.f(progressBar, 0);
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50293x3498a0(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.q1(this, f9Var, taVar, s17));
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = taVar.C;
        if (Ai != null) {
            c21524xecd57b9a.m79195x464b3146(false);
            int width = Ai.getWidth();
            int height = Ai.getHeight();
            c21524xecd57b9a.f279184o = width;
            c21524xecd57b9a.f279185p = height;
            c21524xecd57b9a.setImageBitmap(Ai);
            c21524xecd57b9a.invalidate();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImageGalleryAdapter", "get image fail");
        c21524xecd57b9a.setVisibility(8);
        taVar.b();
        taVar.f282981z.setVisibility(0);
        taVar.b();
        taVar.B.setImageResource(com.p314xaae8f345.mm.R.raw.f80383x3bc8cb67);
        taVar.b();
        taVar.A.setText(this.f282625g.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g0_));
    }

    public void r(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17) {
        java.lang.String y17;
        if (G(f9Var)) {
            y17 = s(f9Var);
        } else {
            if (!L(f9Var)) {
                return;
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t2 t2Var = this.f282630o;
            y17 = t2Var.y(f9Var, t2Var.w(f9Var, false), false);
        }
        dm.aa bj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0) ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z.class))).bj(y17);
        java.lang.String str = bj6 != null ? bj6.f65916x970b0f9e : null;
        taVar.f(taVar.C, 0);
        taVar.f(taVar.f282976u, 8);
        taVar.f(taVar.f282980y, 8);
        taVar.f(taVar.f282981z, 8);
        taVar.f(taVar.f282972q, 8);
        android.graphics.Bitmap Ai = ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).Ai(str);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = taVar.C;
        if (Ai == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImageGalleryAdapter", "get image fail");
            c21524xecd57b9a.setImageResource(com.p314xaae8f345.mm.R.raw.f78994x211254f4);
            return;
        }
        c21524xecd57b9a.m79195x464b3146(false);
        int width = Ai.getWidth();
        int height = Ai.getHeight();
        c21524xecd57b9a.f279184o = width;
        c21524xecd57b9a.f279185p = height;
        c21524xecd57b9a.setImageBitmap(Ai);
        c21524xecd57b9a.invalidate();
    }

    public int t(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, m11.b0 b0Var) {
        if (f9Var.A0() == 1) {
            if (b0Var.j()) {
                ((j70.e) ((k70.z) i95.n0.c(k70.z.class))).getClass();
                m11.b0 d17 = m11.c0.d(b0Var);
                if (d17 != null && d17.f404166a > 0 && d17.k()) {
                    if (com.p314xaae8f345.mm.vfs.w6.j(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var, bm5.f0.f104095g, d17.f404170e, "", ""))) {
                        return 1;
                    }
                }
            }
            return 0;
        }
        if (b0Var.k() && b0Var.j()) {
            ((j70.e) ((k70.z) i95.n0.c(k70.z.class))).getClass();
            m11.b0 d18 = m11.c0.d(b0Var);
            java.lang.String aj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var, bm5.f0.f104095g, d18.f404170e, "", "");
            if (d18.f404166a > 0 && d18.k() && com.p314xaae8f345.mm.vfs.w6.j(aj6)) {
                return 1;
            }
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b6, code lost:
    
        if (r1.f68101x13f40970 == false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.gb u() {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.u():com.tencent.mm.ui.chatting.gallery.gb");
    }

    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta v() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f282625g;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta k17 = this.f282630o.k(viewOnClickListenerC21748xb3d38e6b.I7());
        if (k17 == null) {
            k17 = this.f282631p.k(viewOnClickListenerC21748xb3d38e6b.I7());
        }
        return k17 == null ? this.f282632q.k(viewOnClickListenerC21748xb3d38e6b.I7()) : k17;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 w() {
        return y(this.f282625g.I7());
    }

    public m11.b0 x(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17) {
        return this.f282630o.w(f9Var, z17);
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 y(int i17) {
        return this.f282626h.b(i17);
    }

    public android.view.View z(int i17) {
        android.view.View e17 = e(i17);
        if (e17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageGalleryAdapter", "position : %s getTPVideoViewByPosition is null", java.lang.Integer.valueOf(i17));
            return null;
        }
        android.view.View findViewById = e17.findViewById(com.p314xaae8f345.mm.R.id.p0_);
        if (findViewById == null || findViewById.getVisibility() == 8) {
            return null;
        }
        return findViewById;
    }
}
