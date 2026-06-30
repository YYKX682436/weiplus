package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class on extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f110384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f110385e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI f110386f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on(boolean z17, long j17, com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI finderTopicTimelineUI) {
        super(1);
        this.f110384d = z17;
        this.f110385e = j17;
        this.f110386f = finderTopicTimelineUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List incrementList;
        so2.j5 j5Var;
        r45.vx0 vx0Var;
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse it = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (this.f110384d && it.getPullType() == 0) {
            long j17 = this.f110385e;
            if (j17 != 0 && (incrementList = it.getIncrementList()) != null && (j5Var = (so2.j5) kz5.n0.Z(incrementList)) != null && (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed)) {
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
                if (baseFinderFeed.getFeedObject().getId() == j17) {
                    r45.dm2 object_extend = baseFinderFeed.getFeedObject().getFeedObject().getObject_extend();
                    java.lang.Integer valueOf = (object_extend == null || (vx0Var = (r45.vx0) object_extend.getCustom(0)) == null) ? null : java.lang.Integer.valueOf(vx0Var.getInteger(6));
                    cu2.g0 g0Var = cu2.g0.f222404a;
                    com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI finderTopicTimelineUI = this.f110386f;
                    com.tencent.mm.plugin.finder.storage.ak0 b17 = g0Var.b(finderTopicTimelineUI.I);
                    if (valueOf != null && valueOf.intValue() != 0 && b17 != null) {
                        pm0.v.X(new com.tencent.mm.plugin.finder.feed.ui.nn(b17, finderTopicTimelineUI, valueOf));
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
