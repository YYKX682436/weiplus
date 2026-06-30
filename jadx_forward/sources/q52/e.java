package q52;

/* loaded from: classes15.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f441697a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f441698b;

    /* renamed from: c, reason: collision with root package name */
    public long f441699c;

    /* renamed from: d, reason: collision with root package name */
    public long f441700d;

    /* renamed from: e, reason: collision with root package name */
    public long f441701e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f441702f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f441703g;

    /* renamed from: h, reason: collision with root package name */
    public int f441704h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f441705i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f441706j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f441707k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f441708l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f441709m;

    /* renamed from: n, reason: collision with root package name */
    public int f441710n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f441711o;

    /* renamed from: p, reason: collision with root package name */
    public int f441712p;

    /* renamed from: q, reason: collision with root package name */
    public int f441713q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f441714r;

    public e() {
        this(null, null, 0L, 0L, 0L, null, null, 0, false, null, null, null, false, 0, false, 0, 0, null, 262143, null);
    }

    /* renamed from: equals */
    public boolean m159516xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q52.e)) {
            return false;
        }
        q52.e eVar = (q52.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f441697a, eVar.f441697a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f441698b, eVar.f441698b) && this.f441699c == eVar.f441699c && this.f441700d == eVar.f441700d && this.f441701e == eVar.f441701e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f441702f, eVar.f441702f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f441703g, eVar.f441703g) && this.f441704h == eVar.f441704h && this.f441705i == eVar.f441705i && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f441706j, eVar.f441706j) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f441707k, eVar.f441707k) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f441708l, eVar.f441708l) && this.f441709m == eVar.f441709m && this.f441710n == eVar.f441710n && this.f441711o == eVar.f441711o && this.f441712p == eVar.f441712p && this.f441713q == eVar.f441713q && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f441714r, eVar.f441714r);
    }

    /* renamed from: hashCode */
    public int m159517x8cdac1b() {
        java.lang.String str = this.f441697a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f441698b;
        int hashCode2 = (((((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + java.lang.Long.hashCode(this.f441699c)) * 31) + java.lang.Long.hashCode(this.f441700d)) * 31) + java.lang.Long.hashCode(this.f441701e)) * 31;
        java.lang.String str3 = this.f441702f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f441703g;
        int hashCode4 = (((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + java.lang.Integer.hashCode(this.f441704h)) * 31) + java.lang.Boolean.hashCode(this.f441705i)) * 31;
        java.lang.String str5 = this.f441706j;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.f441707k;
        return ((((((((((((((hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f441708l.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f441709m)) * 31) + java.lang.Integer.hashCode(this.f441710n)) * 31) + java.lang.Boolean.hashCode(this.f441711o)) * 31) + java.lang.Integer.hashCode(this.f441712p)) * 31) + java.lang.Integer.hashCode(this.f441713q)) * 31) + this.f441714r.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m159518x9616526c() {
        return "StayTimeStatistics(sessionId=" + this.f441697a + ", pageName=" + this.f441698b + ", stayTimeMs=" + this.f441699c + ", enterTimeMs=" + this.f441700d + ", exitTimeMs=" + this.f441701e + ", clickTabContextId=" + this.f441702f + ", sid=" + this.f441703g + ", reportType=" + this.f441704h + ", isPoi=" + this.f441705i + ", extraInfo=" + this.f441706j + ", enterSourceInfo=" + this.f441707k + ", finderContextID=" + this.f441708l + ", forceUsingMyContextId=" + this.f441709m + ", enterType=" + this.f441710n + ", isFinderChattingUI=" + this.f441711o + ", lastSessionEnterType=" + this.f441712p + ", pageHashCode=" + this.f441713q + ", sdkEnterMethod=" + this.f441714r + ')';
    }

    public e(java.lang.String str, java.lang.String str2, long j17, long j18, long j19, java.lang.String str3, java.lang.String str4, int i17, boolean z17, java.lang.String str5, java.lang.String str6, java.lang.String str7, boolean z18, int i18, boolean z19, int i19, int i27, java.lang.String str8, int i28, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        int i29;
        java.lang.String str9 = (i28 & 1) != 0 ? null : str;
        java.lang.String str10 = (i28 & 2) != 0 ? null : str2;
        long j27 = (i28 & 4) != 0 ? -1L : j17;
        long j28 = (i28 & 8) != 0 ? -1L : j18;
        long j29 = (i28 & 16) == 0 ? j19 : -1L;
        java.lang.String str11 = (i28 & 32) != 0 ? null : str3;
        java.lang.String str12 = (i28 & 64) != 0 ? null : str4;
        if ((i28 & 128) != 0) {
            p52.d[] dVarArr = p52.d.f433540d;
            i29 = 0;
        } else {
            i29 = i17;
        }
        boolean z27 = (i28 & 256) != 0 ? false : z17;
        java.lang.String str13 = (i28 & 512) != 0 ? null : str5;
        java.lang.String str14 = (i28 & 1024) != 0 ? null : str6;
        java.lang.String finderContextID = (i28 & 2048) != 0 ? "" : str7;
        java.lang.String str15 = str13;
        boolean z28 = (i28 & 4096) != 0 ? false : z18;
        int i37 = (i28 & 8192) != 0 ? 0 : i18;
        boolean z29 = (i28 & 16384) != 0 ? false : z19;
        int i38 = (i28 & 32768) != 0 ? 0 : i19;
        int i39 = (i28 & 65536) != 0 ? 0 : i27;
        java.lang.String sdkEnterMethod = (i28 & 131072) != 0 ? "" : str8;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderContextID, "finderContextID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sdkEnterMethod, "sdkEnterMethod");
        this.f441697a = str9;
        this.f441698b = str10;
        this.f441699c = j27;
        this.f441700d = j28;
        this.f441701e = j29;
        this.f441702f = str11;
        this.f441703g = str12;
        this.f441704h = i29;
        this.f441705i = z27;
        this.f441706j = str15;
        this.f441707k = str14;
        this.f441708l = finderContextID;
        this.f441709m = z28;
        this.f441710n = i37;
        this.f441711o = z29;
        this.f441712p = i38;
        this.f441713q = i39;
        this.f441714r = sdkEnterMethod;
    }
}
