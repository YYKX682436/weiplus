package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class a6 implements fs2.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMFragmentActivity f109650d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f109651e;

    /* renamed from: f, reason: collision with root package name */
    public final int f109652f;

    /* renamed from: g, reason: collision with root package name */
    public final int f109653g;

    /* renamed from: h, reason: collision with root package name */
    public final int f109654h;

    /* renamed from: i, reason: collision with root package name */
    public final int f109655i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.ui.p6 f109656m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f109657n;

    /* renamed from: o, reason: collision with root package name */
    public int f109658o;

    /* renamed from: p, reason: collision with root package name */
    public final r45.qt2 f109659p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f109660q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f109661r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.LinkedList f109662s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.ArrayList f109663t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.y9 f109664u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f109665v;

    public a6(com.tencent.mm.ui.MMFragmentActivity context, java.util.ArrayList topicList, int i17, int i18, int i19, int i27) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(topicList, "topicList");
        this.f109650d = context;
        this.f109651e = topicList;
        this.f109652f = i17;
        this.f109653g = i18;
        this.f109654h = i19;
        this.f109655i = i27;
        this.f109659p = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        this.f109660q = "";
        this.f109661r = "";
        this.f109662s = new java.util.LinkedList();
        this.f109663t = new java.util.ArrayList();
        this.f109664u = new com.tencent.mm.plugin.finder.feed.model.y9();
    }

    public static final void c(com.tencent.mm.plugin.finder.feed.ui.a6 a6Var, int i17, int i18, java.util.LinkedList linkedList, int i19, com.tencent.mm.protobuf.g gVar) {
        androidx.recyclerview.widget.f2 adapter;
        android.view.View view;
        android.view.View view2;
        android.view.View view3;
        android.widget.TextView textView;
        androidx.recyclerview.widget.f2 adapter2;
        java.util.ArrayList arrayList = a6Var.f109663t;
        int size = arrayList.size();
        android.view.View view4 = null;
        if (i17 == 0 && i18 == 0) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.finder.model.BaseFinderFeed p17 = cu2.u.f222441a.p(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a((com.tencent.mm.protocal.protobuf.FinderObject) it.next(), 16));
                if (!p17.getFeedObject().getMediaList().isEmpty()) {
                    arrayList.add(p17);
                }
                arrayList2.add(jz5.f0.f302826a);
            }
            a6Var.f109658o = i19;
            a6Var.f109657n = gVar;
            com.tencent.mm.ui.MMFragmentActivity activity = a6Var.f109650d;
            kotlin.jvm.internal.o.g(activity, "activity");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).e(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            int i27 = a6Var.f109652f == 2 ? 1 : 2;
            java.lang.String str = (java.lang.String) kz5.n0.Z(a6Var.f109662s);
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = str;
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3.pj((com.tencent.mm.plugin.finder.report.o3) c17, V6, a6Var.f109661r, 1, i27, str2, a6Var.f109660q, linkedList.size(), 0L, 0, 384, null);
        }
        com.tencent.mm.plugin.finder.feed.ui.p6 p6Var = a6Var.f109656m;
        if (p6Var != null) {
            java.lang.Integer errCode = java.lang.Integer.valueOf(i17);
            java.lang.Integer errType = java.lang.Integer.valueOf(i18);
            kotlin.jvm.internal.o.g(errCode, "errCode");
            kotlin.jvm.internal.o.g(errType, "errType");
            com.tencent.mm.plugin.finder.feed.ui.a6 a6Var2 = p6Var.f110399e;
            int size2 = a6Var2.f109663t.size();
            jz5.g gVar2 = p6Var.f110406o;
            jz5.g gVar3 = p6Var.f110405n;
            if (size2 > 0) {
                ((android.widget.TextView) ((jz5.n) gVar3).getValue()).setVisibility(8);
                ((android.widget.LinearLayout) ((jz5.n) gVar2).getValue()).setVisibility(8);
                p6Var.g().setVisibility(8);
                p6Var.a().setVisibility(0);
            } else {
                ((android.widget.TextView) ((jz5.n) gVar3).getValue()).setVisibility(0);
                ((android.widget.LinearLayout) ((jz5.n) gVar2).getValue()).setVisibility(8);
                p6Var.g().setVisibility(8);
                p6Var.a().setVisibility(8);
            }
            if (size == 0) {
                androidx.recyclerview.widget.RecyclerView recyclerView = p6Var.getRecyclerView();
                if (recyclerView != null && (adapter2 = recyclerView.getAdapter()) != null) {
                    adapter2.notifyDataSetChanged();
                }
            } else {
                androidx.recyclerview.widget.RecyclerView recyclerView2 = p6Var.getRecyclerView();
                if (recyclerView2 != null && (adapter = recyclerView2.getAdapter()) != null) {
                    adapter.notifyItemRangeInserted(size, size2);
                }
            }
            p6Var.a().e(true);
            p6Var.a().E(!(a6Var2.f109658o == 1));
            if (a6Var2.f109658o == 1) {
                return;
            }
            on5.c loadMoreFooter = p6Var.a().getLoadMoreFooter();
            android.view.View view5 = loadMoreFooter != null ? loadMoreFooter.getView() : null;
            if (view5 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                android.view.View view6 = view5;
                yj0.a.d(view6, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback", "onSearchCallback", "(Ljava/lang/Object;Ljava/lang/Object;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback", "onSearchCallback", "(Ljava/lang/Object;Ljava/lang/Object;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            on5.c loadMoreFooter2 = p6Var.a().getLoadMoreFooter();
            if (loadMoreFooter2 != null && (view3 = loadMoreFooter2.getView()) != null && (textView = (android.widget.TextView) view3.findViewById(com.tencent.mm.R.id.ili)) != null) {
                textView.setText(com.tencent.mm.R.string.f491896el3);
            }
            on5.c loadMoreFooter3 = p6Var.a().getLoadMoreFooter();
            android.widget.TextView textView2 = (loadMoreFooter3 == null || (view2 = loadMoreFooter3.getView()) == null) ? null : (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.ili);
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            on5.c loadMoreFooter4 = p6Var.a().getLoadMoreFooter();
            if (loadMoreFooter4 != null && (view = loadMoreFooter4.getView()) != null) {
                view4 = view.findViewById(com.tencent.mm.R.id.ilg);
            }
            if (view4 == null) {
                return;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            android.view.View view7 = view4;
            yj0.a.d(view7, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback", "onSearchCallback", "(Ljava/lang/Object;Ljava/lang/Object;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback", "onSearchCallback", "(Ljava/lang/Object;Ljava/lang/Object;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void f(int i17, long j17) {
        com.tencent.mm.ui.MMFragmentActivity activity = this.f109650d;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).e(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        int i18 = this.f109652f == 2 ? 1 : 2;
        java.lang.String str = (java.lang.String) kz5.n0.Z(this.f109662s);
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.report.o3.pj((com.tencent.mm.plugin.finder.report.o3) c17, V6, this.f109661r, 3, i18, str2, this.f109660q, 0, j17, i17, 64, null);
    }

    public final void g(android.content.Intent intent, int i17) {
        kotlin.jvm.internal.o.g(intent, "intent");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(this.f109663t);
        this.f109664u.b(new com.tencent.mm.plugin.finder.feed.model.r9(arrayList, this.f109657n, i17, null, null, 16, null), intent);
    }

    public final void h(java.lang.String query, java.util.LinkedList tags) {
        kotlin.jvm.internal.o.g(query, "query");
        kotlin.jvm.internal.o.g(tags, "tags");
        this.f109658o = 0;
        this.f109657n = null;
        this.f109663t.clear();
        this.f109662s = tags;
        this.f109660q = query;
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        this.f109661r = uuid;
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).f125209e = java.lang.String.valueOf(c01.id.c());
        com.tencent.mm.plugin.finder.feed.ui.p6 p6Var = this.f109656m;
        if (p6Var != null) {
            p6Var.g().setVisibility(8);
            p6Var.a().setVisibility(8);
            ((android.widget.TextView) ((jz5.n) p6Var.f110405n).getValue()).setVisibility(8);
            ((android.widget.LinearLayout) ((jz5.n) p6Var.f110406o).getValue()).setVisibility(0);
            on5.c loadMoreFooter = p6Var.a().getLoadMoreFooter();
            android.view.View view = loadMoreFooter != null ? loadMoreFooter.getView() : null;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                android.view.View view2 = view;
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback", "onStartSearch", "(Ljava/lang/String;Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback", "onStartSearch", "(Ljava/lang/String;Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = p6Var.getRecyclerView();
            if (recyclerView != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(recyclerView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback", "onStartSearch", "(Ljava/lang/String;Ljava/util/LinkedList;)V", "Undefined", "scrollToPosition", "(I)V");
                recyclerView.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback", "onStartSearch", "(Ljava/lang/String;Ljava/util/LinkedList;)V", "Undefined", "scrollToPosition", "(I)V");
            }
        }
        int i17 = this.f109653g;
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = this.f109650d;
        if (i17 != -1) {
            pq5.g l17 = new db2.f2(query, this.f109661r, null, this.f109653g, this.f109659p, this.f109654h, this.f109655i).l();
            l17.f(mMFragmentActivity);
            l17.h(new com.tencent.mm.plugin.finder.feed.ui.y5(this));
        } else {
            pq5.g l18 = new db2.q4(query, this.f109652f, this.f109661r, this.f109662s, null, this.f109659p).l();
            l18.f(mMFragmentActivity);
            l18.h(new com.tencent.mm.plugin.finder.feed.ui.z5(this));
        }
    }

    @Override // fs2.a
    public void onDetach() {
        this.f109656m = null;
        com.tencent.mm.sdk.event.IListener iListener = this.f109665v;
        if (iListener != null) {
            iListener.dead();
        }
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).f125209e = "";
    }
}
