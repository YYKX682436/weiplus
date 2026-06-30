package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class lp extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pp f200501d;

    public lp(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pp ppVar) {
        this.f200501d = ppVar;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveMicSearchRecommAnchorPanelWidget$initRandomLinkGuideSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        ml2.q2 q2Var = ml2.q2.P;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "report21054 op: 44 ");
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(q2Var, "", -1, -1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pp ppVar = this.f200501d;
        ((mm2.o4) ppVar.f200928a.a(mm2.o4.class)).R = 4;
        ((mm2.o4) ppVar.f200928a.a(mm2.o4.class)).Q.mo7808x76db6cb1(java.lang.Boolean.TRUE);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveMicSearchRecommAnchorPanelWidget$initRandomLinkGuideSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        ds6.setColor(this.f200501d.f200929b.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
