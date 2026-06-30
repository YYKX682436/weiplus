package sq4;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public int f492907b;

    /* renamed from: c, reason: collision with root package name */
    public long f492908c;

    /* renamed from: d, reason: collision with root package name */
    public long f492909d;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f492912g;

    /* renamed from: h, reason: collision with root package name */
    public long f492913h;

    /* renamed from: i, reason: collision with root package name */
    public long f492914i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f492915j;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f492906a = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f492910e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f492911f = "";

    /* renamed from: k, reason: collision with root package name */
    public boolean f492916k = true;

    public final sq4.b a() {
        if (this.f492916k) {
            this.f492907b++;
            this.f492916k = false;
            long j17 = this.f492913h;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            e(java.lang.System.currentTimeMillis() - j17);
            this.f492909d += java.lang.System.currentTimeMillis() - this.f492913h;
        }
        return this;
    }

    public final sq4.b b() {
        this.f492907b++;
        long j17 = this.f492913h;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        e(java.lang.System.currentTimeMillis() - j17);
        this.f492909d += java.lang.System.currentTimeMillis() - this.f492913h;
        return this;
    }

    public final sq4.c c() {
        return new sq4.c(this.f492906a, this.f492907b, this.f492908c, this.f492909d, this.f492910e, this.f492911f, this.f492912g);
    }

    public final sq4.b d(long j17) {
        this.f492910e += '_' + j17;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f492913h = java.lang.System.currentTimeMillis();
        return this;
    }

    public final sq4.b e(long j17) {
        this.f492911f += '_' + j17;
        this.f492914i = j17;
        this.f492908c = java.lang.Math.max(j17, this.f492908c);
        return this;
    }

    public final sq4.b f(java.lang.String side) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(side, "side");
        this.f492906a = side;
        return this;
    }

    public final sq4.b g(java.lang.String tag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        this.f492912g = tag;
        return this;
    }
}
