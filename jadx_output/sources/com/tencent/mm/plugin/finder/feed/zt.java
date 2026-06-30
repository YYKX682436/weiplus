package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class zt extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.fu f111291a;

    public zt(com.tencent.mm.plugin.finder.feed.fu fuVar) {
        this.f111291a = fuVar;
    }

    @Override // ym5.q3
    public void b(int i17) {
        this.f111291a.f106777e.onLoadMore();
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.finder.report.v1.o(com.tencent.mm.plugin.finder.report.v1.f125393a, 2, false, null, false, 0L, false, 60, null);
    }

    @Override // ym5.q3
    public void d(int i17, rn5.a aVar, boolean z17) {
        this.f111291a.f106777e.onRefresh();
    }

    @Override // ym5.q3
    public void e(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.finder.feed.fu fuVar = this.f111291a;
        fuVar.f106777e.onRefreshEnd(reason);
        com.tencent.mm.plugin.finder.report.v1 v1Var = com.tencent.mm.plugin.finder.report.v1.f125393a;
        com.tencent.mm.ui.MMActivity activity = fuVar.f106776d;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.report.v1.o(v1Var, 2, false, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), false, 0L, false, 56, null);
    }
}
