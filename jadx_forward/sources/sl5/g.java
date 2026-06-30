package sl5;

/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final sl5.d f490837a;

    /* renamed from: b, reason: collision with root package name */
    public final sl5.a f490838b;

    /* renamed from: c, reason: collision with root package name */
    public final tl5.s f490839c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f490840d;

    /* renamed from: e, reason: collision with root package name */
    public float f490841e;

    /* renamed from: f, reason: collision with root package name */
    public int f490842f;

    /* renamed from: g, reason: collision with root package name */
    public final sl5.c f490843g;

    public g(sl5.d host, sl5.a config, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        config = (i17 & 2) != 0 ? new sl5.a(0.0f, 0.0f, 0, 0, 0L, 31, null) : config;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f490837a = host;
        this.f490838b = config;
        this.f490839c = new tl5.s(host, config);
        this.f490841e = 1.0f;
        cd5.a aVar = (cd5.a) host;
        sl5.c cVar = new sl5.c(aVar.c(), new sl5.f(this), config);
        this.f490843g = cVar;
        aVar.c().U0(cVar);
        aVar.c().P(cVar);
    }

    public final void a() {
        int i17 = 0;
        if (this.f490840d) {
            sl5.d dVar = this.f490837a;
            int i18 = ((cd5.a) dVar).e(true) == null ? 0 : 1;
            i17 = ((cd5.a) dVar).e(false) != null ? i18 | 2 : i18;
        }
        this.f490843g.f490825h = i17;
    }
}
