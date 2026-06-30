package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class u7 extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.f8 f109143a;

    public u7(com.tencent.mm.plugin.finder.feed.f8 f8Var) {
        this.f109143a = f8Var;
    }

    @Override // ym5.q3
    public void b(int i17) {
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.finder.feed.t7(this.f109143a));
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        yw2.f fVar;
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.finder.feed.f8 f8Var = this.f109143a;
        if (f8Var.f106725v || (fVar = f8Var.f106720q) == null) {
            return;
        }
        com.tencent.mm.view.RefreshLoadMoreLayout.I(fVar.n(), null, 1, null);
    }
}
