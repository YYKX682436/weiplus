package p16;

/* loaded from: classes13.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f432849a;

    /* renamed from: b, reason: collision with root package name */
    public final int f432850b;

    public k(java.lang.Object obj, int i17) {
        this.f432849a = obj;
        this.f432850b = i17;
    }

    /* renamed from: equals */
    public boolean m157716xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof p16.k)) {
            return false;
        }
        p16.k kVar = (p16.k) obj;
        return this.f432849a == kVar.f432849a && this.f432850b == kVar.f432850b;
    }

    /* renamed from: hashCode */
    public int m157717x8cdac1b() {
        return (java.lang.System.identityHashCode(this.f432849a) * 65535) + this.f432850b;
    }
}
