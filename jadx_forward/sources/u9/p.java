package u9;

/* loaded from: classes15.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f507314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f507315e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f507316f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f507317g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u9.s f507318h;

    public p(u9.s sVar, int i17, int i18, int i19, float f17) {
        this.f507318h = sVar;
        this.f507314d = i17;
        this.f507315e = i18;
        this.f507316f = i19;
        this.f507317g = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f507318h.f507324b.h(this.f507314d, this.f507315e, this.f507316f, this.f507317g);
    }
}
