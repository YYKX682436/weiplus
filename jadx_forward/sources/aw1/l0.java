package aw1;

/* loaded from: classes10.dex */
public final class l0 {

    /* renamed from: b, reason: collision with root package name */
    public static int f96102b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f96103c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile boolean f96104d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile boolean f96105e;

    /* renamed from: g, reason: collision with root package name */
    public static volatile boolean f96107g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile boolean f96108h;

    /* renamed from: j, reason: collision with root package name */
    public static android.os.CancellationSignal f96110j;

    /* renamed from: k, reason: collision with root package name */
    public static final int f96111k;

    /* renamed from: l, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f96112l;

    /* renamed from: m, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f96113m;

    /* renamed from: n, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f96114n;

    /* renamed from: o, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f96115o;

    /* renamed from: p, reason: collision with root package name */
    public static final k70.a0 f96116p;

    /* renamed from: q, reason: collision with root package name */
    public static long f96117q;

    /* renamed from: r, reason: collision with root package name */
    public static final jz5.g f96118r;

    /* renamed from: s, reason: collision with root package name */
    public static java.util.concurrent.atomic.AtomicInteger f96119s;

    /* renamed from: t, reason: collision with root package name */
    public static d11.d f96120t;

    /* renamed from: a, reason: collision with root package name */
    public static final aw1.l0 f96101a = new aw1.l0();

    /* renamed from: f, reason: collision with root package name */
    public static volatile java.lang.Object f96106f = new java.lang.Object();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentLinkedDeque f96109i = new java.util.concurrent.ConcurrentLinkedDeque();

