package il4;

/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f373637a;

    /* renamed from: b, reason: collision with root package name */
    public int f373638b;

    /* renamed from: c, reason: collision with root package name */
    public int f373639c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f373640d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f373641e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f373642f;

    /* renamed from: g, reason: collision with root package name */
    public final int f373643g;

    /* renamed from: h, reason: collision with root package name */
    public final int f373644h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f373645i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f373646j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f373647k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.Integer f373648l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Boolean f373649m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f373650n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f373651o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f373652p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f373653q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f373654r;

    /* renamed from: s, reason: collision with root package name */
    public final il4.f f373655s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.Integer f373656t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f373657u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.Map f373658v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f373659w;

    /* renamed from: x, reason: collision with root package name */
    public bw5.x2 f373660x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f373661y;

    public e() {
        this(null, 0, 0, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554431, null);
    }

    public final void a(int i17) {
        this.f373639c = i17;
    }

    /* renamed from: equals */
    public boolean m136731xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il4.e)) {
            return false;
        }
        il4.e eVar = (il4.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f373637a, eVar.f373637a) && this.f373638b == eVar.f373638b && this.f373639c == eVar.f373639c && this.f373640d == eVar.f373640d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f373641e, eVar.f373641e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f373642f, eVar.f373642f) && this.f373643g == eVar.f373643g && this.f373644h == eVar.f373644h && this.f373645i == eVar.f373645i && this.f373646j == eVar.f373646j && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f373647k, eVar.f373647k) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f373648l, eVar.f373648l) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f373649m, eVar.f373649m) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f373650n, eVar.f373650n) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f373651o, eVar.f373651o) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f373652p, eVar.f373652p) && this.f373653q == eVar.f373653q && this.f373654r == eVar.f373654r && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f373655s, eVar.f373655s) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f373656t, eVar.f373656t) && this.f373657u == eVar.f373657u && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f373658v, eVar.f373658v) && this.f373659w == eVar.f373659w && this.f373660x == eVar.f373660x && this.f373661y == eVar.f373661y;
    }

    /* renamed from: hashCode */
    public int m136732x8cdac1b() {
        java.lang.String str = this.f373637a;
        int hashCode = (((((((str == null ? 0 : str.hashCode()) * 31) + java.lang.Integer.hashCode(this.f373638b)) * 31) + java.lang.Integer.hashCode(this.f373639c)) * 31) + java.lang.Boolean.hashCode(this.f373640d)) * 31;
        java.lang.String str2 = this.f373641e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f373642f;
        int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + java.lang.Integer.hashCode(this.f373643g)) * 31) + java.lang.Integer.hashCode(this.f373644h)) * 31) + java.lang.Boolean.hashCode(this.f373645i)) * 31) + java.lang.Boolean.hashCode(this.f373646j)) * 31;
        java.lang.String str4 = this.f373647k;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.Integer num = this.f373648l;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Boolean bool = this.f373649m;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        java.lang.String str5 = this.f373650n;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.f373651o;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        java.lang.String str7 = this.f373652p;
        int hashCode9 = (((((((hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f373653q)) * 31) + java.lang.Boolean.hashCode(this.f373654r)) * 31) + this.f373655s.m136735x8cdac1b()) * 31;
        java.lang.Integer num2 = this.f373656t;
        int hashCode10 = (((hashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f373657u)) * 31;
        java.util.Map map = this.f373658v;
        return ((((((hashCode10 + (map != null ? map.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f373659w)) * 31) + this.f373660x.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f373661y);
    }

    /* renamed from: toString */
    public java.lang.String m136733x9616526c() {
        return "TingItemExt(extInfo=" + this.f373637a + ", playIndex=" + this.f373638b + ", fromScene=" + this.f373639c + ", withFloatBall=" + this.f373640d + ", singerCategoryId=" + this.f373641e + ", categoryName=" + this.f373642f + ", categoryType=" + this.f373643g + ", playMode=" + this.f373644h + ", shuffle=" + this.f373645i + ", isFromSnsTL=" + this.f373646j + ", sourceBizID=" + this.f373647k + ", controlType=" + this.f373648l + ", resetHome=" + this.f373649m + ", controllerSessionBuffer=" + this.f373650n + ", commentId=" + this.f373651o + ", clientId=" + this.f373652p + ", retHomeInAudio=" + this.f373653q + ", mergeWithBaseListenId=" + this.f373654r + ", sessionExt=" + this.f373655s + ", openTabType=" + this.f373656t + ", isAuthor=" + this.f373657u + ", extParams=" + this.f373658v + ", fromJsApi=" + this.f373659w + ", bizAudioEnterScene=" + this.f373660x + ", swipeMode=" + this.f373661y + ')';
    }

    public e(java.lang.String str, int i17, int i18, boolean z17, java.lang.String str2, java.lang.String str3, int i19, int i27, boolean z18, boolean z19, java.lang.String str4, java.lang.Integer num, java.lang.Boolean bool, java.lang.String str5, java.lang.String str6, java.lang.String str7, boolean z27, boolean z28, il4.f fVar, java.lang.Integer num2, boolean z29, java.util.Map map, boolean z37, bw5.x2 x2Var, boolean z38, int i28, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        java.lang.String str8;
        il4.f sessionExt;
        java.lang.Boolean bool2;
        bw5.x2 bizAudioEnterScene;
        java.lang.String str9 = (i28 & 1) != 0 ? null : str;
        int i29 = (i28 & 2) != 0 ? 0 : i17;
        int i37 = (i28 & 4) != 0 ? 0 : i18;
        boolean z39 = (i28 & 8) != 0 ? true : z17;
        java.lang.String str10 = (i28 & 16) != 0 ? null : str2;
        java.lang.String str11 = (i28 & 32) != 0 ? null : str3;
        int i38 = (i28 & 64) != 0 ? 0 : i19;
        int i39 = (i28 & 128) != 0 ? 0 : i27;
        boolean z47 = (i28 & 256) != 0 ? false : z18;
        boolean z48 = (i28 & 512) != 0 ? false : z19;
        java.lang.String str12 = (i28 & 1024) != 0 ? null : str4;
        java.lang.Integer num3 = (i28 & 2048) != 0 ? null : num;
        java.lang.Boolean bool3 = (i28 & 4096) != 0 ? null : bool;
        java.lang.String str13 = (i28 & 8192) != 0 ? null : str5;
        java.lang.String str14 = (i28 & 16384) != 0 ? null : str6;
        java.lang.String str15 = (i28 & 32768) != 0 ? null : str7;
        boolean z49 = (i28 & 65536) != 0 ? false : z27;
        boolean z57 = (i28 & 131072) != 0 ? false : z28;
        if ((i28 & 262144) != 0) {
            str8 = str14;
            sessionExt = new il4.f(false, false, false, null, null, null, null, 127, null);
        } else {
            str8 = str14;
            sessionExt = fVar;
        }
        java.lang.Integer num4 = (i28 & 524288) != 0 ? null : num2;
        boolean z58 = (i28 & 1048576) != 0 ? false : z29;
        java.util.Map map2 = (i28 & 2097152) != 0 ? null : map;
        boolean z59 = (i28 & 4194304) != 0 ? false : z37;
        if ((i28 & 8388608) != 0) {
            bool2 = bool3;
            bizAudioEnterScene = bw5.x2.BizAudioEnterScene_Unknown;
        } else {
            bool2 = bool3;
            bizAudioEnterScene = x2Var;
        }
        boolean z66 = (i28 & com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb) != 0 ? false : z38;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionExt, "sessionExt");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizAudioEnterScene, "bizAudioEnterScene");
        this.f373637a = str9;
        this.f373638b = i29;
        this.f373639c = i37;
        this.f373640d = z39;
        this.f373641e = str10;
        this.f373642f = str11;
        this.f373643g = i38;
        this.f373644h = i39;
        this.f373645i = z47;
        this.f373646j = z48;
        this.f373647k = str12;
        this.f373648l = num3;
        this.f373649m = bool2;
        this.f373650n = str13;
        this.f373651o = str8;
        this.f373652p = str15;
        this.f373653q = z49;
        this.f373654r = z57;
        this.f373655s = sessionExt;
        this.f373656t = num4;
        this.f373657u = z58;
        this.f373658v = map2;
        this.f373659w = z59;
        this.f373660x = bizAudioEnterScene;
        this.f373661y = z66;
    }
}
