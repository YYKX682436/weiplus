package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public class m extends p012xc85e97e9.p087x9da2e250.app.n {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f92921c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f92922d;

    /* renamed from: e, reason: collision with root package name */
    public p012xc85e97e9.p087x9da2e250.app.p0 f92923e;

    public m(p012xc85e97e9.p087x9da2e250.app.m3 m3Var, j3.h hVar, boolean z17) {
        super(m3Var, hVar);
        this.f92922d = false;
        this.f92921c = z17;
    }

    public p012xc85e97e9.p087x9da2e250.app.p0 c(android.content.Context context) {
        if (this.f92922d) {
            return this.f92923e;
        }
        p012xc85e97e9.p087x9da2e250.app.m3 m3Var = this.f92940a;
        p012xc85e97e9.p087x9da2e250.app.p0 a17 = p012xc85e97e9.p087x9da2e250.app.r0.a(context, m3Var.f92935c, m3Var.f92933a == p012xc85e97e9.p087x9da2e250.app.l3.VISIBLE, this.f92921c);
        this.f92923e = a17;
        this.f92922d = true;
        return a17;
    }
}
