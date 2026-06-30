package co1;

/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f125281a;

    /* renamed from: b, reason: collision with root package name */
    public int f125282b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f125283c;

    /* renamed from: d, reason: collision with root package name */
    public int f125284d;

    public b(java.lang.String str, int i17, java.lang.String str2, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        str = (i19 & 1) != 0 ? null : str;
        i17 = (i19 & 2) != 0 ? 0 : i17;
        str2 = (i19 & 4) != 0 ? null : str2;
        i18 = (i19 & 8) != 0 ? 0 : i18;
        this.f125281a = str;
        this.f125282b = i17;
        this.f125283c = str2;
        this.f125284d = i18;
    }

    public final java.lang.String a() {
        return this.f125283c;
    }

    public final int b() {
        return this.f125284d;
    }

    public final int c() {
        return this.f125282b;
    }

    public final java.lang.String d() {
        return this.f125281a;
    }

    /* renamed from: equals */
    public boolean m15390xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co1.b)) {
            return false;
        }
        co1.b bVar = (co1.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f125281a, bVar.f125281a) && this.f125282b == bVar.f125282b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f125283c, bVar.f125283c) && this.f125284d == bVar.f125284d;
    }

    /* renamed from: hashCode */
    public int m15391x8cdac1b() {
        java.lang.String str = this.f125281a;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + java.lang.Integer.hashCode(this.f125282b)) * 31;
        java.lang.String str2 = this.f125283c;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f125284d);
    }

    /* renamed from: toString */
    public java.lang.String m15392x9616526c() {
        return "RecoverExtraImageInfo(imgName=" + this.f125281a + ", imgLen=" + this.f125282b + ", hdImgName=" + this.f125283c + ", hdLen=" + this.f125284d + ')';
    }
}
