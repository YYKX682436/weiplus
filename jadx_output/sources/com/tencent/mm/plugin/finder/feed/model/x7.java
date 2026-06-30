package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class x7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.y7 f108456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.y0 f108457e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f108458f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderSelfHistoryLoader f108459g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f108460h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f108461i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(com.tencent.mm.plugin.finder.feed.model.y7 y7Var, com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var, ym5.s3 s3Var, com.tencent.mm.plugin.finder.feed.model.FinderSelfHistoryLoader finderSelfHistoryLoader, yz5.l lVar, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(0);
        this.f108456d = y7Var;
        this.f108457e = y0Var;
        this.f108458f = s3Var;
        this.f108459g = finderSelfHistoryLoader;
        this.f108460h = lVar;
        this.f108461i = iResponse;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.y7 y7Var = this.f108456d;
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var = this.f108457e;
        ym5.s3 s3Var = this.f108458f;
        y7Var.convertOpToReason(y0Var, s3Var);
        this.f108459g.getDispatcher().g(s3Var);
        yz5.l lVar = this.f108460h;
        if (lVar != null) {
            lVar.invoke(this.f108461i);
        }
        return jz5.f0.f302826a;
    }
}
