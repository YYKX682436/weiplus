package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class i7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.j7 f107944d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.y0 f107945e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f107946f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderRecommendReasonLoader f107947g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f107948h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f107949i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(com.tencent.mm.plugin.finder.feed.model.j7 j7Var, com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var, ym5.s3 s3Var, com.tencent.mm.plugin.finder.feed.model.FinderRecommendReasonLoader finderRecommendReasonLoader, yz5.l lVar, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(0);
        this.f107944d = j7Var;
        this.f107945e = y0Var;
        this.f107946f = s3Var;
        this.f107947g = finderRecommendReasonLoader;
        this.f107948h = lVar;
        this.f107949i = iResponse;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.j7 j7Var = this.f107944d;
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var = this.f107945e;
        ym5.s3 s3Var = this.f107946f;
        j7Var.convertOpToReason(y0Var, s3Var);
        this.f107947g.getDispatcher().g(s3Var);
        yz5.l lVar = this.f107948h;
        if (lVar != null) {
            lVar.invoke(this.f107949i);
        }
        return jz5.f0.f302826a;
    }
}
