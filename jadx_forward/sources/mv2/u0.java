package mv2;

/* loaded from: classes3.dex */
public final class u0 {
    public final int A;
    public java.lang.String B;
    public r45.e21 C;
    public long D;
    public r45.s01 E;
    public r45.b01 F;
    public r45.b01 G;
    public java.util.ArrayList H;
    public r45.xn2 I;

    /* renamed from: J, reason: collision with root package name */
    public r45.kc4 f413169J;
    public r45.zf2 K;
    public r45.jg2 L;
    public java.lang.String M;
    public java.lang.String N;
    public java.lang.String O;
    public int P;
    public java.lang.String Q;
    public int R;
    public int S;
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g T;
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g U;
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g V;
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g W;
    public boolean X;
    public r45.ab4 Y;
    public long Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f413170a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f413171b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.kb4 f413172c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.ze2 f413173d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.o21 f413174e;

    /* renamed from: f, reason: collision with root package name */
    public final int f413175f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f413176g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f413177h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f413178i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f413179j;

    /* renamed from: k, reason: collision with root package name */
    public final int f413180k;

    /* renamed from: l, reason: collision with root package name */
    public final r45.z31 f413181l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f413182m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f413183n;

    /* renamed from: o, reason: collision with root package name */
    public final int f413184o;

    /* renamed from: p, reason: collision with root package name */
    public final r45.xl2 f413185p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f413186q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f413187r;

    /* renamed from: s, reason: collision with root package name */
    public final r45.q23 f413188s;

    /* renamed from: t, reason: collision with root package name */
    public final r45.df2 f413189t;

    /* renamed from: u, reason: collision with root package name */
    public final r45.n41 f413190u;

    /* renamed from: v, reason: collision with root package name */
    public final long f413191v;

    /* renamed from: w, reason: collision with root package name */
    public final int f413192w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f413193x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f413194y;

    /* renamed from: z, reason: collision with root package name */
    public final r45.t11 f413195z;

    public u0(int i17, java.lang.String description, r45.kb4 kb4Var, r45.ze2 ze2Var, r45.o21 o21Var, int i18, boolean z17, java.lang.String str, java.util.ArrayList arrayList, boolean z18, int i19, r45.z31 z31Var, java.lang.String str2, java.lang.String str3, int i27, r45.xl2 xl2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, java.util.LinkedList jumpInfoList, r45.q23 q23Var, r45.df2 df2Var, r45.n41 n41Var, long j17, int i28, boolean z19, boolean z27, r45.t11 t11Var, int i29, int i37, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        r45.ze2 ze2Var2 = (i37 & 8) != 0 ? null : ze2Var;
        r45.o21 o21Var2 = (i37 & 16) != 0 ? null : o21Var;
        java.lang.String videoPathBeforeCut = (i37 & 128) != 0 ? "" : str;
        boolean z28 = (i37 & 512) != 0 ? false : z18;
        int i38 = (i37 & 1024) != 0 ? 0 : i19;
        r45.z31 z31Var2 = (i37 & 2048) != 0 ? null : z31Var;
        java.lang.String remoteUrl = (i37 & 4096) != 0 ? "" : str2;
        java.lang.String paramsJson = (i37 & 8192) != 0 ? "" : str3;
        int i39 = (i37 & 16384) != 0 ? 0 : i27;
        r45.xl2 xl2Var2 = (i37 & 32768) != 0 ? null : xl2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0792 = (i37 & 65536) != 0 ? null : c14994x9b99c079;
        r45.q23 q23Var2 = (i37 & 262144) != 0 ? null : q23Var;
        r45.df2 df2Var2 = (i37 & 524288) != 0 ? null : df2Var;
        r45.n41 n41Var2 = (i37 & 1048576) != 0 ? null : n41Var;
        long j18 = (i37 & 2097152) != 0 ? 0L : j17;
        int i47 = (i37 & 4194304) != 0 ? 0 : i28;
        boolean z29 = (i37 & 8388608) != 0 ? false : z19;
        boolean z37 = (i37 & com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb) != 0 ? false : z27;
        r45.t11 t11Var2 = (i37 & com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432) != 0 ? null : t11Var;
        int i48 = (i37 & 67108864) != 0 ? 0 : i29;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(description, "description");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPathBeforeCut, "videoPathBeforeCut");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(remoteUrl, "remoteUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paramsJson, "paramsJson");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfoList, "jumpInfoList");
        this.f413170a = i17;
        this.f413171b = description;
        this.f413172c = kb4Var;
        this.f413173d = ze2Var2;
        this.f413174e = o21Var2;
        this.f413175f = i18;
        this.f413176g = z17;
        this.f413177h = videoPathBeforeCut;
        this.f413178i = arrayList;
        this.f413179j = z28;
        this.f413180k = i38;
        this.f413181l = z31Var2;
        this.f413182m = remoteUrl;
        this.f413183n = paramsJson;
        this.f413184o = i39;
        this.f413185p = xl2Var2;
        this.f413186q = c14994x9b99c0792;
        this.f413187r = jumpInfoList;
        this.f413188s = q23Var2;
        this.f413189t = df2Var2;
        this.f413190u = n41Var2;
        this.f413191v = j18;
        this.f413192w = i47;
        this.f413193x = z29;
        this.f413194y = z37;
        this.f413195z = t11Var2;
        this.A = i48;
        this.B = "";
    }

