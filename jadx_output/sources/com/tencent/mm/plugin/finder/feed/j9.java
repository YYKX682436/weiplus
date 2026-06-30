package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class j9 extends com.tencent.mm.plugin.finder.feed.dj {
    public final com.tencent.mm.plugin.finder.feed.model.l0 A;
    public final zy2.h8 B;
    public final ey2.m2 C;

    /* renamed from: y, reason: collision with root package name */
    public final long f107090y;

    /* renamed from: z, reason: collision with root package name */
    public final int f107091z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9(com.tencent.mm.ui.MMActivity context, long j17, int i17) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f107090y = j17;
        this.f107091z = i17;
        pf5.u uVar = pf5.u.f353936a;
        this.A = ((com.tencent.mm.plugin.finder.viewmodel.component.w6) uVar.c(context).a(com.tencent.mm.plugin.finder.viewmodel.component.w6.class)).f136307d;
        this.B = ((te2.e4) ((zy2.g8) uVar.c(context).c(zy2.g8.class))).f417974d;
        androidx.lifecycle.c1 a17 = uVar.e(c61.l7.class).a(ey2.m2.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        this.C = (ey2.m2) a17;
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
        fc2.c n18;
        kotlin.jvm.internal.o.g(model, "model");
        kotlin.jvm.internal.o.g(callback, "callback");
        super.X(model, callback);
        com.tencent.mm.plugin.finder.feed.h9 h9Var = new com.tencent.mm.plugin.finder.feed.h9(this);
        com.tencent.mm.plugin.finder.feed.model.l0 l0Var = this.A;
        l0Var.N0(this.f107091z, this.f106422e, h9Var);
        com.tencent.mm.ui.MMActivity context = this.f106421d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar != null && (n18 = zy2.ra.n1(nyVar, 0, 1, null)) != null) {
            n18.a(l0Var);
        }
        zy2.h8 h8Var = this.B;
        com.tencent.mm.plugin.finder.feed.i9 i9Var = new com.tencent.mm.plugin.finder.feed.i9(this);
        com.tencent.mm.plugin.finder.feed.i0 i0Var = this.f106424g;
        ((com.tencent.mm.plugin.finder.feed.model.s3) h8Var).N0(i9Var, i0Var != null ? i0Var.getRecyclerView() : null);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar2 == null || (n17 = zy2.ra.n1(nyVar2, 0, 1, null)) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.feed.model.s3 s3Var = (com.tencent.mm.plugin.finder.feed.model.s3) h8Var;
        s3Var.getClass();
        n17.a(s3Var);
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj, com.tencent.mm.plugin.finder.feed.c0, fs2.a
    public void onDetach() {
        java.util.ArrayList arrayList;
        fc2.c n17;
        fc2.c n18;
        com.tencent.mm.plugin.finder.feed.model.l0 l0Var = this.A;
        l0Var.onDetach();
        java.lang.String key = java.lang.String.valueOf(this.f107090y);
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f106570t;
        if (baseFeedLoader == null || (arrayList = baseFeedLoader.getDataListJustForAdapter()) == null) {
            arrayList = new java.util.ArrayList();
        }
        ey2.m2 m2Var = this.C;
        m2Var.getClass();
        kotlin.jvm.internal.o.g(key, "key");
        com.tencent.mars.xlog.Log.i("Finder.TimelineCacheVM", "[store] key=" + key + " lastExitPosition=0 lastExitFromTopPx=0 lastDataList size=" + arrayList.size() + " current=" + k35.m1.d(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, java.lang.System.currentTimeMillis() / 1000));
        ey2.l2 l2Var = new ey2.l2(key);
        java.lang.System.currentTimeMillis();
        m2Var.f257431e.a(key, l2Var);
        com.tencent.mm.ui.MMActivity context = this.f106421d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar != null && (n18 = zy2.ra.n1(nyVar, 0, 1, null)) != null) {
            n18.d(l0Var);
        }
        zy2.h8 h8Var = this.B;
        ((com.tencent.mm.plugin.finder.feed.model.s3) h8Var).onDetach();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar2 != null && (n17 = zy2.ra.n1(nyVar2, 0, 1, null)) != null) {
            com.tencent.mm.plugin.finder.feed.model.s3 s3Var = (com.tencent.mm.plugin.finder.feed.model.s3) h8Var;
            s3Var.getClass();
            n17.d(s3Var);
        }
        super.onDetach();
    }
}
