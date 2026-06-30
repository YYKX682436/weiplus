package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class qu extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f108850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.zu f108851e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu(boolean z17, com.tencent.mm.plugin.finder.feed.zu zuVar) {
        super(0);
        this.f108850d = z17;
        this.f108851e = zuVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f108850d;
        com.tencent.mm.plugin.finder.feed.zu zuVar = this.f108851e;
        if (z17) {
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).qj(zuVar.f111292d, 6);
            zuVar.f111297i.requestRefresh();
        } else {
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).qj(zuVar.f111292d, 7);
            com.tencent.mm.view.RefreshLoadMoreLayout f17 = zuVar.g().f();
            if (f17 != null) {
                f17.postDelayed(new com.tencent.mm.plugin.finder.feed.pu(zuVar), 200L);
            }
        }
        return jz5.f0.f302826a;
    }
}
