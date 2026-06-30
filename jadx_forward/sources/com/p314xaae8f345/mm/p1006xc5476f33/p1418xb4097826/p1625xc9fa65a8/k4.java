package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class k4 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.d5 {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.ListView f207275a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.g4 f207276b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f207277c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f207278d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f207279e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k4(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, yz5.l onHistoryClickListener) {
        this(activity, false, false, onHistoryClickListener, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onHistoryClickListener, "onHistoryClickListener");
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.i4 i4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.i4.f207256a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.i4.f207258c.remove(java.lang.Integer.valueOf(hashCode()));
    }

    public final void b(java.lang.String str) {
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        android.widget.ListView listView = this.f207275a;
        if (K0) {
            listView.setVisibility(0);
        } else {
            listView.setVisibility(8);
        }
    }

    public final void c(java.lang.String str) {
        if (str != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.i4.f207256a.b(str);
            android.view.View view = this.f207277c;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderSearchHistoryLogic", "onTextSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/search/FinderSearchHistoryLogic", "onTextSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.i4 i4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.i4.f207256a;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.i4.f207257b.m75941xfb821914(0).isEmpty()) {
            android.view.View view = this.f207277c;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderSearchHistoryLogic", "updateHistoryFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/search/FinderSearchHistoryLogic", "updateHistoryFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f207277c;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/FinderSearchHistoryLogic", "updateHistoryFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/search/FinderSearchHistoryLogic", "updateHistoryFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.d5
    /* renamed from: update */
    public void mo58947xce0038c9() {
        this.f207276b.notifyDataSetChanged();
    }

    public k4(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, boolean z17, boolean z18, yz5.l onHistoryClickListener, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.c5 c5Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onHistoryClickListener, "onHistoryClickListener");
        android.view.View findViewById = activity.findViewById(com.p314xaae8f345.mm.R.id.h0r);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.ListView listView = (android.widget.ListView) findViewById;
        this.f207275a = listView;
        this.f207278d = z17;
        this.f207279e = z18;
        android.view.View inflate = android.view.LayoutInflater.from(activity).inflate(z17 ? z18 ? com.p314xaae8f345.mm.R.C30864xbddafb2a.ajd : com.p314xaae8f345.mm.R.C30864xbddafb2a.ajc : z18 ? com.p314xaae8f345.mm.R.C30864xbddafb2a.b8d : com.p314xaae8f345.mm.R.C30864xbddafb2a.b8c, (android.view.ViewGroup) listView, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f207277c = inflate;
        d();
        listView.addFooterView(inflate);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.g4 g4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.g4(this);
        this.f207276b = g4Var;
        listView.setAdapter((android.widget.ListAdapter) g4Var);
        inflate.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.c4(this, c5Var));
        listView.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.d4(onHistoryClickListener));
        listView.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.e4(activity));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.i4 i4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.i4.f207256a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.i4.f207258c.put(java.lang.Integer.valueOf(hashCode()), this);
    }
}
