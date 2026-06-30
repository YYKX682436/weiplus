package b04;

/* loaded from: classes5.dex */
public final class f extends wm3.a implements ll5.h {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f98422d;

    /* renamed from: e, reason: collision with root package name */
    public wd0.t1 f98423e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f98424f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f98422d = jz5.h.b(b04.e.f98420d);
        this.f98424f = jz5.h.b(new b04.d(this));
    }

    public final int T6() {
        return ((java.lang.Number) ((jz5.n) this.f98424f).mo141623x754a37bb()).intValue();
    }

    @Override // ll5.h
    public android.view.View i2() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185 c22675xc8629185 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185(m80379x76847179(), null, 2, null);
        ll5.a aVar = new ll5.a();
        aVar.f400799d = com.p314xaae8f345.mm.R.raw.f80703xc5bf4db8;
        aVar.f400800e = c22675xc8629185.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77922x54cad3c6);
        java.lang.String string = c22675xc8629185.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mec);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        aVar.f400801f = string;
        java.lang.String string2 = c22675xc8629185.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.meb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        aVar.f400802g = string2;
        aVar.f400803h = true;
        ((hs.d0) ((kd0.i2) i95.n0.c(kd0.i2.class))).wi(kd0.g3.f388180i, aVar, T6(), null);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085 : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            aVar.f400805m = true ^ ((c01.z1.j() & 2) != 0);
            kd0.i2 i2Var = (kd0.i2) i95.n0.c(kd0.i2.class);
            kd0.g3 g3Var = kd0.g3.f388181m;
            int T6 = T6();
            b04.a aVar2 = new b04.a(abstractActivityC21394xb3d2c0cf, this, aVar, c22675xc8629185);
            ((hs.d0) i2Var).getClass();
            aVar.f400806n = new hs.c0(g3Var, aVar, T6, aVar2);
        }
        aVar.f400804i = new b04.b(this, aVar, c22675xc8629185);
        c22675xc8629185.m48330xfcfee142(aVar);
        return c22675xc8629185;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        wd0.v1 v1Var = (wd0.v1) i95.n0.c(wd0.v1.class);
        android.app.Activity context = m80379x76847179();
        int T6 = T6();
        long longValue = ((java.lang.Number) ((jz5.n) this.f98422d).mo141623x754a37bb()).longValue();
        ((vd0.w2) v1Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i0) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i0.class);
        if (i0Var != null) {
            v24.e eVar = new v24.e(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.l.f242793g, longValue);
            eVar.f514447e = T6;
            v24.e.c(eVar, 1, i0Var.W6(), null, null, 0, 28, null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        wd0.t1 t1Var = this.f98423e;
        if (t1Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.C17366x88027ff) t1Var).m();
        }
    }
}
