package p14;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f432750a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f432751b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f432752c;

    public e(int i17, java.lang.String str, java.lang.String str2) {
        this.f432750a = i17;
        this.f432751b = str;
        this.f432752c = str2;
    }

    /* renamed from: equals */
    public boolean m157692xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p14.e)) {
            return false;
        }
        p14.e eVar = (p14.e) obj;
        return this.f432750a == eVar.f432750a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f432751b, eVar.f432751b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f432752c, eVar.f432752c);
    }

    /* renamed from: hashCode */
    public int m157693x8cdac1b() {
        int hashCode = java.lang.Integer.hashCode(this.f432750a) * 31;
        java.lang.String str = this.f432751b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f432752c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m157694x9616526c() {
        return "QRCodeExposeData(patternId=" + this.f432750a + ", qrUrl=" + this.f432751b + ", qrUrlWidthStyle=" + this.f432752c + ')';
    }
}
