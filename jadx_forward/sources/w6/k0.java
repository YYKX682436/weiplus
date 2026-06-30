package w6;

/* loaded from: classes13.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final m7.f f524664a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.Executor f524665b;

    public k0(m7.f fVar, java.util.concurrent.Executor executor) {
        this.f524664a = fVar;
        this.f524665b = executor;
    }

    /* renamed from: equals */
    public boolean m173239xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof w6.k0) {
            return this.f524664a.equals(((w6.k0) obj).f524664a);
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m173240x8cdac1b() {
        return this.f524664a.hashCode();
    }
}
