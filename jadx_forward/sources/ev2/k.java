package ev2;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final long f338449a;

    /* renamed from: b, reason: collision with root package name */
    public final int f338450b;

    public k(long j17, int i17) {
        this.f338449a = j17;
        this.f338450b = i17;
    }

    /* renamed from: equals */
    public boolean m128242xb2c87fbf(java.lang.Object obj) {
        ev2.k kVar = obj instanceof ev2.k ? (ev2.k) obj : null;
        return kVar != null && kVar.f338449a == this.f338449a && kVar.f338450b == this.f338450b;
    }

    /* renamed from: hashCode */
    public int m128243x8cdac1b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f338449a);
        sb6.append('_');
        sb6.append(this.f338450b);
        return sb6.toString().hashCode();
    }
}
