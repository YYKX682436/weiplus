package com.tencent.mm.plugin.finder.gallery;

/* loaded from: classes2.dex */
public final class r0 extends com.tencent.mm.plugin.finder.feed.dj {

    /* renamed from: y, reason: collision with root package name */
    public final int f111402y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f111403z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.tencent.mm.ui.MMActivity context, int i17) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f111402y = i17;
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
        if (i0Var instanceof com.tencent.mm.plugin.finder.gallery.t0) {
            kotlin.jvm.internal.o.e(i0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.gallery.FinderGalleryTimelineContract.ViewCallback");
            com.tencent.mm.plugin.finder.gallery.t0 t0Var = (com.tencent.mm.plugin.finder.gallery.t0) i0Var;
            if (reason.f463521f) {
                androidx.recyclerview.widget.RecyclerView recyclerView = t0Var.o().getRecyclerView();
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
                int w17 = ((com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager).w() + 1;
                if (w17 < t0Var.a().getData().size()) {
                    recyclerView.post(new com.tencent.mm.plugin.finder.gallery.s0(recyclerView, w17));
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void P() {
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
        a17.F = new com.tencent.mm.plugin.finder.gallery.q0(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj, com.tencent.mm.plugin.finder.feed.c0
    public in5.s h() {
        return new in5.s() { // from class: com.tencent.mm.plugin.finder.gallery.FinderGalleryTimelineContract$Presenter$buildItemCoverts$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == 2) {
                    com.tencent.mm.plugin.finder.gallery.r0.this.getClass();
                    return new com.tencent.mm.plugin.finder.gallery.p0(com.tencent.mm.plugin.finder.gallery.r0.this, false, com.tencent.mm.plugin.finder.gallery.r0.this.f106427m);
                }
                if (type == 4) {
                    com.tencent.mm.plugin.finder.gallery.r0 r0Var = com.tencent.mm.plugin.finder.gallery.r0.this;
                    cw2.f8 f8Var = r0Var.f106429o;
                    r0Var.getClass();
                    return new com.tencent.mm.plugin.finder.gallery.o0(com.tencent.mm.plugin.finder.gallery.r0.this, f8Var, false, com.tencent.mm.plugin.finder.gallery.r0.this.f106427m);
                }
                if (type != 9) {
                    if (type != 2003) {
                        hc2.l.a(com.tencent.mm.plugin.finder.gallery.r0.this.f106569s, type);
                        return new com.tencent.mm.plugin.finder.convert.z2();
                    }
                    com.tencent.mm.plugin.finder.gallery.r0 r0Var2 = com.tencent.mm.plugin.finder.gallery.r0.this;
                    com.tencent.mm.ui.MMActivity activity = r0Var2.f106421d;
                    kotlin.jvm.internal.o.g(activity, "activity");
                    return new com.tencent.mm.plugin.finder.convert.th(r0Var2, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), 0);
                }
                com.tencent.mm.plugin.finder.gallery.r0 r0Var3 = com.tencent.mm.plugin.finder.gallery.r0.this;
                cw2.f8 f8Var2 = r0Var3.f106429o;
                r0Var3.getClass();
                com.tencent.mm.plugin.finder.gallery.r0 r0Var4 = com.tencent.mm.plugin.finder.gallery.r0.this;
                int i17 = r0Var4.f106427m;
                com.tencent.mm.ui.MMActivity context = r0Var4.f106421d;
                kotlin.jvm.internal.o.g(context, "context");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                return new com.tencent.mm.plugin.finder.convert.zf(f8Var2, r0Var3, false, i17, nyVar != null ? nyVar.f135380n : 0);
            }
        };
    }
}
