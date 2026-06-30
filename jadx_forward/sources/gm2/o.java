package gm2;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public int f354969a;

    /* renamed from: b, reason: collision with root package name */
    public int f354970b;

    /* renamed from: c, reason: collision with root package name */
    public int f354971c;

    /* renamed from: d, reason: collision with root package name */
    public int f354972d;

    /* renamed from: e, reason: collision with root package name */
    public int f354973e;

    /* renamed from: f, reason: collision with root package name */
    public int f354974f;

    /* renamed from: g, reason: collision with root package name */
    public int f354975g;

    /* renamed from: h, reason: collision with root package name */
    public int f354976h;

    /* renamed from: i, reason: collision with root package name */
    public int f354977i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.CharSequence f354978j;

    /* renamed from: k, reason: collision with root package name */
    public int f354979k;

    /* renamed from: l, reason: collision with root package name */
    public int f354980l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f354981m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.drawable.Drawable f354982n;

    /* renamed from: o, reason: collision with root package name */
    public int f354983o;

    /* renamed from: p, reason: collision with root package name */
    public int f354984p;

    /* renamed from: q, reason: collision with root package name */
    public int f354985q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f354986r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f354987s;

    /* renamed from: t, reason: collision with root package name */
    public int f354988t;

    public o(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, java.lang.CharSequence charSequence, int i47, int i48, boolean z17, android.graphics.drawable.Drawable drawable, int i49, int i57, int i58, boolean z18, boolean z19, int i59, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        int i66;
        int i67;
        int i68 = (i59 & 1) != 0 ? 0 : i17;
        int k17 = (i59 & 2) != 0 ? gm2.c1.f354853a.k() : i18;
        int k18 = (i59 & 4) != 0 ? gm2.c1.f354853a.k() : i19;
        int intValue = (i59 & 8) != 0 ? ((java.lang.Number) ((jz5.n) gm2.c1.f354856d).mo141623x754a37bb()).intValue() : i27;
        int j17 = (i59 & 16) != 0 ? gm2.c1.f354853a.j() : i28;
        int i69 = (i59 & 32) != 0 ? 0 : i29;
        int i76 = (i59 & 64) != 0 ? 0 : i37;
        int g17 = (i59 & 128) != 0 ? gm2.c1.f354853a.g() : i38;
        int i77 = (i59 & 256) != 0 ? gm2.c1.f354853a.i() : i39;
        java.lang.CharSequence text = (i59 & 512) != 0 ? "" : charSequence;
        int i78 = (i59 & 1024) != 0 ? 0 : i47;
        int e17 = (i59 & 2048) != 0 ? gm2.c1.f354853a.e() : i48;
        boolean z27 = (i59 & 4096) != 0 ? false : z17;
        android.graphics.drawable.Drawable drawable2 = (i59 & 8192) != 0 ? null : drawable;
        if ((i59 & 16384) != 0) {
            gm2.c1 c1Var = gm2.c1.f354853a;
            i66 = ((java.lang.Number) ((jz5.n) gm2.c1.f354869q).mo141623x754a37bb()).intValue();
        } else {
            i66 = i49;
        }
        if ((i59 & 32768) != 0) {
            gm2.c1 c1Var2 = gm2.c1.f354853a;
            i67 = ((java.lang.Number) ((jz5.n) gm2.c1.f354869q).mo141623x754a37bb()).intValue();
        } else {
            i67 = i57;
        }
        int i79 = (i59 & 65536) != 0 ? 0 : i58;
        boolean z28 = (i59 & 131072) != 0 ? true : z18;
        boolean z29 = (i59 & 262144) != 0 ? true : z19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        this.f354969a = i68;
        this.f354970b = k17;
        this.f354971c = k18;
        this.f354972d = intValue;
        this.f354973e = j17;
        this.f354974f = i69;
        this.f354975g = i76;
        this.f354976h = g17;
        this.f354977i = i77;
        this.f354978j = text;
        this.f354979k = i78;
        this.f354980l = e17;
        this.f354981m = z27;
        this.f354982n = drawable2;
        this.f354983o = i66;
        this.f354984p = i67;
        this.f354985q = i79;
        this.f354986r = z28;
        this.f354987s = z29;
    }

    /* renamed from: equals */
    public boolean m131837xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm2.o)) {
            return false;
        }
        gm2.o oVar = (gm2.o) obj;
        return this.f354969a == oVar.f354969a && this.f354970b == oVar.f354970b && this.f354971c == oVar.f354971c && this.f354972d == oVar.f354972d && this.f354973e == oVar.f354973e && this.f354974f == oVar.f354974f && this.f354975g == oVar.f354975g && this.f354976h == oVar.f354976h && this.f354977i == oVar.f354977i && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f354978j, oVar.f354978j) && this.f354979k == oVar.f354979k && this.f354980l == oVar.f354980l && this.f354981m == oVar.f354981m && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f354982n, oVar.f354982n) && this.f354983o == oVar.f354983o && this.f354984p == oVar.f354984p && this.f354985q == oVar.f354985q && this.f354986r == oVar.f354986r && this.f354987s == oVar.f354987s;
    }

    /* renamed from: hashCode */
    public int m131838x8cdac1b() {
        int hashCode = ((((((((((((((((((((((((java.lang.Integer.hashCode(this.f354969a) * 31) + java.lang.Integer.hashCode(this.f354970b)) * 31) + java.lang.Integer.hashCode(this.f354971c)) * 31) + java.lang.Integer.hashCode(this.f354972d)) * 31) + java.lang.Integer.hashCode(this.f354973e)) * 31) + java.lang.Integer.hashCode(this.f354974f)) * 31) + java.lang.Integer.hashCode(this.f354975g)) * 31) + java.lang.Integer.hashCode(this.f354976h)) * 31) + java.lang.Integer.hashCode(this.f354977i)) * 31) + this.f354978j.hashCode()) * 31) + java.lang.Integer.hashCode(this.f354979k)) * 31) + java.lang.Integer.hashCode(this.f354980l)) * 31) + java.lang.Boolean.hashCode(this.f354981m)) * 31;
        android.graphics.drawable.Drawable drawable = this.f354982n;
        return ((((((((((hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31) + java.lang.Integer.hashCode(this.f354983o)) * 31) + java.lang.Integer.hashCode(this.f354984p)) * 31) + java.lang.Integer.hashCode(this.f354985q)) * 31) + java.lang.Boolean.hashCode(this.f354986r)) * 31) + java.lang.Boolean.hashCode(this.f354987s);
    }

    /* renamed from: toString */
    public java.lang.String m131839x9616526c() {
        return "FinderLiveImageSpanParams(leftMargin=" + this.f354969a + ", rightMargin=" + this.f354970b + ", leftPading=" + this.f354971c + ", rightPading=" + this.f354972d + ", itemPading=" + this.f354973e + ", bgColor=" + this.f354974f + ", bgDrawableId=" + this.f354975g + ", bgHeight=" + this.f354976h + ", bgRadius=" + this.f354977i + ", text=" + ((java.lang.Object) this.f354978j) + ", textColor=" + this.f354979k + ", textSize=" + this.f354980l + ", textBold=" + this.f354981m + ", leftIcon=" + this.f354982n + ", leftIconWidth=" + this.f354983o + ", leftIconHeight=" + this.f354984p + ", leftIconColor=" + this.f354985q + ", drawBg=" + this.f354986r + ", leftIconColorFilling=" + this.f354987s + ')';
    }
}
