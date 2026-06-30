package com.p314xaae8f345.p347x615374d.p349x208df1fe.app;

/* renamed from: com.tencent.kinda.framework.app.KindaFingerprintImpl */
/* loaded from: classes9.dex */
public class C3129x8f263e37 implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3461xfbe4ccdc {

    /* renamed from: FINGER_TYPE_ACCUMULATE_COUNT */
    private static final int f11985xe250a5e1 = 50;

    /* renamed from: FINGER_TYPE_SEPARATOR */
    private static final java.lang.String f11986x4a644b96 = " ";
    static java.lang.String TAG = "KindaFingerprintImpl";

    /* renamed from: cacheFingerType */
    private static com.p314xaae8f345.p347x615374d.gen.EnumC3397x3a518663 f11987xaa463b65;

    /* renamed from: cacheRect */
    private static com.p314xaae8f345.p347x615374d.gen.C3514x447b0cf f11988xdeffec86;

    /* renamed from: cacheValid */
    private static boolean f11989x134519a;

    /* renamed from: initEndCallback */
    private static com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 f11990x360c7b10;

    /* renamed from: initStartTime */
    private static long f11991xddaef71f;

    /* renamed from: onSoterInitListener */
    private static com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5809x884a9cc> f11992x844d22aa = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5809x884a9cc>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.kinda.framework.app.KindaFingerprintImpl.1
        {
            this.f39173x3fe91575 = -1482822212;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public boolean mo1xf5bc2045(final com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5809x884a9cc c5809x884a9cc) {
            ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.app.KindaFingerprintImpl.1.1
                @Override // java.lang.Runnable
                public void run() {
                    long j17;
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.f11992x844d22aa.mo48814x2efc64();
                    if (com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.f11991xddaef71f > 0) {
                        long j18 = com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.f11991xddaef71f;
                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        j17 = java.lang.System.currentTimeMillis() - j18;
                        m05.i.f404103a.a("5", "5", java.lang.String.valueOf(c5809x884a9cc.f136117g.f88012a), java.lang.String.valueOf(j17));
                        long unused = com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.f11991xddaef71f = 0L;
                    } else {
                        j17 = -1;
                    }
                    if (com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.f11990x360c7b10 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.TAG, "init soter finish, but initEndEvent is null, maybe out time: %s %s, use time:%s", java.lang.Integer.valueOf(c5809x884a9cc.f136117g.f88012a), c5809x884a9cc.f136117g.f88013b, java.lang.Long.valueOf(j17));
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.TAG, "init soter finish, call initEndEvent: %s %s, use time:%s", java.lang.Integer.valueOf(c5809x884a9cc.f136117g.f88012a), c5809x884a9cc.f136117g.f88013b, java.lang.Long.valueOf(j17));
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.f11990x360c7b10.mo25801x2e7a5e();
                    com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 unused2 = com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.f11990x360c7b10 = null;
                }
            });
            return false;
        }
    };

    /* renamed from: vivoFingerHelper */
    private static com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3113x71559cda f11993x31b97b43;

    /* renamed from: changePwdCallback */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3618x898d6123 f11995xe81e10d2;

    /* renamed from: activetyListener */
    private com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5662xdcfef1bc> f11994xc82fd1df = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5662xdcfef1bc>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.kinda.framework.app.KindaFingerprintImpl.4
        {
            this.f39173x3fe91575 = 884305868;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5662xdcfef1bc c5662xdcfef1bc) {
            if (c5662xdcfef1bc != null && com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.this.f11995xe81e10d2 != null) {
                com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.this.f11995xe81e10d2.mo28431x2e7a5e(false);
            }
            return false;
        }
    };
    pz2.a mgr = (pz2.a) gm0.j1.s(pz2.a.class);

    /* renamed from: identify_num */
    int f11996xe0eee3d3 = 0;

    /* renamed from: tipDialog */
    private android.app.Dialog f11997x691689c3 = null;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[Catch: Exception -> 0x0084, TryCatch #0 {Exception -> 0x0084, blocks: (B:3:0x0003, B:5:0x000b, B:8:0x0013, B:11:0x0021, B:14:0x0028, B:15:0x003f, B:17:0x0048, B:19:0x006c, B:21:0x003b), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c A[Catch: Exception -> 0x0084, TRY_LEAVE, TryCatch #0 {Exception -> 0x0084, blocks: (B:3:0x0003, B:5:0x000b, B:8:0x0013, B:11:0x0021, B:14:0x0028, B:15:0x003f, B:17:0x0048, B:19:0x006c, B:21:0x003b), top: B:2:0x0003 }] */
    /* renamed from: accumulateAndReportFingerType */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m25156xde4d0dcc(com.p314xaae8f345.p347x615374d.gen.EnumC3397x3a518663 r8) {
        /*
            r7 = this;
            java.lang.String r0 = "MMKV_KEY_SOTER_FINGER_TYPE_ACCUMULATE"
            r1 = 0
            java.lang.String r2 = "mmkv.wallet"
            com.tencent.mm.sdk.platformtools.o4 r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(r2)     // Catch: java.lang.Exception -> L84
            if (r2 != 0) goto L13
            java.lang.String r8 = com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.TAG     // Catch: java.lang.Exception -> L84
            java.lang.String r0 = "accumulateAndReportFingerType, but payMMKV is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r8, r0)     // Catch: java.lang.Exception -> L84
            return
        L13:
            java.lang.String r3 = ""
            java.lang.String r3 = r2.u(r0, r3)     // Catch: java.lang.Exception -> L84
            int r8 = r7.m25158xf53ad3f3(r8)     // Catch: java.lang.Exception -> L84
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
            java.lang.String r3 = com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.TAG     // Catch: java.lang.Exception -> L84
            java.lang.String r4 = "accumulateAndReportFingerType report, data: %s"
            java.lang.Object[] r5 = new java.lang.Object[]{r8}     // Catch: java.lang.Exception -> L84
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r4, r5)     // Catch: java.lang.Exception -> L84
            r3 = 310(0x136, float:4.34E-43)
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> L84
            com.tencent.mm.plugin.report.service.g0 r4 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE     // Catch: java.lang.Exception -> L84
            java.lang.String r5 = "8"
            java.lang.String r6 = "1"
            java.lang.Object[] r8 = new java.lang.Object[]{r5, r6, r3, r8}     // Catch: java.lang.Exception -> L84
            r3 = 24610(0x6022, float:3.4486E-41)
            r4.d(r3, r8)     // Catch: java.lang.Exception -> L84
            r2.W(r0)     // Catch: java.lang.Exception -> L84
            goto L8e
        L6c:
            r2.D(r0, r8)     // Catch: java.lang.Exception -> L84
            java.lang.String r0 = com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.TAG     // Catch: java.lang.Exception -> L84
            java.lang.String r2 = "accumulateAndReportFingerType saved, current count: %d, data: %s"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L84
            int r3 = r3.length     // Catch: java.lang.Exception -> L84
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L84
            r4[r1] = r3     // Catch: java.lang.Exception -> L84
            r3 = 1
            r4[r3] = r8     // Catch: java.lang.Exception -> L84
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r2, r4)     // Catch: java.lang.Exception -> L84
            goto L8e
        L84:
            r8 = move-exception
            java.lang.String r0 = com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.TAG
            java.lang.String r2 = "accumulateAndReportFingerType exception"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r0, r8, r2, r1)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.m25156xde4d0dcc(com.tencent.kinda.gen.FingerType):void");
    }

    /* renamed from: defaultFingerType */
    private com.p314xaae8f345.p347x615374d.gen.EnumC3397x3a518663 m25157xd6233f64() {
        return com.p314xaae8f345.p347x615374d.gen.EnumC3397x3a518663.NONE;
    }

    /* renamed from: fingerTypeToValue */
    private int m25158xf53ad3f3(com.p314xaae8f345.p347x615374d.gen.EnumC3397x3a518663 enumC3397x3a518663) {
        if (enumC3397x3a518663 == com.p314xaae8f345.p347x615374d.gen.EnumC3397x3a518663.NONE) {
            return 0;
        }
        if (enumC3397x3a518663 == com.p314xaae8f345.p347x615374d.gen.EnumC3397x3a518663.OUTSIDEFINGER) {
            return 1;
        }
        return enumC3397x3a518663 == com.p314xaae8f345.p347x615374d.gen.EnumC3397x3a518663.INSIDEFINGER ? 2 : 0;
    }

    /* renamed from: getFingerPosByMfg */
    private com.p314xaae8f345.p347x615374d.gen.C3514x447b0cf m25159x8cc91ba2(java.lang.String str, android.content.Context context) {
        com.p314xaae8f345.p347x615374d.gen.C3514x447b0cf c3514x447b0cf = new com.p314xaae8f345.p347x615374d.gen.C3514x447b0cf(new com.p314xaae8f345.p347x615374d.gen.C3503x8496dc05(0.0f, 0.0f), new com.p314xaae8f345.p347x615374d.gen.C3525x44836ec(0.0f, 0.0f));
        try {
            if (str.contains("vivo")) {
                if (f11989x134519a) {
                    c3514x447b0cf = f11988xdeffec86;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "vivo cache is invalid");
                }
            } else if (str.contains("meizu")) {
                c3514x447b0cf.f13655x134dd5f3.mX = m25168x7cd4790c(context, "under_glass_fp_x");
                c3514x447b0cf.f13655x134dd5f3.mY = m25168x7cd4790c(context, "under_glass_fp_y");
                c3514x447b0cf.f13656x627560e.f13672xbefb7959 = m25168x7cd4790c(context, "under_glass_fp_width");
                c3514x447b0cf.f13656x627560e.f13671x6a4b7f4 = m25168x7cd4790c(context, "under_glass_fp_height");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "meizu pos is %s", c3514x447b0cf.m28126x9616526c());
            } else if (str.contains("huawei")) {
                java.lang.Object c17 = by5.j0.c("huawei.android.hardware.fingerprint.FingerprintManagerEx", "getHardwarePosition");
                if (c17 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "huawei pos %s", c17.toString());
                    if (c17 instanceof int[]) {
                        int[] iArr = (int[]) c17;
                        c3514x447b0cf.f13655x134dd5f3.mX = i65.a.c(context, iArr[0]);
                        c3514x447b0cf.f13655x134dd5f3.mY = i65.a.c(context, iArr[1]);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "huawei pos is null");
                }
            } else if (str.contains("honor")) {
                java.lang.Object c18 = by5.j0.c("com.hihonor.android.hardware.fingerprint.FingerprintManagerEx", "getHardwarePosition");
                if (c18 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "honor pos %s", c18.toString());
                    if (c18 instanceof int[]) {
                        int[] iArr2 = (int[]) c18;
                        c3514x447b0cf.f13655x134dd5f3.mX = i65.a.c(context, iArr2[0]);
                        c3514x447b0cf.f13655x134dd5f3.mY = i65.a.c(context, iArr2[1]);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "honor pos is null");
                }
            } else if (str.contains("xiaomi")) {
                java.lang.String a17 = wo.w1.a("persist.vendor.sys.fp.fod.location.X_Y");
                java.lang.String a18 = wo.w1.a("persist.vendor.sys.fp.fod.size.width_height");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "xiaomi pos %s size %s", a17, a18);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a18)) {
                    java.lang.String[] split = a17.replace(f11986x4a644b96, "").split(",");
                    java.lang.String[] split2 = a18.replace(f11986x4a644b96, "").split(",");
                    if (split.length == 2 && split2.length == 2) {
                        c3514x447b0cf.f13655x134dd5f3.mX = i65.a.c(context, java.lang.Integer.parseInt(split[0]) + (java.lang.Integer.parseInt(split2[0]) / 2));
                        c3514x447b0cf.f13655x134dd5f3.mY = i65.a.c(context, java.lang.Integer.parseInt(split[1]) + (java.lang.Integer.parseInt(split2[1]) / 2));
                        c3514x447b0cf.f13656x627560e.f13672xbefb7959 = i65.a.c(context, java.lang.Integer.parseInt(split2[0]));
                        c3514x447b0cf.f13656x627560e.f13671x6a4b7f4 = i65.a.c(context, java.lang.Integer.parseInt(split2[1]));
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "get finger pos, unknown brand: %s", str);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "getFingerPosition", new java.lang.Object[0]);
        }
        return c3514x447b0cf;
    }

    /* renamed from: getFingerPosBySoter */
    private com.p314xaae8f345.p347x615374d.gen.C3514x447b0cf m25160x7f499cf9(java.lang.String str, android.content.Context context) {
        zt5.p pVar;
        com.p314xaae8f345.p347x615374d.gen.C3514x447b0cf c3514x447b0cf = new com.p314xaae8f345.p347x615374d.gen.C3514x447b0cf(new com.p314xaae8f345.p347x615374d.gen.C3503x8496dc05(0.0f, 0.0f), new com.p314xaae8f345.p347x615374d.gen.C3525x44836ec(0.0f, 0.0f));
        try {
            zt5.p pVar2 = zt5.p.f557142b;
            if (pVar2 == null) {
                synchronized (zt5.p.class) {
                    if (zt5.p.f557142b == null) {
                        zt5.p.f557142b = new zt5.p();
                    }
                    pVar = zt5.p.f557142b;
                }
                pVar2 = pVar;
            }
            java.lang.Object a17 = pVar2.a("fingerprint_hardware_position", null);
            int[] iArr = a17 instanceof int[] ? (int[]) a17 : null;
            if (iArr == null || iArr.length != 4) {
                if (iArr != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "soter pos is invalid length : %s", java.util.Arrays.toString(iArr));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "soter pos is null");
                }
                return m25159x8cc91ba2(str, context);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "soter pos is %s", java.util.Arrays.toString(iArr));
            c3514x447b0cf.f13655x134dd5f3.mX = i65.a.c(context, iArr[0]);
            c3514x447b0cf.f13655x134dd5f3.mY = i65.a.c(context, iArr[1]);
            c3514x447b0cf.f13656x627560e.f13672xbefb7959 = i65.a.c(context, iArr[2] - iArr[0]);
            c3514x447b0cf.f13656x627560e.f13671x6a4b7f4 = i65.a.c(context, iArr[3] - iArr[1]);
            return c3514x447b0cf;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "getFingerPosition", new java.lang.Object[0]);
            return c3514x447b0cf;
        }
    }

    /* renamed from: getFingerTypeByMfg */
    private com.p314xaae8f345.p347x615374d.gen.EnumC3397x3a518663 m25161x64b575e(java.lang.String str, android.content.Context context) {
        com.p314xaae8f345.p347x615374d.gen.EnumC3397x3a518663 enumC3397x3a518663;
        java.lang.Object obj;
        com.p314xaae8f345.p347x615374d.gen.EnumC3397x3a518663 m25157xd6233f64 = m25157xd6233f64();
        try {
            if (str.contains("vivo")) {
                if (f11989x134519a) {
                    return f11987xaa463b65;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "vivo cache is invalid");
                com.p314xaae8f345.p347x615374d.gen.EnumC3397x3a518663 m25157xd6233f642 = m25157xd6233f64();
                com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3113x71559cda.m24957xfb4317f4(true);
                f11993x31b97b43 = com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3113x71559cda.m24936xaf65a0fc(context, new com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3113x71559cda.FingerprintInsetsListener() { // from class: com.tencent.kinda.framework.app.KindaFingerprintImpl.8
                    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3113x71559cda.FingerprintInsetsListener
                    /* renamed from: onIconStateChanged */
                    public void mo24971xa25277fb(int i17) {
                    }

                    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3113x71559cda.FingerprintInsetsListener
                    /* renamed from: onReady */
                    public void mo24972xb03baf04() {
                        try {
                            boolean m24968xae36bbc0 = com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.f11993x31b97b43.m24968xae36bbc0();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.TAG, "vivo hasUdFeature " + m24968xae36bbc0);
                            if (m24968xae36bbc0) {
                                android.graphics.Rect m24964x26591f90 = com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.f11993x31b97b43.m24964x26591f90();
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.TAG, "vivo pos " + m24964x26591f90.toShortString());
                                com.p314xaae8f345.p347x615374d.gen.EnumC3397x3a518663 unused = com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.f11987xaa463b65 = com.p314xaae8f345.p347x615374d.gen.EnumC3397x3a518663.INSIDEFINGER;
                                com.p314xaae8f345.p347x615374d.gen.C3514x447b0cf unused2 = com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.f11988xdeffec86 = new com.p314xaae8f345.p347x615374d.gen.C3514x447b0cf(new com.p314xaae8f345.p347x615374d.gen.C3503x8496dc05((float) m24964x26591f90.centerX(), (float) m24964x26591f90.centerY()), new com.p314xaae8f345.p347x615374d.gen.C3525x44836ec((float) m24964x26591f90.width(), (float) m24964x26591f90.height()));
                            } else {
                                com.p314xaae8f345.p347x615374d.gen.EnumC3397x3a518663 unused3 = com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.f11987xaa463b65 = com.p314xaae8f345.p347x615374d.gen.EnumC3397x3a518663.NONE;
                                com.p314xaae8f345.p347x615374d.gen.C3514x447b0cf unused4 = com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.f11988xdeffec86 = new com.p314xaae8f345.p347x615374d.gen.C3514x447b0cf(new com.p314xaae8f345.p347x615374d.gen.C3503x8496dc05(0.0f, 0.0f), new com.p314xaae8f345.p347x615374d.gen.C3525x44836ec(0.0f, 0.0f));
                            }
                            boolean unused5 = com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.f11989x134519a = true;
                            com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.f11993x31b97b43.m24961x5cd39ffa();
                            com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3113x71559cda unused6 = com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.f11993x31b97b43 = null;
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.TAG, e17, "getFingerType onReady", new java.lang.Object[0]);
                        }
                    }
                });
                return m25157xd6233f642;
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
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "meizu FingerType typeShell:%b", obj);
                    m25157xd6233f64 = ((java.lang.Boolean) obj).booleanValue() ? com.p314xaae8f345.p347x615374d.gen.EnumC3397x3a518663.INSIDEFINGER : com.p314xaae8f345.p347x615374d.gen.EnumC3397x3a518663.OUTSIDEFINGER;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "meizu FingerType typeShell is not boolean");
                }
                if (!(obj2 instanceof java.lang.Boolean)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "meizu FingerType typeUltrasonic is not boolean");
                    return m25157xd6233f64;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "meizu FingerType typeUltrasonic:%b", obj2);
                enumC3397x3a518663 = ((java.lang.Boolean) obj2).booleanValue() ? com.p314xaae8f345.p347x615374d.gen.EnumC3397x3a518663.INSIDEFINGER : com.p314xaae8f345.p347x615374d.gen.EnumC3397x3a518663.OUTSIDEFINGER;
            } else {
                if (str.contains("huawei")) {
                    java.lang.Object c17 = by5.j0.c("huawei.android.hardware.fingerprint.FingerprintManagerEx", "getHardwareType");
                    if (!(c17 instanceof java.lang.Integer)) {
                        return m25157xd6233f64;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "huawei FingerType is %s", c17.toString());
                    int intValue = ((java.lang.Integer) c17).intValue();
                    if (intValue != 1 && intValue != 2) {
                        return com.p314xaae8f345.p347x615374d.gen.EnumC3397x3a518663.OUTSIDEFINGER;
                    }
                    return com.p314xaae8f345.p347x615374d.gen.EnumC3397x3a518663.INSIDEFINGER;
                }
                if (str.contains("honor")) {
                    java.lang.Object c18 = by5.j0.c("com.hihonor.android.hardware.fingerprint.FingerprintManagerEx", "getHardwareType");
                    if (!(c18 instanceof java.lang.Integer)) {
                        return m25157xd6233f64;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "honor FingerType is %s", c18.toString());
                    int intValue2 = ((java.lang.Integer) c18).intValue();
                    if (intValue2 != 1 && intValue2 != 2) {
                        return com.p314xaae8f345.p347x615374d.gen.EnumC3397x3a518663.OUTSIDEFINGER;
                    }
                    return com.p314xaae8f345.p347x615374d.gen.EnumC3397x3a518663.INSIDEFINGER;
                }
                if (!str.contains("xiaomi")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "get finger type,unknown brand: %s", str);
                    return m25157xd6233f64;
                }
                java.lang.String a17 = wo.w1.a("ro.hardware.fp.fod");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "xiaomi FingerType is %s", a17);
                java.lang.String a18 = wo.w1.a("persist.vendor.sys.fp.fod.location.X_Y");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "xiaomi pos %s size %s", a18, wo.w1.a("persist.vendor.sys.fp.fod.size.width_height"));
                if (!"true".equals(a17) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a18)) {
                    enumC3397x3a518663 = com.p314xaae8f345.p347x615374d.gen.EnumC3397x3a518663.OUTSIDEFINGER;
                }
                enumC3397x3a518663 = com.p314xaae8f345.p347x615374d.gen.EnumC3397x3a518663.INSIDEFINGER;
            }
            return enumC3397x3a518663;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "getFingerType", new java.lang.Object[0]);
            return m25157xd6233f64;
        }
    }

    /* renamed from: getFingerTypeBySoter */
    private com.p314xaae8f345.p347x615374d.gen.EnumC3397x3a518663 m25162xa12bd9b5(java.lang.String str, android.content.Context context) {
        zt5.p pVar;
        com.p314xaae8f345.p347x615374d.gen.EnumC3397x3a518663 m25157xd6233f64 = m25157xd6233f64();
        try {
            zt5.p pVar2 = zt5.p.f557142b;
            if (pVar2 == null) {
                synchronized (zt5.p.class) {
                    if (zt5.p.f557142b == null) {
                        zt5.p.f557142b = new zt5.p();
                    }
                    pVar = zt5.p.f557142b;
                }
                pVar2 = pVar;
            }
            java.lang.Object a17 = pVar2.a("fingerprint_type", 0);
            int intValue = a17 instanceof java.lang.Integer ? ((java.lang.Integer) a17).intValue() : 0;
            if (intValue == 0) {
                pVar2.b();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "soter FingerType is %s", java.lang.Integer.valueOf(intValue));
            return intValue == 2 ? com.p314xaae8f345.p347x615374d.gen.EnumC3397x3a518663.INSIDEFINGER : intValue == 1 ? com.p314xaae8f345.p347x615374d.gen.EnumC3397x3a518663.OUTSIDEFINGER : m25161x64b575e(str, context);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "getFingerType", new java.lang.Object[0]);
            return m25157xd6233f64;
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3461xfbe4ccdc
    /* renamed from: authenticateImpl */
    public void mo25163x4eef8a95(java.lang.String str, java.lang.String str2, com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e, final com.p314xaae8f345.p347x615374d.gen.AbstractC3617x3879e6d8 abstractC3617x3879e6d8, final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619, final com.p314xaae8f345.p347x615374d.gen.AbstractC3618x898d6123 abstractC3618x898d6123, com.p314xaae8f345.p347x615374d.gen.AbstractC3635x710ca4a abstractC3635x710ca4a) {
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get() == null) {
            return;
        }
        mz2.d2.IML.f414644d = str2;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5900xd57eabf5 c5900xd57eabf5 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5900xd57eabf5();
        c5900xd57eabf5.f136206g.f89105a = false;
        c5900xd57eabf5.e();
        re4.n.b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "req fingerprint auth 2");
        re4.n.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1104, 38);
        nz2.o oVar = (nz2.o) gm0.j1.s(nz2.o.class);
        nz2.f fVar = new nz2.f(str2, 1);
        fVar.f423088c = str;
        if (abstractC3411xcfaed72e != null) {
            fVar.f423089d = abstractC3411xcfaed72e.mo27551x2fec8307("prompt_title");
            fVar.f423090e = abstractC3411xcfaed72e.mo27551x2fec8307("prompt_subtitle");
            fVar.f423091f = abstractC3411xcfaed72e.mo27551x2fec8307("prompt_button");
        }
        oVar.z9(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, fVar, new nz2.d() { // from class: com.tencent.kinda.framework.app.KindaFingerprintImpl.5
            @Override // nz2.d
            /* renamed from: onFail */
            public void mo14631xc399519d(nz2.e eVar) {
                re4.n.f(2);
                nz2.c cVar = eVar.f423084c;
                int i17 = cVar.f423076a;
                if (i17 == 2005 || i17 == 2007) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1104, 36);
                }
                int i18 = cVar.f423076a;
                if (i18 == 10308 || i18 == 2 || i18 == 1001) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.TAG, "hy: FingerPrintAuthEvent callback, auth | fail max | common err | pipeline exception, should change to pwd!");
                    abstractC3618x898d6123.mo28431x2e7a5e(true);
                } else {
                    abstractC3618x898d6123.mo28431x2e7a5e(false);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.TAG, "FingerPrint fail! retry count: " + eVar.f423083b);
            }

            @Override // nz2.d
            /* renamed from: onRetry */
            public void mo14632xb03bf809(nz2.e eVar) {
                re4.n.f(1);
                abstractC3623x3b485619.mo25801x2e7a5e();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.TAG, "FingerPrint retry! retry count: " + eVar.f423083b);
            }

            @Override // nz2.d
            /* renamed from: onSuccess */
            public void mo14633xe05b4124(nz2.e eVar) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.TAG, "FingerPrint success!, encrypted_pay_info: %s, retry count: ", eVar.f423084c.f423078c, java.lang.Integer.valueOf(eVar.f423083b));
                r45.ac acVar = new r45.ac();
                acVar.f451440d = true;
                nz2.c cVar = eVar.f423084c;
                acVar.f451442f = cVar.f423078c;
                acVar.f451443g = cVar.f423079d;
                acVar.f451441e = eVar.f423083b;
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("json", eVar.f423084c.f423080e);
                    jSONObject.put("signature", eVar.f423084c.f423081f);
                    jSONObject.put("soter_type", ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().G());
                    acVar.f451444h = jSONObject.toString();
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.TAG, e17, "json exception while construct json for soter_req. message: %s", e17.getMessage());
                }
                try {
                    abstractC3617x3879e6d8.mo28426x2e7a5e(acVar.mo14344x5f01b1f6(), eVar.f423084c.f423077b);
                } catch (java.io.IOException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.TAG, e18, "FingerPrint exception: %s", e18.getMessage());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1104, 37);
                re4.n.f(0);
            }
        });
        this.f11995xe81e10d2 = abstractC3618x898d6123;
        this.f11994xc82fd1df.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3461xfbe4ccdc
    /* renamed from: changeAuthKey */
    public void mo25164x9f1b85c7(boolean z17, boolean z18, java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("pwd", str);
        if (((nz2.a) ((nz2.o) gm0.j1.s(nz2.o.class))).a() || mz2.m0.a()) {
            if (z18) {
                bundle.putInt("key_open_biometric_type", ((mz2.a) this.mgr).a() ? 1 : ((mz2.a) this.mgr).b() ? 2 : 0);
            }
            this.mgr.Ge(z17, z18, bundle);
        }
    }

    /* renamed from: closeTipDialog */
    public void m25165x725102ab() {
        android.app.Dialog dialog = this.f11997x691689c3;
        if (dialog != null) {
            dialog.dismiss();
            this.f11997x691689c3 = null;
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3461xfbe4ccdc
    /* renamed from: getFingerPosition */
    public com.p314xaae8f345.p347x615374d.gen.C3514x447b0cf mo25166x8eecd4a8() {
        java.lang.String str = android.os.Build.MANUFACTURER + "-" + android.os.Build.BRAND;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "getFingerPosition start %s", str);
        com.p314xaae8f345.p347x615374d.gen.C3514x447b0cf c3514x447b0cf = new com.p314xaae8f345.p347x615374d.gen.C3514x447b0cf(new com.p314xaae8f345.p347x615374d.gen.C3503x8496dc05(0.0f, 0.0f), new com.p314xaae8f345.p347x615374d.gen.C3525x44836ec(0.0f, 0.0f));
        android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (context == null) {
            return c3514x447b0cf;
        }
        java.lang.String lowerCase = str.toLowerCase();
        com.p314xaae8f345.p347x615374d.gen.C3514x447b0cf m25160x7f499cf9 = !lowerCase.contains("vivo") ? m25160x7f499cf9(lowerCase, context) : m25159x8cc91ba2(lowerCase, context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "getFingerPosition end %s", m25160x7f499cf9.m28126x9616526c());
        return m25160x7f499cf9;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3461xfbe4ccdc
    /* renamed from: getFingerType */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3397x3a518663 mo25167xb1c06239() {
        com.p314xaae8f345.p347x615374d.gen.EnumC3397x3a518663 m25161x64b575e;
        com.p314xaae8f345.p347x615374d.gen.EnumC3397x3a518663 m25157xd6233f64 = m25157xd6233f64();
        java.lang.String str = android.os.Build.MANUFACTURER + "-" + android.os.Build.BRAND;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "getFingerType start %s", str);
        android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (context == null) {
            return m25157xd6233f64;
        }
        java.lang.String lowerCase = str.toLowerCase();
        if (lowerCase.contains("vivo")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "is vivo, getFingerTypeByMfg");
            m25161x64b575e = m25161x64b575e(lowerCase, context);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "not vivo, getFingerType soterFirst");
            m25161x64b575e = m25162xa12bd9b5(lowerCase, context);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "getFingerType end %s", m25161x64b575e.toString());
        m25156xde4d0dcc(m25161x64b575e);
        return m25161x64b575e;
    }

    /* renamed from: getSystemDimen */
    public int m25168x7cd4790c(android.content.Context context, java.lang.String str) {
        int identifier = android.content.res.Resources.getSystem().getIdentifier(str, "dimen", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f);
        int c17 = i65.a.c(context, android.content.res.Resources.getSystem().getDimensionPixelSize(identifier));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "getSystemDimen %s id is %d, val is %d", str, java.lang.Integer.valueOf(identifier), java.lang.Integer.valueOf(c17));
        return c17;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3461xfbe4ccdc
    /* renamed from: isNeedChangeAuthKey */
    public boolean mo25169xb7a73cc7() {
        boolean L2 = this.mgr.L2();
        mz2.d2 d2Var = mz2.d2.IML;
        boolean z17 = d2Var.f414646f || !L2;
        d2Var.f414646f = z17;
        return z17;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3461xfbe4ccdc
    /* renamed from: reGenFpRsaKeyImpl */
    public void mo25170x16a97fe6(boolean z17, int i17, java.lang.String str, final com.p314xaae8f345.p347x615374d.gen.AbstractC3637x4fc395bb abstractC3637x4fc395bb, final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619) {
        final com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5585x857171c7 c5585x857171c7 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5585x857171c7();
        c5585x857171c7.f135908h = null;
        am.bf bfVar = c5585x857171c7.f135907g;
        bfVar.f87781a = z17;
        if (z17) {
            m25175x918cb44a();
        }
        bfVar.f87782b = i17;
        bfVar.f87783c = str;
        c5585x857171c7.f273897d = new java.lang.Runnable() { // from class: com.tencent.kinda.framework.app.KindaFingerprintImpl.6
            @Override // java.lang.Runnable
            public void run() {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.TAG, "GenFingerPrintRsaKeyEvent callback");
                am.cf cfVar = c5585x857171c7.f135908h;
                if (cfVar != null && cfVar.f87882a) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.TAG, "GenFingerPrintRsaKeyEvent callback, result.isSuccess is true");
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.this.m25165x725102ab();
                    com.p314xaae8f345.p347x615374d.gen.AbstractC3637x4fc395bb abstractC3637x4fc395bb2 = abstractC3637x4fc395bb;
                    if (abstractC3637x4fc395bb2 != null) {
                        abstractC3637x4fc395bb2.mo28525x2e7a5e(cfVar.f87883b, cfVar.f87884c);
                        return;
                    }
                    return;
                }
                if (cfVar == null || cfVar.f87882a) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.TAG, "GenFingerPrintRsaKeyEvent callback, result == null");
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.TAG, "GenFingerPrintRsaKeyEvent callback, result.isSuccess is false");
                com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.this.m25165x725102ab();
                com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856192 = abstractC3623x3b485619;
                if (abstractC3623x3b4856192 != null) {
                    abstractC3623x3b4856192.mo25801x2e7a5e();
                }
            }
        };
        c5585x857171c7.b(android.os.Looper.getMainLooper());
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3461xfbe4ccdc
    /* renamed from: releaseService */
    public void mo25171xab8670ae() {
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5900xd57eabf5().e();
        this.f11994xc82fd1df.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3461xfbe4ccdc
    /* renamed from: setNeedChangeAuthKey */
    public void mo25172x5342e48f(boolean z17) {
        mz2.d2.IML.f414646f = z17;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3461xfbe4ccdc
    /* renamed from: showBioAuthViewImpl */
    public void mo25173x856db898(java.lang.String str, java.lang.String str2, com.p314xaae8f345.p347x615374d.gen.AbstractC3634x887151ab abstractC3634x887151ab, com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619, com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856192, com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856193) {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3461xfbe4ccdc
    /* renamed from: showFaceIdAuthDialogImpl */
    public void mo25174x88547465(java.lang.String str, final com.p314xaae8f345.p347x615374d.gen.AbstractC3617x3879e6d8 abstractC3617x3879e6d8, final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619, final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856192) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "showFaceIdAuthDialogImpl begin");
        mz2.d2.IML.f414644d = str;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15817, 3);
        mz2.e1 e1Var = (mz2.e1) i95.n0.c(mz2.e1.class);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("face_auth_scene", 1);
        ((mz2.j2) e1Var).wi((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get(), new lz2.a() { // from class: com.tencent.kinda.framework.app.KindaFingerprintImpl.7
            @Override // lz2.a
            /* renamed from: onAuthCancel */
            public void mo11325x21a77981() {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.TAG, "face id auth cancel");
                com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856193 = abstractC3623x3b4856192;
                if (abstractC3623x3b4856193 != null) {
                    abstractC3623x3b4856193.mo25801x2e7a5e();
                }
            }

            @Override // lz2.a
            /* renamed from: onAuthFail */
            public void mo11326xfa7237e5(int i17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.TAG, "face id auth fail: %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.this.f11996xe0eee3d3));
                com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856193 = abstractC3623x3b485619;
                if (abstractC3623x3b4856193 != null) {
                    abstractC3623x3b4856193.mo25801x2e7a5e();
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.this.f11996xe0eee3d3++;
            }

            @Override // lz2.a
            /* renamed from: onAuthSuccess */
            public void mo11327x833155dc(int i17, int i18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.TAG, "face id auth success");
                r45.ac acVar = new r45.ac();
                acVar.f451440d = true;
                acVar.f451442f = "";
                acVar.f451443g = "";
                acVar.f451444h = ((pz2.a) gm0.j1.s(pz2.a.class)).Uh();
                com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37 c3129x8f263e37 = com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.this;
                int i19 = c3129x8f263e37.f11996xe0eee3d3 + 1;
                c3129x8f263e37.f11996xe0eee3d3 = i19;
                acVar.f451441e = i19;
                try {
                    abstractC3617x3879e6d8.mo28426x2e7a5e(acVar.mo14344x5f01b1f6(), i17);
                } catch (java.io.IOException unused) {
                }
            }
        }, bundle);
    }

    /* renamed from: showProgress */
    public void m25175x918cb44a() {
        android.app.Dialog dialog = this.f11997x691689c3;
        if (dialog == null || !dialog.isShowing()) {
            android.app.Dialog dialog2 = this.f11997x691689c3;
            if (dialog2 != null) {
                dialog2.dismiss();
            }
            if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get() != null) {
                this.f11997x691689c3 = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.h(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get(), false, new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.kinda.framework.app.KindaFingerprintImpl.9
                    @Override // android.content.DialogInterface.OnCancelListener
                    public void onCancel(android.content.DialogInterface dialogInterface) {
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.this.m25165x725102ab();
                    }
                });
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "fingerprint loading error! KindaContext return null!!");
            }
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3461xfbe4ccdc
    /* renamed from: supportBioType */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3387x5ccc5442 mo25176x5b703d93() {
        pz2.a aVar = this.mgr;
        if (aVar != null && aVar.Ic() && !this.mgr.H4() && ((mz2.a) this.mgr).a()) {
            return com.p314xaae8f345.p347x615374d.gen.EnumC3387x5ccc5442.FINGERPRINT;
        }
        pz2.a aVar2 = this.mgr;
        return (aVar2 == null || !aVar2.Rb() || this.mgr.D() || !((mz2.a) this.mgr).b()) ? com.p314xaae8f345.p347x615374d.gen.EnumC3387x5ccc5442.NONE : com.p314xaae8f345.p347x615374d.gen.EnumC3387x5ccc5442.FACEID;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3461xfbe4ccdc
    /* renamed from: tryInitBiometricImpl */
    public void mo25177xa528974d(final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619) {
        pz2.a aVar = (pz2.a) gm0.j1.s(pz2.a.class);
        ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.l lVar = com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.l.instance;
        boolean z17 = lVar.h() == 2;
        ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).getClass();
        boolean z18 = lVar.h() == 3;
        mz2.a aVar2 = (mz2.a) aVar;
        if (!aVar2.b() && !aVar2.a() && !z17 && !z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "not open biometric pay or biometric lock, not need init soter");
            abstractC3623x3b485619.mo25801x2e7a5e();
            return;
        }
        ((ie0.m) ((je0.i) i95.n0.c(je0.i.class))).getClass();
        if (se4.h.f488458a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "soter have init success");
            if (aVar2.mo148658x368f3a() == 2) {
                abstractC3623x3b485619.mo25801x2e7a5e();
                return;
            }
            ku5.u0 u0Var = ku5.t0.f394148d;
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.kinda.framework.app.KindaFingerprintImpl.2
                @Override // java.lang.Runnable
                public void run() {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.TAG, "soter wait, because not has prepare");
                    abstractC3623x3b485619.mo25801x2e7a5e();
                }
            };
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(runnable, 1000L, false);
            return;
        }
        if (((ie0.m) ((je0.i) i95.n0.c(je0.i.class))).Ai() && !((ie0.m) ((je0.i) i95.n0.c(je0.i.class))).wi()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "really not support soter");
            abstractC3623x3b485619.mo25801x2e7a5e();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "start tryInitBiometricImpl");
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        f11991xddaef71f = java.lang.System.currentTimeMillis();
        f11990x360c7b10 = abstractC3623x3b485619;
        ku5.u0 u0Var2 = ku5.t0.f394148d;
        java.lang.Runnable runnable2 = new java.lang.Runnable() { // from class: com.tencent.kinda.framework.app.KindaFingerprintImpl.3
            @Override // java.lang.Runnable
            public void run() {
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.f11990x360c7b10 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.TAG, "init soter out time, but initEndEvent is null, normal case");
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.TAG, "init soter out time, call initEndEvent");
                com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.f11990x360c7b10.mo25801x2e7a5e();
                com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 unused = com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3129x8f263e37.f11990x360c7b10 = null;
            }
        };
        ku5.t0 t0Var2 = (ku5.t0) u0Var2;
        t0Var2.getClass();
        t0Var2.z(runnable2, 4000L, false);
        f11992x844d22aa.mo48813x58998cd();
        ((ie0.m) ((je0.i) i95.n0.c(je0.i.class))).getClass();
        se4.h.a(true, true, null);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3461xfbe4ccdc
    /* renamed from: userCancel */
    public void mo25178x428ac225() {
        pz2.a aVar = this.mgr;
        if (aVar == null) {
            return;
        }
        aVar.mo148659x428ac225();
    }
}
