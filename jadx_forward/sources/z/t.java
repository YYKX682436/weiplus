package z;

/* loaded from: classes13.dex */
public final class t extends z.w {

    /* renamed from: a, reason: collision with root package name */
    public float f550364a;

    public t(float f17) {
        super(null);
        this.f550364a = f17;
    }

    @Override // z.w
    public float a(int i17) {
        if (i17 == 0) {
            return this.f550364a;
        }
        return 0.0f;
    }

    @Override // z.w
    public int b() {
        return 1;
    }

    @Override // z.w
    public z.w c() {
        return new z.t(0.0f);
    }

    @Override // z.w
    public void d() {
        this.f550364a = 0.0f;
    }

    @Override // z.w
    public void e(int i17, float f17) {
        if (i17 == 0) {
            this.f550364a = f17;
        }
    }

    /* renamed from: equals */
    public boolean m178185xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof z.t) {
            return (((z.t) obj).f550364a > this.f550364a ? 1 : (((z.t) obj).f550364a == this.f550364a ? 0 : -1)) == 0;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m178186x8cdac1b() {
        return java.lang.Float.hashCode(this.f550364a);
    }

    /* renamed from: toString */
    public java.lang.String m178187x9616526c() {
        return "AnimationVector1D: value = " + this.f550364a;
    }
}
