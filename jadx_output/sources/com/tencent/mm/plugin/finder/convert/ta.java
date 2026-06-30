package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ta extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f104601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f104602e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104603f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 s0Var) {
        super(0);
        this.f104601d = baseFinderFeed;
        this.f104602e = qeVar;
        this.f104603f = s0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        zy2.m7 feedTipsStatus;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f104601d;
        zy2.n7 n7Var = (baseFinderFeed == null || (feedTipsStatus = baseFinderFeed.getFeedTipsStatus()) == null) ? null : feedTipsStatus.f477477c;
        if (n7Var != null) {
            n7Var.f477484a = true;
        }
        in5.s0 s0Var = this.f104603f;
        java.lang.Object obj = s0Var.f293125i;
        kotlin.jvm.internal.o.f(obj, "getAssociatedObject(...)");
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.msw);
        kotlin.jvm.internal.o.f(p17, "getView(...)");
        this.f104602e.n0(s0Var, (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj, p17, 3);
        return jz5.f0.f302826a;
    }
}
