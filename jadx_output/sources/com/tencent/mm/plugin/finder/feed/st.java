package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class st extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f109007d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.yt f109008e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public st(boolean z17, com.tencent.mm.plugin.finder.feed.yt ytVar) {
        super(0);
        this.f109007d = z17;
        this.f109008e = ytVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f109007d;
        com.tencent.mm.plugin.finder.feed.yt ytVar = this.f109008e;
        if (z17) {
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).qj(ytVar.f111197d, 6);
            ytVar.g().requestRefresh();
        } else {
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).qj(ytVar.f111197d, 7);
            com.tencent.mm.view.RefreshLoadMoreLayout f17 = ytVar.h().f();
            if (f17 != null) {
                f17.postDelayed(new com.tencent.mm.plugin.finder.feed.rt(ytVar), 200L);
            }
        }
        return jz5.f0.f302826a;
    }
}
