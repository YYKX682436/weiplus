package cf5;

/* loaded from: classes11.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public int f40989a;

    /* renamed from: b, reason: collision with root package name */
    public int f40990b;

    /* renamed from: c, reason: collision with root package name */
    public int f40991c;

    /* renamed from: d, reason: collision with root package name */
    public int f40992d;

    /* renamed from: e, reason: collision with root package name */
    public int f40993e;

    /* renamed from: f, reason: collision with root package name */
    public int f40994f;

    /* renamed from: g, reason: collision with root package name */
    public int f40995g;

    /* renamed from: h, reason: collision with root package name */
    public int f40996h;

    /* renamed from: i, reason: collision with root package name */
    public int f40997i;

    /* renamed from: j, reason: collision with root package name */
    public int f40998j;

    /* renamed from: k, reason: collision with root package name */
    public int f40999k;

    /* renamed from: l, reason: collision with root package name */
    public int f41000l;

    /* renamed from: m, reason: collision with root package name */
    public int f41001m;

    /* renamed from: n, reason: collision with root package name */
    public int f41002n;

    /* renamed from: o, reason: collision with root package name */
    public int f41003o;

    /* renamed from: p, reason: collision with root package name */
    public int f41004p;

    /* renamed from: q, reason: collision with root package name */
    public int f41005q;

    /* renamed from: r, reason: collision with root package name */
    public int f41006r;

    public m(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, int i49, int i57, int i58, int i59, int i66, int i67, int i68, int i69, kotlin.jvm.internal.i iVar) {
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
        this.f40989a = i76;
        this.f40990b = i77;
        this.f40991c = i78;
        this.f40992d = i79;
        this.f40993e = i86;
        this.f40994f = i87;
        this.f40995g = i88;
        this.f40996h = i89;
        this.f40997i = i96;
        this.f40998j = i97;
        this.f40999k = i98;
        this.f41000l = i99;
        this.f41001m = i100;
        this.f41002n = i101;
        this.f41003o = i102;
        this.f41004p = i103;
        this.f41005q = i104;
        this.f41006r = i105;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf5.m)) {
            return false;
        }
        cf5.m mVar = (cf5.m) obj;
        return this.f40989a == mVar.f40989a && this.f40990b == mVar.f40990b && this.f40991c == mVar.f40991c && this.f40992d == mVar.f40992d && this.f40993e == mVar.f40993e && this.f40994f == mVar.f40994f && this.f40995g == mVar.f40995g && this.f40996h == mVar.f40996h && this.f40997i == mVar.f40997i && this.f40998j == mVar.f40998j && this.f40999k == mVar.f40999k && this.f41000l == mVar.f41000l && this.f41001m == mVar.f41001m && this.f41002n == mVar.f41002n && this.f41003o == mVar.f41003o && this.f41004p == mVar.f41004p && this.f41005q == mVar.f41005q && this.f41006r == mVar.f41006r;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((java.lang.Integer.hashCode(this.f40989a) * 31) + java.lang.Integer.hashCode(this.f40990b)) * 31) + java.lang.Integer.hashCode(this.f40991c)) * 31) + java.lang.Integer.hashCode(this.f40992d)) * 31) + java.lang.Integer.hashCode(this.f40993e)) * 31) + java.lang.Integer.hashCode(this.f40994f)) * 31) + java.lang.Integer.hashCode(this.f40995g)) * 31) + java.lang.Integer.hashCode(this.f40996h)) * 31) + java.lang.Integer.hashCode(this.f40997i)) * 31) + java.lang.Integer.hashCode(this.f40998j)) * 31) + java.lang.Integer.hashCode(this.f40999k)) * 31) + java.lang.Integer.hashCode(this.f41000l)) * 31) + java.lang.Integer.hashCode(this.f41001m)) * 31) + java.lang.Integer.hashCode(this.f41002n)) * 31) + java.lang.Integer.hashCode(this.f41003o)) * 31) + java.lang.Integer.hashCode(this.f41004p)) * 31) + java.lang.Integer.hashCode(this.f41005q)) * 31) + java.lang.Integer.hashCode(this.f41006r);
    }

    public java.lang.String toString() {
        return "BlockStats(boldCount=" + this.f40989a + ", codeBlockCount=" + this.f40990b + ", inlineCodeCount=" + this.f40991c + ", tableCount=" + this.f40992d + ", tableCellCount=" + this.f40993e + ", headingCount=" + this.f40994f + ", orderedListCount=" + this.f40995g + ", unorderedListCount=" + this.f40996h + ", listItemCount=" + this.f40997i + ", blockquoteCount=" + this.f40998j + ", mathBlockCount=" + this.f40999k + ", hrCount=" + this.f41000l + ", linkCount=" + this.f41001m + ", italicCount=" + this.f41002n + ", strikethroughCount=" + this.f41003o + ", inlineMathCount=" + this.f41004p + ", codeBlockCharCount=" + this.f41005q + ", tableCellCharCount=" + this.f41006r + ')';
    }
}
