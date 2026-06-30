package n3;

/* loaded from: classes14.dex */
public class b3 extends n3.a3 {

    /* renamed from: n, reason: collision with root package name */
    public e3.d f415857n;

    /* renamed from: o, reason: collision with root package name */
    public e3.d f415858o;

    /* renamed from: p, reason: collision with root package name */
    public e3.d f415859p;

    public b3(n3.g3 g3Var, android.view.WindowInsets windowInsets) {
        super(g3Var, windowInsets);
        this.f415857n = null;
        this.f415858o = null;
        this.f415859p = null;
    }

    @Override // n3.d3
    public e3.d i() {
        if (this.f415858o == null) {
            this.f415858o = e3.d.d(this.f415979c.getMandatorySystemGestureInsets());
        }
        return this.f415858o;
    }

    @Override // n3.d3
    public e3.d k() {
        if (this.f415857n == null) {
            this.f415857n = e3.d.d(this.f415979c.getSystemGestureInsets());
        }
        return this.f415857n;
    }

    @Override // n3.d3
    public e3.d m() {
        if (this.f415859p == null) {
            this.f415859p = e3.d.d(this.f415979c.getTappableElementInsets());
        }
        return this.f415859p;
    }

    @Override // n3.z2, n3.d3
    public void t(e3.d dVar) {
    }

    public b3(n3.g3 g3Var, n3.b3 b3Var) {
        super(g3Var, b3Var);
        this.f415857n = null;
        this.f415858o = null;
        this.f415859p = null;
    }
}
