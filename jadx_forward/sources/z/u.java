package z;

/* loaded from: classes14.dex */
public final class u extends z.w {

    /* renamed from: a, reason: collision with root package name */
    public float f550375a;

    /* renamed from: b, reason: collision with root package name */
    public float f550376b;

    public u(float f17, float f18) {
        super(null);
        this.f550375a = f17;
        this.f550376b = f18;
    }

    @Override // z.w
    public float a(int i17) {
        if (i17 == 0) {
            return this.f550375a;
        }
        if (i17 != 1) {
            return 0.0f;
        }
        return this.f550376b;
    }

    @Override // z.w
    public int b() {
        return 2;
    }

    @Override // z.w
    public z.w c() {
        return new z.u(0.0f, 0.0f);
    }

    @Override // z.w
    public void d() {
        this.f550375a = 0.0f;
        this.f550376b = 0.0f;
    }

    @Override // z.w
    public void e(int i17, float f17) {
        if (i17 == 0) {
            this.f550375a = f17;
        } else {
            if (i17 != 1) {
                return;
            }
            this.f550376b = f17;
        }
    }

    /* renamed from: equals */
    public boolean m178188xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof z.u)) {
            return false;
        }
        z.u uVar = (z.u) obj;
        if (uVar.f550375a == this.f550375a) {
            return (uVar.f550376b > this.f550376b ? 1 : (uVar.f550376b == this.f550376b ? 0 : -1)) == 0;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m178189x8cdac1b() {
        return (java.lang.Float.hashCode(this.f550375a) * 31) + java.lang.Float.hashCode(this.f550376b);
    }

    /* renamed from: toString */
    public java.lang.String m178190x9616526c() {
        return "AnimationVector2D: v1 = " + this.f550375a + ", v2 = " + this.f550376b;
    }
}
