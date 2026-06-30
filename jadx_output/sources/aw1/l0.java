package aw1;

/* loaded from: classes10.dex */
public final class l0 {

    /* renamed from: b, reason: collision with root package name */
    public static int f14569b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f14570c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile boolean f14571d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile boolean f14572e;

    /* renamed from: g, reason: collision with root package name */
    public static volatile boolean f14574g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile boolean f14575h;

    /* renamed from: j, reason: collision with root package name */
    public static android.os.CancellationSignal f14577j;

    /* renamed from: k, reason: collision with root package name */
    public static final int f14578k;

    /* renamed from: l, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f14579l;

    /* renamed from: m, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f14580m;

    /* renamed from: n, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f14581n;

    /* renamed from: o, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f14582o;

    /* renamed from: p, reason: collision with root package name */
    public static final k70.a0 f14583p;

    /* renamed from: q, reason: collision with root package name */
    public static long f14584q;

    /* renamed from: r, reason: collision with root package name */
    public static final jz5.g f14585r;

    /* renamed from: s, reason: collision with root package name */
    public static java.util.concurrent.atomic.AtomicInteger f14586s;

    /* renamed from: t, reason: collision with root package name */
    public static d11.d f14587t;

    /* renamed from: a, reason: collision with root package name */
    public static final aw1.l0 f14568a = new aw1.l0();

    /* renamed from: f, reason: collision with root package name */
    public static volatile java.lang.Object f14573f = new java.lang.Object();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentLinkedDeque f14576i = new java.util.concurrent.ConcurrentLinkedDeque();

    static {
        int h17 = gm0.j1.b().h();
        f14578k = h17;
        f14579l = com.tencent.mm.sdk.platformtools.o4.J("mmkv_compress_original_media_unfinished", h17, 1);
        f14580m = com.tencent.mm.sdk.platformtools.o4.J("mmkv_compress_original_media_record", h17, 1);
        f14581n = com.tencent.mm.sdk.platformtools.o4.J("mmkv_compress_original_media_link", h17, 1);
        f14582o = com.tencent.mm.sdk.platformtools.o4.J("mmkv_compress_original_media_report", h17, 1);
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        f14583p = m11.b1.Di();
        f14585r = jz5.h.b(aw1.k0.f14566d);
        f14586s = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    public final void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CompressOriginalMediaService", "cleanTempDir");
        com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(lp0.b.h0("compress_temp").n(), "image_compress_temp");
        if (!r6Var.m()) {
            r6Var.J();
        }
        com.tencent.mm.vfs.w6.f(r6Var.o());
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(lp0.b.h0("compress_temp").n(), "video_compress_temp");
        if (!r6Var2.m()) {
            r6Var2.J();
        }
        com.tencent.mm.vfs.w6.f(r6Var2.o());
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
        kotlin.jvm.internal.o.g(inputVideo, "inputVideo");
        kotlin.jvm.internal.o.g(outputVideo, "outputVideo");
        com.tencent.mm.pluginsdk.model.z2 z2Var = new com.tencent.mm.pluginsdk.model.z2();
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = new com.tencent.mm.modelcontrol.VideoTransPara();
        com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.pointers.PInt pInt2 = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.pointers.PInt pInt3 = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.pointers.PInt pInt4 = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.plugin.sight.base.e.f(inputVideo, pInt, pInt2, pInt3, pInt4, new com.tencent.mm.pointers.PInt());
        com.tencent.mm.modelcontrol.VideoTransPara bj6 = d11.s.fj().bj(videoTransPara, null);
        kotlin.jvm.internal.o.f(bj6, "getC2CAlbumVideoPara(...)");
        bj6.f71195h = com.tencent.mm.sdk.platformtools.t8.V1(pInt.value);
        bj6.f71191d = pInt2.value;
        bj6.f71192e = pInt3.value;
        int i17 = pInt4.value;
        if (i17 < bj6.f71193f) {
            bj6.f71193f = i17;
        }
        bj6.f71194g = 1600000;
        g(bj6);
        bj6.G = 9;
        float e17 = bm5.o1.f22719a.e(bm5.h0.RepairerConfig_Media_ImportConstBRRatioMode_Float, 0.0f);
        com.tencent.mars.xlog.Log.i("MicroMsg.CompressOriginalMediaService", "compressVideoWithSameQuality, useConstBRRatio = " + e17);
        if (e17 > 0.0f) {
            bj6.P = 5;
        } else {
            bj6.P = 18;
        }
        aw1.a f17 = f(inputVideo, bj6, z2Var, false, e17);
        bj6.f71194g = f17.f14486d;
        bj6.f71191d = f17.f14484b;
        bj6.f71192e = f17.f14485c;
        bj6.M = f17.f14487e;
        bj6.N = f17.f14488f;
        int b17 = com.tencent.mm.pluginsdk.model.f3.b(inputVideo, outputVideo, bj6, false, new d11.d(13));
        com.tencent.mars.xlog.Log.i("MicroMsg.CompressOriginalMediaService", "transferVideo ret = " + b17);
        return b17;
    }

