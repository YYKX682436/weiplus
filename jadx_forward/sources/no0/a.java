package no0;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f420233a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f420234b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f420235c;

    /* renamed from: d, reason: collision with root package name */
    public final int f420236d;

    /* renamed from: e, reason: collision with root package name */
    public final int f420237e;

    /* renamed from: f, reason: collision with root package name */
    public final int f420238f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f420239g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f420240h;

    /* renamed from: i, reason: collision with root package name */
    public final long f420241i;

    /* renamed from: j, reason: collision with root package name */
    public final byte[] f420242j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.Integer f420243k;

    /* renamed from: l, reason: collision with root package name */
    public final long f420244l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f420245m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f420246n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f420247o;

    public a(long j17, java.lang.String str, java.lang.String str2, int i17, int i18, int i19, java.lang.String str3, java.lang.String str4, long j18, byte[] bArr, java.lang.Integer num, long j19, java.lang.String str5, boolean z17, boolean z18, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        java.lang.Integer num2 = (i27 & 1024) != 0 ? 0 : num;
        long j27 = (i27 & 2048) != 0 ? 0L : j19;
        java.lang.String str6 = (i27 & 4096) != 0 ? null : str5;
        boolean z19 = (i27 & 8192) != 0 ? false : z17;
        boolean z27 = (i27 & 16384) == 0 ? z18 : false;
        this.f420233a = j17;
        this.f420234b = str;
        this.f420235c = str2;
        this.f420236d = i17;
        this.f420237e = i18;
        this.f420238f = i19;
        this.f420239g = str3;
        this.f420240h = str4;
        this.f420241i = j18;
        this.f420242j = bArr;
        this.f420243k = num2;
        this.f420244l = j27;
        this.f420245m = str6;
        this.f420246n = z19;
        this.f420247o = z27;
    }

    /* renamed from: equals */
    public boolean m149819xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof no0.a)) {
            return false;
        }
        no0.a aVar = (no0.a) obj;
        return this.f420233a == aVar.f420233a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f420234b, aVar.f420234b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f420235c, aVar.f420235c) && this.f420236d == aVar.f420236d && this.f420237e == aVar.f420237e && this.f420238f == aVar.f420238f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f420239g, aVar.f420239g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f420240h, aVar.f420240h) && this.f420241i == aVar.f420241i && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f420242j, aVar.f420242j) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f420243k, aVar.f420243k) && this.f420244l == aVar.f420244l && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f420245m, aVar.f420245m) && this.f420246n == aVar.f420246n && this.f420247o == aVar.f420247o;
    }

    /* renamed from: hashCode */
    public int m149820x8cdac1b() {
        int hashCode = java.lang.Long.hashCode(this.f420233a) * 31;
        java.lang.String str = this.f420234b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f420235c;
        int hashCode3 = (((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + java.lang.Integer.hashCode(this.f420236d)) * 31) + java.lang.Integer.hashCode(this.f420237e)) * 31) + java.lang.Integer.hashCode(this.f420238f)) * 31;
        java.lang.String str3 = this.f420239g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f420240h;
        int hashCode5 = (((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + java.lang.Long.hashCode(this.f420241i)) * 31;
        byte[] bArr = this.f420242j;
        int hashCode6 = (hashCode5 + (bArr == null ? 0 : java.util.Arrays.hashCode(bArr))) * 31;
        java.lang.Integer num = this.f420243k;
        int hashCode7 = (((hashCode6 + (num == null ? 0 : num.hashCode())) * 31) + java.lang.Long.hashCode(this.f420244l)) * 31;
        java.lang.String str5 = this.f420245m;
        return ((((hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f420246n)) * 31) + java.lang.Boolean.hashCode(this.f420247o);
    }

    /* renamed from: toString */
    public java.lang.String m149821x9616526c() {
        return "AcceptLiveMicInfo(liveId=" + this.f420233a + ", micId=" + this.f420234b + ", userId=" + this.f420235c + ", sdkAppId=" + this.f420236d + ", roleId=" + this.f420237e + ", sdkLiveId=" + this.f420238f + ", userSig=" + this.f420239g + ", privateMapKey=" + this.f420240h + ", expireForPmk=" + this.f420241i + ", sdkParam=" + java.util.Arrays.toString(this.f420242j) + ", micType=" + this.f420243k + ", seq=" + this.f420244l + ", pkSign=" + this.f420245m + ", isAnchorPk=" + this.f420246n + ", isRandomMatch=" + this.f420247o + ')';
    }
}
