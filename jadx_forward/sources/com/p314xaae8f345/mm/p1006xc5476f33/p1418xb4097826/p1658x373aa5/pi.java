package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class pi implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f214373d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.si f214374e;

    public pi(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.si siVar) {
        this.f214373d = view;
        this.f214374e = siVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.LinkedList<r45.jy0> m75941xfb821914;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow$initFirstPage$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f214373d;
        android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.lks);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view2.findViewById(com.p314xaae8f345.mm.R.id.lkn);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.si siVar = this.f214374e;
        textView.setTextColor(siVar.f214573b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
        c22699x3dcdb352.m82040x7541828(siVar.f214573b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
        view2.setBackgroundDrawable(siVar.f214573b.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563062vo));
        siVar.f214579h.setVisibility(8);
        android.widget.TextView textView2 = siVar.f214580i;
        textView2.setVisibility(0);
        android.widget.TextView textView3 = siVar.f214581j;
        textView3.setVisibility(0);
        android.content.Context context = siVar.f214573b;
        textView2.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cp7));
        textView3.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572836cp5));
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 c21475x81dbaa18 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18) siVar.getContentView().findViewById(com.p314xaae8f345.mm.R.id.lko);
        android.view.View findViewById = siVar.getContentView().findViewById(com.p314xaae8f345.mm.R.id.gdv);
        android.view.View findViewById2 = siVar.getContentView().findViewById(com.p314xaae8f345.mm.R.id.gdw);
        android.widget.TextView textView4 = (android.widget.TextView) siVar.getContentView().findViewById(com.p314xaae8f345.mm.R.id.e0j);
        textView4.setVisibility(0);
        siVar.b(textView4);
        c21475x81dbaa18.removeAllViews();
        r45.qy0 qy0Var = siVar.f214577f;
        if (qy0Var != null && (m75941xfb821914 = qy0Var.m75941xfb821914(1)) != null) {
            for (r45.jy0 jy0Var : m75941xfb821914) {
                java.lang.String m75945x2fec8307 = jy0Var.m75945x2fec8307(1);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                android.view.View a17 = siVar.a(m75945x2fec8307, -1);
                c21475x81dbaa18.addView(a17);
                a17.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.qi(a17, siVar, jy0Var, textView4));
            }
        }
        textView4.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ri(siVar));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow", "initSecondPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow", "initSecondPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow", "initSecondPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow", "initSecondPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("feedid", pm0.v.u(siVar.f214574c));
        lVarArr[1] = new jz5.l("ad_label_option_type", 2);
        java.lang.String m75945x2fec83072 = siVar.f214577f.m75945x2fec8307(4);
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        lVarArr[2] = new jz5.l("promotion_buffer", m75945x2fec83072);
        ((cy1.a) rVar).Bj("promotion_comment_ad_label_option", "view_clk", kz5.c1.k(lVarArr), 1, false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow$initFirstPage$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
