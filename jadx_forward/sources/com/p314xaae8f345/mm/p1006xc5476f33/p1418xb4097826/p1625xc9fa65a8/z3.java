package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class z3 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.b4 f207526d;

    public z3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.b4 b4Var) {
        this.f207526d = b4Var;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f207526d.f207171i;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        java.util.List list = this.f207526d.f207171i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
        return list.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.w3 w3Var;
        android.view.View view2;
        int i18;
        int lineEnd;
        int i19;
        int i27;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.b4 b4Var = this.f207526d;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup);
            view2 = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b5e, viewGroup, false);
            w3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.w3(b4Var);
            android.view.View findViewById = view2.findViewById(com.p314xaae8f345.mm.R.id.eho);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            w3Var.f207491a = (android.widget.TextView) findViewById;
            android.view.View findViewById2 = view2.findViewById(com.p314xaae8f345.mm.R.id.ehn);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
            w3Var.f207492b = (android.widget.TextView) findViewById2;
            android.view.View findViewById3 = view2.findViewById(com.p314xaae8f345.mm.R.id.h0_);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
            w3Var.f207493c = (android.widget.TextView) findViewById3;
            android.view.View findViewById4 = view2.findViewById(com.p314xaae8f345.mm.R.id.d1y);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
            w3Var.f207494d = findViewById4;
            android.view.View findViewById5 = view2.findViewById(com.p314xaae8f345.mm.R.id.eif);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
            w3Var.f207495e = findViewById5;
            view2.setTag(w3Var);
        } else {
            java.lang.Object tag = view.getTag();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.search.FinderPopularListLogic.HotWordItemHolder");
            w3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.w3) tag;
            view2 = view;
        }
        java.util.List list = b4Var.f207171i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
        java.lang.String m75945x2fec8307 = ((r45.lu2) list.get(i17)).m75945x2fec8307(0);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        java.util.List list2 = b4Var.f207171i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list2);
        java.lang.String m75945x2fec83072 = ((r45.lu2) list2.get(i17)).m75945x2fec8307(5);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m75945x2fec83072)) {
            w3Var.b().setVisibility(0);
            w3Var.b().setText(m75945x2fec8307);
            android.widget.TextView textView = w3Var.f207492b;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lastLineText");
                throw null;
            }
            textView.setVisibility(8);
            w3Var.a().setVisibility(8);
            i18 = 4;
        } else {
            int i28 = b4Var.f207163a;
            android.text.StaticLayout staticLayout = new android.text.StaticLayout(m75945x2fec8307, 0, m75945x2fec8307.length(), w3Var.b().getPaint(), i28, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 1.0f, true);
            if (staticLayout.getLineCount() > 0) {
                int lineCount = staticLayout.getLineCount();
                staticLayout.getLineEnd(0);
                if (lineCount > 1) {
                    i19 = staticLayout.getLineEnd(staticLayout.getLineCount() - 2);
                    lineEnd = staticLayout.getLineEnd(staticLayout.getLineCount() - 1);
                } else {
                    lineEnd = staticLayout.getLineEnd(staticLayout.getLineCount() - 1);
                    i19 = 0;
                }
                java.lang.String substring = m75945x2fec8307.substring(i19, lineEnd);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPopularListLogic", "lastLineText :".concat(substring));
                android.widget.TextView textView2 = w3Var.f207492b;
                if (textView2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lastLineText");
                    throw null;
                }
                android.text.TextPaint paint = textView2.getPaint();
                float measureText = paint != null ? paint.measureText(substring, 0, substring.length()) : 0.0f;
                android.text.TextPaint paint2 = w3Var.a().getPaint();
                float measureText2 = paint2 != null ? paint2.measureText(m75945x2fec83072) : 0.0f;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPopularListLogic", "推荐原因不在同一行");
                w3Var.a().setVisibility(0);
                if (measureText + measureText2 + b4Var.f207164b > i28) {
                    w3Var.b().setVisibility(0);
                    w3Var.b().setText(m75945x2fec8307);
                    android.widget.TextView textView3 = w3Var.f207492b;
                    if (textView3 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lastLineText");
                        throw null;
                    }
                    textView3.setText("");
                    i18 = 4;
                    textView3.setVisibility(4);
                    android.view.View view3 = w3Var.f207495e;
                    if (view3 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lastLineDivider");
                        throw null;
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderPopularListLogic$PopularListAdapter", "setHotWord", "(Lcom/tencent/mm/plugin/finder/search/FinderPopularListLogic$HotWordItemHolder;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/finder/search/FinderPopularListLogic$PopularListAdapter", "setHotWord", "(Lcom/tencent/mm/plugin/finder/search/FinderPopularListLogic$HotWordItemHolder;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    w3Var.a().setText(m75945x2fec83072);
                } else {
                    i18 = 4;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPopularListLogic", "推荐原因在同一行");
                    if (lineCount == 1) {
                        w3Var.b().setVisibility(8);
                        i27 = 0;
                    } else {
                        i27 = 0;
                        w3Var.b().setVisibility(0);
                        android.widget.TextView b17 = w3Var.b();
                        java.lang.String substring2 = m75945x2fec8307.substring(0, i19);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
                        b17.setText(substring2);
                    }
                    android.widget.TextView textView4 = w3Var.f207492b;
                    if (textView4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lastLineText");
                        throw null;
                    }
                    textView4.setVisibility(i27);
                    textView4.setText(substring);
                    android.view.View view4 = w3Var.f207495e;
                    if (view4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lastLineDivider");
                        throw null;
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/FinderPopularListLogic$PopularListAdapter", "setHotWord", "(Lcom/tencent/mm/plugin/finder/search/FinderPopularListLogic$HotWordItemHolder;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/finder/search/FinderPopularListLogic$PopularListAdapter", "setHotWord", "(Lcom/tencent/mm/plugin/finder/search/FinderPopularListLogic$HotWordItemHolder;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    w3Var.a().setText(m75945x2fec83072);
                }
            } else {
                i18 = 4;
            }
        }
        if (i17 == getCount() - 1) {
            android.view.View view5 = w3Var.f207494d;
            if (view5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dividerView");
                throw null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/finder/search/FinderPopularListLogic$PopularListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/search/FinderPopularListLogic$PopularListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view6 = w3Var.f207494d;
            if (view6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dividerView");
                throw null;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/finder/search/FinderPopularListLogic$PopularListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/finder/search/FinderPopularListLogic$PopularListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int count = getCount();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = b4Var.f207166d;
        if (count == 1) {
            if (i17 == 0) {
                view2.setBackground(abstractActivityC21394xb3d2c0cf.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.auk));
            }
        } else if (getCount() > 1) {
            if (i17 == 0) {
                view2.setBackground(abstractActivityC21394xb3d2c0cf.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.aum));
            } else if (i17 == getCount() - 1) {
                view2.setBackground(abstractActivityC21394xb3d2c0cf.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.aul));
            } else {
                view2.setBackgroundColor(abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
            }
        }
        return view2;
    }
}
