package z51;

/* loaded from: classes10.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public final y51.a f551767a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f551768b;

    /* renamed from: c, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f551769c;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f551770d;

    /* renamed from: e, reason: collision with root package name */
    public long f551771e;

    public x(y51.a pcContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pcContext, "pcContext");
        this.f551767a = pcContext;
        this.f551768b = c();
        this.f551769c = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
    }

    public final z51.x a(java.lang.Class clazz) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        return ((y51.b) this.f551767a).a(clazz);
    }

    public final android.content.Context b() {
        android.content.Context context = this.f551770d;
        if (context != null) {
            return context;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("context");
        throw null;
    }

    public abstract java.lang.String c();

    public void d(a61.a config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        java.lang.Long l17 = config.f83251b.f83255d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "getMediaId(...)");
        this.f551771e = l17.longValue();
        android.content.Context m176504x94381fd8 = ((y51.b) this.f551767a).m176504x94381fd8();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m176504x94381fd8, "<set-?>");
        this.f551770d = m176504x94381fd8;
        f(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
    }

    public final void e(java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f551768b, hashCode() + " mediaId: " + this.f551771e + " >> " + msg);
    }

    public final void f(java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f551768b, hashCode() + " mediaId: " + this.f551771e + " >> " + msg);
    }

    public final void g(java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f551768b, hashCode() + " mediaId: " + this.f551771e + " >> " + msg);
    }

    public void h() {
        f("pause");
    }

    public void i() {
    }

    public void j() {
        f("release");
        p3325xe03a0797.p3326xc267989b.z0.e(this.f551769c, null, 1, null);
    }
}
