package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class t2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.u2 f108357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.y0 f108358e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f108359f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderLbsLoader f108360g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f108361h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f108362i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(com.tencent.mm.plugin.finder.feed.model.u2 u2Var, com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var, ym5.s3 s3Var, com.tencent.mm.plugin.finder.feed.model.FinderLbsLoader finderLbsLoader, yz5.l lVar, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(0);
        this.f108357d = u2Var;
        this.f108358e = y0Var;
        this.f108359f = s3Var;
        this.f108360g = finderLbsLoader;
        this.f108361h = lVar;
        this.f108362i = iResponse;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.u2 u2Var = this.f108357d;
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var = this.f108358e;
        ym5.s3 s3Var = this.f108359f;
        u2Var.convertOpToReason(y0Var, s3Var);
        this.f108360g.getDispatcher().g(s3Var);
        yz5.l lVar = this.f108361h;
        if (lVar != null) {
            lVar.invoke(this.f108362i);
        }
        return jz5.f0.f302826a;
    }
}
