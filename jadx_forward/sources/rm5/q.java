package rm5;

/* loaded from: classes10.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final android.util.Size f479069a;

    /* renamed from: b, reason: collision with root package name */
    public final int f479070b;

    /* renamed from: c, reason: collision with root package name */
    public final int f479071c;

    /* renamed from: d, reason: collision with root package name */
    public final int f479072d;

    /* renamed from: e, reason: collision with root package name */
    public final int f479073e;

    /* renamed from: f, reason: collision with root package name */
    public final int f479074f;

    /* renamed from: g, reason: collision with root package name */
    public final int f479075g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f479076h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f479077i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f479078j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f479079k;

    /* renamed from: l, reason: collision with root package name */
    public int f479080l;

    /* renamed from: m, reason: collision with root package name */
    public final android.util.Size f479081m;

    /* renamed from: n, reason: collision with root package name */
    public int f479082n;

    /* renamed from: o, reason: collision with root package name */
    public int f479083o;

    /* renamed from: p, reason: collision with root package name */
    public int f479084p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f479085q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f479086r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f479087s;

    /* renamed from: t, reason: collision with root package name */
    public long f479088t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f479089u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f479090v;

    /* renamed from: w, reason: collision with root package name */
    public int f479091w;

    /* renamed from: x, reason: collision with root package name */
    public final int f479092x;

    /* renamed from: y, reason: collision with root package name */
    public int f479093y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f479094z;

    public q(android.util.Size targetSize, int i17, int i18, int i19, int i27, int i28, int i29, boolean z17, boolean z18, boolean z19, boolean z27, int i37, android.util.Size size, int i38, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        int i39 = (i38 & 8) != 0 ? 1 : i19;
        int i47 = (i38 & 16) != 0 ? 48000 : i27;
        int i48 = (i38 & 32) != 0 ? 44100 : i28;
        int i49 = (i38 & 64) != 0 ? 1 : i29;
        boolean z28 = (i38 & 128) != 0 ? true : z17;
        boolean z29 = (i38 & 256) != 0 ? false : z18;
        boolean z37 = (i38 & 512) != 0 ? true : z19;
        boolean z38 = (i38 & 1024) == 0 ? z27 : false;
        int i57 = (i38 & 2048) != 0 ? -1 : i37;
        android.util.Size size2 = (i38 & 4096) != 0 ? null : size;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetSize, "targetSize");
        this.f479069a = targetSize;
        this.f479070b = i17;
        this.f479071c = i18;
        this.f479072d = i39;
        this.f479073e = i47;
        this.f479074f = i48;
        this.f479075g = i49;
        this.f479076h = z28;
        this.f479077i = z29;
        this.f479078j = z37;
        this.f479079k = z38;
        this.f479080l = i57;
        this.f479081m = size2;
        this.f479085q = true;
        this.f479086r = true;
        this.f479088t = com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d;
        this.f479091w = -1;
        this.f479092x = -1;
        this.f479093y = -1;
        this.f479094z = "";
    }

    /* renamed from: equals */
    public boolean m162738xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rm5.q)) {
            return false;
        }
        rm5.q qVar = (rm5.q) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f479069a, qVar.f479069a) && this.f479070b == qVar.f479070b && this.f479071c == qVar.f479071c && this.f479072d == qVar.f479072d && this.f479073e == qVar.f479073e && this.f479074f == qVar.f479074f && this.f479075g == qVar.f479075g && this.f479076h == qVar.f479076h && this.f479077i == qVar.f479077i && this.f479078j == qVar.f479078j && this.f479079k == qVar.f479079k && this.f479080l == qVar.f479080l && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f479081m, qVar.f479081m);
    }

    /* renamed from: hashCode */
    public int m162739x8cdac1b() {
        int hashCode = ((((((((((((((((((((((this.f479069a.hashCode() * 31) + java.lang.Integer.hashCode(this.f479070b)) * 31) + java.lang.Integer.hashCode(this.f479071c)) * 31) + java.lang.Integer.hashCode(this.f479072d)) * 31) + java.lang.Integer.hashCode(this.f479073e)) * 31) + java.lang.Integer.hashCode(this.f479074f)) * 31) + java.lang.Integer.hashCode(this.f479075g)) * 31) + java.lang.Boolean.hashCode(this.f479076h)) * 31) + java.lang.Boolean.hashCode(this.f479077i)) * 31) + java.lang.Boolean.hashCode(this.f479078j)) * 31) + java.lang.Boolean.hashCode(this.f479079k)) * 31) + java.lang.Integer.hashCode(this.f479080l)) * 31;
        android.util.Size size = this.f479081m;
        return hashCode + (size == null ? 0 : size.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m162740x9616526c() {
        return "VideoOutputConfig(targetSize=" + this.f479069a + ", videoBitrate=" + this.f479070b + ", fps=" + this.f479071c + ", iFrameInterval=" + this.f479072d + ", audioBitrate=" + this.f479073e + ", audioSampleRate=" + this.f479074f + ", audioChannelCount=" + this.f479075g + ", highProfileEnable=" + this.f479076h + ", limitProfileLevelEnable=" + this.f479077i + ", aacEncodeNeedCodecSpecificData=" + this.f479078j + ", outputHevc=" + this.f479079k + ", suggestParallelCount=" + this.f479080l + ", renderSize=" + this.f479081m + ')';
    }
}
