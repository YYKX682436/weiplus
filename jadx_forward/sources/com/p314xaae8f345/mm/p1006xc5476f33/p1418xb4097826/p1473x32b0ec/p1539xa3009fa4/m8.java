package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class m8 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.s8 f198790d;

    public m8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.s8 s8Var) {
        this.f198790d = s8Var;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorHonorRankSwitchUIC$initDescSpan$1$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.s8 s8Var = this.f198790d;
        if (s8Var.f198941p == null) {
            s8Var.f198941p = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r4(s8Var.m80379x76847179(), null, 2, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r4 r4Var = s8Var.f198941p;
        if (r4Var != null) {
            r4Var.w();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorHonorRankSwitchUIC$initDescSpan$1$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        ds6.setColor(this.f198790d.m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
