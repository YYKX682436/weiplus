package sf2;

/* loaded from: classes5.dex */
public final class g3 extends sf2.i3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f488683a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f488684b;

    public g3(int i17, java.lang.String str) {
        super(null);
        this.f488683a = i17;
        this.f488684b = str;
    }

    /* renamed from: equals */
    public boolean m164386xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf2.g3)) {
            return false;
        }
        sf2.g3 g3Var = (sf2.g3) obj;
        return this.f488683a == g3Var.f488683a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f488684b, g3Var.f488684b);
    }

    /* renamed from: hashCode */
    public int m164387x8cdac1b() {
        int hashCode = java.lang.Integer.hashCode(this.f488683a) * 31;
        java.lang.String str = this.f488684b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m164388x9616526c() {
        return "Error(errCode=" + this.f488683a + ", errMsg=" + this.f488684b + ')';
    }
}
