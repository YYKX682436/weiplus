package fv;

/* loaded from: classes16.dex */
public final class k implements qk.t6 {

    /* renamed from: a, reason: collision with root package name */
    public final qk.q f348461a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f348462b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f348463c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f348464d;

    /* renamed from: e, reason: collision with root package name */
    public fv.l f348465e;

    public k(qk.q config, java.lang.String tag, yz5.a doReleaseCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(doReleaseCallback, "doReleaseCallback");
        this.f348461a = config;
        this.f348462b = tag;
        this.f348463c = doReleaseCallback;
        this.f348464d = true;
        fv.e eVar = new fv.e(this);
        fv.b bVar = new fv.b(this);
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4671xf410f8ca.f19953x4fbc8495.mo40963x40b15f2e(eVar);
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4673x87f0d602.f19955x4fbc8495.mo40963x40b15f2e(bVar);
    }

    @Override // qk.t6
    public boolean a() {
        return this.f348464d;
    }

    @Override // qk.t6
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d(), "markActive");
        pm0.v.X(new fv.f(this));
    }

    @Override // qk.t6
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d(), "markInactive");
        pm0.v.X(new fv.g(this));
    }

    public final java.lang.String d() {
        return "MicroMsg.DelayReleaseTask:" + this.f348462b + ':' + hashCode();
    }
}
