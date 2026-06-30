package ba4;

/* loaded from: classes4.dex */
public final class a implements v94.i {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6889x9caa3908 f100229a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f100230b;

    public final void a(java.lang.String info) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addCoverInfo", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6889x9caa3908 c6889x9caa3908 = this.f100229a;
        if (c6889x9caa3908 != null) {
            c6889x9caa3908.p(r26.i0.t(info, ",", ";", false));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addCoverInfo", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
    }

    public void b(java.lang.String info) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addImageInfo", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6889x9caa3908 c6889x9caa3908 = this.f100229a;
        if (c6889x9caa3908 != null) {
            c6889x9caa3908.f142056j = c6889x9caa3908.b("ImageInfo", r26.i0.t(info, ",", ";", false), true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addImageInfo", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
    }

    public void c(java.lang.String info) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addVideoInfo", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6889x9caa3908 c6889x9caa3908 = this.f100229a;
        if (c6889x9caa3908 != null) {
            c6889x9caa3908.f142057k = c6889x9caa3908.b("VideoInfo", r26.i0.t(info, ",", ";", false), true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addVideoInfo", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
    }

    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markFirstFrameLoad", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6889x9caa3908 c6889x9caa3908 = this.f100229a;
        if ((c6889x9caa3908 != null ? c6889x9caa3908.f142067u : 0L) <= 0 && c6889x9caa3908 != null) {
            c6889x9caa3908.f142067u = java.lang.System.currentTimeMillis();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markFirstFrameLoad", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
    }

    public void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markFirstPlay", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6889x9caa3908 c6889x9caa3908 = this.f100229a;
        if ((c6889x9caa3908 != null ? c6889x9caa3908.f142069w : 0L) <= 0 && c6889x9caa3908 != null) {
            c6889x9caa3908.f142069w = java.lang.System.currentTimeMillis();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markFirstPlay", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
    }

    public final void f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markFold", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6889x9caa3908 c6889x9caa3908 = this.f100229a;
        if ((c6889x9caa3908 != null ? c6889x9caa3908.f142062p : 0) <= 0) {
            if (c6889x9caa3908 != null) {
                c6889x9caa3908.f142062p = 1;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markFold", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
        } else {
            if (c6889x9caa3908 != null) {
                c6889x9caa3908.f142062p = c6889x9caa3908 != null ? c6889x9caa3908.f142062p : 1;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markFold", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
        }
    }

    public void g(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markIsLocal", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6889x9caa3908 c6889x9caa3908 = this.f100229a;
        if (c6889x9caa3908 != null) {
            c6889x9caa3908.f142059m = z17 ? 1 : -1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markIsLocal", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
    }

    public final void h(java.lang.Boolean bool) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markLikeClick", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6889x9caa3908 c6889x9caa3908 = this.f100229a;
            if (c6889x9caa3908 != null) {
                c6889x9caa3908.f142063q = bool.booleanValue() ? 1 : 0;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6889x9caa3908 c6889x9caa39082 = this.f100229a;
            if (c6889x9caa39082 != null) {
                c6889x9caa39082.f142064r = this.f100230b != booleanValue ? 1 : 0;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markLikeClick", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
    }

    public final void i(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1 coverInfo, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markPageIn", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverInfo, "coverInfo");
        if (this.f100229a != null) {
            j(z17);
        }
        this.f100230b = coverInfo.f67721xff78bac6;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6889x9caa3908 c6889x9caa3908 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6889x9caa3908();
        this.f100229a = c6889x9caa3908;
        c6889x9caa3908.f142050d = 2;
        c6889x9caa3908.f142052f = c6889x9caa3908.b("UserName", coverInfo.m70536x6bf53a6c(), true);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6889x9caa3908 c6889x9caa39082 = this.f100229a;
        if (c6889x9caa39082 != null) {
            c6889x9caa39082.f142053g = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(coverInfo.m70536x6bf53a6c(), gm0.j1.u().c().l(2, null)) ? 1 : 0;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6889x9caa3908 c6889x9caa39083 = this.f100229a;
        if (c6889x9caa39083 != null) {
            c6889x9caa39083.f142054h = coverInfo.f67730x2262335f;
        }
        if (c6889x9caa39083 != null) {
            java.lang.Long u07 = coverInfo.u0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u07, "getSnsObjId(...)");
            c6889x9caa39083.f142055i = u07.longValue();
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6889x9caa3908 c6889x9caa39084 = this.f100229a;
        if (c6889x9caa39084 != null) {
            c6889x9caa39084.f142065s = java.lang.System.currentTimeMillis();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markPageIn", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
    }

    public final void j(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markPageOut", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableCoverPreviewReport", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_cover_preview_report_enable, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCoverConfig", "enableUserPageReport:" + fj6);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableCoverPreviewReport", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
        if (fj6) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6889x9caa3908 c6889x9caa3908 = this.f100229a;
            if (c6889x9caa3908 != null) {
                c6889x9caa3908.f142051e = z17 ? 1 : 2;
            }
            if (c6889x9caa3908 != null) {
                c6889x9caa3908.f142066t = java.lang.System.currentTimeMillis();
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6889x9caa3908 c6889x9caa39082 = this.f100229a;
            if (c6889x9caa39082 != null) {
                c6889x9caa39082.k();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markPageOut", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
    }
}
