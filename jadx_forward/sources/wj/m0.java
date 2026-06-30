package wj;

/* loaded from: classes12.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f527969a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f527970b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f527971c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f527972d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f527973e;

    /* renamed from: f, reason: collision with root package name */
    public final long f527974f;

    /* renamed from: g, reason: collision with root package name */
    public final long f527975g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f527976h;

    /* renamed from: i, reason: collision with root package name */
    public final long f527977i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f527978j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f527979k;

    public m0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, long j17, long j18, java.lang.String str6, long j19, java.lang.String str7, java.lang.String str8, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        java.lang.String str9 = (i17 & 1) != 0 ? null : str;
        java.lang.String str10 = (i17 & 2) != 0 ? null : str2;
        java.lang.String str11 = (i17 & 4) != 0 ? null : str3;
        java.lang.String str12 = (i17 & 8) != 0 ? null : str4;
        java.lang.String str13 = (i17 & 16) != 0 ? null : str5;
        long j27 = (i17 & 32) != 0 ? 0L : j17;
        long j28 = (i17 & 64) != 0 ? 0L : j18;
        java.lang.String str14 = (i17 & 128) != 0 ? null : str6;
        long j29 = (i17 & 256) == 0 ? j19 : 0L;
        java.lang.String str15 = (i17 & 512) != 0 ? null : str7;
        java.lang.String str16 = (i17 & 1024) == 0 ? str8 : null;
        this.f527969a = str9;
        this.f527970b = str10;
        this.f527971c = str11;
        this.f527972d = str12;
        this.f527973e = str13;
        this.f527974f = j27;
        this.f527975g = j28;
        this.f527976h = str14;
        this.f527977i = j29;
        this.f527978j = str15;
        this.f527979k = str16;
    }

    /* renamed from: equals */
    public boolean m173896xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj.m0)) {
            return false;
        }
        wj.m0 m0Var = (wj.m0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f527969a, m0Var.f527969a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f527970b, m0Var.f527970b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f527971c, m0Var.f527971c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f527972d, m0Var.f527972d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f527973e, m0Var.f527973e) && this.f527974f == m0Var.f527974f && this.f527975g == m0Var.f527975g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f527976h, m0Var.f527976h) && this.f527977i == m0Var.f527977i && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f527978j, m0Var.f527978j) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f527979k, m0Var.f527979k);
    }

    /* renamed from: hashCode */
    public int m173897x8cdac1b() {
        java.lang.String str = this.f527969a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f527970b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f527971c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f527972d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f527973e;
        int hashCode5 = (((((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + java.lang.Long.hashCode(this.f527974f)) * 31) + java.lang.Long.hashCode(this.f527975g)) * 31;
        java.lang.String str6 = this.f527976h;
        int hashCode6 = (((hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31) + java.lang.Long.hashCode(this.f527977i)) * 31;
        java.lang.String str7 = this.f527978j;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        java.lang.String str8 = this.f527979k;
        return hashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m173898x9616526c() {
        return "MagicAdFallbackConfig(hintTxt=" + this.f527969a + ", adDesc=" + this.f527970b + ", imageUrl=" + this.f527971c + ", apkName=" + this.f527972d + ", urlScheme=" + this.f527973e + ", urlSchemeMinAndroidVersion=" + this.f527974f + ", appId=" + this.f527975g + ", appName=" + this.f527976h + ", canvasId=" + this.f527977i + ", canvasDynamicInfo=" + this.f527978j + ", uxinfo=" + this.f527979k + ')';
    }
}
