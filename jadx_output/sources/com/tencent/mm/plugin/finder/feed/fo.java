package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class fo extends com.tencent.mm.plugin.finder.feed.dj {
    public final zy2.h8 A;

    /* renamed from: y, reason: collision with root package name */
    public final int f106768y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.l0 f106769z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo(com.tencent.mm.ui.MMActivity context, int i17) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f106768y = i17;
        this.f106769z = ((com.tencent.mm.plugin.finder.viewmodel.component.w6) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.w6.class)).f136307d;
        this.A = ((te2.e4) ((zy2.g8) pf5.z.f353948a.a(context).c(zy2.g8.class))).f417974d;
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
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj
    public void X(com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader model, com.tencent.mm.plugin.finder.feed.gj callback) {
        fc2.c n17;
        fc2.c n18;
        kotlin.jvm.internal.o.g(model, "model");
        kotlin.jvm.internal.o.g(callback, "callback");
        super.X(model, callback);
        com.tencent.mm.plugin.finder.feed.Cdo cdo = new com.tencent.mm.plugin.finder.feed.Cdo(this);
        com.tencent.mm.plugin.finder.feed.model.l0 l0Var = this.f106769z;
        l0Var.N0(this.f106768y, this.f106422e, cdo);
        com.tencent.mm.ui.MMActivity context = this.f106421d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar != null && (n18 = zy2.ra.n1(nyVar, 0, 1, null)) != null) {
            n18.a(l0Var);
        }
        zy2.h8 h8Var = this.A;
        com.tencent.mm.plugin.finder.feed.eo eoVar = new com.tencent.mm.plugin.finder.feed.eo(this);
        com.tencent.mm.plugin.finder.feed.i0 i0Var = this.f106424g;
        ((com.tencent.mm.plugin.finder.feed.model.s3) h8Var).N0(eoVar, i0Var != null ? i0Var.getRecyclerView() : null);
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
        fc2.c n17;
        fc2.c n18;
        com.tencent.mm.plugin.finder.feed.model.l0 l0Var = this.f106769z;
        l0Var.onDetach();
        com.tencent.mm.ui.MMActivity context = this.f106421d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar != null && (n18 = zy2.ra.n1(nyVar, 0, 1, null)) != null) {
            n18.d(l0Var);
        }
        zy2.h8 h8Var = this.A;
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
