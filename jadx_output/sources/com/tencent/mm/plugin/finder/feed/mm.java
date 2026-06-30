package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class mm extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.um f107390d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mm(com.tencent.mm.plugin.finder.feed.um umVar) {
        super(0);
        this.f107390d = umVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.RecyclerView recyclerView2;
        androidx.recyclerview.widget.RecyclerView recyclerView3;
        com.tencent.mm.plugin.finder.feed.um umVar = this.f107390d;
        com.tencent.mm.plugin.finder.feed.a1 a1Var = umVar.f107157f;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = (a1Var == null || (recyclerView3 = a1Var.getRecyclerView()) == null) ? null : recyclerView3.getLayoutManager();
        androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = layoutManager instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager ? (androidx.recyclerview.widget.StaggeredGridLayoutManager) layoutManager : null;
        ey2.o0 o0Var = umVar.f110825n;
        if (o0Var != null) {
            com.tencent.mm.plugin.finder.feed.a1 a1Var2 = umVar.f107157f;
            java.lang.Object adapter = (a1Var2 == null || (recyclerView2 = a1Var2.getRecyclerView()) == null) ? null : recyclerView2.getAdapter();
            in5.n0 n0Var = adapter instanceof in5.n0 ? (in5.n0) adapter : null;
            int a07 = (n0Var != null ? n0Var.a0() : 0) + o0Var.f257445e;
            int i17 = o0Var.f257446f;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("TimelineInit initdone canTimelineRefresh tabType=");
            int i18 = umVar.f110823i;
            sb6.append(i18);
            sb6.append(" lastPos:");
            sb6.append(a07);
            sb6.append(" fromTopPixel:");
            sb6.append(i17);
            com.tencent.mars.xlog.Log.i("FinderNativeDramaGridUIContract.Presenter", sb6.toString());
            if (a07 > 0) {
                if (staggeredGridLayoutManager != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(a07));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(staggeredGridLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderNativeDramaGridUIContract$Presenter$1$call$1", "invoke", "()V", "Undefined", "scrollToPosition", "(I)V");
                    staggeredGridLayoutManager.scrollToPosition(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(staggeredGridLayoutManager, "com/tencent/mm/plugin/finder/feed/FinderNativeDramaGridUIContract$Presenter$1$call$1", "invoke", "()V", "Undefined", "scrollToPosition", "(I)V");
                }
                com.tencent.mm.plugin.finder.feed.a1 a1Var3 = umVar.f107157f;
                if (a1Var3 != null && (recyclerView = a1Var3.getRecyclerView()) != null) {
                    recyclerView.post(new com.tencent.mm.plugin.finder.feed.lm(staggeredGridLayoutManager, a07, i17));
                }
            }
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = umVar.f110827p;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(i18);
            sb7.append('_');
            sb7.append(umVar.f107156e.getSize());
            ym5.s3 s3Var = (ym5.s3) concurrentHashMap.get(sb7.toString());
            if (s3Var != null && !s3Var.f463521f) {
                pm0.v.X(new com.tencent.mm.plugin.finder.feed.rm(umVar, s3Var, false));
            }
        }
        return jz5.f0.f302826a;
    }
}
