package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class la implements com.tencent.mm.plugin.appbrand.appcache.a4, com.tencent.mm.plugin.appbrand.appcache.ob {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f75654f = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appcache.y3 f75655a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f75656b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f75657c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f75658d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f75659e;

    public la(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f75659e = false;
        java.lang.String str = appBrandRuntime.f74803n;
        this.f75656b = str;
        this.f75657c = appBrandRuntime;
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaPkgRuntimeReader", "<init> appId[%s] sysConfig.class[%s], stacktrace=%s", str, appBrandRuntime.E0().getClass().getName(), android.util.Log.getStackTraceString(new java.lang.Throwable()));
        this.f75658d = new java.util.LinkedList();
        g("__plugin__/");
        g(com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo.PREFIX_EXTENDED);
        com.tencent.mm.plugin.appbrand.appcache.ac acVar = new com.tencent.mm.plugin.appbrand.appcache.ac(new com.tencent.mm.plugin.appbrand.appcache.bc(appBrandRuntime), this);
        this.f75655a = acVar;
        acVar.j();
        this.f75659e = true;
    }

    public static boolean m(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        com.tencent.mm.plugin.appbrand.appcache.a4 a4Var;
        java.util.Map map = f75654f;
        synchronized (map) {
            a4Var = (com.tencent.mm.plugin.appbrand.appcache.a4) ((java.util.HashMap) map).remove(appBrandRuntime);
        }
        if (a4Var == null) {
            return false;
        }
        a4Var.close();
        return true;
    }

    public static boolean n(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || android.webkit.URLUtil.isAboutUrl(str)) {
            return true;
        }
        return (!com.tencent.mm.sdk.platformtools.t8.K0(str) && (android.webkit.URLUtil.isHttpsUrl(str) || android.webkit.URLUtil.isHttpUrl(str))) || android.webkit.URLUtil.isFileUrl(str);
    }

    public static com.tencent.mm.plugin.appbrand.appcache.a4 o(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, boolean z17) {
        com.tencent.mm.plugin.appbrand.appcache.a4 a4Var;
        if (appBrandRuntime == null || appBrandRuntime.L0()) {
            return com.tencent.mm.plugin.appbrand.appcache.z3.f76088a;
        }
        if (appBrandRuntime.E0() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaPkgRuntimeReader", "obtainReader with runtime(%s) sysConfig(NULL), stack=%s", appBrandRuntime.f74803n, android.util.Log.getStackTraceString(new java.lang.Throwable()));
            return com.tencent.mm.plugin.appbrand.appcache.z3.f76088a;
        }
        java.util.Map map = f75654f;
        synchronized (map) {
            a4Var = (com.tencent.mm.plugin.appbrand.appcache.a4) ((java.util.HashMap) map).get(appBrandRuntime);
            if (a4Var == null || z17) {
                if (z17) {
                    m(appBrandRuntime);
                }
                a4Var = new com.tencent.mm.plugin.appbrand.appcache.la(appBrandRuntime);
                ((java.util.HashMap) map).put(appBrandRuntime, a4Var);
            }
        }
        return a4Var;
    }

    public static java.lang.String p(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, java.lang.String str) {
        java.lang.String str2 = (java.lang.String) o(appBrandRuntime, false).h(str, java.lang.String.class);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return str2 == null ? "" : str2;
    }

    public static java.io.InputStream q(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, java.lang.String str) {
        return (java.io.InputStream) o(appBrandRuntime, false).h(str, java.io.InputStream.class);
    }

    public static android.webkit.WebResourceResponse r(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, java.lang.String str) {
        return (android.webkit.WebResourceResponse) o(appBrandRuntime, false).h(str, android.webkit.WebResourceResponse.class);
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.y3
    public java.util.List a() {
        return ((com.tencent.mm.plugin.appbrand.appcache.ac) this.f75655a).a();
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.ob
    public void b(java.lang.String str, com.tencent.mm.plugin.appbrand.appcache.y8 y8Var) {
        this.f75657c.F1(!this.f75659e, str, y8Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.y3
    public final boolean c(java.lang.String str, boolean z17) {
        try {
            return ((com.tencent.mm.plugin.appbrand.appcache.ac) this.f75655a).c(k(str), z17);
        } catch (java.lang.IllegalArgumentException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaPkgRuntimeReader", "canAccessFile, appId:%s, url:%s, checkCorrectReqURL get exception:%s", this.f75656b, str, e17);
            return false;
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.y3
    public void close() {
        ((com.tencent.mm.plugin.appbrand.appcache.ac) this.f75655a).close();
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.y3
    public boolean d(java.lang.String str) {
        return c(str, false);
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.y3
    public java.util.List e() {
        return ((com.tencent.mm.plugin.appbrand.appcache.ac) this.f75655a).e();
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.y3
    public java.util.List f() {
        return ((com.tencent.mm.plugin.appbrand.appcache.ac) this.f75655a).f();
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.a4
    public void g(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.f75658d.add(str);
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.a4
    public java.lang.Object h(java.lang.String str, java.lang.Class cls) {
        java.lang.Object obj = null;
        try {
            java.lang.String k17 = k(str);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.io.InputStream i17 = i(k17);
            java.lang.String str2 = this.f75656b;
            int i18 = -1;
            if (i17 != null) {
                try {
                    i18 = i17.available();
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WxaPkgRuntimeReader", "openRead, appId = %s, reqURL = %s, access stream.available e = %s", str2, k17, e17);
                }
                obj = ((com.tencent.mm.plugin.appbrand.appcache.ha) ((java.util.HashMap) com.tencent.mm.plugin.appbrand.appcache.ga.f75556a).get(cls)).a(k17, i17);
            }
            java.lang.Object[] objArr = new java.lang.Object[6];
            objArr[0] = str2;
            objArr[1] = k17;
            objArr[2] = java.lang.Boolean.valueOf(obj == null);
            objArr[3] = cls.getName();
            objArr[4] = java.lang.Integer.valueOf(i18);
            objArr[5] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis);
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaPkgRuntimeReader", "openRead, appId = %s, reqURL = %s, null(%B), type = %s, length = %d, cost = %dms", objArr);
        } catch (java.lang.IllegalArgumentException unused) {
        }
        return obj;
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.y3
    public final java.io.InputStream i(java.lang.String str) {
        try {
            return ((com.tencent.mm.plugin.appbrand.appcache.ac) this.f75655a).i(k(str));
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.y3
    public void j() {
        this.f75655a.j();
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.a4
    public java.lang.String k(java.lang.String str) {
        java.util.Iterator it = this.f75658d.iterator();
        while (it.hasNext()) {
            if (str.startsWith((java.lang.String) it.next())) {
                return str;
            }
        }
        if (n(str)) {
            throw new java.lang.IllegalArgumentException("Invalid URL");
        }
        java.lang.String b17 = com.tencent.mm.plugin.appbrand.appstorage.l1.b(str, true);
        return b17.startsWith("/__APP__") ? com.tencent.mm.plugin.appbrand.appstorage.l1.b(b17.substring(8), true) : b17;
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.y3
    public com.tencent.mm.plugin.appbrand.appcache.y8 l(java.lang.String str) {
        try {
            return ((com.tencent.mm.plugin.appbrand.appcache.ac) this.f75655a).l(k(str));
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.y3
    public com.tencent.mm.plugin.appbrand.appcache.x3 openReadPartialInfo(java.lang.String str) {
        try {
            return ((com.tencent.mm.plugin.appbrand.appcache.ac) this.f75655a).openReadPartialInfo(k(str));
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }
}
