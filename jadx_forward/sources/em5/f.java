package em5;

/* loaded from: classes9.dex */
public abstract class f implements im5.b {

    /* renamed from: d, reason: collision with root package name */
    public final im5.c f336750d = new im5.c();

    /* renamed from: e, reason: collision with root package name */
    public final im5.c f336751e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f336752f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f336753g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.a f336754h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f336755i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f336756m;

    /* renamed from: n, reason: collision with root package name */
    public hm5.a f336757n;

    public f() {
        im5.c cVar = new im5.c();
        this.f336751e = cVar;
        this.f336752f = new java.util.concurrent.ConcurrentHashMap();
        this.f336753g = new byte[0];
        em5.a aVar = new em5.a(this);
        this.f336754h = aVar;
        this.f336755i = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f336756m = new java.util.HashMap();
        cVar.mo46316x322b85(aVar);
        aVar.m82245xcf5eeb83(new em5.b(this));
    }

    public final void a() {
        if (android.os.Looper.myLooper() != this.f336754h.m82252x23b2dd47() || this.f336755i.get()) {
            return;
        }
        jm5.b.a("Vending.Interactor", "This interactor has not call onCreate() yet! Interactor : %s", this);
    }

    public void b() {
        this.f336755i.set(true);
    }

    public void c() {
        this.f336750d.mo10668x2efc64();
        this.f336751e.mo10668x2efc64();
    }

    @Override // im5.b
    /* renamed from: keep */
    public void mo46316x322b85(im5.a aVar) {
        this.f336750d.mo46316x322b85(aVar);
    }
}
