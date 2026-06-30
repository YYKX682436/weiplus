package az2;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f97662a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Integer f97663b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.xw f97664c;

    public g(java.lang.Integer num, java.lang.Integer num2, r45.xw xwVar) {
        this.f97662a = num;
        this.f97663b = num2;
        this.f97664c = xwVar;
    }

    /* renamed from: equals */
    public boolean m9402xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az2.g)) {
            return false;
        }
        az2.g gVar = (az2.g) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f97662a, gVar.f97662a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f97663b, gVar.f97663b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f97664c, gVar.f97664c);
    }

    /* renamed from: hashCode */
    public int m9403x8cdac1b() {
        java.lang.Integer num = this.f97662a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        java.lang.Integer num2 = this.f97663b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        r45.xw xwVar = this.f97664c;
        return hashCode2 + (xwVar != null ? xwVar.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m9404x9616526c() {
        return "CgiProfileData(reqSize=" + this.f97662a + ", respSize=" + this.f97663b + ", profile=" + this.f97664c + ')';
    }
}
