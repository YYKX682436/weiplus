package vf3;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f517905a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f517906b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f517907c;

    /* renamed from: d, reason: collision with root package name */
    public final int f517908d;

    /* renamed from: e, reason: collision with root package name */
    public final int f517909e;

    public d(java.lang.String str, java.lang.String str2, boolean z17, int i17, int i18) {
        this.f517905a = str;
        this.f517906b = str2;
        this.f517907c = z17;
        this.f517908d = i17;
        this.f517909e = i18;
    }

    /* renamed from: equals */
    public boolean m171840xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf3.d)) {
            return false;
        }
        vf3.d dVar = (vf3.d) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f517905a, dVar.f517905a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f517906b, dVar.f517906b) && this.f517907c == dVar.f517907c && this.f517908d == dVar.f517908d && this.f517909e == dVar.f517909e;
    }

    /* renamed from: hashCode */
    public int m171841x8cdac1b() {
        java.lang.String str = this.f517905a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f517906b;
        return ((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f517907c)) * 31) + java.lang.Integer.hashCode(this.f517908d)) * 31) + java.lang.Integer.hashCode(this.f517909e);
    }

    /* renamed from: toString */
    public java.lang.String m171842x9616526c() {
        return "LiveParsedInfo(videoCodeCTAG=" + this.f517905a + ", audioCodeCTAG=" + this.f517906b + ", isAudioSupported=" + this.f517907c + ", imageWidth=" + this.f517908d + ", imageHeight=" + this.f517909e + ')';
    }
}
