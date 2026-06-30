package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class s8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.u8 f108333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.y0 f108334e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f108335f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader f108336g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f108337h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f108338i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(com.tencent.mm.plugin.finder.feed.model.u8 u8Var, com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var, ym5.s3 s3Var, com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader, yz5.l lVar, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(0);
        this.f108333d = u8Var;
        this.f108334e = y0Var;
        this.f108335f = s3Var;
        this.f108336g = finderTimelineFeedLoader;
        this.f108337h = lVar;
        this.f108338i = iResponse;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.u8 u8Var = this.f108333d;
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var = this.f108334e;
        ym5.s3 s3Var = this.f108335f;
        u8Var.convertOpToReason(y0Var, s3Var);
        com.tencent.mm.plugin.finder.feed.model.internal.j0.f(this.f108336g.getDispatcher(), s3Var, false, 2, null);
        yz5.l lVar = this.f108337h;
        if (lVar != null) {
            lVar.invoke(this.f108338i);
        }
        return jz5.f0.f302826a;
    }
}