    public final int d(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.pluginsdk.model.z2 z2Var = new com.tencent.mm.pluginsdk.model.z2();
        com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.pointers.PInt pInt2 = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.pointers.PInt pInt3 = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.pointers.PInt pInt4 = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.plugin.sight.base.e.f(str, pInt, pInt2, pInt3, pInt4, new com.tencent.mm.pointers.PInt());
        com.tencent.mm.modelcontrol.VideoTransPara bj6 = d11.s.fj().bj(com.tencent.mm.modelvideoh265toh264.j.a(str), null);
        kotlin.jvm.internal.o.d(bj6);
        int i17 = bj6.f71191d;
        int i18 = bj6.f71192e;
        boolean z17 = i17 > i18;
        int i19 = z17 ? i18 : i17;
        int i27 = com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH;
        if (i19 > 720) {
            if (!z17) {
                i17 = i18;
            }
            int i28 = ((((i17 * com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH) / i19) + 4) / 8) * 8;
            bj6.f71191d = z17 ? i28 : 720;
            if (!z17) {
                i27 = i28;
            }
            bj6.f71192e = i27;
        }
        bj6.f71195h = com.tencent.mm.sdk.platformtools.t8.V1(pInt.value);
        int i29 = pInt4.value;
        if (i29 < bj6.f71193f) {
            bj6.f71193f = i29;
        }
        g(bj6);
        bj6.G = 9;
        bj6.P = 12;
        aw1.a f17 = f(str, bj6, z2Var, true, 0.0f);
        bj6.f71194g = f17.f14486d;
        bj6.f71191d = f17.f14484b;
        bj6.f71192e = f17.f14485c;
        bj6.M = f17.f14487e;
        bj6.N = f17.f14488f;
        d11.d dVar = f14587t;
        if (dVar == null) {
            kotlin.jvm.internal.o.o("videoTransController");
            throw null;
        }
        int b17 = com.tencent.mm.pluginsdk.model.f3.b(str, str2, bj6, false, dVar);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("convert h265 inputVideo = ");
        sb6.append(str);
        sb6.append(", outputVideo = ");
        sb6.append(str2);
        sb6.append(", duration = ");
        sb6.append(pInt.value);
        sb6.append(", ret = ");
        sb6.append(b17);
        com.tencent.mars.xlog.Log.i("MicroMsg.CompressOriginalMediaService", sb6.toString());
        if (b17 != -1 || pInt.value >= 800) {
            return b17;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("compressVideoWithSendAlbumVideoQuality, pDuration.value = ");
        sb7.append(pInt.value);
        com.tencent.mars.xlog.Log.i("MicroMsg.CompressOriginalMediaService", sb7.toString());
        return -1000;
    }

    public final synchronized void e(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CompressOriginalMediaService", "convertOriginalMediaFinish, duration = " + (java.lang.System.currentTimeMillis() - f14584q));
        synchronized (i()) {
            f14568a.i().clear();
        }
        i95.m c17 = i95.n0.c(c01.f8.class);
        kotlin.jvm.internal.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.plugin.clean.CleanService");
        yv1.b1 b1Var = (yv1.b1) c17;
        if (b1Var.f466000d == null) {
            yv1.i0 i0Var = new yv1.i0(b1Var);
            i0Var.f();
            b1Var.f466000d = i0Var;
        }
        com.tencent.mm.sdk.platformtools.o4 o4Var = f14579l;
        long q17 = o4Var.q("mmkv_compress_original_media_done_count", 0L);
        long q18 = o4Var.q("mmkv_compress_original_media_compressed_size", 0L);
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.d(26980, 30000, java.lang.Long.valueOf(q17), java.lang.Long.valueOf(q18));
        long j17 = o4Var.getLong("mmkv_compress_original_last_task_start_time", 0L);
        long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.CompressOriginalMediaService", "convertOriginalMediaFinish, lastTaskIsResume = " + f14570c + ", durationFromMMKV = " + currentTimeMillis);
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = 30000;
        objArr[1] = java.lang.Long.valueOf(q17);
        objArr[2] = java.lang.Long.valueOf(q18);
        objArr[3] = z17 ? "finish" : "stop";
        objArr[4] = f14570c ? "resume" : "new";
        if (j17 == 0) {
            currentTimeMillis = -1;
        }
        objArr[5] = java.lang.Long.valueOf(currentTimeMillis);
        fVar.d(26980, objArr);
        f14574g = false;
        com.tencent.mm.sdk.platformtools.o4.J("mmkv_compress_original_media_record", f14578k, 1).d();
        o4Var.remove("mmkv_compress_original_media_unfinished_flag");
        o4Var.remove("mmkv_compress_original_media_done_count");
        o4Var.remove("mmkv_compress_original_media_total_count");
        o4Var.remove("mmkv_compress_original_media_compressed_size");
        o4Var.remove("mmkv_compress_original_media_send_compressed_size");
        o4Var.remove("mmkv_compress_original_media_recv_compressed_size");
        o4Var.remove("mmkv_compress_original_media_recv_expected_size");
        o4Var.remove("mmkv_compress_original_media_recv_expected_size");
        f14580m.d();
        if (z17) {
            a();
        }
    }

    public final aw1.a f(java.lang.String path, com.tencent.mm.modelcontrol.VideoTransPara ABAPrams, com.tencent.mm.pluginsdk.model.z2 abaParamsContainer, boolean z17, float f17) {
        boolean z18;
        int i17;
        char c17;
        int i18;
        int i19;
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(ABAPrams, "ABAPrams");
        kotlin.jvm.internal.o.g(abaParamsContainer, "abaParamsContainer");
        com.tencent.mm.plugin.sight.base.ABAPrams b17 = com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate.b(path, ABAPrams.f71192e, ABAPrams.f71191d, ABAPrams.f71193f, ABAPrams.f71194g, 10.0f, 0.0f, !z17 ? 13 : 14, ABAPrams.f71207w, ABAPrams.P * 1.0f, ABAPrams.f71209y, ABAPrams.f71210z, ABAPrams.A, ABAPrams.B, ABAPrams.C, false, new com.tencent.mm.plugin.sight.base.a());
        abaParamsContainer.f189509a = b17;
        int i27 = ABAPrams.f71194g;
        int i28 = ABAPrams.f71191d;
        int i29 = ABAPrams.f71192e;
        char c18 = 0;
        boolean z19 = false;
        float f18 = 28.0f;
        int i37 = 3000;
        char c19 = 65535;
        if (f17 <= 0.0f || b17 == null || (i19 = b17.inputKbps) <= 0) {
            float e17 = bm5.o1.f22719a.e(bm5.h0.RepairerConfig_Media_ImportVideoHEVCCRFRatio_Float, 0.0f);
            com.tencent.mm.plugin.sight.base.ABAPrams aBAPrams = abaParamsContainer.f189509a;
            if (aBAPrams != null) {
                i27 = aBAPrams.outputKbps * 1000;
                f18 = (aBAPrams.crf / 100.0f) + e17;
                i37 = (int) (aBAPrams.vbvBufferSize * (1 - (e17 / 10.0f)));
                z18 = aBAPrams.skipVideoCompress > 0;
                c19 = 0;
            } else {
                z18 = false;
            }
            if (aBAPrams == null || aBAPrams.resolutionAdjust <= 0 || !z17) {
                c18 = c19;
            } else {
                i28 = aBAPrams.outputWidth;
                i29 = aBAPrams.outputHeight;
            }
            t21.o2.Di().q(abaParamsContainer.f189509a);
            i17 = i28;
            c17 = c18;
            z19 = z18;
            i18 = i27;
        } else {
            i18 = (int) (i19 * 1000 * f17);
            i17 = i28;
            c17 = 65535;
        }
        if (!z17 && abaParamsContainer.f189509a.inputKbps < 1600) {
            z19 = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CompressOriginalMediaService", "ABA: Compress_original_video remuxScene " + ABAPrams.G + " useConstBRRatioMode:" + f17 + " videoBitrate " + i18 + " targetWidth " + i17 + " targetHeight " + i29 + " crf " + f18 + " vbvBufferSize" + i37 + " skipTrans" + z19 + " errCode:" + ((int) c17));
        return new aw1.a(c17, i17, i29, i18, f18, i37, z19, abaParamsContainer.f189509a);
    }

    public final com.tencent.mm.modelcontrol.VideoTransPara g(com.tencent.mm.modelcontrol.VideoTransPara videoTransPara) {
        int i17;
        videoTransPara.f71205u = 1;
        videoTransPara.f71209y = 10;
        videoTransPara.f71210z = 10;
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_C2C_HEVC_INT_SYNC, 0);
        if (r17 == 1) {
            i17 = 0;
        } else if (r17 != 2) {
            i17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_media_c2c_adaptive_config, 0);
        } else {
            i17 = 13;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaSoftH265Config", "getC2cAdaptiveConfig:" + i17);
        videoTransPara.P = i17;
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_c2cstore_swroi_switch_android, 0);
        int f17 = rs0.n.f399306d.f();
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaSoftH265Config", "WaveVideoModel getC2CTransStoreROIConfig mainConfig=" + Ni + " gpuScoreThresh=30 gpuScore=" + f17);
        if (Ni <= 0 || f17 >= 30) {
            ((p05.l2) ((lg0.o) i95.n0.c(lg0.o.class))).Ai(((p05.l2) ((lg0.o) i95.n0.c(lg0.o.class))).wi("roi_c2c_face"), Ni);
        } else {
            Ni = -1;
        }
        videoTransPara.Q = Ni;
        videoTransPara.B = 0;
        videoTransPara.C = 36;
        videoTransPara.f71207w = 0.52f;
        videoTransPara.f71208x = 1.0f;
        videoTransPara.f71206v = 0;
        boolean bj6 = ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).bj();
        com.tencent.mars.xlog.Log.i("MicroMsg.CompressOriginalMediaService", "getABAPras, enableH265 = " + bj6);
        videoTransPara.A = bj6 ? 1 : 0;
        videoTransPara.D = 0;
        videoTransPara.E = 51;
        videoTransPara.F = videoTransPara.f71194g;
        videoTransPara.G = 1;
        if ((wo.r.a() & 255) < 30 || android.os.Build.VERSION.SDK_INT <= 25) {
            videoTransPara.f71205u = 0;
        }
        return videoTransPara;
    }

    public final aw1.o0 h() {
        com.tencent.mm.sdk.platformtools.o4 o4Var = f14579l;
        return new aw1.o0(o4Var.q("mmkv_compress_original_media_last_task_compressed_size", 0L), o4Var.q("mmkv_compress_original_media_last_task_send_compressed_size", 0L), o4Var.q("mmkv_compress_original_media_last_task_recv_compressed_size", 0L), o4Var.q("mmkv_compress_original_media_last_task_send_expected_size", 0L), o4Var.q("mmkv_compress_original_media_last_task_recv_expected_size", 0L));
    }

    public final java.util.List i() {
        return (java.util.List) ((jz5.n) f14585r).getValue();
    }

    public final boolean j(java.lang.String str, java.lang.String str2) {
        m11.b b17 = m11.c.b(str);
        int i17 = b17.f322631d;
        int i18 = b17.f322630c;
        com.tencent.mm.pointers.PBool pBool = new com.tencent.mm.pointers.PBool();
        pBool.value = true;
        com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
        com.tencent.mm.vfs.r6 n17 = lp0.b.h0("wxam_temp").n();
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str3 = a17.f213279f;
        if (str3 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        java.lang.String str4 = a17.f213279f;
        int lastIndexOf = str4.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str4 = str4.substring(lastIndexOf + 1);
        }
        java.lang.String o17 = new com.tencent.mm.vfs.r6(n17, str4).o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        boolean f17 = m11.c.f(str, o17, i18, i17, pBool, 70, 0, false);
        if (f17) {
            f17 = ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).Ui(o17, str2, 1) >= 0;
        }
        com.tencent.mm.vfs.w6.h(o17);
        return f17;
    }

    public final synchronized void k(java.util.Set msgIdSet, boolean z17) {
        kotlin.jvm.internal.o.g(msgIdSet, "msgIdSet");
        com.tencent.mars.xlog.Log.i("MicroMsg.CompressOriginalMediaService", "compressOriginalImage, isResume = " + z17 + ", isTaskRunning = " + f14574g + ", msgIdSet = " + msgIdSet.size());
        if (msgIdSet.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CompressOriginalMediaService", "compressOriginalMedia, empty set, return");
            return;
        }
        if (f14574g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CompressOriginalMediaService", "compressOriginalMedia, task already running, return");
            return;
        }
        f14586s = new java.util.concurrent.atomic.AtomicInteger(0);
        f14584q = java.lang.System.currentTimeMillis();
        synchronized (this) {
            if (!f14575h) {
                ((com.tencent.mm.feature.performance.adpf.s0) ((ob0.f) i95.n0.c(ob0.f.class))).Di(com.tencent.mm.plugin.clean.logic.CompressOriginalMediaService$CompressOriginalMediaAdpfCallback.INSTANCE);
                f14575h = true;
            }
            android.os.CancellationSignal cancellationSignal = new android.os.CancellationSignal();
            f14577j = cancellationSignal;
            f14587t = new d11.d(13);
            if (z17) {
                f14570c = true;
                f14569b = 1;
            } else {
                f14580m.d();
                java.util.Iterator it = msgIdSet.iterator();
                while (it.hasNext()) {
                    f14580m.B(java.lang.String.valueOf(((java.lang.Number) ((jz5.l) it.next()).f302834e).longValue()), 0L);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.CompressOriginalMediaService", "Save msgid and path to MMKV done");
                com.tencent.mm.sdk.platformtools.o4 o4Var = f14579l;
                o4Var.remove("mmkv_compress_original_media_last_task_compressed_size");
                o4Var.remove("mmkv_compress_original_media_last_task_send_compressed_size");
                o4Var.remove("mmkv_compress_original_media_last_task_recv_compressed_size");
                o4Var.remove("mmkv_compress_original_media_last_task_send_expected_size");
                o4Var.remove("mmkv_compress_original_media_last_task_recv_expected_size");
                o4Var.putLong("mmkv_compress_original_last_task_start_time", java.lang.System.currentTimeMillis());
                long D = com.tencent.mm.sdk.platformtools.t8.D(com.tencent.mm.sdk.platformtools.x2.f193071a);
                com.tencent.mars.xlog.Log.i("MicroMsg.CompressOriginalMediaService", "totalMemInGb = " + D);
                if (D > 10) {
                    f14569b = 4;
                }
            }
            if (kotlin.jvm.internal.o.b("1", j62.e.g().a("clicfg_compress_media_single_thread", "0", false, true))) {
                f14569b = 1;
            }
            com.tencent.mm.sdk.platformtools.o4 o4Var2 = f14579l;
            o4Var2.G("mmkv_compress_original_media_unfinished_flag", true);
            int size = msgIdSet.size();
            o4Var2.A("mmkv_compress_original_media_total_count", size);
            java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
            java.util.concurrent.atomic.AtomicLong atomicLong = new java.util.concurrent.atomic.AtomicLong(o4Var2.q("mmkv_compress_original_media_compressed_size", 0L));
            java.util.concurrent.atomic.AtomicLong atomicLong2 = new java.util.concurrent.atomic.AtomicLong(o4Var2.q("mmkv_compress_original_media_send_compressed_size", 0L));
            java.util.concurrent.atomic.AtomicLong atomicLong3 = new java.util.concurrent.atomic.AtomicLong(o4Var2.q("mmkv_compress_original_media_recv_compressed_size", 0L));
            java.util.concurrent.atomic.AtomicLong atomicLong4 = new java.util.concurrent.atomic.AtomicLong(o4Var2.q("mmkv_compress_original_media_recv_expected_size", 0L));
            java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(o4Var2.q("mmkv_compress_original_media_recv_expected_size", 0L));
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            com.tencent.mm.sdk.platformtools.o4 o4Var3 = f14582o;
            h0Var.f310123d = new java.util.concurrent.atomic.AtomicLong(o4Var3.q("mmkv_compress_original_media_report_send_img", 0L));
            kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
            h0Var2.f310123d = new java.util.concurrent.atomic.AtomicLong(o4Var3.q("mmkv_compress_original_media_report_recv_img", 0L));
            kotlin.jvm.internal.h0 h0Var3 = new kotlin.jvm.internal.h0();
            h0Var3.f310123d = new java.util.concurrent.atomic.AtomicLong(o4Var3.q("mmkv_compress_original_media_report_send_video", 0L));
            kotlin.jvm.internal.h0 h0Var4 = new kotlin.jvm.internal.h0();
            h0Var4.f310123d = new java.util.concurrent.atomic.AtomicLong(o4Var3.q("mmkv_compress_original_media_report_recv_video", 0L));
            jx3.f.INSTANCE.d(26980, java.lang.Integer.valueOf(com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL), java.lang.Integer.valueOf(size));
            boolean z18 = l75.d1.f316945a;
            if (!l75.d1.f316945a) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CompressOriginalMediaService", "before compressRunnable");
                ((ku5.t0) ku5.t0.f312615d).a(new aw1.j0(msgIdSet, cancellationSignal, atomicLong2, atomicLong3, atomicLong4, h0Var, h0Var2, h0Var3, h0Var4, atomicInteger, size, atomicLong, atomicLong5));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.CompressOriginalMediaService", "diskFull return");
                java.util.Iterator it6 = f14576i.iterator();
                while (it6.hasNext()) {
                    ((aw1.f0) it6.next()).a(1.0f, 0L, 0L, 0L, 0L, 0L, true);
                }
            }
        }
    }

    public final void l() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CompressOriginalMediaService", "suspendTaskManuallySync, compressingFileCount = " + f14586s.get());
        f14571d = true;
        f14572e = true;
        while (f14586s.get() > 0) {
            try {
                java.lang.Thread.sleep(1000L);
            } catch (java.lang.Throwable unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CompressOriginalMediaService", "suspendTaskManuallySync sleep error");
            }
        }
    }

    public final void m() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CompressOriginalMediaService", "tryToResumeCompressMediaTaskAsync");
        boolean z17 = l75.d1.f316945a;
        if (l75.d1.f316945a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CompressOriginalMediaService", "diskFull return");
            return;
        }
        if (!kotlin.jvm.internal.o.b("1", j62.e.g().a("clicfg_resume_unifinish_compress_task", "1", false, true))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CompressOriginalMediaService", "tryToResumeCompressMediaTaskAsync expt false, return");
            return;
        }
        a();
        if (!f14579l.i("mmkv_compress_original_media_unfinished_flag", false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CompressOriginalMediaService", "NO unfinished task, return");
            return;
        }
        long q17 = com.tencent.mm.sdk.platformtools.o4.L().q("compress_task_last_resume_time", 0L);
        long q18 = com.tencent.mm.sdk.platformtools.o4.L().q("compress_task_last_resume_count", 0L) + 1;
        if (java.lang.System.currentTimeMillis() - q17 > 600000) {
            q18 = 0;
        }
        com.tencent.mm.sdk.platformtools.o4.L().B("compress_task_last_resume_count", q18);
        com.tencent.mars.xlog.Log.i("MicroMsg.CompressOriginalMediaService", "tryToResumeCompressMediaTaskAsync, lastCount = " + q18);
        if (q18 > 3) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CompressOriginalMediaService", "too frequent resume, task finish");
            e(true);
            com.tencent.mm.sdk.platformtools.o4.L().B("compress_task_last_resume_count", 0L);
            com.tencent.mm.sdk.platformtools.o4.L().B("compress_task_last_resume_time", 0L);
            jx3.f.INSTANCE.d(26980, -40000);
            return;
        }
        com.tencent.mm.sdk.platformtools.o4.L().B("compress_task_last_resume_time", java.lang.System.currentTimeMillis());
        java.util.HashSet hashSet = new java.util.HashSet();
        java.lang.String[] b17 = com.tencent.mm.sdk.platformtools.o4.J("mmkv_compress_original_media_record", f14578k, 1).b();
        kotlin.jvm.internal.o.f(b17, "allKeys(...)");
        for (java.lang.String str : b17) {
            kotlin.jvm.internal.o.d(str);
            long parseLong = java.lang.Long.parseLong(str);
            java.lang.String h27 = mt1.b0.f331191a.n().h2(parseLong);
            if (h27 == null) {
                h27 = "talker-ignore";
            }
            hashSet.add(new jz5.l(h27, java.lang.Long.valueOf(parseLong)));
        }
        k(hashSet, true);
    }

    public final void n() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CompressOriginalMediaService", "wakeTask");
        if (f14572e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CompressOriginalMediaService", "wakeTask suspended manually, return");
            return;
        }
        f14571d = false;
        synchronized (f14573f) {
            try {
                f14573f.notifyAll();
                com.tencent.mars.xlog.Log.i("MicroMsg.CompressOriginalMediaService", "wakeTask impl notify");
            } catch (java.lang.InterruptedException unused) {
            }
        }
    }
}
