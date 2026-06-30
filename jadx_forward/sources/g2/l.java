package g2;

/* loaded from: classes14.dex */
public final class l {

    /* renamed from: f, reason: collision with root package name */
    public static final g2.l f349249f = new g2.l(false, 0, true, 1, 1, null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f349250a;

    /* renamed from: b, reason: collision with root package name */
    public final int f349251b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f349252c;

    /* renamed from: d, reason: collision with root package name */
    public final int f349253d;

    /* renamed from: e, reason: collision with root package name */
    public final int f349254e;

    public l(boolean z17, int i17, boolean z18, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f349250a = z17;
        this.f349251b = i17;
        this.f349252c = z18;
        this.f349253d = i18;
        this.f349254e = i19;
    }

    /* renamed from: equals */
    public boolean m130701xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2.l)) {
            return false;
        }
        g2.l lVar = (g2.l) obj;
        if (this.f349250a != lVar.f349250a) {
            return false;
        }
        if (!(this.f349251b == lVar.f349251b) || this.f349252c != lVar.f349252c) {
            return false;
        }
        if (this.f349253d == lVar.f349253d) {
            return this.f349254e == lVar.f349254e;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m130702x8cdac1b() {
        return (((((((java.lang.Boolean.hashCode(this.f349250a) * 31) + java.lang.Integer.hashCode(this.f349251b)) * 31) + java.lang.Boolean.hashCode(this.f349252c)) * 31) + java.lang.Integer.hashCode(this.f349253d)) * 31) + java.lang.Integer.hashCode(this.f349254e);
    }

    /* renamed from: toString */
    public java.lang.String m130703x9616526c() {
        return "ImeOptions(singleLine=" + this.f349250a + ", capitalization=" + ((java.lang.Object) g2.r.a(this.f349251b)) + ", autoCorrect=" + this.f349252c + ", keyboardType=" + ((java.lang.Object) g2.s.a(this.f349253d)) + ", imeAction=" + ((java.lang.Object) g2.k.a(this.f349254e)) + ')';
    }
}
