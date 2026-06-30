package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752;

/* loaded from: classes2.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.b0 f192883a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.b0();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f192884b = "";

    /* renamed from: c, reason: collision with root package name */
    public static long f192885c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static long f192886d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f192887e = "";

    public final java.lang.String a(int i17) {
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 5 ? i17 != 10000 ? "" : "search_icon" : "post_tab" : "like_tab" : "fav_tab" : "rec_tab" : "follow_tab";
    }

    public final long b(int i17) {
        if (i17 == 1) {
            return 1L;
        }
        if (i17 == 2) {
            return 2L;
        }
        if (i17 == 3) {
            return 3L;
        }
        if (i17 == 4) {
            return 4L;
        }
        if (i17 != 5) {
            return i17 != 10000 ? 0L : 6L;
        }
        return 5L;
    }

    public final void c(long j17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6553x54ab9387 c6553x54ab9387 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6553x54ab9387();
        c6553x54ab9387.q(f192884b);
        c6553x54ab9387.f139025e = f192885c;
        c6553x54ab9387.f139026f = 2L;
        c6553x54ab9387.p("prev_done");
        c6553x54ab9387.f139028h = f192886d;
        c6553x54ab9387.s("{\"feedid\":\"" + pm0.v.u(j17) + "\"}");
        c6553x54ab9387.r(java.lang.String.valueOf(c01.id.c()));
        c6553x54ab9387.k();
        h(c6553x54ab9387);
    }

    public final void d(long j17, int i17, int i18, java.lang.String keyword) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyword, "keyword");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6553x54ab9387 c6553x54ab9387 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6553x54ab9387();
        c6553x54ab9387.q(f192884b);
        c6553x54ab9387.f139025e = f192885c;
        c6553x54ab9387.f139026f = 4L;
        c6553x54ab9387.p("feed_exposure");
        c6553x54ab9387.f139028h = b(i17);
        if (i18 > 0) {
            c6553x54ab9387.s("{\"feedid\":\"" + pm0.v.u(j17) + "\";\"feed_position\":\"" + i18 + "\";\"keyword\":\"" + keyword + "\"}");
        } else {
            c6553x54ab9387.s("{\"feedid\":\"" + pm0.v.u(j17) + "\"}");
        }
        c6553x54ab9387.r(java.lang.String.valueOf(c01.id.c()));
        c6553x54ab9387.k();
        h(c6553x54ab9387);
    }

    public final void e(long j17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6553x54ab9387 c6553x54ab9387 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6553x54ab9387();
        c6553x54ab9387.q(f192884b);
        c6553x54ab9387.f139025e = f192885c;
        c6553x54ab9387.f139026f = 2L;
        c6553x54ab9387.p("prev_return");
        c6553x54ab9387.f139028h = f192886d;
        c6553x54ab9387.s("{\"feedid\":\"" + pm0.v.u(j17) + "\"}");
        c6553x54ab9387.r(java.lang.String.valueOf(c01.id.c()));
        c6553x54ab9387.k();
        h(c6553x54ab9387);
    }

    public final void f(long j17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6553x54ab9387 c6553x54ab9387 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6553x54ab9387();
        c6553x54ab9387.q(f192884b);
        c6553x54ab9387.f139025e = f192885c;
        c6553x54ab9387.f139026f = 2L;
        c6553x54ab9387.p("prev_done");
        c6553x54ab9387.f139028h = 6L;
        c6553x54ab9387.s("{\"feedid\":\"" + pm0.v.u(j17) + "\";\"keyword\":\"" + f192887e + "\"}");
        c6553x54ab9387.r(java.lang.String.valueOf(c01.id.c()));
        c6553x54ab9387.k();
        h(c6553x54ab9387);
    }

    public final void g(long j17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6553x54ab9387 c6553x54ab9387 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6553x54ab9387();
        c6553x54ab9387.q(f192884b);
        c6553x54ab9387.f139025e = f192885c;
        c6553x54ab9387.f139026f = 2L;
        c6553x54ab9387.p("prev_return");
        c6553x54ab9387.f139028h = 6L;
        c6553x54ab9387.s("{\"feedid\":\"" + pm0.v.u(j17) + "\";\"keyword\":\"" + f192887e + "\"}");
        c6553x54ab9387.r(java.lang.String.valueOf(c01.id.c()));
        c6553x54ab9387.k();
        h(c6553x54ab9387);
    }

    public final void h(jx3.a struct) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(struct, "struct");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report");
        sb6.append(struct.g());
        sb6.append(' ');
        java.lang.String n17 = struct.n();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
        sb6.append(r26.i0.t(n17, com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, " ", false));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderGalleryReportLogic", sb6.toString());
    }
}
