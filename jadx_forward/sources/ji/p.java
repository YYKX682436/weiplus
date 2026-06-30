package ji;

/* loaded from: classes12.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final ji.q f381430a;

    /* renamed from: b, reason: collision with root package name */
    public final ji.q f381431b;

    /* renamed from: c, reason: collision with root package name */
    public final ji.q f381432c;

    /* renamed from: d, reason: collision with root package name */
    public final ji.q f381433d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f381434e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4660x9028c9b0 f381435f;

    /* renamed from: g, reason: collision with root package name */
    public final long f381436g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.l f381437h;

    public p(boolean z17, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4660x9028c9b0 bgStatefulOwner, long j17, long j18, long j19, long j27, long j28, int i17, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bgStatefulOwner, "bgStatefulOwner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f381434e = z17;
        this.f381435f = bgStatefulOwner;
        this.f381436g = j17;
        this.f381437h = callback;
        this.f381430a = new ji.q(j18, i17, 0L);
        this.f381431b = new ji.q(j19, i17, 0L);
        this.f381432c = new ji.q(j28, i17, 0L);
        this.f381433d = new ji.q(j27, i17, java.util.concurrent.TimeUnit.MINUTES.toMillis(5L));
    }

    /* renamed from: toString */
    public java.lang.String m140985x9616526c() {
        return "ProcessBgMemoryMonitorConfig(enable=" + this.f381434e + ", bgStatefulOwner=" + this.f381435f + ", checkInterval=" + this.f381436g + ", reportCallback=" + this.f381437h.getClass().getName() + ", javaThresholdByte=" + this.f381430a + ", nativeThresholdByte=" + this.f381431b + ", debugPssThresholdK=" + this.f381432c + ", amsPssThresholdK=" + this.f381433d + ')';
    }
}
