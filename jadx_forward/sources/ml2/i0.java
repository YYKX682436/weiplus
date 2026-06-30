package ml2;

/* loaded from: classes3.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f409077a;

    /* renamed from: b, reason: collision with root package name */
    public final int f409078b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f409079c;

    public i0(int i17, int i18, java.lang.String str) {
        this.f409077a = i17;
        this.f409078b = i18;
        this.f409079c = str;
    }

    /* renamed from: equals */
    public boolean m147557xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml2.i0)) {
            return false;
        }
        ml2.i0 i0Var = (ml2.i0) obj;
        return this.f409077a == i0Var.f409077a && this.f409078b == i0Var.f409078b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f409079c, i0Var.f409079c);
    }

    /* renamed from: hashCode */
    public int m147558x8cdac1b() {
        int hashCode = ((java.lang.Integer.hashCode(this.f409077a) * 31) + java.lang.Integer.hashCode(this.f409078b)) * 31;
        java.lang.String str = this.f409079c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m147559x9616526c() {
        return "CgiErrorInfo(errType=" + this.f409077a + ", errCode=" + this.f409078b + ", errMsg=" + this.f409079c + ')';
    }
}
