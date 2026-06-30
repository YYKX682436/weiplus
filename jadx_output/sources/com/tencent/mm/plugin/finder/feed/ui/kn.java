package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class kn extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f110244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI f110245e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn(com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse, com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI finderTopicTimelineUI) {
        super(0);
        this.f110244d = iResponse;
        this.f110245e = finderTopicTimelineUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (!this.f110244d.getHasMore()) {
            com.tencent.mm.plugin.finder.feed.v20 v20Var = this.f110245e.E;
            if (v20Var == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            v20Var.o().setEnableRefresh(false);
        }
        return jz5.f0.f302826a;
    }
}
