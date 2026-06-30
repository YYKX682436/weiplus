package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes3.dex */
public final class e extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f210614d;

    /* renamed from: e, reason: collision with root package name */
    public final android.app.Activity f210615e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f210616f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.p f210617g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.p f210618h;

    public e(android.app.Activity context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f210614d = "Finder.FansListAdapter";
        this.f210615e = context;
        this.f210616f = new java.util.ArrayList();
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public r45.q21 getItem(int i17) {
        java.lang.Object obj = this.f210616f.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        return (r45.q21) obj;
    }

    public final void c(java.util.List contacts) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contacts, "contacts");
        java.util.ArrayList arrayList = this.f210616f;
        arrayList.clear();
        arrayList.addAll(contacts);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f210616f.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        java.lang.String str;
        int i18;
        android.app.Activity activity = this.f210615e;
        if (view == null) {
            view2 = android.view.View.inflate(activity, com.p314xaae8f345.mm.R.C30864xbddafb2a.agt, null);
            view2.setTag(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.a());
        } else {
            view2 = view;
        }
        java.lang.Object tag = view2.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.FansListAdapter.ContactViewHolder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.a) tag;
        android.view.View findViewById = view2.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        aVar.f210366a = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = view2.findViewById(com.p314xaae8f345.mm.R.id.kbq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        aVar.f210367b = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = view2.findViewById(com.p314xaae8f345.mm.R.id.ag6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        aVar.f210368c = (android.widget.TextView) findViewById3;
        aVar.f210369d = view2.findViewById(com.p314xaae8f345.mm.R.id.frp);
        r45.q21 item = getItem(i17);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) item.m75936x14adae67(0);
        if (c19782x23db1cfa == null || (str = c19782x23db1cfa.m76175x6d346f39()) == null) {
            str = "";
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        int m75939xb282bd08 = item.m75939xb282bd08(4);
        mn2.g1 g1Var = mn2.g1.f411508a;
        if (m75939xb282bd08 == 0) {
            vo0.d l17 = g1Var.l();
            mn2.n nVar = new mn2.n(str, null, 2, null);
            android.widget.ImageView imageView = aVar.f210366a;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("avatarIv");
                throw null;
            }
            l17.c(nVar, imageView, g1Var.h(mn2.f1.f411494o));
        } else {
            vo0.d a17 = g1Var.a();
            mn2.n nVar2 = new mn2.n(str, null, 2, null);
            android.widget.ImageView imageView2 = aVar.f210366a;
            if (imageView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("avatarIv");
                throw null;
            }
            a17.c(nVar2, imageView2, g1Var.h(mn2.f1.f411490h));
        }
        android.widget.TextView textView = aVar.f210367b;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nicknameTv");
            throw null;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        i95.m c17 = i95.n0.c(c61.yb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c61.yb ybVar = (c61.yb) c17;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) item.m75936x14adae67(0);
        java.lang.String m76197x6c03c64c = c19782x23db1cfa2 != null ? c19782x23db1cfa2.m76197x6c03c64c() : null;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) item.m75936x14adae67(0);
        java.lang.String md6 = c61.yb.md(ybVar, m76197x6c03c64c, c19782x23db1cfa3 != null ? c19782x23db1cfa3.m76184x8010e5e4() : null, false, 4, null);
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(activity, md6));
        java.util.ArrayList arrayList = this.f210616f;
        java.util.ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i18 = -1;
                break;
            }
            if (((r45.q21) listIterator.previous()).m75939xb282bd08(1) == 1) {
                i18 = listIterator.nextIndex();
                break;
            }
        }
        if (i18 != i17 || i17 == getCount() - 1) {
            android.widget.TextView textView2 = aVar.f210368c;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("beforeTip");
                throw null;
            }
            textView2.setVisibility(8);
        } else {
            android.widget.TextView textView3 = aVar.f210368c;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("beforeTip");
                throw null;
            }
            textView3.setVisibility(0);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[show_finder_identity] ");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa4 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) item.m75936x14adae67(0);
        sb6.append(c19782x23db1cfa4 != null ? c19782x23db1cfa4.m76184x8010e5e4() : null);
        sb6.append(' ');
        r45.ub1 ub1Var = (r45.ub1) item.m75936x14adae67(7);
        sb6.append(ub1Var != null ? java.lang.Integer.valueOf(ub1Var.m75939xb282bd08(0)) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f210614d, sb6.toString());
        android.view.View view3 = aVar.f210369d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Boolean) t70Var.L1().r()).booleanValue()) {
            android.widget.ImageView imageView3 = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.tbk);
            if (view3 != null && imageView3 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.c3 c3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.c3.f183585a;
                r45.ub1 ub1Var2 = (r45.ub1) item.m75936x14adae67(7);
                boolean z18 = ub1Var2 != null && ub1Var2.m75939xb282bd08(0) == 1;
                r45.ub1 ub1Var3 = (r45.ub1) item.m75936x14adae67(7);
                c3Var.a(view3, imageView3, z18, ub1Var3 != null ? (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc) ub1Var3.m75936x14adae67(1) : null, false, this.f210615e);
                if (((java.lang.Number) t70Var.u0().r()).intValue() != 1) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/FansListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/finder/ui/FansListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        } else {
            if (((java.lang.Number) t70Var.u0().r()).intValue() == 1) {
                r45.ub1 ub1Var4 = (r45.ub1) item.m75936x14adae67(7);
                if (ub1Var4 != null && ub1Var4.m75939xb282bd08(0) == 1) {
                    android.view.View view4 = aVar.f210369d;
                    if (view4 != null) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                        arrayList3.add(0);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/ui/FansListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view4, "com/tencent/mm/plugin/finder/ui/FansListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            }
            android.view.View view5 = aVar.f210369d;
            if (view5 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/finder/ui/FansListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/finder/ui/FansListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        android.view.View findViewById4 = view2.findViewById(com.p314xaae8f345.mm.R.id.f565840ds5);
        if (getItem(i17).m75933x41a8a7f2(3)) {
            findViewById4.setOnLongClickListener(null);
            findViewById4.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.b(this, findViewById4, i17));
        } else {
            findViewById4.setOnLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.c(this, findViewById4, i17));
            findViewById4.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.d(this, findViewById4, i17));
        }
        return view2;
    }
}
