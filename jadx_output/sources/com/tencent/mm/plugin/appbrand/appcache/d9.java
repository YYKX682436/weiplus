package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class d9 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appcache.z8 f75491a = new com.tencent.mm.plugin.appbrand.appcache.z8();

    public static com.tencent.mm.vfs.r6[] b() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        f(c(), arrayList);
        return (com.tencent.mm.vfs.r6[]) arrayList.toArray(new com.tencent.mm.vfs.r6[0]);
    }

    public static java.lang.String c() {
        java.lang.String g17 = lp0.b.g();
        com.tencent.mm.vfs.w6.u(g17);
        return g17;
    }

    public static java.lang.String d() {
        java.lang.String h17 = gm0.j1.u().h();
        if (!h17.endsWith("/")) {
            h17 = h17.concat("/");
        }
        java.lang.String str = h17 + "appbrand/pkg/";
        com.tencent.mm.vfs.w6.u(str);
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x009f, code lost:
    
        if (r0 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a1, code lost:
    
        r3 = 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String e(java.lang.String r6) {
        /*
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r6)
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto Lb
            goto La2
        Lb:
            java.lang.String r0 = "@LibraryAppId"
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L16
            r3 = r2
            goto La2
        L16:
            java.lang.Class<com.tencent.mm.plugin.appbrand.service.o6> r0 = com.tencent.mm.plugin.appbrand.service.o6.class
            i95.m r0 = i95.n0.c(r0)
            java.lang.String r4 = "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceImpl"
            kotlin.jvm.internal.o.e(r0, r4)
            com.tencent.mm.plugin.appbrand.appcache.predownload.export.f1 r0 = (com.tencent.mm.plugin.appbrand.appcache.predownload.export.f1) r0
            java.util.List r0 = r0.wi()
            java.util.Iterator r0 = r0.iterator()
        L2b:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L43
            java.lang.Object r4 = r0.next()
            com.tencent.mm.plugin.appbrand.appcache.predownload.export.c1 r4 = (com.tencent.mm.plugin.appbrand.appcache.predownload.export.c1) r4
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.f192989a
            java.lang.String r4 = r4.f75780d
            boolean r4 = r6.contains(r4)
            if (r4 == 0) goto L2b
            r0 = r2
            goto L9f
        L43:
            java.lang.Class<com.tencent.mm.plugin.appbrand.appusage.d2> r0 = com.tencent.mm.plugin.appbrand.appusage.d2.class
            java.lang.Object r0 = com.tencent.mm.plugin.appbrand.app.r9.fj(r0)
            com.tencent.mm.plugin.appbrand.appusage.d2 r0 = (com.tencent.mm.plugin.appbrand.appusage.d2) r0
            boolean r4 = android.text.TextUtils.isEmpty(r6)
            if (r4 == 0) goto L52
            goto L5e
        L52:
            r4 = 36
            int r4 = r6.indexOf(r4)
            if (r4 < 0) goto L5e
            java.lang.String r6 = r6.substring(r3, r4)
        L5e:
            r0.getClass()
            if (r6 != 0) goto L64
            goto L9e
        L64:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "select count(*) from AppBrandMessInfoRecord where appId = '"
            r4.<init>(r5)
            r4.append(r6)
            java.lang.String r6 = "' and (wechatPluginApp > 0 or appServiceType = 7)"
            r4.append(r6)
            java.lang.String r6 = r4.toString()
            java.lang.String[] r4 = new java.lang.String[r3]
            android.database.Cursor r6 = r0.rawQuery(r6, r4)
            if (r6 == 0) goto L9e
            boolean r0 = r6.moveToFirst()     // Catch: java.lang.Throwable -> L97
            r4 = 0
            if (r0 == 0) goto L93
            int r0 = r6.getInt(r3)     // Catch: java.lang.Throwable -> L97
            if (r0 <= 0) goto L8e
            r0 = r2
            goto L8f
        L8e:
            r0 = r3
        L8f:
            vz5.b.a(r6, r4)
            goto L9f
        L93:
            vz5.b.a(r6, r4)
            goto L9e
        L97:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L99
        L99:
            r1 = move-exception
            vz5.b.a(r6, r0)
            throw r1
        L9e:
            r0 = r3
        L9f:
            if (r0 == 0) goto La2
            r3 = r1
        La2:
            if (r3 == r2) goto Ld8
            if (r3 == r1) goto Lbf
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = c()
            r6.append(r0)
            java.lang.String r0 = "general/"
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            com.tencent.mm.vfs.w6.u(r6)
            goto Lf0
        Lbf:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = c()
            r6.append(r0)
            java.lang.String r0 = "firstParty/"
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            com.tencent.mm.vfs.w6.u(r6)
            goto Lf0
        Ld8:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = c()
            r6.append(r0)
            java.lang.String r0 = "commLib/"
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            com.tencent.mm.vfs.w6.u(r6)
        Lf0:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.appcache.d9.e(java.lang.String):java.lang.String");
    }

    public static void f(java.lang.String str, java.util.List list) {
        com.tencent.mm.vfs.r6[] G;
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        if (r6Var.m() && r6Var.y() && (G = r6Var.G()) != null) {
            for (com.tencent.mm.vfs.r6 r6Var2 : G) {
                if (r6Var2.A()) {
                    list.add(r6Var2);
                } else if (r6Var2.y()) {
                    f(r6Var2.o(), list);
                }
            }
        }
    }

    public int a(m81.b bVar) {
        java.lang.String str = bVar.f189712a;
        com.tencent.mm.plugin.appbrand.appcache.z8 z8Var = this.f75491a;
        boolean d17 = z8Var.d(str);
        java.lang.String str2 = bVar.f189712a;
        if (d17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaPkgDownloadPerformer", "addRequestIfNotRunning, urlKey %s already in queue", str2);
            return 0;
        }
        int g17 = z8Var.g(bVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaPkgDownloadPerformer", "addRequestIfNotRunning, urlKey %s, addResult %d", str2, java.lang.Integer.valueOf(g17));
        return g17;
    }
}
