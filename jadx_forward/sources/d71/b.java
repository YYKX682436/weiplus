package d71;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f308407a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f308408b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f308409c;

    public b(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        str = (i17 & 1) != 0 ? null : str;
        str2 = (i17 & 2) != 0 ? null : str2;
        str3 = (i17 & 4) != 0 ? null : str3;
        this.f308407a = str;
        this.f308408b = str2;
        this.f308409c = str3;
    }

    /* renamed from: equals */
    public boolean m123630xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d71.b)) {
            return false;
        }
        d71.b bVar = (d71.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f308407a, bVar.f308407a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f308408b, bVar.f308408b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f308409c, bVar.f308409c);
    }

    /* renamed from: hashCode */
    public int m123631x8cdac1b() {
        java.lang.String str = this.f308407a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f308408b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f308409c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m123632x9616526c() {
        return "PhoneNumberFormatInfo(leadingDigitsRegex=" + this.f308407a + ", pattern=" + this.f308408b + ", formatRegex=" + this.f308409c + ')';
    }
}
