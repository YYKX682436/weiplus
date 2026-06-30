package zn1;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f555974a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f555975b;

    public g(java.lang.String str, java.lang.String str2) {
        this.f555974a = str;
        this.f555975b = str2;
    }

    /* renamed from: equals */
    public boolean m179200xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn1.g)) {
            return false;
        }
        zn1.g gVar = (zn1.g) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f555974a, gVar.f555974a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f555975b, gVar.f555975b);
    }

    /* renamed from: hashCode */
    public int m179201x8cdac1b() {
        java.lang.String str = this.f555974a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f555975b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m179202x9616526c() {
        return "AccessoryInfo(manufacturer=" + this.f555974a + ", model=" + this.f555975b + ')';
    }
}
