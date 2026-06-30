package a2;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f675a;

    /* renamed from: b, reason: collision with root package name */
    public final int f676b;

    /* renamed from: c, reason: collision with root package name */
    public final int f677c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f678d;

    public c(java.lang.Object obj, int i17, int i18, java.lang.String tag) {
        kotlin.jvm.internal.o.g(tag, "tag");
        this.f675a = obj;
        this.f676b = i17;
        this.f677c = i18;
        this.f678d = tag;
        if (!(i17 <= i18)) {
            throw new java.lang.IllegalArgumentException("Reversed range is not supported".toString());
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2.c)) {
            return false;
        }
        a2.c cVar = (a2.c) obj;
        return kotlin.jvm.internal.o.b(this.f675a, cVar.f675a) && this.f676b == cVar.f676b && this.f677c == cVar.f677c && kotlin.jvm.internal.o.b(this.f678d, cVar.f678d);
    }

    public int hashCode() {
        java.lang.Object obj = this.f675a;
        return ((((((obj == null ? 0 : obj.hashCode()) * 31) + java.lang.Integer.hashCode(this.f676b)) * 31) + java.lang.Integer.hashCode(this.f677c)) * 31) + this.f678d.hashCode();
    }

    public java.lang.String toString() {
        return "Range(item=" + this.f675a + ", start=" + this.f676b + ", end=" + this.f677c + ", tag=" + this.f678d + ')';
    }

    public c(java.lang.Object obj, int i17, int i18) {
        this(obj, i17, i18, "");
    }
}
