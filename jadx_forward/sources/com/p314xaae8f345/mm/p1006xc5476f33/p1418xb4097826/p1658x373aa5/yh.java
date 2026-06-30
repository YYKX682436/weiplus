package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class yh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f214927d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ei f214928e;

    public yh(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ei eiVar) {
        this.f214927d = view;
        this.f214928e = eiVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderProductFeedbackWindow$initFirstPage$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f214927d;
        android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.lks);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view2.findViewById(com.p314xaae8f345.mm.R.id.lkn);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ei eiVar = this.f214928e;
        textView.setTextColor(eiVar.f213540b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
        c22699x3dcdb352.m82040x7541828(eiVar.f213540b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
        view2.setBackgroundDrawable(eiVar.f213540b.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563062vo));
        eiVar.f213545g.setVisibility(8);
        android.widget.TextView textView2 = eiVar.f213546h;
        textView2.setVisibility(0);
        android.widget.TextView textView3 = eiVar.f213547i;
        textView3.setVisibility(0);
        android.content.Context context = eiVar.f213540b;
        textView2.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oy6));
        textView3.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575293oy4));
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 c21475x81dbaa18 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18) eiVar.getContentView().findViewById(com.p314xaae8f345.mm.R.id.lko);
        android.view.View findViewById = eiVar.getContentView().findViewById(com.p314xaae8f345.mm.R.id.gdv);
        android.view.View findViewById2 = eiVar.getContentView().findViewById(com.p314xaae8f345.mm.R.id.gdw);
        android.widget.TextView textView4 = (android.widget.TextView) eiVar.getContentView().findViewById(com.p314xaae8f345.mm.R.id.e0j);
        if (textView4 != null) {
            textView4.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oxz));
            textView4.setBackground(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562590jk));
            textView4.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aby));
            textView4.setVisibility(0);
            textView4.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ci(eiVar, textView4));
        }
        c21475x81dbaa18.removeAllViews();
        for (r45.rw4 rw4Var : eiVar.f213549k) {
            java.lang.String m75945x2fec8307 = rw4Var.m75945x2fec8307(1);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            android.view.View a17 = eiVar.a(m75945x2fec8307, -1);
            c21475x81dbaa18.addView(a17);
            a17.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.di(a17, eiVar, rw4Var));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderProductFeedbackWindow", "initSecondPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/FinderProductFeedbackWindow", "initSecondPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/FinderProductFeedbackWindow", "initSecondPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/view/FinderProductFeedbackWindow", "initSecondPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderProductFeedbackWindow$initFirstPage$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
