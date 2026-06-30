package e0;

/* loaded from: classes14.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public int f327263a;

    /* renamed from: b, reason: collision with root package name */
    public int f327264b;

    /* renamed from: c, reason: collision with root package name */
    public final n0.v2 f327265c;

    /* renamed from: d, reason: collision with root package name */
    public final n0.v2 f327266d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f327267e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f327268f;

    public z0(int i17, int i18) {
        this.f327263a = i17;
        this.f327264b = i18;
        this.f327265c = n0.s4.c(java.lang.Integer.valueOf(i17), null, 2, null);
        this.f327266d = n0.s4.c(java.lang.Integer.valueOf(this.f327264b), null, 2, null);
    }

    public final void a(int i17, int i18) {
        if (!(((float) i17) >= 0.0f)) {
            throw new java.lang.IllegalArgumentException(("Index should be non-negative (" + i17 + ')').toString());
        }
        if (!(i17 == this.f327263a)) {
            this.f327263a = i17;
            ((n0.q4) this.f327265c).mo148714x53d8522f(java.lang.Integer.valueOf(i17));
        }
        if (i18 != this.f327264b) {
            this.f327264b = i18;
            ((n0.q4) this.f327266d).mo148714x53d8522f(java.lang.Integer.valueOf(i18));
        }
    }
}
