package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class t7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.u7 f108367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.y0 f108368e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f108369f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderRingtoneTimelineLoader f108370g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f108371h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f108372i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(com.tencent.mm.plugin.finder.feed.model.u7 u7Var, com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var, ym5.s3 s3Var, com.tencent.mm.plugin.finder.feed.model.FinderRingtoneTimelineLoader finderRingtoneTimelineLoader, yz5.l lVar, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(0);
        this.f108367d = u7Var;
        this.f108368e = y0Var;
        this.f108369f = s3Var;
        this.f108370g = finderRingtoneTimelineLoader;
        this.f108371h = lVar;
        this.f108372i = iResponse;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.u7 u7Var = this.f108367d;
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var = this.f108368e;
        ym5.s3 s3Var = this.f108369f;
        u7Var.convertOpToReason(y0Var, s3Var);
        this.f108370g.getDispatcher().g(s3Var);
        yz5.l lVar = this.f108371h;
        if (lVar != null) {
            lVar.invoke(this.f108372i);
        }
        return jz5.f0.f302826a;
    }
}
