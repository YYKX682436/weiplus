package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class g4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.h4 f107880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.y0 f107881e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f107882f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f107883g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f107884h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderMemberAllFeedLoader f107885i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(com.tencent.mm.plugin.finder.feed.model.h4 h4Var, com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var, ym5.s3 s3Var, yz5.l lVar, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse, com.tencent.mm.plugin.finder.feed.model.FinderMemberAllFeedLoader finderMemberAllFeedLoader) {
        super(0);
        this.f107880d = h4Var;
        this.f107881e = y0Var;
        this.f107882f = s3Var;
        this.f107883g = lVar;
        this.f107884h = iResponse;
        this.f107885i = finderMemberAllFeedLoader;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.h4 h4Var = this.f107880d;
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var = this.f107881e;
        ym5.s3 s3Var = this.f107882f;
        h4Var.convertOpToReason(y0Var, s3Var);
        yz5.l lVar = this.f107883g;
        if (lVar != null) {
            lVar.invoke(this.f107884h);
        }
        this.f107885i.getDispatcher().g(s3Var);
        return jz5.f0.f302826a;
    }
}
