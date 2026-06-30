package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes3.dex */
public final class x2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x2 f184205a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x2();

    /* renamed from: b, reason: collision with root package name */
    public static long f184206b = 18;

    public final void a(com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6536x75386e7 c6536x75386e7) {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        c6536x75386e7.f138915d = c6536x75386e7.b("FinderUsrname", xy2.c.e(context), true);
        c6536x75386e7.f138917f = hc2.s.b() ? 1 : 0;
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        c6536x75386e7.f138918g = c6536x75386e7.b("FinderSessionId", Ri, true);
        c6536x75386e7.f138919h = java.lang.System.currentTimeMillis();
    }

    public final void b(int i17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6536x75386e7 c6536x75386e7 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6536x75386e7();
        a(c6536x75386e7);
        c6536x75386e7.f138920i = f184206b;
        cl0.g gVar = new cl0.g();
        gVar.o("type", i17);
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        c6536x75386e7.p(r26.i0.t(gVar2, ",", ";", false));
        c6536x75386e7.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderGameLiveReportUtil", "report21017, " + c6536x75386e7.n() + ' ');
        java.lang.String n17 = c6536x75386e7.n();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
        java.lang.String t17 = r26.i0.t(n17, ",", ";", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePostReporter", "[reportActionBeforeLive] data = ".concat(t17));
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6300x6832e2ea c6300x6832e2ea = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6300x6832e2ea();
        c6300x6832e2ea.p("21017");
        c6300x6832e2ea.q(t17);
        c6300x6832e2ea.k();
    }

    public final void c(int i17, cl0.g extra) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extra, "extra");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6536x75386e7 c6536x75386e7 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6536x75386e7();
        a(c6536x75386e7);
        c6536x75386e7.f138920i = f184206b;
        cl0.g gVar = new cl0.g();
        gVar.o("type", i17);
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        c6536x75386e7.p(r26.i0.t(gVar2, ",", ";", false));
        java.lang.String gVar3 = extra.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar3, "toString(...)");
        c6536x75386e7.f138924m = c6536x75386e7.b("Params", r26.i0.t(gVar3, ",", ";", false), true);
        c6536x75386e7.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderGameLiveReportUtil", "report21017, " + c6536x75386e7.n() + ' ');
        java.lang.String n17 = c6536x75386e7.n();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
        java.lang.String t17 = r26.i0.t(n17, ",", ";", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePostReporter", "[reportActionBeforeLive] data = ".concat(t17));
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6300x6832e2ea c6300x6832e2ea = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6300x6832e2ea();
        c6300x6832e2ea.p("21017");
        c6300x6832e2ea.q(t17);
        c6300x6832e2ea.k();
    }

    public final void d(java.lang.String actionJson) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionJson, "actionJson");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6536x75386e7 c6536x75386e7 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6536x75386e7();
        a(c6536x75386e7);
        c6536x75386e7.f138920i = f184206b;
        c6536x75386e7.p(r26.i0.t(actionJson, ",", ";", false));
        c6536x75386e7.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderGameLiveReportUtil", "report21017, " + c6536x75386e7.n() + ' ');
        java.lang.String n17 = c6536x75386e7.n();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
        java.lang.String t17 = r26.i0.t(n17, ",", ";", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePostReporter", "[reportActionBeforeLive] data = ".concat(t17));
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6300x6832e2ea c6300x6832e2ea = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6300x6832e2ea();
        c6300x6832e2ea.p("21017");
        c6300x6832e2ea.q(t17);
        c6300x6832e2ea.k();
    }

    public final void e(int i17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6536x75386e7 c6536x75386e7 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6536x75386e7();
        a(c6536x75386e7);
        ml2.c1 c1Var = ml2.c1.f408858e;
        c6536x75386e7.f138920i = 18L;
        cl0.g gVar = new cl0.g();
        gVar.o("type", i17);
        if (str == null) {
            str = "";
        }
        gVar.h("activityid", str);
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        c6536x75386e7.p(r26.i0.t(gVar2, ",", ";", false));
        c6536x75386e7.f138924m = c6536x75386e7.b("Params", "{\"gameappid\":\"" + str2 + "\"}", true);
        c6536x75386e7.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderGameLiveReportUtil", "report21017, " + c6536x75386e7.n() + ' ');
        java.lang.String n17 = c6536x75386e7.n();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
        java.lang.String t17 = r26.i0.t(n17, ",", ";", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePostReporter", "[reportActionBeforeLive] data = ".concat(t17));
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6300x6832e2ea c6300x6832e2ea = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6300x6832e2ea();
        c6300x6832e2ea.p("21017");
        c6300x6832e2ea.q(t17);
        c6300x6832e2ea.k();
    }

    public final void f(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6536x75386e7 c6536x75386e7 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6536x75386e7();
        a(c6536x75386e7);
        ml2.c1 c1Var = ml2.c1.f408858e;
        c6536x75386e7.f138920i = 25L;
        cl0.g gVar = new cl0.g();
        gVar.o("type", i17);
        if (str == null) {
            str = "";
        }
        gVar.h("result", str);
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        c6536x75386e7.p(r26.i0.t(gVar2, ",", ";", false));
        c6536x75386e7.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderGameLiveReportUtil", "report21017, " + c6536x75386e7.n() + ' ');
        java.lang.String n17 = c6536x75386e7.n();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
        java.lang.String t17 = r26.i0.t(n17, ",", ";", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePostReporter", "[reportActionBeforeLive] data = ".concat(t17));
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6300x6832e2ea c6300x6832e2ea = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6300x6832e2ea();
        c6300x6832e2ea.p("21017");
        c6300x6832e2ea.q(t17);
        c6300x6832e2ea.k();
    }
}
