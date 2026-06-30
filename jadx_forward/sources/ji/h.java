package ji;

/* loaded from: classes12.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ji.q f381414a;

    /* renamed from: b, reason: collision with root package name */
    public final ji.q f381415b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f381416c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4660x9028c9b0 f381417d;

    /* renamed from: e, reason: collision with root package name */
    public final long f381418e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.r f381419f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.a f381420g;

    public h(boolean z17, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4660x9028c9b0 interfaceC4660x9028c9b0, long j17, long j18, long j19, int i17, yz5.r rVar, yz5.a aVar, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        boolean z18 = (i18 & 1) != 0 ? true : z17;
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4660x9028c9b0 bgStatefulOwner = (i18 & 2) != 0 ? com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4682x5dbe6c9e.f19972x4fbc8495 : interfaceC4660x9028c9b0;
        long millis = (i18 & 4) != 0 ? java.util.concurrent.TimeUnit.MINUTES.toMillis(3L) : j17;
        int i19 = i18 & 8;
        long j27 = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        long j28 = i19 != 0 ? Long.MAX_VALUE : j18;
        j27 = (i18 & 16) == 0 ? j19 : j27;
        int i27 = (i18 & 32) != 0 ? 3 : i17;
        yz5.r callback = (i18 & 64) != 0 ? ji.f.f381412d : rVar;
        yz5.a extraPssFactory = (i18 & 128) != 0 ? ji.g.f381413d : aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bgStatefulOwner, "bgStatefulOwner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraPssFactory, "extraPssFactory");
        this.f381416c = z18;
        this.f381417d = bgStatefulOwner;
        this.f381418e = millis;
        this.f381419f = callback;
        this.f381420g = extraPssFactory;
        this.f381414a = new ji.q(j28, i27, java.util.concurrent.TimeUnit.MINUTES.toMillis(5L));
        this.f381415b = new ji.q(j27, i27, 0L);
    }

    /* renamed from: toString */
    public java.lang.String m140984x9616526c() {
        return "AppBgSumPssMonitorConfig(enable=" + this.f381416c + ", bgStatefulOwner=" + this.f381417d + ", checkInterval=" + this.f381418e + ", callback=" + this.f381419f.getClass().getName() + ", thresholdKB=" + this.f381414a + ", extraPssFactory=" + this.f381420g.getClass().getName() + ')';
    }
}
