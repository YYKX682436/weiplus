package o;

/* loaded from: classes15.dex */
public abstract class d implements o.g0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f423223d;

    /* renamed from: e, reason: collision with root package name */
    public android.content.Context f423224e;

    /* renamed from: f, reason: collision with root package name */
    public o.r f423225f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.LayoutInflater f423226g;

    /* renamed from: h, reason: collision with root package name */
    public o.f0 f423227h;

    /* renamed from: i, reason: collision with root package name */
    public final int f423228i;

    /* renamed from: m, reason: collision with root package name */
    public final int f423229m;

    /* renamed from: n, reason: collision with root package name */
    public o.i0 f423230n;

    /* renamed from: o, reason: collision with root package name */
    public int f423231o;

    public d(android.content.Context context, int i17, int i18) {
        this.f423223d = context;
        this.f423226g = android.view.LayoutInflater.from(context);
        this.f423228i = i17;
        this.f423229m = i18;
    }

    @Override // o.g0
    public void g(o.f0 f0Var) {
        this.f423227h = f0Var;
    }

    @Override // o.g0
    /* renamed from: getId */
    public int mo2872x5db1b11() {
        return this.f423231o;
    }

    @Override // o.g0
    public boolean h(o.r rVar, o.u uVar) {
        return false;
    }

    @Override // o.g0
    public boolean j(o.r rVar, o.u uVar) {
        return false;
    }
}
