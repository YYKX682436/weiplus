package kw2;

/* loaded from: classes15.dex */
public final class e {
    public static final kw2.d V = new kw2.d(null);
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public long F;
    public long G;
    public long H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f394487J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public long O;
    public long P;
    public java.lang.String Q;
    public final android.util.ArraySet R;
    public kw2.e S;
    public java.lang.String T;
    public java.lang.String U;

    /* renamed from: a, reason: collision with root package name */
    public long f394488a;

    /* renamed from: b, reason: collision with root package name */
    public long f394489b;

    /* renamed from: c, reason: collision with root package name */
    public long f394490c;

    /* renamed from: d, reason: collision with root package name */
    public long f394491d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f394492e;

    /* renamed from: f, reason: collision with root package name */
    public long f394493f;

    /* renamed from: g, reason: collision with root package name */
    public long f394494g;

    /* renamed from: h, reason: collision with root package name */
    public long f394495h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f394496i;

    /* renamed from: j, reason: collision with root package name */
    public long f394497j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f394498k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f394499l;

    /* renamed from: m, reason: collision with root package name */
    public long f394500m;

    /* renamed from: n, reason: collision with root package name */
    public long f394501n;

    /* renamed from: o, reason: collision with root package name */
    public long f394502o;

    /* renamed from: p, reason: collision with root package name */
    public long f394503p;

    /* renamed from: q, reason: collision with root package name */
    public long f394504q;

    /* renamed from: r, reason: collision with root package name */
    public long f394505r;

    /* renamed from: s, reason: collision with root package name */
    public long f394506s;

    /* renamed from: t, reason: collision with root package name */
    public long f394507t;

    /* renamed from: u, reason: collision with root package name */
    public long f394508u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f394509v;

    /* renamed from: w, reason: collision with root package name */
    public long f394510w;

    /* renamed from: x, reason: collision with root package name */
    public long f394511x;

    /* renamed from: y, reason: collision with root package name */
    public long f394512y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f394513z;

    public e() {
        android.util.ArraySet arraySet = new android.util.ArraySet();
        this.f394488a = 0L;
        this.f394489b = 0L;
        this.f394490c = 0L;
        this.f394491d = 0L;
        this.f394492e = "";
        this.f394493f = 0L;
        this.f394494g = 0L;
        this.f394495h = 0L;
        this.f394496i = "";
        this.f394497j = 0L;
        this.f394498k = "";
        this.f394499l = "";
        this.f394500m = 0L;
        this.f394501n = 0L;
        this.f394502o = 0L;
        this.f394503p = 0L;
        this.f394504q = 0L;
        this.f394505r = 0L;
        this.f394506s = 0L;
        this.f394507t = 0L;
        this.f394508u = 0L;
        this.f394509v = "";
        this.f394510w = 0L;
        this.f394511x = 0L;
        this.f394512y = 0L;
        this.f394513z = false;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = 0L;
        this.G = 0L;
        this.H = 0L;
        this.I = false;
        this.f394487J = false;
        this.K = false;
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = 0L;
        this.P = 0L;
        this.Q = "";
        this.R = arraySet;
        this.S = null;
        this.T = "";
        this.U = "";
    }

