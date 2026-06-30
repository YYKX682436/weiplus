package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class p00 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f108690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.v00 f108691e;

    public p00(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.plugin.finder.feed.v00 v00Var) {
        this.f108690d = recyclerView;
        this.f108691e = v00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.n2 itemAnimator;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f108690d;
        int childCount = recyclerView.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            recyclerView.getChildAt(i17).setTranslationY(0.0f);
        }
        this.f108691e.getClass();
        com.tencent.mars.xlog.Log.i("Finder.TimelineViewCallback", "checkResetItemAnimator: " + recyclerView.getItemAnimator() + ' ');
        if ((recyclerView.getItemAnimator() instanceof tb2.h) && (itemAnimator = recyclerView.getItemAnimator()) != null) {
            itemAnimator.k();
        }
        recyclerView.setItemAnimator(new androidx.recyclerview.widget.z());
    }
}
