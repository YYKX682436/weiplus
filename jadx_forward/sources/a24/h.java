package a24;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f82414a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Integer f82415b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f82416c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f82417d;

    public h(boolean z17, java.lang.Integer num, java.lang.String str, boolean z18) {
        this.f82414a = z17;
        this.f82415b = num;
        this.f82416c = str;
        this.f82417d = z18;
    }

    /* renamed from: equals */
    public boolean m447xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a24.h)) {
            return false;
        }
        a24.h hVar = (a24.h) obj;
        return this.f82414a == hVar.f82414a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82415b, hVar.f82415b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82416c, hVar.f82416c) && this.f82417d == hVar.f82417d;
    }

    /* renamed from: hashCode */
    public int m448x8cdac1b() {
        int hashCode = java.lang.Boolean.hashCode(this.f82414a) * 31;
        java.lang.Integer num = this.f82415b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.String str = this.f82416c;
        return ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f82417d);
    }

    /* renamed from: toString */
    public java.lang.String m449x9616526c() {
        return "ContentSnapshot(visible=" + this.f82414a + ", header=" + this.f82415b + ", summary=" + this.f82416c + ", checked=" + this.f82417d + ')';
    }
}
