package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29;

/* loaded from: classes10.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public int f257189a;

    /* renamed from: b, reason: collision with root package name */
    public int f257190b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f257191c;

    /* renamed from: d, reason: collision with root package name */
    public int f257192d;

    /* renamed from: e, reason: collision with root package name */
    public int f257193e;

    /* renamed from: f, reason: collision with root package name */
    public int f257194f;

    /* renamed from: g, reason: collision with root package name */
    public int f257195g;

    /* renamed from: h, reason: collision with root package name */
    public int f257196h;

    /* renamed from: i, reason: collision with root package name */
    public int f257197i;

    /* renamed from: j, reason: collision with root package name */
    public int f257198j;

    /* renamed from: k, reason: collision with root package name */
    public int f257199k;

    public l1(int i17, int i18, java.lang.String outputPath, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i48 & 1) != 0 ? 0 : i17;
        i18 = (i48 & 2) != 0 ? 0 : i18;
        outputPath = (i48 & 4) != 0 ? "" : outputPath;
        i19 = (i48 & 8) != 0 ? 0 : i19;
        i27 = (i48 & 16) != 0 ? 0 : i27;
        i28 = (i48 & 32) != 0 ? 0 : i28;
        i29 = (i48 & 64) != 0 ? 0 : i29;
        i37 = (i48 & 128) != 0 ? 0 : i37;
        i38 = (i48 & 256) != 0 ? 0 : i38;
        i39 = (i48 & 512) != 0 ? 0 : i39;
        i47 = (i48 & 1024) != 0 ? 1 : i47;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputPath, "outputPath");
        this.f257189a = i17;
        this.f257190b = i18;
        this.f257191c = outputPath;
        this.f257192d = i19;
        this.f257193e = i27;
        this.f257194f = i28;
        this.f257195g = i29;
        this.f257196h = i37;
        this.f257197i = i38;
        this.f257198j = i39;
        this.f257199k = i47;
    }

    /* renamed from: equals */
    public boolean m72480xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.l1)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.l1 l1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.l1) obj;
        return this.f257189a == l1Var.f257189a && this.f257190b == l1Var.f257190b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f257191c, l1Var.f257191c) && this.f257192d == l1Var.f257192d && this.f257193e == l1Var.f257193e && this.f257194f == l1Var.f257194f && this.f257195g == l1Var.f257195g && this.f257196h == l1Var.f257196h && this.f257197i == l1Var.f257197i && this.f257198j == l1Var.f257198j && this.f257199k == l1Var.f257199k;
    }

    /* renamed from: hashCode */
    public int m72481x8cdac1b() {
        return (((((((((((((((((((java.lang.Integer.hashCode(this.f257189a) * 31) + java.lang.Integer.hashCode(this.f257190b)) * 31) + this.f257191c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f257192d)) * 31) + java.lang.Integer.hashCode(this.f257193e)) * 31) + java.lang.Integer.hashCode(this.f257194f)) * 31) + java.lang.Integer.hashCode(this.f257195g)) * 31) + java.lang.Integer.hashCode(this.f257196h)) * 31) + java.lang.Integer.hashCode(this.f257197i)) * 31) + java.lang.Integer.hashCode(this.f257198j)) * 31) + java.lang.Integer.hashCode(this.f257199k);
    }

    /* renamed from: toString */
    public java.lang.String m72482x9616526c() {
        return "VLogGenerateModel(outputDurationMs=" + this.f257189a + ", outputAudioType=" + this.f257190b + ", outputPath=" + this.f257191c + ", targetWidth=" + this.f257192d + ", targetHeight=" + this.f257193e + ", videoBitrate=" + this.f257194f + ", audioBitrate=" + this.f257195g + ", frameRate=" + this.f257196h + ", videoRotate=" + this.f257197i + ", audioSampleRate=" + this.f257198j + ", audioChannelCount=" + this.f257199k + ')';
    }
}
