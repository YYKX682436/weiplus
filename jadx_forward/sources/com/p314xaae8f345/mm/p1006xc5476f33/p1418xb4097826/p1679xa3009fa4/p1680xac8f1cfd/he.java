package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class he implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.je f216154d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f216155e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f216156f;

    public he(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.je jeVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, in5.s0 s0Var) {
        this.f216154d = jeVar;
        this.f216155e = abstractC14490x69736cb5;
        this.f216156f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneBubbleUIC$onBindView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.je jeVar = this.f216154d;
        r45.u25 u25Var = jeVar.f216392o;
        jeVar.h7(this.f216155e, u25Var != null ? u25Var.m75945x2fec8307(4) : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff90 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90) this.f216156f.p(com.p314xaae8f345.mm.R.id.ghd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c15178x4303ff90);
        cw2.ca.d(c15178x4303ff90, null, false, 3, null);
        in5.s0 s0Var = this.f216156f;
        android.content.Context context = s0Var.f374654e;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f216155e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y5 y5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y5.f184249a;
            r45.u25 u25Var2 = jeVar.f216392o;
            y5Var.d(abstractActivityC21394xb3d2c0cf, abstractC14490x69736cb5, 4L, false, u25Var2 != null ? u25Var2.m75945x2fec8307(4) : null, jeVar.f215800g, jeVar.f215801h, s0Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ge(c15178x4303ff90));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneBubbleUIC$onBindView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
