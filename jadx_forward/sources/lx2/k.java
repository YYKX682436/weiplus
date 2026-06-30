package lx2;

/* loaded from: classes2.dex */
public final class k extends lx2.d {

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f403608k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f403609l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f403610m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15298x95ee76f1 tipsLayout) {
        super(tipsLayout);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsLayout, "tipsLayout");
        this.f403608k = "localtab_tl_bubble";
        this.f403609l = "finder_tl_city_tab";
        this.f403610m = "SameCityTipsBubbleViewHelper";
    }

    @Override // lx2.d
    public r45.qt2 c() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((jz5.n) this.f403587e).mo141623x754a37bb()).W6(35);
    }

    @Override // lx2.d
    public java.lang.String d() {
        return this.f403609l;
    }

    @Override // lx2.d
    public java.lang.String e() {
        return this.f403608k;
    }

    @Override // lx2.d
    public java.lang.String f() {
        return this.f403610m;
    }

    @Override // lx2.d
    public void h() {
        super.h();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gb gbVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15298x95ee76f1.f212670h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15298x95ee76f1.f212673n = true;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5538x56837f90 c5538x56837f90 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5538x56837f90();
        am.id idVar = c5538x56837f90.f135862g;
        if (idVar != null) {
            idVar.f88471a = 35;
        }
        if (idVar != null) {
            idVar.f88476f = true;
        }
        if (idVar != null) {
            idVar.f88477g = 11;
        }
        c5538x56837f90.e();
    }

    @Override // lx2.d
    public void i(android.view.View arrow, android.widget.LinearLayout.LayoutParams arrowParams, android.widget.FrameLayout.LayoutParams tipsParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arrow, "arrow");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arrowParams, "arrowParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsParams, "tipsParams");
        arrowParams.leftMargin = 0;
        arrowParams.gravity = 49;
        a(this.f403584b, this.f403583a, tipsParams, 35);
        super.i(arrow, arrowParams, tipsParams);
    }
}
