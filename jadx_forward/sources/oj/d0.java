package oj;

/* loaded from: classes12.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f427221a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f427222b;

    /* renamed from: c, reason: collision with root package name */
    public long f427223c;

    /* renamed from: d, reason: collision with root package name */
    public long f427224d;

    /* renamed from: e, reason: collision with root package name */
    public long f427225e;

    /* renamed from: f, reason: collision with root package name */
    public long f427226f;

    /* renamed from: g, reason: collision with root package name */
    public long f427227g;

    /* renamed from: h, reason: collision with root package name */
    public long f427228h;

    /* renamed from: i, reason: collision with root package name */
    public long f427229i;

    /* renamed from: j, reason: collision with root package name */
    public long f427230j;

    /* renamed from: k, reason: collision with root package name */
    public long f427231k;

    public d0(java.lang.String str, java.lang.String str2, long j17, long j18, long j19, long j27, long j28, long j29, long j37, long j38, long j39, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        java.lang.String str3 = (i17 & 1) != 0 ? null : str;
        java.lang.String str4 = (i17 & 2) == 0 ? str2 : null;
        long j47 = (i17 & 4) != 0 ? 0L : j17;
        long j48 = (i17 & 8) != 0 ? 0L : j18;
        long j49 = (i17 & 16) != 0 ? 0L : j19;
        long j57 = (i17 & 32) != 0 ? 0L : j27;
        long j58 = (i17 & 64) != 0 ? 0L : j28;
        long j59 = (i17 & 128) != 0 ? 0L : j29;
        long j66 = (i17 & 256) != 0 ? 0L : j37;
        long j67 = (i17 & 512) != 0 ? 0L : j38;
        long j68 = (i17 & 1024) != 0 ? 0L : j39;
        this.f427221a = str3;
        this.f427222b = str4;
        this.f427223c = j47;
        this.f427224d = j48;
        this.f427225e = j49;
        this.f427226f = j57;
        this.f427227g = j58;
        this.f427228h = j59;
        this.f427229i = j66;
        this.f427230j = j67;
        this.f427231k = j68;
    }

    /* renamed from: equals */
    public boolean m151460xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oj.d0)) {
            return false;
        }
        oj.d0 d0Var = (oj.d0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427221a, d0Var.f427221a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427222b, d0Var.f427222b) && this.f427223c == d0Var.f427223c && this.f427224d == d0Var.f427224d && this.f427225e == d0Var.f427225e && this.f427226f == d0Var.f427226f && this.f427227g == d0Var.f427227g && this.f427228h == d0Var.f427228h && this.f427229i == d0Var.f427229i && this.f427230j == d0Var.f427230j && this.f427231k == d0Var.f427231k;
    }

    /* renamed from: hashCode */
    public int m151461x8cdac1b() {
        java.lang.String str = this.f427221a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        java.lang.String str2 = this.f427222b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        long j17 = this.f427223c;
        int i17 = (hashCode2 + ((int) (j17 ^ (j17 >>> 32)))) * 31;
        long j18 = this.f427224d;
        int i18 = (i17 + ((int) (j18 ^ (j18 >>> 32)))) * 31;
        long j19 = this.f427225e;
        int i19 = (i18 + ((int) (j19 ^ (j19 >>> 32)))) * 31;
        long j27 = this.f427226f;
        int i27 = (i19 + ((int) (j27 ^ (j27 >>> 32)))) * 31;
        long j28 = this.f427227g;
        int i28 = (i27 + ((int) (j28 ^ (j28 >>> 32)))) * 31;
        long j29 = this.f427228h;
        int i29 = (i28 + ((int) (j29 ^ (j29 >>> 32)))) * 31;
        long j37 = this.f427229i;
        int i37 = (i29 + ((int) (j37 ^ (j37 >>> 32)))) * 31;
        long j38 = this.f427230j;
        int i38 = (i37 + ((int) (j38 ^ (j38 >>> 32)))) * 31;
        long j39 = this.f427231k;
        return i38 + ((int) (j39 ^ (j39 >>> 32)));
    }

    /* renamed from: toString */
    public java.lang.String m151462x9616526c() {
        return "SmapsItem(name=" + this.f427221a + ", permission=" + this.f427222b + ", count=" + this.f427223c + ", vmSize=" + this.f427224d + ", rss=" + this.f427225e + ", pss=" + this.f427226f + ", sharedClean=" + this.f427227g + ", sharedDirty=" + this.f427228h + ", privateClean=" + this.f427229i + ", privateDirty=" + this.f427230j + ", swapPss=" + this.f427231k + ")";
    }
}
