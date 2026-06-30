package oy2;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f431525a;

    /* renamed from: b, reason: collision with root package name */
    public final float f431526b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f431527c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f431528d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f431529e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f431530f;

    public p(int i17, float f17, boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i18 & 1) != 0 ? 1 : i17;
        f17 = (i18 & 2) != 0 ? 0.75f : f17;
        z17 = (i18 & 4) != 0 ? true : z17;
        str = (i18 & 8) != 0 ? null : str;
        str2 = (i18 & 16) != 0 ? null : str2;
        str3 = (i18 & 32) != 0 ? null : str3;
        this.f431525a = i17;
        this.f431526b = f17;
        this.f431527c = z17;
        this.f431528d = str;
        this.f431529e = str2;
        this.f431530f = str3;
    }

    /* renamed from: equals */
    public boolean m157420xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oy2.p)) {
            return false;
        }
        oy2.p pVar = (oy2.p) obj;
        return this.f431525a == pVar.f431525a && java.lang.Float.compare(this.f431526b, pVar.f431526b) == 0 && this.f431527c == pVar.f431527c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f431528d, pVar.f431528d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f431529e, pVar.f431529e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f431530f, pVar.f431530f);
    }

    /* renamed from: hashCode */
    public int m157421x8cdac1b() {
        int hashCode = ((((java.lang.Integer.hashCode(this.f431525a) * 31) + java.lang.Float.hashCode(this.f431526b)) * 31) + java.lang.Boolean.hashCode(this.f431527c)) * 31;
        java.lang.String str = this.f431528d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f431529e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f431530f;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m157422x9616526c() {
        return "ScConfig(style=" + this.f431525a + ", peekRatio=" + this.f431526b + ", expandable=" + this.f431527c + ", openPopupWording=" + this.f431528d + ", openPopupTitle=" + this.f431529e + ", transitCommonUxInfo=" + this.f431530f + ')';
    }
}
