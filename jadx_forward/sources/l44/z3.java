package l44;

/* loaded from: classes4.dex */
public abstract class z3 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashSet f397969a = new java.util.HashSet();

    public static void a(n64.a aVar, java.lang.Object obj, java.util.List list, com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a, com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doDetectClickInfoWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
        java.util.List b17 = aVar.b(obj);
        if (b17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doDetectClickInfoWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleClickInfoWeApp, clickInfo.size=");
        java.util.ArrayList arrayList = (java.util.ArrayList) b17;
        sb6.append(arrayList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdWeAppPreloader", sb6.toString());
        try {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                n64.f fVar = (n64.f) it.next();
                java.util.Objects.toString(fVar);
                if (fVar instanceof n64.c) {
                    n64.c cVar = (n64.c) fVar;
                    l44.y3 c17 = c(cVar.c(), list, c19762x487075a, c19762x487075a2);
                    if (c17 != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1911, 9);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdWeAppPreloader", "find weAppName=" + c17.f397958a + ", weAppType=" + c17.f397960c + ", logInfo=" + cVar.a());
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("TimelineAdPreloader handleClickInfoWeApp", th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doDetectClickInfoWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
    }

    public static void b(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doPreloadWeAppPkg", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPreloadWeAppPkg", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
            return;
        }
        java.lang.String str3 = str + "_" + str2;
        java.util.HashSet hashSet = f397969a;
        synchronized (hashSet) {
            try {
                if (hashSet.contains(str3)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdWeAppPreloader", "doPreloadWeAppPkg, already preloaded, key=" + str3);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPreloadWeAppPkg", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
                    return;
                }
                hashSet.add(str3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdWeAppPreloader", "doPreloadWeAppPkg, key=" + str3);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6.class)).P4(str, null, str2, 5);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1612, 45);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPreloadWeAppPkg", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPreloadWeAppPkg", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
                throw th6;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l44.y3 c(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 r16, java.util.List r17, com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a r18, com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a r19) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l44.z3.c(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo, java.util.List, com.tencent.mm.pointers.PBool, com.tencent.mm.pointers.PBool):l44.y3");
    }

    public static l44.y3 d(ab4.d0 d0Var) {
        f54.c cVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWeAppInfoFromComponent", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
        if (d0Var instanceof ab4.o) {
            ab4.o oVar = (ab4.o) d0Var;
            if (oVar != null && !android.text.TextUtils.isEmpty(oVar.f84417z1)) {
                l44.y3 y3Var = new l44.y3(oVar.f84417z1, oVar.A1, oVar.B1);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWeAppInfoFromComponent", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
                return y3Var;
            }
        } else if ((d0Var instanceof f54.c) && (cVar = (f54.c) d0Var) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWeAppUserName", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingDoubleLinkInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWeAppUserName", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingDoubleLinkInfo");
            java.lang.String str = cVar.D1;
            if (!android.text.TextUtils.isEmpty(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWeAppUserName", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingDoubleLinkInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWeAppUserName", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingDoubleLinkInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWeAppPath", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingDoubleLinkInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWeAppPath", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingDoubleLinkInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWeAppType", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingDoubleLinkInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWeAppType", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingDoubleLinkInfo");
                l44.y3 y3Var2 = new l44.y3(str, cVar.E1, cVar.F1);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWeAppInfoFromComponent", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
                return y3Var2;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWeAppInfoFromComponent", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
        return null;
    }

    public static void e(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, java.util.List list, com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a, com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleClickInfoWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleClickInfoWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
            return;
        }
        n64.a aVar = new n64.a();
        aVar.e(new l44.w3());
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        a(aVar, c17933xe8d1b226.m70354x74235b3e(), list, c19762x487075a, c19762x487075a2);
        a(aVar, c17933xe8d1b226.m70346x10413e67(), list, c19762x487075a, c19762x487075a2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdWeAppPreloader", "handleClickInfoWeApp, totalCost=" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleClickInfoWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
    }

    public static void f(ab4.d0 d0Var, java.util.ArrayList arrayList) {
        l44.y3 d17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseComponentWeAppInfo", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
        try {
            if (za4.z0.s(d0Var.f84360q)) {
                java.util.List a17 = d0Var.a();
                if (a17 != null) {
                    java.util.Iterator it = a17.iterator();
                    while (it.hasNext()) {
                        f((ab4.d0) it.next(), arrayList);
                    }
                }
                d17 = null;
            } else {
                d17 = d0Var instanceof ab4.j0 ? d(((ab4.j0) d0Var).P) : d0Var instanceof f54.m ? d(((f54.m) d0Var).I) : d(d0Var);
            }
            if (d17 != null && !arrayList.contains(d17)) {
                arrayList.add(d17);
            }
            arrayList.size();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdWeAppPreloader", "parseComponentWeAppInfo exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseComponentWeAppInfo", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
    }

    public static void g(java.util.List list, boolean z17, boolean z18, boolean z19) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startPreloadWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
        if (list == null || list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdWeAppPreloader", "startPreloadWeApp, list is empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPreloadWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            l44.y3 y3Var = (l44.y3) it.next();
            if (!android.text.TextUtils.isEmpty(y3Var.f397958a)) {
                java.lang.String str2 = y3Var.f397958a;
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startPreloadWeApp, preloadWeAppPkg=");
        sb6.append(z17);
        sb6.append(", hasWeGame=");
        sb6.append(z18);
        sb6.append(", hasWeApp=");
        sb6.append(z19);
        sb6.append(", weAppUserName=");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("list2Str", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
        if (arrayList.size() > 0) {
            str = u46.l.h(arrayList, ",");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("list2Str", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("list2Str", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
            str = "";
        }
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdWeAppPreloader", sb6.toString());
        if (z19) {
            try {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class)).Rh(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6.f170364v);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdWeAppPreloader", "startPreloadWeApp->preloadEnvForMiniProgram, timeCost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdWeAppPreloader", "startPreloadWeApp->preloadEnvForMiniProgram, exp=" + th6.toString());
            }
        }
        if (z18) {
            try {
                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class)).c8(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6.f170364v);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdWeAppPreloader", "startPreloadWeApp->preloadEnvForMiniGame, timeCost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis2));
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdWeAppPreloader", "startPreloadWeApp->preloadEnvForMiniGame, exp=" + th7.toString());
            }
        }
        try {
            long currentTimeMillis3 = java.lang.System.currentTimeMillis();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6.class)).K5(arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6.f170364v);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdWeAppPreloader", "startPreloadWeApp->batchSyncWxaAttr, timeCost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis3));
        } catch (java.lang.Throwable th8) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdWeAppPreloader", "startPreloadWeApp->batchSyncWxaAttr, exp=" + th8.toString());
        }
        if (z17) {
            try {
                long currentTimeMillis4 = java.lang.System.currentTimeMillis();
                java.util.Iterator it6 = list.iterator();
                while (it6.hasNext()) {
                    l44.y3 y3Var2 = (l44.y3) it6.next();
                    b(y3Var2.f397958a, y3Var2.f397959b);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdWeAppPreloader", "startPreloadWeApp->preloadWeAppPkg, timeCost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis4));
            } catch (java.lang.Throwable th9) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdWeAppPreloader", "startPreloadWeApp->preloadWeAppPkg, exp=" + th9.toString());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPreloadWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
    }
}
