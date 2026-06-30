package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29;

/* loaded from: classes15.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1 f240376a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f240377b = true;

    /* renamed from: c, reason: collision with root package name */
    public static int f240378c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static int f240379d = 12;

    /* renamed from: e, reason: collision with root package name */
    public static int f240380e = -1;

    /* renamed from: f, reason: collision with root package name */
    public static transient boolean f240381f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f240382g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f240383h;

    /* renamed from: i, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f240384i;

    /* renamed from: j, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17279x15159658 f240385j;

    /* renamed from: k, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.y0 f240386k;

    /* renamed from: l, reason: collision with root package name */
    public static java.lang.String f240387l;

    /* renamed from: m, reason: collision with root package name */
    public static int f240388m;

    /* renamed from: n, reason: collision with root package name */
    public static int f240389n;

    /* renamed from: o, reason: collision with root package name */
    public static int f240390o;

    /* renamed from: p, reason: collision with root package name */
    public static int f240391p;

    /* renamed from: q, reason: collision with root package name */
    public static int f240392q;

    /* renamed from: r, reason: collision with root package name */
    public static long f240393r;

    /* renamed from: s, reason: collision with root package name */
    public static uz3.b f240394s;

    /* renamed from: t, reason: collision with root package name */
    public static long f240395t;

    /* renamed from: u, reason: collision with root package name */
    public static final jz5.g f240396u;

    /* renamed from: v, reason: collision with root package name */
    public static java.lang.String f240397v;

    /* renamed from: w, reason: collision with root package name */
    public static java.lang.String f240398w;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1 d1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1();
        f240376a = d1Var;
        f240385j = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17279x15159658();
        f240386k = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.y0.f240635d;
        f240395t = -1L;
        f240396u = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.z0.f240642d);
        d1Var.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007d, code lost:
    
        if (r0 == true) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Integer a(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1 r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6.getClass()
            java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r8)
            java.util.regex.Matcher r6 = r6.matcher(r7)
        Lb:
            boolean r7 = r6.find()
            if (r7 == 0) goto La7
            int r7 = r6.groupCount()
            if (r7 <= 0) goto Lb
            java.lang.String r0 = r6.group()
            java.lang.String r7 = "group(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r7)
            java.lang.String r7 = "="
            java.lang.String[] r1 = new java.lang.String[]{r7}
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            java.util.List r7 = r26.n0.f0(r0, r1, r2, r3, r4, r5)
            int r8 = r7.size()
            r0 = 2
            if (r8 < r0) goto Lb
            r8 = 0
            java.lang.Object r0 = kz5.n0.a0(r7, r8)
            java.lang.String r0 = (java.lang.String) r0
            r1 = 1
            java.lang.Object r7 = kz5.n0.a0(r7, r1)
            java.lang.String r7 = (java.lang.String) r7
            if (r0 == 0) goto L80
            if (r9 == 0) goto L4c
            boolean r0 = r0.contentEquals(r9)
            goto L7d
        L4c:
            boolean r2 = r9 instanceof java.lang.String
            if (r2 == 0) goto L55
            boolean r0 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, r9)
            goto L7d
        L55:
            if (r0 != r9) goto L58
            goto L7a
        L58:
            if (r9 == 0) goto L7c
            int r2 = r0.length()
            int r3 = r9.length()
            if (r2 == r3) goto L65
            goto L7c
        L65:
            int r2 = r0.length()
            r3 = r8
        L6a:
            if (r3 >= r2) goto L7a
            char r4 = r0.charAt(r3)
            char r5 = r9.charAt(r3)
            if (r4 == r5) goto L77
            goto L7c
        L77:
            int r3 = r3 + 1
            goto L6a
        L7a:
            r0 = r1
            goto L7d
        L7c:
            r0 = r8
        L7d:
            if (r0 != r1) goto L80
            goto L81
        L80:
            r1 = r8
        L81:
            if (r1 == 0) goto Lb
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "getScanProductServerConfigByKey key: "
            r6.<init>(r0)
            r6.append(r9)
            java.lang.String r9 = ", value: "
            r6.append(r9)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r9 = "MicroMsg.ScanFastFocusEngineManager"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r9, r6)
            int r6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(r7, r8)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto La8
        La7:
            r6 = 0
        La8:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.a(com.tencent.mm.plugin.scanner.model.d1, java.lang.String, java.lang.String, java.lang.String):java.lang.Integer");
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.api.C17266x8cecd44e d(byte[] imageData, int i17, int i18, boolean z17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageData, "imageData");
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17279x15159658.m68564xf2ac9ccb()) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17279x15159658 c17279x15159658 = f240385j;
        if (f240387l == null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f240384i;
            if (o4Var == null || (str = o4Var.getString("scan_config_phash_config", "")) == null) {
                str = "";
            }
            f240387l = str;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1 d1Var = f240376a;
        if (d1Var.k(4)) {
            d1Var.p(4);
        }
        java.lang.String str2 = f240387l;
        c17279x15159658.m68589x173378be(str2 != null ? str2 : "");
        return c17279x15159658.m68566x6feb509a(imageData, i17, i18, z17);
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17279x15159658 e(int i17, float f17, float f18, float f19, float f27) {
        if (f240386k != com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.y0.f240636e) {
            return null;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17279x15159658 c17279x15159658 = f240385j;
        c17279x15159658.m68585xd1eb6221();
        float f28 = (f19 - f17) * 0.100000024f;
        float f29 = (f27 - f18) * 0.100000024f;
        android.graphics.RectF rectF = new android.graphics.RectF(java.lang.Math.max(0.0f, f17 - f28), java.lang.Math.max(0.0f, f18 - f29), java.lang.Math.min(1.0f, f19 + f28), java.lang.Math.min(1.0f, f27 + f29));
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17279x15159658 m68568xd37de1db = c17279x15159658.m68568xd37de1db(i17, rectF.left, rectF.top, rectF.right, rectF.bottom);
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = java.lang.Integer.valueOf(i17);
        byte[] bArr = m68568xd37de1db.f37918x2e555221;
        objArr[1] = bArr;
        objArr[2] = bArr != null ? java.lang.Integer.valueOf(bArr.length) : null;
        objArr[3] = java.lang.Long.valueOf(currentTimeMillis2 - currentTimeMillis);
        objArr[4] = java.lang.Integer.valueOf(c17279x15159658.f37929x6be2dc6);
        objArr[5] = java.lang.Integer.valueOf(c17279x15159658.f37923xb7389127);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanFastFocusEngineManager", "getCropYUVByTrackId trackId: %s, result image: %s, yuv size: %d, cost: %d, width: %d, height: %d", objArr);
        return m68568xd37de1db;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a0, code lost:
    
        if (r4 == 13) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String f(boolean r13) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f(boolean):java.lang.String");
    }

    public static final android.graphics.Point g(int i17, int i18, int i19) {
        int i27;
        int i28;
        if (i19 == 90 || i19 == 270) {
            i27 = i17;
            i28 = i18;
        } else {
            i28 = i17;
            i27 = i18;
        }
        if (i28 <= 512) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanFastFocusEngineManager", "getResizeImageSize not need resize");
            return new android.graphics.Point(i28, i27);
        }
        int i29 = (i27 * 512) / i28;
        if (i29 % 2 != 0) {
            i29 = java.lang.Math.max(0, i29 - 1);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanFastFocusEngineManager", "getResizeImageSize width: " + i17 + ", height: " + i18 + ", rotation: " + i19 + ", resize: (512, " + i29 + ')');
        return new android.graphics.Point(512, i29);
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final sz3.c1 h(byte[] r21, int r22, int r23, int r24, int r25, dz3.g r26) {
        /*
            Method dump skipped, instructions count: 723
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.h(byte[], int, int, int, int, dz3.g):sz3.c1");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x021a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final sz3.c1 i(int r22, android.graphics.RectF r23, byte[] r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.i(int, android.graphics.RectF, byte[], int, int):sz3.c1");
    }

    public static final boolean j() {
        if (f240386k == com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.y0.f240636e) {
            return f240377b && !f240381f;
        }
        if (f240386k != com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.y0.f240637f) {
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("needDetectByServer:");
        sb6.append(f240378c);
        sb6.append('/');
        int i17 = f240380e;
        if (i17 <= 0) {
            i17 = f240379d;
        }
        sb6.append(i17);
        sb6.append('/');
        sb6.append(f240381f);
        sb6.append('/');
        sb6.append(f240382g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanFastFocusEngineManager", sb6.toString());
        if (f240381f) {
            return false;
        }
        int i18 = f240378c;
        int i19 = f240380e;
        if (i18 < (i19 > 0 ? i19 : f240379d)) {
            return false;
        }
        if ((i19 > 0 ? i19 : f240379d) == i19) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1259, 215);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1259, 216);
        }
        if (f240382g) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1259, 217);
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.A(1259, 218);
        if (f240383h) {
            g0Var.A(1259, 219);
        }
        return true;
    }

    public static final void l() {
        if (f240386k == com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.y0.f240636e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanFastFocusEngineManager", "release");
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17279x15159658 c17279x15159658 = f240385j;
            c17279x15159658.m68585xd1eb6221();
            c17279x15159658.m68581x7f877f0();
        }
        f240386k = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.y0.f240635d;
        f240378c = 0;
        f240381f = false;
        uz3.b bVar = f240394s;
        if (bVar != null) {
            int i17 = 0;
            long j17 = 0;
            for (java.util.Map.Entry entry : bVar.f513695b.entrySet()) {
                if (((uz3.a) entry.getValue()).f513692a != 0 && ((uz3.a) entry.getValue()).f513693b != 0) {
                    j17 += ((uz3.a) entry.getValue()).f513693b - ((uz3.a) entry.getValue()).f513692a;
                    i17++;
                }
            }
            java.util.Iterator it = ((java.util.ArrayList) bVar.f513696c).iterator();
            int i18 = 0;
            int i19 = 0;
            while (it.hasNext()) {
                i18 += ((java.lang.Number) it.next()).intValue();
                i19++;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanProductPerformanceHelper", "dumpPerformance costTotal: %s, count: %s, average: %s, frameCost: %s, ave: %s, frameCount: %s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Float.valueOf((((float) j17) * 1.0f) / i17), java.lang.Integer.valueOf(i18), java.lang.Float.valueOf((i18 * 1.0f) / i19), java.lang.Integer.valueOf(i19));
        }
        uz3.b bVar2 = f240394s;
        if (bVar2 != null && f240393r == bVar2.f513694a) {
            bVar2.f513695b.clear();
        }
        f240393r = 0L;
        f240382g = false;
        f240397v = null;
        f240398w = null;
        f240388m = 0;
        f240389n = 0;
        f240390o = 0;
        f240391p = 0;
        f240392q = 0;
    }

    public static final jz5.l m(byte[] bArr, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3) {
        if (f240386k != com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.y0.f240636e && f240386k != com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.y0.f240637f) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17279x15159658 c17279x15159658 = f240385j;
        c17279x15159658.f37922xaeef55d6 = null;
        int intValue = num3 != null ? num3.intValue() : f240392q;
        int intValue2 = num != null ? num.intValue() : f240390o;
        int intValue3 = num2 != null ? num2.intValue() : f240391p;
        android.graphics.Point g17 = g(intValue2, intValue3, intValue);
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17279x15159658 m68586x5bb4171c = c17279x15159658.m68586x5bb4171c(bArr, intValue2, intValue3, intValue, g17.x, g17.y);
        byte[] bArr2 = c17279x15159658.f37922xaeef55d6;
        return new jz5.l(m68586x5bb4171c != null ? m68586x5bb4171c.f37922xaeef55d6 : null, g17);
    }

    public static final void o(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanFastFocusEngineManager", "setDetectingByServer isDetecting: " + z17);
        f240381f = z17;
    }

    public final int[] b(byte[] byteArray) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(byteArray, "byteArray");
        java.util.ArrayList arrayList = new java.util.ArrayList(byteArray.length);
        for (byte b17 : byteArray) {
            arrayList.add(java.lang.Integer.valueOf(b17));
        }
        return kz5.n0.R0(arrayList);
    }

    public final void c() {
        try {
            boolean a17 = gm0.j1.a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanFastFocusEngineManager", "initMMKV %s, mmkv: %s", java.lang.Boolean.valueOf(a17), f240384i);
            if (a17 && f240384i == null) {
                f240384i = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(c01.z1.r() + "_scan_config_mmkv");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanFastFocusEngineManager", e17, "checkInitMMKV exception", new java.lang.Object[0]);
        }
    }

    public final boolean k(int i17) {
        long j17;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f240384i;
        if (o4Var != null) {
            j17 = o4Var.getLong("scan_config_last_update_" + i17, 0L);
        } else {
            j17 = 0;
        }
        return j17 == 0 || (j17 > 0 && java.lang.System.currentTimeMillis() - j17 >= 86400000);
    }

    public final void n(int i17, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanFastFocusEngineManager", "saveUpdateScanConfigTime type: %d, timestamp: %d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f240384i;
        if (o4Var != null) {
            o4Var.putLong("scan_config_last_update_" + i17, j17);
        }
    }

    public final void p(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanFastFocusEngineManager", "updateScanConfig type: %d", java.lang.Integer.valueOf(i17));
        n(i17, java.lang.System.currentTimeMillis());
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.b1 b1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.b1(i17);
        bz3.l lVar = bz3.l.f118335d;
        ((ku5.t0) ku5.t0.f394148d).h(new bz3.k(i17, b1Var), "ScanConfigSync");
    }
}
