package com.tencent.mm.modelvideoh265toh264;

/* loaded from: classes10.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Object f71695a = new java.lang.Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f71696b;

    public static com.tencent.mm.modelcontrol.VideoTransPara a(java.lang.String str) {
        android.media.MediaFormat mediaFormat;
        com.tencent.mars.xlog.Log.i("MicroMsg.TransferUtil", "buildPara：srcPath %s ", str);
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = new com.tencent.mm.modelcontrol.VideoTransPara();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(h(str));
        com.tencent.mars.xlog.Log.i("MicroMsg.TransferUtil", "Video format is h265 : %s", valueOf);
        if (valueOf.booleanValue()) {
            try {
                gp.d dVar = new gp.d();
                dVar.setDataSource(str);
                int P = com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(9), 0);
                videoTransPara.f71195h = P;
                videoTransPara.f71195h = com.tencent.mm.sdk.platformtools.t8.V1(P);
                videoTransPara.f71191d = com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(18), 0);
                videoTransPara.f71192e = com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(19), 0);
                videoTransPara.f71194g = com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(20), 0);
                d(str, videoTransPara);
                dVar.release();
            } catch (java.io.IOException | java.lang.RuntimeException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TransferUtil", e17, "fetch mediaInfo from MediaMetadataRetriever failed, srcPath: %s", str);
                com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(str, true);
                if (d17 != null) {
                    videoTransPara.f71195h = com.tencent.mm.sdk.platformtools.t8.V1(d17.f162382a);
                    videoTransPara.f71191d = d17.f162384c;
                    videoTransPara.f71192e = d17.f162385d;
                    videoTransPara.f71194g = d17.f162383b;
                    videoTransPara.f71193f = d17.f162386e;
                }
            }
            if (videoTransPara.f71194g <= 0 || videoTransPara.f71192e <= 0 || videoTransPara.f71191d <= 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TransferUtil", "error get video info, retry");
                gp.c cVar = new gp.c();
                try {
                    try {
                        cVar.k(str);
                        int i17 = 0;
                        while (true) {
                            if (i17 >= cVar.d()) {
                                mediaFormat = null;
                                break;
                            }
                            mediaFormat = cVar.e(i17);
                            if (mediaFormat.containsKey("mime") && mediaFormat.getString("mime").contains("video")) {
                                break;
                            }
                            i17++;
                        }
                        if (mediaFormat != null) {
                            if (mediaFormat.containsKey("durationUs")) {
                                int integer = mediaFormat.getInteger("durationUs");
                                videoTransPara.f71195h = integer;
                                videoTransPara.f71195h = java.lang.Math.round(integer / 1000000.0f);
                            }
                            if (mediaFormat.containsKey("width") && mediaFormat.containsKey("height")) {
                                videoTransPara.f71191d = mediaFormat.getInteger("width");
                                videoTransPara.f71192e = mediaFormat.getInteger("height");
                            }
                            if (mediaFormat.containsKey(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE)) {
                                videoTransPara.f71194g = mediaFormat.getInteger(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE);
                            }
                        }
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TransferUtil", e18, "retry get video info error", new java.lang.Object[0]);
                    }
                } finally {
                    cVar.g();
                }
            }
        } else {
            com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
            com.tencent.mm.pointers.PInt pInt2 = new com.tencent.mm.pointers.PInt();
            com.tencent.mm.pointers.PInt pInt3 = new com.tencent.mm.pointers.PInt();
            com.tencent.mm.pointers.PInt pInt4 = new com.tencent.mm.pointers.PInt();
            com.tencent.mm.pointers.PInt pInt5 = new com.tencent.mm.pointers.PInt();
            com.tencent.mm.plugin.sight.base.e.f(str, pInt, pInt2, pInt3, pInt4, pInt5);
            videoTransPara.f71195h = com.tencent.mm.sdk.platformtools.t8.V1(pInt.value);
            videoTransPara.f71191d = pInt2.value;
            videoTransPara.f71192e = pInt3.value;
            videoTransPara.f71193f = pInt4.value;
            videoTransPara.f71194g = pInt5.value;
        }
        return videoTransPara;
    }

    public static com.tencent.mm.modelcontrol.VideoTransPara b(com.tencent.mm.modelcontrol.VideoTransPara videoTransPara, java.lang.String str) {
        com.tencent.mm.modelcontrol.VideoTransPara bj6 = d11.s.fj().bj(videoTransPara, null);
        if (bj6 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TransferUtil", "get C2C album video para is null. old para %s", videoTransPara);
            try {
                com.tencent.mm.modelcontrol.VideoTransPara videoTransPara2 = new com.tencent.mm.modelcontrol.VideoTransPara();
                int[] iArr = new int[2];
                g(str, iArr);
                videoTransPara2.f71191d = iArr[0];
                videoTransPara2.f71192e = iArr[1];
                videoTransPara2.f71194g = com.tencent.mm.plugin.sight.base.d.f162408c;
                videoTransPara2.f71202r = com.tencent.mm.plugin.sight.base.d.f162407b;
                videoTransPara2.f71201q = 2;
                videoTransPara2.f71193f = (int) com.tencent.mm.plugin.sight.base.d.f162409d;
                videoTransPara2.f71195h = f(str);
                return videoTransPara2;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TransferUtil", e17, "compressBitrateDefault failed: %s", e17.getMessage());
                return null;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TransferUtil", "compress new para is %s  old para is:%s", bj6, videoTransPara);
        int i17 = videoTransPara.f71194g;
        if (i17 <= 640000 || bj6.f71194g > i17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TransferUtil", "new bitrate is bigger than old bitrate %s %s", bj6, videoTransPara);
            bj6.f71194g = java.lang.Math.max(java.lang.Math.min(bj6.f71194g, videoTransPara.f71194g), 640000);
        }
        int i18 = videoTransPara.f71191d;
        int i19 = videoTransPara.f71192e;
        if (i19 * i18 < bj6.f71191d * bj6.f71192e * 0.85d) {
            int i27 = i18 % 16;
            if (i27 != 0) {
                int i28 = (16 - i27) + i18;
                i18 = i28 < Integer.MAX_VALUE ? i28 : i18 - i27;
            }
            bj6.f71191d = i18;
            int i29 = i19 % 16;
            if (i29 != 0) {
                int i37 = (16 - i29) + i19;
                i19 = i37 < Integer.MAX_VALUE ? i37 : i19 - i29;
            }
            bj6.f71192e = i19;
            com.tencent.mars.xlog.Log.i("MicroMsg.TransferUtil", "new resolution is bigger than old, value[%d %d]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(bj6.f71192e));
        }
        if (videoTransPara.f71193f >= 45 && videoTransPara.f71195h * 1000 >= 180000) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TransferUtil", "make fps lower");
            bj6.f71193f = (int) com.tencent.mm.plugin.sight.base.d.f162409d;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TransferUtil", "final para is %s", videoTransPara);
        return bj6;
    }

    public static void c(java.lang.String str, java.lang.String str2, com.tencent.mm.modelcontrol.VideoTransPara videoTransPara, long j17) {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.TransferUtil", "fallbackTransferWithVideoTransfer, srcPath:%s, dstPath:%s, newPara:%s", str, str2, videoTransPara);
        com.tencent.mm.modelvideoh265toh264.m mVar = new com.tencent.mm.modelvideoh265toh264.m();
        mVar.b(str, str2, videoTransPara);
        mVar.f71714p = true;
        mVar.f71715q = true;
        int d17 = mVar.d(0L, f(str));
        com.tencent.mars.xlog.Log.i("MicroMsg.TransferUtil", "fallbackTransferWithVideoTransfer, finish, segRet:%s", java.lang.Integer.valueOf(d17));
        e(d17, j17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        r0 = r7.getInteger("frame-rate");
        r12.f71193f = r0;
        com.tencent.mars.xlog.Log.i("MicroMsg.TransferUtil", "fps: %s", java.lang.Integer.valueOf(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(java.lang.String r11, com.tencent.mm.modelcontrol.VideoTransPara r12) {
        /*
            java.lang.String r0 = "mime"
            java.lang.String r1 = "MicroMsg.TransferUtil"
            r2 = 1
            r3 = 0
            r4 = 0
            gp.c r5 = new gp.c     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L66
            r5.<init>()     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L66
            r5.k(r11)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            int r4 = r5.d()     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            r6 = r3
        L14:
            if (r6 >= r4) goto L5a
            android.media.MediaFormat r7 = r5.e(r6)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            boolean r8 = r7.containsKey(r0)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            if (r8 == 0) goto L57
            java.lang.String r8 = r7.getString(r0)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            boolean r8 = com.tencent.mm.sdk.platformtools.t8.K0(r8)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            if (r8 == 0) goto L2b
            goto L57
        L2b:
            java.lang.String r8 = r7.getString(r0)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            java.lang.String r9 = "mime: %s"
            java.lang.Object[] r10 = new java.lang.Object[]{r8}     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            com.tencent.mars.xlog.Log.i(r1, r9, r10)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            java.lang.String r9 = "video/"
            boolean r8 = r8.startsWith(r9)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            if (r8 == 0) goto L57
            java.lang.String r0 = "frame-rate"
            int r0 = r7.getInteger(r0)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            r12.f71193f = r0     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            java.lang.String r4 = "fps: %s"
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            r6[r3] = r0     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            com.tencent.mars.xlog.Log.i(r1, r4, r6)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            goto L5a
        L57:
            int r6 = r6 + 1
            goto L14
        L5a:
            r5.g()
            goto L8b
        L5e:
            r11 = move-exception
            r4 = r5
            goto L8c
        L61:
            r0 = move-exception
            r4 = r5
            goto L67
        L64:
            r11 = move-exception
            goto L8c
        L66:
            r0 = move-exception
        L67:
            java.lang.String r5 = "find fps error"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L64
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r0, r5, r6)     // Catch: java.lang.Throwable -> L64
            com.tencent.mm.plugin.sight.base.b r11 = com.tencent.mm.plugin.sight.base.e.d(r11, r2)     // Catch: java.lang.Throwable -> L64
            if (r11 == 0) goto L86
            int r11 = r11.f162386e     // Catch: java.lang.Throwable -> L64
            r12.f71193f = r11     // Catch: java.lang.Throwable -> L64
            java.lang.String r12 = "set fps from getMedia: %s"
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L64
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L64
            r0[r3] = r11     // Catch: java.lang.Throwable -> L64
            com.tencent.mars.xlog.Log.i(r1, r12, r0)     // Catch: java.lang.Throwable -> L64
        L86:
            if (r4 == 0) goto L8b
            r4.g()
        L8b:
            return
        L8c:
            if (r4 == 0) goto L91
            r4.g()
        L91:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelvideoh265toh264.j.d(java.lang.String, com.tencent.mm.modelcontrol.VideoTransPara):void");
    }

    public static void e(int i17, long j17) {
        if (i17 < 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TransferUtil", "Local tranfer to H264 failed：%s", java.lang.Integer.valueOf(i17));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TransferUtil", "Transfer Finish");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.TransferUtil", "totalTime：%d", java.lang.Long.valueOf(elapsedRealtime));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
        iDKey.SetID(com.tencent.mm.plugin.appbrand.jsapi.nfc.m.CTRL_INDEX);
        iDKey.SetKey(com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR);
        iDKey.SetValue(elapsedRealtime);
        com.tencent.mars.smc.IDKey iDKey2 = new com.tencent.mars.smc.IDKey();
        iDKey2.SetID(com.tencent.mm.plugin.appbrand.jsapi.nfc.m.CTRL_INDEX);
        iDKey2.SetKey(254);
        iDKey2.SetValue(1L);
        arrayList.add(iDKey);
        arrayList.add(iDKey2);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.j(arrayList, false, false);
    }

    public static int f(java.lang.String str) {
        gp.d dVar = new gp.d();
        dVar.setDataSource(str);
        java.lang.String extractMetadata = dVar.extractMetadata(9);
        try {
            dVar.release();
        } catch (java.io.IOException unused) {
        }
        if (extractMetadata == null) {
            return 0;
        }
        try {
            return java.lang.Integer.valueOf(extractMetadata).intValue();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TransferUtil", "getDuration error %s", e17.getMessage());
            return 0;
        }
    }

    public static void g(java.lang.String str, int[] iArr) {
        gp.d dVar;
        try {
            dVar = new gp.d();
            try {
                dVar.setDataSource(str);
                int P = com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(18), 0);
                int P2 = com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(19), 0);
                iArr[0] = P;
                iArr[1] = P2;
                for (int i17 = 0; i17 < 3; i17++) {
                    if (P % 2 == 0 && P2 % 2 == 0) {
                        if ((P >= P2 && (P <= 640 || P2 <= 480)) || (P <= P2 && (P <= 480 || P2 <= 640))) {
                            break;
                        }
                        P /= 2;
                        P2 /= 2;
                    }
                    try {
                        dVar.release();
                        return;
                    } catch (java.io.IOException unused) {
                        return;
                    }
                }
                iArr[0] = P;
                iArr[1] = P2;
                try {
                    dVar.release();
                } catch (java.io.IOException unused2) {
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                if (dVar != null) {
                    try {
                        dVar.release();
                    } catch (java.io.IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            dVar = null;
        }
    }

    public static boolean h(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TransferUtil", "Check video format：h265 or h264？");
        return t21.u2.b(str);
    }

    public static void i(java.lang.String str, com.tencent.mm.modelcontrol.VideoTransPara videoTransPara) {
        if (videoTransPara == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TransferUtil", "checkRemuxResult newPara == null");
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TransferUtil", "checkRemuxResult path is empty, destPath:[%s]", str);
            return;
        }
        com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.pointers.PInt pInt2 = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.pointers.PInt pInt3 = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.pointers.PInt pInt4 = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.pointers.PInt pInt5 = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.plugin.sight.base.e.f(str, pInt, pInt2, pInt3, pInt4, pInt5);
        float L = com.tencent.mm.sdk.platformtools.t8.L(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("MMSightCheckSendVideoBitrateLimit"), 1.3f);
        int i17 = pInt5.value;
        int i18 = videoTransPara.f71194g;
        if (i17 < L * i18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TransferUtil", "checkRemuxResult success currentBitrate:[%d], maxBitrate:[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.w("MicroMsg.TransferUtil", "checkRemuxResult fail currentBitrate:[%d], maxBitrate:[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        java.lang.String str2 = str + ".check_temp";
        com.tencent.mm.vfs.w6.c(str, str2);
        com.tencent.mm.vfs.w6.h(str);
        int remuxingVFS = com.tencent.mm.plugin.sight.base.SightVideoJNI.remuxingVFS(str2, str, videoTransPara.f71191d, videoTransPara.f71192e, videoTransPara.f71194g, videoTransPara.f71202r, 8, videoTransPara.f71201q, 25.0f, videoTransPara.f71193f, null, 0, false, 0, 51);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 119L, 1L);
        com.tencent.mars.xlog.Log.i("MicroMsg.TransferUtil", "checkRemuxResult speedTime:[%s], remuxingVFS ret:[%d]", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(remuxingVFS));
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0100 A[Catch: Exception -> 0x02a7, LOOP:0: B:105:0x0100->B:107:0x0104, LOOP_START, PHI: r1
  0x0100: PHI (r1v20 int) = (r1v19 int), (r1v21 int) binds: [B:87:0x00fd, B:107:0x0104] A[DONT_GENERATE, DONT_INLINE], TryCatch #4 {Exception -> 0x02a7, blocks: (B:3:0x002c, B:5:0x0033, B:9:0x0061, B:13:0x0073, B:15:0x0095, B:73:0x00a8, B:75:0x00ae, B:77:0x00b2, B:79:0x00d8, B:80:0x00e0, B:83:0x00e9, B:86:0x00f9, B:89:0x0107, B:91:0x010b, B:94:0x0111, B:95:0x0149, B:101:0x0174, B:105:0x0100, B:107:0x0104, B:109:0x00f2, B:111:0x00f6, B:121:0x004c, B:123:0x005d), top: B:2:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00f2 A[Catch: Exception -> 0x02a7, LOOP:1: B:109:0x00f2->B:111:0x00f6, LOOP_START, PHI: r1
  0x00f2: PHI (r1v16 int) = (r1v15 int), (r1v17 int) binds: [B:84:0x00ed, B:111:0x00f6] A[DONT_GENERATE, DONT_INLINE], TryCatch #4 {Exception -> 0x02a7, blocks: (B:3:0x002c, B:5:0x0033, B:9:0x0061, B:13:0x0073, B:15:0x0095, B:73:0x00a8, B:75:0x00ae, B:77:0x00b2, B:79:0x00d8, B:80:0x00e0, B:83:0x00e9, B:86:0x00f9, B:89:0x0107, B:91:0x010b, B:94:0x0111, B:95:0x0149, B:101:0x0174, B:105:0x0100, B:107:0x0104, B:109:0x00f2, B:111:0x00f6, B:121:0x004c, B:123:0x005d), top: B:2:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0095 A[Catch: Exception -> 0x02a7, TryCatch #4 {Exception -> 0x02a7, blocks: (B:3:0x002c, B:5:0x0033, B:9:0x0061, B:13:0x0073, B:15:0x0095, B:73:0x00a8, B:75:0x00ae, B:77:0x00b2, B:79:0x00d8, B:80:0x00e0, B:83:0x00e9, B:86:0x00f9, B:89:0x0107, B:91:0x010b, B:94:0x0111, B:95:0x0149, B:101:0x0174, B:105:0x0100, B:107:0x0104, B:109:0x00f2, B:111:0x00f6, B:121:0x004c, B:123:0x005d), top: B:2:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x025e A[Catch: all -> 0x0233, Exception -> 0x0289, TryCatch #0 {all -> 0x0233, blocks: (B:21:0x01b2, B:23:0x024d, B:25:0x025e, B:26:0x0276, B:32:0x028a, B:42:0x01c7, B:45:0x01dd, B:47:0x01e9, B:48:0x01eb, B:62:0x0228, B:63:0x0229, B:66:0x0237), top: B:17:0x01ae }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00a8 A[Catch: Exception -> 0x02a7, TryCatch #4 {Exception -> 0x02a7, blocks: (B:3:0x002c, B:5:0x0033, B:9:0x0061, B:13:0x0073, B:15:0x0095, B:73:0x00a8, B:75:0x00ae, B:77:0x00b2, B:79:0x00d8, B:80:0x00e0, B:83:0x00e9, B:86:0x00f9, B:89:0x0107, B:91:0x010b, B:94:0x0111, B:95:0x0149, B:101:0x0174, B:105:0x0100, B:107:0x0104, B:109:0x00f2, B:111:0x00f6, B:121:0x004c, B:123:0x005d), top: B:2:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010b A[Catch: Exception -> 0x02a7, TryCatch #4 {Exception -> 0x02a7, blocks: (B:3:0x002c, B:5:0x0033, B:9:0x0061, B:13:0x0073, B:15:0x0095, B:73:0x00a8, B:75:0x00ae, B:77:0x00b2, B:79:0x00d8, B:80:0x00e0, B:83:0x00e9, B:86:0x00f9, B:89:0x0107, B:91:0x010b, B:94:0x0111, B:95:0x0149, B:101:0x0174, B:105:0x0100, B:107:0x0104, B:109:0x00f2, B:111:0x00f6, B:121:0x004c, B:123:0x005d), top: B:2:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0111 A[Catch: Exception -> 0x02a7, TryCatch #4 {Exception -> 0x02a7, blocks: (B:3:0x002c, B:5:0x0033, B:9:0x0061, B:13:0x0073, B:15:0x0095, B:73:0x00a8, B:75:0x00ae, B:77:0x00b2, B:79:0x00d8, B:80:0x00e0, B:83:0x00e9, B:86:0x00f9, B:89:0x0107, B:91:0x010b, B:94:0x0111, B:95:0x0149, B:101:0x0174, B:105:0x0100, B:107:0x0104, B:109:0x00f2, B:111:0x00f6, B:121:0x004c, B:123:0x005d), top: B:2:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0149 A[Catch: Exception -> 0x02a7, TryCatch #4 {Exception -> 0x02a7, blocks: (B:3:0x002c, B:5:0x0033, B:9:0x0061, B:13:0x0073, B:15:0x0095, B:73:0x00a8, B:75:0x00ae, B:77:0x00b2, B:79:0x00d8, B:80:0x00e0, B:83:0x00e9, B:86:0x00f9, B:89:0x0107, B:91:0x010b, B:94:0x0111, B:95:0x0149, B:101:0x0174, B:105:0x0100, B:107:0x0104, B:109:0x00f2, B:111:0x00f6, B:121:0x004c, B:123:0x005d), top: B:2:0x002c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int j(java.lang.String r51, java.lang.String r52, com.tencent.mm.modelcontrol.VideoTransPara r53, boolean r54) {
        /*
            Method dump skipped, instructions count: 697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelvideoh265toh264.j.j(java.lang.String, java.lang.String, com.tencent.mm.modelcontrol.VideoTransPara, boolean):int");
    }
}
