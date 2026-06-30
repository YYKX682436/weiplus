package com.p314xaae8f345.mm.p962x4177e4be;

/* loaded from: classes10.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Object f153228a = new java.lang.Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f153229b;

    public static com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d a(java.lang.String str) {
        android.media.MediaFormat mediaFormat;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransferUtil", "buildPara：srcPath %s ", str);
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = new com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(h(str));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransferUtil", "Video format is h265 : %s", valueOf);
        if (valueOf.booleanValue()) {
            try {
                gp.d dVar = new gp.d();
                dVar.setDataSource(str);
                int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(9), 0);
                c11120x15dce88d.f152728h = P;
                c11120x15dce88d.f152728h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V1(P);
                c11120x15dce88d.f152724d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(18), 0);
                c11120x15dce88d.f152725e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(19), 0);
                c11120x15dce88d.f152727g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(20), 0);
                d(str, c11120x15dce88d);
                dVar.release();
            } catch (java.io.IOException | java.lang.RuntimeException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TransferUtil", e17, "fetch mediaInfo from MediaMetadataRetriever failed, srcPath: %s", str);
                com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(str, true);
                if (d17 != null) {
                    c11120x15dce88d.f152728h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V1(d17.f243915a);
                    c11120x15dce88d.f152724d = d17.f243917c;
                    c11120x15dce88d.f152725e = d17.f243918d;
                    c11120x15dce88d.f152727g = d17.f243916b;
                    c11120x15dce88d.f152726f = d17.f243919e;
                }
            }
            if (c11120x15dce88d.f152727g <= 0 || c11120x15dce88d.f152725e <= 0 || c11120x15dce88d.f152724d <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TransferUtil", "error get video info, retry");
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
                                c11120x15dce88d.f152728h = integer;
                                c11120x15dce88d.f152728h = java.lang.Math.round(integer / 1000000.0f);
                            }
                            if (mediaFormat.containsKey("width") && mediaFormat.containsKey("height")) {
                                c11120x15dce88d.f152724d = mediaFormat.getInteger("width");
                                c11120x15dce88d.f152725e = mediaFormat.getInteger("height");
                            }
                            if (mediaFormat.containsKey(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63)) {
                                c11120x15dce88d.f152727g = mediaFormat.getInteger(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63);
                            }
                        }
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TransferUtil", e18, "retry get video info error", new java.lang.Object[0]);
                    }
                } finally {
                    cVar.g();
                }
            }
        } else {
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f3 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f4 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f5 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.f(str, c19767x257d7f, c19767x257d7f2, c19767x257d7f3, c19767x257d7f4, c19767x257d7f5);
            c11120x15dce88d.f152728h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V1(c19767x257d7f.f38864x6ac9171);
            c11120x15dce88d.f152724d = c19767x257d7f2.f38864x6ac9171;
            c11120x15dce88d.f152725e = c19767x257d7f3.f38864x6ac9171;
            c11120x15dce88d.f152726f = c19767x257d7f4.f38864x6ac9171;
            c11120x15dce88d.f152727g = c19767x257d7f5.f38864x6ac9171;
        }
        return c11120x15dce88d;
    }

    public static com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d b(com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d, java.lang.String str) {
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d bj6 = d11.s.fj().bj(c11120x15dce88d, null);
        if (bj6 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransferUtil", "get C2C album video para is null. old para %s", c11120x15dce88d);
            try {
                com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d2 = new com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d();
                int[] iArr = new int[2];
                g(str, iArr);
                c11120x15dce88d2.f152724d = iArr[0];
                c11120x15dce88d2.f152725e = iArr[1];
                c11120x15dce88d2.f152727g = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.d.f243941c;
                c11120x15dce88d2.f152735r = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.d.f243940b;
                c11120x15dce88d2.f152734q = 2;
                c11120x15dce88d2.f152726f = (int) com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.d.f243942d;
                c11120x15dce88d2.f152728h = f(str);
                return c11120x15dce88d2;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TransferUtil", e17, "compressBitrateDefault failed: %s", e17.getMessage());
                return null;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransferUtil", "compress new para is %s  old para is:%s", bj6, c11120x15dce88d);
        int i17 = c11120x15dce88d.f152727g;
        if (i17 <= 640000 || bj6.f152727g > i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransferUtil", "new bitrate is bigger than old bitrate %s %s", bj6, c11120x15dce88d);
            bj6.f152727g = java.lang.Math.max(java.lang.Math.min(bj6.f152727g, c11120x15dce88d.f152727g), 640000);
        }
        int i18 = c11120x15dce88d.f152724d;
        int i19 = c11120x15dce88d.f152725e;
        if (i19 * i18 < bj6.f152724d * bj6.f152725e * 0.85d) {
            int i27 = i18 % 16;
            if (i27 != 0) {
                int i28 = (16 - i27) + i18;
                i18 = i28 < Integer.MAX_VALUE ? i28 : i18 - i27;
            }
            bj6.f152724d = i18;
            int i29 = i19 % 16;
            if (i29 != 0) {
                int i37 = (16 - i29) + i19;
                i19 = i37 < Integer.MAX_VALUE ? i37 : i19 - i29;
            }
            bj6.f152725e = i19;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransferUtil", "new resolution is bigger than old, value[%d %d]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(bj6.f152725e));
        }
        if (c11120x15dce88d.f152726f >= 45 && c11120x15dce88d.f152728h * 1000 >= 180000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransferUtil", "make fps lower");
            bj6.f152726f = (int) com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.d.f243942d;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransferUtil", "final para is %s", c11120x15dce88d);
        return bj6;
    }

    public static void c(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d, long j17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.TransferUtil", "fallbackTransferWithVideoTransfer, srcPath:%s, dstPath:%s, newPara:%s", str, str2, c11120x15dce88d);
        com.p314xaae8f345.mm.p962x4177e4be.m mVar = new com.p314xaae8f345.mm.p962x4177e4be.m();
        mVar.b(str, str2, c11120x15dce88d);
        mVar.f153247p = true;
        mVar.f153248q = true;
        int d17 = mVar.d(0L, f(str));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransferUtil", "fallbackTransferWithVideoTransfer, finish, segRet:%s", java.lang.Integer.valueOf(d17));
        e(d17, j17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        r0 = r7.getInteger("frame-rate");
        r12.f152726f = r0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransferUtil", "fps: %s", java.lang.Integer.valueOf(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(java.lang.String r11, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d r12) {
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
            boolean r8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r8)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            if (r8 == 0) goto L2b
            goto L57
        L2b:
            java.lang.String r8 = r7.getString(r0)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            java.lang.String r9 = "mime: %s"
            java.lang.Object[] r10 = new java.lang.Object[]{r8}     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r9, r10)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            java.lang.String r9 = "video/"
            boolean r8 = r8.startsWith(r9)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            if (r8 == 0) goto L57
            java.lang.String r0 = "frame-rate"
            int r0 = r7.getInteger(r0)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            r12.f152726f = r0     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            java.lang.String r4 = "fps: %s"
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            r6[r3] = r0     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r4, r6)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r0, r5, r6)     // Catch: java.lang.Throwable -> L64
            com.tencent.mm.plugin.sight.base.b r11 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(r11, r2)     // Catch: java.lang.Throwable -> L64
            if (r11 == 0) goto L86
            int r11 = r11.f243919e     // Catch: java.lang.Throwable -> L64
            r12.f152726f = r11     // Catch: java.lang.Throwable -> L64
            java.lang.String r12 = "set fps from getMedia: %s"
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L64
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L64
            r0[r3] = r11     // Catch: java.lang.Throwable -> L64
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r12, r0)     // Catch: java.lang.Throwable -> L64
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p962x4177e4be.j.d(java.lang.String, com.tencent.mm.modelcontrol.VideoTransPara):void");
    }

    public static void e(int i17, long j17) {
        if (i17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransferUtil", "Local tranfer to H264 failed：%s", java.lang.Integer.valueOf(i17));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransferUtil", "Transfer Finish");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransferUtil", "totalTime：%d", java.lang.Long.valueOf(elapsedRealtime));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        c4582x424c344.m40330x4c144dd(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.m.f34560x366c91de);
        c4582x424c344.m40331x936762bd(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.f53182x14a8432);
        c4582x424c344.m40332x57b2b64f(elapsedRealtime);
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3442 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        c4582x424c3442.m40330x4c144dd(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.m.f34560x366c91de);
        c4582x424c3442.m40331x936762bd(254);
        c4582x424c3442.m40332x57b2b64f(1L);
        arrayList.add(c4582x424c344);
        arrayList.add(c4582x424c3442);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.j(arrayList, false, false);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TransferUtil", "getDuration error %s", e17.getMessage());
            return 0;
        }
    }

    public static void g(java.lang.String str, int[] iArr) {
        gp.d dVar;
        try {
            dVar = new gp.d();
            try {
                dVar.setDataSource(str);
                int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(18), 0);
                int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(19), 0);
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransferUtil", "Check video format：h265 or h264？");
        return t21.u2.b(str);
    }

    public static void i(java.lang.String str, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d) {
        if (c11120x15dce88d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TransferUtil", "checkRemuxResult newPara == null");
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TransferUtil", "checkRemuxResult path is empty, destPath:[%s]", str);
            return;
        }
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f3 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f4 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f5 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.f(str, c19767x257d7f, c19767x257d7f2, c19767x257d7f3, c19767x257d7f4, c19767x257d7f5);
        float L = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("MMSightCheckSendVideoBitrateLimit"), 1.3f);
        int i17 = c19767x257d7f5.f38864x6ac9171;
        int i18 = c11120x15dce88d.f152727g;
        if (i17 < L * i18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransferUtil", "checkRemuxResult success currentBitrate:[%d], maxBitrate:[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TransferUtil", "checkRemuxResult fail currentBitrate:[%d], maxBitrate:[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        java.lang.String str2 = str + ".check_temp";
        com.p314xaae8f345.mm.vfs.w6.c(str, str2);
        com.p314xaae8f345.mm.vfs.w6.h(str);
        int m69233xcf34d77e = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69233xcf34d77e(str2, str, c11120x15dce88d.f152724d, c11120x15dce88d.f152725e, c11120x15dce88d.f152727g, c11120x15dce88d.f152735r, 8, c11120x15dce88d.f152734q, 25.0f, c11120x15dce88d.f152726f, null, 0, false, 0, 51);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 119L, 1L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransferUtil", "checkRemuxResult speedTime:[%s], remuxingVFS ret:[%d]", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(m69233xcf34d77e));
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
    public static int j(java.lang.String r51, java.lang.String r52, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d r53, boolean r54) {
        /*
            Method dump skipped, instructions count: 697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p962x4177e4be.j.j(java.lang.String, java.lang.String, com.tencent.mm.modelcontrol.VideoTransPara, boolean):int");
    }
}
