package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes11.dex */
public final class jj extends wm3.a implements com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f242730d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Integer f242731e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Integer f242732f;

    /* renamed from: g, reason: collision with root package name */
    public final w14.d f242733g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f242734h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f242730d = new java.util.ArrayList();
        this.f242733g = w14.d.f523767d;
        this.f242734h = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ij(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.z1
    public boolean T5(ip.k composition) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composition, "composition");
        java.lang.Integer num = this.f242732f;
        return num != null && num.intValue() == composition.f375104a;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.z1
    public void X3(ip.k composition) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composition, "composition");
        java.lang.Integer num = this.f242731e;
        int i17 = composition.f375104a;
        if (num == null || num.intValue() != i17) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085).m78500x43e00957(i17, true);
        }
        this.f242732f = java.lang.Integer.valueOf(i17);
        this.f242733g.h(i17);
        t14.r rVar = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef.f243039e;
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.B3(new t14.z("select_view_notification_banner", composition.f375105b, 4));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.clo;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.z1
    /* renamed from: notifyDataSetChanged */
    public void mo68957xced61ae5() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = ((em.y3) ((jz5.n) this.f242734h).mo141623x754a37bb()).a().mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            mo7946xf939df19.m8146xced61ae5();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        java.util.ArrayList arrayList = this.f242730d;
        java.util.Map map = w14.d.f523774n;
        arrayList.addAll(map.values());
        this.f242731e = -1;
        this.f242732f = -1;
        w14.d dVar = this.f242733g;
        dVar.c();
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null) {
            P6.mo56583xbf7c1df6("横幅显示内容");
            P6.m78500x43e00957(0, false);
            P6.mo78530x8b45058f();
            P6.mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.hj(P6));
        }
        jz5.g gVar = this.f242734h;
        ((em.y3) ((jz5.n) gVar).mo141623x754a37bb()).a().mo7960x6cab2c8d(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.y1(arrayList, this));
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d c22847x422a813d = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d(m80379x76847179());
        c22847x422a813d.Q(1);
        ((em.y3) ((jz5.n) gVar).mo141623x754a37bb()).a().mo7967x900dcbe1(c22847x422a813d);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 a17 = ((em.y3) ((jz5.n) gVar).mo141623x754a37bb()).a();
        in5.t0 t0Var = new in5.t0(m80379x76847179());
        t0Var.f374662c = in5.q.f374646d;
        t0Var.c(com.p314xaae8f345.mm.R.C30859x5a72f63.f560840vn);
        t0Var.b(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        t0Var.d(com.p314xaae8f345.mm.R.C30860x5b28f31.f561171bd);
        android.content.res.Resources resources = t0Var.f374661b;
        t0Var.f374664e = resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        t0Var.f374665f = resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        a17.N(t0Var.a());
        dVar.c();
        ip.k kVar = (ip.k) map.get(w14.d.f523768e);
        if (kVar != null) {
            X3(kVar);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        this.f242733g.a();
    }
}
