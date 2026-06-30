package cy1;

/* renamed from: cy1.a$$b */
/* loaded from: classes11.dex */
public final /* synthetic */ class RunnableC28186x2ca3e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cy1.a f306235d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ iy1.a f306236e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f306237f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gy1.d f306238g;

    public /* synthetic */ RunnableC28186x2ca3e1(cy1.a aVar, iy1.a aVar2, int i17, gy1.d dVar) {
        this.f306235d = aVar;
        this.f306236e = aVar2;
        this.f306237f = i17;
        this.f306238g = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cy1.a aVar = this.f306235d;
        aVar.getClass();
        java.lang.String b17 = aVar.f306223m.b(this.f306236e.f377280d, this.f306237f);
        if (u46.l.e(b17)) {
            return;
        }
        this.f306238g.a(b17);
    }
}
