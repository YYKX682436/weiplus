package rt1;

/* loaded from: classes16.dex */
public final class j0 extends rt1.k0 {

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f480959n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f480960o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f480961p;

    public j0(java.lang.String str, int i17) {
        super(str, i17, null);
        this.f480959n = jz5.h.b(rt1.i0.f480954d);
        this.f480960o = jz5.h.b(rt1.h0.f480949d);
        this.f480961p = jz5.h.b(new rt1.g0(this));
    }

    @Override // rt1.x
    public int h() {
        return ((java.lang.Number) ((jz5.n) this.f480961p).mo141623x754a37bb()).intValue();
    }

    @Override // rt1.x
    public java.lang.CharSequence[] i() {
        return (java.lang.CharSequence[]) ((jz5.n) this.f480960o).mo141623x754a37bb();
    }

    @Override // rt1.x
    public java.lang.CharSequence j() {
        return (java.lang.CharSequence) ((jz5.n) this.f480959n).mo141623x754a37bb();
    }
}
