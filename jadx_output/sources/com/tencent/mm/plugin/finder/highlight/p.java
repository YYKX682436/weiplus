package com.tencent.mm.plugin.finder.highlight;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f111454a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.highlight.m f111455b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f111456c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.highlight.l f111457d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f111458e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.highlight.d f111459f;

    /* renamed from: g, reason: collision with root package name */
    public xc2.p0 f111460g;

    /* renamed from: h, reason: collision with root package name */
    public int f111461h;

    public p(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f111454a = context;
        this.f111456c = new java.util.ArrayList();
        this.f111461h = -1;
    }

    public final void a(r45.gb1 gb1Var, java.lang.String str) {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed;
        xc2.p0 p0Var = this.f111460g;
        if (p0Var == null || (baseFinderFeed = p0Var.f453244f) == null) {
            return;
        }
        android.content.Context context = this.f111454a;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        if (V6 != null) {
            java.lang.String ek6 = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(baseFinderFeed.getItemId(), baseFinderFeed.w(), V6.getInteger(5));
            java.util.Iterator it = this.f111456c.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                } else if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.finder.highlight.d) it.next()).f111427d, gb1Var)) {
                    break;
                } else {
                    i17++;
                }
            }
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("watch_point_anchor", str, kz5.c1.k(new jz5.l("finder_tab_context_id", V6.getString(2)), new jz5.l("finder_context_id", V6.getString(1)), new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.getInteger(5))), new jz5.l("session_buffer", ek6), new jz5.l("feed_id", pm0.v.u(baseFinderFeed.getItemId())), new jz5.l("extra_info", V6.getString(11)), new jz5.l("anchor_id", java.lang.String.valueOf(i17)), new jz5.l("uniq_id", gb1Var.getString(4))), 1, false);
        }
    }

    public final void b(com.tencent.mm.plugin.finder.highlight.d dVar) {
        if (dVar == null) {
            if (this.f111461h != 0) {
                com.tencent.mm.plugin.finder.highlight.l lVar = this.f111457d;
                if (lVar == null) {
                    kotlin.jvm.internal.o.o("viewCallBack");
                    throw null;
                }
                androidx.recyclerview.widget.RecyclerView recyclerView = lVar.g().getRecyclerView();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/highlight/FinderLiveHighlightDrawerPresenter", "scrollToHighlightPosition", "(Lcom/tencent/mm/plugin/finder/highlight/FinderLiveHighlight;)V", "Undefined", "scrollToPosition", "(I)V");
                recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/highlight/FinderLiveHighlightDrawerPresenter", "scrollToHighlightPosition", "(Lcom/tencent/mm/plugin/finder/highlight/FinderLiveHighlight;)V", "Undefined", "scrollToPosition", "(I)V");
                this.f111461h = 0;
                return;
            }
            return;
        }
        java.util.Iterator it = this.f111456c.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else {
                if (((com.tencent.mm.plugin.finder.highlight.d) it.next()).f111427d.getInteger(0) == dVar.f111427d.getInteger(0)) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        if (i17 == -1 || i17 == this.f111461h) {
            return;
        }
        com.tencent.mm.plugin.finder.highlight.l lVar2 = this.f111457d;
        if (lVar2 == null) {
            kotlin.jvm.internal.o.o("viewCallBack");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = lVar2.g().getRecyclerView();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(recyclerView2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/highlight/FinderLiveHighlightDrawerPresenter", "scrollToHighlightPosition", "(Lcom/tencent/mm/plugin/finder/highlight/FinderLiveHighlight;)V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView2.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(recyclerView2, "com/tencent/mm/plugin/finder/highlight/FinderLiveHighlightDrawerPresenter", "scrollToHighlightPosition", "(Lcom/tencent/mm/plugin/finder/highlight/FinderLiveHighlight;)V", "Undefined", "scrollToPosition", "(I)V");
        this.f111461h = i17;
    }
}
