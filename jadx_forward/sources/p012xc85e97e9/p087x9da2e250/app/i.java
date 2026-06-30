package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.m3 f92871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.m3 f92872e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f92873f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x.b f92874g;

    public i(p012xc85e97e9.p087x9da2e250.app.p pVar, p012xc85e97e9.p087x9da2e250.app.m3 m3Var, p012xc85e97e9.p087x9da2e250.app.m3 m3Var2, boolean z17, x.b bVar) {
        this.f92871d = m3Var;
        this.f92872e = m3Var2;
        this.f92873f = z17;
        this.f92874g = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        p012xc85e97e9.p087x9da2e250.app.r2.c(this.f92871d.f92935c, this.f92872e.f92935c, this.f92873f, this.f92874g, false);
    }
}
