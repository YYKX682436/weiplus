package z;

/* loaded from: classes14.dex */
public final class v extends z.w {

    /* renamed from: a, reason: collision with root package name */
    public float f550382a;

    /* renamed from: b, reason: collision with root package name */
    public float f550383b;

    /* renamed from: c, reason: collision with root package name */
    public float f550384c;

    /* renamed from: d, reason: collision with root package name */
    public float f550385d;

    public v(float f17, float f18, float f19, float f27) {
        super(null);
        this.f550382a = f17;
        this.f550383b = f18;
        this.f550384c = f19;
        this.f550385d = f27;
    }

    @Override // z.w
    public float a(int i17) {
        if (i17 == 0) {
            return this.f550382a;
        }
        if (i17 == 1) {
            return this.f550383b;
        }
        if (i17 == 2) {
            return this.f550384c;
        }
        if (i17 != 3) {
            return 0.0f;
        }
        return this.f550385d;
    }

    @Override // z.w
    public int b() {
        return 4;
    }

    @Override // z.w
    public z.w c() {
        return new z.v(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // z.w
    public void d() {
        this.f550382a = 0.0f;
        this.f550383b = 0.0f;
        this.f550384c = 0.0f;
        this.f550385d = 0.0f;
    }

    @Override // z.w
    public void e(int i17, float f17) {
        if (i17 == 0) {
            this.f550382a = f17;
            return;
        }
        if (i17 == 1) {
            this.f550383b = f17;
        } else if (i17 == 2) {
            this.f550384c = f17;
        } else {
            if (i17 != 3) {
                return;
            }
            this.f550385d = f17;
        }
    }

    /* renamed from: equals */
    public boolean m178191xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof z.v)) {
            return false;
        }
        z.v vVar = (z.v) obj;
        if (!(vVar.f550382a == this.f550382a)) {
            return false;
        }
        if (!(vVar.f550383b == this.f550383b)) {
            return false;
        }
        if (vVar.f550384c == this.f550384c) {
            return (vVar.f550385d > this.f550385d ? 1 : (vVar.f550385d == this.f550385d ? 0 : -1)) == 0;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m178192x8cdac1b() {
        return (((((java.lang.Float.hashCode(this.f550382a) * 31) + java.lang.Float.hashCode(this.f550383b)) * 31) + java.lang.Float.hashCode(this.f550384c)) * 31) + java.lang.Float.hashCode(this.f550385d);
    }

    /* renamed from: toString */
    public java.lang.String m178193x9616526c() {
        return "AnimationVector4D: v1 = " + this.f550382a + ", v2 = " + this.f550383b + ", v3 = " + this.f550384c + ", v4 = " + this.f550385d;
    }
}
