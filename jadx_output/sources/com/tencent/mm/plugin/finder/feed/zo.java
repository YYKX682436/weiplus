package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class zo extends com.tencent.mm.plugin.finder.feed.dj {
    public final com.tencent.mm.plugin.finder.feed.model.l0 A;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI f111284y;

    /* renamed from: z, reason: collision with root package name */
    public final int f111285z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo(com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI activity, boolean z17, java.lang.String username, int i17, int i18, r45.qt2 qt2Var) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(username, "username");
        this.f111284y = activity;
        this.f111285z = i17;
        this.f106427m = Integer.MIN_VALUE;
        com.tencent.mm.ui.MMActivity activity2 = this.f106421d;
        kotlin.jvm.internal.o.g(activity2, "activity");
        this.A = ((com.tencent.mm.plugin.finder.viewmodel.component.w6) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.finder.viewmodel.component.w6.class)).f136307d;
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0, com.tencent.mm.plugin.finder.feed.k8
    public db5.o4 A0(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet, in5.s0 holder) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        kotlin.jvm.internal.o.g(holder, "holder");
        return new com.tencent.mm.plugin.finder.feed.xo(this, feed);
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void C() {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f106570t;
        if (baseFeedLoader != null) {
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(baseFeedLoader, false, 1, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void P() {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f106570t;
        if (baseFeedLoader != null) {
            baseFeedLoader.requestRefresh();
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj
    public void X(com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader model, com.tencent.mm.plugin.finder.feed.gj callback) {
        fc2.c n17;
        kotlin.jvm.internal.o.g(model, "model");
        kotlin.jvm.internal.o.g(callback, "callback");
        super.X(model, callback);
        com.tencent.mm.plugin.finder.feed.yo yoVar = new com.tencent.mm.plugin.finder.feed.yo(this);
        com.tencent.mm.plugin.finder.feed.model.l0 l0Var = this.A;
        l0Var.N0(this.f111285z, this.f106422e, yoVar);
        com.tencent.mm.ui.MMActivity context = this.f106421d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar == null || (n17 = zy2.ra.n1(nyVar, 0, 1, null)) == null) {
            return;
        }
        n17.a(l0Var);
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj, com.tencent.mm.plugin.finder.feed.c0
    public in5.s h() {
        return new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.FinderPreviewTimelineUIContract$Presenter$buildItemCoverts$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == 2) {
                    com.tencent.mm.plugin.finder.feed.zo zoVar = com.tencent.mm.plugin.finder.feed.zo.this;
                    zoVar.getClass();
                    return new com.tencent.mm.plugin.finder.convert.df(zoVar, false, Integer.MIN_VALUE, false, 8, null);
                }
                if (type != 4) {
                    return new com.tencent.mm.plugin.finder.convert.z2();
                }
                com.tencent.mm.plugin.finder.feed.zo zoVar2 = com.tencent.mm.plugin.finder.feed.zo.this;
                cw2.f8 f8Var = zoVar2.f106429o;
                zoVar2.getClass();
                return new com.tencent.mm.plugin.finder.convert.bh(f8Var, zoVar2, false, Integer.MIN_VALUE, false, 16, null);
            }
        };
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj, com.tencent.mm.plugin.finder.feed.c0, fs2.a
    public void onDetach() {
        fc2.c n17;
        com.tencent.mm.plugin.finder.feed.model.l0 l0Var = this.A;
        l0Var.onDetach();
        com.tencent.mm.ui.MMActivity context = this.f106421d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar != null && (n17 = zy2.ra.n1(nyVar, 0, 1, null)) != null) {
            n17.d(l0Var);
        }
        super.onDetach();
    }
}
