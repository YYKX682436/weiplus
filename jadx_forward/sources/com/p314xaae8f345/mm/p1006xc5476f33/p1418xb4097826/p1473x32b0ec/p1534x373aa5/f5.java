package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class f5 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14315xbe4ed405 f197824d;

    public f5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14315xbe4ed405 c14315xbe4ed405) {
        this.f197824d = c14315xbe4ed405;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveFoldTextView$makeFoldingText$2$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14315xbe4ed405 c14315xbe4ed405 = this.f197824d;
        c14315xbe4ed405.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveFoldTextView", "unfold execute");
        c14315xbe4ed405.m84175x8dd5167d(88);
        c14315xbe4ed405.b(c14315xbe4ed405.f197432y0);
        c14315xbe4ed405.isFolding = false;
        yz5.a aVar = c14315xbe4ed405.unFoldListener;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveFoldTextView$makeFoldingText$2$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        super.updateDrawState(ds6);
        ds6.setUnderlineText(false);
        ds6.setColor(this.f197824d.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560582ak4));
    }
}
