package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class g5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.launching.g5 f84619a = new com.tencent.mm.plugin.appbrand.launching.g5();

    /* renamed from: b, reason: collision with root package name */
    public static final bm5.z0 f84620b = new bm5.z0(com.tencent.mm.plugin.appbrand.launching.b5.f84517a);

    /* renamed from: c, reason: collision with root package name */
    public static final android.util.SparseArray f84621c = new android.util.SparseArray();

    public final void a(l81.b1 b1Var) {
        if (b1Var == null) {
            throw new java.lang.IllegalArgumentException(new java.lang.NullPointerException());
        }
        if (b1Var.Y != null) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).getString("CustomLoadingAppid", "");
            if (!r26.i0.q(string, "", false, 2, null)) {
                b1Var.f317014b = string;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ExportWxaInstrumentation", "set appid:" + b1Var.f317014b);
            }
        }
        java.lang.String str = b1Var.f317012a;
        boolean z17 = true;
        if (str == null || str.length() == 0) {
            java.lang.String str2 = b1Var.f317014b;
            if (str2 == null || str2.length() == 0) {
                throw new java.lang.IllegalArgumentException("Both username & appId is EMPTY");
            }
        }
        java.lang.String str3 = b1Var.f317012a;
        if (str3 != null && str3.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            java.lang.String username = b1Var.f317012a;
            kotlin.jvm.internal.o.f(username, "username");
            if (!r26.i0.n(username, "@app", false)) {
                throw new java.lang.IllegalArgumentException("Invalid weapp username " + b1Var.f317012a);
            }
        }
        if (!com.tencent.mm.plugin.appbrand.appcache.g0.b(b1Var.f317016c) && !com.tencent.mm.plugin.appbrand.appcache.g0.a(b1Var.f317016c)) {
            throw new java.lang.IllegalArgumentException("Invalid weapp versionType " + b1Var.f317016c);
        }
        if (b1Var.f317032k > 1000) {
            return;
        }
        throw new java.lang.IllegalArgumentException("Invalid weapp enter scene " + b1Var.f317032k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (((com.tencent.mm.plugin.appbrand.app.t2) r0).Bi() == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            r3 = this;
            java.lang.Class<com.tencent.mm.plugin.appbrand.service.k6> r0 = com.tencent.mm.plugin.appbrand.service.k6.class
            i95.m r0 = i95.n0.c(r0)
            com.tencent.mm.plugin.appbrand.service.k6 r0 = (com.tencent.mm.plugin.appbrand.service.k6) r0
            r1 = 0
            if (r0 == 0) goto L15
            com.tencent.mm.plugin.appbrand.app.t2 r0 = (com.tencent.mm.plugin.appbrand.app.t2) r0
            boolean r0 = r0.Bi()
            r2 = 1
            if (r0 != r2) goto L15
            goto L16
        L15:
            r2 = r1
        L16:
            if (r2 == 0) goto L35
            android.content.SharedPreferences r0 = com.tencent.mm.plugin.appbrand.app.PluginAppBrand.getProcessSharedPrefs()
            java.lang.String r2 = "com.tencent.mm.plugin.appbrand.launching.isForcedCloseDemoCheckForColdLaunchWxaApp"
            boolean r1 = r0.getBoolean(r2, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "isForcedCloseDemoCheckForColdLaunchWxaApp="
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.AppBrand.ExportWxaInstrumentation"
            com.tencent.mars.xlog.Log.i(r2, r0)
        L35:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.launching.g5.b():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (((com.tencent.mm.plugin.appbrand.app.t2) r0).Bi() == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c() {
        /*
            r3 = this;
            java.lang.Class<com.tencent.mm.plugin.appbrand.service.k6> r0 = com.tencent.mm.plugin.appbrand.service.k6.class
            i95.m r0 = i95.n0.c(r0)
            com.tencent.mm.plugin.appbrand.service.k6 r0 = (com.tencent.mm.plugin.appbrand.service.k6) r0
            r1 = 0
            if (r0 == 0) goto L15
            com.tencent.mm.plugin.appbrand.app.t2 r0 = (com.tencent.mm.plugin.appbrand.app.t2) r0
            boolean r0 = r0.Bi()
            r2 = 1
            if (r0 != r2) goto L15
            goto L16
        L15:
            r2 = r1
        L16:
            if (r2 == 0) goto L35
            android.content.SharedPreferences r0 = com.tencent.mm.plugin.appbrand.app.PluginAppBrand.getProcessSharedPrefs()
            java.lang.String r2 = "com.tencent.mm.plugin.appbrand.launching.isForcedCloseDemoCheckForWarmLaunchWxaApp"
            boolean r1 = r0.getBoolean(r2, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "isForcedCloseDemoCheckForWarmLaunchWxaApp="
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.AppBrand.ExportWxaInstrumentation"
            com.tencent.mars.xlog.Log.i(r2, r0)
        L35:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.launching.g5.c():boolean");
    }

    public final boolean d(java.lang.String str) {
        boolean z17 = true;
        if (com.tencent.mm.plugin.appbrand.debugger.a.f77593a.b()) {
            return true;
        }
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.debugger.f0 f0Var = com.tencent.mm.plugin.appbrand.debugger.g0.f77747d;
        if (com.tencent.mm.plugin.appbrand.debugger.g0.f77748e == null) {
            f0Var.a();
        }
        return com.tencent.mm.plugin.appbrand.debugger.g0.f77749f.contains(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (((com.tencent.mm.plugin.appbrand.app.t2) r0).Bi() == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e() {
        /*
            r3 = this;
            java.lang.Class<com.tencent.mm.plugin.appbrand.service.k6> r0 = com.tencent.mm.plugin.appbrand.service.k6.class
            i95.m r0 = i95.n0.c(r0)
            com.tencent.mm.plugin.appbrand.service.k6 r0 = (com.tencent.mm.plugin.appbrand.service.k6) r0
            r1 = 0
            if (r0 == 0) goto L15
            com.tencent.mm.plugin.appbrand.app.t2 r0 = (com.tencent.mm.plugin.appbrand.app.t2) r0
            boolean r0 = r0.Bi()
            r2 = 1
            if (r0 != r2) goto L15
            goto L16
        L15:
            r2 = r1
        L16:
            if (r2 == 0) goto L35
            android.content.SharedPreferences r0 = com.tencent.mm.plugin.appbrand.app.PluginAppBrand.getProcessSharedPrefs()
            java.lang.String r2 = "com.tencent.mm.plugin.appbrand.launching.isForcedOpenWxaAppForTypedDemo"
            boolean r1 = r0.getBoolean(r2, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "isForcedOpenWxaAppForTypedDemo="
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.AppBrand.ExportWxaInstrumentation"
            com.tencent.mars.xlog.Log.i(r2, r0)
        L35:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.launching.g5.e():boolean");
    }

    public final l81.b1 f(int i17) {
        android.util.SparseArray sparseArray = f84621c;
        synchronized (sparseArray) {
            int indexOfKey = sparseArray.indexOfKey(i17);
            l81.b1 b1Var = null;
            if (indexOfKey < 0) {
                return null;
            }
            l81.b1 b1Var2 = (l81.b1) sparseArray.valueAt(indexOfKey);
            if (b1Var2 != null) {
                sparseArray.removeAt(indexOfKey);
                b1Var = b1Var2;
            }
            return b1Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x01c8, code lost:
    
        if ((r2 == null || r2.length() == 0) == false) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel g(l81.b1 r18) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.launching.g5.g(l81.b1):com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel");
    }
}
