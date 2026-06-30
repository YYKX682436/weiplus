package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class us extends com.tencent.mm.plugin.finder.feed.q9 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us(com.tencent.mm.ui.MMActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.plugin.finder.feed.q9
    public void a(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f108810h = recyclerView;
    }

    @Override // com.tencent.mm.plugin.finder.feed.q9
    public void b(fc2.t ev6) {
        in5.s0 s0Var;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(ev6, "ev");
        if (ev6.f260996o != null) {
            com.tencent.mars.xlog.Log.i("Finder.SingleFeedReport", "onCenterFeedChange: ".concat(pm0.v.u(ev6.f260992k)));
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f108810h;
            androidx.recyclerview.widget.f2 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
            com.tencent.mm.ui.MMActivity context = this.f108803a;
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            int i17 = nyVar != null ? nyVar.f135380n : 0;
            if (i17 == 6 || i17 == 23 || wxRecyclerAdapter == null || (s0Var = (in5.s0) in5.n0.Y(wxRecyclerAdapter, ev6.f260992k, false, 2, null)) == null || (obj = s0Var.f293125i) == null) {
                return;
            }
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
            if (baseFinderFeed != null) {
                r45.im2 hotWordInfo = baseFinderFeed.getFeedObject().getFinderObject().getHotWordInfo();
                if ((hotWordInfo != null ? (r45.lu2) hotWordInfo.getCustom(0) : null) != null) {
                    r45.lu2 lu2Var = (r45.lu2) hotWordInfo.getCustom(0);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(lu2Var != null ? lu2Var.getString(0) : null)) {
                        return;
                    }
                    cl0.g gVar = new cl0.g();
                    gVar.h("feedid", pm0.v.u(ev6.f260992k));
                    r45.lu2 lu2Var2 = (r45.lu2) hotWordInfo.getCustom(0);
                    gVar.h("query_word", lu2Var2 != null ? lu2Var2.getString(0) : null);
                    i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
                    java.lang.String gVar2 = gVar.toString();
                    kotlin.jvm.internal.o.f(gVar2, "toString(...)");
                    java.lang.String t17 = r26.i0.t(gVar2, ",", ";", false);
                    kotlin.jvm.internal.o.g(context, "context");
                    com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                    com.tencent.mm.plugin.finder.report.o3.ij(o3Var, 0, "hotsearch_timelinespot", t17, nyVar2 != null ? nyVar2.V6() : null, null, 16, null);
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.q9
    public void c() {
        this.f108810h = null;
    }
}
