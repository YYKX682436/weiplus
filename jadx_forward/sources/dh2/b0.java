package dh2;

/* loaded from: classes10.dex */
public final class b0 implements ah2.c {

    /* renamed from: a, reason: collision with root package name */
    public final ah2.e f313954a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole f313955b;

    /* renamed from: c, reason: collision with root package name */
    public om2.s f313956c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f313957d;

    /* renamed from: e, reason: collision with root package name */
    public ah2.d f313958e;

    /* renamed from: f, reason: collision with root package name */
    public jh2.c f313959f;

    /* renamed from: g, reason: collision with root package name */
    public long f313960g;

    /* renamed from: h, reason: collision with root package name */
    public long f313961h;

    /* renamed from: i, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f313962i;

    /* renamed from: j, reason: collision with root package name */
    public long f313963j;

    /* renamed from: k, reason: collision with root package name */
    public final bh2.c f313964k;

    public b0(com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 trtcCloud, ah2.e service, com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole tXChorusRole) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(trtcCloud, "trtcCloud");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f313954a = service;
        this.f313955b = tXChorusRole;
        this.f313957d = "LiveKTVSingEngine";
        int i17 = tXChorusRole == null ? -1 : dh2.y.f314016a[tXChorusRole.ordinal()];
        bh2.c vVar = (i17 == 1 || i17 == 2 || i17 == 3) ? new bh2.v(trtcCloud, service, tXChorusRole) : new bh2.l(trtcCloud, service);
        this.f313964k = vVar;
        dh2.x xVar = ((dh2.w) service).f313999a;
        float intValue = ((java.lang.Number) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((om2.e) xVar.f314001e.a(om2.e.class)).f427826i).mo144003x754a37bb()).intValue();
        vVar.a(intValue / 12.0f);
        jh2.c cVar = this.f313959f;
        if (cVar != null) {
            cVar.mo140935x93c29fe5((int) intValue);
        }
        int intValue2 = ((java.lang.Number) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((om2.e) xVar.f314001e.a(om2.e.class)).f427831q).mo144003x754a37bb()).intValue();
        double d17 = (intValue2 == 2 || intValue2 == 4) ? 1.0d : 0.8d;
        jh2.c cVar2 = this.f313959f;
        if (cVar2 != null) {
            cVar2.d(d17);
        }
    }

    public static final void a(dh2.b0 b0Var) {
        java.lang.String str = b0Var.f313957d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkStartTimer bgmTimerJob: ");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = b0Var.f313962i;
        sb6.append(r2Var != null ? java.lang.Boolean.valueOf(((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = b0Var.f313962i;
        if (r2Var2 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.y0 y0Var = ((dh2.w) b0Var.f313954a).f313999a.f314003g;
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        b0Var.f313962i = p3325xe03a0797.p3326xc267989b.l.d(y0Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new dh2.z(b0Var, null), 2, null);
    }

    public boolean b() {
        return this.f313964k.mo10547xc00617a4();
    }

    public final void c(long j17) {
        this.f313960g = java.lang.System.currentTimeMillis();
        this.f313961h = j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f313957d, "setInitTimeStamp initOffsetTime: " + j17);
    }

    public void d(bh2.w channel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(channel, "channel");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f313957d, "switchMusicChannel channel: " + channel);
        this.f313964k.e(channel);
    }
}