    /* renamed from: equals */
    public boolean m148467xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mv2.u0)) {
            return false;
        }
        mv2.u0 u0Var = (mv2.u0) obj;
        return this.f413170a == u0Var.f413170a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f413171b, u0Var.f413171b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f413172c, u0Var.f413172c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f413173d, u0Var.f413173d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f413174e, u0Var.f413174e) && this.f413175f == u0Var.f413175f && this.f413176g == u0Var.f413176g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f413177h, u0Var.f413177h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f413178i, u0Var.f413178i) && this.f413179j == u0Var.f413179j && this.f413180k == u0Var.f413180k && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f413181l, u0Var.f413181l) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f413182m, u0Var.f413182m) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f413183n, u0Var.f413183n) && this.f413184o == u0Var.f413184o && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f413185p, u0Var.f413185p) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f413186q, u0Var.f413186q) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f413187r, u0Var.f413187r) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f413188s, u0Var.f413188s) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f413189t, u0Var.f413189t) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f413190u, u0Var.f413190u) && this.f413191v == u0Var.f413191v && this.f413192w == u0Var.f413192w && this.f413193x == u0Var.f413193x && this.f413194y == u0Var.f413194y && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f413195z, u0Var.f413195z) && this.A == u0Var.A;
    }

    /* renamed from: hashCode */
    public int m148468x8cdac1b() {
        int hashCode = ((java.lang.Integer.hashCode(this.f413170a) * 31) + this.f413171b.hashCode()) * 31;
        r45.kb4 kb4Var = this.f413172c;
        int hashCode2 = (hashCode + (kb4Var == null ? 0 : kb4Var.hashCode())) * 31;
        r45.ze2 ze2Var = this.f413173d;
        int hashCode3 = (hashCode2 + (ze2Var == null ? 0 : ze2Var.hashCode())) * 31;
        r45.o21 o21Var = this.f413174e;
        int hashCode4 = (((((((hashCode3 + (o21Var == null ? 0 : o21Var.hashCode())) * 31) + java.lang.Integer.hashCode(this.f413175f)) * 31) + java.lang.Boolean.hashCode(this.f413176g)) * 31) + this.f413177h.hashCode()) * 31;
        java.util.ArrayList arrayList = this.f413178i;
        int hashCode5 = (((((hashCode4 + (arrayList == null ? 0 : arrayList.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f413179j)) * 31) + java.lang.Integer.hashCode(this.f413180k)) * 31;
        r45.z31 z31Var = this.f413181l;
        int hashCode6 = (((((((hashCode5 + (z31Var == null ? 0 : z31Var.hashCode())) * 31) + this.f413182m.hashCode()) * 31) + this.f413183n.hashCode()) * 31) + java.lang.Integer.hashCode(this.f413184o)) * 31;
        r45.xl2 xl2Var = this.f413185p;
        int hashCode7 = (hashCode6 + (xl2Var == null ? 0 : xl2Var.hashCode())) * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f413186q;
        int hashCode8 = (((hashCode7 + (c14994x9b99c079 == null ? 0 : c14994x9b99c079.hashCode())) * 31) + this.f413187r.hashCode()) * 31;
        r45.q23 q23Var = this.f413188s;
        int hashCode9 = (hashCode8 + (q23Var == null ? 0 : q23Var.hashCode())) * 31;
        r45.df2 df2Var = this.f413189t;
        int hashCode10 = (hashCode9 + (df2Var == null ? 0 : df2Var.hashCode())) * 31;
        r45.n41 n41Var = this.f413190u;
        int hashCode11 = (((((((((hashCode10 + (n41Var == null ? 0 : n41Var.hashCode())) * 31) + java.lang.Long.hashCode(this.f413191v)) * 31) + java.lang.Integer.hashCode(this.f413192w)) * 31) + java.lang.Boolean.hashCode(this.f413193x)) * 31) + java.lang.Boolean.hashCode(this.f413194y)) * 31;
        r45.t11 t11Var = this.f413195z;
        return ((hashCode11 + (t11Var != null ? t11Var.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.A);
    }

    /* renamed from: toString */
    public java.lang.String m148469x9616526c() {
        return "HoldingPostData(mediaType=" + this.f413170a + ", description=" + this.f413171b + ", localContent=" + this.f413172c + ", location=" + this.f413173d + ", extendedReading=" + this.f413174e + ", originalFlag=" + this.f413175f + ", isFromCamera=" + this.f413176g + ", videoPathBeforeCut=" + this.f413177h + ", atContactList=" + this.f413178i + ", isLongVideo=" + this.f413179j + ", objectType=" + this.f413180k + ", fromAppInfo=" + this.f413181l + ", remoteUrl=" + this.f413182m + ", paramsJson=" + this.f413183n + ", sdkShareType=" + this.f413184o + ", activityEvent=" + this.f413185p + ", draftFinderItem=" + this.f413186q + ", jumpInfoList=" + this.f413187r + ", videoTemplateInfo=" + this.f413188s + ", mjPublisherInfo=" + this.f413189t + ", reportInfo=" + this.f413190u + ", postFlag=" + this.f413191v + ", watermarkFlag=" + this.f413192w + ", copyFirst=" + this.f413193x + ", declareOriginal=" + this.f413194y + ", interactionEasterEgg=" + this.f413195z + ", setInteractionEasterEggScene=" + this.A + ')';
    }
}
