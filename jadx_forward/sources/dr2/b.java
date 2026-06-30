package dr2;

/* loaded from: classes2.dex */
public abstract class b implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f324118d;

    /* renamed from: e, reason: collision with root package name */
    public int f324119e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f324120f;

    public b(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, java.util.List fragments) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragments, "fragments");
        this.f324118d = fragments;
        this.f324119e = -1;
        this.f324120f = "";
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15290x1a2d74fc.TAG, "onPageScrollStateChanged position:" + i17);
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
        int i18 = this.f324119e;
        java.util.List list = this.f324118d;
        if (i18 != i17) {
            int i19 = 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1596x9da2e250.C14568x797587ad c14568x797587ad = null;
            for (java.lang.Object obj : list) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1596x9da2e250.C14568x797587ad c14568x797587ad2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1596x9da2e250.C14568x797587ad) obj;
                if (i17 == i19) {
                    c14568x797587ad = c14568x797587ad2;
                } else if (this.f324119e == i19) {
                    c14568x797587ad2.p0();
                }
                i19 = i27;
            }
            int i28 = this.f324119e;
            java.lang.String fromThemeTag = this.f324120f;
            java.lang.String toThemeTag = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1596x9da2e250.C14568x797587ad) list.get(i17)).f203647n.f337543c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromThemeTag, "fromThemeTag");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toThemeTag, "toThemeTag");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15290x1a2d74fc.TAG, "onFragmentChange fromPos:" + i28 + " to:" + i17 + " fromThemeTag: " + fromThemeTag + " toThemeTag: " + toThemeTag);
            gr2.p0 p0Var = ((gr2.n0) this).f356330g;
            p0Var.getClass();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5685xa20ebe4d c5685xa20ebe4d = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5685xa20ebe4d();
            am.bj bjVar = c5685xa20ebe4d.f136011g;
            bjVar.f87791b = i17;
            bjVar.f87790a = 2;
            c5685xa20ebe4d.e();
            p0Var.f356345h = i17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ThemeLivingViewPagerConvert", "onSelectThemeTag pos: " + i17);
            if (c14568x797587ad != null) {
                c14568x797587ad.o0();
            }
        }
        this.f324119e = i17;
        this.f324120f = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1596x9da2e250.C14568x797587ad) list.get(i17)).f203647n.f337543c;
    }
}
