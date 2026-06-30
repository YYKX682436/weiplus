package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class os extends com.tencent.mm.plugin.finder.feed.dj {
    public int A;
    public yz5.l B;
    public yz5.a C;
    public com.tencent.mm.plugin.finder.model.BaseFinderFeed D;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f108677y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f108678z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os(com.tencent.mm.ui.MMActivity context, boolean z17) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f108677y = z17;
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void C() {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f106570t;
        if (baseFeedLoader != null) {
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(baseFeedLoader, false, 1, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void G(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.finder.feed.i0 i0Var = this.f106424g;
        if (i0Var instanceof com.tencent.mm.plugin.finder.feed.ps) {
            kotlin.jvm.internal.o.e(i0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderRingtoneTimelineContract.ViewCallback");
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void P() {
        if (this.f108677y || this.D != null) {
            yz5.a aVar = this.C;
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f106570t;
        if (baseFeedLoader != null) {
            baseFeedLoader.requestRefresh();
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj
    public void X(com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader model, com.tencent.mm.plugin.finder.feed.gj callback) {
        kotlin.jvm.internal.o.g(model, "model");
        kotlin.jvm.internal.o.g(callback, "callback");
        super.X(model, callback);
        com.tencent.mm.plugin.finder.feed.i0 i0Var = this.f106424g;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter a17 = i0Var != null ? i0Var.a() : null;
        if (a17 == null) {
            return;
        }
        a17.F = new com.tencent.mm.plugin.finder.feed.ns(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj, com.tencent.mm.plugin.finder.feed.c0
    public in5.s h() {
        return new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.FinderRingtoneTimelineContract$Presenter$buildItemCoverts$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type != 4) {
                    hc2.l.a(com.tencent.mm.plugin.finder.feed.os.this.f106569s, type);
                    return new com.tencent.mm.plugin.finder.convert.z2();
                }
                com.tencent.mm.plugin.finder.feed.os osVar = com.tencent.mm.plugin.finder.feed.os.this;
                cw2.f8 f8Var = osVar.f106429o;
                osVar.getClass();
                return new com.tencent.mm.plugin.finder.feed.ms(com.tencent.mm.plugin.finder.feed.os.this, f8Var, false, com.tencent.mm.plugin.finder.feed.os.this.f106427m);
            }
        };
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void onRefreshEnd(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        yz5.a aVar = this.C;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
