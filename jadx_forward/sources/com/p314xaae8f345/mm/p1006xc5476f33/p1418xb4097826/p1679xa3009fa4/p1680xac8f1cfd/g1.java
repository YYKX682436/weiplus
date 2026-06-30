package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class g1 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f215988d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f215989e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f215990f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f215991g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f215988d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e1(activity));
        this.f215989e = O6();
    }

    public final boolean O6() {
        return ((java.lang.Boolean) this.f215988d.mo141623x754a37bb()).booleanValue();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBeforeFinish */
    public void mo2275x62f76871(android.content.Intent intent) {
        ((c61.s9) ((c50.b1) i95.n0.c(c50.b1.class))).wi(m158354x19263085());
        super.mo2275x62f76871(intent);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5151xfdcfc6b3>(m158354x19263085) { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderActivityToggleAnimUIC$onCreateAfter$1
            {
                this.f39173x3fe91575 = 2063121603;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5151xfdcfc6b3 c5151xfdcfc6b3) {
                com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 h17;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5151xfdcfc6b3 event = c5151xfdcfc6b3;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.g1 g1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.g1.this;
                if (g1Var.m158354x19263085().hashCode() == event.f135500g.f88248a) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActivityToggleAnimUIC", "ActivityToggleAnimEndEvent: notify resize banner and adjust seekbar");
                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                    android.view.View m80380x71e92c1d = g1Var.m80380x71e92c1d();
                    android.view.ViewGroup viewGroup = m80380x71e92c1d instanceof android.view.ViewGroup ? (android.view.ViewGroup) m80380x71e92c1d : null;
                    if (viewGroup != null && (h17 = hc2.f1.h(viewGroup)) != null) {
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = h17.m82555x4905e9fa().mo7946xf939df19();
                        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
                        if (c22848x6ddd90cf != null && c22848x6ddd90cf.mo1894x7e414b06() > 0) {
                            c22848x6ddd90cf.m8152xc67946d3(0, c22848x6ddd90cf.mo1894x7e414b06(), new jz5.l(30, 1));
                        }
                    }
                }
                return false;
            }
        }.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onInterceptFinish */
    public boolean mo63118xdd2ad016() {
        java.lang.Object m143895xf1229813;
        if (!this.f215991g && !this.f215990f && this.f215989e) {
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                ((c61.s9) ((c50.b1) i95.n0.c(c50.b1.class))).wi(m158354x19263085());
                wa2.x.f(m158354x19263085(), 0L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f1(this), 1, null);
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
            if (m143898xd4a2fc34 != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("Finder.ActivityToggleAnimUIC", "", m143898xd4a2fc34);
                this.f215989e = false;
                m158354x19263085().finish();
            }
        }
        return (this.f215991g || this.f215990f || !this.f215989e) ? false : true;
    }
}
