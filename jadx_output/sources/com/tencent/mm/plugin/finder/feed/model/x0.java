package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.y0 f108439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.y0 f108440e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f108441f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f108442g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f108443h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderEmojiListLoader f108444i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.tencent.mm.plugin.finder.feed.model.y0 y0Var, com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var2, ym5.s3 s3Var, yz5.l lVar, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse, com.tencent.mm.plugin.finder.feed.model.FinderEmojiListLoader finderEmojiListLoader) {
        super(0);
        this.f108439d = y0Var;
        this.f108440e = y0Var2;
        this.f108441f = s3Var;
        this.f108442g = lVar;
        this.f108443h = iResponse;
        this.f108444i = finderEmojiListLoader;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.y0 y0Var = this.f108439d;
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var2 = this.f108440e;
        ym5.s3 s3Var = this.f108441f;
        y0Var.convertOpToReason(y0Var2, s3Var);
        yz5.l lVar = this.f108442g;
        if (lVar != null) {
            lVar.invoke(this.f108443h);
        }
        this.f108444i.getDispatcher().g(s3Var);
        return jz5.f0.f302826a;
    }
}
