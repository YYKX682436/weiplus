package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

@j95.b
/* loaded from: classes11.dex */
public final class s extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f236068d = "BizProfileDataUtil";

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f236069e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.g(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f236070f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.n(this));

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f236071g = new java.util.concurrent.atomic.AtomicReference();

    public s() {
        p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
        new java.util.concurrent.ConcurrentHashMap();
        new java.util.concurrent.atomic.AtomicBoolean(false);
        new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public final com.p314xaae8f345.p3133xd0ce8b26.iam.biz.p1 Ai() {
        sr3.a aVar;
        sr3.g gVar = (sr3.g) this.f236071g.get();
        if (gVar == null || (aVar = gVar.g()) == null) {
            aVar = sr3.a.f493362e;
        }
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            com.p314xaae8f345.p3133xd0ce8b26.iam.biz.p1 p1Var = (com.p314xaae8f345.p3133xd0ce8b26.iam.biz.p1) ((jz5.n) this.f236069e).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(p1Var);
            return p1Var;
        }
        if (ordinal != 1) {
            throw new jz5.j();
        }
        com.p314xaae8f345.p3133xd0ce8b26.iam.biz.p1 p1Var2 = (com.p314xaae8f345.p3133xd0ce8b26.iam.biz.p1) ((jz5.n) this.f236070f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(p1Var2);
        return p1Var2;
    }

    public final java.lang.String Bi() {
        java.lang.String str = ((r01.l1) i95.n0.c(r01.l1.class)).f449680i.f449686a;
        if (str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f236068d, "getPersonalCenterBiz failed");
        }
        return str;
    }

    public final java.lang.String Di() {
        java.lang.String str = ((r01.l1) i95.n0.c(r01.l1.class)).f449681m.f449686a;
        if (str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f236068d, "getPersonalCenterPhoto failed");
        }
        return str;
    }

    public final void Ni(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        ((r01.l1) i95.n0.c(r01.l1.class)).Ui(callback);
    }

    public final void Ri(sr3.g config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f236071g.set(config);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f236068d, "setCurrentConfig: " + config.g());
    }

    public final void wi(int i17) {
        Ai().b(i17);
    }
}
