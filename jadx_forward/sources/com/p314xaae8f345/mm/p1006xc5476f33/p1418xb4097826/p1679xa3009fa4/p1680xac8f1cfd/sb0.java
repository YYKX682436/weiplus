package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes8.dex */
public final class sb0 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.n f217419d;

    /* renamed from: e, reason: collision with root package name */
    public final bw5.up f217420e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f217421f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f217420e = new bw5.up();
        jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ob0.f216995d);
        jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pb0.f217078d);
        new java.util.concurrent.ConcurrentHashMap();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        if (this.f217421f) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            if (!((w03.u) pf5.z.f435481a.a(activity).a(w03.u.class)).f523440h) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MegaVideoAddHistoryUIC", "onBackPressed: update ret=false");
                i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.Bd((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) c17, 2, null, 0, null, 14, null);
            }
        }
        return super.mo2274xbdc3c5dc();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        byte[] byteArrayExtra = m158359x1e885992().getByteArrayExtra("KEY_FLOAT_BALL_INFO");
        java.lang.String nk6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).nk();
        if (byteArrayExtra != null) {
            this.f217421f = true;
            try {
                this.f217420e.mo11468x92b714fd(byteArrayExtra);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MegaVideoAddHistoryUIC", "onCreateAfter", th6);
            }
        }
        android.app.Activity m80379x76847179 = m80379x76847179();
        android.app.Activity m80379x768471792 = m80379x76847179();
        android.view.View decorView = m80379x76847179().getWindow().getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.n nVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.n(m80379x76847179, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.o(m80379x768471792, null, decorView));
        this.f217419d = nVar;
        nVar.y(25, nk6);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.n nVar2 = this.f217419d;
        if (nVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("multiTaskHelper");
            throw null;
        }
        nVar2.f381659s = false;
        if (this.f217421f) {
            if (nVar2 != null) {
                nVar2.f202407x = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qb0(this);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("multiTaskHelper");
                throw null;
            }
        }
        if (nVar2 != null) {
            nVar2.f202408y = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rb0(this);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("multiTaskHelper");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.n nVar = this.f217419d;
        if (nVar != null) {
            nVar.A();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("multiTaskHelper");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.n nVar = this.f217419d;
        if (nVar != null) {
            nVar.z();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("multiTaskHelper");
            throw null;
        }
    }
}
