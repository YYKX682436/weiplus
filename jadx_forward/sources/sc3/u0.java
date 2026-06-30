package sc3;

/* loaded from: classes7.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f488070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f488071e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f488072f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f488073g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f488074h;

    public u0(sc3.k1 k1Var, int i17, android.view.Surface surface, int i18, int i19) {
        this.f488070d = k1Var;
        this.f488071e = i17;
        this.f488072f = surface;
        this.f488073g = i18;
        this.f488074h = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pc3.c cVar = (pc3.c) this.f488070d.f488022u.get(java.lang.Integer.valueOf(this.f488071e));
        if (cVar != null) {
            int i17 = this.f488073g;
            int i18 = this.f488074h;
            android.view.Surface surface = this.f488072f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
            cVar.f434904e = surface;
            gh.t tVar = cVar.f434903d;
            if (tVar != null) {
                gh.s.a(tVar, surface, i17, i18, false, false, 16, null);
            }
        }
    }
}
