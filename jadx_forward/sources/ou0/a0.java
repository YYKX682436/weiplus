package ou0;

/* loaded from: classes5.dex */
public final class a0 extends ou0.b {

    /* renamed from: g, reason: collision with root package name */
    public final float f430415g;

    public a0(float f17, float f18, float f19) {
        super(f17, f19);
        this.f430415g = f18;
    }

    @Override // ou0.b
    public void a(float f17) {
        this.f430418c *= f17;
    }

    @Override // ou0.b
    public float b(float f17, float f18, float f19) {
        return (this.f430415g / f17) * f19;
    }

    @Override // ou0.b
    public boolean c() {
        float f17 = this.f430418c;
        float f18 = this.f430415g;
        float f19 = f17 * f18;
        float f27 = this.f430416a;
        return f19 >= f18 - f27 && f17 * f18 <= f18 + f27;
    }
}
