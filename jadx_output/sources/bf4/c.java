package bf4;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f19697a;

    /* renamed from: b, reason: collision with root package name */
    public int f19698b;

    /* renamed from: c, reason: collision with root package name */
    public int f19699c;

    /* renamed from: d, reason: collision with root package name */
    public int f19700d;

    /* renamed from: e, reason: collision with root package name */
    public int f19701e;

    /* renamed from: f, reason: collision with root package name */
    public final int f19702f;

    /* renamed from: g, reason: collision with root package name */
    public int f19703g;

    /* renamed from: h, reason: collision with root package name */
    public int f19704h;

    /* renamed from: i, reason: collision with root package name */
    public int f19705i;

    /* renamed from: j, reason: collision with root package name */
    public int f19706j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f19707k;

    /* renamed from: l, reason: collision with root package name */
    public int f19708l;

    /* renamed from: m, reason: collision with root package name */
    public int f19709m;

    /* renamed from: n, reason: collision with root package name */
    public int f19710n;

    /* renamed from: o, reason: collision with root package name */
    public float f19711o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.modelcontrol.VideoTransPara f19712p;

    public c(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, boolean z17, int i48, int i49, int i57, float f17, int i58, kotlin.jvm.internal.i iVar) {
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
        this.f19697a = i59;
        this.f19698b = i66;
        this.f19699c = i67;
        this.f19700d = i68;
        this.f19701e = i69;
        this.f19702f = i76;
        this.f19703g = i77;
        this.f19704h = i78;
        this.f19705i = i79;
        this.f19706j = i86;
        this.f19707k = z18;
        this.f19708l = i87;
        this.f19709m = i88;
        this.f19710n = i89;
        this.f19711o = f18;
        this.f19712p = new com.tencent.mm.modelcontrol.VideoTransPara();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bf4.c)) {
            return false;
        }
        bf4.c cVar = (bf4.c) obj;
        return this.f19697a == cVar.f19697a && this.f19698b == cVar.f19698b && this.f19699c == cVar.f19699c && this.f19700d == cVar.f19700d && this.f19701e == cVar.f19701e && this.f19702f == cVar.f19702f && this.f19703g == cVar.f19703g && this.f19704h == cVar.f19704h && this.f19705i == cVar.f19705i && this.f19706j == cVar.f19706j && this.f19707k == cVar.f19707k && this.f19708l == cVar.f19708l && this.f19709m == cVar.f19709m && this.f19710n == cVar.f19710n && java.lang.Float.compare(this.f19711o, cVar.f19711o) == 0;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((java.lang.Integer.hashCode(this.f19697a) * 31) + java.lang.Integer.hashCode(this.f19698b)) * 31) + java.lang.Integer.hashCode(this.f19699c)) * 31) + java.lang.Integer.hashCode(this.f19700d)) * 31) + java.lang.Integer.hashCode(this.f19701e)) * 31) + java.lang.Integer.hashCode(this.f19702f)) * 31) + java.lang.Integer.hashCode(this.f19703g)) * 31) + java.lang.Integer.hashCode(this.f19704h)) * 31) + java.lang.Integer.hashCode(this.f19705i)) * 31) + java.lang.Integer.hashCode(this.f19706j)) * 31) + java.lang.Boolean.hashCode(this.f19707k)) * 31) + java.lang.Integer.hashCode(this.f19708l)) * 31) + java.lang.Integer.hashCode(this.f19709m)) * 31) + java.lang.Integer.hashCode(this.f19710n)) * 31) + java.lang.Float.hashCode(this.f19711o);
    }

    public java.lang.String toString() {
        return "EncodeConfig(targetWidth=" + this.f19697a + ", targetHeight=" + this.f19698b + ", videoBitrate=" + this.f19699c + ", audioBitrate=" + this.f19700d + ", frameRate=" + this.f19701e + ", videoRotate=" + this.f19702f + ", duration=" + this.f19703g + ", iFrame=" + this.f19704h + ", profileIndex=" + this.f19705i + ", presetIndex=" + this.f19706j + ", isDefault=" + this.f19707k + ", thumbSize=" + this.f19708l + ", audioSampleRate=" + this.f19709m + ", recorderType=" + this.f19710n + ", exceedVideoBitrateTolerance=" + this.f19711o + ')';
    }
}
