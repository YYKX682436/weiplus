package as3;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f95022a;

    /* renamed from: b, reason: collision with root package name */
    public final int f95023b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f95024c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f95025d;

    /* renamed from: e, reason: collision with root package name */
    public final int f95026e;

    public b(java.lang.Integer num, int i17, java.lang.String str, java.lang.Integer num2, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        num2 = (i19 & 8) != 0 ? -1 : num2;
        i18 = (i19 & 16) != 0 ? 1 : i18;
        this.f95022a = num;
        this.f95023b = i17;
        this.f95024c = str;
        this.f95025d = num2;
        this.f95026e = i18;
    }

    /* renamed from: equals */
    public boolean m8957xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as3.b)) {
            return false;
        }
        as3.b bVar = (as3.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f95022a, bVar.f95022a) && this.f95023b == bVar.f95023b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f95024c, bVar.f95024c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f95025d, bVar.f95025d) && this.f95026e == bVar.f95026e;
    }

    /* renamed from: hashCode */
    public int m8958x8cdac1b() {
        java.lang.Integer num = this.f95022a;
        int hashCode = (((num == null ? 0 : num.hashCode()) * 31) + java.lang.Integer.hashCode(this.f95023b)) * 31;
        java.lang.String str = this.f95024c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Integer num2 = this.f95025d;
        return ((hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f95026e);
    }

    /* renamed from: toString */
    public java.lang.String m8959x9616526c() {
        return "ReportInfo(bizUin=" + this.f95022a + ", scene=" + this.f95023b + ", sessionId=" + this.f95024c + ", eventType=" + this.f95025d + ", subScene=" + this.f95026e + ')';
    }
}
