package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class mz {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f50468a = "data/";

    /* renamed from: f, reason: collision with root package name */
    private static final java.lang.String f50469f = "/tencentmapsdk/";

    /* renamed from: g, reason: collision with root package name */
    private static com.tencent.mapsdk.internal.mz f50470g;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f50471b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f50472c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f50473d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f50474e;

    /* renamed from: h, reason: collision with root package name */
    private android.content.Context f50475h;

    /* renamed from: i, reason: collision with root package name */
    private java.lang.String f50476i;

    /* renamed from: j, reason: collision with root package name */
    private java.lang.String f50477j;

    /* renamed from: k, reason: collision with root package name */
    private java.lang.String f50478k;

    /* renamed from: l, reason: collision with root package name */
    private java.lang.String f50479l;

    /* renamed from: m, reason: collision with root package name */
    private java.lang.String f50480m;

    /* renamed from: n, reason: collision with root package name */
    private java.lang.String f50481n;

    /* renamed from: o, reason: collision with root package name */
    private java.lang.String f50482o;

    /* renamed from: p, reason: collision with root package name */
    private java.lang.String f50483p;

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private mz(android.content.Context r5, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions r6) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.mz.<init>(android.content.Context, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions):void");
    }

    private static com.tencent.mapsdk.internal.mz a(android.content.Context context) {
        return a(context, (com.tencent.tencentmap.mapsdk.maps.TencentMapOptions) null);
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
        this.f50481n = this.f50475h.getFilesDir().getAbsolutePath();
        this.f50478k = this.f50481n + "/tencentMapSdk/config/";
        this.f50482o = this.f50478k + "temp/";
        this.f50479l = this.f50481n + "/tencentMapSdk/assets/";
        this.f50480m = this.f50481n + "/tencentMapSdk/dynamicAssets/";
        android.content.Context context = this.f50475h;
        java.lang.String a17 = com.tencent.mapsdk.internal.my.a(context).a(com.tencent.mapsdk.internal.er.f49386e);
        if (com.tencent.mapsdk.internal.hr.a(com.tencent.mapsdk.internal.my.a(context).a(com.tencent.mapsdk.internal.er.f49386e)) || com.tencent.mapsdk.internal.hn.b("4.1.0", a17) <= 0) {
            return;
        }
        com.tencent.mapsdk.internal.mx.a(context);
        com.tencent.mapsdk.internal.ks.f(new java.io.File(this.f50478k));
        com.tencent.mapsdk.internal.ks.f(new java.io.File(this.f50479l));
        com.tencent.mapsdk.internal.ks.f(new java.io.File(this.f50481n + "/tencentMapSdk/subKey/"));
    }

    private void g() {
        java.lang.String a17 = a();
        java.lang.String a18 = com.tencent.mapsdk.internal.ks.a(this.f50475h);
        if (com.tencent.mapsdk.internal.hr.a(a18)) {
            this.f50476i = a17 + f50469f;
        } else {
            this.f50476i = a17 + f50469f + a18;
        }
        this.f50477j = this.f50476i + "/data/v4/render/";
        this.f50471b = this.f50476i + "/sat/";
        this.f50472c = this.f50477j + "closeRoadDatas/";
        this.f50473d = this.f50477j + "events/icons";
        this.f50474e = this.f50477j + "offlineMaps/";
    }

    private java.lang.String h() {
        com.tencent.mapsdk.internal.kt.a(this.f50471b);
        return this.f50471b;
    }

    private java.lang.String i() {
        com.tencent.mapsdk.internal.kt.a(this.f50472c);
        return this.f50472c;
    }

    private java.lang.String j() {
        com.tencent.mapsdk.internal.kt.a(this.f50473d);
        return this.f50473d;
    }

    private java.lang.String k() {
        com.tencent.mapsdk.internal.kt.a(this.f50474e);
        return this.f50474e;
    }

    public final java.io.File c() {
        return new java.io.File(this.f50476i);
    }

    public static com.tencent.mapsdk.internal.mz a(android.content.Context context, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions) {
        if (f50470g == null) {
            f50470g = new com.tencent.mapsdk.internal.mz(context, tencentMapOptions);
        }
        return f50470g;
    }

    public final java.lang.String c(java.lang.String str) {
        java.lang.String str2;
        if (com.tencent.mapsdk.internal.hr.a(str)) {
            str2 = this.f50482o;
        } else {
            str2 = a(str) + "temp/";
        }
        com.tencent.mapsdk.internal.kt.a(str2);
        return str2;
    }

    public final java.io.File b() {
        return new java.io.File(this.f50476i + "/data/");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.tencent.tencentmap.mapsdk.maps.TencentMapOptions r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L34
            java.lang.String r5 = r5.getCustomCacheRootPath()
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
            r4.f50483p = r5
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.mz.a(com.tencent.tencentmap.mapsdk.maps.TencentMapOptions):void");
    }

    public final java.lang.String b(java.lang.String str) {
        java.lang.String str2;
        if (com.tencent.mapsdk.internal.hr.a(str)) {
            str2 = this.f50479l;
        } else {
            str2 = this.f50481n + "/tencentMapSdk/subKey/" + str + "/assets/";
        }
        com.tencent.mapsdk.internal.kt.a(str2);
        return str2;
    }

    public final java.lang.String e() {
        com.tencent.mapsdk.internal.kt.a(this.f50480m);
        return this.f50480m;
    }

    public final java.lang.String d() {
        com.tencent.mapsdk.internal.kt.a(this.f50477j);
        return this.f50477j;
    }

    private void a(android.content.Context context, java.lang.String str) {
        if (!com.tencent.mapsdk.internal.hr.a(com.tencent.mapsdk.internal.my.a(context).a(com.tencent.mapsdk.internal.er.f49386e)) && com.tencent.mapsdk.internal.hn.b("4.1.0", str) > 0) {
            com.tencent.mapsdk.internal.mx.a(context);
            com.tencent.mapsdk.internal.ks.f(new java.io.File(this.f50478k));
            com.tencent.mapsdk.internal.ks.f(new java.io.File(this.f50479l));
            com.tencent.mapsdk.internal.ks.f(new java.io.File(this.f50481n + "/tencentMapSdk/subKey/"));
        }
    }

    public final java.lang.String a() {
        if (!android.text.TextUtils.isEmpty(this.f50483p)) {
            return this.f50483p;
        }
        android.content.Context context = this.f50475h;
        java.lang.String b17 = b(context);
        if (e(b17) >= 5) {
            return b17;
        }
        java.lang.String path = context.getFilesDir().getPath();
        return e(path) < 5 ? b(context) : path;
    }

    public final java.lang.String a(java.lang.String str) {
        java.lang.String str2;
        if (com.tencent.mapsdk.internal.hr.a(str)) {
            str2 = this.f50478k;
        } else {
            str2 = this.f50481n + "/tencentMapSdk/subKey/" + str + "/config/";
        }
        com.tencent.mapsdk.internal.kt.a(str2);
        return str2;
    }
}
