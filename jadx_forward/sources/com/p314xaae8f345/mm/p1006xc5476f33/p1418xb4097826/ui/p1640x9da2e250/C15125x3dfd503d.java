package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/fragment/FinderLbsSameCityTabFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "Lcom/tencent/mm/plugin/finder/view/ka;", "<init>", "()V", "wu2/q", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.fragment.FinderLbsSameCityTabFragment */
/* loaded from: classes2.dex */
public final class C15125x3dfd503d extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ka {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f210802t;

    /* renamed from: u, reason: collision with root package name */
    public wu2.q f210803u;

    /* renamed from: v, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.k0 f210804v;

    public C15125x3dfd503d() {
        super(com.p314xaae8f345.mm.R.C30867xcad56011.o2k, 35);
        this.f210802t = "FinderLbsSameCityTabFragment";
        this.f210803u = wu2.q.f531228e;
        this.f210804v = new wu2.r(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ka
    public void G3(int i17, int i18, int i19, int i27) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ka
    public void l(int i17, int i18, int i19, int i27) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    /* renamed from: l0 */
    public java.util.Set getF204828n() {
        return kz5.z.D0(new java.lang.Class[]{com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t80.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d1.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nn.class});
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public void o0() {
        super.o0();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(this, "special_enter_source", java.lang.Integer.valueOf(((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Bi()));
        n30.q qVar = (n30.q) i95.n0.c(n30.q.class);
        java.lang.String valueOf = java.lang.String.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.t.f34564x366c91de);
        ((m30.m) qVar).getClass();
        a52.a.d(valueOf);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nn y07 = y0();
        if (y07 != null) {
            i95.m c17 = i95.n0.c(cq.k.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209561xg).mo141623x754a37bb()).r()).booleanValue()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLbsSameCityTabUIC", "didn't open refresh switch, return");
                return;
            }
            if (y07.f216871d.mo3195x754a37bb() != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLbsSameCityTabUIC", "had refresh before! return");
                return;
            }
            bs2.a0 O6 = y07.O6();
            if ((O6 == null || O6.E) ? false : true) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLbsSameCityTabUIC", "preload had not finished, return");
                return;
            }
            p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(ey2.k0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            ((ey2.k0) a17).R6(false, y07);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        p012xc85e97e9.p093xedfae76a.j0 j0Var;
        super.mo7398x3e5a77bb(bundle);
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.ak(this, iy1.c.FinderLbsSameCityFragment);
        aVar.Rj(this, iy1.a.Finder);
        aVar.dk(this, "FinderLbsSameCityTabFragment");
        aVar.ck(this, true);
        aVar.ik(this, 40, 24184);
        aVar.Tj(this, 12, 1, false);
        aVar.Ai(this, new wu2.s(this));
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
        if (mo7430x19263085 != null) {
            pf5.z zVar = pf5.z.f435481a;
            if (!(mo7430x19263085 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) mo7430x19263085).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class)).f215108o.add(this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nn y07 = y0();
        if (y07 == null || (j0Var = y07.f216871d) == null) {
            return;
        }
        j0Var.mo7806x9d92d11c(this, this.f210804v);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        p012xc85e97e9.p093xedfae76a.j0 j0Var;
        super.mo7504xac79a11b();
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
        if (mo7430x19263085 != null) {
            pf5.z zVar = pf5.z.f435481a;
            if (!(mo7430x19263085 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) mo7430x19263085).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class)).f215108o.remove(this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nn y07 = y0();
        if (y07 == null || (j0Var = y07.f216871d) == null) {
            return;
        }
        j0Var.mo522xb5bdeb7a(this.f210804v);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ka
    /* renamed from: onPageScrolled */
    public void mo55649xf210c75a(int i17, float f17, int i18) {
        if (this.f210803u != wu2.q.f531229f) {
            this.f210803u = wu2.q.f531230g;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onPause */
    public void mo7512xb01dfb57() {
        super.mo7512xb01dfb57();
        this.f210803u = wu2.q.f531228e;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        super.mo7517x57429eec();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(this, "special_enter_source", java.lang.Integer.valueOf(((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Bi()));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public void p0() {
        super.p0();
        this.f210803u = wu2.q.f531228e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f210802t, "onUserVisibleUnFocused");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656
    /* renamed from: r0 */
    public int getF203048s() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.t.f34564x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180
    public void s0() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t80) j0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t80.class)).X6(true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180
    public void t0() {
        this.f210803u = wu2.q.f531229f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f210802t, "onActionbarTouch");
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nn y0() {
        if (mo7430x19263085() == null) {
            return null;
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nn) j0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nn.class);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ka
    public void z(boolean z17, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 fragment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
    }
}
