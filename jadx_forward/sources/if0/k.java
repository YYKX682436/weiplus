package if0;

/* loaded from: classes16.dex */
public final class k implements qk.t6 {

    /* renamed from: a, reason: collision with root package name */
    public final qk.q f372561a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f372562b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f372563c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f372564d;

    /* renamed from: e, reason: collision with root package name */
    public if0.l f372565e;

    public k(qk.q config, java.lang.String tag, yz5.a doReleaseCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(doReleaseCallback, "doReleaseCallback");
        this.f372561a = config;
        this.f372562b = tag;
        this.f372563c = doReleaseCallback;
        this.f372564d = true;
        if0.e eVar = new if0.e(this);
        if0.b bVar = new if0.b(this);
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4671xf410f8ca.f19953x4fbc8495.mo40963x40b15f2e(eVar);
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4673x87f0d602.f19955x4fbc8495.mo40963x40b15f2e(bVar);
    }

    @Override // qk.t6
    public boolean a() {
        return this.f372564d;
    }

    @Override // qk.t6
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d(), "markActive");
        pm0.v.X(new if0.f(this));
    }

    @Override // qk.t6
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d(), "markInactive");
        pm0.v.X(new if0.g(this));
    }

    public final java.lang.String d() {
        return "MicroMsg.DelayReleaseTask:" + this.f372562b + ':' + hashCode();
    }
}
