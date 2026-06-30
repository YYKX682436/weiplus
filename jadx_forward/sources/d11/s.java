package d11;

@j95.b
/* loaded from: classes10.dex */
public class s extends i95.w {

    /* renamed from: x, reason: collision with root package name */
    public static final int f307203x = d61.c.d("dscp");

    /* renamed from: y, reason: collision with root package name */
    public static final int f307204y = d61.c.d("cprt");

    /* renamed from: f, reason: collision with root package name */
    public d61.b f307207f;

    /* renamed from: g, reason: collision with root package name */
    public d11.v[] f307208g;

    /* renamed from: h, reason: collision with root package name */
    public d11.v[] f307209h;

    /* renamed from: i, reason: collision with root package name */
    public d11.v[] f307210i;

    /* renamed from: m, reason: collision with root package name */
    public d11.v[] f307211m;

    /* renamed from: n, reason: collision with root package name */
    public d11.v[] f307212n;

    /* renamed from: o, reason: collision with root package name */
    public d11.v[] f307213o;

    /* renamed from: p, reason: collision with root package name */
    public d11.v[] f307214p;

    /* renamed from: q, reason: collision with root package name */
    public d11.v[] f307215q;

    /* renamed from: r, reason: collision with root package name */
    public d11.v[] f307216r;

    /* renamed from: s, reason: collision with root package name */
    public d11.v[] f307217s;

    /* renamed from: t, reason: collision with root package name */
    public d11.v[] f307218t;

    /* renamed from: u, reason: collision with root package name */
    public d11.v[] f307219u;

    /* renamed from: v, reason: collision with root package name */
    public d11.v[] f307220v;

    /* renamed from: w, reason: collision with root package name */
    public d11.v[] f307221w;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f307206e = null;

    /* renamed from: d, reason: collision with root package name */
    public final d11.a f307205d = new d11.a();

