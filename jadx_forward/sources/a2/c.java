package a2;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f82208a;

    /* renamed from: b, reason: collision with root package name */
    public final int f82209b;

    /* renamed from: c, reason: collision with root package name */
    public final int f82210c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f82211d;

    public c(java.lang.Object obj, int i17, int i18, java.lang.String tag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        this.f82208a = obj;
        this.f82209b = i17;
        this.f82210c = i18;
        this.f82211d = tag;
        if (!(i17 <= i18)) {
            throw new java.lang.IllegalArgumentException("Reversed range is not supported".toString());
        }
    }

    /* renamed from: equals */
    public boolean m334xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2.c)) {
            return false;
        }
        a2.c cVar = (a2.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82208a, cVar.f82208a) && this.f82209b == cVar.f82209b && this.f82210c == cVar.f82210c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82211d, cVar.f82211d);
    }

    /* renamed from: hashCode */
    public int m335x8cdac1b() {
        java.lang.Object obj = this.f82208a;
        return ((((((obj == null ? 0 : obj.hashCode()) * 31) + java.lang.Integer.hashCode(this.f82209b)) * 31) + java.lang.Integer.hashCode(this.f82210c)) * 31) + this.f82211d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m336x9616526c() {
        return "Range(item=" + this.f82208a + ", start=" + this.f82209b + ", end=" + this.f82210c + ", tag=" + this.f82211d + ')';
    }

    public c(java.lang.Object obj, int i17, int i18) {
        this(obj, i17, i18, "");
    }
}
