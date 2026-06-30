package nk2;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f419496a;

    /* renamed from: b, reason: collision with root package name */
    public final long f419497b;

    /* renamed from: c, reason: collision with root package name */
    public final float f419498c;

    public d(int i17, long j17, float f17) {
        this.f419496a = i17;
        this.f419497b = j17;
        this.f419498c = f17;
    }

    /* renamed from: equals */
    public boolean m149712xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nk2.d)) {
            return false;
        }
        nk2.d dVar = (nk2.d) obj;
        return this.f419496a == dVar.f419496a && this.f419497b == dVar.f419497b && java.lang.Float.compare(this.f419498c, dVar.f419498c) == 0;
    }

    /* renamed from: hashCode */
    public int m149713x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f419496a) * 31) + java.lang.Long.hashCode(this.f419497b)) * 31) + java.lang.Float.hashCode(this.f419498c);
    }

    /* renamed from: toString */
    public java.lang.String m149714x9616526c() {
        return "FirstTimeBeforeData(getOperatorCount=" + this.f419496a + ", liveId=" + this.f419497b + ", pss=" + this.f419498c + ')';
    }
}
