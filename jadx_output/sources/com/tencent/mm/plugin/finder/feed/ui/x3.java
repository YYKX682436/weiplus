package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class x3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f110718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderGallerySearchUI f110719e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f110720f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f110721g;

    public x3(int i17, com.tencent.mm.plugin.finder.feed.ui.FinderGallerySearchUI finderGallerySearchUI, kotlin.jvm.internal.f0 f0Var, boolean z17) {
        this.f110718d = i17;
        this.f110719e = finderGallerySearchUI;
        this.f110720f = f0Var;
        this.f110721g = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlin.jvm.internal.f0 f0Var = this.f110720f;
        com.tencent.mm.plugin.finder.feed.ui.FinderGallerySearchUI finderGallerySearchUI = this.f110719e;
        int i17 = this.f110718d;
        if (i17 != 0) {
            ym5.s3 s3Var = new ym5.s3(1);
            s3Var.f463521f = finderGallerySearchUI.f109267y != 0;
            int i18 = f0Var.f310116d;
            s3Var.f463522g = i18 - i17 <= 0;
            s3Var.f463523h = i18 - i17;
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = finderGallerySearchUI.E;
            if (refreshLoadMoreLayout == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout.onPreFinishLoadMoreSmooth(s3Var);
        } else {
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = finderGallerySearchUI.E;
            if (refreshLoadMoreLayout2 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout2.N(f0Var.f310116d);
        }
        if (this.f110721g) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = finderGallerySearchUI.F;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderGallerySearchUI$onCgiBack$2", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/feed/ui/FinderGallerySearchUI$onCgiBack$2", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
    }
}
