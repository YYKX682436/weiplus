package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2046x36f002;

/* renamed from: com.tencent.mm.plugin.scanner.util.ScanCameraLightDetector */
/* loaded from: classes13.dex */
public class C17339x2dbc71fa {

    /* renamed from: l, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2046x36f002.C17339x2dbc71fa f241362l = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2046x36f002.C17339x2dbc71fa();

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f241364b;

    /* renamed from: c, reason: collision with root package name */
    public int f241365c;

    /* renamed from: e, reason: collision with root package name */
    public android.os.HandlerThread f241367e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f241368f;

    /* renamed from: a, reason: collision with root package name */
    public int f241363a = 50;

    /* renamed from: d, reason: collision with root package name */
    public long f241366d = -1;

    /* renamed from: g, reason: collision with root package name */
    public boolean f241369g = false;

    /* renamed from: h, reason: collision with root package name */
    public int f241370h = 72;

    /* renamed from: i, reason: collision with root package name */
    public int f241371i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f241372j = 0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f241373k = false;

    public static boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2046x36f002.C17339x2dbc71fa c17339x2dbc71fa, byte[] bArr, int i17, int i18) {
        int i19;
        boolean z17;
        int i27;
        int i28;
        int i29;
        int i37;
        int i38;
        c17339x2dbc71fa.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr) || bArr.length <= (i19 = i17 * i18)) {
            return false;
        }
        int m68860xfec64266 = m68860xfec64266(bArr, i17, i18);
        boolean z18 = m68860xfec64266 < c17339x2dbc71fa.f241363a;
        if (c17339x2dbc71fa.f241369g) {
            if (bArr.length < i19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanCameraLightDetector", "YUV data too small");
                z17 = false;
                i27 = 0;
            } else {
                double[] dArr = new double[4];
                int i39 = 0;
                for (int i47 = 4; i39 < i47; i47 = 4) {
                    if (i39 < 2) {
                        i29 = (i39 * i17) / 2;
                        i37 = ((i39 + 1) * i17) / 2;
                        i38 = i18 / 2;
                        i28 = 0;
                    } else {
                        i28 = i18 / 2;
                        i29 = ((i39 - 2) * i17) / 2;
                        i37 = ((i39 - 1) * i17) / 2;
                        i38 = i18;
                    }
                    long j17 = 0;
                    int i48 = 0;
                    while (i28 < i38) {
                        int i49 = i29;
                        while (i49 < i37) {
                            j17 += bArr[(i28 * i17) + i49] & 255;
                            i48++;
                            i49++;
                            i29 = i29;
                            i37 = i37;
                        }
                        i28++;
                    }
                    dArr[i39] = java.lang.Math.round((i48 > 0 ? j17 / i48 : 0.0d) * 100.0d) / 100.0d;
                    i39++;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCameraLightDetector", "lum light chunking: " + java.util.Arrays.toString(dArr));
                z17 = false;
                double d17 = dArr[0];
                for (int i57 = 1; i57 < 4; i57++) {
                    double d18 = dArr[i57];
                    if (d18 < d17) {
                        d17 = d18;
                    }
                }
                i27 = (int) d17;
            }
            if (i27 < c17339x2dbc71fa.f241363a) {
                z18 = true;
            }
        } else {
            z17 = false;
            i27 = 0;
        }
        if (m68860xfec64266 < c17339x2dbc71fa.f241370h) {
            z17 = true;
        }
        long j18 = c17339x2dbc71fa.f241372j;
        int i58 = c17339x2dbc71fa.f241371i;
        long j19 = (j18 * i58) + m68860xfec64266;
        int i59 = i58 + 1;
        c17339x2dbc71fa.f241371i = i59;
        long j27 = j19 / i59;
        c17339x2dbc71fa.f241372j = j27;
        int i66 = (int) j27;
        if (c17339x2dbc71fa.f241373k) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.h0.f298581b.g(true, i66);
        } else {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.h0.f298581b.g(z17, i66);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCameraLightDetector", "lum light: %s, lum new light: %s(%s), darkMode: %s, lum avg: %s", java.lang.Integer.valueOf(m68860xfec64266), java.lang.Integer.valueOf(i27), java.lang.Boolean.valueOf(c17339x2dbc71fa.f241369g), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i66));
        return z18;
    }

    /* renamed from: calcLumNative */
    private static native int m68860xfec64266(byte[] bArr, int i17, int i18);

    public void b(byte[] bArr, int i17, int i18) {
        android.os.HandlerThread handlerThread;
        long j17 = this.f241366d;
        if (j17 >= 0) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (android.os.SystemClock.elapsedRealtime() - j17 < 1000) {
                return;
            }
        }
        if (this.f241368f == null || (handlerThread = this.f241367e) == null || !handlerThread.isAlive()) {
            return;
        }
        e04.e1 e1Var = new e04.e1(this, null);
        e1Var.f327425a = bArr;
        e1Var.f327426b = i17;
        e1Var.f327427c = i18;
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d;
        obtain.obj = e1Var;
        this.f241368f.mo50308x2936bf5f(obtain);
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f241366d = android.os.SystemClock.elapsedRealtime();
    }

    public final void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCameraLightDetector", "initDetectThread");
        d();
        this.f241371i = 0;
        this.f241372j = 0L;
        this.f241373k = false;
        this.f241369g = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_scan_service_torch_chunking_opt, false);
        this.f241363a = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_scan_service_yuv_dark_threshold_v1, 60);
        this.f241370h = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_scan_service_dark_mode_threshold_v1, 72);
        int i17 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a("ScanCameraLightDetector_detectThread", 5);
        this.f241367e = a17;
        a17.start();
        this.f241368f = new e04.d1(this, this.f241367e.getLooper());
    }

    public void d() {
        try {
            this.f241366d = -1L;
            android.os.HandlerThread handlerThread = this.f241367e;
            if (handlerThread != null) {
                handlerThread.quit();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanCameraLightDetector", e17, "stop error: %s", e17.getMessage());
        }
    }
}
