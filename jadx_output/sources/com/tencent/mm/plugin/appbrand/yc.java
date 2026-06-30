package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class yc {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f92423a = new java.util.concurrent.atomic.AtomicBoolean();

    public final void a(java.util.HashMap hashMap, java.util.List list) {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.plugin.appbrand.page.sb.f87090c.c());
        if (!r6Var.m() || !r6Var.y()) {
            r6Var.l();
            return;
        }
        com.tencent.mm.vfs.r6[] G = r6Var.G();
        if (G != null) {
            if (!(G.length == 0)) {
                java.util.HashMap hashMap2 = new java.util.HashMap();
                c();
                for (com.tencent.mm.vfs.r6 r6Var2 : G) {
                    java.lang.String name = r6Var2.getName();
                    kotlin.jvm.internal.o.f(name, "getName(...)");
                    java.lang.String quote = java.util.regex.Pattern.quote("-");
                    kotlin.jvm.internal.o.f(quote, "quote(...)");
                    java.lang.String[] strArr = (java.lang.String[]) r26.n0.f0(name, new java.lang.String[]{quote}, false, 0, 6, null).toArray(new java.lang.String[0]);
                    if (strArr == null || strArr.length < 2) {
                        com.tencent.mm.vfs.w6.h(r6Var2.o());
                        com.tencent.mm.vfs.w6.g(r6Var2.o(), true);
                    } else {
                        c();
                        java.lang.String str = strArr[0];
                        if (kotlin.jvm.internal.o.b(com.tencent.xwebsdk.BuildConfig.INSTALL_TYPE, str)) {
                            str = "@LibraryAppId";
                        }
                        if (list.contains(str)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PkgCalculateLogic", "calculateExpiredWebViewCodeCache, exclude appId: " + str);
                        } else {
                            int P = com.tencent.mm.sdk.platformtools.t8.P(u46.l.s(strArr[1], 1), 0);
                            int[] iArr = (int[]) hashMap2.get(str);
                            if (iArr == null) {
                                iArr = com.tencent.mm.plugin.appbrand.appcache.r7.f75948a.e(str) ? com.tencent.mm.plugin.appbrand.appcache.y7.f76065a.o(true) : com.tencent.mm.plugin.appbrand.app.r9.Di().A(str, 0);
                                if (iArr == null) {
                                    iArr = new int[]{0};
                                }
                                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PkgCalculateLogic", "calculateExpiredWebViewCodeCache, select_versionArray(%s), get(%s)", str, u46.a.c(iArr, "-1"));
                                hashMap2.put(str, iArr);
                            }
                            if (!u46.a.a(iArr, P)) {
                                e(hashMap, str, r6Var2.o());
                                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PkgCalculateLogic", "calculateExpiredWebViewCodeCache, file(%s) deleted", r6Var2.o());
                            }
                        }
                    }
                }
                return;
            }
        }
        r6Var.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.util.HashMap r12, java.util.List r13) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.yc.b(java.util.HashMap, java.util.List):void");
    }

    public final void c() {
        if (this.f92423a.get()) {
            throw new java.lang.InterruptedException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (r1.moveToNext() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        vz5.b.a(r1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r1.moveToFirst() != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        r2.add(r1.getString(0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List d() {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Class<com.tencent.mm.plugin.appbrand.appusage.d2> r1 = com.tencent.mm.plugin.appbrand.appusage.d2.class
            java.lang.Object r1 = com.tencent.mm.plugin.appbrand.app.r9.fj(r1)
            com.tencent.mm.plugin.appbrand.appusage.d2 r1 = (com.tencent.mm.plugin.appbrand.appusage.d2) r1
            if (r1 == 0) goto L41
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.String r5 = "select appId from AppBrandMessInfoRecord where wechatPluginApp > 0 or appServiceType = 7"
            android.database.Cursor r1 = r1.rawQuery(r5, r4)
            if (r1 == 0) goto L3e
            boolean r4 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L32
        L25:
            java.lang.String r4 = r1.getString(r3)     // Catch: java.lang.Throwable -> L37
            r2.add(r4)     // Catch: java.lang.Throwable -> L37
            boolean r4 = r1.moveToNext()     // Catch: java.lang.Throwable -> L37
            if (r4 != 0) goto L25
        L32:
            r3 = 0
            vz5.b.a(r1, r3)
            goto L3e
        L37:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L39
        L39:
            r2 = move-exception
            vz5.b.a(r1, r0)
            throw r2
        L3e:
            r0.addAll(r2)
        L41:
            java.lang.Class<com.tencent.mm.plugin.appbrand.service.o6> r1 = com.tencent.mm.plugin.appbrand.service.o6.class
            i95.m r1 = i95.n0.c(r1)
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceImpl"
            kotlin.jvm.internal.o.e(r1, r2)
            com.tencent.mm.plugin.appbrand.appcache.predownload.export.f1 r1 = (com.tencent.mm.plugin.appbrand.appcache.predownload.export.f1) r1
            java.util.List r1 = r1.wi()
            java.util.Iterator r1 = r1.iterator()
        L56:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6a
            java.lang.Object r2 = r1.next()
            com.tencent.mm.plugin.appbrand.appcache.predownload.export.c1 r2 = (com.tencent.mm.plugin.appbrand.appcache.predownload.export.c1) r2
            if (r2 == 0) goto L56
            java.lang.String r2 = r2.f75780d
            r0.add(r2)
            goto L56
        L6a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.yc.d():java.util.List");
    }

    public final void e(java.util.HashMap hashMap, java.lang.String str, java.lang.String str2) {
        java.util.ArrayList arrayList;
        if (str2 == null) {
            return;
        }
        com.tencent.mm.vfs.x1 m17 = com.tencent.mm.vfs.w6.m(str2);
        int i17 = m17 != null ? (int) m17.f213234d : 0;
        if (!hashMap.containsKey(str) || hashMap.get(str) == null) {
            hashMap.put(str, new com.tencent.mm.plugin.appbrand.bd(str, i17, kz5.c0.d(str2)));
            return;
        }
        com.tencent.mm.plugin.appbrand.bd bdVar = (com.tencent.mm.plugin.appbrand.bd) hashMap.get(str);
        if (bdVar != null) {
            com.tencent.mm.plugin.appbrand.bd bdVar2 = (com.tencent.mm.plugin.appbrand.bd) hashMap.get(str);
            bdVar.f77008b = bdVar2 != null ? bdVar2.f77008b + i17 : 0;
        }
        com.tencent.mm.plugin.appbrand.bd bdVar3 = (com.tencent.mm.plugin.appbrand.bd) hashMap.get(str);
        if (bdVar3 == null || (arrayList = bdVar3.f77009c) == null) {
            return;
        }
        arrayList.add(str2);
    }
}
