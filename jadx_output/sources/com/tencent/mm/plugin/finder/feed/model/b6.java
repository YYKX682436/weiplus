package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class b6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.c6 f107731d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.y0 f107732e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f107733f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderPostPlaySquareContainerLoader f107734g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f107735h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f107736i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(com.tencent.mm.plugin.finder.feed.model.c6 c6Var, com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var, ym5.s3 s3Var, com.tencent.mm.plugin.finder.feed.model.FinderPostPlaySquareContainerLoader finderPostPlaySquareContainerLoader, yz5.l lVar, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(0);
        this.f107731d = c6Var;
        this.f107732e = y0Var;
        this.f107733f = s3Var;
        this.f107734g = finderPostPlaySquareContainerLoader;
        this.f107735h = lVar;
        this.f107736i = iResponse;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.c6 c6Var = this.f107731d;
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var = this.f107732e;
        ym5.s3 s3Var = this.f107733f;
        c6Var.convertOpToReason(y0Var, s3Var);
        this.f107734g.getDispatcher().g(s3Var);
        yz5.l lVar = this.f107735h;
        if (lVar != null) {
            lVar.invoke(this.f107736i);
        }
        return jz5.f0.f302826a;
    }
}
