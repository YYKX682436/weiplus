package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class jh extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh f194637d;

    public jh(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh khVar) {
        this.f194637d = khVar;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin$showExceptionTipPanel$linkSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh khVar = this.f194637d;
        khVar.getClass();
        mm2.e1 e1Var = (mm2.e1) dk2.ef.f314905a.i(mm2.e1.class);
        r45.oa4 oa4Var = e1Var != null ? e1Var.f410529z : null;
        java.util.LinkedList linkedList = oa4Var != null ? oa4Var.I : null;
        if (linkedList != null) {
            int i17 = dk2.ef.f314909c;
            int i18 = oa4Var.f463608J;
            if (i17 <= 0) {
                i17 = i18;
            }
            android.view.ViewGroup viewGroup = khVar.f446856d;
            android.content.Context context = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c5 c5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c5(context);
            c5Var.f199498b = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dh(khVar);
            c5Var.a(viewGroup.getContext().getResources().getConfiguration().orientation == 2, linkedList, i17);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin$showExceptionTipPanel$linkSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        super.updateDrawState(ds6);
        ds6.setUnderlineText(false);
    }
}
