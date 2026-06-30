package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class qi implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f214428d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.si f214429e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.jy0 f214430f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f214431g;

    public qi(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.si siVar, r45.jy0 jy0Var, android.widget.TextView textView) {
        this.f214428d = view;
        this.f214429e = siVar;
        this.f214430f = jy0Var;
        this.f214431g = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow$initSecondPage$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f214428d;
        android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.lks);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view2.findViewById(com.p314xaae8f345.mm.R.id.lkn);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.si siVar = this.f214429e;
        java.util.ArrayList arrayList2 = (java.util.ArrayList) siVar.f214582k;
        r45.jy0 reason = this.f214430f;
        if (arrayList2.contains(reason)) {
            textView.setTextColor(siVar.f214573b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
            c22699x3dcdb352.m82040x7541828(siVar.f214573b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
            view2.setBackgroundDrawable(siVar.f214573b.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563061vn));
            ((java.util.ArrayList) siVar.f214582k).remove(reason);
        } else {
            textView.setTextColor(siVar.f214573b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
            c22699x3dcdb352.m82040x7541828(siVar.f214573b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
            view2.setBackgroundDrawable(siVar.f214573b.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563062vo));
            java.util.List list = siVar.f214582k;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(reason, "$reason");
            ((java.util.ArrayList) list).add(reason);
        }
        android.widget.TextView applyBtn = this.f214431g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(applyBtn, "$applyBtn");
        siVar.b(applyBtn);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow$initSecondPage$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
