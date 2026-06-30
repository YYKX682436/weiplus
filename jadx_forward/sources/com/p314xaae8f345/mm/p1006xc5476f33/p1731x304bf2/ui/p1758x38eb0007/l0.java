package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007;

/* loaded from: classes8.dex */
public class l0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 f223113d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 f223114e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.o0 f223115f;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.o0 o0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var) {
        this.f223115f = o0Var;
        this.f223113d = e1Var;
        this.f223114e = u1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.o0 o0Var = this.f223115f;
        android.view.ViewGroup.LayoutParams layoutParams = o0Var.f223135o.getLayoutParams();
        layoutParams.width = i65.a.b(o0Var.D.f223026f2, 66);
        o0Var.f223135o.setTextColor(o0Var.D.f223026f2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77660x7595c307));
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var = this.f223113d;
        int i17 = e1Var.f68477xfc824e7b;
        if (i17 == 0) {
            o0Var.f223135o.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aev);
            o0Var.f223135o.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.fmk));
            o0Var.f223135o.setTextColor(o0Var.D.f223026f2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29));
            e1Var.f68477xfc824e7b = 1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16016x82ee182a.q1(o0Var.D, e1Var.K2.f222098w, 3, "", 0, 1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16016x82ee182a.l1(o0Var.D, e1Var.K2.f222098w, e1Var.f68461xef5c29ba, 1);
        } else if (i17 != 2) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = this.f223114e;
            if (i17 != 3) {
                u1Var.q(false);
                u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.k0(this));
            } else {
                u1Var.q(false);
                u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.j0(this));
            }
        } else {
            o0Var.f223135o.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aev);
            o0Var.f223135o.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.fme));
            o0Var.f223135o.setTextColor(o0Var.D.f223026f2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29));
            layoutParams.width = i65.a.b(o0Var.D.f223026f2, 80);
            e1Var.f68477xfc824e7b = 3;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16016x82ee182a.q1(o0Var.D, e1Var.K2.f222098w, 3, "", 0, 1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16016x82ee182a.l1(o0Var.D, e1Var.K2.f222098w, e1Var.f68461xef5c29ba, 3);
        }
        o0Var.f223135o.setLayoutParams(layoutParams);
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
