package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class a20 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.b20 f106190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.y0 f106191e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f106192f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$Loader f106193g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f106194h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f106195i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a20(com.tencent.mm.plugin.finder.feed.b20 b20Var, com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var, ym5.s3 s3Var, com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$Loader finderTopicTimelineUIContract$Loader, yz5.l lVar, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(0);
        this.f106190d = b20Var;
        this.f106191e = y0Var;
        this.f106192f = s3Var;
        this.f106193g = finderTopicTimelineUIContract$Loader;
        this.f106194h = lVar;
        this.f106195i = iResponse;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.b20 b20Var = this.f106190d;
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var = this.f106191e;
        ym5.s3 s3Var = this.f106192f;
        b20Var.convertOpToReason(y0Var, s3Var);
        this.f106193g.getDispatcher().g(s3Var);
        yz5.l lVar = this.f106194h;
        if (lVar != null) {
            lVar.invoke(this.f106195i);
        }
        return jz5.f0.f302826a;
    }
}
