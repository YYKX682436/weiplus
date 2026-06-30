package gm2;

/* loaded from: classes3.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.CharSequence f354903a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.CharSequence f354904b;

    /* renamed from: c, reason: collision with root package name */
    public int f354905c;

    /* renamed from: d, reason: collision with root package name */
    public int f354906d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f354907e;

    /* renamed from: f, reason: collision with root package name */
    public int f354908f;

    /* renamed from: g, reason: collision with root package name */
    public final int f354909g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f354910h;

    /* renamed from: i, reason: collision with root package name */
    public int f354911i;

    /* renamed from: j, reason: collision with root package name */
    public int f354912j;

    /* renamed from: k, reason: collision with root package name */
    public int f354913k;

    /* renamed from: l, reason: collision with root package name */
    public int f354914l;

    /* renamed from: m, reason: collision with root package name */
    public int f354915m;

    /* renamed from: n, reason: collision with root package name */
    public int f354916n;

    /* renamed from: o, reason: collision with root package name */
    public final float f354917o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.Bitmap f354918p;

    /* renamed from: q, reason: collision with root package name */
    public int[] f354919q;

    /* renamed from: r, reason: collision with root package name */
    public int f354920r;

    /* renamed from: s, reason: collision with root package name */
    public int f354921s;

    /* renamed from: t, reason: collision with root package name */
    public int f354922t;

    public h1(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, int i17, int i18, boolean z17, int i19, int i27, boolean z18, int i28, int i29, int i37, int i38, int i39, int i47, float f17, android.graphics.Bitmap bitmap, int[] iArr, int i48, int i49, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        int i57;
        int i58;
        java.lang.CharSequence textContent = (i49 & 1) != 0 ? "" : charSequence;
        java.lang.CharSequence number = (i49 & 2) == 0 ? charSequence2 : "";
        int color = (i49 & 4) != 0 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0) : i17;
        int e17 = (i49 & 8) != 0 ? gm2.c1.f354853a.e() : i18;
        boolean z19 = (i49 & 16) != 0 ? false : z17;
        int i59 = (i49 & 32) != 0 ? 0 : i19;
        int i66 = (i49 & 64) != 0 ? 255 : i27;
        boolean z27 = (i49 & 128) != 0 ? false : z18;
        int k17 = (i49 & 256) != 0 ? gm2.c1.f354853a.k() : i28;
        if ((i49 & 512) != 0) {
            gm2.c1 c1Var = gm2.c1.f354853a;
            i57 = ((java.lang.Number) ((jz5.n) gm2.c1.f354855c).mo141623x754a37bb()).intValue();
        } else {
            i57 = i29;
        }
        if ((i49 & 1024) != 0) {
            gm2.c1 c1Var2 = gm2.c1.f354853a;
            i58 = ((java.lang.Number) ((jz5.n) gm2.c1.f354855c).mo141623x754a37bb()).intValue();
        } else {
            i58 = i37;
        }
        int i67 = (i49 & 2048) != 0 ? 0 : i38;
        int i68 = (i49 & 4096) != 0 ? 0 : i39;
        int g17 = (i49 & 8192) != 0 ? gm2.c1.f354853a.g() : i47;
        float f18 = (i49 & 16384) != 0 ? 0.0f : f17;
        android.graphics.Bitmap bitmap2 = (i49 & 32768) != 0 ? null : bitmap;
        int[] iArr2 = (i49 & 65536) != 0 ? null : iArr;
        int i69 = (i49 & 131072) != 0 ? 0 : i48;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textContent, "textContent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(number, "number");
        this.f354903a = textContent;
        this.f354904b = number;
        this.f354905c = color;
        this.f354906d = e17;
        this.f354907e = z19;
        this.f354908f = i59;
        this.f354909g = i66;
        this.f354910h = z27;
        this.f354911i = k17;
        this.f354912j = i57;
        this.f354913k = i58;
        this.f354914l = i67;
        this.f354915m = i68;
        this.f354916n = g17;
        this.f354917o = f18;
        this.f354918p = bitmap2;
        this.f354919q = iArr2;
        this.f354920r = i69;
    }

    /* renamed from: equals */
    public boolean m131816xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm2.h1)) {
            return false;
        }
        gm2.h1 h1Var = (gm2.h1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f354903a, h1Var.f354903a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f354904b, h1Var.f354904b) && this.f354905c == h1Var.f354905c && this.f354906d == h1Var.f354906d && this.f354907e == h1Var.f354907e && this.f354908f == h1Var.f354908f && this.f354909g == h1Var.f354909g && this.f354910h == h1Var.f354910h && this.f354911i == h1Var.f354911i && this.f354912j == h1Var.f354912j && this.f354913k == h1Var.f354913k && this.f354914l == h1Var.f354914l && this.f354915m == h1Var.f354915m && this.f354916n == h1Var.f354916n && java.lang.Float.compare(this.f354917o, h1Var.f354917o) == 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f354918p, h1Var.f354918p) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f354919q, h1Var.f354919q) && this.f354920r == h1Var.f354920r;
    }

    /* renamed from: hashCode */
    public int m131817x8cdac1b() {
        int hashCode = ((((((((((((((((((((((((((((this.f354903a.hashCode() * 31) + this.f354904b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f354905c)) * 31) + java.lang.Integer.hashCode(this.f354906d)) * 31) + java.lang.Boolean.hashCode(this.f354907e)) * 31) + java.lang.Integer.hashCode(this.f354908f)) * 31) + java.lang.Integer.hashCode(this.f354909g)) * 31) + java.lang.Boolean.hashCode(this.f354910h)) * 31) + java.lang.Integer.hashCode(this.f354911i)) * 31) + java.lang.Integer.hashCode(this.f354912j)) * 31) + java.lang.Integer.hashCode(this.f354913k)) * 31) + java.lang.Integer.hashCode(this.f354914l)) * 31) + java.lang.Integer.hashCode(this.f354915m)) * 31) + java.lang.Integer.hashCode(this.f354916n)) * 31) + java.lang.Float.hashCode(this.f354917o)) * 31;
        android.graphics.Bitmap bitmap = this.f354918p;
        int hashCode2 = (hashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        int[] iArr = this.f354919q;
        return ((hashCode2 + (iArr != null ? java.util.Arrays.hashCode(iArr) : 0)) * 31) + java.lang.Integer.hashCode(this.f354920r);
    }

    /* renamed from: toString */
    public java.lang.String m131818x9616526c() {
        return "FinderLiveTagImageSpanConfig(textContent=" + ((java.lang.Object) this.f354903a) + ", number=" + ((java.lang.Object) this.f354904b) + ", textColor=" + this.f354905c + ", textSize=" + this.f354906d + ", textBold=" + this.f354907e + ", leftMargin=" + this.f354908f + ", alpha=" + this.f354909g + ", hasFrame=" + this.f354910h + ", rightMargin=" + this.f354911i + ", leftPading=" + this.f354912j + ", rightPading=" + this.f354913k + ", centerPading=" + this.f354914l + ", bgColor=" + this.f354915m + ", bgHeight=" + this.f354916n + ", radius=" + this.f354917o + ", bgBitmap=" + this.f354918p + ", gradientColor=" + java.util.Arrays.toString(this.f354919q) + ", lineHeight=" + this.f354920r + ')';
    }
}
