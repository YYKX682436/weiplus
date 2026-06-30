package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class y0 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d1 f218042d;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d1 d1Var) {
        this.f218042d = d1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i17;
        boolean z17;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d1 d1Var = this.f218042d;
        android.view.ViewGroup O6 = d1Var.O6();
        boolean z18 = false;
        if (O6 != null) {
            int[] iArr = d1Var.f215598o;
            O6.getLocationInWindow(iArr);
            int measuredHeight = iArr[1] + O6.getMeasuredHeight();
            android.view.ViewGroup.LayoutParams layoutParams = O6.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            i17 = measuredHeight - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        } else {
            i17 = 0;
        }
        d1Var.f215599p = i17;
        int i18 = d1Var.f215599p;
        if (i18 != d1Var.f215600q) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a aVar = d1Var.f215597n;
            if (aVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.lh lhVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.lh) aVar;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = lhVar.f185462b;
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = c1163xf1deaba4 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) c1163xf1deaba4 : null;
                if (c22849x81a93d25 != null && (p07 = c22849x81a93d25.p0(0)) != null && (p07 instanceof in5.s0)) {
                    in5.s0 s0Var = (in5.s0) p07;
                    java.lang.Object obj = s0Var.f374658i;
                    if (obj instanceof so2.i1) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.th thVar = lhVar.f185461a;
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, thVar.f186150i)) {
                            thVar.o(s0Var, i18);
                        }
                    }
                }
            }
            if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
                z17 = true;
            } else {
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                z17 = false;
            }
            if (z17 || z65.c.a()) {
                z18 = true;
            } else {
                kb2.b bVar = kb2.b.f387758a;
            }
            if (z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DoubleClickTipUIC", "OnPreDrawListener lastY=" + d1Var.f215600q + ",currY=" + d1Var.f215599p);
            }
            d1Var.f215600q = d1Var.f215599p;
        }
        return true;
    }
}
