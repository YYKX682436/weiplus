package tu0;

/* loaded from: classes5.dex */
public final class g extends yl.g {

    /* renamed from: p, reason: collision with root package name */
    public byte[] f503615p;

    /* renamed from: q, reason: collision with root package name */
    public tl.h0 f503616q;

    public g(int i17, int i18) {
        super(i17, i18);
        this.f503615p = null;
        this.f503616q = null;
    }

    @Override // yl.g, yl.b
    public void d() {
        super.d();
        this.f503615p = null;
        this.f503616q = null;
    }

    public int h(byte[] bArr, int i17, boolean z17) {
        byte[] bArr2 = this.f503615p;
        if (bArr2 == null || bArr2.length < i17) {
            this.f503615p = new byte[i17];
        }
        java.lang.System.arraycopy(bArr, 0, this.f503615p, 0, i17);
        if (this.f503616q == null) {
            this.f503616q = new tl.h0(this.f503615p, i17, z17);
        }
        tl.h0 h0Var = this.f503616q;
        h0Var.f501581a = this.f503615p;
        h0Var.f501582b = i17;
        h0Var.f501583c = z17;
        return e(h0Var, 0, false);
    }
}
