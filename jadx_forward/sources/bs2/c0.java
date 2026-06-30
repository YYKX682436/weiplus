package bs2;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f105354a;

    public c0(long j17) {
        this.f105354a = j17;
    }

    /* renamed from: equals */
    public boolean m11094xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bs2.c0) && this.f105354a == ((bs2.c0) obj).f105354a;
    }

    /* renamed from: hashCode */
    public int m11095x8cdac1b() {
        return java.lang.Long.hashCode(this.f105354a);
    }

    /* renamed from: toString */
    public java.lang.String m11096x9616526c() {
        return "CacheTime(lastTime=" + this.f105354a + ')';
    }
}
