package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes10.dex */
public final class a7 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 f193350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f193351e;

    public a7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 x7Var, android.view.ViewGroup viewGroup) {
        this.f193350d = x7Var;
        this.f193351e = viewGroup;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 x7Var = this.f193350d;
            java.util.Iterator it = x7Var.N.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k2) it.next()).a(x7Var.Q);
            }
            int i18 = x7Var.Q;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ViewOnClickListenerC14352x1d00aa30 viewOnClickListenerC14352x1d00aa30 = x7Var.f196572s;
            if (i18 == 0) {
                java.util.List list = ((mm2.o4) x7Var.P0(mm2.o4.class)).f410855q;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-newLinkMicUserList>(...)");
                kz5.h0.B(list, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.y6.f196691d);
                viewOnClickListenerC14352x1d00aa30.a(((mm2.o4) x7Var.P0(mm2.o4.class)).t7() > 0);
                ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(ml2.q2.f409358n, "", -1, -1);
                x7Var.f196573t.setBackgroundDrawable(this.f193351e.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.aja));
            } else if (i18 == 1) {
                java.util.List list2 = ((mm2.o4) x7Var.P0(mm2.o4.class)).f410855q;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "<get-newLinkMicUserList>(...)");
                kz5.h0.B(list2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z6.f196834d);
                viewOnClickListenerC14352x1d00aa30.b(((mm2.o4) x7Var.P0(mm2.o4.class)).u7() > 0);
                ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(ml2.q2.f409359o, "", -1, -1);
            }
            int i19 = x7Var.Q;
            android.widget.TextView textView = viewOnClickListenerC14352x1d00aa30.f197646e;
            android.widget.TextView textView2 = viewOnClickListenerC14352x1d00aa30.f197645d;
            if (i19 == 0) {
                textView2.setAlpha(1.0f);
                textView.setAlpha(0.5f);
            } else {
                textView2.setAlpha(0.5f);
                textView.setAlpha(1.0f);
            }
            x7Var.u1();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        int measuredWidth;
        int measuredWidth2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ViewOnClickListenerC14352x1d00aa30 viewOnClickListenerC14352x1d00aa30 = this.f193350d.f196572s;
        int i19 = com.p314xaae8f345.mm.ui.bl.b(this.f193351e.getContext()).x;
        viewOnClickListenerC14352x1d00aa30.getClass();
        float f17 = i19;
        float abs = (java.lang.Math.abs(i17) / f17) * 0.3f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveTextIndicator", "runTabColorAnimation dx: " + i17 + " totalX: " + i19 + " alphaOffset: " + abs + " offest: " + (java.lang.Math.abs(i17) / f17));
        android.widget.TextView textView = viewOnClickListenerC14352x1d00aa30.f197645d;
        android.widget.TextView textView2 = viewOnClickListenerC14352x1d00aa30.f197646e;
        if (i17 > 0) {
            float alpha = textView.getAlpha() - abs;
            textView.setAlpha(alpha >= 0.5f ? alpha : 0.5f);
            float alpha2 = textView2.getAlpha() + abs;
            textView2.setAlpha(alpha2 <= 1.0f ? alpha2 : 1.0f);
        } else {
            float alpha3 = textView.getAlpha() + abs;
            textView.setAlpha(alpha3 <= 1.0f ? alpha3 : 1.0f);
            float alpha4 = textView2.getAlpha() - abs;
            textView2.setAlpha(alpha4 >= 0.5f ? alpha4 : 0.5f);
        }
        android.view.ViewGroup.LayoutParams layoutParams = viewOnClickListenerC14352x1d00aa30.f197650i.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        float marginStart = ((android.view.ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() + textView.getMeasuredWidth() + viewOnClickListenerC14352x1d00aa30.f197647f.getMeasuredWidth();
        float abs2 = (java.lang.Math.abs(i17) / f17) * marginStart;
        android.view.View view = viewOnClickListenerC14352x1d00aa30.f197651m;
        if (i17 > 0) {
            float translationX = view.getTranslationX() + abs2;
            if (translationX <= marginStart) {
                marginStart = translationX;
            }
            view.setTranslationX(marginStart);
        } else {
            float translationX2 = view.getTranslationX() - abs2;
            if (translationX2 < 0.0f) {
                translationX2 = 0.0f;
            }
            view.setTranslationX(translationX2);
        }
        int abs3 = java.lang.Math.abs(textView.getMeasuredWidth() - textView2.getMeasuredWidth());
        if (abs3 == 0) {
            view.getLayoutParams().width = textView.getMeasuredWidth();
        } else {
            if (textView.getMeasuredWidth() > textView2.getMeasuredWidth()) {
                measuredWidth = textView.getMeasuredWidth();
                measuredWidth2 = textView2.getMeasuredWidth();
            } else {
                measuredWidth = textView2.getMeasuredWidth();
                measuredWidth2 = textView.getMeasuredWidth();
            }
            float abs4 = (java.lang.Math.abs(i17) / f17) * abs3;
            if (textView.getMeasuredWidth() > textView2.getMeasuredWidth()) {
                if (i17 > 0) {
                    android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    int i27 = view.getLayoutParams().width - ((int) abs4);
                    if (i27 >= measuredWidth2) {
                        measuredWidth2 = i27;
                    }
                    layoutParams2.width = measuredWidth2;
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                    int i28 = view.getLayoutParams().width + ((int) abs4);
                    if (i28 <= measuredWidth) {
                        measuredWidth = i28;
                    }
                    layoutParams3.width = measuredWidth;
                }
            } else if (i17 > 0) {
                android.view.ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                int i29 = view.getLayoutParams().width + ((int) abs4);
                if (i29 <= measuredWidth) {
                    measuredWidth = i29;
                }
                layoutParams4.width = measuredWidth;
            } else {
                android.view.ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
                int i37 = view.getLayoutParams().width - ((int) abs4);
                if (i37 >= measuredWidth2) {
                    measuredWidth2 = i37;
                }
                layoutParams5.width = measuredWidth2;
            }
        }
        view.requestLayout();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
