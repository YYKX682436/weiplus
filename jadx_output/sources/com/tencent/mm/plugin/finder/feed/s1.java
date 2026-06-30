package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public abstract class s1 implements fs2.c {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f108960d;

    /* renamed from: e, reason: collision with root package name */
    public final int f108961e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.e1 f108962f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.view.RefreshLoadMoreLayout f108963g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f108964h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView.LayoutManager f108965i;

    public s1(com.tencent.mm.ui.MMActivity context, int i17, int i18, boolean z17, int i19, int i27, kotlin.jvm.internal.i iVar) {
        i19 = (i27 & 16) != 0 ? -1 : i19;
        kotlin.jvm.internal.o.g(context, "context");
        this.f108960d = context;
        this.f108961e = i19;
        android.view.View findViewById = context.findViewById(com.tencent.mm.R.id.m6e);
        kotlin.jvm.internal.o.d(findViewById);
        this.f108963g = (com.tencent.mm.view.RefreshLoadMoreLayout) findViewById;
        new tu2.b().f422131a = false;
    }

    public abstract android.view.View a();

    public final com.tencent.mm.plugin.finder.feed.e1 g() {
        com.tencent.mm.plugin.finder.feed.e1 e1Var = this.f108962f;
        if (e1Var != null) {
            return e1Var;
        }
        kotlin.jvm.internal.o.o("present");
        throw null;
    }

    public androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        return this.f108963g.getRecyclerView();
    }

    public final boolean j(r45.qt2 qt2Var) {
        int integer = qt2Var.getInteger(5);
        boolean z17 = integer == 22 || integer == 28 || integer == 30 || integer == 81 || integer == 155;
        com.tencent.mars.xlog.Log.i("Finder.FinderBaseGridFeedUIContract.ViewCallback", "needMarkRead:" + z17 + " commentScene:" + qt2Var.getInteger(5) + " fromCommentScene:" + qt2Var.getInteger(7));
        return z17;
    }
}
