package a2;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f82195a;

    /* renamed from: b, reason: collision with root package name */
    public final int f82196b;

    /* renamed from: c, reason: collision with root package name */
    public int f82197c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f82198d;

    public a(java.lang.Object obj, int i17, int i18, java.lang.String tag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        this.f82195a = obj;
        this.f82196b = i17;
        this.f82197c = i18;
        this.f82198d = tag;
    }

    public final a2.c a(int i17) {
        int i18 = this.f82197c;
        if (i18 != Integer.MIN_VALUE) {
            i17 = i18;
        }
        if (i17 != Integer.MIN_VALUE) {
            return new a2.c(this.f82195a, this.f82196b, i17, this.f82198d);
        }
        throw new java.lang.IllegalStateException("Item.end should be set first".toString());
    }

    /* renamed from: equals */
    public boolean m327xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2.a)) {
            return false;
        }
        a2.a aVar = (a2.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82195a, aVar.f82195a) && this.f82196b == aVar.f82196b && this.f82197c == aVar.f82197c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82198d, aVar.f82198d);
    }

    /* renamed from: hashCode */
    public int m328x8cdac1b() {
        java.lang.Object obj = this.f82195a;
        return ((((((obj == null ? 0 : obj.hashCode()) * 31) + java.lang.Integer.hashCode(this.f82196b)) * 31) + java.lang.Integer.hashCode(this.f82197c)) * 31) + this.f82198d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m329x9616526c() {
        return "MutableRange(item=" + this.f82195a + ", start=" + this.f82196b + ", end=" + this.f82197c + ", tag=" + this.f82198d + ')';
    }

    public /* synthetic */ a(java.lang.Object obj, int i17, int i18, java.lang.String str, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(obj, i17, (i19 & 4) != 0 ? Integer.MIN_VALUE : i18, (i19 & 8) != 0 ? "" : str);
    }
}
