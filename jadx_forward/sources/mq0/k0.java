package mq0;

/* loaded from: classes7.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f412106a;

    /* renamed from: b, reason: collision with root package name */
    public long f412107b;

    /* renamed from: c, reason: collision with root package name */
    public long f412108c;

    /* renamed from: d, reason: collision with root package name */
    public long f412109d;

    /* renamed from: e, reason: collision with root package name */
    public double f412110e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f412111f;

    /* renamed from: g, reason: collision with root package name */
    public long f412112g;

    /* renamed from: h, reason: collision with root package name */
    public long f412113h;

    /* renamed from: i, reason: collision with root package name */
    public long f412114i;

    /* renamed from: j, reason: collision with root package name */
    public long f412115j;

    public k0(java.lang.String frameSetRootId, long j17, long j18, long j19, double d17, java.util.concurrent.ConcurrentHashMap concurrentHashMap, long j27, long j28, long j29, long j37, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        long j38 = (i17 & 2) != 0 ? 0L : j17;
        long j39 = (i17 & 4) != 0 ? 0L : j18;
        long j47 = (i17 & 8) != 0 ? 0L : j19;
        double d18 = (i17 & 16) != 0 ? 0.0d : d17;
        java.util.concurrent.ConcurrentHashMap renderStartMap = (i17 & 32) != 0 ? new java.util.concurrent.ConcurrentHashMap() : concurrentHashMap;
        long j48 = (i17 & 64) != 0 ? 0L : j27;
        long j49 = (i17 & 128) != 0 ? 0L : j28;
        long j57 = (i17 & 256) != 0 ? 0L : j29;
        long j58 = (i17 & 512) != 0 ? 0L : j37;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetRootId, "frameSetRootId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderStartMap, "renderStartMap");
        this.f412106a = frameSetRootId;
        this.f412107b = j38;
        this.f412108c = j39;
        this.f412109d = j47;
        this.f412110e = d18;
        this.f412111f = renderStartMap;
        this.f412112g = j48;
        this.f412113h = j49;
        this.f412114i = j57;
        this.f412115j = j58;
    }

    /* renamed from: equals */
    public boolean m148217xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mq0.k0)) {
            return false;
        }
        mq0.k0 k0Var = (mq0.k0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f412106a, k0Var.f412106a) && this.f412107b == k0Var.f412107b && this.f412108c == k0Var.f412108c && this.f412109d == k0Var.f412109d && java.lang.Double.compare(this.f412110e, k0Var.f412110e) == 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f412111f, k0Var.f412111f) && this.f412112g == k0Var.f412112g && this.f412113h == k0Var.f412113h && this.f412114i == k0Var.f412114i && this.f412115j == k0Var.f412115j;
    }

    /* renamed from: hashCode */
    public int m148218x8cdac1b() {
        return (((((((((((((((((this.f412106a.hashCode() * 31) + java.lang.Long.hashCode(this.f412107b)) * 31) + java.lang.Long.hashCode(this.f412108c)) * 31) + java.lang.Long.hashCode(this.f412109d)) * 31) + java.lang.Double.hashCode(this.f412110e)) * 31) + this.f412111f.hashCode()) * 31) + java.lang.Long.hashCode(this.f412112g)) * 31) + java.lang.Long.hashCode(this.f412113h)) * 31) + java.lang.Long.hashCode(this.f412114i)) * 31) + java.lang.Long.hashCode(this.f412115j);
    }

    /* renamed from: toString */
    public java.lang.String m148219x9616526c() {
        return "MagicCardFrameSetCacheReportInfo(frameSetRootId=" + this.f412106a + ", totalCacheNum=" + this.f412107b + ", missCacheNum=" + this.f412108c + ", hitCacheNum=" + this.f412109d + ", totalRenderTime=" + this.f412110e + ", renderStartMap=" + this.f412111f + ", renderNum=" + this.f412112g + ", exposeNum=" + this.f412113h + ", entryStartTime=" + this.f412114i + ", sceneActiveTime=" + this.f412115j + ')';
    }
}
