package bs2;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f23821a;

    public c0(long j17) {
        this.f23821a = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bs2.c0) && this.f23821a == ((bs2.c0) obj).f23821a;
    }

    public int hashCode() {
        return java.lang.Long.hashCode(this.f23821a);
    }

    public java.lang.String toString() {
        return "CacheTime(lastTime=" + this.f23821a + ')';
    }
}
