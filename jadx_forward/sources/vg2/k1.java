package vg2;

/* loaded from: classes3.dex */
public final class k1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.r1 f518067d;

    public k1(vg2.r1 r1Var) {
        this.f518067d = r1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        df2.pl plVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/gift/widget/GiftSkinSelectPanelWidget$customTextEntrance$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vg2.r1 r1Var = this.f518067d;
        r1Var.g();
        r1Var.f518095c.mo152xb9724478();
        if (r1Var.f518093a.getResources().getConfiguration().orientation == 2) {
            dk2.ef efVar = dk2.ef.f314905a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
            if (k0Var != null && (hmVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm) k0Var.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm.class)) != null) {
                java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm.T1;
                hmVar.p1("PORTRAIT_ACTION_PARAMS_SHOW_CUSTOM_TEXT_PANEL", r1Var.f518100h.c1().mo14344x5f01b1f6());
            }
        } else {
            dk2.ef efVar2 = dk2.ef.f314905a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = dk2.ef.f314904J;
            if (c14197x319b1b9e != null && (plVar = (df2.pl) c14197x319b1b9e.m56798x25fe639c(df2.pl.class)) != null) {
                plVar.f7(r1Var.f518100h);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/gift/widget/GiftSkinSelectPanelWidget$customTextEntrance$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
