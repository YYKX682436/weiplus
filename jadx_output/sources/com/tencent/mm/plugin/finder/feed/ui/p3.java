package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class p3 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderGallerySearchUI f110394d;

    public p3(com.tencent.mm.plugin.finder.feed.ui.FinderGallerySearchUI finderGallerySearchUI) {
        this.f110394d = finderGallerySearchUI;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        int a07 = i17 - ((in5.n0) adapter).a0();
        if (a07 >= 0) {
            com.tencent.mm.plugin.finder.feed.ui.FinderGallerySearchUI finderGallerySearchUI = this.f110394d;
            if (a07 < finderGallerySearchUI.A.size()) {
                java.util.ArrayList arrayList = finderGallerySearchUI.A;
                so2.j5 j5Var = (so2.j5) kz5.n0.a0(arrayList, a07);
                if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                    int i18 = com.tencent.mm.plugin.finder.gallery.FinderGalleryFragment.B;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick ");
                    sb6.append(a07);
                    sb6.append(" id:");
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
                    sb6.append(baseFinderFeed.getFeedObject().getId());
                    sb6.append(", pos:");
                    sb6.append(a07);
                    com.tencent.mars.xlog.Log.i("Finder.FinderGalleryFragment", sb6.toString());
                    finderGallerySearchUI.a(pm0.v.u(baseFinderFeed.getItemId()), i17, 2);
                    long itemId = baseFinderFeed.getItemId();
                    boolean z17 = baseFinderFeed.getFeedObject().getMediaType() == 2;
                    java.lang.String str = finderGallerySearchUI.f109265w;
                    int i19 = i17 + 1;
                    com.tencent.mm.plugin.finder.gallery.b0.f111354e = str == null ? "" : str;
                    com.tencent.mm.autogen.mmdata.rpt.FinderPickerDataReportStruct finderPickerDataReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderPickerDataReportStruct();
                    finderPickerDataReportStruct.q(com.tencent.mm.plugin.finder.gallery.b0.f111351b);
                    finderPickerDataReportStruct.f57492e = com.tencent.mm.plugin.finder.gallery.b0.f111352c;
                    finderPickerDataReportStruct.f57493f = 5L;
                    finderPickerDataReportStruct.p(z17 ? "pic_feed" : "vid_feed");
                    finderPickerDataReportStruct.f57495h = 6L;
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("{\"feedid\":\"");
                    sb7.append(pm0.v.u(itemId));
                    sb7.append("\";\"feed_position\":\"");
                    sb7.append(i19);
                    sb7.append("\";\"keyword\":\"");
                    if (str == null) {
                        str = "";
                    }
                    sb7.append(str);
                    sb7.append("\"}");
                    finderPickerDataReportStruct.s(sb7.toString());
                    finderPickerDataReportStruct.r(java.lang.String.valueOf(c01.id.c()));
                    finderPickerDataReportStruct.k();
                    java.lang.String n17 = finderPickerDataReportStruct.n();
                    kotlin.jvm.internal.o.f(n17, "toShowString(...)");
                    com.tencent.mars.xlog.Log.i("FinderGalleryReportLogic", "report22878 ".concat(r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false)));
                    if (!finderGallerySearchUI.c7().b()) {
                        finderGallerySearchUI.c7().i(finderGallerySearchUI, finderGallerySearchUI.M, baseFinderFeed, kz5.j0.I(finderGallerySearchUI.A, com.tencent.mm.plugin.finder.model.BaseFinderFeed.class), null, true);
                        return;
                    }
                    android.content.Intent intent = new android.content.Intent();
                    hc2.e0.b(intent, a07, kz5.j0.I(arrayList, com.tencent.mm.plugin.finder.model.BaseFinderFeed.class), finderGallerySearchUI.f109268z, null);
                    i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    ((com.tencent.mm.plugin.finder.assist.i0) c17).Dk(finderGallerySearchUI, intent, finderGallerySearchUI.c7().g(), finderGallerySearchUI.c7().f111360a.f111343b, finderGallerySearchUI.c7().f111360a.f111344c, finderGallerySearchUI.M);
                }
            }
        }
    }
}
