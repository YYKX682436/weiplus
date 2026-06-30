package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class j6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.k6 f108086d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.y0 f108087e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f108088f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader f108089g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f108090h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f108091i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(com.tencent.mm.plugin.finder.feed.model.k6 k6Var, com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var, ym5.s3 s3Var, com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader finderProfileDraftLoader, yz5.l lVar, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(0);
        this.f108086d = k6Var;
        this.f108087e = y0Var;
        this.f108088f = s3Var;
        this.f108089g = finderProfileDraftLoader;
        this.f108090h = lVar;
        this.f108091i = iResponse;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.k6 k6Var = this.f108086d;
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var = this.f108087e;
        ym5.s3 s3Var = this.f108088f;
        k6Var.convertOpToReason(y0Var, s3Var);
        this.f108089g.getDispatcher().g(s3Var);
        yz5.l lVar = this.f108090h;
        if (lVar != null) {
            lVar.invoke(this.f108091i);
        }
        return jz5.f0.f302826a;
    }
}
