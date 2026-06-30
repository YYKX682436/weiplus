package zo2;

/* loaded from: classes2.dex */
public abstract class b implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener, zo2.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f556377d;

    /* renamed from: e, reason: collision with root package name */
    public int f556378e;

    /* renamed from: f, reason: collision with root package name */
    public int f556379f;

    public b(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, java.util.List fragments) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragments, "fragments");
        this.f556377d = fragments;
        this.f556378e = -1;
        this.f556379f = -1;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15290x1a2d74fc.TAG, "onPageScrollStateChanged position:" + i17);
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
        int i18 = this.f556378e;
        java.util.List list = this.f556377d;
        if (i18 != i17) {
            int i19 = 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301 abstractC14499x6ba3301 = null;
            for (java.lang.Object obj : list) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301 abstractC14499x6ba33012 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301) obj;
                if (i17 == i19) {
                    abstractC14499x6ba3301 = abstractC14499x6ba33012;
                } else if (this.f556378e == i19) {
                    abstractC14499x6ba33012.p0();
                    a(false, i19, abstractC14499x6ba33012);
                }
                i19 = i27;
            }
            l(this.f556378e, i17, this.f556379f, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301) list.get(i17)).f202993p);
            if (abstractC14499x6ba3301 != null) {
                abstractC14499x6ba3301.o0();
                a(true, i17, abstractC14499x6ba3301);
            }
        }
        this.f556378e = i17;
        this.f556379f = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301) list.get(i17)).f202993p;
    }
}