    /* renamed from: equals */
    public boolean m144489xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw2.e)) {
            return false;
        }
        kw2.e eVar = (kw2.e) obj;
        return this.f394488a == eVar.f394488a && this.f394489b == eVar.f394489b && this.f394490c == eVar.f394490c && this.f394491d == eVar.f394491d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f394492e, eVar.f394492e) && this.f394493f == eVar.f394493f && this.f394494g == eVar.f394494g && this.f394495h == eVar.f394495h && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f394496i, eVar.f394496i) && this.f394497j == eVar.f394497j && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f394498k, eVar.f394498k) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f394499l, eVar.f394499l) && this.f394500m == eVar.f394500m && this.f394501n == eVar.f394501n && this.f394502o == eVar.f394502o && this.f394503p == eVar.f394503p && this.f394504q == eVar.f394504q && this.f394505r == eVar.f394505r && this.f394506s == eVar.f394506s && this.f394507t == eVar.f394507t && this.f394508u == eVar.f394508u && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f394509v, eVar.f394509v) && this.f394510w == eVar.f394510w && this.f394511x == eVar.f394511x && this.f394512y == eVar.f394512y && this.f394513z == eVar.f394513z && this.A == eVar.A && this.B == eVar.B && this.C == eVar.C && this.D == eVar.D && this.E == eVar.E && this.F == eVar.F && this.G == eVar.G && this.H == eVar.H && this.I == eVar.I && this.f394487J == eVar.f394487J && this.K == eVar.K && this.L == eVar.L && this.M == eVar.M && this.N == eVar.N && this.O == eVar.O && this.P == eVar.P && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.Q, eVar.Q) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.R, eVar.R) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.S, eVar.S) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.T, eVar.T) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.U, eVar.U);
    }

    /* renamed from: hashCode */
    public int m144490x8cdac1b() {
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((java.lang.Long.hashCode(this.f394488a) * 31) + java.lang.Long.hashCode(this.f394489b)) * 31) + java.lang.Long.hashCode(this.f394490c)) * 31) + java.lang.Long.hashCode(this.f394491d)) * 31) + this.f394492e.hashCode()) * 31) + java.lang.Long.hashCode(this.f394493f)) * 31) + java.lang.Long.hashCode(this.f394494g)) * 31) + java.lang.Long.hashCode(this.f394495h)) * 31) + this.f394496i.hashCode()) * 31) + java.lang.Long.hashCode(this.f394497j)) * 31) + this.f394498k.hashCode()) * 31) + this.f394499l.hashCode()) * 31) + java.lang.Long.hashCode(this.f394500m)) * 31) + java.lang.Long.hashCode(this.f394501n)) * 31) + java.lang.Long.hashCode(this.f394502o)) * 31) + java.lang.Long.hashCode(this.f394503p)) * 31) + java.lang.Long.hashCode(this.f394504q)) * 31) + java.lang.Long.hashCode(this.f394505r)) * 31) + java.lang.Long.hashCode(this.f394506s)) * 31) + java.lang.Long.hashCode(this.f394507t)) * 31) + java.lang.Long.hashCode(this.f394508u)) * 31) + this.f394509v.hashCode()) * 31) + java.lang.Long.hashCode(this.f394510w)) * 31) + java.lang.Long.hashCode(this.f394511x)) * 31) + java.lang.Long.hashCode(this.f394512y)) * 31) + java.lang.Boolean.hashCode(this.f394513z)) * 31) + java.lang.Boolean.hashCode(this.A)) * 31) + java.lang.Boolean.hashCode(this.B)) * 31) + java.lang.Boolean.hashCode(this.C)) * 31) + java.lang.Boolean.hashCode(this.D)) * 31) + java.lang.Boolean.hashCode(this.E)) * 31) + java.lang.Long.hashCode(this.F)) * 31) + java.lang.Long.hashCode(this.G)) * 31) + java.lang.Long.hashCode(this.H)) * 31) + java.lang.Boolean.hashCode(this.I)) * 31) + java.lang.Boolean.hashCode(this.f394487J)) * 31) + java.lang.Boolean.hashCode(this.K)) * 31) + java.lang.Boolean.hashCode(this.L)) * 31) + java.lang.Boolean.hashCode(this.M)) * 31) + java.lang.Boolean.hashCode(this.N)) * 31) + java.lang.Long.hashCode(this.O)) * 31) + java.lang.Long.hashCode(this.P)) * 31) + this.Q.hashCode()) * 31) + this.R.hashCode()) * 31;
        kw2.e eVar = this.S;
        return ((((hashCode + (eVar == null ? 0 : eVar.m144490x8cdac1b())) * 31) + this.T.hashCode()) * 31) + this.U.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m144491x9616526c() {
        return "DownloadReportData(actionType=" + this.f394488a + ", downloadType=" + this.f394489b + ", commentScene=" + this.f394490c + ", downloadStrategy=" + this.f394491d + ", feedId=" + this.f394492e + ", durationS=" + this.f394493f + ", durationMs=" + this.f394494g + ", fileSize=" + this.f394495h + ", videoFormat=" + this.f394496i + ", downloadSize=" + this.f394497j + ", downloadStartTime=" + this.f394498k + ", downloadEndTime=" + this.f394499l + ", netType=" + this.f394500m + ", uniqPlayTime=" + this.f394501n + ", realPlayTime=" + this.f394502o + ", playTime=" + this.f394503p + ", playCount=" + this.f394504q + ", playStartTime=" + this.f394505r + ", playEndTime=" + this.f394506s + ", playStartPos=" + this.f394507t + ", playStopPos=" + this.f394508u + ", mediaId=" + this.f394509v + ", startRecordTimeMs=" + this.f394510w + ", stopRecordTimeMs=" + this.f394511x + ", playSessionIndex=" + this.f394512y + ", startPlayHit=" + this.f394513z + ", stopPlayHit=" + this.A + ", startDownloaderHit=" + this.B + ", stopDownloaderHit=" + this.C + ", startPreRenderHit=" + this.D + ", stopPreRenderHit=" + this.E + ", startPlayCacheSize=" + this.F + ", stopPlayCacheSize=" + this.G + ", downloaderCompleteSizeInPlaySession=" + this.H + ", playerComeStopState=" + this.I + ", downloaderComeStopState=" + this.f394487J + ", updateFromDownloadResult=" + this.K + ", allFileDownloadCompleteBeforePlay=" + this.L + ", allFileDownloadCompleteInPlaying=" + this.M + ", segmentSizeInPreRender=" + this.N + ", lastPauseTimeMs=" + this.O + ", totalPauseTime=" + this.P + ", tag=" + this.Q + ", progressList=" + this.R + ", preRenderItem=" + this.S + ", netConnInfo=" + this.T + ", byPass=" + this.U + ')';
    }
}
