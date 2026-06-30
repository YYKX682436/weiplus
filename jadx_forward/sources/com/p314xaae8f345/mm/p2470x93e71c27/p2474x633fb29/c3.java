package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29;

/* loaded from: classes10.dex */
public class c3 extends java.lang.Thread {

    /* renamed from: v, reason: collision with root package name */
    public static final java.util.HashMap f270782v = new java.util.HashMap();

    /* renamed from: w, reason: collision with root package name */
    public static final java.lang.Object f270783w = new byte[0];

    /* renamed from: x, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 f270784x;

    /* renamed from: y, reason: collision with root package name */
    public static int f270785y;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f270786d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f270787e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Intent f270788f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f270789g;

    /* renamed from: h, reason: collision with root package name */
    public final int f270790h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f270791i;

    /* renamed from: m, reason: collision with root package name */
    public m11.a f270792m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f270793n;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a3 f270798s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f270799t;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.z2 f270800u = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.z2();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f270794o = new java.util.ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f270795p = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f270796q = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f270797r = new java.util.ArrayList();

    public c3(android.content.Context context, java.util.List list, android.content.Intent intent, java.lang.String str, int i17, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a3 a3Var, boolean z17) {
        this.f270786d = context;
        this.f270787e = list;
        this.f270788f = intent;
        this.f270798s = a3Var;
        this.f270789g = str;
        this.f270790h = i17;
        this.f270791i = z17;
    }

