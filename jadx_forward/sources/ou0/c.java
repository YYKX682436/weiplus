package ou0;

/* loaded from: classes5.dex */
public final class c extends ou0.b {
    @Override // ou0.b
    public void a(float f17) {
        this.f430418c += f17;
    }

    @Override // ou0.b
    public float b(float f17, float f18, float f19) {
        boolean z17 = f19 > this.f430417b;
        float abs = java.lang.Math.abs(f17 - f18);
        float f27 = this.f430416a;
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e = this.f430419d;
        if (z17) {
            c3974x289f3e.f129332x = abs;
            c3974x289f3e.f129333y = java.lang.Math.abs(abs - f27);
        } else {
            c3974x289f3e.f129332x = -abs;
            c3974x289f3e.f129333y = -java.lang.Math.abs(abs - f27);
        }
        return c3974x289f3e.f129332x;
    }

    @Override // ou0.b
    public boolean c() {
        return java.lang.Math.abs(this.f430418c) <= this.f430416a * ((float) 2);
    }
}
