package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class yc {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f173956a = new java.util.concurrent.atomic.AtomicBoolean();

    public final void a(java.util.HashMap hashMap, java.util.List list) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.sb.f168623c.c());
        if (!r6Var.m() || !r6Var.y()) {
            r6Var.l();
            return;
        }
        com.p314xaae8f345.mm.vfs.r6[] G = r6Var.G();
        if (G != null) {
            if (!(G.length == 0)) {
                java.util.HashMap hashMap2 = new java.util.HashMap();
                c();
                for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : G) {
                    java.lang.String m82467xfb82e301 = r6Var2.m82467xfb82e301();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m82467xfb82e301, "getName(...)");
                    java.lang.String quote = java.util.regex.Pattern.quote("-");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(quote, "quote(...)");
                    java.lang.String[] strArr = (java.lang.String[]) r26.n0.f0(m82467xfb82e301, new java.lang.String[]{quote}, false, 0, 6, null).toArray(new java.lang.String[0]);
                    if (strArr == null || strArr.length < 2) {
                        com.p314xaae8f345.mm.vfs.w6.h(r6Var2.o());
                        com.p314xaae8f345.mm.vfs.w6.g(r6Var2.o(), true);
                    } else {
                        c();
                        java.lang.String str = strArr[0];
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61201x533437e, str)) {
                            str = "@LibraryAppId";
                        }
                        if (list.contains(str)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgCalculateLogic", "calculateExpiredWebViewCodeCache, exclude appId: " + str);
                        } else {
                            int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(u46.l.s(strArr[1], 1), 0);
                            int[] iArr = (int[]) hashMap2.get(str);
                            if (iArr == null) {
                                iArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.r7.f157481a.e(str) ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7.f157598a.o(true) : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di().A(str, 0);
                                if (iArr == null) {
                                    iArr = new int[]{0};
                                }
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgCalculateLogic", "calculateExpiredWebViewCodeCache, select_versionArray(%s), get(%s)", str, u46.a.c(iArr, "-1"));
                                hashMap2.put(str, iArr);
                            }
                            if (!u46.a.a(iArr, P)) {
                                e(hashMap, str, r6Var2.o());
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgCalculateLogic", "calculateExpiredWebViewCodeCache, file(%s) deleted", r6Var2.o());
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.yc.b(java.util.HashMap, java.util.List):void");
    }

    public final void c() {
        if (this.f173956a.get()) {
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
            java.lang.Class<com.tencent.mm.plugin.appbrand.appusage.d2> r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.d2.class
            java.lang.Object r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(r1)
            com.tencent.mm.plugin.appbrand.appusage.d2 r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.d2) r1
            if (r1 == 0) goto L41
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.String r5 = "select appId from AppBrandMessInfoRecord where wechatPluginApp > 0 or appServiceType = 7"
            android.database.Cursor r1 = r1.m145256x1d3f4980(r5, r4)
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
            java.lang.Class<com.tencent.mm.plugin.appbrand.service.o6> r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o6.class
            i95.m r1 = i95.n0.c(r1)
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceImpl"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r1, r2)
            com.tencent.mm.plugin.appbrand.appcache.predownload.export.f1 r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.f1) r1
            java.util.List r1 = r1.wi()
            java.util.Iterator r1 = r1.iterator()
        L56:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6a
            java.lang.Object r2 = r1.next()
            com.tencent.mm.plugin.appbrand.appcache.predownload.export.c1 r2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.c1) r2
            if (r2 == 0) goto L56
            java.lang.String r2 = r2.f157313d
            r0.add(r2)
            goto L56
        L6a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.yc.d():java.util.List");
    }

    public final void e(java.util.HashMap hashMap, java.lang.String str, java.lang.String str2) {
        java.util.ArrayList arrayList;
        if (str2 == null) {
            return;
        }
        com.p314xaae8f345.mm.vfs.x1 m17 = com.p314xaae8f345.mm.vfs.w6.m(str2);
        int i17 = m17 != null ? (int) m17.f294767d : 0;
        if (!hashMap.containsKey(str) || hashMap.get(str) == null) {
            hashMap.put(str, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.bd(str, i17, kz5.c0.d(str2)));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.bd bdVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.bd) hashMap.get(str);
        if (bdVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.bd bdVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.bd) hashMap.get(str);
            bdVar.f158541b = bdVar2 != null ? bdVar2.f158541b + i17 : 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.bd bdVar3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.bd) hashMap.get(str);
        if (bdVar3 == null || (arrayList = bdVar3.f158542c) == null) {
            return;
        }
        arrayList.add(str2);
    }
}
