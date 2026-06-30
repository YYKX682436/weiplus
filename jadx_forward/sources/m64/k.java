package m64;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f405938a = jz5.h.b(m64.j.f405937d);

    /* renamed from: b, reason: collision with root package name */
    public m64.i f405939b;

    public final void a(java.util.List list) {
        i64.q qVar;
        r45.jj4 jj4Var;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dispatchPreload", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
        if (list == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchPreload", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            n64.f fVar = (n64.f) it.next();
            java.util.Objects.toString(fVar);
            fVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getResourceType", "com.tencent.mm.plugin.sns.ad.preload.detector.PreloadItem");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getResourceType", "com.tencent.mm.plugin.sns.ad.preload.detector.PreloadItem");
            int i17 = fVar.f416752a;
            java.lang.String str5 = "";
            if (i17 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1911, 5);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doPreloadImage", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
                n64.g gVar = fVar instanceof n64.g ? (n64.g) fVar : null;
                if (gVar != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUrl", "com.tencent.mm.plugin.sns.ad.preload.detector.UrlPreloadItem");
                    str3 = gVar.f416756e;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUrl", "com.tencent.mm.plugin.sns.ad.preload.detector.UrlPreloadItem");
                } else {
                    str3 = null;
                }
                if (str3 != null && str3.length() != 0) {
                    r13 = false;
                }
                if (r13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("TimelineAdPullPreloader", "doPreloadImage, imageUrl=null");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPreloadImage", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
                } else {
                    m64.i iVar = this.f405939b;
                    if (iVar != null && (str4 = iVar.f405936c) != null) {
                        str5 = str4;
                    }
                    if (fVar.b(2)) {
                        n74.v1.i(str3, str5, fVar.a());
                    } else if (fVar.b(4)) {
                        n74.v1.j(str3, fVar.a());
                    } else {
                        n74.v1.h(str3, str5, fVar.a());
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPreloadImage", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
                }
            } else if (i17 == 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1911, 6);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doPreloadPag", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
                n64.g gVar2 = fVar instanceof n64.g ? (n64.g) fVar : null;
                if (gVar2 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUrl", "com.tencent.mm.plugin.sns.ad.preload.detector.UrlPreloadItem");
                    str2 = gVar2.f416756e;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUrl", "com.tencent.mm.plugin.sns.ad.preload.detector.UrlPreloadItem");
                } else {
                    str2 = null;
                }
                if (str2 != null && str2.length() != 0) {
                    r13 = false;
                }
                if (r13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("TimelineAdPullPreloader", "doPreloadPag, pagUrl=null");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPreloadPag", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
                } else {
                    n74.v1.p(str2);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPreloadPag", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
                }
            } else if (i17 == 4) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1911, 7);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doPreloadMedia", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
                n64.e eVar = fVar instanceof n64.e ? (n64.e) fVar : null;
                if (eVar != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMedia", "com.tencent.mm.plugin.sns.ad.preload.detector.MediaPreloadItem");
                    jj4Var = eVar.f416751e;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMedia", "com.tencent.mm.plugin.sns.ad.preload.detector.MediaPreloadItem");
                } else {
                    jj4Var = null;
                }
                if (jj4Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("TimelineAdPullPreloader", "doPreloadVideoThumb, media=null");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPreloadMedia", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
                } else {
                    m64.i iVar2 = this.f405939b;
                    if (iVar2 != null && (str = iVar2.f405936c) != null) {
                        str5 = str;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isVideoMedia", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
                    int i18 = jj4Var.f459389e;
                    boolean z17 = i18 == 6 || i18 == 4;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isVideoMedia", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
                    if (z17) {
                        if (fVar.b(1)) {
                            m64.i iVar3 = this.f405939b;
                            l44.c0.c(iVar3 != null ? iVar3.f405934a : null, jj4Var, str5);
                            n74.v1.t(jj4Var, str5);
                        }
                        m64.i iVar4 = this.f405939b;
                        r13 = iVar4 != null ? iVar4.f405935b : true;
                        if (fVar.b(8)) {
                            n74.v1.v(jj4Var, str5, r13);
                        } else {
                            fVar.b(16);
                        }
                    } else {
                        if (fVar.b(32)) {
                            n74.v1.s(jj4Var, str5);
                        }
                        if (fVar.b(2)) {
                            n74.v1.h(jj4Var.f459393i, str5, fVar.a());
                        }
                        if (fVar.b(4)) {
                            n74.v1.j(jj4Var.f459393i, fVar.a());
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPreloadMedia", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
                }
            } else if (i17 == 5) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1911, 8);
                m64.i iVar5 = this.f405939b;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771 = (iVar5 == null || (qVar = iVar5.f405934a) == null) ? null : qVar.f370820a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doPreloadClickInfo", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
                n64.c cVar = fVar instanceof n64.c ? (n64.c) fVar : null;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17 = cVar != null ? cVar.c() : null;
                if (c17 != null) {
                    c17.g(c17902x72cc1771);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPreloadClickInfo", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchPreload", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
    }

    public final void b(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("preload", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
        if (obj == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preload", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
            return;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMDetector", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
        n64.a aVar = (n64.a) ((jz5.n) this.f405938a).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMDetector", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
        java.util.List b17 = aVar.b(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preload, totalNum=");
        sb6.append(b17 != null ? java.lang.Integer.valueOf(((java.util.ArrayList) b17).size()) : null);
        sb6.append(", detectCost=");
        sb6.append(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
        sb6.append(", snsId=");
        m64.i iVar = this.f405939b;
        sb6.append(iVar != null ? iVar.f405936c : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TimelineAdPullPreloader", sb6.toString());
        if (!(b17 == null || b17.isEmpty())) {
            try {
                a(b17);
            } catch (java.lang.Throwable th6) {
                ca4.q.c("TimelineAdPreloader dispatchPreload", th6);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TimelineAdPullPreloader", "preload, totalCost=" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preload", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TimelineAdPullPreloader", "preload, empty, target=" + obj);
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1911, 3);
        } else if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1911, 4);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preload", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdPullPreloader");
    }
}
