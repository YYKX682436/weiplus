package nv2;

/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f422044a;

    /* renamed from: b, reason: collision with root package name */
    public final int f422045b;

    /* renamed from: c, reason: collision with root package name */
    public final int f422046c;

    public j1(long j17, int i17, int i18) {
        this.f422044a = j17;
        this.f422045b = i17;
        this.f422046c = i18;
    }

    /* renamed from: equals */
    public boolean m150141xb2c87fbf(java.lang.Object obj) {
        nv2.j1 j1Var = obj instanceof nv2.j1 ? (nv2.j1) obj : null;
        return j1Var != null && j1Var.f422044a == this.f422044a && j1Var.f422045b == this.f422045b && j1Var.f422046c == this.f422046c;
    }

    /* renamed from: hashCode */
    public int m150142x8cdac1b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f422044a);
        sb6.append('_');
        sb6.append(this.f422045b);
        sb6.append('_');
        sb6.append(this.f422046c);
        return sb6.toString().hashCode();
    }
}
