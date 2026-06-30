package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes12.dex */
public class t2 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.e implements k70.w, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.g1 {

    /* renamed from: r, reason: collision with root package name */
    public static boolean f282914r = true;

    /* renamed from: s, reason: collision with root package name */
    public static final long f282915s = (long) (java.lang.Runtime.getRuntime().maxMemory() * 0.05d);

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f282916e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.fb f282917f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f282918g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k3 f282919h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f282920i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f282921m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashMap f282922n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.lb f282923o;

    /* renamed from: p, reason: collision with root package name */
    public long f282924p;

    /* renamed from: q, reason: collision with root package name */
    public int f282925q;

    public t2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var, int[] iArr) {
        super(k1Var);
        this.f282918g = new java.util.HashMap();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k3 k3Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k3(this);
        this.f282919h = k3Var;
        this.f282920i = new java.util.HashMap();
        this.f282921m = new java.util.HashMap();
        this.f282922n = new java.util.HashMap();
        this.f282923o = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.lb();
        this.f282924p = 0L;
        this.f282925q = 0;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21637x6a8468cf c21637x6a8468cf = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21637x6a8468cf(com.p314xaae8f345.mm.ui.p2650x55bb7a46.mc.IMAGE_GALLERY_UI, k1Var.f282625g);
        this.f282916e = c21637x6a8468cf;
        c21637x6a8468cf.mo48813x58998cd();
        java.util.Map l17 = ((jt0.i) com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.j4.f282594a.f282674a).l();
        for (java.lang.String str : l17.keySet()) {
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) l17.get(str);
            if (bitmap != null) {
                ((jt0.i) k3Var.f282666q).put(str, bitmap);
                k3Var.f282667r.push(java.lang.Integer.valueOf(bitmap.hashCode()));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryLazyLoader", "we got one cache from preload : %s %s", str, java.lang.Integer.valueOf(bitmap.hashCode()));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageGalleryLazyLoader", "we got one null cache from preload");
            }
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ua.a().f283031e = this;
    }

    public static android.graphics.Bitmap K(java.lang.String str, int i17, int i18) {
        int i19;
        int i27;
        int i28;
        java.lang.String str2 = str + "_tmp.jpg";
        try {
        } catch (java.lang.Throwable th6) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageGalleryHolderImage", "dkprog tryUseImageOpt failed. file:%s e:%s", str, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(th6));
        }
        if (fp.h.a(16)) {
            return null;
        }
        if (!z65.c.a()) {
            try {
                int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("UseOptImageRecv"), 0);
                kk.v vVar = new kk.v(c01.d9.b().C());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryHolderImage", "fromPathToImgInfo opt:%d uin:(%d,%d) debug:%b sdk:%d", java.lang.Integer.valueOf(P), java.lang.Long.valueOf(vVar.longValue()), java.lang.Long.valueOf(vVar.longValue() / 100), java.lang.Boolean.valueOf(z65.c.a()), java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
                if ((((int) (vVar.longValue() / 100)) % 100) + 1 > P) {
                    return null;
                }
            } catch (java.lang.Exception e17) {
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageGalleryHolderImage", "get useopt :%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                return null;
            }
        }
        com.p314xaae8f345.mm.vfs.w6.u(com.p314xaae8f345.mm.vfs.w6.r(str2));
        com.p314xaae8f345.mm.vfs.w6.c(str, str2);
        boolean m77704x21a6596e = com.p314xaae8f345.mm.sdk.p2603x2137b148.C20996x490c1edf.m77704x21a6596e(str2);
        boolean m77709xef66a801 = com.p314xaae8f345.mm.sdk.p2603x2137b148.C20996x490c1edf.m77709xef66a801(str2);
        boolean a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x1.a(str2);
        int k17 = (int) com.p314xaae8f345.mm.vfs.w6.k(str2);
        if (m77704x21a6596e && m77709xef66a801) {
            r4 = a17 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.C20996x490c1edf.m77707x6317a40f(str2) : null;
            if (r4 != null) {
                i27 = i17;
                i28 = i18;
                i19 = k17;
            } else {
                i19 = 0 - k17;
                i27 = i17;
                i28 = i18;
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.z2.a(str, i28, i27, i19);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryHolderImage", "dkprog tryUseImageOpt jpeg:%b isprog:%b inte:%b len:%d [%d,%d] bm:%s path:%s", java.lang.Boolean.valueOf(m77704x21a6596e), java.lang.Boolean.valueOf(m77709xef66a801), java.lang.Boolean.valueOf(a17), java.lang.Integer.valueOf(k17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), r4, str);
        com.p314xaae8f345.mm.vfs.w6.h(str2);
        return r4;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap r(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t2.r(java.lang.String):android.graphics.Bitmap");
    }

    public static m11.b0 v(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (!com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.L(f9Var) && !com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.K(f9Var)) {
            return null;
        }
        if (f9Var.A0() != 1) {
            long I0 = f9Var.I0();
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            return m11.b1.Di().b2(f9Var.Q0(), I0);
        }
        long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.b0 T1 = m11.b1.Di().T1(f9Var.Q0(), m124847x74d37ac6);
        if (T1 != null && T1.f404166a != 0) {
            return T1;
        }
        long I02 = f9Var.I0();
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        return m11.b1.Di().b2(f9Var.Q0(), I02);
    }

    public static java.lang.String x(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, m11.b0 b0Var, boolean z17) {
        java.lang.String str = null;
        if (f9Var.A0() == 1) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            java.lang.String G2 = m11.b1.Di().G2(f9Var.Q0(), b0Var);
            java.lang.String bj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).bj(f9Var, bm5.c0.f104083a.d(b0Var.j()), G2, "", "", false, false);
            if (com.p314xaae8f345.mm.vfs.w6.j(bj6)) {
                return bj6;
            }
            java.lang.String c17 = m11.c0.c(f9Var, b0Var);
            if (com.p314xaae8f345.mm.vfs.w6.j(c17)) {
                return c17;
            }
            return null;
        }
        if (!z17 && !b0Var.k()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImageGalleryHolderImage", "getImagePath is null because of isTryToGetProgress %s img.isGetCompleted() %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(b0Var.k()));
            return null;
        }
        java.lang.String str2 = b0Var.f404170e;
        if (b0Var.j()) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            java.lang.String G22 = m11.b1.Di().G2(f9Var.Q0(), b0Var);
            if (G22 != null) {
                java.lang.String aj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var, bm5.f0.f104095g, G22, "", "");
                ((rq3.k) ((cc0.l) i95.n0.c(cc0.l.class))).fj(aj6, f9Var.m124847x74d37ac6(), 2);
                if (com.p314xaae8f345.mm.vfs.w6.j(aj6)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryHolderImage", "hasHdImg");
                    str = aj6;
                }
            }
        }
        if (str == null) {
            str = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).bj(f9Var, bm5.f0.f104096h, str2, "", "", true, false);
            ((rq3.k) ((cc0.l) i95.n0.c(cc0.l.class))).fj(str, f9Var.m124847x74d37ac6(), 1);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryHolderImage", "the path : %s", str);
        return str;
    }

    public static java.lang.String z(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, m11.b0 b0Var) {
        if (f9Var != null && b0Var != null) {
            if (f9Var.A0() == 1) {
                java.lang.String str = b0Var.f404172g;
                java.lang.String aj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var, bm5.f0.f104098m, str, "", "");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aj6) && com.p314xaae8f345.mm.vfs.w6.j(aj6)) {
                    return aj6;
                }
                java.lang.String aj7 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var, bm5.f0.f104097i, str, "", "");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aj7) || !com.p314xaae8f345.mm.vfs.w6.j(aj7)) {
                    return null;
                }
                return aj7;
            }
            if (!b0Var.k()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryHolderImage", "get previewPath img not completed");
                return null;
            }
            java.lang.String str2 = b0Var.f404172g;
            java.lang.String aj8 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var, bm5.f0.f104098m, str2, "", "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryHolderImage", "preview fileName: %s, fullPath: %s", str2, aj8);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aj8) && com.p314xaae8f345.mm.vfs.w6.j(aj8)) {
                return aj8;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A(boolean r24, com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a r25, java.lang.String r26, java.lang.String r27, boolean r28, int r29, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r30, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta r31, m11.b0 r32, int r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t2.A(boolean, com.tencent.mm.ui.base.MultiTouchImageView, java.lang.String, java.lang.String, boolean, int, com.tencent.mm.storage.f9, com.tencent.mm.ui.chatting.gallery.ta, m11.b0, int, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean B(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta r22, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r23, int r24, int r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t2.B(com.tencent.mm.ui.chatting.gallery.ta, com.tencent.mm.storage.f9, int, int, boolean):boolean");
    }

    public boolean C(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, m11.b0 b0Var) {
        if (f9Var == null || b0Var == null) {
            return false;
        }
        return ((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).h(b0Var.f404166a, tg3.l1.a(f9Var), 1);
    }

    public void D(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f c21537x5f41189f, java.lang.String str, com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1449xe4cdf536 c1449xe4cdf536) {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        android.graphics.Bitmap d17 = com.p314xaae8f345.mm.p786x600aa8b.e.d(str, options);
        if (d17 != null) {
            d17.recycle();
        }
        c21537x5f41189f.m79320x1a6eb00e(com.p314xaae8f345.mm.sdk.p2603x2137b148.l.a(str));
        int i17 = options.outWidth;
        int i18 = options.outHeight;
        c21537x5f41189f.f149752h = i17;
        c21537x5f41189f.f149753i = i18;
        c21537x5f41189f.i();
        c21537x5f41189f.t(str, c1449xe4cdf536);
    }

    public void E(long j17, java.lang.String str, android.view.View view, java.lang.String str2, android.graphics.Bitmap bitmap) {
        if (bitmap == null || view == null) {
            return;
        }
        int hashCode = view.hashCode();
        int hashCode2 = bitmap.hashCode();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k3 k3Var = this.f282919h;
        int indexOfValue = k3Var.f282668s.indexOfValue(hashCode);
        if (indexOfValue >= 0) {
            k3Var.f282668s.removeAt(indexOfValue);
        }
        k3Var.f282668s.put(hashCode2, hashCode);
        if (view instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) {
            s(j17, str, (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) view, str2, bitmap);
        } else if (view instanceof android.widget.ImageView) {
            ((android.widget.ImageView) view).setImageBitmap(bitmap);
        }
    }

    public void F(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17) {
        this.f282918g.put(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), java.lang.Integer.valueOf(i17));
    }

    public int G(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null) {
            return 0;
        }
        java.util.HashMap hashMap = this.f282918g;
        if (hashMap.containsKey(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()))) {
            return ((java.lang.Integer) hashMap.get(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()))).intValue();
        }
        return 0;
    }

    public final void H(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryHolderImage", "[oreh download_and_save] hdImg end, msgLocalId:%d, %s", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), str);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.k(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, f9Var, z17, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.y2(this, z17));
    }

    public final void I(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar, boolean z17, boolean z18) {
        if (taVar != null) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f c21537x5f41189f = taVar.D;
            if (c21537x5f41189f != null) {
                c21537x5f41189f.setVisibility(z17 ? 0 : 8);
                c21537x5f41189f.m45737x3a5986f(z17);
                if (z17) {
                    taVar.F = true;
                } else {
                    taVar.F = false;
                }
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = taVar.C;
            if (c21524xecd57b9a != null) {
                c21524xecd57b9a.setVisibility(z18 ? 0 : 8);
                if (z18) {
                    taVar.F = false;
                }
            }
        }
    }

    public final boolean J(boolean z17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        taVar.f(taVar.C, 0);
        taVar.f(taVar.f282976u, 8);
        taVar.f(taVar.f282980y, 8);
        taVar.f(taVar.f282981z, 8);
        return A(z17, taVar.C, str, str2, false, taVar.f282958c, f9Var, taVar, null, -1, false);
    }

    @Override // k70.w
    public void f(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, java.lang.String str2, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String str3;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var = this.f282419d;
        if (k1Var == null || k1Var.f282625g == null) {
            return;
        }
        boolean contains = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ua.a().f283030d.contains(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(j18, str));
        java.lang.Object obj2 = obj;
        if (contains) {
            int t17 = t(j18, obj2);
            if (t17 == -1) {
                H(pt0.f0.Li(str, j18), "background", false);
                return;
            }
            obj2 = new java.lang.Integer(t17);
        }
        if (!(obj2 instanceof java.lang.Integer)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageGalleryHolderImage", "param data not integer instance");
            return;
        }
        int intValue = ((java.lang.Integer) obj2).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryHolderImage", "onSceneEnd, pos = " + intValue);
        if (intValue == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageGalleryHolderImage", "onSceneEnd, pos is -1");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(111L, 3L, 1L, true);
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar = this.f282419d.e(intValue) != null ? (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta) this.f282419d.e(intValue).getTag() : null;
        if (i19 != 0 || i27 != 0) {
            if (contains) {
                H(this.f282419d.y(intValue), "hd_failed:" + intValue, intValue == this.f282419d.f282625g.I7());
            }
            if (i27 == -5103059) {
                this.f282918g.put(java.lang.Long.valueOf(j18), 5);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(111L, 0L, 1L, true);
            } else {
                this.f282918g.put(java.lang.Long.valueOf(j18), 6);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(111L, 1L, 1L, true);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageGalleryHolderImage", "onSceneEnd, errType = " + i19 + ", errCode = " + i27);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var2 = this.f282419d;
            if (!k1Var2.U(intValue)) {
                k1Var2.f282630o.m(intValue);
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var3 = this.f282419d;
            if (k1Var3 != null) {
                k1Var3.T(k1Var3.y(intValue), null, i17, cm.b.error);
                return;
            }
            return;
        }
        if (contains) {
            H(this.f282419d.y(intValue), "hd_suc:" + intValue, intValue == this.f282419d.f282625g.I7());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryHolderImage", "pos = " + intValue + ", selectedPos = " + this.f282419d.f282625g.I7(), new java.lang.Object[0]);
        if (!contains) {
            this.f282918g.put(java.lang.Long.valueOf(j18), 4);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 y17 = this.f282419d.y(intValue);
        m11.b0 w17 = w(y17, true);
        if (y17 == null || w17 == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.v2(this, y17));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.fb fbVar = this.f282917f;
        if (fbVar != null) {
            long m124847x74d37ac6 = y17.m124847x74d37ac6();
            java.lang.String Q0 = y17.Q0();
            str3 = "MicroMsg.ImageGalleryHolderImage";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryUI", "onImageDownloaded msgId: %d, currentMsgId: %d, compressType: %d", java.lang.Long.valueOf(m124847x74d37ac6), java.lang.Long.valueOf(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.b7) fbVar).f282348a.D), java.lang.Integer.valueOf(i17));
            ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).mj(java.lang.Long.valueOf(m124847x74d37ac6), Q0);
        } else {
            str3 = "MicroMsg.ImageGalleryHolderImage";
        }
        cm.b bVar = cm.b.ok;
        if (contains) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var4 = this.f282419d;
            if (k1Var4 != null) {
                k1Var4.T(y17, w17, i17, bVar);
                return;
            }
            return;
        }
        if (taVar != null) {
            if (intValue == this.f282419d.f282625g.I7()) {
                if (i17 == 1) {
                    this.f282419d.f282625g.w7();
                } else {
                    taVar.C.post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.w2(this, intValue));
                }
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar2 = taVar;
            if (!A(false, taVar.C, ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).mj(y17, y17.z0(), true), x(y17, w17, true), true, -1, y17, taVar, w17, i17, false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, "failed to show downloaded image!");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(111L, 2L, 1L, true);
                return;
            }
            taVar2.f(taVar2.f282976u, 8);
            taVar2.f(taVar2.f282980y, 8);
            taVar2.f(taVar2.f282981z, 8);
            if (G(y17) == 4) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var5 = this.f282419d;
                if (k1Var5.f282629n) {
                    k1Var5.n(y17);
                    this.f282419d.f282629n = false;
                }
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var6 = this.f282419d;
            if (k1Var6 != null) {
                k1Var6.T(y17, w17, i17, bVar);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.e
    public boolean j(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, boolean z17) {
        boolean z18 = false;
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.K(f9Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryHolderImage", "useMultiLayer, abort filling position : %s", java.lang.Integer.valueOf(i17));
            return false;
        }
        if (taVar != null && f9Var != null && i17 >= 0) {
            int G = G(f9Var);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = taVar.C;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryHolderImage", "filling image : %s position : %s currentState : %s", java.lang.Integer.valueOf(c21524xecd57b9a.hashCode()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(G));
            taVar.f(taVar.f282976u, 8);
            try {
                z18 = B(taVar, f9Var, i17, G, z17);
            } catch (java.lang.NullPointerException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ImageGalleryHolderImage", e17, "", new java.lang.Object[0]);
            }
            c21524xecd57b9a.D = !c01.ia.M(f9Var) ? 1.0f : c01.ia.f118790d;
            if (c21524xecd57b9a.D != 0.0f) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6923x523f4526 c6923x523f4526 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6923x523f4526();
                c6923x523f4526.f142386d = f9Var.I0();
                c6923x523f4526.f142387e = f9Var.mo78013xfb85f7b0();
                c6923x523f4526.f142388f = c01.ia.l(f9Var);
                c6923x523f4526.f142389g = 2L;
                c6923x523f4526.k();
            }
        }
        return z18;
    }

    @Override // k70.w
    public void l(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj) {
        if (!(obj instanceof java.lang.Integer)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageGalleryHolderImage", "param data not integer instance");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryHolderImage", "image task canceled at pos " + ((java.lang.Integer) obj).intValue(), new java.lang.Object[0]);
    }

    public final void n(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, m11.b0 b0Var, boolean z17, boolean z18, int i17) {
        java.lang.String str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryHolderImage", "edw dealDownloading, isHd = " + z17);
        taVar.f(taVar.f282981z, 8);
        if (!z17) {
            taVar.C.setVisibility(0);
        }
        ((j70.e) ((k70.z) i95.n0.c(k70.z.class))).getClass();
        m11.b0 d17 = m11.c0.d(b0Var);
        if (z17 && i17 == this.f282419d.f282625g.I7()) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f282419d.f282625g;
            viewOnClickListenerC21748xb3d38e6b.n8();
            viewOnClickListenerC21748xb3d38e6b.d9(0);
        }
        java.lang.String x17 = z17 ? x(f9Var, b0Var, true) : null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x17)) {
            str = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var, bm5.f0.f104097i, d17.f404172g, "", "");
        } else {
            str = x17;
        }
        java.lang.String mj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).mj(f9Var, f9Var.z0(), true);
        if (z18) {
            J(true, taVar, mj6, str, f9Var);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryHolderImage", "dealDownloading isHd = " + z17);
        if (!z17) {
            int i18 = b0Var.f404169d;
            int max = java.lang.Math.max(1, (int) (i18 != 0 ? ((b0Var.f404168c * 100) / i18) - 1 : 0L));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryHolderImage", "dealDownloading percent = " + max);
            android.widget.ProgressBar progressBar = taVar.f282980y;
            if (max > 50) {
                taVar.a();
                progressBar.setVisibility(8);
            } else {
                taVar.a();
                progressBar.setVisibility(0);
            }
        }
        taVar.a();
        taVar.f282979x.setVisibility(8);
        taVar.a();
        taVar.f282978w.setVisibility(8);
        taVar.a();
        taVar.f282977v.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02a3 A[ADDED_TO_REGION] */
    @Override // k70.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(long r31, long r33, java.lang.String r35, int r36, int r37, java.lang.Object r38, int r39, int r40, com.p314xaae8f345.mm.p944x882e457a.m1 r41) {
        /*
            Method dump skipped, instructions count: 829
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t2.o(long, long, java.lang.String, int, int, java.lang.Object, int, int, com.tencent.mm.modelbase.m1):void");
    }

    public final void p(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar, int i17, int i18) {
        android.graphics.Bitmap r17;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f c21537x5f41189f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryHolderImage", "edw dealFail", new java.lang.Object[0]);
        java.lang.String mj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).mj(f9Var, f9Var.z0(), true);
        taVar.f(taVar.f282980y, 8);
        taVar.f(taVar.f282976u, 8);
        taVar.b();
        taVar.f282981z.setVisibility(0);
        taVar.b();
        taVar.B.setImageResource(com.p314xaae8f345.mm.R.raw.f79077x2e716e0d);
        taVar.b();
        int i19 = (int) (48 * taVar.B.getContext().getResources().getDisplayMetrics().density);
        taVar.b();
        android.view.ViewGroup.LayoutParams layoutParams = taVar.B.getLayoutParams();
        layoutParams.width = i19;
        layoutParams.height = i19;
        taVar.b();
        taVar.B.setLayoutParams(layoutParams);
        if (!com.p314xaae8f345.mm.vfs.w6.j(mj6)) {
            taVar.f(taVar.C, 8);
            taVar.f(taVar.D, 8);
            taVar.b();
            taVar.f282981z.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560153cf);
            taVar.b();
            taVar.A.setText(com.p314xaae8f345.mm.R.C30867xcad56011.g0_);
            taVar.b();
            taVar.B.setColorFilter(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560156ci), android.graphics.PorterDuff.Mode.SRC_IN);
            return;
        }
        taVar.b();
        taVar.f282981z.setBackgroundColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77632xb498d0de));
        taVar.b();
        taVar.A.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77660x7595c307));
        taVar.b();
        taVar.B.setColorFilter(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77660x7595c307), android.graphics.PorterDuff.Mode.SRC_IN);
        if (!taVar.F || (c21537x5f41189f = taVar.D) == null) {
            taVar.f(taVar.C, 0);
            taVar.f(taVar.D, 8);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = taVar.C;
            if (c21524xecd57b9a != null) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mj6) || !com.p314xaae8f345.mm.vfs.w6.j(mj6)) {
                    c21524xecd57b9a.setImageBitmap(null);
                } else {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k3 k3Var = this.f282919h;
                    if (((lt0.f) k3Var.f282666q).k(mj6)) {
                        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jt0.i) k3Var.f282666q).i(mj6);
                        if (!bitmap.isRecycled()) {
                            c21524xecd57b9a.setImageBitmap(bitmap);
                        }
                    }
                    if (this.f282419d.f282640y && (r17 = r(mj6)) != null) {
                        E(0L, "", c21524xecd57b9a, null, r17);
                    } else if (!k3Var.c(c21524xecd57b9a, i17)) {
                        k3Var.b(c21524xecd57b9a, mj6, i17);
                    }
                }
            }
        } else {
            taVar.f(c21537x5f41189f, 0);
            taVar.f(taVar.C, 8);
            D(taVar.D, mj6, null);
        }
        if (tg3.s1.a(f9Var) || i18 == 6 || f9Var.z2()) {
            taVar.b();
            taVar.A.setText(com.p314xaae8f345.mm.R.C30867xcad56011.g0_);
        } else {
            jx3.f.INSTANCE.d(31328, 1, 5000);
            taVar.b();
            taVar.A.setText(com.p314xaae8f345.mm.R.C30867xcad56011.g0_);
        }
    }

    public final boolean q(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, m11.b0 b0Var, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryHolderImage", "edw dealSucc");
        java.lang.String y17 = y(f9Var, b0Var, false);
        taVar.f(taVar.f282980y, 8);
        java.util.HashMap hashMap = this.f282922n;
        java.lang.String str = (java.lang.String) hashMap.get(f9Var);
        if (str == null) {
            str = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).mj(f9Var, f9Var.z0(), true);
            hashMap.put(f9Var, str);
        }
        boolean J2 = J(false, taVar, str, y17, f9Var);
        if (i17 == this.f282419d.f282625g.I7()) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var = this.f282419d;
            if (k1Var.f282629n) {
                k1Var.n(f9Var);
                this.f282419d.f282629n = false;
            }
        }
        return J2;
    }

    public void s(long j17, java.lang.String str, com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a, java.lang.String str2, android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var = this.f282419d;
        if (k1Var == null || k1Var.f282625g == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryHolderImage", "fillBitmap image : %s bmp %s", java.lang.Integer.valueOf(c21524xecd57b9a.hashCode()), java.lang.Integer.valueOf(bitmap.hashCode()));
        c21524xecd57b9a.m79195x464b3146(false);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        c21524xecd57b9a.f279184o = width;
        c21524xecd57b9a.f279185p = height;
        c21524xecd57b9a.setImageBitmap(null);
        c21524xecd57b9a.setImageBitmap(bitmap);
        c21524xecd57b9a.invalidate();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.fb fbVar = this.f282917f;
        if (fbVar != null) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.b7) fbVar).a(j17, str, c21524xecd57b9a, str2, bitmap);
        }
    }

    public int t(long j17, java.lang.Object obj) {
        int intValue;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 y17;
        if ((obj instanceof java.lang.Integer) && (y17 = this.f282419d.y((intValue = ((java.lang.Integer) obj).intValue()))) != null && y17.m124847x74d37ac6() == j17) {
            return intValue;
        }
        java.util.Iterator it = this.f282419d.f310003e.values().iterator();
        while (it.hasNext()) {
            int intValue2 = ((java.lang.Integer) it.next()).intValue();
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 y18 = this.f282419d.y(intValue2);
            if (y18 != null && y18.m124847x74d37ac6() == j17) {
                return intValue2;
            }
        }
        return -1;
    }

    public final boolean u(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, m11.b0 b0Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar, int i17) {
        java.lang.String str;
        java.lang.StringBuilder sb6;
        java.lang.String str2;
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1) ((mv.y) i95.n0.c(mv.y.class))).Ri()) {
            return false;
        }
        b0Var.z(0);
        B(taVar, f9Var, i17, 2, false);
        java.lang.String aj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var, bm5.c0.f104083a.d(b0Var.l()), b0Var.f404170e, "", "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryHolderImage", "getImageFileFromBackupPackage fullPath = " + aj6 + ", hasHdImg = " + b0Var.j() + ", localId = " + b0Var.f404166a);
        boolean j17 = b0Var.j();
        if (j17) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            str = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var, bm5.f0.f104095g, m11.b1.Di().G2(f9Var.Q0(), b0Var), "", "");
        } else {
            str = null;
        }
        if (j17) {
            sb6 = new java.lang.StringBuilder();
            sb6.append(f9Var.I0());
            str2 = "_l";
        } else {
            sb6 = new java.lang.StringBuilder();
            sb6.append(f9Var.I0());
            str2 = "_m";
        }
        sb6.append(str2);
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryHolderImage", "getImageFileFromBackupPackage fullpath=%s, hdFullPath=%s, mediaId=%s", aj6, str, sb7);
        long k17 = com.p314xaae8f345.mm.vfs.w6.k(aj6);
        if (k17 > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryHolderImage", "getImageFileFromBackupPackage fullFileLen=%s", java.lang.Long.valueOf(k17));
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.r rVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.r(f9Var, aj6, sb7, 2);
        java.lang.String talker = f9Var.Q0();
        long I0 = f9Var.I0();
        long mo78012x3fdd41df = f9Var.mo78012x3fdd41df();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.C21798x679ece3 c21798x679ece3 = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.C21798x679ece3(this, b0Var, taVar, f9Var, i17);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.lb lbVar = this.f282923o;
        lbVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3325xe03a0797.p3326xc267989b.l.d(lbVar.f282717a, null, null, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.kb(talker, I0, mo78012x3fdd41df, sb7, c21798x679ece3, rVar, null), 3, null);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m11.b0 w(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r9, boolean r10) {
        /*
            r8 = this;
            boolean r0 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.L(r9)
            r1 = 0
            if (r0 != 0) goto Le
            boolean r0 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.K(r9)
            if (r0 != 0) goto Le
            return r1
        Le:
            com.tencent.mm.ui.chatting.gallery.k1 r0 = r8.f282419d
            if (r0 == 0) goto Lda
            com.tencent.mm.ui.chatting.gallery.d2 r0 = r0.f282626h
            if (r0 != 0) goto L18
            goto Lda
        L18:
            r2 = 0
            r0 = 1
            if (r10 != 0) goto L57
            int r10 = r9.A0()
            if (r10 != r0) goto L38
            com.tencent.mm.ui.chatting.gallery.k1 r10 = r8.f282419d
            com.tencent.mm.ui.chatting.gallery.d2 r10 = r10.f282626h
            java.util.HashMap r10 = r10.f282395m
            long r4 = r9.m124847x74d37ac6()
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            java.lang.Object r10 = r10.get(r1)
            r1 = r10
            m11.b0 r1 = (m11.b0) r1
        L38:
            if (r1 != 0) goto L57
            long r4 = r9.I0()
            int r10 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r10 <= 0) goto L57
            com.tencent.mm.ui.chatting.gallery.k1 r10 = r8.f282419d
            com.tencent.mm.ui.chatting.gallery.d2 r10 = r10.f282626h
            java.util.HashMap r10 = r10.f282394l
            long r4 = r9.I0()
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            java.lang.Object r10 = r10.get(r1)
            r1 = r10
            m11.b0 r1 = (m11.b0) r1
        L57:
            if (r1 != 0) goto Ld9
            int r10 = r9.A0()
            java.lang.Class<k70.y> r1 = k70.y.class
            if (r10 != r0) goto La4
            long r4 = r9.m124847x74d37ac6()
            i95.m r10 = i95.n0.c(r1)
            k70.y r10 = (k70.y) r10
            j70.e r10 = (j70.e) r10
            r10.getClass()
            m11.l0 r10 = m11.b1.Di()
            java.lang.String r6 = r9.Q0()
            m11.b0 r10 = r10.T1(r6, r4)
            if (r10 == 0) goto L88
            long r6 = r10.f404166a
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 != 0) goto L85
            goto L88
        L85:
            r0 = 0
            r1 = r10
            goto Lc0
        L88:
            long r4 = r9.I0()
            i95.m r10 = i95.n0.c(r1)
            k70.y r10 = (k70.y) r10
            j70.e r10 = (j70.e) r10
            r10.getClass()
            m11.l0 r10 = m11.b1.Di()
            java.lang.String r9 = r9.Q0()
            m11.b0 r9 = r10.b2(r9, r4)
            goto Lbf
        La4:
            long r4 = r9.I0()
            i95.m r10 = i95.n0.c(r1)
            k70.y r10 = (k70.y) r10
            j70.e r10 = (j70.e) r10
            r10.getClass()
            m11.l0 r10 = m11.b1.Di()
            java.lang.String r9 = r9.Q0()
            m11.b0 r9 = r10.b2(r9, r4)
        Lbf:
            r1 = r9
        Lc0:
            com.tencent.mm.ui.chatting.gallery.k1 r9 = r8.f282419d
            com.tencent.mm.ui.chatting.gallery.d2 r9 = r9.f282626h
            if (r0 == 0) goto Ld0
            java.util.HashMap r9 = r9.f282394l
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            r9.put(r10, r1)
            goto Ld9
        Ld0:
            java.util.HashMap r9 = r9.f282395m
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            r9.put(r10, r1)
        Ld9:
            return r1
        Lda:
            java.lang.String r9 = "MicroMsg.ImageGalleryHolderImage"
            java.lang.String r10 = "adapter is null!!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r9, r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t2.w(com.tencent.mm.storage.f9, boolean):m11.b0");
    }

    public java.lang.String y(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, m11.b0 b0Var, boolean z17) {
        java.util.HashMap hashMap = this.f282921m;
        java.lang.String str = (java.lang.String) hashMap.get(f9Var);
        if (str == null) {
            str = x(f9Var, b0Var, z17);
            if (str == null || str.length() == 0) {
                return null;
            }
            hashMap.put(f9Var, str);
        }
        return str;
    }
}
