package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class xx implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f111121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f111122e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.LinearLayoutManager f111123f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f111124g;

    public xx(com.tencent.mm.plugin.finder.feed.pz pzVar, boolean z17, androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager, long j17) {
        this.f111121d = pzVar;
        this.f111122e = z17;
        this.f111123f = linearLayoutManager;
        this.f111124g = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in5.s0 s0Var;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        com.tencent.mm.plugin.finder.feed.pz pzVar = this.f111121d;
        in5.n0 T0 = pzVar.T0();
        if (T0 == null || (s0Var = (in5.s0) in5.n0.Y(T0, pzVar.f108773x0.hashCode(), false, 2, null)) == null) {
            return;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        if (!s0Var.itemView.getGlobalVisibleRect(rect) || rect.height() <= 0) {
            return;
        }
        boolean z17 = this.f111122e;
        if (z17) {
            com.tencent.mm.plugin.finder.feed.ct ctVar = pzVar.f108759m;
            if (ctVar != null && (recyclerView = ((com.tencent.mm.plugin.finder.feed.v00) ctVar).getRecyclerView()) != null) {
                recyclerView.smoothScrollBy(0, rect.height());
            }
        } else {
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = this.f111123f;
            if (linearLayoutManager != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                arrayList.add(1);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$hideSearchBar$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
                yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$hideSearchBar$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            }
        }
        com.tencent.mars.xlog.Log.i(pzVar.U, "[hideSearchBar] to hide search bar. delay=" + this.f111124g + " isSmooth=" + z17 + " height=" + rect.height());
    }
}
