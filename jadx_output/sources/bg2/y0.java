package bg2;

/* loaded from: classes3.dex */
public final class y0 extends tc2.c implements tc2.h {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f20659e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(tc2.g store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f20659e = "LiveConvertExptReportController";
    }

    public final void Y6(long j17, long j18, java.lang.String componentExtra) {
        kotlin.jvm.internal.o.g(componentExtra, "componentExtra");
        tc2.g gVar = this.f417141d;
        in5.s0 s0Var = gVar.f417149i;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = gVar.f417148h;
        if (s0Var == null || baseFinderFeed == null) {
            return;
        }
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        zy2.ra Sj = ((c61.p2) ybVar).Sj(context);
        java.lang.String valueOf = java.lang.String.valueOf(Sj != null ? java.lang.Integer.valueOf(((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj).f135380n) : null);
        zy2.ra Sj2 = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(context);
        java.lang.String str = Sj2 != null ? ((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj2).f135382p : null;
        java.lang.String u17 = pm0.v.u(baseFinderFeed.getItemId());
        r45.nw1 liveInfo = baseFinderFeed.getFeedObject().getLiveInfo();
        java.lang.String u18 = pm0.v.u(liveInfo != null ? liveInfo.getLong(0) : 0L);
        long c17 = c01.id.c();
        bg2.d2 d2Var = (bg2.d2) N6(bg2.d2.class);
        long j19 = (c17 - (d2Var != null ? d2Var.f20022u : 0L)) - j18;
        com.tencent.mars.xlog.Log.i(this.f20659e, "reportUIExposeCostTime componentType:" + j17 + ", totalDelay:" + j18 + ", cost:" + j19 + ", componentExtra:" + componentExtra);
        com.tencent.mm.autogen.mmdata.rpt.FinderLiveUIComponentLoadingTimeStruct finderLiveUIComponentLoadingTimeStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLiveUIComponentLoadingTimeStruct();
        finderLiveUIComponentLoadingTimeStruct.f57404d = finderLiveUIComponentLoadingTimeStruct.b("CommentScene", valueOf, true);
        finderLiveUIComponentLoadingTimeStruct.f57405e = finderLiveUIComponentLoadingTimeStruct.b("ContextID", str, true);
        finderLiveUIComponentLoadingTimeStruct.f57406f = finderLiveUIComponentLoadingTimeStruct.b("FeedID", u17, true);
        finderLiveUIComponentLoadingTimeStruct.f57407g = finderLiveUIComponentLoadingTimeStruct.b("LiveID", u18, true);
        finderLiveUIComponentLoadingTimeStruct.f57408h = j17;
        finderLiveUIComponentLoadingTimeStruct.f57409i = j19;
        finderLiveUIComponentLoadingTimeStruct.f57410j = finderLiveUIComponentLoadingTimeStruct.b("ComponentExtra", componentExtra, true);
        finderLiveUIComponentLoadingTimeStruct.k();
    }
}
