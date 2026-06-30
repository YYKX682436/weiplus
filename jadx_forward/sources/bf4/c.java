package bf4;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f101230a;

    /* renamed from: b, reason: collision with root package name */
    public int f101231b;

    /* renamed from: c, reason: collision with root package name */
    public int f101232c;

    /* renamed from: d, reason: collision with root package name */
    public int f101233d;

    /* renamed from: e, reason: collision with root package name */
    public int f101234e;

    /* renamed from: f, reason: collision with root package name */
    public final int f101235f;

    /* renamed from: g, reason: collision with root package name */
    public int f101236g;

    /* renamed from: h, reason: collision with root package name */
    public int f101237h;

    /* renamed from: i, reason: collision with root package name */
    public int f101238i;

    /* renamed from: j, reason: collision with root package name */
    public int f101239j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f101240k;

    /* renamed from: l, reason: collision with root package name */
    public int f101241l;

    /* renamed from: m, reason: collision with root package name */
    public int f101242m;

    /* renamed from: n, reason: collision with root package name */
    public int f101243n;

    /* renamed from: o, reason: collision with root package name */
    public float f101244o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d f101245p;

    public c(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, boolean z17, int i48, int i49, int i57, float f17, int i58, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        int i59 = (i58 & 1) != 0 ? 0 : i17;
        int i66 = (i58 & 2) != 0 ? 0 : i18;
        int i67 = (i58 & 4) != 0 ? 0 : i19;
        int i68 = (i58 & 8) != 0 ? 0 : i27;
        int i69 = (i58 & 16) != 0 ? 0 : i28;
        int i76 = (i58 & 32) != 0 ? 0 : i29;
        int i77 = (i58 & 64) != 0 ? 0 : i37;
        int i78 = (i58 & 128) != 0 ? 0 : i38;
        int i79 = (i58 & 256) != 0 ? 0 : i39;
        int i86 = (i58 & 512) != 0 ? 0 : i47;
        boolean z18 = (i58 & 1024) != 0 ? false : z17;
        int i87 = (i58 & 2048) != 0 ? 0 : i48;
        int i88 = (i58 & 4096) == 0 ? i49 : 0;
        int i89 = (i58 & 8192) != 0 ? 2 : i57;
        float f18 = (i58 & 16384) != 0 ? 1.3f : f17;
        this.f101230a = i59;
        this.f101231b = i66;
        this.f101232c = i67;
        this.f101233d = i68;
        this.f101234e = i69;
        this.f101235f = i76;
        this.f101236g = i77;
        this.f101237h = i78;
        this.f101238i = i79;
        this.f101239j = i86;
        this.f101240k = z18;
        this.f101241l = i87;
        this.f101242m = i88;
        this.f101243n = i89;
        this.f101244o = f18;
        this.f101245p = new com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d();
    }

    /* renamed from: equals */
    public boolean m10324xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bf4.c)) {
            return false;
        }
        bf4.c cVar = (bf4.c) obj;
        return this.f101230a == cVar.f101230a && this.f101231b == cVar.f101231b && this.f101232c == cVar.f101232c && this.f101233d == cVar.f101233d && this.f101234e == cVar.f101234e && this.f101235f == cVar.f101235f && this.f101236g == cVar.f101236g && this.f101237h == cVar.f101237h && this.f101238i == cVar.f101238i && this.f101239j == cVar.f101239j && this.f101240k == cVar.f101240k && this.f101241l == cVar.f101241l && this.f101242m == cVar.f101242m && this.f101243n == cVar.f101243n && java.lang.Float.compare(this.f101244o, cVar.f101244o) == 0;
    }

    /* renamed from: hashCode */
    public int m10325x8cdac1b() {
        return (((((((((((((((((((((((((((java.lang.Integer.hashCode(this.f101230a) * 31) + java.lang.Integer.hashCode(this.f101231b)) * 31) + java.lang.Integer.hashCode(this.f101232c)) * 31) + java.lang.Integer.hashCode(this.f101233d)) * 31) + java.lang.Integer.hashCode(this.f101234e)) * 31) + java.lang.Integer.hashCode(this.f101235f)) * 31) + java.lang.Integer.hashCode(this.f101236g)) * 31) + java.lang.Integer.hashCode(this.f101237h)) * 31) + java.lang.Integer.hashCode(this.f101238i)) * 31) + java.lang.Integer.hashCode(this.f101239j)) * 31) + java.lang.Boolean.hashCode(this.f101240k)) * 31) + java.lang.Integer.hashCode(this.f101241l)) * 31) + java.lang.Integer.hashCode(this.f101242m)) * 31) + java.lang.Integer.hashCode(this.f101243n)) * 31) + java.lang.Float.hashCode(this.f101244o);
    }

    /* renamed from: toString */
    public java.lang.String m10326x9616526c() {
        return "EncodeConfig(targetWidth=" + this.f101230a + ", targetHeight=" + this.f101231b + ", videoBitrate=" + this.f101232c + ", audioBitrate=" + this.f101233d + ", frameRate=" + this.f101234e + ", videoRotate=" + this.f101235f + ", duration=" + this.f101236g + ", iFrame=" + this.f101237h + ", profileIndex=" + this.f101238i + ", presetIndex=" + this.f101239j + ", isDefault=" + this.f101240k + ", thumbSize=" + this.f101241l + ", audioSampleRate=" + this.f101242m + ", recorderType=" + this.f101243n + ", exceedVideoBitrateTolerance=" + this.f101244o + ')';
    }
}
