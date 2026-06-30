package cf5;

/* loaded from: classes11.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public int f122522a;

    /* renamed from: b, reason: collision with root package name */
    public int f122523b;

    /* renamed from: c, reason: collision with root package name */
    public int f122524c;

    /* renamed from: d, reason: collision with root package name */
    public int f122525d;

    /* renamed from: e, reason: collision with root package name */
    public int f122526e;

    /* renamed from: f, reason: collision with root package name */
    public int f122527f;

    /* renamed from: g, reason: collision with root package name */
    public int f122528g;

    /* renamed from: h, reason: collision with root package name */
    public int f122529h;

    /* renamed from: i, reason: collision with root package name */
    public int f122530i;

    /* renamed from: j, reason: collision with root package name */
    public int f122531j;

    /* renamed from: k, reason: collision with root package name */
    public int f122532k;

    /* renamed from: l, reason: collision with root package name */
    public int f122533l;

    /* renamed from: m, reason: collision with root package name */
    public int f122534m;

    /* renamed from: n, reason: collision with root package name */
    public int f122535n;

    /* renamed from: o, reason: collision with root package name */
    public int f122536o;

    /* renamed from: p, reason: collision with root package name */
    public int f122537p;

    /* renamed from: q, reason: collision with root package name */
    public int f122538q;

    /* renamed from: r, reason: collision with root package name */
    public int f122539r;

    public m(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, int i49, int i57, int i58, int i59, int i66, int i67, int i68, int i69, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        int i76 = (i69 & 1) != 0 ? 0 : i17;
        int i77 = (i69 & 2) != 0 ? 0 : i18;
        int i78 = (i69 & 4) != 0 ? 0 : i19;
        int i79 = (i69 & 8) != 0 ? 0 : i27;
        int i86 = (i69 & 16) != 0 ? 0 : i28;
        int i87 = (i69 & 32) != 0 ? 0 : i29;
        int i88 = (i69 & 64) != 0 ? 0 : i37;
        int i89 = (i69 & 128) != 0 ? 0 : i38;
        int i96 = (i69 & 256) != 0 ? 0 : i39;
        int i97 = (i69 & 512) != 0 ? 0 : i47;
        int i98 = (i69 & 1024) != 0 ? 0 : i48;
        int i99 = (i69 & 2048) != 0 ? 0 : i49;
        int i100 = (i69 & 4096) != 0 ? 0 : i57;
        int i101 = (i69 & 8192) != 0 ? 0 : i58;
        int i102 = (i69 & 16384) != 0 ? 0 : i59;
        int i103 = (i69 & 32768) != 0 ? 0 : i66;
        int i104 = (i69 & 65536) != 0 ? 0 : i67;
        int i105 = (i69 & 131072) != 0 ? 0 : i68;
        this.f122522a = i76;
        this.f122523b = i77;
        this.f122524c = i78;
        this.f122525d = i79;
        this.f122526e = i86;
        this.f122527f = i87;
        this.f122528g = i88;
        this.f122529h = i89;
        this.f122530i = i96;
        this.f122531j = i97;
        this.f122532k = i98;
        this.f122533l = i99;
        this.f122534m = i100;
        this.f122535n = i101;
        this.f122536o = i102;
        this.f122537p = i103;
        this.f122538q = i104;
        this.f122539r = i105;
    }

    /* renamed from: equals */
    public boolean m14771xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf5.m)) {
            return false;
        }
        cf5.m mVar = (cf5.m) obj;
        return this.f122522a == mVar.f122522a && this.f122523b == mVar.f122523b && this.f122524c == mVar.f122524c && this.f122525d == mVar.f122525d && this.f122526e == mVar.f122526e && this.f122527f == mVar.f122527f && this.f122528g == mVar.f122528g && this.f122529h == mVar.f122529h && this.f122530i == mVar.f122530i && this.f122531j == mVar.f122531j && this.f122532k == mVar.f122532k && this.f122533l == mVar.f122533l && this.f122534m == mVar.f122534m && this.f122535n == mVar.f122535n && this.f122536o == mVar.f122536o && this.f122537p == mVar.f122537p && this.f122538q == mVar.f122538q && this.f122539r == mVar.f122539r;
    }

    /* renamed from: hashCode */
    public int m14772x8cdac1b() {
        return (((((((((((((((((((((((((((((((((java.lang.Integer.hashCode(this.f122522a) * 31) + java.lang.Integer.hashCode(this.f122523b)) * 31) + java.lang.Integer.hashCode(this.f122524c)) * 31) + java.lang.Integer.hashCode(this.f122525d)) * 31) + java.lang.Integer.hashCode(this.f122526e)) * 31) + java.lang.Integer.hashCode(this.f122527f)) * 31) + java.lang.Integer.hashCode(this.f122528g)) * 31) + java.lang.Integer.hashCode(this.f122529h)) * 31) + java.lang.Integer.hashCode(this.f122530i)) * 31) + java.lang.Integer.hashCode(this.f122531j)) * 31) + java.lang.Integer.hashCode(this.f122532k)) * 31) + java.lang.Integer.hashCode(this.f122533l)) * 31) + java.lang.Integer.hashCode(this.f122534m)) * 31) + java.lang.Integer.hashCode(this.f122535n)) * 31) + java.lang.Integer.hashCode(this.f122536o)) * 31) + java.lang.Integer.hashCode(this.f122537p)) * 31) + java.lang.Integer.hashCode(this.f122538q)) * 31) + java.lang.Integer.hashCode(this.f122539r);
    }

    /* renamed from: toString */
    public java.lang.String m14773x9616526c() {
        return "BlockStats(boldCount=" + this.f122522a + ", codeBlockCount=" + this.f122523b + ", inlineCodeCount=" + this.f122524c + ", tableCount=" + this.f122525d + ", tableCellCount=" + this.f122526e + ", headingCount=" + this.f122527f + ", orderedListCount=" + this.f122528g + ", unorderedListCount=" + this.f122529h + ", listItemCount=" + this.f122530i + ", blockquoteCount=" + this.f122531j + ", mathBlockCount=" + this.f122532k + ", hrCount=" + this.f122533l + ", linkCount=" + this.f122534m + ", italicCount=" + this.f122535n + ", strikethroughCount=" + this.f122536o + ", inlineMathCount=" + this.f122537p + ", codeBlockCharCount=" + this.f122538q + ", tableCellCharCount=" + this.f122539r + ')';
    }
}
