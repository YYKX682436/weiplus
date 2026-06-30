package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class tt implements com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv f196009a;

    public tt(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv ivVar) {
        this.f196009a = ivVar;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.e
    public void a(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c view, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv ivVar = this.f196009a;
        ivVar.E1.invalidateOutline();
        if (ivVar.E1.getVisibility() == 0) {
            android.view.ViewGroup.LayoutParams layoutParams = ivVar.E1.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            r1 = (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0) + ivVar.E1.getHeight() + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c = ivVar.B1;
        int m19973xa8f0dc02 = (c2678xa407981c != null ? c2678xa407981c.m19973xa8f0dc02() : ivVar.C1) - r1;
        float min = m19973xa8f0dc02 == 0 ? 0.0f : java.lang.Math.min(java.lang.Math.abs(i17 * 1.0f) / m19973xa8f0dc02, 1.0f);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159 = ivVar.Y;
        int i18 = ivVar.D1;
        ivVar.getClass();
        c22645x24069159.setBackgroundColor(android.graphics.Color.argb((int) (android.graphics.Color.alpha(i18) * min), android.graphics.Color.red(i18), android.graphics.Color.green(i18), android.graphics.Color.blue(i18)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ivVar.f194549r, "onOffsetChanged fraction:" + min + " offset " + i17);
    }
}
