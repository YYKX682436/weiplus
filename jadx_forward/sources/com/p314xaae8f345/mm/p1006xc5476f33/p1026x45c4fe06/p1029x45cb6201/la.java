package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public final class la implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ob {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f157187f = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y3 f157188a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f157189b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f157190c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f157191d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f157192e;

    public la(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        this.f157192e = false;
        java.lang.String str = c11510xdd90c2f2.f156336n;
        this.f157189b = str;
        this.f157190c = c11510xdd90c2f2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaPkgRuntimeReader", "<init> appId[%s] sysConfig.class[%s], stacktrace=%s", str, c11510xdd90c2f2.E0().getClass().getName(), android.util.Log.getStackTraceString(new java.lang.Throwable()));
        this.f157191d = new java.util.LinkedList();
        g("__plugin__/");
        g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11669x3195c847.f33468x7782c46);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac acVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.bc(c11510xdd90c2f2), this);
        this.f157188a = acVar;
        acVar.j();
        this.f157192e = true;
    }

    public static boolean m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a4 a4Var;
        java.util.Map map = f157187f;
        synchronized (map) {
            a4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a4) ((java.util.HashMap) map).remove(c11510xdd90c2f2);
        }
        if (a4Var == null) {
            return false;
        }
        a4Var.mo49253x5a5ddf8();
        return true;
    }

    public static boolean n(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || android.webkit.URLUtil.isAboutUrl(str)) {
            return true;
        }
        return (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (android.webkit.URLUtil.isHttpsUrl(str) || android.webkit.URLUtil.isHttpUrl(str))) || android.webkit.URLUtil.isFileUrl(str);
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a4 o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a4 a4Var;
        if (c11510xdd90c2f2 == null || c11510xdd90c2f2.L0()) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.z3.f157621a;
        }
        if (c11510xdd90c2f2.E0() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaPkgRuntimeReader", "obtainReader with runtime(%s) sysConfig(NULL), stack=%s", c11510xdd90c2f2.f156336n, android.util.Log.getStackTraceString(new java.lang.Throwable()));
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.z3.f157621a;
        }
        java.util.Map map = f157187f;
        synchronized (map) {
            a4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a4) ((java.util.HashMap) map).get(c11510xdd90c2f2);
            if (a4Var == null || z17) {
                if (z17) {
                    m(c11510xdd90c2f2);
                }
                a4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.la(c11510xdd90c2f2);
                ((java.util.HashMap) map).put(c11510xdd90c2f2, a4Var);
            }
        }
        return a4Var;
    }

    public static java.lang.String p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, java.lang.String str) {
        java.lang.String str2 = (java.lang.String) o(c11510xdd90c2f2, false).h(str, java.lang.String.class);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return str2 == null ? "" : str2;
    }

    public static java.io.InputStream q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, java.lang.String str) {
        return (java.io.InputStream) o(c11510xdd90c2f2, false).h(str, java.io.InputStream.class);
    }

    public static android.webkit.WebResourceResponse r(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, java.lang.String str) {
        return (android.webkit.WebResourceResponse) o(c11510xdd90c2f2, false).h(str, android.webkit.WebResourceResponse.class);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y3
    public java.util.List a() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac) this.f157188a).a();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ob
    public void b(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8 y8Var) {
        this.f157190c.F1(!this.f157192e, str, y8Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y3
    public final boolean c(java.lang.String str, boolean z17) {
        try {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac) this.f157188a).c(k(str), z17);
        } catch (java.lang.IllegalArgumentException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaPkgRuntimeReader", "canAccessFile, appId:%s, url:%s, checkCorrectReqURL get exception:%s", this.f157189b, str, e17);
            return false;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y3
    /* renamed from: close */
    public void mo49253x5a5ddf8() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac) this.f157188a).mo49253x5a5ddf8();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y3
    public boolean d(java.lang.String str) {
        return c(str, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y3
    public java.util.List e() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac) this.f157188a).e();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y3
    public java.util.List f() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac) this.f157188a).f();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a4
    public void g(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.f157191d.add(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a4
    public java.lang.Object h(java.lang.String str, java.lang.Class cls) {
        java.lang.Object obj = null;
        try {
            java.lang.String k17 = k(str);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.io.InputStream i17 = i(k17);
            java.lang.String str2 = this.f157189b;
            int i18 = -1;
            if (i17 != null) {
                try {
                    i18 = i17.available();
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaPkgRuntimeReader", "openRead, appId = %s, reqURL = %s, access stream.available e = %s", str2, k17, e17);
                }
                obj = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ha) ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ga.f157089a).get(cls)).a(k17, i17);
            }
            java.lang.Object[] objArr = new java.lang.Object[6];
            objArr[0] = str2;
            objArr[1] = k17;
            objArr[2] = java.lang.Boolean.valueOf(obj == null);
            objArr[3] = cls.getName();
            objArr[4] = java.lang.Integer.valueOf(i18);
            objArr[5] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaPkgRuntimeReader", "openRead, appId = %s, reqURL = %s, null(%B), type = %s, length = %d, cost = %dms", objArr);
        } catch (java.lang.IllegalArgumentException unused) {
        }
        return obj;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y3
    public final java.io.InputStream i(java.lang.String str) {
        try {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac) this.f157188a).i(k(str));
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y3
    public void j() {
        this.f157188a.j();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a4
    public java.lang.String k(java.lang.String str) {
        java.util.Iterator it = this.f157191d.iterator();
        while (it.hasNext()) {
            if (str.startsWith((java.lang.String) it.next())) {
                return str;
            }
        }
        if (n(str)) {
            throw new java.lang.IllegalArgumentException("Invalid URL");
        }
        java.lang.String b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.b(str, true);
        return b17.startsWith("/__APP__") ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.b(b17.substring(8), true) : b17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y3
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8 l(java.lang.String str) {
        try {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac) this.f157188a).l(k(str));
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y3
    /* renamed from: openReadPartialInfo */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x3 mo49254xc00e82af(java.lang.String str) {
        try {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac) this.f157188a).mo49254xc00e82af(k(str));
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }
}
