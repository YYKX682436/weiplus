package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class h2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.i2 f107906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.y0 f107907e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f107908f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderFriendLikeLoader f107909g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f107910h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f107911i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(com.tencent.mm.plugin.finder.feed.model.i2 i2Var, com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var, ym5.s3 s3Var, com.tencent.mm.plugin.finder.feed.model.FinderFriendLikeLoader finderFriendLikeLoader, yz5.l lVar, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(0);
        this.f107906d = i2Var;
        this.f107907e = y0Var;
        this.f107908f = s3Var;
        this.f107909g = finderFriendLikeLoader;
        this.f107910h = lVar;
        this.f107911i = iResponse;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.i2 i2Var = this.f107906d;
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var = this.f107907e;
        ym5.s3 s3Var = this.f107908f;
        i2Var.convertOpToReason(y0Var, s3Var);
        com.tencent.mm.plugin.finder.feed.model.FinderFriendLikeLoader finderFriendLikeLoader = this.f107909g;
        finderFriendLikeLoader.getDispatcher().a();
        finderFriendLikeLoader.getDispatcher().g(s3Var);
        yz5.l lVar = this.f107910h;
        if (lVar != null) {
            lVar.invoke(this.f107911i);
        }
        return jz5.f0.f302826a;
    }
}
