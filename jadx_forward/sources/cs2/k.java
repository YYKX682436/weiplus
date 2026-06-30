package cs2;

/* loaded from: classes2.dex */
public final class k extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements cw2.w9 {

    /* renamed from: d, reason: collision with root package name */
    public cs2.j f303609d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public final java.lang.String O6() {
        if (m80381x45f41879()) {
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = m158358x197d1fc6();
            r45.qt2 V6 = m158358x197d1fc6 != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.b(m158358x197d1fc6).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6() : null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("comment:");
            sb6.append(V6 != null ? java.lang.Integer.valueOf(V6.m75939xb282bd08(5)) : null);
            sb6.append(" tabType:");
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc62 = m158358x197d1fc6();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 abstractC15124x7bae6180 = m158358x197d1fc62 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180) m158358x197d1fc62 : null;
            sb6.append(abstractC15124x7bae6180 != null ? java.lang.Integer.valueOf(abstractC15124x7bae6180.f210798p) : null);
            sb6.append(" contextId:");
            android.app.Activity context = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            sb6.append(nyVar != null ? nyVar.V6().m75945x2fec8307(1) : null);
            sb6.append(" fragment:");
            sb6.append(m158358x197d1fc6());
            return sb6.toString();
        }
        android.app.Activity context2 = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V62 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("comment:");
        sb7.append(V62.m75939xb282bd08(5));
        sb7.append(" contextId:");
        android.app.Activity context3 = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context3, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = context3 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context3).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        sb7.append(nyVar2 != null ? nyVar2.V6().m75945x2fec8307(1) : null);
        sb7.append(" activity:");
        sb7.append(m158354x19263085());
        sb7.append(" this:");
        sb7.append(this);
        return sb7.toString();
    }

    public final boolean P6() {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b42;
        p012xc85e97e9.p093xedfae76a.n nVar = null;
        if (!m80381x45f41879()) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            if (!(m158354x19263085 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                m158354x19263085 = null;
            }
            if (m158354x19263085 != null && (mo273xed6858b4 = m158354x19263085.mo273xed6858b4()) != null) {
                nVar = mo273xed6858b4.b();
            }
            if (nVar == p012xc85e97e9.p093xedfae76a.n.RESUMED) {
                return true;
            }
        } else if (getIsUserVisibleFocused()) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
            if (!(m158354x192630852 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                m158354x192630852 = null;
            }
            if (m158354x192630852 != null && (mo273xed6858b42 = m158354x192630852.mo273xed6858b4()) != null) {
                nVar = mo273xed6858b42.b();
            }
            if (nVar == p012xc85e97e9.p093xedfae76a.n.RESUMED) {
                return true;
            }
        }
        return false;
    }

    public final void Q6() {
        cs2.j jVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MediaPreloadCore", "onGridFeedPreloadComplete " + P6() + ' ' + O6());
        if (!P6() || (jVar = this.f303609d) == null) {
            return;
        }
        jVar.P("#onGridFeedPreloadComplete");
    }

    public final void R6() {
        cs2.j jVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MediaPreloadCore", "onGridFeedPreloadStart " + P6() + ' ' + O6());
        if (!P6() || (jVar = this.f303609d) == null) {
            return;
        }
        jVar.p0("#onGridFeedPreloadStart");
    }

    public void S6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa dataList, int i17, int i18, fc2.c cVar) {
        vr2.e eVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MediaPreloadCore", "setup commentScene:" + i17 + " tabType:" + i18);
        if (m158354x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15036x1a33c799) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f81534if).mo141623x754a37bb()).r()).booleanValue()) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                eVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class)).f215112s;
                es2.g gVar = new es2.g(i17, this, eVar, m158354x19263085());
                this.f303609d = gVar;
                gVar.P0(dataList, i17, i18, cVar);
            }
        }
        eVar = null;
        es2.g gVar2 = new es2.g(i17, this, eVar, m158354x19263085());
        this.f303609d = gVar2;
        gVar2.P0(dataList, i17, i18, cVar);
    }

    @Override // cw2.w9
    public boolean V0() {
        cs2.k kVar;
        android.app.Activity m80379x76847179 = m80379x76847179();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = m80379x76847179 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) m80379x76847179 : null;
        if (activityC0065xcd7aa112 == null) {
            kVar = null;
        } else if (activityC0065xcd7aa112 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15036x1a33c799) {
            pf5.z zVar = pf5.z.f435481a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 fragment = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) zVar.a(activityC0065xcd7aa112).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class)).m63052x8f02c6c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
            kVar = (cs2.k) zVar.b(fragment).a(cs2.k.class);
        } else {
            kVar = (cs2.k) pf5.z.f435481a.a(activityC0065xcd7aa112).a(cs2.k.class);
        }
        java.lang.Object obj = kVar != null ? kVar.f303609d : null;
        es2.g gVar = obj instanceof es2.g ? (es2.g) obj : null;
        return gVar != null && gVar.f337891v;
    }

    @Override // cw2.w9
    public cs2.j d1() {
        return this.f303609d;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MediaPreloadCore", "onDestroy " + O6());
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStart */
    public void mo2286xb05099c3() {
        super.mo2286xb05099c3();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MediaPreloadCore", "onStart " + O6());
        cs2.j jVar = this.f303609d;
        if (jVar != null) {
            jVar.P("#onStart");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        super.mo2287xc39f8281();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MediaPreloadCore", "onStop " + O6());
        cs2.j jVar = this.f303609d;
        if (jVar != null) {
            jVar.p0("#onStop");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleFocused */
    public void mo58275xd317978f() {
        super.mo58275xd317978f();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MediaPreloadCore", "onUserVisibleFocused " + O6());
        cs2.j jVar = this.f303609d;
        if (jVar != null) {
            jVar.P("#onUserVisibleFocused");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleUnFocused */
    public void mo58437xaa858cb6() {
        super.mo58437xaa858cb6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MediaPreloadCore", "onUserVisibleUnFocused " + O6());
        cs2.j jVar = this.f303609d;
        if (jVar != null) {
            jVar.p0("#onUserVisibleUnFocused");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
    }
}