    public static com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d b(java.lang.String str, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.z2 z2Var, java.lang.String str2) {
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d a17 = com.p314xaae8f345.mm.p962x4177e4be.j.a(str);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p962x4177e4be.j.h(str));
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d bj6 = d11.s.fj().bj(a17, str2);
        if (bj6 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportMultiVideo", "get C2C album video para is null. old para %s", a17);
            c19767x257d7f.f38864x6ac9171 = -5;
            return null;
        }
        int i17 = a17.f152727g;
        int i18 = bj6.f152727g;
        int hj6 = (int) (i18 * ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).hj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2534xf84d0b50.C20232x4a4f8806()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportMultiVideo", "check remuxing video bitrate, path: %s ,originBitrate: %s, targetBitrate:%s, targetMaxBitrate: %s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(hj6));
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2534xf84d0b50.C20231xeb62f279()) == 1 && i17 <= hj6) {
            d11.s.fj().getClass();
            java.lang.String m69222xef957a7e = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69222xef957a7e(str, "wxMeta");
            boolean contains = m69222xef957a7e == null ? false : m69222xef957a7e.contains("WXVer");
            boolean Ni = d11.s.fj().Ni(str);
            boolean Ri = d11.s.fj().Ri(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportMultiVideo", "check remuxing, ffmpegFlag: " + contains + " moovFlag: " + Ni + " iOSFlag:" + Ri);
            if (contains || Ni || Ri) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportMultiVideo", "check remuxing, this video had wx meta do not remuxing");
                c19767x257d7f.f38864x6ac9171 = 1;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(422L, 51L, 1L, false);
                return null;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportMultiVideo", "check remuxing targetBitrate: %s, new para %s", java.lang.Integer.valueOf(i18), bj6);
        int[] c17 = c(str, bj6, z2Var);
        bj6.f152727g = c17[0];
        bj6.f152724d = c17[1];
        bj6.f152725e = c17[2];
        bj6.M = c17[3] / 100.0f;
        bj6.N = c17[4];
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2534xf84d0b50.C20231xeb62f279()) != 1) {
            i18 = bj6.f152727g;
        }
        int i19 = a17.f152727g;
        if (i19 > 640000 && i19 >= i18) {
            if (a17.f152728h * 1000 >= ip.a.f375077a.a() * 1000) {
                c19767x257d7f.f38864x6ac9171 = -6;
                return null;
            }
            if (valueOf.booleanValue()) {
                c19767x257d7f.f38864x6ac9171 = 0;
            } else {
                boolean m40075x3170ff = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                c19767x257d7f.f38864x6ac9171 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69244xe35aebcb(str, bj6.f152724d, bj6.f152725e, m40075x3170ff ? 10485760 : com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e4.a(), m40075x3170ff ? 60000.0d : r4.a() * 1000, 1000000);
            }
            return bj6;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportMultiVideo", "new bitrate(%s|%s) is bigger than old bitrate(%s) %s %s", java.lang.Integer.valueOf(i18), 640000, java.lang.Integer.valueOf(a17.f152727g), bj6, a17);
        if (valueOf.booleanValue()) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_import_video_enable_hevc_soft, 0) != 1) {
                c19767x257d7f.f38864x6ac9171 = 0;
                a17.f152724d = c17[1];
                a17.f152725e = c17[2];
                a17.M = c17[3] / 100.0f;
                a17.N = c17[4];
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportMultiVideo", "need compress h265 to h264, use old bitrate: %s", java.lang.Integer.valueOf(a17.f152727g));
                return a17;
            }
        }
        c19767x257d7f.f38864x6ac9171 = 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportMultiVideo", "no need compress, send directly: %s", str);
        return null;
    }

    public static int[] c(java.lang.String str, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.z2 z2Var) {
        int i17;
        if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.d3.f270809a.a()) {
            c11120x15dce88d.A = 1;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_enable_c2c_soft_encode_vcodec2_faster_preset, 1) > 0);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_enable_c2c_soft_encode_vcodec2_crf_preset, 14);
        int g17 = bm5.o1.f104252a.g(bm5.h0.RepairerConfig_Media_ImportVideoHEVC_CRF_Int, 0);
        if (Ni > 0 || g17 > 0) {
            c11120x15dce88d.P = Ni;
            if (g17 > 0) {
                c11120x15dce88d.P = g17;
            }
        } else if (valueOf.booleanValue()) {
            c11120x15dce88d.P = 16;
        }
        int[] iArr = {0, 0, 0, 0, 0};
        iArr[0] = c11120x15dce88d.f152727g;
        iArr[1] = c11120x15dce88d.f152724d;
        iArr[2] = c11120x15dce88d.f152725e;
        int i18 = c11120x15dce88d.f152738u;
        if ((i18 != 1 && i18 != 2) || ((i17 = c11120x15dce88d.G) != 2 && i17 != 4 && i17 != 1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportMultiVideo", "c2c ABA: No use ABA algorithm");
            return iArr;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.a aVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.a();
        if (d11.a.a()) {
            aVar.f243914a = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17683x770f5025 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17684x1bb265e8.b(str, c11120x15dce88d.f152725e, c11120x15dce88d.f152724d, c11120x15dce88d.f152726f, c11120x15dce88d.f152727g, 10.0f, 0.0f, c11120x15dce88d.G, c11120x15dce88d.f152740w, c11120x15dce88d.P * 1.0f, c11120x15dce88d.f152742y, c11120x15dce88d.f152743z, c11120x15dce88d.A, c11120x15dce88d.B, c11120x15dce88d.C, false, aVar);
        z2Var.f271042a = b17;
        if (b17 != null) {
            iArr[0] = b17.f37979xb40e463b * 1000;
            iArr[3] = b17.crf;
            iArr[4] = b17.f37991x6c41574b;
        }
        if (b17 != null && b17.f37984xcef56b5b > 0) {
            iArr[1] = b17.f37980xce669d45;
            iArr[2] = b17.f37978xe49e1188;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportMultiVideo", "ABA: Adaptive Bitrate Methods:videoBitrate [%d]  targetWidth [%d]  targetHeight [%d] crf[%d] vbvBufferSize[%d]", java.lang.Integer.valueOf(iArr[0]), java.lang.Integer.valueOf(iArr[1]), java.lang.Integer.valueOf(iArr[2]), java.lang.Integer.valueOf(iArr[3]), java.lang.Integer.valueOf(iArr[4]));
        t21.o2.Di().q(z2Var.f271042a);
        return iArr;
    }

    public static void d(java.lang.String str, int[] iArr, int i17, int i18) {
        gp.d dVar;
        try {
            dVar = new gp.d();
            try {
                dVar.setDataSource(str);
                int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(18), 0);
                int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(19), 0);
                iArr[0] = P;
                iArr[1] = P2;
                for (int i19 = 0; i19 < 3; i19++) {
                    if (P % 2 == 0 && P2 % 2 == 0) {
                        if ((P >= P2 && (P <= i17 || P2 <= i18)) || (P <= P2 && (P <= i18 || P2 <= i17))) {
                            break;
                        }
                        P /= 2;
                        P2 /= 2;
                    }
                    try {
                        dVar.release();
                    } catch (java.io.IOException unused) {
                    }
                    int i27 = iArr[0];
                    if (i27 % 2 != 0) {
                        iArr[0] = i27 + 1;
                    }
                    int i28 = iArr[1];
                    if (i28 % 2 != 0) {
                        iArr[1] = i28 + 1;
                        return;
                    }
                    return;
                }
                iArr[0] = P;
                iArr[1] = P2;
                try {
                    dVar.release();
                } catch (java.io.IOException unused2) {
                }
                int i29 = iArr[0];
                if (i29 % 2 != 0) {
                    iArr[0] = i29 + 1;
                }
                int i37 = iArr[1];
                if (i37 % 2 != 0) {
                    iArr[1] = i37 + 1;
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImportMultiVideo", "VFSMediaMetadataRetriever error", th);
                    if (dVar != null) {
                        try {
                            dVar.release();
                        } catch (java.io.IOException unused3) {
                        }
                    }
                    int i38 = iArr[0];
                    if (i38 % 2 != 0) {
                        iArr[0] = i38 + 1;
                    }
                    int i39 = iArr[1];
                    if (i39 % 2 != 0) {
                        iArr[1] = i39 + 1;
                    }
                } finally {
                }
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            dVar = null;
        }
    }

    public static long e(int i17) {
        return i17 != 1 ? 2L : 5L;
    }

    public static void h(boolean z17, java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AtomStatUtil", "report video remuxing but path is null.");
            return;
        }
        try {
            long k17 = com.p314xaae8f345.mm.vfs.w6.k(str);
            long k18 = com.p314xaae8f345.mm.vfs.w6.k(str2);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11098, java.lang.Integer.valueOf(com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14514x4fe44208), (z17 ? 1 : 0) + ";" + k17 + ";" + k18 + ";" + ((int) ((100 * k18) / k17)));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AtomStatUtil", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AtomStatUtil", "reportVideoRemuxing error : " + e17.toString());
        }
    }

    public static void j(java.lang.String str, int i17) {
        int i18;
        int i19;
        int i27;
        if (i17 == 1) {
            i18 = 220;
            i19 = 228;
            i27 = 219;
        } else {
            i18 = 234;
            i19 = 242;
            i27 = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d;
        }
        int k17 = (int) (com.p314xaae8f345.mm.vfs.w6.k(str) / 1024);
        int[] iArr = {512, 1024, 2048, 5120, 8192, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 15360, 20480};
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        int q17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) jx3.f.y(k17, iArr, i18, i19));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var2.mo68477x336bdfd8(106L, q17, 1L, false);
        g0Var2.mo68477x336bdfd8(106L, i27, 1L, false);
    }

    public final java.lang.String a(android.content.Intent intent, java.lang.String str) {
        if (intent == null) {
            return "";
        }
        java.lang.Object a17 = ok5.d.a(intent, "key_quote_extcommon");
        r15.b bVar = new r15.b();
        if (a17 instanceof r15.b) {
            bVar = (r15.b) a17;
        }
        java.lang.String stringExtra = intent.getStringExtra("key_select_media_group_id");
        int intExtra = intent.getIntExtra("key_select_media_group_count", 0);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) && intExtra > 0) {
            r15.d dVar = new r15.d();
            dVar.k(stringExtra);
            dVar.j(intExtra);
            dVar.l(1);
            bVar.o(dVar);
        }
        return bVar.m126749x696739c(false, "msg");
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x03d6, code lost:
    
        if (r12 > 1500) goto L138;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x04e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(android.content.Context r36, android.content.Intent r37) {
        /*
            Method dump skipped, instructions count: 1392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.c3.f(android.content.Context, android.content.Intent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v7, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.lang.String r25, java.lang.String r26, java.lang.String r27, android.content.Intent r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.c3.g(java.lang.String, java.lang.String, java.lang.String, android.content.Intent, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x044a  */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Long, com.tencent.mm.storage.f9] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(int r40, java.lang.String r41, java.lang.String r42, int r43, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d r44, android.content.Intent r45) {
        /*
            Method dump skipped, instructions count: 1808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.c3.i(int, java.lang.String, java.lang.String, int, com.tencent.mm.modelcontrol.VideoTransPara, android.content.Intent):void");
    }

    public final void k(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(106L, this.f270790h == 1 ? z17 ? 217 : 218 : z17 ? 231 : 232, 1L, false);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        android.content.Context context = this.f270786d;
        android.content.Intent intent = this.f270788f;
        java.util.List list = this.f270787e;
        if (list == null || list.size() <= 0) {
            f(context, intent);
        } else {
            for (int i17 = 0; i17 < list.size() && !this.f270799t; i17++) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportMultiVideo", "start to import %s", list.get(i17));
                android.content.Intent intent2 = new android.content.Intent();
                intent2.setData(android.net.Uri.parse("file://" + ((java.lang.String) list.get(i17))));
                if (intent != null) {
                    intent2.putExtra("ImportMsgLocalId", intent.getLongExtra("ImportMsgLocalId", -1L));
                    intent2.putExtra("MsgRevokeBatchId", intent.getStringExtra("key_select_revoke_batch_id"));
                    intent2.putExtra("key_select_media_group_id", intent.getStringExtra("key_select_media_group_id"));
                    intent2.putExtra("key_select_media_group_count", intent.getIntExtra("key_select_media_group_count", 0));
                    if (i17 == 0) {
                        java.lang.Object a17 = ok5.d.a(intent, "key_quote_extcommon");
                        if (a17 instanceof r15.b) {
                            ok5.d.b(intent2, "key_quote_extcommon", a17, new ok5.h());
                        }
                    }
                }
                f(context, intent2);
            }
        }
        if (this.f270798s == null || this.f270799t) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.y2(this));
    }
}
