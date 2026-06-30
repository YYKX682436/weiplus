package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class d2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f213406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.g2 f213407e;

    public d2(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.g2 g2Var) {
        this.f213406d = view;
        this.f213407e = g2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.LinkedList<r45.jy0> m75941xfb821914;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow$initFirstPage$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f213406d;
        android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.lks);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view2.findViewById(com.p314xaae8f345.mm.R.id.lkn);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.g2 g2Var = this.f213407e;
        textView.setTextColor(g2Var.f213663b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
        c22699x3dcdb352.m82040x7541828(g2Var.f213663b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
        view2.setBackgroundDrawable(g2Var.f213663b.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563062vo));
        g2Var.f213671j.setVisibility(8);
        android.widget.TextView textView2 = g2Var.f213672k;
        textView2.setVisibility(0);
        android.widget.TextView textView3 = g2Var.f213673l;
        textView3.setVisibility(0);
        android.content.Context context = g2Var.f213663b;
        textView2.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cp7));
        textView3.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572836cp5));
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 c21475x81dbaa18 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18) g2Var.getContentView().findViewById(com.p314xaae8f345.mm.R.id.lko);
        android.view.View findViewById = g2Var.getContentView().findViewById(com.p314xaae8f345.mm.R.id.gdv);
        android.view.View findViewById2 = g2Var.getContentView().findViewById(com.p314xaae8f345.mm.R.id.gdw);
        android.widget.TextView textView4 = (android.widget.TextView) g2Var.getContentView().findViewById(com.p314xaae8f345.mm.R.id.e0j);
        textView4.setVisibility(0);
        g2Var.b(textView4);
        c21475x81dbaa18.removeAllViews();
        r45.ky0 ky0Var = g2Var.f213668g;
        if (ky0Var != null && (m75941xfb821914 = ky0Var.m75941xfb821914(6)) != null) {
            for (r45.jy0 jy0Var : m75941xfb821914) {
                java.lang.String m75945x2fec8307 = jy0Var.m75945x2fec8307(1);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                android.view.View a17 = g2Var.a(m75945x2fec8307, -1);
                c21475x81dbaa18.addView(a17);
                a17.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e2(a17, g2Var, jy0Var, textView4));
            }
        }
        textView4.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.f2(g2Var));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow", "initSecondPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow", "initSecondPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow", "initSecondPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow", "initSecondPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow$initFirstPage$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
