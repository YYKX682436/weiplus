package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class oj implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.xj f108662a;

    public oj(com.tencent.mm.plugin.finder.feed.xj xjVar) {
        this.f108662a = xjVar;
    }

    @Override // qn5.c
    public void a(boolean z17) {
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        com.tencent.mm.plugin.finder.feed.tl tlVar = this.f108662a.f111073b;
        com.tencent.mm.ui.MMActivity context = tlVar.f109069d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        com.tencent.mm.plugin.finder.report.r0 a76 = nyVar != null ? nyVar.a7(-1) : null;
        com.tencent.mm.plugin.finder.report.c1 c1Var = a76 instanceof com.tencent.mm.plugin.finder.report.c1 ? (com.tencent.mm.plugin.finder.report.c1) a76 : null;
        if (c1Var != null) {
            pm0.v.O("FinderReporterThread", new com.tencent.mm.plugin.finder.report.z0(c1Var));
        }
        return com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(tlVar.e(), false, 1, null);
    }
}
