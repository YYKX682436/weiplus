package com.tencent.mm.plugin.finder.gallery;

/* loaded from: classes2.dex */
public abstract class v0 extends com.tencent.mm.plugin.finder.feed.a1 {

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.gallery.d f111416u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.tencent.mm.ui.MMActivity context, com.tencent.mm.plugin.finder.gallery.d galleryConfig, int i17) {
        super(context, 0, 0, false, i17, false, 32, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(galleryConfig, "galleryConfig");
        this.f111416u = galleryConfig;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public java.lang.CharSequence B(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public boolean I() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void K(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17) {
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        int a07 = i17 - ((in5.n0) adapter).a0();
        if (a07 < 0 || a07 >= z().f107156e.getSize()) {
            return;
        }
        so2.j5 j5Var = (so2.j5) z().f107156e.getDataListJustForAdapter().get(a07);
        if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
            int i18 = com.tencent.mm.plugin.finder.gallery.FinderGalleryFragment.B;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick ");
            sb6.append(a07);
            sb6.append(" id:");
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
            sb6.append(baseFinderFeed.getFeedObject().getId());
            sb6.append(", pos:");
            sb6.append(a07);
            sb6.append(", field_localFlag:");
            sb6.append(baseFinderFeed.getFeedObject().field_localFlag);
            com.tencent.mars.xlog.Log.i("Finder.FinderGalleryFragment", sb6.toString());
            boolean isPostFinish = baseFinderFeed.getFeedObject().isPostFinish();
            com.tencent.mm.ui.MMActivity mMActivity = this.f106174d;
            if (!isPostFinish) {
                if (baseFinderFeed.getFeedObject().isPostFailed() && baseFinderFeed.getFeedObject().isPostFailedCanRetry()) {
                    ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
                    mv2.f0.f331561a.s(baseFinderFeed.getFeedObject());
                    return;
                } else {
                    if (baseFinderFeed.getFeedObject().isPostFailed()) {
                        return;
                    }
                    db5.t7.g(mMActivity, mMActivity.getString(com.tencent.mm.R.string.exj));
                    return;
                }
            }
            com.tencent.mm.plugin.finder.gallery.d dVar = this.f111416u;
            if (dVar.b()) {
                dVar.c(mMActivity, z().f107156e, a07, this.f106176f);
            } else {
                com.tencent.mm.plugin.finder.gallery.d dVar2 = this.f111416u;
                kotlin.jvm.internal.o.e(mMActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                dVar2.i(mMActivity, this.f106176f, baseFinderFeed, z().f107156e.getListOfType(com.tencent.mm.plugin.finder.model.BaseFinderFeed.class), z().f107156e.getLastBuffer(), false);
            }
            long itemId = j5Var.getItemId();
            boolean z17 = ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().getMediaType() == 2;
            com.tencent.mm.autogen.mmdata.rpt.FinderPickerDataReportStruct finderPickerDataReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderPickerDataReportStruct();
            finderPickerDataReportStruct.q(com.tencent.mm.plugin.finder.gallery.b0.f111351b);
            finderPickerDataReportStruct.f57492e = com.tencent.mm.plugin.finder.gallery.b0.f111352c;
            finderPickerDataReportStruct.f57493f = 2L;
            finderPickerDataReportStruct.p(z17 ? "pic_feed" : "vid_feed");
            finderPickerDataReportStruct.f57495h = com.tencent.mm.plugin.finder.gallery.b0.f111353d;
            finderPickerDataReportStruct.s("{\"feedid\":\"" + pm0.v.u(itemId) + "\"}");
            finderPickerDataReportStruct.r(java.lang.String.valueOf(c01.id.c()));
            finderPickerDataReportStruct.k();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("report");
            sb7.append(22878);
            sb7.append(' ');
            java.lang.String n17 = finderPickerDataReportStruct.n();
            kotlin.jvm.internal.o.f(n17, "toShowString(...)");
            sb7.append(r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false));
            com.tencent.mars.xlog.Log.i("FinderGalleryReportLogic", sb7.toString());
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void M() {
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public boolean S() {
        return this.f106176f == 5;
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f106174d;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void r(java.util.ArrayList data) {
        kotlin.jvm.internal.o.g(data, "data");
        super.r(data);
        if (this.f111416u.d()) {
            android.widget.TextView textView = (android.widget.TextView) l(com.tencent.mm.R.id.dft);
            com.tencent.mm.ui.MMActivity mMActivity = this.f106174d;
            if (textView != null) {
                textView.setTextColor(mMActivity.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3));
            }
            android.widget.TextView textView2 = (android.widget.TextView) l(com.tencent.mm.R.id.m2g);
            if (textView2 != null) {
                textView2.setTextColor(mMActivity.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3));
            }
            android.widget.TextView textView3 = (android.widget.TextView) l(com.tencent.mm.R.id.ili);
            if (textView3 != null) {
                textView3.setTextColor(mMActivity.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3));
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public java.lang.String s(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public android.view.View t() {
        android.view.View l17 = l(com.tencent.mm.R.id.f484229dg3);
        if (l17 instanceof android.view.View) {
            return l17;
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public android.view.View w() {
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public androidx.recyclerview.widget.p2 x() {
        return this.f111416u.e(this.f106176f);
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public androidx.recyclerview.widget.RecyclerView.LayoutManager y(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return this.f111416u.f(context, this.f106176f);
    }
}
