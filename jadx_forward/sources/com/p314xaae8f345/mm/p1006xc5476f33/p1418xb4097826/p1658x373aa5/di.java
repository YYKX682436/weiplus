package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class di implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f213429d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ei f213430e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.rw4 f213431f;

    public di(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ei eiVar, r45.rw4 rw4Var) {
        this.f213429d = view;
        this.f213430e = eiVar;
        this.f213431f = rw4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderProductFeedbackWindow$initSecondPage$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f213429d;
        android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.lks);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view2.findViewById(com.p314xaae8f345.mm.R.id.lkn);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ei eiVar = this.f213430e;
        java.util.ArrayList arrayList2 = (java.util.ArrayList) eiVar.f213548j;
        r45.rw4 rw4Var = this.f213431f;
        if (arrayList2.contains(rw4Var)) {
            textView.setTextColor(eiVar.f213540b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
            c22699x3dcdb352.m82040x7541828(eiVar.f213540b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
            view2.setBackgroundDrawable(eiVar.f213540b.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563061vn));
            ((java.util.ArrayList) eiVar.f213548j).remove(rw4Var);
        } else {
            textView.setTextColor(eiVar.f213540b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
            c22699x3dcdb352.m82040x7541828(eiVar.f213540b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
            view2.setBackgroundDrawable(eiVar.f213540b.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563062vo));
            ((java.util.ArrayList) eiVar.f213548j).add(rw4Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderProductFeedbackWindow$initSecondPage$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
