package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class q2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f214400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s2 f214401e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f214402f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f214403g;

    public q2(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s2 s2Var, java.lang.Object obj, android.widget.TextView textView) {
        this.f214400d = view;
        this.f214401e = s2Var;
        this.f214402f = obj;
        this.f214403g = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderBaseAdFeedbackWindow$initSecondPage$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f214400d;
        android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.lks);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view2.findViewById(com.p314xaae8f345.mm.R.id.lkn);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s2 s2Var = this.f214401e;
        java.util.ArrayList arrayList2 = (java.util.ArrayList) s2Var.f214539n;
        java.lang.Object obj = this.f214402f;
        if (arrayList2.contains(obj)) {
            textView.setTextColor(s2Var.f214527b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
            c22699x3dcdb352.m82040x7541828(s2Var.f214527b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
            view2.setBackgroundDrawable(s2Var.f214527b.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563061vn));
            ((java.util.ArrayList) s2Var.f214539n).remove(obj);
        } else {
            textView.setTextColor(s2Var.f214527b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
            c22699x3dcdb352.m82040x7541828(s2Var.f214527b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
            view2.setBackgroundDrawable(s2Var.f214527b.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563062vo));
            ((java.util.ArrayList) s2Var.f214539n).add(obj);
        }
        android.widget.TextView applyBtn = this.f214403g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(applyBtn, "$applyBtn");
        s2Var.b(applyBtn);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderBaseAdFeedbackWindow$initSecondPage$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
