package a2;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f662a;

    /* renamed from: b, reason: collision with root package name */
    public final int f663b;

    /* renamed from: c, reason: collision with root package name */
    public int f664c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f665d;

    public a(java.lang.Object obj, int i17, int i18, java.lang.String tag) {
        kotlin.jvm.internal.o.g(tag, "tag");
        this.f662a = obj;
        this.f663b = i17;
        this.f664c = i18;
        this.f665d = tag;
    }

    public final a2.c a(int i17) {
        int i18 = this.f664c;
        if (i18 != Integer.MIN_VALUE) {
            i17 = i18;
        }
        if (i17 != Integer.MIN_VALUE) {
            return new a2.c(this.f662a, this.f663b, i17, this.f665d);
        }
        throw new java.lang.IllegalStateException("Item.end should be set first".toString());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2.a)) {
            return false;
        }
        a2.a aVar = (a2.a) obj;
        return kotlin.jvm.internal.o.b(this.f662a, aVar.f662a) && this.f663b == aVar.f663b && this.f664c == aVar.f664c && kotlin.jvm.internal.o.b(this.f665d, aVar.f665d);
    }

    public int hashCode() {
        java.lang.Object obj = this.f662a;
        return ((((((obj == null ? 0 : obj.hashCode()) * 31) + java.lang.Integer.hashCode(this.f663b)) * 31) + java.lang.Integer.hashCode(this.f664c)) * 31) + this.f665d.hashCode();
    }

    public java.lang.String toString() {
        return "MutableRange(item=" + this.f662a + ", start=" + this.f663b + ", end=" + this.f664c + ", tag=" + this.f665d + ')';
    }

    public /* synthetic */ a(java.lang.Object obj, int i17, int i18, java.lang.String str, int i19, kotlin.jvm.internal.i iVar) {
        this(obj, i17, (i19 & 4) != 0 ? Integer.MIN_VALUE : i18, (i19 & 8) != 0 ? "" : str);
    }
}
