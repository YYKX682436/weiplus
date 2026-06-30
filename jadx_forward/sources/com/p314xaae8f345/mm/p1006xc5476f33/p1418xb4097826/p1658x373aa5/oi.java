package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class oi implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f214323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.si f214324e;

    public oi(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.si siVar) {
        this.f214323d = view;
        this.f214324e = siVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow$initFirstPage$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.TextView textView = (android.widget.TextView) this.f214323d.findViewById(com.p314xaae8f345.mm.R.id.lks);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) this.f214323d.findViewById(com.p314xaae8f345.mm.R.id.lkn);
        textView.setTextColor(this.f214324e.f214573b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
        c22699x3dcdb352.m82040x7541828(this.f214324e.f214573b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
        this.f214323d.setBackgroundDrawable(this.f214324e.f214573b.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563062vo));
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ni niVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ni(this.f214324e);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(niVar, 200L, false);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("feedid", pm0.v.u(this.f214324e.f214574c));
        lVarArr[1] = new jz5.l("ad_label_option_type", 1);
        java.lang.String m75945x2fec8307 = this.f214324e.f214577f.m75945x2fec8307(4);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        lVarArr[2] = new jz5.l("promotion_buffer", m75945x2fec8307);
        ((cy1.a) rVar).Bj("promotion_comment_ad_label_option", "view_clk", kz5.c1.k(lVarArr), 1, false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow$initFirstPage$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
