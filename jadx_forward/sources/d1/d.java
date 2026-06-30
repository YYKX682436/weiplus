package d1;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public float f307152a;

    /* renamed from: b, reason: collision with root package name */
    public float f307153b;

    /* renamed from: c, reason: collision with root package name */
    public float f307154c;

    /* renamed from: d, reason: collision with root package name */
    public float f307155d;

    public d(float f17, float f18, float f19, float f27) {
        this.f307152a = f17;
        this.f307153b = f18;
        this.f307154c = f19;
        this.f307155d = f27;
    }

    public final void a(float f17, float f18, float f19, float f27) {
        this.f307152a = java.lang.Math.max(f17, this.f307152a);
        this.f307153b = java.lang.Math.max(f18, this.f307153b);
        this.f307154c = java.lang.Math.min(f19, this.f307154c);
        this.f307155d = java.lang.Math.min(f27, this.f307155d);
    }

    public final boolean b() {
        return this.f307152a >= this.f307154c || this.f307153b >= this.f307155d;
    }

    /* renamed from: toString */
    public java.lang.String m123312x9616526c() {
        return "MutableRect(" + d1.c.a(this.f307152a, 1) + ", " + d1.c.a(this.f307153b, 1) + ", " + d1.c.a(this.f307154c, 1) + ", " + d1.c.a(this.f307155d, 1) + ')';
    }
}