    public static boolean Ai() {
        if (!android.os.Build.BRAND.equalsIgnoreCase("meizu")) {
            return true;
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VIDEO_NEED_RESET_EXTRACTOR_BOOLEAN, java.lang.Boolean.TRUE);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x005f, code lost:
    
        if ((r0 & 16) != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x006e, code lost:
    
        if ((r0 & 1) != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0073, code lost:
    
        if ((r0 & 4) != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0078, code lost:
    
        if ((r0 & 2) != 0) goto L11;
     */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean Di(int r11) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d11.s.Di(int):boolean");
    }

    public static d11.s fj() {
        return (d11.s) i95.n0.c(d11.s.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (t21.u2.b(r0) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int wi(int r21, t21.v2 r22, boolean r23) {
        /*
            r0 = r21
            r1 = 2
            r2 = 1
            if (r0 == 0) goto Lb
            if (r0 == r2) goto Lb
            if (r0 == r1) goto Lb
            goto L3a
        Lb:
            boolean r0 = Di(r2)
            if (r0 != 0) goto L12
            goto L3a
        L12:
            if (r23 == 0) goto L15
            goto L39
        L15:
            java.lang.Class<tg3.u0> r0 = tg3.u0.class
            i95.m r0 = i95.n0.c(r0)
            tg3.u0 r0 = (tg3.u0) r0
            bm5.f0 r3 = bm5.f0.f104104s
            java.lang.String r4 = r22.d()
            k90.b r0 = (k90.b) r0
            r5 = 0
            r6 = 0
            java.lang.String r0 = r0.rj(r5, r3, r4, r6)
            boolean r3 = com.p314xaae8f345.mm.vfs.w6.j(r0)
            if (r3 != 0) goto L32
            goto L39
        L32:
            boolean r0 = t21.u2.b(r0)
            if (r0 != 0) goto L39
            goto L3a
        L39:
            r2 = r1
        L3a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r3 = "MicroMsg.SubCoreVideoControl"
            java.lang.String r4 = "check c2c video format[%d]"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r4, r0)
            if (r2 != r1) goto L58
            com.tencent.mm.plugin.report.service.g0 r5 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE
            r6 = 354(0x162, double:1.75E-321)
            r8 = 130(0x82, double:6.4E-322)
            r10 = 1
            r12 = 0
            r5.mo68477x336bdfd8(r6, r8, r10, r12)
            goto L65
        L58:
            com.tencent.mm.plugin.report.service.g0 r13 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE
            r14 = 354(0x162, double:1.75E-321)
            r16 = 131(0x83, double:6.47E-322)
            r18 = 1
            r20 = 0
            r13.mo68477x336bdfd8(r14, r16, r18, r20)
        L65:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: d11.s.wi(int, t21.v2, boolean):int");
    }

    public int Bi(com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d) {
        if (c11120x15dce88d == null) {
            return 0;
        }
        int i17 = c11120x15dce88d.f152728h;
        if (i17 != 10) {
            return i17;
        }
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
    
        if (r10 == null) goto L31;
     */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0085: MOVE (r4 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:50:0x0085 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Ni(java.lang.String r19) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            java.lang.String r3 = "MicroMsg.SubCoreVideoControl"
            d61.b r0 = r1.f307207f
            if (r0 != 0) goto L11
            d61.b r0 = new d61.b
            r0.<init>()
            r1.f307207f = r0
        L11:
            d61.b r0 = r1.f307207f
            r4 = -1
            r0.f308245b = r4
            r4 = 0
            r0.f308246c = r4
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            long r5 = android.os.SystemClock.elapsedRealtime()
            d61.b r0 = r1.f307207f
            long r7 = r0.a(r2)
            r9 = 0
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            r9 = 0
            if (r0 > 0) goto L2e
            return r9
        L2e:
            com.tencent.mm.vfs.z7 r0 = com.p314xaae8f345.mm.vfs.z7.a(r19)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            java.io.RandomAccessFile r10 = com.p314xaae8f345.mm.vfs.w6.A(r0, r9)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            r10.seek(r7)     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L84
            r0 = 8
            byte[] r11 = new byte[r0]     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L84
            int r12 = d61.a.f308239v     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L84
            d61.a r12 = d61.c.b(r10, r11, r12)     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L84
            r13 = r4
        L44:
            if (r12 == 0) goto L63
            int r13 = d11.s.f307203x     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L84
            d61.a r13 = d61.c.b(r10, r11, r13)     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L84
            if (r13 == 0) goto L4f
            goto L63
        L4f:
            long r14 = r12.f308243d     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L84
            long r16 = r12.a()     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L84
            long r14 = r14 + r16
            r10.seek(r14)     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L84
            int r12 = d61.a.f308239v     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L84
            d61.a r12 = d61.c.b(r10, r11, r12)     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L84
            goto L44
        L61:
            r0 = move-exception
            goto L8b
        L63:
            if (r13 == 0) goto L9e
            long r11 = r13.a()     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L84
            int r11 = (int) r11     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L84
            int r11 = r11 - r0
            byte[] r0 = new byte[r11]     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L84
            long r11 = r13.f308243d     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L84
            r13 = 8
            long r11 = r11 + r13
            r10.seek(r11)     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L84
            int r11 = r10.read(r0)     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L84
            if (r11 <= 0) goto L9e
            java.lang.String r11 = new java.lang.String     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L84
            java.lang.String r12 = "UTF-8"
            r11.<init>(r0, r12)     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L84
            r4 = r11
            goto L9e
        L84:
            r0 = move-exception
            r4 = r10
            goto Lc5
        L87:
            r0 = move-exception
            goto Lc5
        L89:
            r0 = move-exception
            r10 = r4
        L8b:
            java.lang.String r11 = "check is wx meta error %s %s"
            r12 = 2
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> L84
            r12[r9] = r2     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L84
            r13 = 1
            r12[r13] = r0     // Catch: java.lang.Throwable -> L84
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r11, r12)     // Catch: java.lang.Throwable -> L84
            if (r10 == 0) goto La1
        L9e:
            r10.close()     // Catch: java.io.IOException -> La1
        La1:
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            long r7 = android.os.SystemClock.elapsedRealtime()
            long r7 = r7 - r5
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r0, r5, r2}
            java.lang.String r2 = "check is wx meta dscp %s moov %d cost %d %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r2, r0)
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r4)
            if (r0 != 0) goto Lc4
            java.lang.String r0 = "WXVer"
            boolean r0 = r4.contains(r0)
            return r0
        Lc4:
            return r9
        Lc5:
            if (r4 == 0) goto Lca
            r4.close()     // Catch: java.io.IOException -> Lca
        Lca:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d11.s.Ni(java.lang.String):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e7, code lost:
    
        if (r5 == null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Ri(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d11.s.Ri(java.lang.String):boolean");
    }

    public final com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d Ui(int i17) {
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = new com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d();
        c11120x15dce88d.f152736s = true;
        c11120x15dce88d.f152730m = 1;
        c11120x15dce88d.f152731n = 48000;
        c11120x15dce88d.f152734q = 2;
        c11120x15dce88d.f152735r = 1;
        c11120x15dce88d.f152733p = 1;
        if (i17 <= 120) {
            c11120x15dce88d.f152726f = 30;
            c11120x15dce88d.f152724d = com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48866x28b7342c;
            c11120x15dce88d.f152725e = com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761;
            c11120x15dce88d.f152727g = 1200000;
        } else {
            c11120x15dce88d.f152726f = 24;
            c11120x15dce88d.f152724d = com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
            c11120x15dce88d.f152725e = 640;
            c11120x15dce88d.f152727g = 544000;
        }
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2534xf84d0b50.C20231xeb62f279()) == 1) {
            c11120x15dce88d.f152726f = 30;
            c11120x15dce88d.f152724d = com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48866x28b7342c;
            c11120x15dce88d.f152725e = com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761;
            c11120x15dce88d.f152727g = 1200000;
        }
        return c11120x15dce88d;
    }

    public final com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d Vi() {
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = new com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d();
        c11120x15dce88d.f152736s = true;
        c11120x15dce88d.f152724d = 1072;
        c11120x15dce88d.f152725e = (int) ((1072 * 3.5f) / 3.0d);
        c11120x15dce88d.f152726f = 30;
        c11120x15dce88d.f152727g = 2000000;
        c11120x15dce88d.f152730m = 1;
        c11120x15dce88d.f152731n = com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48026xbfd28259;
        c11120x15dce88d.f152734q = 2;
        c11120x15dce88d.f152735r = 1;
        c11120x15dce88d.f152733p = 1;
        return c11120x15dce88d;
    }

    public final com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d Zi() {
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = new com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d();
        c11120x15dce88d.f152736s = true;
        c11120x15dce88d.f152724d = com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf;
        c11120x15dce88d.f152725e = 1280;
        c11120x15dce88d.f152726f = 30;
        c11120x15dce88d.f152727g = 2000000;
        c11120x15dce88d.f152730m = 10;
        c11120x15dce88d.f152731n = 64000;
        c11120x15dce88d.f152734q = 2;
        c11120x15dce88d.f152735r = 1;
        c11120x15dce88d.f152733p = 1;
        return c11120x15dce88d;
    }

    public final com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d aj(com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d, int i17) {
        int i18;
        int i19;
        int c17;
        int i27;
        int i28;
        boolean z17;
        boolean z18 = true;
        if (i17 == 2 || i17 == 4 || i17 == 1) {
            c11120x15dce88d.B = 0;
            if (i17 == 1) {
                c11120x15dce88d.f152738u = 1;
                c11120x15dce88d.f152742y = 10;
                c11120x15dce88d.f152743z = 10;
                int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_C2C_HEVC_INT_SYNC, 0);
                if (r17 == 1) {
                    i18 = 0;
                } else if (r17 != 2) {
                    i18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_media_c2c_adaptive_config, 0);
                } else {
                    i18 = 13;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaSoftH265Config", "getC2cAdaptiveConfig:" + i18);
                c11120x15dce88d.P = i18;
                int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_c2ctrans_swroi_switch_android, 0);
                int f17 = rs0.n.f480839d.f();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaSoftH265Config", "WaveVideoModel getC2CROIConfig mainConfig=" + Ni + " gpuScoreThresh=30 gpuScore=" + f17);
                if (Ni <= 0 || f17 >= 30) {
                    ((p05.l2) ((lg0.o) i95.n0.c(lg0.o.class))).Ai(((p05.l2) ((lg0.o) i95.n0.c(lg0.o.class))).wi("roi_c2c_face"), Ni);
                    i19 = Ni;
                } else {
                    i19 = -1;
                }
                c11120x15dce88d.Q = i19;
            } else if (i17 == 2) {
                c11120x15dce88d.f152738u = 1;
                c11120x15dce88d.f152742y = 10;
                c11120x15dce88d.f152743z = 10;
                ((ee0.f4) ((fe0.c4) i95.n0.c(fe0.c4.class))).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("snsVideoAbaPresetSwitch", "com.tencent.mm.feature.sns.SnsConfigService");
                pc4.f fVar = pc4.f.f434968a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsVideoAbaPresetSwitch", "com.tencent.mm.plugin.sns.ui.improve.config.SnsVideoConfig");
                if (fVar.b()) {
                    c17 = j62.e.g().c(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2157xaf3f8342.C17846x4682099f());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoConfig", "getSnsVideoAbaPresetSwitch >> " + c17);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsVideoAbaPresetSwitch", "com.tencent.mm.plugin.sns.ui.improve.config.SnsVideoConfig");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsVideoAbaPresetSwitch", "com.tencent.mm.plugin.sns.ui.improve.config.SnsVideoConfig");
                    c17 = 0;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("snsVideoAbaPresetSwitch", "com.tencent.mm.feature.sns.SnsConfigService");
                c11120x15dce88d.B = c17;
                int r18 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_HEVC_INT_SYNC, 0);
                if (r18 == 1) {
                    i27 = 0;
                } else if (r18 != 2) {
                    i27 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_media_sns_adaptive_config, 0);
                } else {
                    i27 = 12;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaSoftH265Config", "getSnsAdaptiveConfig:" + i27);
                c11120x15dce88d.P = i27;
                int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_wxtrans_swroi_switch_android, 0);
                int Ni3 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_wxtrans_swroi_switch_android_gpuscore_thresh, 100);
                int f18 = rs0.n.f480839d.f();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaSoftH265Config", "WaveVideoModel getSnsROIConfig mainConfig=" + Ni2 + " gpuScoreThresh=" + Ni3 + " gpuScore=" + f18);
                if (Ni2 <= 0 || f18 >= Ni3) {
                    ((p05.l2) ((lg0.o) i95.n0.c(lg0.o.class))).Ai(((p05.l2) ((lg0.o) i95.n0.c(lg0.o.class))).wi("roi_saliencymap"), Ni2);
                    i28 = Ni2;
                } else {
                    i28 = -1;
                }
                c11120x15dce88d.Q = i28;
            } else if (i17 != 4) {
                c11120x15dce88d.f152738u = 0;
                c11120x15dce88d.Q = 0;
            } else {
                c11120x15dce88d.f152738u = 1;
                c11120x15dce88d.f152742y = 25;
                c11120x15dce88d.f152743z = 10;
                c11120x15dce88d.Q = 0;
            }
            c11120x15dce88d.C = 36;
            c11120x15dce88d.f152740w = 0.52f;
            c11120x15dce88d.f152741x = 1.0f;
            c11120x15dce88d.f152739v = 0;
            c11120x15dce88d.A = 0;
            c11120x15dce88d.D = 0;
            c11120x15dce88d.E = 51;
            c11120x15dce88d.F = c11120x15dce88d.f152727g;
            c11120x15dce88d.G = i17;
            int a17 = wo.r.a() & 255;
            if (a17 < 30 || android.os.Build.VERSION.SDK_INT <= 25) {
                c11120x15dce88d.f152738u = 0;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreVideoControl", "ABA: Prams abaSwitch: [%d]  qpSwitch: [%d] swHevcRatio: [%f] hwHevcRatio: [%f] ceilingVideoBR: [%d] flooringVideoBR:[%d] minQP: [%d] maxQP: [%d] CPUlevel: [%d] AndroidVersionSDK: [%d] remuxSecene: [%d] isEnable1080p: [%d] maxVideoSize: [%d]", java.lang.Integer.valueOf(c11120x15dce88d.f152738u), java.lang.Integer.valueOf(c11120x15dce88d.f152739v), java.lang.Float.valueOf(c11120x15dce88d.f152740w), java.lang.Float.valueOf(c11120x15dce88d.f152741x), java.lang.Integer.valueOf(c11120x15dce88d.f152742y), java.lang.Integer.valueOf(c11120x15dce88d.f152743z), java.lang.Integer.valueOf(c11120x15dce88d.D), java.lang.Integer.valueOf(c11120x15dce88d.E), java.lang.Integer.valueOf(a17), java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT), java.lang.Integer.valueOf(c11120x15dce88d.G), java.lang.Integer.valueOf(c11120x15dce88d.B), java.lang.Integer.valueOf(c11120x15dce88d.C));
        } else {
            c11120x15dce88d.f152738u = 0;
            c11120x15dce88d.f152739v = 0;
            c11120x15dce88d.F = c11120x15dce88d.f152727g;
            c11120x15dce88d.D = 0;
            c11120x15dce88d.E = 51;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreVideoControl", "ABA: it does not use the ABA or MinMax QP Limitation");
            c11120x15dce88d.Q = 0;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("HardcoderQP");
        if (M != null) {
            java.lang.String u17 = M.u("HCMinQPKey", null);
            java.lang.String u18 = M.u("HCMaxQPKey", null);
            if (u17 != null && u18 != null) {
                int i29 = wo.v1.f529362i.A;
                if (i29 == 0) {
                    z17 = true;
                    z18 = false;
                } else if (i17 <= 0 || i17 > 3 || i29 <= 0 || ((1 << (i17 - 1)) & i29) == 0) {
                    z18 = false;
                    z17 = false;
                } else {
                    z17 = false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreVideoControl", "steve:[hardcoder] get hardcoder QP key: min:%s, max:%s, forceHWQP:%s, qpSwitch:%s, deviceQPCfg:%s, forceHWQPOff:%s", u17, u18, java.lang.Boolean.valueOf(z18), 0, java.lang.Integer.valueOf(i29), java.lang.Boolean.valueOf(z17));
                if (!z17 && z18) {
                    int max = java.lang.Math.max(0, java.lang.Math.min(51, 21));
                    int max2 = java.lang.Math.max(0, java.lang.Math.min(51, 39));
                    if (max != 0 && max2 != 51) {
                        c11120x15dce88d.D = max;
                        c11120x15dce88d.E = max2;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreVideoControl", "steve:[hardcoder] get hardcoder QP key: min:%s, max:%s, value: minQP:%d, maxQP:%d, Scence:%d", u17, u18, java.lang.Integer.valueOf(max), java.lang.Integer.valueOf(max2), java.lang.Integer.valueOf(i17));
                    }
                }
            }
        }
        return c11120x15dce88d;
    }

    public com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d bj(com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d, java.lang.String str) {
        d11.v[] uj6;
        int b17;
        boolean z17;
        if (c11120x15dce88d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreVideoControl", "get c2c album video para but original video para is null.");
            return null;
        }
        if (c11120x15dce88d.f152728h >= ip.a.f375077a.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SubCoreVideoControl", "this video duration is large than %s s", 300);
            return null;
        }
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d Ui = Ui(c11120x15dce88d.f152728h);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            if (this.f307220v == null) {
                this.f307220v = tj("C2CAlbumVideoStepConfig");
            }
            uj6 = this.f307220v;
        } else {
            uj6 = uj(str);
        }
        d11.a aVar = this.f307205d;
        if (uj6 != null) {
            int i17 = 0;
            while (true) {
                if (i17 >= uj6.length) {
                    z17 = true;
                    b17 = 0;
                    break;
                }
                d11.v vVar = uj6[i17];
                if (vVar != null && vVar.c()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreVideoControl", "it busy time, try to calc c2c album config.");
                    b17 = aVar.b(vVar.f307232g, c11120x15dce88d, Ui);
                    z17 = vVar.f307231f;
                    break;
                }
                i17++;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreVideoControl", "it not busy time, try to calc c2c album default config.");
            b17 = aVar.b(null, c11120x15dce88d, Ui);
            z17 = true;
        }
        if (b17 <= 0) {
            Ui = Ui(c11120x15dce88d.f152728h);
        } else {
            Ui.f152736s = false;
        }
        aj(Ui, 1);
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(422L, 2L, 1L, false);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(422L, 1L, 1L, false);
        }
        int q17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) jx3.f.y(Ui.f152727g / 1000, new int[]{com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50633xede5713a, 544, 800, 1200, 1600}, 3, 8));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(422L, q17, 1L, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreVideoControl", "get c2c album para cost %d rpt %d. bitrate %d new para %s, original para %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), java.lang.Integer.valueOf(q17), java.lang.Integer.valueOf(b17), Ui, c11120x15dce88d);
        return Ui;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d cj() {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d11.s.cj():com.tencent.mm.modelcontrol.VideoTransPara");
    }

    public com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d hj() {
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d;
        int i17;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (this.f307217s == null) {
            this.f307217s = tj("FinderPublishVideoConfig");
        }
        if (this.f307217s != null) {
            int i18 = 0;
            while (true) {
                d11.v[] vVarArr = this.f307217s;
                if (i18 >= vVarArr.length) {
                    break;
                }
                d11.v vVar = vVarArr[i18];
                if (vVar != null && vVar.c()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreVideoControl", "it busy time, try to get story Record config.");
                    c11120x15dce88d = vVar.a(0);
                    break;
                }
                i18++;
            }
        }
        c11120x15dce88d = null;
        if (c11120x15dce88d == null) {
            c11120x15dce88d = Vi();
        }
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1 && (i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("finder_config_sp_key", 0).getInt("SWITCH_POST_VIDEO_RATE", -1)) > 0) {
            c11120x15dce88d.f152727g = i17;
        }
        c11120x15dce88d.f152732o = 44100;
        c11120x15dce88d.f152737t = com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48866x28b7342c;
        aj(c11120x15dce88d, 4);
        c11120x15dce88d.f152728h = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ultron_album_video_max_duration_android, 60);
        c11120x15dce88d.f152729i = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ultron_album_video_min_duration_android, 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreVideoControl", "get finder record para cost %d. %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), c11120x15dce88d);
        return c11120x15dce88d;
    }

    public com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d ij() {
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d;
        int i17;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (this.f307216r == null) {
            this.f307216r = tj("FinderRecordVideoConfig");
        }
        if (this.f307216r != null) {
            int i18 = 0;
            while (true) {
                d11.v[] vVarArr = this.f307216r;
                if (i18 >= vVarArr.length) {
                    break;
                }
                d11.v vVar = vVarArr[i18];
                if (vVar != null && vVar.c()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreVideoControl", "it busy time, try to get story Record config.");
                    c11120x15dce88d = vVar.a(0);
                    break;
                }
                i18++;
            }
        }
        c11120x15dce88d = null;
        if (c11120x15dce88d == null) {
            c11120x15dce88d = Vi();
        }
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1 && (i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("finder_config_sp_key", 0).getInt("SWITCH_POST_VIDEO_RATE", -1)) > 0) {
            c11120x15dce88d.f152727g = i17;
        }
        c11120x15dce88d.f152732o = 44100;
        c11120x15dce88d.f152737t = com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48866x28b7342c;
        aj(c11120x15dce88d, 4);
        c11120x15dce88d.f152728h = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ultron_record_video_max_duration_android, 60);
        c11120x15dce88d.f152729i = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ultron_record_video_min_duration_android, 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreVideoControl", "get finder record para cost %d. %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), c11120x15dce88d);
        return c11120x15dce88d;
    }

    public com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d mj(int i17) {
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d;
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d2;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (this.f307219u == null) {
            if (i17 == 1) {
                this.f307219u = tj("GameRecordBigVideoConfig");
            } else {
                this.f307219u = tj("GameRecordVideoConfig");
            }
        }
        if (this.f307219u != null) {
            int i18 = 0;
            while (true) {
                d11.v[] vVarArr = this.f307219u;
                if (i18 >= vVarArr.length) {
                    break;
                }
                d11.v vVar = vVarArr[i18];
                if (vVar != null && vVar.c()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreVideoControl", "it busy time, try to get game Record config.");
                    c11120x15dce88d = vVar.b(0);
                    break;
                }
                i18++;
            }
        }
        c11120x15dce88d = null;
        if (c11120x15dce88d == null) {
            if (i17 == 1) {
                c11120x15dce88d2 = new com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d();
                c11120x15dce88d2.f152736s = true;
                c11120x15dce88d2.f152724d = 1080;
                c11120x15dce88d2.f152725e = 1920;
                c11120x15dce88d2.f152726f = 30;
                c11120x15dce88d2.f152727g = 3500000;
                c11120x15dce88d2.f152730m = 10;
                c11120x15dce88d2.f152731n = 48000;
                c11120x15dce88d2.f152734q = 2;
                c11120x15dce88d2.f152735r = 1;
                c11120x15dce88d2.f152728h = 60;
                c11120x15dce88d2.f152733p = 1;
            } else {
                c11120x15dce88d2 = new com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d();
                c11120x15dce88d2.f152736s = true;
                c11120x15dce88d2.f152724d = 1080;
                c11120x15dce88d2.f152725e = 1920;
                c11120x15dce88d2.f152726f = 30;
                c11120x15dce88d2.f152727g = 3500000;
                c11120x15dce88d2.f152730m = 10;
                c11120x15dce88d2.f152731n = 48000;
                c11120x15dce88d2.f152734q = 2;
                c11120x15dce88d2.f152735r = 1;
                c11120x15dce88d2.f152728h = 60;
                c11120x15dce88d2.f152733p = 1;
            }
            c11120x15dce88d = c11120x15dce88d2;
        }
        c11120x15dce88d.f152732o = 44100;
        c11120x15dce88d.f152730m = 10;
        c11120x15dce88d.f152737t = 288;
        aj(c11120x15dce88d, 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreVideoControl", "get game record para cost %d. %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), c11120x15dce88d);
        return c11120x15dce88d;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d nj() {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d11.s.nj():com.tencent.mm.modelcontrol.VideoTransPara");
    }

    public final int oj(e42.b0 b0Var, int i17) {
        ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("is5minVideoOpen", "com.tencent.mm.feature.sns.SnsFeatureService");
        boolean v17 = pc4.d.f434943a.v(true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("is5minVideoOpen", "com.tencent.mm.feature.sns.SnsFeatureService");
        if (v17) {
            return 300;
        }
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(b0Var, i17);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        this.f307208g = null;
        this.f307220v = null;
        this.f307209h = null;
        this.f307213o = null;
    }

    public com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d pj() {
        boolean z17;
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (this.f307209h == null) {
            this.f307209h = tj("SnsRecordVideoConfig");
        }
        if (this.f307209h != null) {
            int i17 = 0;
            while (true) {
                d11.v[] vVarArr = this.f307209h;
                if (i17 >= vVarArr.length) {
                    break;
                }
                d11.v vVar = vVarArr[i17];
                if (vVar != null && vVar.c()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreVideoControl", "it busy time, try to get sns Record config.");
                    c11120x15dce88d = vVar.b(0);
                    z17 = vVar.f307231f;
                    break;
                }
                i17++;
            }
        }
        z17 = true;
        c11120x15dce88d = null;
        if (c11120x15dce88d == null) {
            c11120x15dce88d = Zi();
        }
        c11120x15dce88d.f152732o = 44100;
        c11120x15dce88d.f152730m = 10;
        c11120x15dce88d.f152737t = 288;
        c11120x15dce88d.f152728h = oj(e42.d0.clicfg_sns_record_sight_max_timelength, 60);
        aj(c11120x15dce88d, 2);
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(422L, 32L, 1L, false);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(422L, 31L, 1L, false);
        }
        int q17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) jx3.f.y(c11120x15dce88d.f152727g / 1000, new int[]{com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50633xede5713a, 544, 800, 1200, 1600}, 33, 38));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(422L, q17, 1L, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreVideoControl", "get sns record para cost %d. %s rpt %d", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), c11120x15dce88d, java.lang.Integer.valueOf(q17));
        return c11120x15dce88d;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d qj() {
        /*
            r23 = this;
            r0 = r23
            java.lang.String r1 = "getSnsTemplateVideoPara"
            java.lang.String r2 = "MicroMsg.SubCoreVideoControl"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1)
            java.lang.Class<e42.e0> r1 = e42.e0.class
            i95.m r1 = i95.n0.c(r1)
            e42.e0 r1 = (e42.e0) r1
            e42.d0 r3 = e42.d0.clicfg_sns_video_control_immediate_effect
            h62.d r1 = (h62.d) r1
            r4 = 1
            boolean r1 = r1.fj(r3, r4)
            long r5 = android.os.SystemClock.elapsedRealtime()
            d11.v[] r3 = r0.f307210i
            if (r3 == 0) goto L24
            if (r1 == 0) goto L2c
        L24:
            java.lang.String r1 = "SnsVideoTemplateVideoConfig"
            d11.v[] r1 = r0.tj(r1)
            r0.f307210i = r1
        L2c:
            d11.v[] r1 = r0.f307210i
            if (r1 == 0) goto L50
            r1 = 0
            r3 = r1
        L32:
            d11.v[] r7 = r0.f307210i
            int r8 = r7.length
            if (r3 >= r8) goto L50
            r7 = r7[r3]
            if (r7 == 0) goto L4d
            boolean r8 = r7.c()
            if (r8 == 0) goto L4d
            java.lang.String r3 = "it busy time, try to get sns Record config."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r3)
            com.tencent.mm.modelcontrol.VideoTransPara r1 = r7.b(r1)
            boolean r4 = r7.f307231f
            goto L51
        L4d:
            int r3 = r3 + 1
            goto L32
        L50:
            r1 = 0
        L51:
            if (r1 != 0) goto L57
            com.tencent.mm.modelcontrol.VideoTransPara r1 = r23.Zi()
        L57:
            r3 = 44100(0xac44, float:6.1797E-41)
            r1.f152732o = r3
            r3 = 10
            r1.f152730m = r3
            r3 = 288(0x120, float:4.04E-43)
            r1.f152737t = r3
            e42.d0 r3 = e42.d0.clicfg_sns_maas_export_max_duration
            r7 = 300(0x12c, float:4.2E-43)
            int r3 = r0.oj(r3, r7)
            r1.f152728h = r3
            r3 = 2
            r0.aj(r1, r3)
            if (r4 != 0) goto L81
            com.tencent.mm.plugin.report.service.g0 r7 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE
            r8 = 422(0x1a6, double:2.085E-321)
            r10 = 31
            r12 = 1
            r14 = 0
            r7.mo68477x336bdfd8(r8, r10, r12, r14)
            goto L8e
        L81:
            com.tencent.mm.plugin.report.service.g0 r15 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE
            r16 = 422(0x1a6, double:2.085E-321)
            r18 = 32
            r20 = 1
            r22 = 0
            r15.mo68477x336bdfd8(r16, r18, r20, r22)
        L8e:
            int r3 = r1.f152727g
            int r3 = r3 / 1000
            r4 = 1200(0x4b0, float:1.682E-42)
            r7 = 1600(0x640, float:2.242E-42)
            r8 = 350(0x15e, float:4.9E-43)
            r9 = 544(0x220, float:7.62E-43)
            r10 = 800(0x320, float:1.121E-42)
            int[] r4 = new int[]{r8, r9, r10, r4, r7}
            r7 = 33
            r8 = 38
            java.lang.Object r3 = jx3.f.y(r3, r4, r7, r8)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1(r3)
            com.tencent.mm.plugin.report.service.g0 r7 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE
            r8 = 422(0x1a6, double:2.085E-321)
            long r10 = (long) r3
            r12 = 1
            r14 = 0
            r7.mo68477x336bdfd8(r8, r10, r12, r14)
            long r7 = android.os.SystemClock.elapsedRealtime()
            long r7 = r7 - r5
            java.lang.Long r4 = java.lang.Long.valueOf(r7)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r4, r1, r3}
            java.lang.String r4 = "get sns template para cost %d. %s rpt %d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r4, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d11.s.qj():com.tencent.mm.modelcontrol.VideoTransPara");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d rj() {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d11.s.rj():com.tencent.mm.modelcontrol.VideoTransPara");
    }

    public byte[] sj() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(this.f307206e)) {
            try {
                java.lang.String str = "{\"WXVer\":" + o45.wf.f424562g + "}";
                this.f307206e = str.getBytes(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreVideoControl", "get weixin video meta %s", str);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreVideoControl", "get weixin meta error %s ", e17.toString());
            }
        }
        return this.f307206e;
    }

    public final d11.v[] tj(java.lang.String str) {
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d(str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreVideoControl", "key %s config is null", str);
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreVideoControl", "%s=%s ", str, d17);
        return uj(d17);
    }

    public final d11.v[] uj(java.lang.String str) {
        if (!str.startsWith("[")) {
            str = "[".concat(str);
        }
        if (!str.endsWith("]")) {
            str = str.concat("]");
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            int length = jSONArray.length();
            d11.v[] vVarArr = new d11.v[length];
            for (int i17 = 0; i17 < length; i17++) {
                vVarArr[i17] = vj(jSONArray.getJSONObject(i17));
            }
            return vVarArr;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreVideoControl", "parse Configs error : " + e17.toString());
            return null;
        }
    }

    public final d11.v vj(org.json.JSONObject jSONObject) {
        org.json.JSONArray jSONArray;
        java.lang.String str;
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f;
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2;
        java.lang.String str2;
        java.lang.String str3 = "dura";
        d11.v vVar = new d11.v();
        try {
            java.lang.String str4 = "";
            java.lang.String string = jSONObject.isNull("time") ? "" : jSONObject.getString("time");
            java.lang.String string2 = jSONObject.getString("abr");
            java.lang.String string3 = jSONObject.getString("intval");
            java.lang.String string4 = jSONObject.getString("prof");
            java.lang.String string5 = jSONObject.getString("preset");
            java.lang.String string6 = jSONObject.isNull("stepbr") ? "0" : jSONObject.getString("stepbr");
            int i17 = jSONObject.has("codec") ? jSONObject.getInt("codec") : -1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreVideoControl", "busy time %s audio bitrate %s iframe %s profile %s preset %s stepbr %s codec %d", string, string2, string3, string4, string5, string6, java.lang.Integer.valueOf(i17));
            vVar.f307226a = string;
            int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(string2, 0);
            vVar.f307227b = P;
            vVar.f307227b = P == 0 ? 64000 : P * 1000;
            vVar.f307228c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(string3, 10);
            vVar.f307229d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(string4, 2);
            vVar.f307230e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(string5, 1);
            vVar.f307231f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(string6, 0) >= 1;
            vVar.f307233h = i17;
            org.json.JSONArray jSONArray2 = jSONObject.getJSONArray("conf");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f3 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f4 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f5 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f6 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f7 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f8 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            int length = jSONArray2.length();
            int i18 = 0;
            while (i18 < length) {
                org.json.JSONObject jSONObject2 = jSONArray2.getJSONObject(i18);
                if (wj(!jSONObject2.isNull(str3) ? jSONObject2.getString(str3) : str4, jSONObject2.getString("wh"), jSONObject2.getString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15517x245ebd1), jSONObject2.getString("vbr"), c19767x257d7f3, c19767x257d7f4, c19767x257d7f5, c19767x257d7f6, c19767x257d7f7, c19767x257d7f8)) {
                    int i19 = c19767x257d7f3.f38864x6ac9171;
                    jSONArray = jSONArray2;
                    int i27 = c19767x257d7f4.f38864x6ac9171;
                    str = str3;
                    int i28 = c19767x257d7f5.f38864x6ac9171;
                    c19767x257d7f = c19767x257d7f3;
                    int i29 = c19767x257d7f6.f38864x6ac9171;
                    c19767x257d7f2 = c19767x257d7f4;
                    int i37 = c19767x257d7f7.f38864x6ac9171;
                    str2 = str4;
                    int i38 = c19767x257d7f8.f38864x6ac9171;
                    arrayList.add(new d11.w(i19, i27, i28, i29, i37, i38, i38));
                } else {
                    jSONArray = jSONArray2;
                    str = str3;
                    c19767x257d7f = c19767x257d7f3;
                    c19767x257d7f2 = c19767x257d7f4;
                    str2 = str4;
                }
                i18++;
                jSONArray2 = jSONArray;
                str3 = str;
                c19767x257d7f3 = c19767x257d7f;
                c19767x257d7f4 = c19767x257d7f2;
                str4 = str2;
            }
            java.util.Collections.sort(arrayList);
            if (arrayList.size() >= 2 && !vVar.f307231f) {
                int i39 = ((d11.w) arrayList.get(0)).f307240m;
                for (int i47 = 1; i47 < arrayList.size(); i47++) {
                    d11.w wVar = (d11.w) arrayList.get(i47);
                    wVar.f307239i = i39;
                    i39 = wVar.f307240m;
                }
            }
            d11.w[] wVarArr = new d11.w[arrayList.size()];
            vVar.f307232g = wVarArr;
            arrayList.toArray(wVarArr);
            return vVar;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreVideoControl", "parseJsonObject error : " + e17.toString());
            return null;
        }
    }

    public final boolean wj(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f3, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f4, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f5, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f6) {
        int P;
        int P2;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            return false;
        }
        try {
        } catch (java.lang.Exception e17) {
            e = e17;
        }
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                c19767x257d7f2.f38864x6ac9171 = 0;
                c19767x257d7f.f38864x6ac9171 = 0;
            } else {
                java.lang.String[] split = str.split("~");
                c19767x257d7f.f38864x6ac9171 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[0], -1);
                int P3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[1], -1);
                c19767x257d7f2.f38864x6ac9171 = P3;
                if (c19767x257d7f.f38864x6ac9171 <= -1 || P3 <= -1) {
                    return false;
                }
            }
        } catch (java.lang.Exception e18) {
            e = e18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreVideoControl", "parse video para error." + e.toString());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreVideoControl", "config[%s, %s, %s, %s], args[%d, %d, %d, %d, %d, %d]", str, str2, str3, str4, java.lang.Integer.valueOf(c19767x257d7f.f38864x6ac9171), java.lang.Integer.valueOf(c19767x257d7f2.f38864x6ac9171), java.lang.Integer.valueOf(c19767x257d7f3.f38864x6ac9171), java.lang.Integer.valueOf(c19767x257d7f4.f38864x6ac9171), java.lang.Integer.valueOf(c19767x257d7f5.f38864x6ac9171), java.lang.Integer.valueOf(c19767x257d7f6.f38864x6ac9171));
            return true;
        }
        try {
            java.lang.String[] split2 = str2.split("x");
            c19767x257d7f3.f38864x6ac9171 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split2[0], -1);
            P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split2[1], -1);
            c19767x257d7f4.f38864x6ac9171 = P;
        } catch (java.lang.Exception e19) {
            e = e19;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreVideoControl", "parse video para error." + e.toString());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreVideoControl", "config[%s, %s, %s, %s], args[%d, %d, %d, %d, %d, %d]", str, str2, str3, str4, java.lang.Integer.valueOf(c19767x257d7f.f38864x6ac9171), java.lang.Integer.valueOf(c19767x257d7f2.f38864x6ac9171), java.lang.Integer.valueOf(c19767x257d7f3.f38864x6ac9171), java.lang.Integer.valueOf(c19767x257d7f4.f38864x6ac9171), java.lang.Integer.valueOf(c19767x257d7f5.f38864x6ac9171), java.lang.Integer.valueOf(c19767x257d7f6.f38864x6ac9171));
            return true;
        }
        if (c19767x257d7f3.f38864x6ac9171 <= -1 || P <= -1) {
            return false;
        }
        try {
            c19767x257d7f5.f38864x6ac9171 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str3, -1);
        } catch (java.lang.Exception e27) {
            e = e27;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreVideoControl", "parse video para error." + e.toString());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreVideoControl", "config[%s, %s, %s, %s], args[%d, %d, %d, %d, %d, %d]", str, str2, str3, str4, java.lang.Integer.valueOf(c19767x257d7f.f38864x6ac9171), java.lang.Integer.valueOf(c19767x257d7f2.f38864x6ac9171), java.lang.Integer.valueOf(c19767x257d7f3.f38864x6ac9171), java.lang.Integer.valueOf(c19767x257d7f4.f38864x6ac9171), java.lang.Integer.valueOf(c19767x257d7f5.f38864x6ac9171), java.lang.Integer.valueOf(c19767x257d7f6.f38864x6ac9171));
            return true;
        }
        try {
            P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str4, -1);
            c19767x257d7f6.f38864x6ac9171 = P2;
        } catch (java.lang.Exception e28) {
            e = e28;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreVideoControl", "parse video para error." + e.toString());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreVideoControl", "config[%s, %s, %s, %s], args[%d, %d, %d, %d, %d, %d]", str, str2, str3, str4, java.lang.Integer.valueOf(c19767x257d7f.f38864x6ac9171), java.lang.Integer.valueOf(c19767x257d7f2.f38864x6ac9171), java.lang.Integer.valueOf(c19767x257d7f3.f38864x6ac9171), java.lang.Integer.valueOf(c19767x257d7f4.f38864x6ac9171), java.lang.Integer.valueOf(c19767x257d7f5.f38864x6ac9171), java.lang.Integer.valueOf(c19767x257d7f6.f38864x6ac9171));
            return true;
        }
        if (c19767x257d7f5.f38864x6ac9171 > -1 && P2 > -1) {
            c19767x257d7f6.f38864x6ac9171 = P2 * 1000;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreVideoControl", "config[%s, %s, %s, %s], args[%d, %d, %d, %d, %d, %d]", str, str2, str3, str4, java.lang.Integer.valueOf(c19767x257d7f.f38864x6ac9171), java.lang.Integer.valueOf(c19767x257d7f2.f38864x6ac9171), java.lang.Integer.valueOf(c19767x257d7f3.f38864x6ac9171), java.lang.Integer.valueOf(c19767x257d7f4.f38864x6ac9171), java.lang.Integer.valueOf(c19767x257d7f5.f38864x6ac9171), java.lang.Integer.valueOf(c19767x257d7f6.f38864x6ac9171));
            return true;
        }
        return false;
    }

    public boolean xj(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69262xd45e495(str, "wxMeta", "{\"WXVer\":" + o45.wf.f424562g + "}");
        return false;
    }
}
