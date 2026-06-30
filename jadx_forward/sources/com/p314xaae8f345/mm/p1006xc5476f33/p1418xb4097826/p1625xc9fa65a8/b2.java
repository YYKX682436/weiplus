package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class b2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160 f207160d;

    public b2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160 activityC14945x8c20f160) {
        this.f207160d = activityC14945x8c20f160;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/search/FinderFeedSearchUI$mOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        if (i17 == 0) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160.U1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160 activityC14945x8c20f160 = this.f207160d;
            if (!activityC14945x8c20f160.h7()) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = recyclerView.getLayoutManager();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = recyclerView.mo7946xf939df19();
                int mo1894x7e414b06 = mo7946xf939df19 != null ? mo7946xf939df19.mo1894x7e414b06() : 0;
                int w17 = c1162x665295de.w();
                int y17 = c1162x665295de.y();
                if (activityC14945x8c20f160.P1) {
                    w17 = y17;
                }
                if (w17 != -1 && mo1894x7e414b06 - w17 <= 3) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedSearchUI", "startPreloadNextHotWord currentPos:" + w17 + " itemCount:" + mo1894x7e414b06);
                    int i19 = activityC14945x8c20f160.f207084x;
                    activityC14945x8c20f160.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedSearchUI", "startPreloadNextHotWord  continueFlag：" + i19);
                    if (i19 == 1) {
                        java.lang.String str = activityC14945x8c20f160.f207082v;
                        if (str != null) {
                            activityC14945x8c20f160.x7(str, true);
                        }
                    } else if (activityC14945x8c20f160.w7(true)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedSearchUI", "start Preload SearchNextHot loading");
                    } else if (activityC14945x8c20f160.f207087y == 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedSearchUI", "start preload SearchList loading");
                        if (!activityC14945x8c20f160.g7(null, true)) {
                            activityC14945x8c20f160.q7();
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedSearchUI", "startPreloadNextHotWord nothing");
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI$mOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        int i19;
        android.view.View view;
        int i27;
        boolean z17;
        boolean z18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/search/FinderFeedSearchUI$mOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        int i28 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160.U1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160 activityC14945x8c20f160 = this.f207160d;
        if (!activityC14945x8c20f160.h7()) {
            activityC14945x8c20f160.getClass();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = recyclerView.getLayoutManager();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            activityC14945x8c20f160.P1 = !((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager).getF180019n() ? i18 < 0 : i17 < 0;
            activityC14945x8c20f160.getClass();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager2;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = recyclerView.mo7946xf939df19();
            if (mo7946xf939df19 != null) {
                mo7946xf939df19.mo1894x7e414b06();
            }
            int w17 = c1162x665295de.w();
            int y17 = c1162x665295de.y();
            if (activityC14945x8c20f160.P1) {
                i27 = y17 - 1;
                i19 = y17 + 1;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = recyclerView.p0(y17);
                view = p07 != null ? p07.f3639x46306858 : null;
            } else {
                int i29 = w17 + 1;
                i19 = w17 - 1;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p08 = recyclerView.p0(w17);
                view = p08 != null ? p08.f3639x46306858 : null;
                i27 = i29;
                y17 = w17;
            }
            if (view != null) {
                java.util.Iterator it = activityC14945x8c20f160.T1.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z17 = false;
                        break;
                    }
                    android.view.View findViewById = view.findViewById(((java.lang.Number) it.next()).intValue());
                    if (findViewById != null && findViewById.getVisibility() == 0) {
                        z17 = true;
                        break;
                    }
                }
                if (z17) {
                    boolean z19 = activityC14945x8c20f160.P1;
                    java.lang.String k76 = activityC14945x8c20f160.k7(i19);
                    if (z19) {
                        if (k76 != null) {
                            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.me9);
                            if (c22699x3dcdb352 != null) {
                                c22699x3dcdb352.setRotation(0.0f);
                            }
                            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.me_);
                            if (textView != null) {
                                textView.setText(view.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f2x, "\"" + k76 + '\"'));
                            }
                        }
                    } else if (k76 != null) {
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.me9);
                        if (c22699x3dcdb3522 != null) {
                            c22699x3dcdb3522.setRotation(180.0f);
                        }
                        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.me_);
                        if (textView2 != null) {
                            textView2.setText(view.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f2y, "\"" + k76 + '\"'));
                        }
                    }
                } else {
                    boolean z27 = activityC14945x8c20f160.P1;
                    java.util.Iterator it6 = activityC14945x8c20f160.Q1.entrySet().iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            z18 = false;
                            break;
                        }
                        java.util.Map.Entry entry = (java.util.Map.Entry) it6.next();
                        int intValue = ((java.lang.Number) entry.getKey()).intValue();
                        if (i27 == intValue) {
                            z18 = true;
                            break;
                        }
                    }
                    if (z18) {
                        i27 = z27 ? i27 - 1 : i27 + 1;
                    }
                    java.lang.String k77 = activityC14945x8c20f160.k7(i27);
                    java.lang.String k78 = activityC14945x8c20f160.k7(y17);
                    if (!android.text.TextUtils.isEmpty(k77) && !android.text.TextUtils.isEmpty(k78) && !android.text.TextUtils.equals(k77, k78) && !android.text.TextUtils.equals(activityC14945x8c20f160.S1, k78)) {
                        android.graphics.Rect rect = new android.graphics.Rect();
                        view.getGlobalVisibleRect(rect);
                        if (((double) rect.height()) > ((double) view.getHeight()) * 0.5d) {
                            com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb92 = activityC14945x8c20f160.f207080t;
                            if (c22482x50bddb92 == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
                                throw null;
                            }
                            java.lang.String string = c22482x50bddb92.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f2v, "\"" + k78 + '\"');
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                            activityC14945x8c20f160.s7(string);
                            view.performHapticFeedback(0, 3);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.u4 u4Var = activityC14945x8c20f160.W;
                            if (u4Var == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchSuggestionManager");
                                throw null;
                            }
                            u4Var.f207424l = k78 == null ? "" : k78;
                            com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb922 = activityC14945x8c20f160.f207080t;
                            if (c22482x50bddb922 == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
                                throw null;
                            }
                            c22482x50bddb922.m80997xdc5215a6().q(k78, null, true);
                            com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb923 = activityC14945x8c20f160.f207080t;
                            if (c22482x50bddb923 == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
                                throw null;
                            }
                            java.lang.String string2 = c22482x50bddb923.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f2v, "\"" + k78 + '\"');
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                            activityC14945x8c20f160.s7(string2);
                            if (k78 == null) {
                                k78 = "";
                            }
                            activityC14945x8c20f160.S1 = k78;
                            activityC14945x8c20f160.m7(k78);
                        }
                    }
                }
            }
        }
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.Kh((zy2.zb) c17, recyclerView, ml2.x1.f409735f, "6", ml2.y.f409772d, 0, 0L, 0, 112, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI$mOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
