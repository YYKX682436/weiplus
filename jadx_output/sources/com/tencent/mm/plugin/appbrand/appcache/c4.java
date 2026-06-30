package com.tencent.mm.plugin.appbrand.appcache;

@j95.b
/* loaded from: classes7.dex */
public final class c4 extends i95.w implements com.tencent.mm.plugin.appbrand.appcache.cc {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appcache.c4 f75472d = new com.tencent.mm.plugin.appbrand.appcache.c4();

    public final jz5.l Ai(java.lang.String str) {
        java.util.List e07 = r26.n0.e0(r26.n0.Z(str, ".idx"), new char[]{'_'}, false, 0, 6, null);
        try {
            return new jz5.l((java.lang.String) e07.get(0), java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) e07.get(1))));
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public boolean Bi(java.lang.String appId, int i17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        if (gm0.j1.b().m()) {
            return com.tencent.mm.vfs.w6.j(wi(appId, i17));
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WxaVersionPagePathIndexStorage.IndexStorageMM", "checkIsPageIndexExisted(appId:" + appId + ", appVersion:" + i17 + "), account().hasInitialized()==FALSE");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c4 A[Catch: Exception -> 0x0153, TryCatch #1 {Exception -> 0x0153, blocks: (B:23:0x007f, B:25:0x00a0, B:28:0x00bc, B:30:0x00c4, B:31:0x00d4, B:45:0x00cc, B:50:0x00a9, B:52:0x00ad), top: B:22:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc A[Catch: Exception -> 0x0153, TryCatch #1 {Exception -> 0x0153, blocks: (B:23:0x007f, B:25:0x00a0, B:28:0x00bc, B:30:0x00c4, B:31:0x00d4, B:45:0x00cc, B:50:0x00a9, B:52:0x00ad), top: B:22:0x007f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Di(java.lang.String r19, int r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.appcache.c4.Di(java.lang.String, int, java.lang.String):boolean");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(7:20|21|22|6|(3:15|16|17)|10|(1:12)(1:14))|5|6|(1:8)|15|16|17|10|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Ni() {
        /*
            r5 = this;
            com.tencent.mm.vfs.r6 r0 = new com.tencent.mm.vfs.r6
            java.lang.String r1 = r5.Vi()
            r0.<init>(r1)
            com.tencent.mm.vfs.r6 r1 = new com.tencent.mm.vfs.r6
            java.lang.String r2 = r5.Ui()
            r1.<init>(r2)
            boolean r2 = r0.m()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L20
            boolean r2 = r0.y()
            if (r2 != 0) goto L25
        L20:
            r0.l()     // Catch: java.lang.Exception -> L25
            r0 = r3
            goto L26
        L25:
            r0 = r4
        L26:
            boolean r2 = r1.m()
            if (r2 == 0) goto L32
            boolean r2 = r1.y()
            if (r2 != 0) goto L37
        L32:
            r1.l()     // Catch: java.lang.Exception -> L37
            r0 = r0 | 2
        L37:
            r1 = 3
            if (r0 != r1) goto L3b
            return r4
        L3b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.appcache.c4.Ni():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Ri() {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.appcache.c4.Ri():void");
    }

    public final java.lang.String Ui() {
        java.lang.String e17 = lp0.b.e();
        kotlin.jvm.internal.o.d(e17);
        if (!r26.i0.n(e17, "/", false)) {
            e17 = e17.concat("/");
        }
        java.lang.String str = e17 + "appbrand/pagesidx/";
        com.tencent.mm.vfs.w6.u(str);
        return str;
    }

    public final java.lang.String Vi() {
        java.lang.String h17 = gm0.j1.u().h();
        kotlin.jvm.internal.o.d(h17);
        if (!r26.i0.n(h17, "/", false)) {
            h17 = h17.concat("/");
        }
        java.lang.String str = h17 + "appbrand/pagesidx/";
        com.tencent.mm.vfs.w6.u(str);
        return str;
    }

    public void Zi(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        if (!gm0.j1.b().m()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaVersionPagePathIndexStorage.IndexStorageMM", "removeIndexByAppId(" + appId + "), account().hasInitialized()==FALSE");
            return;
        }
        if (Ni()) {
            java.util.ArrayList<com.tencent.mm.vfs.r6> arrayList = new java.util.ArrayList();
            com.tencent.mm.plugin.appbrand.appcache.c4 c4Var = f75472d;
            com.tencent.mm.vfs.r6[] G = new com.tencent.mm.vfs.r6(c4Var.Vi()).G();
            if (G == null) {
                G = new com.tencent.mm.vfs.r6[0];
            }
            kz5.h0.w(arrayList, G);
            com.tencent.mm.vfs.r6[] G2 = new com.tencent.mm.vfs.r6(c4Var.Ui()).G();
            if (G2 == null) {
                G2 = new com.tencent.mm.vfs.r6[0];
            }
            kz5.h0.w(arrayList, G2);
            for (com.tencent.mm.vfs.r6 r6Var : arrayList) {
                java.lang.String name = r6Var != null ? r6Var.getName() : null;
                if (!(name == null || name.length() == 0)) {
                    kotlin.jvm.internal.o.d(r6Var);
                    java.lang.String name2 = r6Var.getName();
                    kotlin.jvm.internal.o.f(name2, "getName(...)");
                    jz5.l Ai = c4Var.Ai(name2);
                    if (kotlin.jvm.internal.o.b(appId, Ai != null ? (java.lang.String) Ai.f302833d : null)) {
                        r6Var.l();
                    }
                }
            }
        }
    }

    public void aj(java.lang.String appId, int i17, java.lang.String pagesJson) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String obj;
        boolean a17;
        long elapsedRealtime;
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(pagesJson, "pagesJson");
        if (!gm0.j1.b().m()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaVersionPagePathIndexStorage.IndexStorageMM", "updatePageIndex(appId:" + appId + ", appVersion:" + i17 + "), account().hasInitialized()==FALSE");
            return;
        }
        try {
            str2 = "updatePageIndex(appId:" + appId + ", appVersion:" + i17 + ", pagesJson.length=" + pagesJson.length() + ')';
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
            java.lang.String wi6 = f75472d.wi(appId, i17);
            byte[] bytes = pagesJson.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            java.lang.Object valueOf = java.lang.Integer.valueOf(com.tencent.mm.vfs.w6.S(wi6, bytes, 0, bytes.length));
            if (valueOf instanceof cf.h) {
                obj = ((cf.h) valueOf).I();
            } else {
                obj = valueOf.toString();
                if (obj == null) {
                    obj = "";
                }
            }
            a17 = com.tencent.mm.plugin.appbrand.utils.d5.a();
            elapsedRealtime = android.os.SystemClock.elapsedRealtime() - elapsedRealtime2;
            str = "MicroMsg.WxaVersionPagePathIndexStorage.IndexStorageMM";
        } catch (java.io.IOException e17) {
            e = e17;
            str = "MicroMsg.WxaVersionPagePathIndexStorage.IndexStorageMM";
        }
        try {
            if (elapsedRealtime <= 32 || !a17) {
                com.tencent.mars.xlog.Log.i("Luggage.Utils.Profile", "runProfiled:log:" + str2 + " cost " + elapsedRealtime + " ms result:" + obj + " isMainThread: " + a17 + ' ');
            } else {
                com.tencent.mars.xlog.Log.w("Luggage.Utils.Profile", "block main thread and skip " + ((int) (elapsedRealtime / 16)) + " frames! runProfiled:log:" + str2 + " cost " + elapsedRealtime + " ms result:" + obj + " isMainThread: " + a17 + ' ');
            }
        } catch (java.io.IOException e18) {
            e = e18;
            com.tencent.mars.xlog.Log.e(str, "updatePageIndex(appId:" + appId + ", appVersion:" + i17 + "), writeFile failed by " + e);
        }
    }

    public final java.lang.String wi(java.lang.String str, int i17) {
        java.lang.String o17 = new com.tencent.mm.vfs.r6(Vi(), str + '_' + i17 + ".idx").o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        java.lang.String o18 = new com.tencent.mm.vfs.r6(Ui(), str + '_' + i17 + ".idx").o();
        kotlin.jvm.internal.o.f(o18, "getAbsolutePath(...)");
        return (!com.tencent.mm.vfs.w6.j(o17) || com.tencent.mm.vfs.w6.v(o17, o18)) ? o18 : o17;
    }
}
