package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class y1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.ActivityFeedRemoveEvent f111137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.c2 f111138e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(com.tencent.mm.autogen.events.ActivityFeedRemoveEvent activityFeedRemoveEvent, com.tencent.mm.plugin.finder.feed.c2 c2Var) {
        super(0);
        this.f111137d = activityFeedRemoveEvent;
        this.f111138e = c2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        am.f fVar = this.f111137d.f53966g;
        long j17 = fVar.f6619a;
        com.tencent.mm.plugin.finder.feed.c2 c2Var = this.f111138e;
        if (j17 != 0) {
            ir2.y.X1(c2Var.f106613e, j17, false, 2, null);
        } else {
            ir2.y.W3(c2Var.f106613e, new ir2.e(0, 0L, fVar.f6620b, 3, null), false, 2, null);
        }
        return jz5.f0.f302826a;
    }
}
