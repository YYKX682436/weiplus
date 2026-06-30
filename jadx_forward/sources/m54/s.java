package m54;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final m54.s f405838a = new m54.s();

    public static final void a(m54.s sVar, long j17, java.lang.String str, java.lang.String str2, boolean z17, yz5.p pVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$preloadVangogh", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader");
        sVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("preloadVangogh", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader");
        java.lang.String e17 = m54.j.e();
        za4.a aVar = new za4.a();
        aVar.f552589d = false;
        aVar.f552590e = e17;
        m54.j jVar = m54.j.f405815a;
        if (!m54.j.g(jVar.c(m54.j.d(jVar, j17, str, str2, null, null, 24, null)))) {
            if (pVar != null) {
                pVar.mo149xb9724478(0, java.lang.Boolean.TRUE);
            }
            za4.s1.f(j17, 1, z17 ? 1 : 0, 0, str2, str, aVar, new m54.r(pVar), null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preloadVangogh", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$preloadVangogh", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 r11, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 r12, boolean r13) {
        /*
            java.lang.String r1 = "preloadVangogh"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r1, r2)
            java.lang.String r3 = "Vangogh Res Preload: the switch value is "
            java.lang.String r4 = "supportVangoghPreloadRes"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasSwitch"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r4, r5)
            boolean r6 = m54.v.a()
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L44
            java.lang.Class<e42.e0> r6 = e42.e0.class
            i95.m r6 = i95.n0.c(r6)     // Catch: java.lang.Throwable -> L44
            e42.e0 r6 = (e42.e0) r6     // Catch: java.lang.Throwable -> L44
            e42.c0 r9 = e42.c0.clicfg_ad_vangogh_page_res_preload     // Catch: java.lang.Throwable -> L44
            h62.d r6 = (h62.d) r6     // Catch: java.lang.Throwable -> L44
            int r6 = r6.Ni(r9, r7)     // Catch: java.lang.Throwable -> L44
            java.lang.String r9 = "SnsAd.DynamicCanvas"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            r10.<init>(r3)     // Catch: java.lang.Throwable -> L44
            r10.append(r6)     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = r10.toString()     // Catch: java.lang.Throwable -> L44
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r9, r3)     // Catch: java.lang.Throwable -> L44
            if (r6 <= 0) goto L3f
            r3 = r7
            goto L40
        L3f:
            r3 = r8
        L40:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r4, r5)     // Catch: java.lang.Throwable -> L44
            goto L48
        L44:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r4, r5)
            r3 = r8
        L48:
            java.lang.String r4 = "SnsAd.VangoghResPreloader"
            if (r3 != 0) goto L56
            java.lang.String r0 = "the vangogh preload is disable"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r0)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r1, r2)
            return
        L56:
            if (r11 != 0) goto L62
            java.lang.String r0 = "the ad info is null, is it ad?"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r4, r0)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r1, r2)
            return
        L62:
            if (r12 != 0) goto L6e
            java.lang.String r0 = "the click action info is null!!?"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r4, r0)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r1, r2)
            return
        L6e:
            java.lang.String r3 = r12.f244137r0
            if (r3 != 0) goto L74
            java.lang.String r3 = ""
        L74:
            long r9 = r12.f244135q0
            int r0 = r12.f244104b
            r5 = 23
            if (r0 != r5) goto La8
            int r0 = r3.length()
            if (r0 != 0) goto L83
            goto L84
        L83:
            r7 = r8
        L84:
            if (r7 != 0) goto La8
            r5 = 0
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 > 0) goto L8d
            goto La8
        L8d:
            java.lang.String r0 = "it is going to preload vangogh page data, dynamicCanvasInfo is "
            java.lang.String r0 = r0.concat(r3)
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r0)
            m54.q r0 = new m54.q
            r5 = r0
            r6 = r9
            r8 = r3
            r9 = r11
            r10 = r13
            r5.<init>(r6, r8, r9, r10)
            pm0.v.w(r0)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r1, r2)
            return
        La8:
            java.lang.String r0 = "the click action info has no vangogh parameter!!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r4, r0)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m54.s.c(com.tencent.mm.plugin.sns.storage.ADInfo, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo, boolean):void");
    }

    public final java.util.List b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseJson", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader");
        cl0.e f17 = new cl0.g(str).f("preload");
        if (f17 == null || f17.mo15056xbe0e3ae6() == 0) {
            kz5.p0 p0Var = kz5.p0.f395529d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseJson", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader");
            return p0Var;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int mo15056xbe0e3ae6 = f17.mo15056xbe0e3ae6();
        for (int i17 = 0; i17 < mo15056xbe0e3ae6; i17++) {
            cl0.g k17 = f17.k(i17);
            java.lang.String mo15082x48bce8a4 = k17.mo15082x48bce8a4("url");
            java.lang.String str2 = mo15082x48bce8a4 == null ? "" : mo15082x48bce8a4;
            long optLong = k17.optLong("size");
            int optInt = k17.optInt("type");
            java.lang.String mo15082x48bce8a42 = k17.mo15082x48bce8a4("md5");
            java.lang.String str3 = mo15082x48bce8a42 == null ? "" : mo15082x48bce8a42;
            if (str2.length() > 0) {
                arrayList.add(new m54.n(str2, optInt, str3, optLong));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseJson", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader");
        return arrayList;
    }
}
