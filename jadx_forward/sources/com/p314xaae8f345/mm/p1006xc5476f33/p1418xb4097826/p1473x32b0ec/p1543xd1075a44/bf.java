package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class bf extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.cf f199409d;

    public bf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.cf cfVar) {
        this.f199409d = cfVar;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View p07) {
        java.lang.String str;
        r45.eq1 eq1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(p07);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansBuildWidget$setSubTitleContent$1$rightSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        android.content.Intent intent = new android.content.Intent();
        mm2.n2 n2Var = (mm2.n2) dk2.ef.f314905a.i(mm2.n2.class);
        if (n2Var == null || (eq1Var = n2Var.f410812g) == null || (str = eq1Var.m75945x2fec8307(3)) == null) {
            str = "";
        }
        intent.putExtra("rawUrl", str);
        intent.putExtra("convertActivityFromTranslucent", true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.cf cfVar = this.f199409d;
        android.view.View view = cfVar.K;
        j45.l.j(view != null ? view.getContext() : null, "webview", ".ui.tools.WebViewUI", intent, null);
        cfVar.e0();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansBuildWidget$setSubTitleContent$1$rightSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        ds6.setColor(this.f199409d.f199716e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
