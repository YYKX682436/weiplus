package cw2;

/* loaded from: classes11.dex */
public final class v5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.z5 f305597d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f305598e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f305599f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f305600g;

    public v5(cw2.z5 z5Var, android.view.Surface surface, int i17, int i18) {
        this.f305597d = z5Var;
        this.f305598e = surface;
        this.f305599f = i17;
        this.f305600g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f305597d.f305674i = new cw2.p5(this.f305598e, this.f305599f, this.f305600g);
    }
}
