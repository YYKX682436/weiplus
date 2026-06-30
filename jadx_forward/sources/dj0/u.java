package dj0;

/* loaded from: classes14.dex */
public class u extends dj0.t {

    /* renamed from: o, reason: collision with root package name */
    public dj0.l f314414o;

    /* renamed from: p, reason: collision with root package name */
    public dj0.l f314415p;

    /* renamed from: q, reason: collision with root package name */
    public dj0.l f314416q;

    public u(dj0.x xVar, android.view.WindowInsets windowInsets) {
        super(xVar, windowInsets);
        this.f314414o = null;
        this.f314415p = null;
        this.f314416q = null;
    }

    @Override // dj0.w
    public dj0.l g() {
        if (this.f314415p == null) {
            this.f314415p = dj0.l.b(this.f314408c.getMandatorySystemGestureInsets());
        }
        return this.f314415p;
    }

    @Override // dj0.w
    public dj0.l i() {
        if (this.f314414o == null) {
            this.f314414o = dj0.l.b(this.f314408c.getSystemGestureInsets());
        }
        return this.f314414o;
    }

    @Override // dj0.w
    public dj0.l k() {
        if (this.f314416q == null) {
            this.f314416q = dj0.l.b(this.f314408c.getTappableElementInsets());
        }
        return this.f314416q;
    }

    @Override // dj0.s, dj0.w
    public void q(dj0.l lVar) {
    }

    public u(dj0.x xVar, dj0.u uVar) {
        super(xVar, uVar);
        this.f314414o = null;
        this.f314415p = null;
        this.f314416q = null;
    }
}
