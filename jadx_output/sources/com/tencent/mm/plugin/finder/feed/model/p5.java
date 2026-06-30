package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class p5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.q5 f108249d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.y0 f108250e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f108251f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderPoiRelateLoader f108252g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f108253h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f108254i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(com.tencent.mm.plugin.finder.feed.model.q5 q5Var, com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var, ym5.s3 s3Var, com.tencent.mm.plugin.finder.feed.model.FinderPoiRelateLoader finderPoiRelateLoader, yz5.l lVar, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(0);
        this.f108249d = q5Var;
        this.f108250e = y0Var;
        this.f108251f = s3Var;
        this.f108252g = finderPoiRelateLoader;
        this.f108253h = lVar;
        this.f108254i = iResponse;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.q5 q5Var = this.f108249d;
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var = this.f108250e;
        ym5.s3 s3Var = this.f108251f;
        q5Var.convertOpToReason(y0Var, s3Var);
        this.f108252g.getDispatcher().g(s3Var);
        yz5.l lVar = this.f108253h;
        if (lVar != null) {
            lVar.invoke(this.f108254i);
        }
        return jz5.f0.f302826a;
    }
}
