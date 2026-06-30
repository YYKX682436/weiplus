package a0;

/* loaded from: classes14.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final float f192a;

    /* renamed from: b, reason: collision with root package name */
    public final e1.r f193b;

    public k(float f17, e1.r rVar, kotlin.jvm.internal.i iVar) {
        this.f192a = f17;
        this.f193b = rVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0.k)) {
            return false;
        }
        a0.k kVar = (a0.k) obj;
        return p2.h.a(this.f192a, kVar.f192a) && kotlin.jvm.internal.o.b(this.f193b, kVar.f193b);
    }

    public int hashCode() {
        return (java.lang.Float.hashCode(this.f192a) * 31) + this.f193b.hashCode();
    }

    public java.lang.String toString() {
        return "BorderStroke(width=" + ((java.lang.Object) p2.h.b(this.f192a)) + ", brush=" + this.f193b + ')';
    }
}
