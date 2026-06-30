package cn2;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f43522a;

    /* renamed from: b, reason: collision with root package name */
    public final long f43523b;

    /* renamed from: c, reason: collision with root package name */
    public final long f43524c;

    /* renamed from: d, reason: collision with root package name */
    public final long f43525d;

    /* renamed from: e, reason: collision with root package name */
    public final long f43526e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f43527f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f43528g;

    /* renamed from: h, reason: collision with root package name */
    public final long f43529h;

    /* renamed from: i, reason: collision with root package name */
    public final int f43530i;

    /* renamed from: j, reason: collision with root package name */
    public final cn2.f f43531j;

    /* renamed from: k, reason: collision with root package name */
    public final cn2.g f43532k;

    /* renamed from: l, reason: collision with root package name */
    public long f43533l;

    /* renamed from: m, reason: collision with root package name */
    public final long f43534m;

    /* renamed from: n, reason: collision with root package name */
    public cn2.i f43535n;

    public h(boolean z17, long j17, long j18, long j19, long j27, boolean z18, boolean z19, long j28, int i17, cn2.f fVar, cn2.g gVar, long j29, long j37, cn2.i iVar, int i18, kotlin.jvm.internal.i iVar2) {
        boolean z27 = (i18 & 1) != 0 ? !zl2.r4.f473950a.w1() : z17;
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
        kotlin.jvm.internal.o.g(flashLightConfig, "flashLightConfig");
        kotlin.jvm.internal.o.g(floatCoverConfig, "floatCoverConfig");
        this.f43522a = z27;
        this.f43523b = j38;
        this.f43524c = j39;
        this.f43525d = j47;
        this.f43526e = j48;
        this.f43527f = z28;
        this.f43528g = z29;
        this.f43529h = j57;
        this.f43530i = i19;
        this.f43531j = flashLightConfig;
        this.f43532k = floatCoverConfig;
        this.f43533l = j58;
        this.f43534m = j59;
        this.f43535n = iVar3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn2.h)) {
            return false;
        }
        cn2.h hVar = (cn2.h) obj;
        return this.f43522a == hVar.f43522a && this.f43523b == hVar.f43523b && this.f43524c == hVar.f43524c && this.f43525d == hVar.f43525d && this.f43526e == hVar.f43526e && this.f43527f == hVar.f43527f && this.f43528g == hVar.f43528g && this.f43529h == hVar.f43529h && this.f43530i == hVar.f43530i && kotlin.jvm.internal.o.b(this.f43531j, hVar.f43531j) && kotlin.jvm.internal.o.b(this.f43532k, hVar.f43532k) && this.f43533l == hVar.f43533l && this.f43534m == hVar.f43534m && kotlin.jvm.internal.o.b(this.f43535n, hVar.f43535n);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((java.lang.Boolean.hashCode(this.f43522a) * 31) + java.lang.Long.hashCode(this.f43523b)) * 31) + java.lang.Long.hashCode(this.f43524c)) * 31) + java.lang.Long.hashCode(this.f43525d)) * 31) + java.lang.Long.hashCode(this.f43526e)) * 31) + java.lang.Boolean.hashCode(this.f43527f)) * 31) + java.lang.Boolean.hashCode(this.f43528g)) * 31) + java.lang.Long.hashCode(this.f43529h)) * 31) + java.lang.Integer.hashCode(this.f43530i)) * 31) + this.f43531j.hashCode()) * 31) + this.f43532k.hashCode()) * 31) + java.lang.Long.hashCode(this.f43533l)) * 31) + java.lang.Long.hashCode(this.f43534m)) * 31;
        cn2.i iVar = this.f43535n;
        return hashCode + (iVar == null ? 0 : iVar.hashCode());
    }

    public java.lang.String toString() {
        return "HightLevelAnimParams(scale=" + this.f43522a + ", scaleInDelay=" + this.f43523b + ", scaleInDuration=" + this.f43524c + ", scaleBackDuration=" + this.f43525d + ", alphaOutDuration=" + this.f43526e + ", flashLight=" + this.f43527f + ", floatCover=" + this.f43528g + ", startDuration=" + this.f43529h + ", startFromTranslationX=" + this.f43530i + ", flashLightConfig=" + this.f43531j + ", floatCoverConfig=" + this.f43532k + ", beforeNextCheckDuration=" + this.f43533l + ", beforeAnimOutDuration=" + this.f43534m + ", LightStarConfig=" + this.f43535n + ')';
    }
}
