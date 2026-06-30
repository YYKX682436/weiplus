package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class wb extends com.tencent.mm.plugin.finder.feed.dj {
    public java.lang.String A;
    public java.lang.String B;
    public yz5.p C;
    public yz5.l D;
    public com.tencent.mm.plugin.finder.model.BaseFinderFeed E;
    public int F;
    public final jz5.g G;
    public boolean H;
    public final jz5.g I;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f110965y;

    /* renamed from: z, reason: collision with root package name */
    public long f110966z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb(com.tencent.mm.ui.MMActivity context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f110965y = "FinderHalfScreenContract";
        this.A = "";
        this.B = "";
        this.F = 31;
        this.G = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ob(context));
        this.I = jz5.h.b(com.tencent.mm.plugin.finder.feed.sb.f108981d);
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
        Z();
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void P() {
        com.tencent.mm.plugin.finder.feed.vb vbVar = new com.tencent.mm.plugin.finder.feed.vb(this);
        if (((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).Ai() && ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.O().r()).intValue() == 1) {
            pm0.v.X(new com.tencent.mm.plugin.finder.feed.pb(this));
            return;
        }
        long j17 = this.f110966z;
        java.lang.String str = this.A;
        int i17 = this.f106422e;
        java.lang.String str2 = this.B;
        com.tencent.mm.ui.MMActivity context = this.f106421d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        db2.g4 g4Var = new db2.g4(j17, str, i17, 2, "", true, null, null, 0L, null, false, false, str2, nyVar != null ? nyVar.V6() : null, 0, null, false, null, null, null, null, null, 0, 0, null, null, true, null, null, 469749696, null);
        com.tencent.mm.plugin.finder.report.v1.f125393a.l(this.f106427m, true, this.f110966z != 0, this.B.length() > 0);
        pq5.g l17 = g4Var.l();
        l17.f(context);
        l17.h(new com.tencent.mm.plugin.finder.feed.rb(this, vbVar));
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj
    public void X(com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader model, com.tencent.mm.plugin.finder.feed.gj callback) {
        fc2.c n17;
        kotlin.jvm.internal.o.g(model, "model");
        kotlin.jvm.internal.o.g(callback, "callback");
        model.setInitDone(new com.tencent.mm.plugin.finder.feed.tb(this));
        super.X(model, callback);
        i0().N0(2, this.f106422e, new com.tencent.mm.plugin.finder.feed.ub(this));
        com.tencent.mm.ui.MMActivity context = this.f106421d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar != null && (n17 = zy2.ra.n1(nyVar, 0, 1, null)) != null) {
            n17.a(i0());
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = callback.o().getRecyclerView();
        com.tencent.mm.view.RefreshLoadMoreLayout o17 = callback.o();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        recyclerView.i(new sc2.r8(this.f110965y, o17, ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Q4).getValue()).r()).intValue()));
    }

    public final void Z() {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader;
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<T> dataListJustForAdapter;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        if (this.H) {
            return;
        }
        this.H = true;
        if (this.F == 35 || (baseFeedLoader = this.f106570t) == null || (dataListJustForAdapter = baseFeedLoader.getDataListJustForAdapter()) == 0 || dataListJustForAdapter.size() <= 1) {
            return;
        }
        dataListJustForAdapter.add(1, (so2.m3) ((jz5.n) this.I).getValue());
        com.tencent.mm.plugin.finder.feed.i0 i0Var = this.f106424g;
        if (i0Var == null || (recyclerView = i0Var.getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        adapter.notifyItemInserted(1);
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj, com.tencent.mm.plugin.finder.feed.c0
    public in5.s h() {
        return new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.FinderHalfScreenContract$Presenter$buildItemCoverts$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == 4) {
                    com.tencent.mm.plugin.finder.feed.wb wbVar = com.tencent.mm.plugin.finder.feed.wb.this;
                    return new com.tencent.mm.plugin.finder.convert.yn(wbVar.f106429o, wbVar);
                }
                if (type == so2.m3.class.getName().hashCode()) {
                    return new com.tencent.mm.plugin.finder.convert.cp(false);
                }
                hc2.l.a(com.tencent.mm.plugin.finder.feed.wb.this.f110965y, type);
                return new com.tencent.mm.plugin.finder.convert.z2();
            }
        };
    }

    public final com.tencent.mm.plugin.finder.feed.model.l0 i0() {
        return (com.tencent.mm.plugin.finder.feed.model.l0) ((jz5.n) this.G).getValue();
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj, com.tencent.mm.plugin.finder.feed.c0, fs2.a
    public void onDetach() {
        fc2.c n17;
        i0().onDetach();
        com.tencent.mm.ui.MMActivity context = this.f106421d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar != null && (n17 = zy2.ra.n1(nyVar, 0, 1, null)) != null) {
            n17.d(i0());
        }
        super.onDetach();
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj, com.tencent.mm.plugin.finder.feed.c0
    public java.lang.String v() {
        return this.f110965y;
    }
}
