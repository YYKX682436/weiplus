package st3;

/* loaded from: classes10.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public int f494106a;

    /* renamed from: b, reason: collision with root package name */
    public int f494107b;

    /* renamed from: c, reason: collision with root package name */
    public int f494108c;

    /* renamed from: d, reason: collision with root package name */
    public int f494109d;

    /* renamed from: e, reason: collision with root package name */
    public int f494110e;

    /* renamed from: f, reason: collision with root package name */
    public int f494111f;

    /* renamed from: g, reason: collision with root package name */
    public int f494112g;

    /* renamed from: h, reason: collision with root package name */
    public int f494113h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f494114i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f494115j;

    /* renamed from: k, reason: collision with root package name */
    public int f494116k;

    /* renamed from: l, reason: collision with root package name */
    public int f494117l;

    /* renamed from: m, reason: collision with root package name */
    public int f494118m;

    /* renamed from: n, reason: collision with root package name */
    public int f494119n;

    public r(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, boolean z17, boolean z18, int i39, int i47, int i48, int i49, int i57, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        int i58 = (i57 & 1) != 0 ? 0 : i17;
        int i59 = (i57 & 2) != 0 ? 0 : i18;
        int i66 = (i57 & 4) != 0 ? 0 : i19;
        int i67 = (i57 & 8) != 0 ? 0 : i27;
        int i68 = (i57 & 16) != 0 ? 0 : i28;
        int i69 = (i57 & 32) != 0 ? 0 : i29;
        int i76 = (i57 & 64) != 0 ? 0 : i37;
        int i77 = (i57 & 128) != 0 ? 1 : i38;
        boolean z19 = (i57 & 256) != 0 ? false : z17;
        boolean z27 = (i57 & 512) != 0 ? false : z18;
        int i78 = (i57 & 1024) != 0 ? 0 : i39;
        int i79 = (i57 & 2048) != 0 ? 0 : i47;
        int i86 = (i57 & 4096) != 0 ? 0 : i48;
        int i87 = (i57 & 8192) == 0 ? i49 : 0;
        this.f494106a = i58;
        this.f494107b = i59;
        this.f494108c = i66;
        this.f494109d = i67;
        this.f494110e = i68;
        this.f494111f = i69;
        this.f494112g = i76;
        this.f494113h = i77;
        this.f494114i = z19;
        this.f494115j = z27;
        this.f494116k = i78;
        this.f494117l = i79;
        this.f494118m = i86;
        this.f494119n = i87;
    }

    public final int a() {
        return this.f494107b;
    }

    public final int b() {
        return this.f494106a;
    }

    public final int c() {
        return this.f494111f;
    }

    /* renamed from: equals */
    public boolean m165236xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st3.r)) {
            return false;
        }
        st3.r rVar = (st3.r) obj;
        return this.f494106a == rVar.f494106a && this.f494107b == rVar.f494107b && this.f494108c == rVar.f494108c && this.f494109d == rVar.f494109d && this.f494110e == rVar.f494110e && this.f494111f == rVar.f494111f && this.f494112g == rVar.f494112g && this.f494113h == rVar.f494113h && this.f494114i == rVar.f494114i && this.f494115j == rVar.f494115j && this.f494116k == rVar.f494116k && this.f494117l == rVar.f494117l && this.f494118m == rVar.f494118m && this.f494119n == rVar.f494119n;
    }

    /* renamed from: hashCode */
    public int m165237x8cdac1b() {
        return (((((((((((((((((((((((((java.lang.Integer.hashCode(this.f494106a) * 31) + java.lang.Integer.hashCode(this.f494107b)) * 31) + java.lang.Integer.hashCode(this.f494108c)) * 31) + java.lang.Integer.hashCode(this.f494109d)) * 31) + java.lang.Integer.hashCode(this.f494110e)) * 31) + java.lang.Integer.hashCode(this.f494111f)) * 31) + java.lang.Integer.hashCode(this.f494112g)) * 31) + java.lang.Integer.hashCode(this.f494113h)) * 31) + java.lang.Boolean.hashCode(this.f494114i)) * 31) + java.lang.Boolean.hashCode(this.f494115j)) * 31) + java.lang.Integer.hashCode(this.f494116k)) * 31) + java.lang.Integer.hashCode(this.f494117l)) * 31) + java.lang.Integer.hashCode(this.f494118m)) * 31) + java.lang.Integer.hashCode(this.f494119n);
    }

    /* renamed from: toString */
    public java.lang.String m165238x9616526c() {
        return "EncodeConfig(targetWidth=" + this.f494106a + ", targetHeight=" + this.f494107b + ", videoBitrate=" + this.f494108c + ", audioBitrate=" + this.f494109d + ", frameRate=" + this.f494110e + ", videoRotate=" + this.f494111f + ", audioSampleRate=" + this.f494112g + ", audioChannelCount=" + this.f494113h + ", needRemux=" + this.f494114i + ", change=" + this.f494115j + ", qpmin=" + this.f494116k + ", qpmax=" + this.f494117l + ", isEnable1080P=" + this.f494119n + ')';
    }
}
