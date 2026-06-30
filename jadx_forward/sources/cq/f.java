package cq;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f302720a;

    /* renamed from: b, reason: collision with root package name */
    public final int f302721b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f302722c;

    public f(long j17, int i17) {
        this.f302720a = j17;
        this.f302721b = i17;
    }

    /* renamed from: equals */
    public boolean m122426xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cq.f)) {
            return false;
        }
        cq.f fVar = (cq.f) obj;
        return this.f302720a == fVar.f302720a && this.f302721b == fVar.f302721b;
    }

    /* renamed from: hashCode */
    public int m122427x8cdac1b() {
        return (java.lang.Long.hashCode(this.f302720a) * 31) + java.lang.Integer.hashCode(this.f302721b);
    }

    /* renamed from: toString */
    public java.lang.String m122428x9616526c() {
        return "LocalFinderObjectExtWithScene(objectId=" + this.f302720a + ", commentScene=" + this.f302721b + ')';
    }
}
