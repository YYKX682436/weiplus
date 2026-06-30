package v24;

/* loaded from: classes15.dex */
public class y implements com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.tg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f514496a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f514497b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f514498c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v24.n0 f514499d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wd0.p1 f514500e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f514501f;

    public y(android.content.Context context, int i17, long j17, v24.n0 n0Var, wd0.p1 p1Var, boolean z17) {
        this.f514496a = context;
        this.f514497b = i17;
        this.f514498c = j17;
        this.f514499d = n0Var;
        this.f514500e = p1Var;
        this.f514501f = z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.tg
    public void a(boolean z17) {
        if (z17) {
            v24.o0.a(this.f514496a, this.f514497b, 1, this.f514498c, 0L, new v24.x(this), this.f514501f);
        } else {
            this.f514500e.a();
        }
    }
}
