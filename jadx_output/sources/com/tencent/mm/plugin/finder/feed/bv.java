package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class bv extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.hv f106416a;

    public bv(com.tencent.mm.plugin.finder.feed.hv hvVar) {
        this.f106416a = hvVar;
    }

    @Override // ym5.q3
    public void b(int i17) {
        this.f106416a.f106955e.onLoadMore();
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.finder.report.v1.o(com.tencent.mm.plugin.finder.report.v1.f125393a, 2, false, null, false, 0L, false, 60, null);
    }

    @Override // ym5.q3
    public void d(int i17, rn5.a aVar, boolean z17) {
        com.tencent.mm.plugin.finder.feed.hv hvVar = this.f106416a;
        hvVar.f106955e.onRefresh();
        if (i17 == 1 && ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.Q0().r()).intValue() == 1) {
            com.tencent.mm.ui.MMActivity context = hvVar.f106954d;
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            if (nyVar != null) {
                i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ((com.tencent.mm.plugin.finder.report.o3) c17).aj(nyVar.V6(), 3, 0);
            }
        }
    }

    @Override // ym5.q3
    public void e(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.finder.feed.hv hvVar = this.f106416a;
        hvVar.f106955e.onRefreshEnd(reason);
        com.tencent.mm.plugin.finder.report.v1 v1Var = com.tencent.mm.plugin.finder.report.v1.f125393a;
        com.tencent.mm.ui.MMActivity activity = hvVar.f106954d;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.report.v1.o(v1Var, 2, false, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), false, 0L, false, 56, null);
    }
}
