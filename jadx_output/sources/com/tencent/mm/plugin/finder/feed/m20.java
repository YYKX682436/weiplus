package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class m20 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.n20 f107345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.y0 f107346e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f107347f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$RelativeLoader f107348g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f107349h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f107350i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m20(com.tencent.mm.plugin.finder.feed.n20 n20Var, com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var, ym5.s3 s3Var, com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$RelativeLoader finderTopicTimelineUIContract$RelativeLoader, yz5.l lVar, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(0);
        this.f107345d = n20Var;
        this.f107346e = y0Var;
        this.f107347f = s3Var;
        this.f107348g = finderTopicTimelineUIContract$RelativeLoader;
        this.f107349h = lVar;
        this.f107350i = iResponse;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.n20 n20Var = this.f107345d;
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var = this.f107346e;
        ym5.s3 s3Var = this.f107347f;
        n20Var.convertOpToReason(y0Var, s3Var);
        this.f107348g.getDispatcher().g(s3Var);
        yz5.l lVar = this.f107349h;
        if (lVar != null) {
            lVar.invoke(this.f107350i);
        }
        return jz5.f0.f302826a;
    }
}
