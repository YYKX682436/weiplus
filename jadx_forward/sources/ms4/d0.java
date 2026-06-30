package ms4;

/* loaded from: classes8.dex */
public final class d0 implements ms4.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412539a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ms4.j0 f412540b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f412541c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.hc5 f412542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ js4.n f412543e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412544f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ js4.o f412545g;

    public d0(java.lang.String str, ms4.j0 j0Var, android.app.Activity activity, r45.hc5 hc5Var, js4.n nVar, java.lang.String str2, js4.o oVar) {
        this.f412539a = str;
        this.f412540b = j0Var;
        this.f412541c = activity;
        this.f412542d = hc5Var;
        this.f412543e = nVar;
        this.f412544f = str2;
        this.f412545g = oVar;
    }

    @Override // ms4.b
    public void a(r45.ma5 ma5Var) {
        js4.o oVar = this.f412545g;
        if (ma5Var == null) {
            if (oVar != null) {
                oVar.a(4, 10000, "");
                return;
            }
            return;
        }
        if (ma5Var.f461840e == 3) {
            java.lang.String str = this.f412539a;
            if (!(str == null || str.length() == 0)) {
                this.f412540b.d(this.f412541c, this.f412542d, "release", this.f412543e, this.f412544f);
                return;
            }
        }
        if (oVar != null) {
            oVar.a(4, 10000, "");
        }
    }
}
