package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

@j95.b(m140513x1e06fd29 = {l81.q0.class})
/* loaded from: classes7.dex */
public final class ua extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f157530d = new java.util.concurrent.ConcurrentHashMap(4);

    /* renamed from: e, reason: collision with root package name */
    public final ik1.x f157531e = new ik1.x();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.d9 f157532f = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.d9();

    public static void Ai(m81.b bVar) {
        if (bVar == null) {
            return;
        }
        java.lang.String str = bVar.f271245a;
        java.lang.String str2 = bVar.f271245a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaPkgUpdater", "cancelRequest %s", str);
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ua Bi = Bi();
            if (Bi != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.z8 z8Var = Bi.f157532f.f157024a;
                z8Var.getClass();
                z8Var.a(str2);
            }
        } finally {
            Ni(str2, true);
            Vi(str2);
        }
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ua Bi() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ua uaVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ua) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ua.class);
        try {
            uaVar.m134976x2690a4ac();
            if (gm0.j1.a()) {
                return uaVar;
            }
            return null;
        } catch (java.lang.Exception e17) {
            if ((e17 instanceof com.p314xaae8f345.mm.p2624x91727fcf.p2625x1d1e926c.C21320x5c919cff) && u46.l.b(e17.getMessage(), "logout.")) {
                return null;
            }
            throw new java.lang.RuntimeException(e17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0358  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void Di(java.lang.String r39, java.lang.String r40, java.lang.String r41, int r42, int r43, java.lang.String r44, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.b6 r45, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.h7 r46) {
        /*
            Method dump skipped, instructions count: 1018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ua.Di(java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, com.tencent.mm.plugin.appbrand.appcache.b6, com.tencent.mm.plugin.appbrand.appcache.h7):void");
    }

    public static java.util.Collection Ni(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ua Bi;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (Bi = Bi()) == null) {
            return null;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaPkgUpdater", "removeCallbacks, key[%s]", str);
        }
        return Bi.f157531e.g(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0032, code lost:
    
        if (r7 != 13) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static m81.b Ri(java.lang.String r6, int r7, int r8, java.lang.String r9, r45.y50 r10, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.va r11) {
        /*
            com.tencent.mm.plugin.appbrand.appcache.ua r0 = Bi()
            java.lang.String r1 = "MicroMsg.WxaPkgUpdater"
            r2 = 0
            if (r0 != 0) goto L10
            java.lang.String r6 = "startDownloadPkg, get null updater instance!!!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r6)
            return r2
        L10:
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r6)
            if (r0 != 0) goto L4d
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r9)
            if (r0 == 0) goto L1d
            goto L4d
        L1d:
            if (r7 == 0) goto L47
            r0 = 1
            if (r7 == r0) goto L35
            r0 = 2
            if (r7 == r0) goto L35
            r0 = 6
            if (r7 == r0) goto L47
            r0 = 999(0x3e7, float:1.4E-42)
            if (r7 == r0) goto L35
            r0 = 12
            if (r7 == r0) goto L47
            r0 = 13
            if (r7 == r0) goto L47
            goto L4d
        L35:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "Unrecognized type:"
            r6.<init>(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            iz5.a.h(r6)
            throw r2
        L47:
            com.tencent.mm.plugin.appbrand.appcache.e9 r0 = new com.tencent.mm.plugin.appbrand.appcache.e9
            r0.<init>(r6, r7, r8, r9)
            goto L4e
        L4d:
            r0 = r2
        L4e:
            if (r0 != 0) goto L52
            r0 = r2
            goto L70
        L52:
            java.lang.String r3 = "@LibraryAppId"
            r3.equals(r6)
            com.tencent.mm.plugin.appbrand.appcache.y7 r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7.f157598a
            boolean r4 = r4.d()
            if (r4 == 0) goto L70
            boolean r3 = r3.equalsIgnoreCase(r6)
            if (r3 == 0) goto L70
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            r4 = 300(0x12c, double:1.48E-321)
            long r3 = r3.toMillis(r4)
            int r3 = (int) r3
            r0.f271253i = r3
        L70:
            if (r0 != 0) goto L85
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r7, r8, r9}
            java.lang.String r7 = "startDownloadPkg, create Null request, appId %s, pkgType %d, pkgVersion %d, url %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r7, r6)
            return r2
        L85:
            r0.f406224o = r10
            boolean r6 = Ui(r0, r11)
            java.lang.String r7 = r0.f271245a
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r8}
            java.lang.String r8 = "startDownloadPkg, request.urlKey[%s], ret[%b]"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r8, r7)
            if (r6 == 0) goto L9e
            r2 = r0
        L9e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ua.Ri(java.lang.String, int, int, java.lang.String, r45.y50, com.tencent.mm.plugin.appbrand.appcache.va):m81.b");
    }

    public static boolean Ui(m81.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.va vaVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ua Bi;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ua Bi2;
        if (Bi() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaPkgUpdater", "startDownloadPkg, get null updater instance!!!");
            return false;
        }
        if (bVar == null) {
            return false;
        }
        java.lang.String str = bVar.f271245a;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && vaVar != null && (Bi2 = Bi()) != null) {
            Bi2.f157531e.e(str, vaVar);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (Bi = Bi()) != null) {
            ((java.util.concurrent.ConcurrentHashMap) Bi.f157530d).put(str, bVar);
        }
        int a17 = Bi().f157532f.a(bVar);
        if (a17 != 0 && a17 != 2) {
            wi(str, bVar.f406221l, m81.c.ENV_ERR, null);
            return false;
        }
        if (vaVar == null) {
            return true;
        }
        vaVar.b(bVar);
        return true;
    }

    public static void Vi(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ua Bi;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (Bi = Bi()) == null) {
            return;
        }
        ((java.util.concurrent.ConcurrentHashMap) Bi.f157530d).remove(str);
    }

    public static boolean Zi(com.p314xaae8f345.mm.vfs.r6 r6Var, long j17, java.lang.String str, java.lang.String str2, ik1.b0 b0Var) {
        long a17 = ik1.g.a(r6Var.o());
        java.lang.Long valueOf = java.lang.Long.valueOf(a17);
        boolean z17 = j17 > 0 && a17 == j17;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaPkgUpdater", "[%s]verifyPkg, appId[%s] verify ok with checksumCrc32[%d]", str2, str, java.lang.Long.valueOf(j17));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaPkgUpdater", "[%s]verifyPkg, appId[%s] checksumCrc32[%d] != file.crc32[%d]", str2, str, java.lang.Long.valueOf(j17), valueOf);
        }
        if (b0Var != null) {
            b0Var.f373357a = valueOf;
        }
        return z17;
    }

    public static boolean aj(com.p314xaae8f345.mm.vfs.r6 r6Var, java.lang.String[] strArr, java.lang.String str, java.lang.String str2, ik1.b0 b0Var) {
        java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.EnumC11664x177167f4.d(r6Var.o());
        boolean z17 = false;
        if (strArr != null) {
            int length = strArr.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    break;
                }
                java.lang.String str3 = strArr[i17];
                if (!android.text.TextUtils.isEmpty(str3) && str3.equalsIgnoreCase(d17)) {
                    z17 = true;
                    break;
                }
                i17++;
            }
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaPkgUpdater", "[%s]verifyPkg, appId[%s] verify ok with checksumMd5[%s]", str2, str, d17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaPkgUpdater", "[%s]verifyPkg, appId[%s] checksumMd5List[%s] != file.md5[%s]", str2, str, u46.l.k(strArr, ","), d17);
        }
        if (b0Var != null) {
            b0Var.f373357a = d17;
        }
        return z17;
    }

    public static void wi(java.lang.String str, java.lang.String str2, m81.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.wa waVar) {
        java.util.Collection<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.va> Ni = Ni(str, false);
        if (Ni != null) {
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.va vaVar : Ni) {
                if (vaVar != null) {
                    vaVar.c(str2, cVar, waVar);
                }
            }
        }
        Vi(str);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.z8 z8Var = this.f157532f.f157024a;
        z8Var.f271198c.shutdownNow();
        z8Var.b();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.c9) z8Var.f271199d).f157008a.mo50299x35224f();
    }
}
