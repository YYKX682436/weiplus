package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class hm extends com.tencent.mm.plugin.finder.feed.gj {

    /* renamed from: r, reason: collision with root package name */
    public int f106928r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f106929s;

    /* renamed from: t, reason: collision with root package name */
    public float f106930t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f106931u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm(com.tencent.mm.ui.MMActivity context, com.tencent.mm.plugin.finder.feed.em presenter, int i17, int i18) {
        super(context, presenter, i17, i18);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(presenter, "presenter");
    }

    @Override // com.tencent.mm.plugin.finder.feed.i0
    public android.view.View j() {
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.i0
    public void q(java.util.ArrayList data) {
        kotlin.jvm.internal.o.g(data, "data");
        super.q(data);
        com.tencent.mm.plugin.finder.feed.c0 c0Var = this.f106969e;
        kotlin.jvm.internal.o.e(c0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderMemberTimelineUIContract.Presenter");
        com.tencent.mm.plugin.finder.feed.em emVar = (com.tencent.mm.plugin.finder.feed.em) c0Var;
        int i17 = emVar.B;
        if ((i17 == 9 || i17 == 10 || !eo2.f.f255565a.d(java.lang.Integer.valueOf(emVar.A))) ? false : true) {
            com.tencent.mm.view.RefreshLoadMoreLayout o17 = o();
            android.view.View inflate = com.tencent.mm.ui.id.b(this.f106968d).inflate(com.tencent.mm.R.layout.bs8, (android.view.ViewGroup) null);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            o17.setLoadMoreFooter(inflate);
        }
        if (this.f106929s) {
            androidx.recyclerview.widget.RecyclerView recyclerView = getRecyclerView();
            kotlin.jvm.internal.o.e(recyclerView, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView");
            ((com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) recyclerView).setInterceptTouchEventListener(new com.tencent.mm.plugin.finder.feed.gm(this, emVar));
        }
    }
}
