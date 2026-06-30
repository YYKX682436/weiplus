package dk2;

/* loaded from: classes3.dex */
public final class ga {

    /* renamed from: a, reason: collision with root package name */
    public long f315046a;

    /* renamed from: b, reason: collision with root package name */
    public long f315047b;

    /* renamed from: c, reason: collision with root package name */
    public long f315048c;

    /* renamed from: d, reason: collision with root package name */
    public int f315049d;

    /* renamed from: e, reason: collision with root package name */
    public int f315050e;

    /* renamed from: f, reason: collision with root package name */
    public float f315051f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f315052g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f315053h;

    /* renamed from: i, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f315054i;

    public ga(java.lang.String sessionId, long j17, long j18, long j19, long j27, int i17, int i18, float f17, boolean z17, java.util.List list, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        long j28 = (i19 & 8) != 0 ? 0L : j19;
        long j29 = (i19 & 16) == 0 ? j27 : 0L;
        int i27 = (i19 & 32) != 0 ? 0 : i17;
        int i28 = (i19 & 64) != 0 ? 0 : i18;
        float f18 = (i19 & 128) != 0 ? 1.0f : f17;
        boolean z18 = (i19 & 256) == 0 ? z17 : false;
        java.util.List waitingHlCheerList = (i19 & 512) != 0 ? new java.util.ArrayList() : list;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(waitingHlCheerList, "waitingHlCheerList");
        this.f315046a = j18;
        this.f315047b = j28;
        this.f315048c = j29;
        this.f315049d = i27;
        this.f315050e = i28;
        this.f315051f = f18;
        this.f315052g = z18;
        this.f315053h = waitingHlCheerList;
    }

    public final void a(p3325xe03a0797.p3326xc267989b.y0 scope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f315054i;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f315046a++;
        this.f315052g = true;
        this.f315054i = p3325xe03a0797.p3326xc267989b.l.d(scope, null, null, new dk2.fa(this, null), 3, null);
    }
}
