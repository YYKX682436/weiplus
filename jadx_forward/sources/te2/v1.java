package te2;

/* loaded from: classes3.dex */
public final class v1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1483xac8f1cfd.C14186x18d3b328 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1483xac8f1cfd.C14186x18d3b328
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 O6() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.a2((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085, m158358x197d1fc6(), null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1483xac8f1cfd.C14186x18d3b328
    public void P6() {
        if (m158354x19263085() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085).m78583x85ccfe01(8);
        }
        m80379x76847179().getWindow().addFlags(2097280);
        m80379x76847179().getWindow().addFlags(67108864);
        m80379x76847179().getWindow().getDecorView().setSystemUiVisibility(1792);
        m80379x76847179().getWindow().clearFlags(67108864);
        m80379x76847179().getWindow().addFlags(Integer.MIN_VALUE);
        m80379x76847179().getWindow().setStatusBarColor(0);
        m80379x76847179().getWindow().setNavigationBarColor(0);
        m80379x76847179().getWindow().setFormat(-3);
        m80379x76847179().getWindow().setSoftInputMode(51);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1483xac8f1cfd.C14186x18d3b328
    public void S6() {
        gk2.e eVar = gk2.e.f354004n;
        boolean z17 = false;
        if (eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).O1) {
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c8 c8Var = this.f193089h;
            if (c8Var != null) {
                c8Var.z();
            }
            qp1.h0.b();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193085d, "tryShowFloatBallWhenExitPage resumeFloatBall");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1483xac8f1cfd.C14186x18d3b328, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        java.lang.String str = this.f193085d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[LiveLifecycler]onStop " + this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = this.f193087f;
        if (k0Var != null) {
            k0Var.mo46558x360802();
        }
        gk2.e eVar = gk2.e.f354004n;
        boolean z17 = false;
        if (eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).O1) {
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c8 c8Var = this.f193089h;
            if (c8Var != null) {
                c8Var.z();
            }
            qp1.h0.b();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onStop resumeFloatBall");
        }
    }
}
