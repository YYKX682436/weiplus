package km2;

/* loaded from: classes3.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f390697a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f390698b;

    public n0(java.lang.String str, java.lang.String str2) {
        this.f390697a = str;
        this.f390698b = str2;
    }

    /* renamed from: equals */
    public boolean m143677xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km2.n0)) {
            return false;
        }
        km2.n0 n0Var = (km2.n0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390697a, n0Var.f390697a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390698b, n0Var.f390698b);
    }

    /* renamed from: hashCode */
    public int m143678x8cdac1b() {
        java.lang.String str = this.f390697a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f390698b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m143679x9616526c() {
        return "ScreenDeviceData(displayName=" + this.f390697a + ", id=" + this.f390698b + ')';
    }
}
