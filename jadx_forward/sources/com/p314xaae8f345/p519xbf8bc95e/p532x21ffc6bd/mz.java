package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class mz {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f132001a = "data/";

    /* renamed from: f, reason: collision with root package name */
    private static final java.lang.String f132002f = "/tencentmapsdk/";

    /* renamed from: g, reason: collision with root package name */
    private static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mz f132003g;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f132004b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f132005c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f132006d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f132007e;

    /* renamed from: h, reason: collision with root package name */
    private android.content.Context f132008h;

    /* renamed from: i, reason: collision with root package name */
    private java.lang.String f132009i;

    /* renamed from: j, reason: collision with root package name */
    private java.lang.String f132010j;

    /* renamed from: k, reason: collision with root package name */
    private java.lang.String f132011k;

    /* renamed from: l, reason: collision with root package name */
    private java.lang.String f132012l;

    /* renamed from: m, reason: collision with root package name */
    private java.lang.String f132013m;

    /* renamed from: n, reason: collision with root package name */
    private java.lang.String f132014n;

    /* renamed from: o, reason: collision with root package name */
    private java.lang.String f132015o;

    /* renamed from: p, reason: collision with root package name */
    private java.lang.String f132016p;

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private mz(android.content.Context r5, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 r6) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mz.<init>(android.content.Context, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions):void");
    }

    private static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mz a(android.content.Context context) {
        return a(context, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7) null);
    }

    private static java.lang.String b(android.content.Context context) {
        java.io.File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            return externalFilesDir.getAbsolutePath();
        }
        return context.getFilesDir().getPath();
    }

    private static boolean d(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        java.io.File file = new java.io.File(str);
        return file.isDirectory() && file.canRead() && file.canWrite() && e(str) > 5;
    }

    private static long e(java.lang.String str) {
        try {
            android.os.StatFs statFs = new android.os.StatFs(str);
            return ((statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) / 1024) / 1024;
        } catch (java.lang.Exception unused) {
            return 0L;
        }
    }

    private void f() {
        this.f132014n = this.f132008h.getFilesDir().getAbsolutePath();
        this.f132011k = this.f132014n + "/tencentMapSdk/config/";
        this.f132015o = this.f132011k + "temp/";
        this.f132012l = this.f132014n + "/tencentMapSdk/assets/";
        this.f132013m = this.f132014n + "/tencentMapSdk/dynamicAssets/";
        android.content.Context context = this.f132008h;
        java.lang.String a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.my.a(context).a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130919e);
        if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.my.a(context).a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130919e)) || com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.b("4.1.0", a17) <= 0) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mx.a(context);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.f(new java.io.File(this.f132011k));
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.f(new java.io.File(this.f132012l));
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.f(new java.io.File(this.f132014n + "/tencentMapSdk/subKey/"));
    }

    private void g() {
        java.lang.String a17 = a();
        java.lang.String a18 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(this.f132008h);
        if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(a18)) {
            this.f132009i = a17 + f132002f;
        } else {
            this.f132009i = a17 + f132002f + a18;
        }
        this.f132010j = this.f132009i + "/data/v4/render/";
        this.f132004b = this.f132009i + "/sat/";
        this.f132005c = this.f132010j + "closeRoadDatas/";
        this.f132006d = this.f132010j + "events/icons";
        this.f132007e = this.f132010j + "offlineMaps/";
    }

    private java.lang.String h() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(this.f132004b);
        return this.f132004b;
    }

    private java.lang.String i() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(this.f132005c);
        return this.f132005c;
    }

    private java.lang.String j() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(this.f132006d);
        return this.f132006d;
    }

    private java.lang.String k() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(this.f132007e);
        return this.f132007e;
    }

    public final java.io.File c() {
        return new java.io.File(this.f132009i);
    }

    public static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mz a(android.content.Context context, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a7) {
        if (f132003g == null) {
            f132003g = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mz(context, c25966x7e4576a7);
        }
        return f132003g;
    }

    public final java.lang.String c(java.lang.String str) {
        java.lang.String str2;
        if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(str)) {
            str2 = this.f132015o;
        } else {
            str2 = a(str) + "temp/";
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(str2);
        return str2;
    }

    public final java.io.File b() {
        return new java.io.File(this.f132009i + "/data/");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L34
            java.lang.String r5 = r5.m99193xed80eaa2()
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L2f
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            boolean r1 = r0.isDirectory()
            if (r1 == 0) goto L2f
            boolean r1 = r0.canRead()
            if (r1 == 0) goto L2f
            boolean r0 = r0.canWrite()
            if (r0 == 0) goto L2f
            long r0 = e(r5)
            r2 = 5
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L2f
            r0 = 1
            goto L30
        L2f:
            r0 = 0
        L30:
            if (r0 == 0) goto L34
            r4.f132016p = r5
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mz.a(com.tencent.tencentmap.mapsdk.maps.TencentMapOptions):void");
    }

    public final java.lang.String b(java.lang.String str) {
        java.lang.String str2;
        if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(str)) {
            str2 = this.f132012l;
        } else {
            str2 = this.f132014n + "/tencentMapSdk/subKey/" + str + "/assets/";
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(str2);
        return str2;
    }

    public final java.lang.String e() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(this.f132013m);
        return this.f132013m;
    }

    public final java.lang.String d() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(this.f132010j);
        return this.f132010j;
    }

    private void a(android.content.Context context, java.lang.String str) {
        if (!com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.my.a(context).a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130919e)) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.b("4.1.0", str) > 0) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mx.a(context);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.f(new java.io.File(this.f132011k));
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.f(new java.io.File(this.f132012l));
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.f(new java.io.File(this.f132014n + "/tencentMapSdk/subKey/"));
        }
    }

    public final java.lang.String a() {
        if (!android.text.TextUtils.isEmpty(this.f132016p)) {
            return this.f132016p;
        }
        android.content.Context context = this.f132008h;
        java.lang.String b17 = b(context);
        if (e(b17) >= 5) {
            return b17;
        }
        java.lang.String path = context.getFilesDir().getPath();
        return e(path) < 5 ? b(context) : path;
    }

    public final java.lang.String a(java.lang.String str) {
        java.lang.String str2;
        if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(str)) {
            str2 = this.f132011k;
        } else {
            str2 = this.f132014n + "/tencentMapSdk/subKey/" + str + "/config/";
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(str2);
        return str2;
    }
}
