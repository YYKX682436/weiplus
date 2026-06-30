package gm2;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f354923a;

    /* renamed from: b, reason: collision with root package name */
    public int f354924b;

    /* renamed from: c, reason: collision with root package name */
    public int f354925c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f354926d;

    /* renamed from: e, reason: collision with root package name */
    public int f354927e;

    /* renamed from: f, reason: collision with root package name */
    public int f354928f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.drawable.Drawable f354929g;

    /* renamed from: h, reason: collision with root package name */
    public int f354930h;

    /* renamed from: i, reason: collision with root package name */
    public int f354931i;

    /* renamed from: j, reason: collision with root package name */
    public android.graphics.drawable.Drawable f354932j;

    /* renamed from: k, reason: collision with root package name */
    public int f354933k;

    /* renamed from: l, reason: collision with root package name */
    public int f354934l;

    /* renamed from: m, reason: collision with root package name */
    public int f354935m;

    /* renamed from: n, reason: collision with root package name */
    public int f354936n;

    /* renamed from: o, reason: collision with root package name */
    public int f354937o;

    /* renamed from: p, reason: collision with root package name */
    public int f354938p;

    /* renamed from: q, reason: collision with root package name */
    public int f354939q;

    /* renamed from: r, reason: collision with root package name */
    public final int f354940r;

    /* renamed from: s, reason: collision with root package name */
    public final int f354941s;

    /* renamed from: t, reason: collision with root package name */
    public final int f354942t;

    public i(java.lang.String str, int i17, int i18, java.lang.String str2, int i19, int i27, android.graphics.drawable.Drawable drawable, int i28, int i29, android.graphics.drawable.Drawable drawable2, int i37, int i38, int i39, int i47, int i48, int i49, int i57, int i58, int i59, int i66, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        java.lang.String level = (i66 & 1) != 0 ? "" : str;
        int color = (i66 & 2) != 0 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an) : i17;
        int e17 = (i66 & 4) != 0 ? gm2.c1.f354853a.e() : i18;
        java.lang.String fansName = (i66 & 8) == 0 ? str2 : "";
        int color2 = (i66 & 16) != 0 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an) : i19;
        int e18 = (i66 & 32) != 0 ? gm2.c1.f354853a.e() : i27;
        android.graphics.drawable.Drawable drawable3 = (i66 & 64) != 0 ? null : drawable;
        int h17 = (i66 & 128) != 0 ? gm2.c1.f354853a.h() : i28;
        int h18 = (i66 & 256) != 0 ? gm2.c1.f354853a.h() : i29;
        android.graphics.drawable.Drawable drawable4 = (i66 & 512) == 0 ? drawable2 : null;
        int i67 = (i66 & 1024) != 0 ? gm2.c1.f354853a.i() : i37;
        int h19 = (i66 & 2048) != 0 ? gm2.c1.f354853a.h() : i38;
        int color3 = (i66 & 4096) != 0 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b) : i39;
        int g17 = (i66 & 8192) != 0 ? gm2.c1.f354853a.g() : i47;
        int k17 = (i66 & 16384) != 0 ? gm2.c1.f354853a.k() : i48;
        int k18 = (i66 & 32768) != 0 ? gm2.c1.f354853a.k() : i49;
        int i68 = (i66 & 65536) != 0 ? 0 : i57;
        int i69 = (i66 & 131072) != 0 ? 1 : i58;
        int i76 = (i66 & 262144) != 0 ? 0 : i59;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(level, "level");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fansName, "fansName");
        this.f354923a = level;
        this.f354924b = color;
        this.f354925c = e17;
        this.f354926d = fansName;
        this.f354927e = color2;
        this.f354928f = e18;
        this.f354929g = drawable3;
        this.f354930h = h17;
        this.f354931i = h18;
        this.f354932j = drawable4;
        this.f354933k = i67;
        this.f354934l = h19;
        this.f354935m = color3;
        this.f354936n = g17;
        this.f354937o = k17;
        this.f354938p = k18;
        this.f354939q = i68;
        this.f354940r = i69;
        this.f354941s = i76;
        this.f354942t = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn);
    }

    public final int a() {
        android.graphics.drawable.Drawable drawable = this.f354929g;
        int i17 = this.f354942t;
        int i18 = drawable == null ? i17 : this.f354930h;
        if (this.f354932j != null) {
            i17 = this.f354933k / 2;
        }
        return (int) (i18 + this.f354941s + this.f354940r + gm2.c1.f354853a.p(this.f354926d, this.f354928f) + i17);
    }

    /* renamed from: equals */
    public boolean m131819xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm2.i)) {
            return false;
        }
        gm2.i iVar = (gm2.i) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f354923a, iVar.f354923a) && this.f354924b == iVar.f354924b && this.f354925c == iVar.f354925c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f354926d, iVar.f354926d) && this.f354927e == iVar.f354927e && this.f354928f == iVar.f354928f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f354929g, iVar.f354929g) && this.f354930h == iVar.f354930h && this.f354931i == iVar.f354931i && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f354932j, iVar.f354932j) && this.f354933k == iVar.f354933k && this.f354934l == iVar.f354934l && this.f354935m == iVar.f354935m && this.f354936n == iVar.f354936n && this.f354937o == iVar.f354937o && this.f354938p == iVar.f354938p && this.f354939q == iVar.f354939q && this.f354940r == iVar.f354940r && this.f354941s == iVar.f354941s;
    }

    /* renamed from: hashCode */
    public int m131820x8cdac1b() {
        int hashCode = ((((((((((this.f354923a.hashCode() * 31) + java.lang.Integer.hashCode(this.f354924b)) * 31) + java.lang.Integer.hashCode(this.f354925c)) * 31) + this.f354926d.hashCode()) * 31) + java.lang.Integer.hashCode(this.f354927e)) * 31) + java.lang.Integer.hashCode(this.f354928f)) * 31;
        android.graphics.drawable.Drawable drawable = this.f354929g;
        int hashCode2 = (((((hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31) + java.lang.Integer.hashCode(this.f354930h)) * 31) + java.lang.Integer.hashCode(this.f354931i)) * 31;
        android.graphics.drawable.Drawable drawable2 = this.f354932j;
        return ((((((((((((((((((hashCode2 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f354933k)) * 31) + java.lang.Integer.hashCode(this.f354934l)) * 31) + java.lang.Integer.hashCode(this.f354935m)) * 31) + java.lang.Integer.hashCode(this.f354936n)) * 31) + java.lang.Integer.hashCode(this.f354937o)) * 31) + java.lang.Integer.hashCode(this.f354938p)) * 31) + java.lang.Integer.hashCode(this.f354939q)) * 31) + java.lang.Integer.hashCode(this.f354940r)) * 31) + java.lang.Integer.hashCode(this.f354941s);
    }

    /* renamed from: toString */
    public java.lang.String m131821x9616526c() {
        return "FinderLiveFansSpanParams(level=" + this.f354923a + ", levelColor=" + this.f354924b + ", levelSize=" + this.f354925c + ", fansName=" + this.f354926d + ", fansNameColor=" + this.f354927e + ", fansNameSize=" + this.f354928f + ", leftIcon=" + this.f354929g + ", leftIconWidth=" + this.f354930h + ", leftIconHeight=" + this.f354931i + ", rightIcon=" + this.f354932j + ", rightIconWidth=" + this.f354933k + ", rightIconHeight=" + this.f354934l + ", bgColor=" + this.f354935m + ", bgHeight=" + this.f354936n + ", leftMargin=" + this.f354937o + ", rightMargin=" + this.f354938p + ", bgDrawable=" + this.f354939q + ", nameLeftMargin=" + this.f354940r + ", leftIconMargin=" + this.f354941s + ')';
    }
}
