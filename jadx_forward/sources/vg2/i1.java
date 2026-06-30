package vg2;

/* loaded from: classes3.dex */
public final class i1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.r1 f518053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f518054e;

    public i1(vg2.r1 r1Var, android.widget.TextView textView) {
        this.f518053d = r1Var;
        this.f518054e = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        df2.pk pkVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/gift/widget/GiftSkinSelectPanelWidget$customGiftContentRootEntrance$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dk2.u7 u7Var = dk2.u7.f315714a;
        vg2.r1 r1Var = this.f518053d;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dk2.u7.f315720g.get(r1Var.f518100h.f67814x2c488eb6), java.lang.Boolean.TRUE);
        android.widget.TextView textView = this.f518054e;
        if (!b17) {
            db5.t7.e(textView.getContext(), textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dbu), com.p314xaae8f345.mm.R.raw.f79467x1a23b4e);
        } else if (textView.getContext().getResources().getConfiguration().orientation == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
            if (k0Var != null && (hmVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm) k0Var.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm.class)) != null) {
                java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm.T1;
                hmVar.p1("PORTRAIT_ACTION_PARAMS_SHOW_CUSTOM_GIFT", r1Var.f518100h.c1().mo14344x5f01b1f6());
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = dk2.ef.f314904J;
            if (c14197x319b1b9e != null && (pkVar = (df2.pk) c14197x319b1b9e.m56798x25fe639c(df2.pk.class)) != null) {
                pkVar.h7(r1Var.f518100h, r1Var.f518102j);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/gift/widget/GiftSkinSelectPanelWidget$customGiftContentRootEntrance$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
