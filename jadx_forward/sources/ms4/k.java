package ms4;

/* loaded from: classes8.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ms4.n f412584d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412585e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412586f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f412587g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ im5.b f412588h;

    public k(ms4.n nVar, java.lang.String str, java.lang.String str2, int i17, im5.b bVar) {
        this.f412584d = nVar;
        this.f412585e = str;
        this.f412586f = str2;
        this.f412587g = i17;
        this.f412588h = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f412584d.N6(this.f412585e, this.f412586f, this.f412587g, this.f412588h);
    }
}
