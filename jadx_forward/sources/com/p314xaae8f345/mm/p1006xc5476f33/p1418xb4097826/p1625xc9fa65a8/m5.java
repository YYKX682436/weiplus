package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class m5 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.d5 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f207309a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.p f207310b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.p f207311c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f207312d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ListView f207313e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.i5 f207314f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f207315g;

    public m5(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, boolean z17, yz5.p onHistoryClickListener, yz5.p onHistoryRemoveListener, yz5.a onHistoryClearListener, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 2) != 0 ? false : z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onHistoryClickListener, "onHistoryClickListener");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onHistoryRemoveListener, "onHistoryRemoveListener");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onHistoryClearListener, "onHistoryClearListener");
        this.f207309a = z17;
        this.f207310b = onHistoryClickListener;
        this.f207311c = onHistoryRemoveListener;
        this.f207312d = onHistoryClearListener;
        android.view.View findViewById = activity.findViewById(com.p314xaae8f345.mm.R.id.h0r);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.ListView listView = (android.widget.ListView) findViewById;
        this.f207313e = listView;
        android.view.View inflate = android.view.LayoutInflater.from(activity).inflate(z17 ? com.p314xaae8f345.mm.R.C30864xbddafb2a.dd7 : com.p314xaae8f345.mm.R.C30864xbddafb2a.dd6, (android.view.ViewGroup) listView, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f207315g = inflate;
        b();
        listView.addFooterView(inflate);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.i5 i5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.i5(this);
        this.f207314f = i5Var;
        listView.setAdapter((android.widget.ListAdapter) i5Var);
        inflate.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.e5(this));
        listView.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.f5(this));
        listView.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.g5(activity));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k5.f207282c.put(java.lang.Integer.valueOf(hashCode()), this);
    }

    public final void a(java.lang.String str) {
        if (str != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k5.f207280a.b(str);
            android.view.View view = this.f207315g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/RingtoneSearchHistoryLogic", "onTextSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/search/RingtoneSearchHistoryLogic", "onTextSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k5 k5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k5.f207280a;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k5.f207281b.m75941xfb821914(0).isEmpty()) {
            android.view.View view = this.f207315g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/RingtoneSearchHistoryLogic", "updateHistoryFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/search/RingtoneSearchHistoryLogic", "updateHistoryFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f207315g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/RingtoneSearchHistoryLogic", "updateHistoryFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/search/RingtoneSearchHistoryLogic", "updateHistoryFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.d5
    /* renamed from: update */
    public void mo58947xce0038c9() {
        this.f207314f.notifyDataSetChanged();
    }
}
