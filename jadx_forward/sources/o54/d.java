package o54;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public int f424656a;

    /* renamed from: b, reason: collision with root package name */
    public int f424657b;

    /* renamed from: c, reason: collision with root package name */
    public int f424658c;

    /* renamed from: d, reason: collision with root package name */
    public int f424659d;

    /* renamed from: e, reason: collision with root package name */
    public int f424660e;

    /* renamed from: f, reason: collision with root package name */
    public int f424661f;

    /* renamed from: g, reason: collision with root package name */
    public int f424662g;

    /* renamed from: h, reason: collision with root package name */
    public int f424663h;

    /* renamed from: i, reason: collision with root package name */
    public int f424664i;

    /* renamed from: j, reason: collision with root package name */
    public int f424665j;

    /* renamed from: k, reason: collision with root package name */
    public int f424666k;

    /* renamed from: l, reason: collision with root package name */
    public int f424667l;

    public o54.d a(java.util.List list, java.lang.String str) {
        int i17;
        int i18;
        int i19;
        int i27;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("build", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$ComponentStaticBuilder");
        if (list == null || list.size() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("build", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$ComponentStaticBuilder");
            return this;
        }
        this.f424660e = list.size();
        try {
            java.util.Iterator it = list.iterator();
            boolean z17 = false;
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2 a2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2) it.next();
                if (a2Var != null) {
                    int m17 = a2Var.m();
                    if (a2Var.p() != null) {
                        i18 = a2Var.p().D;
                        i17 = a2Var.p().E;
                    } else {
                        i17 = -1;
                        i18 = 0;
                    }
                    int i28 = 1;
                    if (i17 == 0) {
                        this.f424666k++;
                    }
                    if (!za4.z0.s(m17)) {
                        this.f424661f++;
                        if (i17 == 0) {
                            this.f424667l++;
                        }
                    }
                    boolean z18 = z17;
                    if (m17 == 41 || m17 == 44 || m17 == 45) {
                        this.f424656a++;
                        if (i17 == 0) {
                            this.f424662g++;
                        }
                        if (i18 > 0) {
                            int i29 = o54.g.f424681a;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getImageFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                            if (i18 < 20480) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImageFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                            } else if (i18 < 51200) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImageFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                i28 = 2;
                            } else if (i18 < 102400) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImageFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                i28 = 3;
                            } else if (i18 < 204800) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImageFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                i28 = 4;
                            } else if (i18 < 512000) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImageFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                i28 = 5;
                            } else if (i18 < 1048576) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImageFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                i28 = 6;
                            } else {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImageFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                i28 = 7;
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                            o54.g.a(1675L, i28);
                        } else {
                            o54.g.a(1675L, 19L);
                            z17 = true;
                        }
                    } else if (m17 == 61) {
                        this.f424657b++;
                        if (i17 == 0) {
                            this.f424663h++;
                        }
                        if (i18 > 0) {
                            int i37 = o54.g.f424681a;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSightVideoFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                            if (i18 < 1048576) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSightVideoFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                i27 = 8;
                            } else if (i18 < 2097152) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSightVideoFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                i27 = 9;
                            } else if (i18 < 3145728) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSightVideoFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                i27 = 10;
                            } else if (i18 < 4194304) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSightVideoFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                i27 = 11;
                            } else if (i18 < 5242880) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSightVideoFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                i27 = 12;
                            } else if (i18 < 10485760) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSightVideoFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                i27 = 13;
                            } else {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSightVideoFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                i27 = 14;
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                            o54.g.a(1675L, i27);
                        } else {
                            o54.g.a(1675L, 20L);
                        }
                    } else if (m17 == 62) {
                        this.f424658c++;
                        if (i17 == 0) {
                            this.f424664i++;
                        }
                        if (i18 > 0) {
                            int i38 = o54.g.f424681a;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStreamVideoFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                            if (i18 < 3145728) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStreamVideoFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                i19 = 15;
                            } else if (i18 < 5242880) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStreamVideoFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                i19 = 16;
                            } else if (i18 < 10485760) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStreamVideoFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                i19 = 17;
                            } else {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStreamVideoFileSizeRange", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                i19 = 18;
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                            o54.g.a(1675L, i19);
                        } else {
                            o54.g.a(1675L, 21L);
                        }
                    } else if (m17 == 142) {
                        this.f424659d++;
                        if (i17 == 0) {
                            this.f424665j++;
                        }
                    }
                    z17 = z18;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportComponentListAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifReporter");
            ((ku5.t0) ku5.t0.f394148d).q(new m44.b(list));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportComponentListAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifReporter");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPageStaticHelper.ComponentStaticBuilder", "build exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("build", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$ComponentStaticBuilder");
        return this;
    }
}
