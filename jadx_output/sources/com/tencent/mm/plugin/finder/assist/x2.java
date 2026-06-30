package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes3.dex */
public final class x2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.x2 f102672a = new com.tencent.mm.plugin.finder.assist.x2();

    /* renamed from: b, reason: collision with root package name */
    public static long f102673b = 18;

    public final void a(com.tencent.mm.autogen.mmdata.rpt.FinderLiveStreamStruct finderLiveStreamStruct) {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        finderLiveStreamStruct.f57382d = finderLiveStreamStruct.b("FinderUsrname", xy2.c.e(context), true);
        finderLiveStreamStruct.f57384f = hc2.s.b() ? 1 : 0;
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        finderLiveStreamStruct.f57385g = finderLiveStreamStruct.b("FinderSessionId", Ri, true);
        finderLiveStreamStruct.f57386h = java.lang.System.currentTimeMillis();
    }

    public final void b(int i17) {
        com.tencent.mm.autogen.mmdata.rpt.FinderLiveStreamStruct finderLiveStreamStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLiveStreamStruct();
        a(finderLiveStreamStruct);
        finderLiveStreamStruct.f57387i = f102673b;
        cl0.g gVar = new cl0.g();
        gVar.o("type", i17);
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        finderLiveStreamStruct.p(r26.i0.t(gVar2, ",", ";", false));
        finderLiveStreamStruct.k();
        com.tencent.mars.xlog.Log.i("Finder.FinderGameLiveReportUtil", "report21017, " + finderLiveStreamStruct.n() + ' ');
        java.lang.String n17 = finderLiveStreamStruct.n();
        kotlin.jvm.internal.o.f(n17, "toShowString(...)");
        java.lang.String t17 = r26.i0.t(n17, ",", ";", false);
        com.tencent.mars.xlog.Log.i("FinderLivePostReporter", "[reportActionBeforeLive] data = ".concat(t17));
        com.tencent.mm.autogen.mmdata.rpt.AndroidFinderLivePostReportStruct androidFinderLivePostReportStruct = new com.tencent.mm.autogen.mmdata.rpt.AndroidFinderLivePostReportStruct();
        androidFinderLivePostReportStruct.p("21017");
        androidFinderLivePostReportStruct.q(t17);
        androidFinderLivePostReportStruct.k();
    }

    public final void c(int i17, cl0.g extra) {
        kotlin.jvm.internal.o.g(extra, "extra");
        com.tencent.mm.autogen.mmdata.rpt.FinderLiveStreamStruct finderLiveStreamStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLiveStreamStruct();
        a(finderLiveStreamStruct);
        finderLiveStreamStruct.f57387i = f102673b;
        cl0.g gVar = new cl0.g();
        gVar.o("type", i17);
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        finderLiveStreamStruct.p(r26.i0.t(gVar2, ",", ";", false));
        java.lang.String gVar3 = extra.toString();
        kotlin.jvm.internal.o.f(gVar3, "toString(...)");
        finderLiveStreamStruct.f57391m = finderLiveStreamStruct.b("Params", r26.i0.t(gVar3, ",", ";", false), true);
        finderLiveStreamStruct.k();
        com.tencent.mars.xlog.Log.i("Finder.FinderGameLiveReportUtil", "report21017, " + finderLiveStreamStruct.n() + ' ');
        java.lang.String n17 = finderLiveStreamStruct.n();
        kotlin.jvm.internal.o.f(n17, "toShowString(...)");
        java.lang.String t17 = r26.i0.t(n17, ",", ";", false);
        com.tencent.mars.xlog.Log.i("FinderLivePostReporter", "[reportActionBeforeLive] data = ".concat(t17));
        com.tencent.mm.autogen.mmdata.rpt.AndroidFinderLivePostReportStruct androidFinderLivePostReportStruct = new com.tencent.mm.autogen.mmdata.rpt.AndroidFinderLivePostReportStruct();
        androidFinderLivePostReportStruct.p("21017");
        androidFinderLivePostReportStruct.q(t17);
        androidFinderLivePostReportStruct.k();
    }

    public final void d(java.lang.String actionJson) {
        kotlin.jvm.internal.o.g(actionJson, "actionJson");
        com.tencent.mm.autogen.mmdata.rpt.FinderLiveStreamStruct finderLiveStreamStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLiveStreamStruct();
        a(finderLiveStreamStruct);
        finderLiveStreamStruct.f57387i = f102673b;
        finderLiveStreamStruct.p(r26.i0.t(actionJson, ",", ";", false));
        finderLiveStreamStruct.k();
        com.tencent.mars.xlog.Log.i("Finder.FinderGameLiveReportUtil", "report21017, " + finderLiveStreamStruct.n() + ' ');
        java.lang.String n17 = finderLiveStreamStruct.n();
        kotlin.jvm.internal.o.f(n17, "toShowString(...)");
        java.lang.String t17 = r26.i0.t(n17, ",", ";", false);
        com.tencent.mars.xlog.Log.i("FinderLivePostReporter", "[reportActionBeforeLive] data = ".concat(t17));
        com.tencent.mm.autogen.mmdata.rpt.AndroidFinderLivePostReportStruct androidFinderLivePostReportStruct = new com.tencent.mm.autogen.mmdata.rpt.AndroidFinderLivePostReportStruct();
        androidFinderLivePostReportStruct.p("21017");
        androidFinderLivePostReportStruct.q(t17);
        androidFinderLivePostReportStruct.k();
    }

    public final void e(int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.autogen.mmdata.rpt.FinderLiveStreamStruct finderLiveStreamStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLiveStreamStruct();
        a(finderLiveStreamStruct);
        ml2.c1 c1Var = ml2.c1.f327325e;
        finderLiveStreamStruct.f57387i = 18L;
        cl0.g gVar = new cl0.g();
        gVar.o("type", i17);
        if (str == null) {
            str = "";
        }
        gVar.h("activityid", str);
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        finderLiveStreamStruct.p(r26.i0.t(gVar2, ",", ";", false));
        finderLiveStreamStruct.f57391m = finderLiveStreamStruct.b("Params", "{\"gameappid\":\"" + str2 + "\"}", true);
        finderLiveStreamStruct.k();
        com.tencent.mars.xlog.Log.i("Finder.FinderGameLiveReportUtil", "report21017, " + finderLiveStreamStruct.n() + ' ');
        java.lang.String n17 = finderLiveStreamStruct.n();
        kotlin.jvm.internal.o.f(n17, "toShowString(...)");
        java.lang.String t17 = r26.i0.t(n17, ",", ";", false);
        com.tencent.mars.xlog.Log.i("FinderLivePostReporter", "[reportActionBeforeLive] data = ".concat(t17));
        com.tencent.mm.autogen.mmdata.rpt.AndroidFinderLivePostReportStruct androidFinderLivePostReportStruct = new com.tencent.mm.autogen.mmdata.rpt.AndroidFinderLivePostReportStruct();
        androidFinderLivePostReportStruct.p("21017");
        androidFinderLivePostReportStruct.q(t17);
        androidFinderLivePostReportStruct.k();
    }

    public final void f(int i17, java.lang.String str) {
        com.tencent.mm.autogen.mmdata.rpt.FinderLiveStreamStruct finderLiveStreamStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLiveStreamStruct();
        a(finderLiveStreamStruct);
        ml2.c1 c1Var = ml2.c1.f327325e;
        finderLiveStreamStruct.f57387i = 25L;
        cl0.g gVar = new cl0.g();
        gVar.o("type", i17);
        if (str == null) {
            str = "";
        }
        gVar.h("result", str);
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        finderLiveStreamStruct.p(r26.i0.t(gVar2, ",", ";", false));
        finderLiveStreamStruct.k();
        com.tencent.mars.xlog.Log.i("Finder.FinderGameLiveReportUtil", "report21017, " + finderLiveStreamStruct.n() + ' ');
        java.lang.String n17 = finderLiveStreamStruct.n();
        kotlin.jvm.internal.o.f(n17, "toShowString(...)");
        java.lang.String t17 = r26.i0.t(n17, ",", ";", false);
        com.tencent.mars.xlog.Log.i("FinderLivePostReporter", "[reportActionBeforeLive] data = ".concat(t17));
        com.tencent.mm.autogen.mmdata.rpt.AndroidFinderLivePostReportStruct androidFinderLivePostReportStruct = new com.tencent.mm.autogen.mmdata.rpt.AndroidFinderLivePostReportStruct();
        androidFinderLivePostReportStruct.p("21017");
        androidFinderLivePostReportStruct.q(t17);
        androidFinderLivePostReportStruct.k();
    }
}
