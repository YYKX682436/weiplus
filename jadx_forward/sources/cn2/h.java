package cn2;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f125055a;

    /* renamed from: b, reason: collision with root package name */
    public final long f125056b;

    /* renamed from: c, reason: collision with root package name */
    public final long f125057c;

    /* renamed from: d, reason: collision with root package name */
    public final long f125058d;

    /* renamed from: e, reason: collision with root package name */
    public final long f125059e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f125060f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f125061g;

    /* renamed from: h, reason: collision with root package name */
    public final long f125062h;

    /* renamed from: i, reason: collision with root package name */
    public final int f125063i;

    /* renamed from: j, reason: collision with root package name */
    public final cn2.f f125064j;

    /* renamed from: k, reason: collision with root package name */
    public final cn2.g f125065k;

    /* renamed from: l, reason: collision with root package name */
    public long f125066l;

    /* renamed from: m, reason: collision with root package name */
    public final long f125067m;

    /* renamed from: n, reason: collision with root package name */
    public cn2.i f125068n;

    public h(boolean z17, long j17, long j18, long j19, long j27, boolean z18, boolean z19, long j28, int i17, cn2.f fVar, cn2.g gVar, long j29, long j37, cn2.i iVar, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar2) {
        boolean z27 = (i18 & 1) != 0 ? !zl2.r4.f555483a.w1() : z17;
        long j38 = (i18 & 2) != 0 ? 200L : j17;
        long j39 = (i18 & 4) != 0 ? 150L : j18;
        long j47 = (i18 & 8) != 0 ? 250L : j19;
        long j48 = (i18 & 16) != 0 ? 250L : j27;
        boolean z28 = (i18 & 32) != 0 ? false : z18;
        boolean z29 = (i18 & 64) == 0 ? z19 : false;
        long j49 = (i18 & 128) == 0 ? j28 : 250L;
        int i19 = (i18 & 256) != 0 ? -500 : i17;
        cn2.f flashLightConfig = (i18 & 512) != 0 ? new cn2.f(0L, null, 0.0f, 0.0f, 15, null) : fVar;
        long j57 = j49;
        cn2.g floatCoverConfig = (i18 & 1024) != 0 ? new cn2.g(0L, 0L, 0L, null, 15, null) : gVar;
        long j58 = (i18 & 2048) != 0 ? 1500L : j29;
        long j59 = (i18 & 4096) != 0 ? 1500L : j37;
        cn2.i iVar3 = (i18 & 8192) != 0 ? null : iVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flashLightConfig, "flashLightConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(floatCoverConfig, "floatCoverConfig");
        this.f125055a = z27;
        this.f125056b = j38;
        this.f125057c = j39;
        this.f125058d = j47;
        this.f125059e = j48;
        this.f125060f = z28;
        this.f125061g = z29;
        this.f125062h = j57;
        this.f125063i = i19;
        this.f125064j = flashLightConfig;
        this.f125065k = floatCoverConfig;
        this.f125066l = j58;
        this.f125067m = j59;
        this.f125068n = iVar3;
    }

    /* renamed from: equals */
    public boolean m15340xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn2.h)) {
            return false;
        }
        cn2.h hVar = (cn2.h) obj;
        return this.f125055a == hVar.f125055a && this.f125056b == hVar.f125056b && this.f125057c == hVar.f125057c && this.f125058d == hVar.f125058d && this.f125059e == hVar.f125059e && this.f125060f == hVar.f125060f && this.f125061g == hVar.f125061g && this.f125062h == hVar.f125062h && this.f125063i == hVar.f125063i && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f125064j, hVar.f125064j) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f125065k, hVar.f125065k) && this.f125066l == hVar.f125066l && this.f125067m == hVar.f125067m && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f125068n, hVar.f125068n);
    }

    /* renamed from: hashCode */
    public int m15341x8cdac1b() {
        int hashCode = ((((((((((((((((((((((((java.lang.Boolean.hashCode(this.f125055a) * 31) + java.lang.Long.hashCode(this.f125056b)) * 31) + java.lang.Long.hashCode(this.f125057c)) * 31) + java.lang.Long.hashCode(this.f125058d)) * 31) + java.lang.Long.hashCode(this.f125059e)) * 31) + java.lang.Boolean.hashCode(this.f125060f)) * 31) + java.lang.Boolean.hashCode(this.f125061g)) * 31) + java.lang.Long.hashCode(this.f125062h)) * 31) + java.lang.Integer.hashCode(this.f125063i)) * 31) + this.f125064j.m15334x8cdac1b()) * 31) + this.f125065k.m15337x8cdac1b()) * 31) + java.lang.Long.hashCode(this.f125066l)) * 31) + java.lang.Long.hashCode(this.f125067m)) * 31;
        cn2.i iVar = this.f125068n;
        return hashCode + (iVar == null ? 0 : iVar.m15344x8cdac1b());
    }

    /* renamed from: toString */
    public java.lang.String m15342x9616526c() {
        return "HightLevelAnimParams(scale=" + this.f125055a + ", scaleInDelay=" + this.f125056b + ", scaleInDuration=" + this.f125057c + ", scaleBackDuration=" + this.f125058d + ", alphaOutDuration=" + this.f125059e + ", flashLight=" + this.f125060f + ", floatCover=" + this.f125061g + ", startDuration=" + this.f125062h + ", startFromTranslationX=" + this.f125063i + ", flashLightConfig=" + this.f125064j + ", floatCoverConfig=" + this.f125065k + ", beforeNextCheckDuration=" + this.f125066l + ", beforeAnimOutDuration=" + this.f125067m + ", LightStarConfig=" + this.f125068n + ')';
    }
}
