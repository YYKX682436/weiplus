package dc;

/* loaded from: classes16.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final dc.q f310147a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f310148b;

    public f(dc.q qVar, java.lang.String str) {
        this.f310147a = qVar;
        this.f310148b = str;
    }

    /* renamed from: equals */
    public final boolean m123895xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc.f)) {
            return false;
        }
        dc.f fVar = (dc.f) obj;
        return this.f310147a == fVar.f310147a && this.f310148b.equals(fVar.f310148b);
    }

    /* renamed from: hashCode */
    public final int m123896x8cdac1b() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.f310147a, this.f310148b});
    }
}
