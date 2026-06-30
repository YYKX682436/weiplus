package eu0;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f338269a;

    /* renamed from: b, reason: collision with root package name */
    public final int f338270b;

    /* renamed from: c, reason: collision with root package name */
    public final int f338271c;

    /* renamed from: d, reason: collision with root package name */
    public final int f338272d;

    /* renamed from: e, reason: collision with root package name */
    public final int f338273e;

    /* renamed from: f, reason: collision with root package name */
    public final int f338274f;

    public r(int i17, int i18, int i19, int i27, int i28, int i29) {
        this.f338269a = i17;
        this.f338270b = i18;
        this.f338271c = i19;
        this.f338272d = i27;
        this.f338273e = i28;
        this.f338274f = i29;
    }

    /* renamed from: equals */
    public boolean m128201xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu0.r)) {
            return false;
        }
        eu0.r rVar = (eu0.r) obj;
        return this.f338269a == rVar.f338269a && this.f338270b == rVar.f338270b && this.f338271c == rVar.f338271c && this.f338272d == rVar.f338272d && this.f338273e == rVar.f338273e && this.f338274f == rVar.f338274f;
    }

    /* renamed from: hashCode */
    public int m128202x8cdac1b() {
        return (((((((((java.lang.Integer.hashCode(this.f338269a) * 31) + java.lang.Integer.hashCode(this.f338270b)) * 31) + java.lang.Integer.hashCode(this.f338271c)) * 31) + java.lang.Integer.hashCode(this.f338272d)) * 31) + java.lang.Integer.hashCode(this.f338273e)) * 31) + java.lang.Integer.hashCode(this.f338274f);
    }

    /* renamed from: toString */
    public java.lang.String m128203x9616526c() {
        return "TplVersionInfo(iOSSDKVersionMin=" + this.f338269a + ", iOSSDKVersionMax=" + this.f338270b + ", androidSDKVersionMin=" + this.f338271c + ", androidSDKVersionMax=" + this.f338272d + ", harmonySDKVersionMin=" + this.f338273e + ", harmonySDKVersionMax=" + this.f338274f + ')';
    }
}