    static {
        int h17 = gm0.j1.b().h();
        f96111k = h17;
        f96112l = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("mmkv_compress_original_media_unfinished", h17, 1);
        f96113m = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("mmkv_compress_original_media_record", h17, 1);
        f96114n = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("mmkv_compress_original_media_link", h17, 1);
        f96115o = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("mmkv_compress_original_media_report", h17, 1);
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        f96116p = m11.b1.Di();
        f96118r = jz5.h.b(aw1.k0.f96099d);
        f96119s = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompressOriginalMediaService", "cleanTempDir");
        com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(lp0.b.h0("compress_temp").n(), "image_compress_temp");
        if (!r6Var.m()) {
            r6Var.J();
        }
        com.p314xaae8f345.mm.vfs.w6.f(r6Var.o());
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(lp0.b.h0("compress_temp").n(), "video_compress_temp");
        if (!r6Var2.m()) {
            r6Var2.J();
        }
        com.p314xaae8f345.mm.vfs.w6.f(r6Var2.o());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00bb A[Catch: all -> 0x032f, TryCatch #4 {all -> 0x032f, blocks: (B:22:0x008f, B:23:0x00b1, B:26:0x00c0, B:28:0x00e6, B:29:0x00e9, B:31:0x00f3, B:33:0x0103, B:34:0x0107, B:36:0x010d, B:39:0x0119, B:44:0x0121, B:48:0x0130, B:50:0x013d, B:109:0x00bb), top: B:21:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6 A[Catch: all -> 0x032f, TryCatch #4 {all -> 0x032f, blocks: (B:22:0x008f, B:23:0x00b1, B:26:0x00c0, B:28:0x00e6, B:29:0x00e9, B:31:0x00f3, B:33:0x0103, B:34:0x0107, B:36:0x010d, B:39:0x0119, B:44:0x0121, B:48:0x0130, B:50:0x013d, B:109:0x00bb), top: B:21:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010d A[Catch: all -> 0x032f, TryCatch #4 {all -> 0x032f, blocks: (B:22:0x008f, B:23:0x00b1, B:26:0x00c0, B:28:0x00e6, B:29:0x00e9, B:31:0x00f3, B:33:0x0103, B:34:0x0107, B:36:0x010d, B:39:0x0119, B:44:0x0121, B:48:0x0130, B:50:0x013d, B:109:0x00bb), top: B:21:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0130 A[Catch: all -> 0x032f, TRY_ENTER, TryCatch #4 {all -> 0x032f, blocks: (B:22:0x008f, B:23:0x00b1, B:26:0x00c0, B:28:0x00e6, B:29:0x00e9, B:31:0x00f3, B:33:0x0103, B:34:0x0107, B:36:0x010d, B:39:0x0119, B:44:0x0121, B:48:0x0130, B:50:0x013d, B:109:0x00bb), top: B:21:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x024e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0251 A[Catch: all -> 0x0245, TryCatch #2 {all -> 0x0245, blocks: (B:55:0x0159, B:63:0x0167, B:64:0x0248, B:67:0x0251, B:69:0x0259, B:71:0x0266, B:72:0x0280, B:75:0x028f, B:77:0x02e7, B:79:0x02f8, B:80:0x02fd, B:81:0x0303, B:83:0x030b, B:87:0x0289, B:88:0x0186, B:90:0x0194, B:92:0x019a, B:94:0x01a6, B:95:0x01d2, B:96:0x01aa, B:98:0x01b1, B:102:0x01ed, B:103:0x0204, B:105:0x0208), top: B:46:0x012e }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0186 A[Catch: all -> 0x0245, TryCatch #2 {all -> 0x0245, blocks: (B:55:0x0159, B:63:0x0167, B:64:0x0248, B:67:0x0251, B:69:0x0259, B:71:0x0266, B:72:0x0280, B:75:0x028f, B:77:0x02e7, B:79:0x02f8, B:80:0x02fd, B:81:0x0303, B:83:0x030b, B:87:0x0289, B:88:0x0186, B:90:0x0194, B:92:0x019a, B:94:0x01a6, B:95:0x01d2, B:96:0x01aa, B:98:0x01b1, B:102:0x01ed, B:103:0x0204, B:105:0x0208), top: B:46:0x012e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(long r34, ot1.h r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 855
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aw1.l0.b(long, ot1.h, boolean):long");
    }

    public final int c(java.lang.String inputVideo, java.lang.String outputVideo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputVideo, "inputVideo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputVideo, "outputVideo");
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.z2 z2Var = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.z2();
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = new com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f3 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f4 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.f(inputVideo, c19767x257d7f, c19767x257d7f2, c19767x257d7f3, c19767x257d7f4, new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f());
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d bj6 = d11.s.fj().bj(c11120x15dce88d, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bj6, "getC2CAlbumVideoPara(...)");
        bj6.f152728h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V1(c19767x257d7f.f38864x6ac9171);
        bj6.f152724d = c19767x257d7f2.f38864x6ac9171;
        bj6.f152725e = c19767x257d7f3.f38864x6ac9171;
        int i17 = c19767x257d7f4.f38864x6ac9171;
        if (i17 < bj6.f152726f) {
            bj6.f152726f = i17;
        }
        bj6.f152727g = 1600000;
        g(bj6);
        bj6.G = 9;
        float e17 = bm5.o1.f104252a.e(bm5.h0.RepairerConfig_Media_ImportConstBRRatioMode_Float, 0.0f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompressOriginalMediaService", "compressVideoWithSameQuality, useConstBRRatio = " + e17);
        if (e17 > 0.0f) {
            bj6.P = 5;
        } else {
            bj6.P = 18;
        }
        aw1.a f17 = f(inputVideo, bj6, z2Var, false, e17);
        bj6.f152727g = f17.f96019d;
        bj6.f152724d = f17.f96017b;
        bj6.f152725e = f17.f96018c;
        bj6.M = f17.f96020e;
        bj6.N = f17.f96021f;
        int b17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.f3.b(inputVideo, outputVideo, bj6, false, new d11.d(13));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompressOriginalMediaService", "transferVideo ret = " + b17);
        return b17;
    }

    public final int d(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.z2 z2Var = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.z2();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f3 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f4 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.f(str, c19767x257d7f, c19767x257d7f2, c19767x257d7f3, c19767x257d7f4, new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f());
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d bj6 = d11.s.fj().bj(com.p314xaae8f345.mm.p962x4177e4be.j.a(str), null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bj6);
        int i17 = bj6.f152724d;
        int i18 = bj6.f152725e;
        boolean z17 = i17 > i18;
        int i19 = z17 ? i18 : i17;
        int i27 = com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf;
        if (i19 > 720) {
            if (!z17) {
                i17 = i18;
            }
            int i28 = ((((i17 * com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf) / i19) + 4) / 8) * 8;
            bj6.f152724d = z17 ? i28 : 720;
            if (!z17) {
                i27 = i28;
            }
            bj6.f152725e = i27;
        }
        bj6.f152728h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V1(c19767x257d7f.f38864x6ac9171);
        int i29 = c19767x257d7f4.f38864x6ac9171;
        if (i29 < bj6.f152726f) {
            bj6.f152726f = i29;
        }
        g(bj6);
        bj6.G = 9;
        bj6.P = 12;
        aw1.a f17 = f(str, bj6, z2Var, true, 0.0f);
        bj6.f152727g = f17.f96019d;
        bj6.f152724d = f17.f96017b;
        bj6.f152725e = f17.f96018c;
        bj6.M = f17.f96020e;
        bj6.N = f17.f96021f;
        d11.d dVar = f96120t;
        if (dVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoTransController");
            throw null;
        }
        int b17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.f3.b(str, str2, bj6, false, dVar);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("convert h265 inputVideo = ");
        sb6.append(str);
        sb6.append(", outputVideo = ");
        sb6.append(str2);
        sb6.append(", duration = ");
        sb6.append(c19767x257d7f.f38864x6ac9171);
        sb6.append(", ret = ");
        sb6.append(b17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompressOriginalMediaService", sb6.toString());
        if (b17 != -1 || c19767x257d7f.f38864x6ac9171 >= 800) {
            return b17;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("compressVideoWithSendAlbumVideoQuality, pDuration.value = ");
        sb7.append(c19767x257d7f.f38864x6ac9171);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompressOriginalMediaService", sb7.toString());
        return -1000;
    }

    public final synchronized void e(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompressOriginalMediaService", "convertOriginalMediaFinish, duration = " + (java.lang.System.currentTimeMillis() - f96117q));
        synchronized (i()) {
            f96101a.i().clear();
        }
        i95.m c17 = i95.n0.c(c01.f8.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.plugin.clean.CleanService");
        yv1.b1 b1Var = (yv1.b1) c17;
        if (b1Var.f547533d == null) {
            yv1.i0 i0Var = new yv1.i0(b1Var);
            i0Var.f();
            b1Var.f547533d = i0Var;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f96112l;
        long q17 = o4Var.q("mmkv_compress_original_media_done_count", 0L);
        long q18 = o4Var.q("mmkv_compress_original_media_compressed_size", 0L);
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.d(26980, 30000, java.lang.Long.valueOf(q17), java.lang.Long.valueOf(q18));
        long j17 = o4Var.getLong("mmkv_compress_original_last_task_start_time", 0L);
        long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompressOriginalMediaService", "convertOriginalMediaFinish, lastTaskIsResume = " + f96103c + ", durationFromMMKV = " + currentTimeMillis);
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = 30000;
        objArr[1] = java.lang.Long.valueOf(q17);
        objArr[2] = java.lang.Long.valueOf(q18);
        objArr[3] = z17 ? "finish" : "stop";
        objArr[4] = f96103c ? "resume" : "new";
        if (j17 == 0) {
            currentTimeMillis = -1;
        }
        objArr[5] = java.lang.Long.valueOf(currentTimeMillis);
        fVar.d(26980, objArr);
        f96107g = false;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("mmkv_compress_original_media_record", f96111k, 1).d();
        o4Var.remove("mmkv_compress_original_media_unfinished_flag");
        o4Var.remove("mmkv_compress_original_media_done_count");
        o4Var.remove("mmkv_compress_original_media_total_count");
        o4Var.remove("mmkv_compress_original_media_compressed_size");
        o4Var.remove("mmkv_compress_original_media_send_compressed_size");
        o4Var.remove("mmkv_compress_original_media_recv_compressed_size");
        o4Var.remove("mmkv_compress_original_media_recv_expected_size");
        o4Var.remove("mmkv_compress_original_media_recv_expected_size");
        f96113m.d();
        if (z17) {
            a();
        }
    }

    public final aw1.a f(java.lang.String path, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d ABAPrams, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.z2 abaParamsContainer, boolean z17, float f17) {
        boolean z18;
        int i17;
        char c17;
        int i18;
        int i19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ABAPrams, "ABAPrams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(abaParamsContainer, "abaParamsContainer");
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17683x770f5025 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17684x1bb265e8.b(path, ABAPrams.f152725e, ABAPrams.f152724d, ABAPrams.f152726f, ABAPrams.f152727g, 10.0f, 0.0f, !z17 ? 13 : 14, ABAPrams.f152740w, ABAPrams.P * 1.0f, ABAPrams.f152742y, ABAPrams.f152743z, ABAPrams.A, ABAPrams.B, ABAPrams.C, false, new com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.a());
        abaParamsContainer.f271042a = b17;
        int i27 = ABAPrams.f152727g;
        int i28 = ABAPrams.f152724d;
        int i29 = ABAPrams.f152725e;
        char c18 = 0;
        boolean z19 = false;
        float f18 = 28.0f;
        int i37 = 3000;
        char c19 = 65535;
        if (f17 <= 0.0f || b17 == null || (i19 = b17.f37971x65b9f884) <= 0) {
            float e17 = bm5.o1.f104252a.e(bm5.h0.RepairerConfig_Media_ImportVideoHEVCCRFRatio_Float, 0.0f);
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17683x770f5025 c17683x770f5025 = abaParamsContainer.f271042a;
            if (c17683x770f5025 != null) {
                i27 = c17683x770f5025.f37979xb40e463b * 1000;
                f18 = (c17683x770f5025.crf / 100.0f) + e17;
                i37 = (int) (c17683x770f5025.f37991x6c41574b * (1 - (e17 / 10.0f)));
                z18 = c17683x770f5025.f37987x2c4c29be > 0;
                c19 = 0;
            } else {
                z18 = false;
            }
            if (c17683x770f5025 == null || c17683x770f5025.f37984xcef56b5b <= 0 || !z17) {
                c18 = c19;
            } else {
                i28 = c17683x770f5025.f37980xce669d45;
                i29 = c17683x770f5025.f37978xe49e1188;
            }
            t21.o2.Di().q(abaParamsContainer.f271042a);
            i17 = i28;
            c17 = c18;
            z19 = z18;
            i18 = i27;
        } else {
            i18 = (int) (i19 * 1000 * f17);
            i17 = i28;
            c17 = 65535;
        }
        if (!z17 && abaParamsContainer.f271042a.f37971x65b9f884 < 1600) {
            z19 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompressOriginalMediaService", "ABA: Compress_original_video remuxScene " + ABAPrams.G + " useConstBRRatioMode:" + f17 + " videoBitrate " + i18 + " targetWidth " + i17 + " targetHeight " + i29 + " crf " + f18 + " vbvBufferSize" + i37 + " skipTrans" + z19 + " errCode:" + ((int) c17));
        return new aw1.a(c17, i17, i29, i18, f18, i37, z19, abaParamsContainer.f271042a);
    }

    public final com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d g(com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d) {
        int i17;
        c11120x15dce88d.f152738u = 1;
        c11120x15dce88d.f152742y = 10;
        c11120x15dce88d.f152743z = 10;
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_C2C_HEVC_INT_SYNC, 0);
        if (r17 == 1) {
            i17 = 0;
        } else if (r17 != 2) {
            i17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_media_c2c_adaptive_config, 0);
        } else {
            i17 = 13;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaSoftH265Config", "getC2cAdaptiveConfig:" + i17);
        c11120x15dce88d.P = i17;
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_c2cstore_swroi_switch_android, 0);
        int f17 = rs0.n.f480839d.f();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaSoftH265Config", "WaveVideoModel getC2CTransStoreROIConfig mainConfig=" + Ni + " gpuScoreThresh=30 gpuScore=" + f17);
        if (Ni <= 0 || f17 >= 30) {
            ((p05.l2) ((lg0.o) i95.n0.c(lg0.o.class))).Ai(((p05.l2) ((lg0.o) i95.n0.c(lg0.o.class))).wi("roi_c2c_face"), Ni);
        } else {
            Ni = -1;
        }
        c11120x15dce88d.Q = Ni;
        c11120x15dce88d.B = 0;
        c11120x15dce88d.C = 36;
        c11120x15dce88d.f152740w = 0.52f;
        c11120x15dce88d.f152741x = 1.0f;
        c11120x15dce88d.f152739v = 0;
        boolean bj6 = ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).bj();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompressOriginalMediaService", "getABAPras, enableH265 = " + bj6);
        c11120x15dce88d.A = bj6 ? 1 : 0;
        c11120x15dce88d.D = 0;
        c11120x15dce88d.E = 51;
        c11120x15dce88d.F = c11120x15dce88d.f152727g;
        c11120x15dce88d.G = 1;
        if ((wo.r.a() & 255) < 30 || android.os.Build.VERSION.SDK_INT <= 25) {
            c11120x15dce88d.f152738u = 0;
        }
        return c11120x15dce88d;
    }

    public final aw1.o0 h() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f96112l;
        return new aw1.o0(o4Var.q("mmkv_compress_original_media_last_task_compressed_size", 0L), o4Var.q("mmkv_compress_original_media_last_task_send_compressed_size", 0L), o4Var.q("mmkv_compress_original_media_last_task_recv_compressed_size", 0L), o4Var.q("mmkv_compress_original_media_last_task_send_expected_size", 0L), o4Var.q("mmkv_compress_original_media_last_task_recv_expected_size", 0L));
    }

    public final java.util.List i() {
        return (java.util.List) ((jz5.n) f96118r).mo141623x754a37bb();
    }

    public final boolean j(java.lang.String str, java.lang.String str2) {
        m11.b b17 = m11.c.b(str);
        int i17 = b17.f404164d;
        int i18 = b17.f404163c;
        com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a = new com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a();
        c19762x487075a.f38859x6ac9171 = true;
        com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
        com.p314xaae8f345.mm.vfs.r6 n17 = lp0.b.h0("wxam_temp").n();
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str3 = a17.f294812f;
        if (str3 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        java.lang.String str4 = a17.f294812f;
        int lastIndexOf = str4.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str4 = str4.substring(lastIndexOf + 1);
        }
        java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(n17, str4).o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
        boolean f17 = m11.c.f(str, o17, i18, i17, c19762x487075a, 70, 0, false);
        if (f17) {
            f17 = ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).Ui(o17, str2, 1) >= 0;
        }
        com.p314xaae8f345.mm.vfs.w6.h(o17);
        return f17;
    }

    public final synchronized void k(java.util.Set msgIdSet, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgIdSet, "msgIdSet");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompressOriginalMediaService", "compressOriginalImage, isResume = " + z17 + ", isTaskRunning = " + f96107g + ", msgIdSet = " + msgIdSet.size());
        if (msgIdSet.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompressOriginalMediaService", "compressOriginalMedia, empty set, return");
            return;
        }
        if (f96107g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompressOriginalMediaService", "compressOriginalMedia, task already running, return");
            return;
        }
        f96119s = new java.util.concurrent.atomic.AtomicInteger(0);
        f96117q = java.lang.System.currentTimeMillis();
        synchronized (this) {
            if (!f96108h) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.s0) ((ob0.f) i95.n0.c(ob0.f.class))).Di(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1325x625ef5e.C13103x814d042f.f35424x4fbc8495);
                f96108h = true;
            }
            android.os.CancellationSignal cancellationSignal = new android.os.CancellationSignal();
            f96110j = cancellationSignal;
            f96120t = new d11.d(13);
            if (z17) {
                f96103c = true;
                f96102b = 1;
            } else {
                f96113m.d();
                java.util.Iterator it = msgIdSet.iterator();
                while (it.hasNext()) {
                    f96113m.B(java.lang.String.valueOf(((java.lang.Number) ((jz5.l) it.next()).f384367e).longValue()), 0L);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompressOriginalMediaService", "Save msgid and path to MMKV done");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f96112l;
                o4Var.remove("mmkv_compress_original_media_last_task_compressed_size");
                o4Var.remove("mmkv_compress_original_media_last_task_send_compressed_size");
                o4Var.remove("mmkv_compress_original_media_last_task_recv_compressed_size");
                o4Var.remove("mmkv_compress_original_media_last_task_send_expected_size");
                o4Var.remove("mmkv_compress_original_media_last_task_recv_expected_size");
                o4Var.putLong("mmkv_compress_original_last_task_start_time", java.lang.System.currentTimeMillis());
                long D = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompressOriginalMediaService", "totalMemInGb = " + D);
                if (D > 10) {
                    f96102b = 4;
                }
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("1", j62.e.g().a("clicfg_compress_media_single_thread", "0", false, true))) {
                f96102b = 1;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = f96112l;
            o4Var2.G("mmkv_compress_original_media_unfinished_flag", true);
            int size = msgIdSet.size();
            o4Var2.A("mmkv_compress_original_media_total_count", size);
            java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
            java.util.concurrent.atomic.AtomicLong atomicLong = new java.util.concurrent.atomic.AtomicLong(o4Var2.q("mmkv_compress_original_media_compressed_size", 0L));
            java.util.concurrent.atomic.AtomicLong atomicLong2 = new java.util.concurrent.atomic.AtomicLong(o4Var2.q("mmkv_compress_original_media_send_compressed_size", 0L));
            java.util.concurrent.atomic.AtomicLong atomicLong3 = new java.util.concurrent.atomic.AtomicLong(o4Var2.q("mmkv_compress_original_media_recv_compressed_size", 0L));
            java.util.concurrent.atomic.AtomicLong atomicLong4 = new java.util.concurrent.atomic.AtomicLong(o4Var2.q("mmkv_compress_original_media_recv_expected_size", 0L));
            java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(o4Var2.q("mmkv_compress_original_media_recv_expected_size", 0L));
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var3 = f96115o;
            h0Var.f391656d = new java.util.concurrent.atomic.AtomicLong(o4Var3.q("mmkv_compress_original_media_report_send_img", 0L));
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            h0Var2.f391656d = new java.util.concurrent.atomic.AtomicLong(o4Var3.q("mmkv_compress_original_media_report_recv_img", 0L));
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var3 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            h0Var3.f391656d = new java.util.concurrent.atomic.AtomicLong(o4Var3.q("mmkv_compress_original_media_report_send_video", 0L));
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var4 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            h0Var4.f391656d = new java.util.concurrent.atomic.AtomicLong(o4Var3.q("mmkv_compress_original_media_report_recv_video", 0L));
            jx3.f.INSTANCE.d(26980, java.lang.Integer.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059), java.lang.Integer.valueOf(size));
            boolean z18 = l75.d1.f398478a;
            if (!l75.d1.f398478a) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompressOriginalMediaService", "before compressRunnable");
                ((ku5.t0) ku5.t0.f394148d).a(new aw1.j0(msgIdSet, cancellationSignal, atomicLong2, atomicLong3, atomicLong4, h0Var, h0Var2, h0Var3, h0Var4, atomicInteger, size, atomicLong, atomicLong5));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompressOriginalMediaService", "diskFull return");
                java.util.Iterator it6 = f96109i.iterator();
                while (it6.hasNext()) {
                    ((aw1.f0) it6.next()).a(1.0f, 0L, 0L, 0L, 0L, 0L, true);
                }
            }
        }
    }

    public final void l() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompressOriginalMediaService", "suspendTaskManuallySync, compressingFileCount = " + f96119s.get());
        f96104d = true;
        f96105e = true;
        while (f96119s.get() > 0) {
            try {
                java.lang.Thread.sleep(1000L);
            } catch (java.lang.Throwable unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CompressOriginalMediaService", "suspendTaskManuallySync sleep error");
            }
        }
    }

    public final void m() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompressOriginalMediaService", "tryToResumeCompressMediaTaskAsync");
        boolean z17 = l75.d1.f398478a;
        if (l75.d1.f398478a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompressOriginalMediaService", "diskFull return");
            return;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b("1", j62.e.g().a("clicfg_resume_unifinish_compress_task", "1", false, true))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompressOriginalMediaService", "tryToResumeCompressMediaTaskAsync expt false, return");
            return;
        }
        a();
        if (!f96112l.i("mmkv_compress_original_media_unfinished_flag", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompressOriginalMediaService", "NO unfinished task, return");
            return;
        }
        long q17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().q("compress_task_last_resume_time", 0L);
        long q18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().q("compress_task_last_resume_count", 0L) + 1;
        if (java.lang.System.currentTimeMillis() - q17 > 600000) {
            q18 = 0;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("compress_task_last_resume_count", q18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompressOriginalMediaService", "tryToResumeCompressMediaTaskAsync, lastCount = " + q18);
        if (q18 > 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CompressOriginalMediaService", "too frequent resume, task finish");
            e(true);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("compress_task_last_resume_count", 0L);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("compress_task_last_resume_time", 0L);
            jx3.f.INSTANCE.d(26980, -40000);
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("compress_task_last_resume_time", java.lang.System.currentTimeMillis());
        java.util.HashSet hashSet = new java.util.HashSet();
        java.lang.String[] b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("mmkv_compress_original_media_record", f96111k, 1).b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "allKeys(...)");
        for (java.lang.String str : b17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            long parseLong = java.lang.Long.parseLong(str);
            java.lang.String h27 = mt1.b0.f412724a.n().h2(parseLong);
            if (h27 == null) {
                h27 = "talker-ignore";
            }
            hashSet.add(new jz5.l(h27, java.lang.Long.valueOf(parseLong)));
        }
        k(hashSet, true);
    }

    public final void n() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompressOriginalMediaService", "wakeTask");
        if (f96105e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompressOriginalMediaService", "wakeTask suspended manually, return");
            return;
        }
        f96104d = false;
        synchronized (f96106f) {
            try {
                f96106f.notifyAll();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompressOriginalMediaService", "wakeTask impl notify");
            } catch (java.lang.InterruptedException unused) {
            }
        }
    }
}
