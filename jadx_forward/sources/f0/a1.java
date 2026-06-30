package f0;

/* loaded from: classes14.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public int f339532a;

    /* renamed from: b, reason: collision with root package name */
    public int f339533b;

    /* renamed from: c, reason: collision with root package name */
    public final n0.v2 f339534c;

    /* renamed from: d, reason: collision with root package name */
    public final n0.v2 f339535d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f339536e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f339537f;

    public a1(int i17, int i18) {
        this.f339532a = i17;
        this.f339533b = i18;
        this.f339534c = n0.s4.c(java.lang.Integer.valueOf(i17), null, 2, null);
        this.f339535d = n0.s4.c(java.lang.Integer.valueOf(this.f339533b), null, 2, null);
    }

    public final void a(int i17, int i18) {
        if (!(((float) i17) >= 0.0f)) {
            throw new java.lang.IllegalArgumentException(("Index should be non-negative (" + i17 + ')').toString());
        }
        if (!(i17 == this.f339532a)) {
            this.f339532a = i17;
            ((n0.q4) this.f339534c).mo148714x53d8522f(java.lang.Integer.valueOf(i17));
        }
        if (i18 != this.f339533b) {
            this.f339533b = i18;
            ((n0.q4) this.f339535d).mo148714x53d8522f(java.lang.Integer.valueOf(i18));
        }
    }
}
