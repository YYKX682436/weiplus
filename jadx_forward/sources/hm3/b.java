package hm3;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f363759a;

    /* renamed from: b, reason: collision with root package name */
    public final long f363760b;

    /* renamed from: c, reason: collision with root package name */
    public final long f363761c;

    /* renamed from: d, reason: collision with root package name */
    public final long f363762d;

    public b(int i17, long j17, long j18, long j19) {
        this.f363759a = i17;
        this.f363760b = j17;
        this.f363761c = j18;
        this.f363762d = j19;
    }

    /* renamed from: equals */
    public boolean m133749xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hm3.b)) {
            return false;
        }
        hm3.b bVar = (hm3.b) obj;
        return this.f363759a == bVar.f363759a && this.f363760b == bVar.f363760b && this.f363761c == bVar.f363761c && this.f363762d == bVar.f363762d;
    }

    /* renamed from: hashCode */
    public int m133750x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f363759a) * 31) + java.lang.Long.hashCode(this.f363760b)) * 31) + java.lang.Long.hashCode(this.f363761c)) * 31) + java.lang.Long.hashCode(this.f363762d);
    }

    /* renamed from: toString */
    public java.lang.String m133751x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f363759a);
        sb6.append(": cost:");
        long j17 = this.f363762d;
        long j18 = this.f363760b;
        sb6.append(j17 - j18);
        sb6.append(" dispatchCost:");
        sb6.append(j17 - this.f363761c);
        sb6.append(" time:");
        sb6.append(k35.m1.d(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f, j18 / 1000));
        return sb6.toString();
    }
}
