package com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1;

/* renamed from: com.tencent.mm.plugin.ext.provider.ExtContentProviderBase */
/* loaded from: classes12.dex */
public class C13499x920707ba extends android.content.ContentProvider {

    /* renamed from: m, reason: collision with root package name */
    public static boolean f181403m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.HashMap f181404n = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final android.database.MatrixCursor f181405d = new android.database.MatrixCursor(new java.lang.String[0]);

    /* renamed from: e, reason: collision with root package name */
    public long f181406e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f181407f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f181408g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String[] f181409h;

    /* renamed from: i, reason: collision with root package name */
    public int f181410i;

    public C13499x920707ba() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f181406e = android.os.SystemClock.elapsedRealtime();
        this.f181408g = "";
        this.f181410i = 0;
    }

    public final boolean a(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar, boolean z17) {
        for (java.lang.String str : this.f181409h) {
            if (str.equals(mVar.f67386xa1e9e82c) && com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.i1.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, mVar, str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtContentProviderBase", "check app success, calling package name = %s, in blacklist before? = %b", str, java.lang.Boolean.valueOf(z17));
                this.f181407f = str;
                return true;
            }
        }
        return false;
    }

    public boolean b() {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtContentProviderBase", "checkIsLogin()");
            if (!f181403m) {
                v25.b bVar = new v25.b();
                bVar.b(4000L, new u62.b(this, bVar));
            }
            if (gm0.j1.a() && c01.d9.h() && !gm0.m.r()) {
                f181403m = true;
            } else {
                f181403m = false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtContentProviderBase", "hasLogin = " + f181403m);
            return f181403m;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExtContentProviderBase", e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ExtContentProviderBase", e17, "", new java.lang.Object[0]);
            return false;
        }
    }

    public java.lang.String c(android.net.Uri uri) {
        if (uri == null) {
            return "";
        }
        java.lang.String queryParameter = uri.getQueryParameter("appid");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return queryParameter == null ? "" : queryParameter;
    }

    public java.lang.String d() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f181407f)) {
            return this.f181407f;
        }
        java.lang.String[] strArr = this.f181409h;
        return (strArr == null || strArr.length <= 0) ? "" : strArr[0];
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }

    public void e(android.net.Uri uri, android.content.Context context, int i17, java.lang.String[] strArr) {
        this.f181408g = c(uri);
        if (strArr == null) {
            g(context);
        } else {
            this.f181409h = strArr;
        }
        this.f181410i = i17;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f181406e = android.os.SystemClock.elapsedRealtime();
    }

    public void f(android.net.Uri uri, android.content.Context context, android.content.UriMatcher uriMatcher) {
        this.f181408g = c(uri);
        g(context);
        if (uriMatcher != null) {
            int match = uriMatcher.match(uri);
            this.f181410i = match;
            if (match < 0) {
                this.f181410i = 0;
            }
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f181406e = android.os.SystemClock.elapsedRealtime();
    }

    public final void g(android.content.Context context) {
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExtContentProviderBase", "in initCallerPkgName(), context == null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtContentProviderBase", "Binder.getCallingUid() = " + android.os.Binder.getCallingUid());
        java.lang.String[] packagesForUid = context.getPackageManager().getPackagesForUid(android.os.Binder.getCallingUid());
        this.f181409h = packagesForUid;
        if (packagesForUid == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExtContentProviderBase", "m_pkgs == null");
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13499x920707ba.h():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0068, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtContentProviderBase", "check app success, calling package name = %s", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0071, code lost:
    
        r9.f181407f = r6;
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13499x920707ba.i(android.content.Context):boolean");
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        return null;
    }

    public void j(int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtContentProviderBase", "callingPkg = %s, appID = %s, apiID = %s, result = %s, timeCost = %s", d(), this.f181408g, java.lang.Integer.valueOf(this.f181410i), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(m()));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.d(10505, d(), this.f181408g, java.lang.Integer.valueOf(this.f181410i), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(m()), java.lang.Integer.valueOf(i19));
        g0Var.mo68477x336bdfd8(300L, i17, 1L, false);
    }

    public void k(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtContentProviderBase", "callingPkg = %s, appID = %s, apiID = %s, result = %s, timeCost = %s", d(), this.f181408g, java.lang.Integer.valueOf(this.f181410i), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(m()));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10505, d(), this.f181408g, java.lang.Integer.valueOf(this.f181410i), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(m()));
    }

    public void l(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtContentProviderBase", "callingPkg = %s, appID = %s, apiID = %s, result = %s, timeCost = %s", d(), this.f181408g, java.lang.Integer.valueOf(this.f181410i), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(m()));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10505, d(), this.f181408g, java.lang.Integer.valueOf(this.f181410i), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(m()), java.lang.Integer.valueOf(i18));
    }

    public int m() {
        long j17 = this.f181406e;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return (int) (android.os.SystemClock.elapsedRealtime() - j17);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return !(this instanceof com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13504x5739900b);
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
