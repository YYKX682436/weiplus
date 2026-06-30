package com.tencent.mm.plugin.finder.gallery;

/* loaded from: classes2.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.gallery.b0 f111350a = new com.tencent.mm.plugin.finder.gallery.b0();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f111351b = "";

    /* renamed from: c, reason: collision with root package name */
    public static long f111352c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static long f111353d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f111354e = "";

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
        com.tencent.mm.autogen.mmdata.rpt.FinderPickerDataReportStruct finderPickerDataReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderPickerDataReportStruct();
        finderPickerDataReportStruct.q(f111351b);
        finderPickerDataReportStruct.f57492e = f111352c;
        finderPickerDataReportStruct.f57493f = 2L;
        finderPickerDataReportStruct.p("prev_done");
        finderPickerDataReportStruct.f57495h = f111353d;
        finderPickerDataReportStruct.s("{\"feedid\":\"" + pm0.v.u(j17) + "\"}");
        finderPickerDataReportStruct.r(java.lang.String.valueOf(c01.id.c()));
        finderPickerDataReportStruct.k();
        h(finderPickerDataReportStruct);
    }

    public final void d(long j17, int i17, int i18, java.lang.String keyword) {
        kotlin.jvm.internal.o.g(keyword, "keyword");
        com.tencent.mm.autogen.mmdata.rpt.FinderPickerDataReportStruct finderPickerDataReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderPickerDataReportStruct();
        finderPickerDataReportStruct.q(f111351b);
        finderPickerDataReportStruct.f57492e = f111352c;
        finderPickerDataReportStruct.f57493f = 4L;
        finderPickerDataReportStruct.p("feed_exposure");
        finderPickerDataReportStruct.f57495h = b(i17);
        if (i18 > 0) {
            finderPickerDataReportStruct.s("{\"feedid\":\"" + pm0.v.u(j17) + "\";\"feed_position\":\"" + i18 + "\";\"keyword\":\"" + keyword + "\"}");
        } else {
            finderPickerDataReportStruct.s("{\"feedid\":\"" + pm0.v.u(j17) + "\"}");
        }
        finderPickerDataReportStruct.r(java.lang.String.valueOf(c01.id.c()));
        finderPickerDataReportStruct.k();
        h(finderPickerDataReportStruct);
    }

    public final void e(long j17) {
        com.tencent.mm.autogen.mmdata.rpt.FinderPickerDataReportStruct finderPickerDataReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderPickerDataReportStruct();
        finderPickerDataReportStruct.q(f111351b);
        finderPickerDataReportStruct.f57492e = f111352c;
        finderPickerDataReportStruct.f57493f = 2L;
        finderPickerDataReportStruct.p("prev_return");
        finderPickerDataReportStruct.f57495h = f111353d;
        finderPickerDataReportStruct.s("{\"feedid\":\"" + pm0.v.u(j17) + "\"}");
        finderPickerDataReportStruct.r(java.lang.String.valueOf(c01.id.c()));
        finderPickerDataReportStruct.k();
        h(finderPickerDataReportStruct);
    }

    public final void f(long j17) {
        com.tencent.mm.autogen.mmdata.rpt.FinderPickerDataReportStruct finderPickerDataReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderPickerDataReportStruct();
        finderPickerDataReportStruct.q(f111351b);
        finderPickerDataReportStruct.f57492e = f111352c;
        finderPickerDataReportStruct.f57493f = 2L;
        finderPickerDataReportStruct.p("prev_done");
        finderPickerDataReportStruct.f57495h = 6L;
        finderPickerDataReportStruct.s("{\"feedid\":\"" + pm0.v.u(j17) + "\";\"keyword\":\"" + f111354e + "\"}");
        finderPickerDataReportStruct.r(java.lang.String.valueOf(c01.id.c()));
        finderPickerDataReportStruct.k();
        h(finderPickerDataReportStruct);
    }

    public final void g(long j17) {
        com.tencent.mm.autogen.mmdata.rpt.FinderPickerDataReportStruct finderPickerDataReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderPickerDataReportStruct();
        finderPickerDataReportStruct.q(f111351b);
        finderPickerDataReportStruct.f57492e = f111352c;
        finderPickerDataReportStruct.f57493f = 2L;
        finderPickerDataReportStruct.p("prev_return");
        finderPickerDataReportStruct.f57495h = 6L;
        finderPickerDataReportStruct.s("{\"feedid\":\"" + pm0.v.u(j17) + "\";\"keyword\":\"" + f111354e + "\"}");
        finderPickerDataReportStruct.r(java.lang.String.valueOf(c01.id.c()));
        finderPickerDataReportStruct.k();
        h(finderPickerDataReportStruct);
    }

    public final void h(jx3.a struct) {
        kotlin.jvm.internal.o.g(struct, "struct");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report");
        sb6.append(struct.g());
        sb6.append(' ');
        java.lang.String n17 = struct.n();
        kotlin.jvm.internal.o.f(n17, "toShowString(...)");
        sb6.append(r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false));
        com.tencent.mars.xlog.Log.i("FinderGalleryReportLogic", sb6.toString());
    }
}
