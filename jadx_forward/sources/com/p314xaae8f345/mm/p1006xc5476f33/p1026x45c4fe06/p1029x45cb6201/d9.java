package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public final class d9 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.z8 f157024a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.z8();

    public static com.p314xaae8f345.mm.vfs.r6[] b() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        f(c(), arrayList);
        return (com.p314xaae8f345.mm.vfs.r6[]) arrayList.toArray(new com.p314xaae8f345.mm.vfs.r6[0]);
    }

    public static java.lang.String c() {
        java.lang.String g17 = lp0.b.g();
        com.p314xaae8f345.mm.vfs.w6.u(g17);
        return g17;
    }

    public static java.lang.String d() {
        java.lang.String h17 = gm0.j1.u().h();
        if (!h17.endsWith("/")) {
            h17 = h17.concat("/");
        }
        java.lang.String str = h17 + "appbrand/pkg/";
        com.p314xaae8f345.mm.vfs.w6.u(str);
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
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r6)
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
            java.lang.Class<com.tencent.mm.plugin.appbrand.service.o6> r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o6.class
            i95.m r0 = i95.n0.c(r0)
            java.lang.String r4 = "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceImpl"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r0, r4)
            com.tencent.mm.plugin.appbrand.appcache.predownload.export.f1 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.f1) r0
            java.util.List r0 = r0.wi()
            java.util.Iterator r0 = r0.iterator()
        L2b:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L43
            java.lang.Object r4 = r0.next()
            com.tencent.mm.plugin.appbrand.appcache.predownload.export.c1 r4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.c1) r4
            boolean r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            java.lang.String r4 = r4.f157313d
            boolean r4 = r6.contains(r4)
            if (r4 == 0) goto L2b
            r0 = r2
            goto L9f
        L43:
            java.lang.Class<com.tencent.mm.plugin.appbrand.appusage.d2> r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.d2.class
            java.lang.Object r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(r0)
            com.tencent.mm.plugin.appbrand.appusage.d2 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.d2) r0
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
            android.database.Cursor r6 = r0.m145256x1d3f4980(r6, r4)
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
            com.p314xaae8f345.mm.vfs.w6.u(r6)
            goto Lf0
        Lbf:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = c()
            r6.append(r0)
            java.lang.String r0 = "firstParty/"
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            com.p314xaae8f345.mm.vfs.w6.u(r6)
            goto Lf0
        Ld8:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = c()
            r6.append(r0)
            java.lang.String r0 = "commLib/"
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            com.p314xaae8f345.mm.vfs.w6.u(r6)
        Lf0:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.d9.e(java.lang.String):java.lang.String");
    }

    public static void f(java.lang.String str, java.util.List list) {
        com.p314xaae8f345.mm.vfs.r6[] G;
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        if (r6Var.m() && r6Var.y() && (G = r6Var.G()) != null) {
            for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : G) {
                if (r6Var2.A()) {
                    list.add(r6Var2);
                } else if (r6Var2.y()) {
                    f(r6Var2.o(), list);
                }
            }
        }
    }

    public int a(m81.b bVar) {
        java.lang.String str = bVar.f271245a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.z8 z8Var = this.f157024a;
        boolean d17 = z8Var.d(str);
        java.lang.String str2 = bVar.f271245a;
        if (d17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaPkgDownloadPerformer", "addRequestIfNotRunning, urlKey %s already in queue", str2);
            return 0;
        }
        int g17 = z8Var.g(bVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaPkgDownloadPerformer", "addRequestIfNotRunning, urlKey %s, addResult %d", str2, java.lang.Integer.valueOf(g17));
        return g17;
    }
}
