package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class hx implements com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ty f194407a;

    public hx(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ty tyVar) {
        this.f194407a = tyVar;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.e
    public void a(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c view, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ty tyVar = this.f194407a;
        tyVar.f196020p1.invalidateOutline();
        if (tyVar.f196020p1.getVisibility() == 0) {
            android.view.ViewGroup.LayoutParams layoutParams = tyVar.f196020p1.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            r1 = (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0) + tyVar.f196020p1.getHeight() + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c = tyVar.f196029x0;
        int m19973xa8f0dc02 = (c2678xa407981c != null ? c2678xa407981c.m19973xa8f0dc02() : tyVar.f196032y0) - r1;
        float min = m19973xa8f0dc02 == 0 ? 0.0f : java.lang.Math.min(java.lang.Math.abs(i17 * 1.0f) / m19973xa8f0dc02, 1.0f);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159 = tyVar.S;
        int i18 = tyVar.f196017l1;
        tyVar.getClass();
        c22645x24069159.setBackgroundColor(android.graphics.Color.argb((int) (android.graphics.Color.alpha(i18) * min), android.graphics.Color.red(i18), android.graphics.Color.green(i18), android.graphics.Color.blue(i18)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tyVar.f196021q, "onOffsetChanged fraction:" + min + " offset " + i17);
    }
}
