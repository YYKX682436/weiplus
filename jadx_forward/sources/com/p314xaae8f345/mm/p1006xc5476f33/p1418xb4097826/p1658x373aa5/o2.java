package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class o2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f214292d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s2 f214293e;

    public o2(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s2 s2Var) {
        this.f214292d = view;
        this.f214293e = s2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderBaseAdFeedbackWindow$initFirstPage$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.TextView textView = (android.widget.TextView) this.f214292d.findViewById(com.p314xaae8f345.mm.R.id.lks);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) this.f214292d.findViewById(com.p314xaae8f345.mm.R.id.lkn);
        textView.setTextColor(this.f214293e.f214527b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
        c22699x3dcdb352.m82040x7541828(this.f214293e.f214527b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
        this.f214292d.setBackgroundDrawable(this.f214293e.f214527b.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563062vo));
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.n2 n2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.n2(this.f214293e);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(n2Var, 200L, false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderBaseAdFeedbackWindow$initFirstPage$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
