package dg3;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final dg3.q f313870a;

    /* renamed from: b, reason: collision with root package name */
    public final int f313871b;

    /* renamed from: c, reason: collision with root package name */
    public final int f313872c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f313873d;

    public p(dg3.q type, int i17, int i18, java.lang.Integer num) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        this.f313870a = type;
        this.f313871b = i17;
        this.f313872c = i18;
        this.f313873d = num;
    }

    /* renamed from: equals */
    public boolean m124373xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dg3.p)) {
            return false;
        }
        dg3.p pVar = (dg3.p) obj;
        return this.f313870a == pVar.f313870a && this.f313871b == pVar.f313871b && this.f313872c == pVar.f313872c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f313873d, pVar.f313873d);
    }

    /* renamed from: hashCode */
    public int m124374x8cdac1b() {
        int hashCode = ((((this.f313870a.hashCode() * 31) + java.lang.Integer.hashCode(this.f313871b)) * 31) + java.lang.Integer.hashCode(this.f313872c)) * 31;
        java.lang.Integer num = this.f313873d;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m124375x9616526c() {
        return "MenuItemConfig(type=" + this.f313870a + ", textRes=" + this.f313871b + ", iconRes=" + this.f313872c + ", iconColorRes=" + this.f313873d + ')';
    }
}
