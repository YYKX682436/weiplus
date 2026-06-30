package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class g6 implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p6 f191609a;

    public g6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p6 p6Var) {
        this.f191609a = p6Var;
    }

    @Override // qn5.c
    public void a(boolean z17) {
    }

    @Override // qn5.c
    /* renamed from: onLoadMore */
    public boolean mo15402x1318b45a() {
        boolean z17;
        android.view.View view;
        android.view.View view2;
        android.view.View view3;
        android.widget.TextView textView;
        android.view.View view4;
        android.view.View view5;
        android.view.View view6;
        android.widget.TextView textView2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p6 p6Var = this.f191609a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.a6 a6Var = p6Var.f191932e;
        if (a6Var.f191191o == 1) {
            int i17 = a6Var.f191186g;
            com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = a6Var.f191183d;
            if (i17 != -1) {
                pq5.g l17 = new db2.f2(a6Var.f191193q, a6Var.f191194r, a6Var.f191190n, a6Var.f191186g, a6Var.f191192p, a6Var.f191187h, a6Var.f191188i).l();
                l17.f(activityC21401x6ce6f73f);
                l17.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.w5(a6Var));
            } else {
                pq5.g l18 = new db2.q4(a6Var.f191193q, a6Var.f191185f, a6Var.f191194r, a6Var.f191195s, a6Var.f191190n, a6Var.f191192p).l();
                l18.f(activityC21401x6ce6f73f);
                l18.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.x5(a6Var));
            }
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            on5.c m82923x19404fcc = p6Var.a().m82923x19404fcc();
            android.view.View view7 = m82923x19404fcc != null ? m82923x19404fcc.getView() : null;
            if (view7 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view7, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback$initRecyclerView$4", "onLoadMore", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback$initRecyclerView$4", "onLoadMore", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            on5.c m82923x19404fcc2 = p6Var.a().m82923x19404fcc();
            if (m82923x19404fcc2 != null && (view6 = m82923x19404fcc2.getView()) != null && (textView2 = (android.widget.TextView) view6.findViewById(com.p314xaae8f345.mm.R.id.ili)) != null) {
                textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573427el1);
            }
            on5.c m82923x19404fcc3 = p6Var.a().m82923x19404fcc();
            android.widget.TextView textView3 = (m82923x19404fcc3 == null || (view5 = m82923x19404fcc3.getView()) == null) ? null : (android.widget.TextView) view5.findViewById(com.p314xaae8f345.mm.R.id.ili);
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            on5.c m82923x19404fcc4 = p6Var.a().m82923x19404fcc();
            android.view.View findViewById = (m82923x19404fcc4 == null || (view4 = m82923x19404fcc4.getView()) == null) ? null : view4.findViewById(com.p314xaae8f345.mm.R.id.ilg);
            if (findViewById != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback$initRecyclerView$4", "onLoadMore", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback$initRecyclerView$4", "onLoadMore", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            return true;
        }
        on5.c m82923x19404fcc5 = p6Var.a().m82923x19404fcc();
        android.view.View view8 = m82923x19404fcc5 != null ? m82923x19404fcc5.getView() : null;
        if (view8 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view8, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback$initRecyclerView$4", "onLoadMore", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback$initRecyclerView$4", "onLoadMore", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        on5.c m82923x19404fcc6 = p6Var.a().m82923x19404fcc();
        if (m82923x19404fcc6 != null && (view3 = m82923x19404fcc6.getView()) != null && (textView = (android.widget.TextView) view3.findViewById(com.p314xaae8f345.mm.R.id.ili)) != null) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573429el3);
        }
        on5.c m82923x19404fcc7 = p6Var.a().m82923x19404fcc();
        android.widget.TextView textView4 = (m82923x19404fcc7 == null || (view2 = m82923x19404fcc7.getView()) == null) ? null : (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.ili);
        if (textView4 != null) {
            textView4.setVisibility(8);
        }
        on5.c m82923x19404fcc8 = p6Var.a().m82923x19404fcc();
        android.view.View findViewById2 = (m82923x19404fcc8 == null || (view = m82923x19404fcc8.getView()) == null) ? null : view.findViewById(com.p314xaae8f345.mm.R.id.ilg);
        if (findViewById2 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback$initRecyclerView$4", "onLoadMore", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback$initRecyclerView$4", "onLoadMore", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return true;
    }
}
