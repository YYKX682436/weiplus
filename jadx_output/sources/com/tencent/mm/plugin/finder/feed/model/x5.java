package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class x5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.y5 f108450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.y0 f108451e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f108452f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderPostPlayLoader f108453g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f108454h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f108455i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(com.tencent.mm.plugin.finder.feed.model.y5 y5Var, com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var, ym5.s3 s3Var, com.tencent.mm.plugin.finder.feed.model.FinderPostPlayLoader finderPostPlayLoader, yz5.l lVar, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(0);
        this.f108450d = y5Var;
        this.f108451e = y0Var;
        this.f108452f = s3Var;
        this.f108453g = finderPostPlayLoader;
        this.f108454h = lVar;
        this.f108455i = iResponse;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.y5 y5Var = this.f108450d;
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var = this.f108451e;
        ym5.s3 s3Var = this.f108452f;
        y5Var.convertOpToReason(y0Var, s3Var);
        this.f108453g.getDispatcher().g(s3Var);
        yz5.l lVar = this.f108454h;
        if (lVar != null) {
            lVar.invoke(this.f108455i);
        }
        return jz5.f0.f302826a;
    }
}
