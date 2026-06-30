package wi;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: g, reason: collision with root package name */
    public static final long f527655g;

    /* renamed from: h, reason: collision with root package name */
    public static final long f527656h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f527657i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final jr5.a f527658a;

    /* renamed from: b, reason: collision with root package name */
    public final wi.b f527659b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f527660c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f527661d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f527662e;

    /* renamed from: f, reason: collision with root package name */
    public final int f527663f;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MINUTES;
        f527655g = timeUnit.toMillis(1L);
        f527656h = timeUnit.toMillis(20L);
    }

    public c(jr5.a aVar, wi.b bVar, boolean z17, java.lang.String str, java.lang.String str2, boolean z18, int i17, wi.a aVar2) {
        this.f527658a = aVar;
        this.f527659b = bVar;
        this.f527660c = str;
        this.f527661d = str2;
        this.f527662e = z18;
        this.f527663f = i17;
    }

    public long a() {
        java.lang.String b17 = ((com.p314xaae8f345.mm.p849xbf8d97c1.o0) this.f527658a).b("clicfg_matrix_resource_detect_interval_millis", "");
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17);
        long j17 = f527655g;
        return K0 ? j17 : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(b17, j17);
    }
}
