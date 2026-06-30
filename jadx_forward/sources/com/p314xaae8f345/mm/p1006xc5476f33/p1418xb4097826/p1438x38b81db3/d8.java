package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class d8 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.i8 f184665d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f184666e;

    public d8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.i8 i8Var, in5.s0 s0Var) {
        this.f184665d = i8Var;
        this.f184666e = s0Var;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert$setNoLbsSameCityPermission$3", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        yz5.a aVar = this.f184665d.f185181f;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert$setNoLbsSameCityPermission$3", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        boolean z17 = this.f184665d.f185183h;
        in5.s0 s0Var = this.f184666e;
        if (z17) {
            ds6.setColor(s0Var.f374654e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77842x986b2aef));
        } else {
            ds6.setColor(s0Var.f374654e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c));
        }
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
