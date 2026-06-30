package com.tencent.mm.plugin.ext.provider;

/* loaded from: classes12.dex */
public class ExtContentProviderBase extends android.content.ContentProvider {

    /* renamed from: m, reason: collision with root package name */
    public static boolean f99870m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.HashMap f99871n = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final android.database.MatrixCursor f99872d = new android.database.MatrixCursor(new java.lang.String[0]);

    /* renamed from: e, reason: collision with root package name */
    public long f99873e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f99874f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f99875g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String[] f99876h;

    /* renamed from: i, reason: collision with root package name */
    public int f99877i;

    public ExtContentProviderBase() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f99873e = android.os.SystemClock.elapsedRealtime();
        this.f99875g = "";
        this.f99877i = 0;
    }

    public final boolean a(com.tencent.mm.pluginsdk.model.app.m mVar, boolean z17) {
        for (java.lang.String str : this.f99876h) {
            if (str.equals(mVar.field_packageName) && com.tencent.mm.pluginsdk.model.app.i1.a(com.tencent.mm.sdk.platformtools.x2.f193071a, mVar, str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ExtContentProviderBase", "check app success, calling package name = %s, in blacklist before? = %b", str, java.lang.Boolean.valueOf(z17));
                this.f99874f = str;
                return true;
            }
        }
        return false;
    }

    public boolean b() {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExtContentProviderBase", "checkIsLogin()");
            if (!f99870m) {
                v25.b bVar = new v25.b();
                bVar.b(4000L, new u62.b(this, bVar));
            }
            if (gm0.j1.a() && c01.d9.h() && !gm0.m.r()) {
                f99870m = true;
            } else {
                f99870m = false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ExtContentProviderBase", "hasLogin = " + f99870m);
            return f99870m;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ExtContentProviderBase", e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ExtContentProviderBase", e17, "", new java.lang.Object[0]);
            return false;
        }
    }

    public java.lang.String c(android.net.Uri uri) {
        if (uri == null) {
            return "";
        }
        java.lang.String queryParameter = uri.getQueryParameter("appid");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return queryParameter == null ? "" : queryParameter;
    }

    public java.lang.String d() {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f99874f)) {
            return this.f99874f;
        }
        java.lang.String[] strArr = this.f99876h;
        return (strArr == null || strArr.length <= 0) ? "" : strArr[0];
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }

    public void e(android.net.Uri uri, android.content.Context context, int i17, java.lang.String[] strArr) {
        this.f99875g = c(uri);
        if (strArr == null) {
            g(context);
        } else {
            this.f99876h = strArr;
        }
        this.f99877i = i17;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f99873e = android.os.SystemClock.elapsedRealtime();
    }

    public void f(android.net.Uri uri, android.content.Context context, android.content.UriMatcher uriMatcher) {
        this.f99875g = c(uri);
        g(context);
        if (uriMatcher != null) {
            int match = uriMatcher.match(uri);
            this.f99877i = match;
            if (match < 0) {
                this.f99877i = 0;
            }
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f99873e = android.os.SystemClock.elapsedRealtime();
    }

    public final void g(android.content.Context context) {
        if (context == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ExtContentProviderBase", "in initCallerPkgName(), context == null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ExtContentProviderBase", "Binder.getCallingUid() = " + android.os.Binder.getCallingUid());
        java.lang.String[] packagesForUid = context.getPackageManager().getPackagesForUid(android.os.Binder.getCallingUid());
        this.f99876h = packagesForUid;
        if (packagesForUid == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ExtContentProviderBase", "m_pkgs == null");
        }
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00dc A[Catch: Exception -> 0x0101, TRY_LEAVE, TryCatch #1 {Exception -> 0x0101, blocks: (B:33:0x0070, B:35:0x0080, B:36:0x0091, B:39:0x009e, B:25:0x00a3, B:27:0x00dc), top: B:32:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int h() {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.ext.provider.ExtContentProviderBase.h():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0068, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.ExtContentProviderBase", "check app success, calling package name = %s", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0071, code lost:
    
        r9.f99874f = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0073, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0075, code lost:
    
        r10 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00dd A[Catch: Exception -> 0x0102, TRY_LEAVE, TryCatch #2 {Exception -> 0x0102, blocks: (B:23:0x00a4, B:25:0x00dd, B:46:0x007e, B:48:0x008e, B:49:0x0094, B:52:0x009f), top: B:45:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean i(android.content.Context r10) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.ext.provider.ExtContentProviderBase.i(android.content.Context):boolean");
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        return null;
    }

    public void j(int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ExtContentProviderBase", "callingPkg = %s, appID = %s, apiID = %s, result = %s, timeCost = %s", d(), this.f99875g, java.lang.Integer.valueOf(this.f99877i), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(m()));
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(10505, d(), this.f99875g, java.lang.Integer.valueOf(this.f99877i), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(m()), java.lang.Integer.valueOf(i19));
        g0Var.idkeyStat(300L, i17, 1L, false);
    }

    public void k(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ExtContentProviderBase", "callingPkg = %s, appID = %s, apiID = %s, result = %s, timeCost = %s", d(), this.f99875g, java.lang.Integer.valueOf(this.f99877i), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(m()));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10505, d(), this.f99875g, java.lang.Integer.valueOf(this.f99877i), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(m()));
    }

    public void l(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ExtContentProviderBase", "callingPkg = %s, appID = %s, apiID = %s, result = %s, timeCost = %s", d(), this.f99875g, java.lang.Integer.valueOf(this.f99877i), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(m()));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10505, d(), this.f99875g, java.lang.Integer.valueOf(this.f99877i), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(m()), java.lang.Integer.valueOf(i18));
    }

    public int m() {
        long j17 = this.f99873e;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return (int) (android.os.SystemClock.elapsedRealtime() - j17);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return !(this instanceof com.tencent.mm.plugin.ext.provider.ExtControlProviderSNS);
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }
}
