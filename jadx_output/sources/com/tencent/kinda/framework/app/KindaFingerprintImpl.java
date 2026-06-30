package com.tencent.kinda.framework.app;

/* loaded from: classes9.dex */
public class KindaFingerprintImpl implements com.tencent.kinda.gen.KFingerprintService {
    private static final int FINGER_TYPE_ACCUMULATE_COUNT = 50;
    private static final java.lang.String FINGER_TYPE_SEPARATOR = " ";
    static java.lang.String TAG = "KindaFingerprintImpl";
    private static com.tencent.kinda.gen.FingerType cacheFingerType;
    private static com.tencent.kinda.gen.KRect cacheRect;
    private static boolean cacheValid;
    private static com.tencent.kinda.gen.VoidCallback initEndCallback;
    private static long initStartTime;
    private static com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.OnSoterInitializedEvent> onSoterInitListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.OnSoterInitializedEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.kinda.framework.app.KindaFingerprintImpl.1
        {
            this.__eventId = -1482822212;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(final com.tencent.mm.autogen.events.OnSoterInitializedEvent onSoterInitializedEvent) {
            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.app.KindaFingerprintImpl.1.1
                @Override // java.lang.Runnable
                public void run() {
                    long j17;
                    com.tencent.kinda.framework.app.KindaFingerprintImpl.onSoterInitListener.dead();
                    if (com.tencent.kinda.framework.app.KindaFingerprintImpl.initStartTime > 0) {
                        long j18 = com.tencent.kinda.framework.app.KindaFingerprintImpl.initStartTime;
                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        j17 = java.lang.System.currentTimeMillis() - j18;
                        m05.i.f322570a.a("5", "5", java.lang.String.valueOf(onSoterInitializedEvent.f54584g.f6479a), java.lang.String.valueOf(j17));
                        long unused = com.tencent.kinda.framework.app.KindaFingerprintImpl.initStartTime = 0L;
                    } else {
                        j17 = -1;
                    }
                    if (com.tencent.kinda.framework.app.KindaFingerprintImpl.initEndCallback == null) {
                        com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.app.KindaFingerprintImpl.TAG, "init soter finish, but initEndEvent is null, maybe out time: %s %s, use time:%s", java.lang.Integer.valueOf(onSoterInitializedEvent.f54584g.f6479a), onSoterInitializedEvent.f54584g.f6480b, java.lang.Long.valueOf(j17));
                        return;
                    }
                    com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.app.KindaFingerprintImpl.TAG, "init soter finish, call initEndEvent: %s %s, use time:%s", java.lang.Integer.valueOf(onSoterInitializedEvent.f54584g.f6479a), onSoterInitializedEvent.f54584g.f6480b, java.lang.Long.valueOf(j17));
                    com.tencent.kinda.framework.app.KindaFingerprintImpl.initEndCallback.call();
                    com.tencent.kinda.gen.VoidCallback unused2 = com.tencent.kinda.framework.app.KindaFingerprintImpl.initEndCallback = null;
                }
            });
            return false;
        }
    };
    private static com.tencent.kinda.framework.app.FingerprintInsets vivoFingerHelper;
    private com.tencent.kinda.gen.VoidBoolCallback changePwdCallback;
    private com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.KindaActivityStopEvent> activetyListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.KindaActivityStopEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.kinda.framework.app.KindaFingerprintImpl.4
        {
            this.__eventId = 884305868;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.KindaActivityStopEvent kindaActivityStopEvent) {
            if (kindaActivityStopEvent != null && com.tencent.kinda.framework.app.KindaFingerprintImpl.this.changePwdCallback != null) {
                com.tencent.kinda.framework.app.KindaFingerprintImpl.this.changePwdCallback.call(false);
            }
            return false;
        }
    };
    pz2.a mgr = (pz2.a) gm0.j1.s(pz2.a.class);
    int identify_num = 0;
    private android.app.Dialog tipDialog = null;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[Catch: Exception -> 0x0084, TryCatch #0 {Exception -> 0x0084, blocks: (B:3:0x0003, B:5:0x000b, B:8:0x0013, B:11:0x0021, B:14:0x0028, B:15:0x003f, B:17:0x0048, B:19:0x006c, B:21:0x003b), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c A[Catch: Exception -> 0x0084, TRY_LEAVE, TryCatch #0 {Exception -> 0x0084, blocks: (B:3:0x0003, B:5:0x000b, B:8:0x0013, B:11:0x0021, B:14:0x0028, B:15:0x003f, B:17:0x0048, B:19:0x006c, B:21:0x003b), top: B:2:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void accumulateAndReportFingerType(com.tencent.kinda.gen.FingerType r8) {
        /*
            r7 = this;
            java.lang.String r0 = "MMKV_KEY_SOTER_FINGER_TYPE_ACCUMULATE"
            r1 = 0
            java.lang.String r2 = "mmkv.wallet"
            com.tencent.mm.sdk.platformtools.o4 r2 = com.tencent.mm.sdk.platformtools.o4.M(r2)     // Catch: java.lang.Exception -> L84
            if (r2 != 0) goto L13
            java.lang.String r8 = com.tencent.kinda.framework.app.KindaFingerprintImpl.TAG     // Catch: java.lang.Exception -> L84
            java.lang.String r0 = "accumulateAndReportFingerType, but payMMKV is null"
            com.tencent.mars.xlog.Log.e(r8, r0)     // Catch: java.lang.Exception -> L84
            return
        L13:
            java.lang.String r3 = ""
            java.lang.String r3 = r2.u(r0, r3)     // Catch: java.lang.Exception -> L84
            int r8 = r7.fingerTypeToValue(r8)     // Catch: java.lang.Exception -> L84
            java.lang.String r4 = " "
            if (r3 == 0) goto L3b
            boolean r5 = r3.isEmpty()     // Catch: java.lang.Exception -> L84
            if (r5 == 0) goto L28
            goto L3b
        L28:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L84
            r5.<init>()     // Catch: java.lang.Exception -> L84
            r5.append(r3)     // Catch: java.lang.Exception -> L84
            r5.append(r4)     // Catch: java.lang.Exception -> L84
            r5.append(r8)     // Catch: java.lang.Exception -> L84
            java.lang.String r8 = r5.toString()     // Catch: java.lang.Exception -> L84
            goto L3f
        L3b:
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Exception -> L84
        L3f:
            java.lang.String[] r3 = r8.split(r4)     // Catch: java.lang.Exception -> L84
            int r4 = r3.length     // Catch: java.lang.Exception -> L84
            r5 = 50
            if (r4 < r5) goto L6c
            java.lang.String r3 = com.tencent.kinda.framework.app.KindaFingerprintImpl.TAG     // Catch: java.lang.Exception -> L84
            java.lang.String r4 = "accumulateAndReportFingerType report, data: %s"
            java.lang.Object[] r5 = new java.lang.Object[]{r8}     // Catch: java.lang.Exception -> L84
            com.tencent.mars.xlog.Log.i(r3, r4, r5)     // Catch: java.lang.Exception -> L84
            r3 = 310(0x136, float:4.34E-43)
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> L84
            com.tencent.mm.plugin.report.service.g0 r4 = com.tencent.mm.plugin.report.service.g0.INSTANCE     // Catch: java.lang.Exception -> L84
            java.lang.String r5 = "8"
            java.lang.String r6 = "1"
            java.lang.Object[] r8 = new java.lang.Object[]{r5, r6, r3, r8}     // Catch: java.lang.Exception -> L84
            r3 = 24610(0x6022, float:3.4486E-41)
            r4.d(r3, r8)     // Catch: java.lang.Exception -> L84
            r2.W(r0)     // Catch: java.lang.Exception -> L84
            goto L8e
        L6c:
            r2.D(r0, r8)     // Catch: java.lang.Exception -> L84
            java.lang.String r0 = com.tencent.kinda.framework.app.KindaFingerprintImpl.TAG     // Catch: java.lang.Exception -> L84
            java.lang.String r2 = "accumulateAndReportFingerType saved, current count: %d, data: %s"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L84
            int r3 = r3.length     // Catch: java.lang.Exception -> L84
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L84
            r4[r1] = r3     // Catch: java.lang.Exception -> L84
            r3 = 1
            r4[r3] = r8     // Catch: java.lang.Exception -> L84
            com.tencent.mars.xlog.Log.i(r0, r2, r4)     // Catch: java.lang.Exception -> L84
            goto L8e
        L84:
            r8 = move-exception
            java.lang.String r0 = com.tencent.kinda.framework.app.KindaFingerprintImpl.TAG
            java.lang.String r2 = "accumulateAndReportFingerType exception"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.tencent.mars.xlog.Log.printErrStackTrace(r0, r8, r2, r1)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.kinda.framework.app.KindaFingerprintImpl.accumulateAndReportFingerType(com.tencent.kinda.gen.FingerType):void");
    }

    private com.tencent.kinda.gen.FingerType defaultFingerType() {
        return com.tencent.kinda.gen.FingerType.NONE;
    }

    private int fingerTypeToValue(com.tencent.kinda.gen.FingerType fingerType) {
        if (fingerType == com.tencent.kinda.gen.FingerType.NONE) {
            return 0;
        }
        if (fingerType == com.tencent.kinda.gen.FingerType.OUTSIDEFINGER) {
            return 1;
        }
        return fingerType == com.tencent.kinda.gen.FingerType.INSIDEFINGER ? 2 : 0;
    }

    private com.tencent.kinda.gen.KRect getFingerPosByMfg(java.lang.String str, android.content.Context context) {
        com.tencent.kinda.gen.KRect kRect = new com.tencent.kinda.gen.KRect(new com.tencent.kinda.gen.KPoint(0.0f, 0.0f), new com.tencent.kinda.gen.KSize(0.0f, 0.0f));
        try {
            if (str.contains("vivo")) {
                if (cacheValid) {
                    kRect = cacheRect;
                } else {
                    com.tencent.mars.xlog.Log.i(TAG, "vivo cache is invalid");
                }
            } else if (str.contains("meizu")) {
                kRect.mOrigin.mX = getSystemDimen(context, "under_glass_fp_x");
                kRect.mOrigin.mY = getSystemDimen(context, "under_glass_fp_y");
                kRect.mSize.mWidth = getSystemDimen(context, "under_glass_fp_width");
                kRect.mSize.mHeight = getSystemDimen(context, "under_glass_fp_height");
                com.tencent.mars.xlog.Log.i(TAG, "meizu pos is %s", kRect.toString());
            } else if (str.contains("huawei")) {
                java.lang.Object c17 = by5.j0.c("huawei.android.hardware.fingerprint.FingerprintManagerEx", "getHardwarePosition");
                if (c17 != null) {
                    com.tencent.mars.xlog.Log.i(TAG, "huawei pos %s", c17.toString());
                    if (c17 instanceof int[]) {
                        int[] iArr = (int[]) c17;
                        kRect.mOrigin.mX = i65.a.c(context, iArr[0]);
                        kRect.mOrigin.mY = i65.a.c(context, iArr[1]);
                    }
                } else {
                    com.tencent.mars.xlog.Log.i(TAG, "huawei pos is null");
                }
            } else if (str.contains("honor")) {
                java.lang.Object c18 = by5.j0.c("com.hihonor.android.hardware.fingerprint.FingerprintManagerEx", "getHardwarePosition");
                if (c18 != null) {
                    com.tencent.mars.xlog.Log.i(TAG, "honor pos %s", c18.toString());
                    if (c18 instanceof int[]) {
                        int[] iArr2 = (int[]) c18;
                        kRect.mOrigin.mX = i65.a.c(context, iArr2[0]);
                        kRect.mOrigin.mY = i65.a.c(context, iArr2[1]);
                    }
                } else {
                    com.tencent.mars.xlog.Log.i(TAG, "honor pos is null");
                }
            } else if (str.contains("xiaomi")) {
                java.lang.String a17 = wo.w1.a("persist.vendor.sys.fp.fod.location.X_Y");
                java.lang.String a18 = wo.w1.a("persist.vendor.sys.fp.fod.size.width_height");
                com.tencent.mars.xlog.Log.i(TAG, "xiaomi pos %s size %s", a17, a18);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(a17) && !com.tencent.mm.sdk.platformtools.t8.K0(a18)) {
                    java.lang.String[] split = a17.replace(FINGER_TYPE_SEPARATOR, "").split(",");
                    java.lang.String[] split2 = a18.replace(FINGER_TYPE_SEPARATOR, "").split(",");
                    if (split.length == 2 && split2.length == 2) {
                        kRect.mOrigin.mX = i65.a.c(context, java.lang.Integer.parseInt(split[0]) + (java.lang.Integer.parseInt(split2[0]) / 2));
                        kRect.mOrigin.mY = i65.a.c(context, java.lang.Integer.parseInt(split[1]) + (java.lang.Integer.parseInt(split2[1]) / 2));
                        kRect.mSize.mWidth = i65.a.c(context, java.lang.Integer.parseInt(split2[0]));
                        kRect.mSize.mHeight = i65.a.c(context, java.lang.Integer.parseInt(split2[1]));
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.w(TAG, "get finger pos, unknown brand: %s", str);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "getFingerPosition", new java.lang.Object[0]);
        }
        return kRect;
    }

    private com.tencent.kinda.gen.KRect getFingerPosBySoter(java.lang.String str, android.content.Context context) {
        zt5.p pVar;
        com.tencent.kinda.gen.KRect kRect = new com.tencent.kinda.gen.KRect(new com.tencent.kinda.gen.KPoint(0.0f, 0.0f), new com.tencent.kinda.gen.KSize(0.0f, 0.0f));
        try {
            zt5.p pVar2 = zt5.p.f475609b;
            if (pVar2 == null) {
                synchronized (zt5.p.class) {
                    if (zt5.p.f475609b == null) {
                        zt5.p.f475609b = new zt5.p();
                    }
                    pVar = zt5.p.f475609b;
                }
                pVar2 = pVar;
            }
            java.lang.Object a17 = pVar2.a("fingerprint_hardware_position", null);
            int[] iArr = a17 instanceof int[] ? (int[]) a17 : null;
            if (iArr == null || iArr.length != 4) {
                if (iArr != null) {
                    com.tencent.mars.xlog.Log.i(TAG, "soter pos is invalid length : %s", java.util.Arrays.toString(iArr));
                } else {
                    com.tencent.mars.xlog.Log.i(TAG, "soter pos is null");
                }
                return getFingerPosByMfg(str, context);
            }
            com.tencent.mars.xlog.Log.i(TAG, "soter pos is %s", java.util.Arrays.toString(iArr));
            kRect.mOrigin.mX = i65.a.c(context, iArr[0]);
            kRect.mOrigin.mY = i65.a.c(context, iArr[1]);
            kRect.mSize.mWidth = i65.a.c(context, iArr[2] - iArr[0]);
            kRect.mSize.mHeight = i65.a.c(context, iArr[3] - iArr[1]);
            return kRect;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "getFingerPosition", new java.lang.Object[0]);
            return kRect;
        }
    }

    private com.tencent.kinda.gen.FingerType getFingerTypeByMfg(java.lang.String str, android.content.Context context) {
        com.tencent.kinda.gen.FingerType fingerType;
        java.lang.Object obj;
        com.tencent.kinda.gen.FingerType defaultFingerType = defaultFingerType();
        try {
            if (str.contains("vivo")) {
                if (cacheValid) {
                    return cacheFingerType;
                }
                com.tencent.mars.xlog.Log.i(TAG, "vivo cache is invalid");
                com.tencent.kinda.gen.FingerType defaultFingerType2 = defaultFingerType();
                com.tencent.kinda.framework.app.FingerprintInsets.setDebugEnable(true);
                vivoFingerHelper = com.tencent.kinda.framework.app.FingerprintInsets.create(context, new com.tencent.kinda.framework.app.FingerprintInsets.FingerprintInsetsListener() { // from class: com.tencent.kinda.framework.app.KindaFingerprintImpl.8
                    @Override // com.tencent.kinda.framework.app.FingerprintInsets.FingerprintInsetsListener
                    public void onIconStateChanged(int i17) {
                    }

                    @Override // com.tencent.kinda.framework.app.FingerprintInsets.FingerprintInsetsListener
                    public void onReady() {
                        try {
                            boolean hasUnderDisplayFingerprint = com.tencent.kinda.framework.app.KindaFingerprintImpl.vivoFingerHelper.hasUnderDisplayFingerprint();
                            com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.app.KindaFingerprintImpl.TAG, "vivo hasUdFeature " + hasUnderDisplayFingerprint);
                            if (hasUnderDisplayFingerprint) {
                                android.graphics.Rect fingerprintIconPosition = com.tencent.kinda.framework.app.KindaFingerprintImpl.vivoFingerHelper.getFingerprintIconPosition();
                                com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.app.KindaFingerprintImpl.TAG, "vivo pos " + fingerprintIconPosition.toShortString());
                                com.tencent.kinda.gen.FingerType unused = com.tencent.kinda.framework.app.KindaFingerprintImpl.cacheFingerType = com.tencent.kinda.gen.FingerType.INSIDEFINGER;
                                com.tencent.kinda.gen.KRect unused2 = com.tencent.kinda.framework.app.KindaFingerprintImpl.cacheRect = new com.tencent.kinda.gen.KRect(new com.tencent.kinda.gen.KPoint((float) fingerprintIconPosition.centerX(), (float) fingerprintIconPosition.centerY()), new com.tencent.kinda.gen.KSize((float) fingerprintIconPosition.width(), (float) fingerprintIconPosition.height()));
                            } else {
                                com.tencent.kinda.gen.FingerType unused3 = com.tencent.kinda.framework.app.KindaFingerprintImpl.cacheFingerType = com.tencent.kinda.gen.FingerType.NONE;
                                com.tencent.kinda.gen.KRect unused4 = com.tencent.kinda.framework.app.KindaFingerprintImpl.cacheRect = new com.tencent.kinda.gen.KRect(new com.tencent.kinda.gen.KPoint(0.0f, 0.0f), new com.tencent.kinda.gen.KSize(0.0f, 0.0f));
                            }
                            boolean unused5 = com.tencent.kinda.framework.app.KindaFingerprintImpl.cacheValid = true;
                            com.tencent.kinda.framework.app.KindaFingerprintImpl.vivoFingerHelper.destroy();
                            com.tencent.kinda.framework.app.FingerprintInsets unused6 = com.tencent.kinda.framework.app.KindaFingerprintImpl.vivoFingerHelper = null;
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.printErrStackTrace(com.tencent.kinda.framework.app.KindaFingerprintImpl.TAG, e17, "getFingerType onReady", new java.lang.Object[0]);
                        }
                    }
                });
                return defaultFingerType2;
            }
            if (str.contains("meizu")) {
                java.lang.Object obj2 = null;
                try {
                    obj = java.lang.Class.forName("flyme.config.FlymeFeature").getField("SHELL_UNDER_GLASS_FINGERPRINT").get(null);
                } catch (java.lang.Throwable th6) {
                    by5.c4.d("ReflectionUtils", "getFieldStatic, error", th6);
                    obj = null;
                }
                try {
                    obj2 = java.lang.Class.forName("flyme.config.FlymeFeature").getField("UNDER_GLASS_ULTRASONIC_FINGERPRINT").get(null);
                } catch (java.lang.Throwable th7) {
                    by5.c4.d("ReflectionUtils", "getFieldStatic, error", th7);
                }
                if (obj instanceof java.lang.Boolean) {
                    com.tencent.mars.xlog.Log.i(TAG, "meizu FingerType typeShell:%b", obj);
                    defaultFingerType = ((java.lang.Boolean) obj).booleanValue() ? com.tencent.kinda.gen.FingerType.INSIDEFINGER : com.tencent.kinda.gen.FingerType.OUTSIDEFINGER;
                } else {
                    com.tencent.mars.xlog.Log.i(TAG, "meizu FingerType typeShell is not boolean");
                }
                if (!(obj2 instanceof java.lang.Boolean)) {
                    com.tencent.mars.xlog.Log.i(TAG, "meizu FingerType typeUltrasonic is not boolean");
                    return defaultFingerType;
                }
                com.tencent.mars.xlog.Log.i(TAG, "meizu FingerType typeUltrasonic:%b", obj2);
                fingerType = ((java.lang.Boolean) obj2).booleanValue() ? com.tencent.kinda.gen.FingerType.INSIDEFINGER : com.tencent.kinda.gen.FingerType.OUTSIDEFINGER;
            } else {
                if (str.contains("huawei")) {
                    java.lang.Object c17 = by5.j0.c("huawei.android.hardware.fingerprint.FingerprintManagerEx", "getHardwareType");
                    if (!(c17 instanceof java.lang.Integer)) {
                        return defaultFingerType;
                    }
                    com.tencent.mars.xlog.Log.i(TAG, "huawei FingerType is %s", c17.toString());
                    int intValue = ((java.lang.Integer) c17).intValue();
                    if (intValue != 1 && intValue != 2) {
                        return com.tencent.kinda.gen.FingerType.OUTSIDEFINGER;
                    }
                    return com.tencent.kinda.gen.FingerType.INSIDEFINGER;
                }
                if (str.contains("honor")) {
                    java.lang.Object c18 = by5.j0.c("com.hihonor.android.hardware.fingerprint.FingerprintManagerEx", "getHardwareType");
                    if (!(c18 instanceof java.lang.Integer)) {
                        return defaultFingerType;
                    }
                    com.tencent.mars.xlog.Log.i(TAG, "honor FingerType is %s", c18.toString());
                    int intValue2 = ((java.lang.Integer) c18).intValue();
                    if (intValue2 != 1 && intValue2 != 2) {
                        return com.tencent.kinda.gen.FingerType.OUTSIDEFINGER;
                    }
                    return com.tencent.kinda.gen.FingerType.INSIDEFINGER;
                }
                if (!str.contains("xiaomi")) {
                    com.tencent.mars.xlog.Log.w(TAG, "get finger type,unknown brand: %s", str);
                    return defaultFingerType;
                }
                java.lang.String a17 = wo.w1.a("ro.hardware.fp.fod");
                com.tencent.mars.xlog.Log.i(TAG, "xiaomi FingerType is %s", a17);
                java.lang.String a18 = wo.w1.a("persist.vendor.sys.fp.fod.location.X_Y");
                com.tencent.mars.xlog.Log.i(TAG, "xiaomi pos %s size %s", a18, wo.w1.a("persist.vendor.sys.fp.fod.size.width_height"));
                if (!"true".equals(a17) && com.tencent.mm.sdk.platformtools.t8.K0(a18)) {
                    fingerType = com.tencent.kinda.gen.FingerType.OUTSIDEFINGER;
                }
                fingerType = com.tencent.kinda.gen.FingerType.INSIDEFINGER;
            }
            return fingerType;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "getFingerType", new java.lang.Object[0]);
            return defaultFingerType;
        }
    }

    private com.tencent.kinda.gen.FingerType getFingerTypeBySoter(java.lang.String str, android.content.Context context) {
        zt5.p pVar;
        com.tencent.kinda.gen.FingerType defaultFingerType = defaultFingerType();
        try {
            zt5.p pVar2 = zt5.p.f475609b;
            if (pVar2 == null) {
                synchronized (zt5.p.class) {
                    if (zt5.p.f475609b == null) {
                        zt5.p.f475609b = new zt5.p();
                    }
                    pVar = zt5.p.f475609b;
                }
                pVar2 = pVar;
            }
            java.lang.Object a17 = pVar2.a("fingerprint_type", 0);
            int intValue = a17 instanceof java.lang.Integer ? ((java.lang.Integer) a17).intValue() : 0;
            if (intValue == 0) {
                pVar2.b();
            }
            com.tencent.mars.xlog.Log.i(TAG, "soter FingerType is %s", java.lang.Integer.valueOf(intValue));
            return intValue == 2 ? com.tencent.kinda.gen.FingerType.INSIDEFINGER : intValue == 1 ? com.tencent.kinda.gen.FingerType.OUTSIDEFINGER : getFingerTypeByMfg(str, context);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "getFingerType", new java.lang.Object[0]);
            return defaultFingerType;
        }
    }

    @Override // com.tencent.kinda.gen.KFingerprintService
    public void authenticateImpl(java.lang.String str, java.lang.String str2, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData, final com.tencent.kinda.gen.VoidBinaryI32Callback voidBinaryI32Callback, final com.tencent.kinda.gen.VoidCallback voidCallback, final com.tencent.kinda.gen.VoidBoolCallback voidBoolCallback, com.tencent.kinda.gen.VoidStringCallback voidStringCallback) {
        if (com.tencent.kinda.framework.widget.tools.KindaContext.get() == null) {
            return;
        }
        mz2.d2.IML.f333111d = str2;
        com.tencent.mm.autogen.events.ReleaseFingerPrintAuthEvent releaseFingerPrintAuthEvent = new com.tencent.mm.autogen.events.ReleaseFingerPrintAuthEvent();
        releaseFingerPrintAuthEvent.f54673g.f7572a = false;
        releaseFingerPrintAuthEvent.e();
        re4.n.b();
        com.tencent.mars.xlog.Log.i(TAG, "req fingerprint auth 2");
        re4.n.b();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1104, 38);
        nz2.o oVar = (nz2.o) gm0.j1.s(nz2.o.class);
        nz2.f fVar = new nz2.f(str2, 1);
        fVar.f341555c = str;
        if (iTransmitKvData != null) {
            fVar.f341556d = iTransmitKvData.getString("prompt_title");
            fVar.f341557e = iTransmitKvData.getString("prompt_subtitle");
            fVar.f341558f = iTransmitKvData.getString("prompt_button");
        }
        oVar.z9(com.tencent.mm.sdk.platformtools.x2.f193071a, fVar, new nz2.d() { // from class: com.tencent.kinda.framework.app.KindaFingerprintImpl.5
            @Override // nz2.d
            public void onFail(nz2.e eVar) {
                re4.n.f(2);
                nz2.c cVar = eVar.f341551c;
                int i17 = cVar.f341543a;
                if (i17 == 2005 || i17 == 2007) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1104, 36);
                }
                int i18 = cVar.f341543a;
                if (i18 == 10308 || i18 == 2 || i18 == 1001) {
                    com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.app.KindaFingerprintImpl.TAG, "hy: FingerPrintAuthEvent callback, auth | fail max | common err | pipeline exception, should change to pwd!");
                    voidBoolCallback.call(true);
                } else {
                    voidBoolCallback.call(false);
                }
                com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.app.KindaFingerprintImpl.TAG, "FingerPrint fail! retry count: " + eVar.f341550b);
            }

            @Override // nz2.d
            public void onRetry(nz2.e eVar) {
                re4.n.f(1);
                voidCallback.call();
                com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.app.KindaFingerprintImpl.TAG, "FingerPrint retry! retry count: " + eVar.f341550b);
            }

            @Override // nz2.d
            public void onSuccess(nz2.e eVar) {
                com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.app.KindaFingerprintImpl.TAG, "FingerPrint success!, encrypted_pay_info: %s, retry count: ", eVar.f341551c.f341545c, java.lang.Integer.valueOf(eVar.f341550b));
                r45.ac acVar = new r45.ac();
                acVar.f369907d = true;
                nz2.c cVar = eVar.f341551c;
                acVar.f369909f = cVar.f341545c;
                acVar.f369910g = cVar.f341546d;
                acVar.f369908e = eVar.f341550b;
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("json", eVar.f341551c.f341547e);
                    jSONObject.put("signature", eVar.f341551c.f341548f);
                    jSONObject.put("soter_type", ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().G());
                    acVar.f369911h = jSONObject.toString();
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(com.tencent.kinda.framework.app.KindaFingerprintImpl.TAG, e17, "json exception while construct json for soter_req. message: %s", e17.getMessage());
                }
                try {
                    voidBinaryI32Callback.call(acVar.toByteArray(), eVar.f341551c.f341544b);
                } catch (java.io.IOException e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(com.tencent.kinda.framework.app.KindaFingerprintImpl.TAG, e18, "FingerPrint exception: %s", e18.getMessage());
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1104, 37);
                re4.n.f(0);
            }
        });
        this.changePwdCallback = voidBoolCallback;
        this.activetyListener.alive();
    }

    @Override // com.tencent.kinda.gen.KFingerprintService
    public void changeAuthKey(boolean z17, boolean z18, java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("pwd", str);
        if (((nz2.a) ((nz2.o) gm0.j1.s(nz2.o.class))).a() || mz2.m0.a()) {
            if (z18) {
                bundle.putInt("key_open_biometric_type", ((mz2.a) this.mgr).a() ? 1 : ((mz2.a) this.mgr).b() ? 2 : 0);
            }
            this.mgr.Ge(z17, z18, bundle);
        }
    }

    public void closeTipDialog() {
        android.app.Dialog dialog = this.tipDialog;
        if (dialog != null) {
            dialog.dismiss();
            this.tipDialog = null;
        }
    }

    @Override // com.tencent.kinda.gen.KFingerprintService
    public com.tencent.kinda.gen.KRect getFingerPosition() {
        java.lang.String str = android.os.Build.MANUFACTURER + "-" + android.os.Build.BRAND;
        com.tencent.mars.xlog.Log.i(TAG, "getFingerPosition start %s", str);
        com.tencent.kinda.gen.KRect kRect = new com.tencent.kinda.gen.KRect(new com.tencent.kinda.gen.KPoint(0.0f, 0.0f), new com.tencent.kinda.gen.KSize(0.0f, 0.0f));
        android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (context == null) {
            return kRect;
        }
        java.lang.String lowerCase = str.toLowerCase();
        com.tencent.kinda.gen.KRect fingerPosBySoter = !lowerCase.contains("vivo") ? getFingerPosBySoter(lowerCase, context) : getFingerPosByMfg(lowerCase, context);
        com.tencent.mars.xlog.Log.i(TAG, "getFingerPosition end %s", fingerPosBySoter.toString());
        return fingerPosBySoter;
    }

    @Override // com.tencent.kinda.gen.KFingerprintService
    public com.tencent.kinda.gen.FingerType getFingerType() {
        com.tencent.kinda.gen.FingerType fingerTypeByMfg;
        com.tencent.kinda.gen.FingerType defaultFingerType = defaultFingerType();
        java.lang.String str = android.os.Build.MANUFACTURER + "-" + android.os.Build.BRAND;
        com.tencent.mars.xlog.Log.i(TAG, "getFingerType start %s", str);
        android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (context == null) {
            return defaultFingerType;
        }
        java.lang.String lowerCase = str.toLowerCase();
        if (lowerCase.contains("vivo")) {
            com.tencent.mars.xlog.Log.i(TAG, "is vivo, getFingerTypeByMfg");
            fingerTypeByMfg = getFingerTypeByMfg(lowerCase, context);
        } else {
            com.tencent.mars.xlog.Log.i(TAG, "not vivo, getFingerType soterFirst");
            fingerTypeByMfg = getFingerTypeBySoter(lowerCase, context);
        }
        com.tencent.mars.xlog.Log.i(TAG, "getFingerType end %s", fingerTypeByMfg.toString());
        accumulateAndReportFingerType(fingerTypeByMfg);
        return fingerTypeByMfg;
    }

    public int getSystemDimen(android.content.Context context, java.lang.String str) {
        int identifier = android.content.res.Resources.getSystem().getIdentifier(str, "dimen", com.eclipsesource.mmv8.Platform.ANDROID);
        int c17 = i65.a.c(context, android.content.res.Resources.getSystem().getDimensionPixelSize(identifier));
        com.tencent.mars.xlog.Log.i(TAG, "getSystemDimen %s id is %d, val is %d", str, java.lang.Integer.valueOf(identifier), java.lang.Integer.valueOf(c17));
        return c17;
    }

    @Override // com.tencent.kinda.gen.KFingerprintService
    public boolean isNeedChangeAuthKey() {
        boolean L2 = this.mgr.L2();
        mz2.d2 d2Var = mz2.d2.IML;
        boolean z17 = d2Var.f333113f || !L2;
        d2Var.f333113f = z17;
        return z17;
    }

    @Override // com.tencent.kinda.gen.KFingerprintService
    public void reGenFpRsaKeyImpl(boolean z17, int i17, java.lang.String str, final com.tencent.kinda.gen.VoidStringStringCallback voidStringStringCallback, final com.tencent.kinda.gen.VoidCallback voidCallback) {
        final com.tencent.mm.autogen.events.GenFingerPrintRsaKeyEvent genFingerPrintRsaKeyEvent = new com.tencent.mm.autogen.events.GenFingerPrintRsaKeyEvent();
        genFingerPrintRsaKeyEvent.f54375h = null;
        am.bf bfVar = genFingerPrintRsaKeyEvent.f54374g;
        bfVar.f6248a = z17;
        if (z17) {
            showProgress();
        }
        bfVar.f6249b = i17;
        bfVar.f6250c = str;
        genFingerPrintRsaKeyEvent.f192364d = new java.lang.Runnable() { // from class: com.tencent.kinda.framework.app.KindaFingerprintImpl.6
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.app.KindaFingerprintImpl.TAG, "GenFingerPrintRsaKeyEvent callback");
                am.cf cfVar = genFingerPrintRsaKeyEvent.f54375h;
                if (cfVar != null && cfVar.f6349a) {
                    com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.app.KindaFingerprintImpl.TAG, "GenFingerPrintRsaKeyEvent callback, result.isSuccess is true");
                    com.tencent.kinda.framework.app.KindaFingerprintImpl.this.closeTipDialog();
                    com.tencent.kinda.gen.VoidStringStringCallback voidStringStringCallback2 = voidStringStringCallback;
                    if (voidStringStringCallback2 != null) {
                        voidStringStringCallback2.call(cfVar.f6350b, cfVar.f6351c);
                        return;
                    }
                    return;
                }
                if (cfVar == null || cfVar.f6349a) {
                    com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.app.KindaFingerprintImpl.TAG, "GenFingerPrintRsaKeyEvent callback, result == null");
                    return;
                }
                com.tencent.mars.xlog.Log.e(com.tencent.kinda.framework.app.KindaFingerprintImpl.TAG, "GenFingerPrintRsaKeyEvent callback, result.isSuccess is false");
                com.tencent.kinda.framework.app.KindaFingerprintImpl.this.closeTipDialog();
                com.tencent.kinda.gen.VoidCallback voidCallback2 = voidCallback;
                if (voidCallback2 != null) {
                    voidCallback2.call();
                }
            }
        };
        genFingerPrintRsaKeyEvent.b(android.os.Looper.getMainLooper());
    }

    @Override // com.tencent.kinda.gen.KFingerprintService
    public void releaseService() {
        new com.tencent.mm.autogen.events.ReleaseFingerPrintAuthEvent().e();
        this.activetyListener.dead();
    }

    @Override // com.tencent.kinda.gen.KFingerprintService
    public void setNeedChangeAuthKey(boolean z17) {
        mz2.d2.IML.f333113f = z17;
    }

    @Override // com.tencent.kinda.gen.KFingerprintService
    public void showBioAuthViewImpl(java.lang.String str, java.lang.String str2, com.tencent.kinda.gen.VoidStringBinaryCallback voidStringBinaryCallback, com.tencent.kinda.gen.VoidCallback voidCallback, com.tencent.kinda.gen.VoidCallback voidCallback2, com.tencent.kinda.gen.VoidCallback voidCallback3) {
    }

    @Override // com.tencent.kinda.gen.KFingerprintService
    public void showFaceIdAuthDialogImpl(java.lang.String str, final com.tencent.kinda.gen.VoidBinaryI32Callback voidBinaryI32Callback, final com.tencent.kinda.gen.VoidCallback voidCallback, final com.tencent.kinda.gen.VoidCallback voidCallback2) {
        com.tencent.mars.xlog.Log.i(TAG, "showFaceIdAuthDialogImpl begin");
        mz2.d2.IML.f333111d = str;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15817, 3);
        mz2.e1 e1Var = (mz2.e1) i95.n0.c(mz2.e1.class);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("face_auth_scene", 1);
        ((mz2.j2) e1Var).wi((com.tencent.mm.ui.MMActivity) com.tencent.kinda.framework.widget.tools.KindaContext.get(), new lz2.a() { // from class: com.tencent.kinda.framework.app.KindaFingerprintImpl.7
            @Override // lz2.a
            public void onAuthCancel() {
                com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.app.KindaFingerprintImpl.TAG, "face id auth cancel");
                com.tencent.kinda.gen.VoidCallback voidCallback3 = voidCallback2;
                if (voidCallback3 != null) {
                    voidCallback3.call();
                }
            }

            @Override // lz2.a
            public void onAuthFail(int i17) {
                com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.app.KindaFingerprintImpl.TAG, "face id auth fail: %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(com.tencent.kinda.framework.app.KindaFingerprintImpl.this.identify_num));
                com.tencent.kinda.gen.VoidCallback voidCallback3 = voidCallback;
                if (voidCallback3 != null) {
                    voidCallback3.call();
                }
                com.tencent.kinda.framework.app.KindaFingerprintImpl.this.identify_num++;
            }

            @Override // lz2.a
            public void onAuthSuccess(int i17, int i18) {
                com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.app.KindaFingerprintImpl.TAG, "face id auth success");
                r45.ac acVar = new r45.ac();
                acVar.f369907d = true;
                acVar.f369909f = "";
                acVar.f369910g = "";
                acVar.f369911h = ((pz2.a) gm0.j1.s(pz2.a.class)).Uh();
                com.tencent.kinda.framework.app.KindaFingerprintImpl kindaFingerprintImpl = com.tencent.kinda.framework.app.KindaFingerprintImpl.this;
                int i19 = kindaFingerprintImpl.identify_num + 1;
                kindaFingerprintImpl.identify_num = i19;
                acVar.f369908e = i19;
                try {
                    voidBinaryI32Callback.call(acVar.toByteArray(), i17);
                } catch (java.io.IOException unused) {
                }
            }
        }, bundle);
    }

    public void showProgress() {
        android.app.Dialog dialog = this.tipDialog;
        if (dialog == null || !dialog.isShowing()) {
            android.app.Dialog dialog2 = this.tipDialog;
            if (dialog2 != null) {
                dialog2.dismiss();
            }
            if (com.tencent.kinda.framework.widget.tools.KindaContext.get() != null) {
                this.tipDialog = com.tencent.mm.wallet_core.ui.b2.h(com.tencent.kinda.framework.widget.tools.KindaContext.get(), false, new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.kinda.framework.app.KindaFingerprintImpl.9
                    @Override // android.content.DialogInterface.OnCancelListener
                    public void onCancel(android.content.DialogInterface dialogInterface) {
                        com.tencent.kinda.framework.app.KindaFingerprintImpl.this.closeTipDialog();
                    }
                });
            } else {
                com.tencent.mars.xlog.Log.e(TAG, "fingerprint loading error! KindaContext return null!!");
            }
        }
    }

    @Override // com.tencent.kinda.gen.KFingerprintService
    public com.tencent.kinda.gen.BioType supportBioType() {
        pz2.a aVar = this.mgr;
        if (aVar != null && aVar.Ic() && !this.mgr.H4() && ((mz2.a) this.mgr).a()) {
            return com.tencent.kinda.gen.BioType.FINGERPRINT;
        }
        pz2.a aVar2 = this.mgr;
        return (aVar2 == null || !aVar2.Rb() || this.mgr.D() || !((mz2.a) this.mgr).b()) ? com.tencent.kinda.gen.BioType.NONE : com.tencent.kinda.gen.BioType.FACEID;
    }

    @Override // com.tencent.kinda.gen.KFingerprintService
    public void tryInitBiometricImpl(final com.tencent.kinda.gen.VoidCallback voidCallback) {
        pz2.a aVar = (pz2.a) gm0.j1.s(pz2.a.class);
        ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).getClass();
        com.tencent.mm.plugin.walletlock.model.l lVar = com.tencent.mm.plugin.walletlock.model.l.instance;
        boolean z17 = lVar.h() == 2;
        ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).getClass();
        boolean z18 = lVar.h() == 3;
        mz2.a aVar2 = (mz2.a) aVar;
        if (!aVar2.b() && !aVar2.a() && !z17 && !z18) {
            com.tencent.mars.xlog.Log.i(TAG, "not open biometric pay or biometric lock, not need init soter");
            voidCallback.call();
            return;
        }
        ((ie0.m) ((je0.i) i95.n0.c(je0.i.class))).getClass();
        if (se4.h.f406925a) {
            com.tencent.mars.xlog.Log.i(TAG, "soter have init success");
            if (aVar2.type() == 2) {
                voidCallback.call();
                return;
            }
            ku5.u0 u0Var = ku5.t0.f312615d;
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.kinda.framework.app.KindaFingerprintImpl.2
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.app.KindaFingerprintImpl.TAG, "soter wait, because not has prepare");
                    voidCallback.call();
                }
            };
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(runnable, 1000L, false);
            return;
        }
        if (((ie0.m) ((je0.i) i95.n0.c(je0.i.class))).Ai() && !((ie0.m) ((je0.i) i95.n0.c(je0.i.class))).wi()) {
            com.tencent.mars.xlog.Log.i(TAG, "really not support soter");
            voidCallback.call();
            return;
        }
        com.tencent.mars.xlog.Log.i(TAG, "start tryInitBiometricImpl");
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        initStartTime = java.lang.System.currentTimeMillis();
        initEndCallback = voidCallback;
        ku5.u0 u0Var2 = ku5.t0.f312615d;
        java.lang.Runnable runnable2 = new java.lang.Runnable() { // from class: com.tencent.kinda.framework.app.KindaFingerprintImpl.3
            @Override // java.lang.Runnable
            public void run() {
                if (com.tencent.kinda.framework.app.KindaFingerprintImpl.initEndCallback == null) {
                    com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.app.KindaFingerprintImpl.TAG, "init soter out time, but initEndEvent is null, normal case");
                    return;
                }
                com.tencent.mars.xlog.Log.w(com.tencent.kinda.framework.app.KindaFingerprintImpl.TAG, "init soter out time, call initEndEvent");
                com.tencent.kinda.framework.app.KindaFingerprintImpl.initEndCallback.call();
                com.tencent.kinda.gen.VoidCallback unused = com.tencent.kinda.framework.app.KindaFingerprintImpl.initEndCallback = null;
            }
        };
        ku5.t0 t0Var2 = (ku5.t0) u0Var2;
        t0Var2.getClass();
        t0Var2.z(runnable2, 4000L, false);
        onSoterInitListener.alive();
        ((ie0.m) ((je0.i) i95.n0.c(je0.i.class))).getClass();
        se4.h.a(true, true, null);
    }

    @Override // com.tencent.kinda.gen.KFingerprintService
    public void userCancel() {
        pz2.a aVar = this.mgr;
        if (aVar == null) {
            return;
        }
        aVar.userCancel();
    }
}
