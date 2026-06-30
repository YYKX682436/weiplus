package com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1;

/* renamed from: com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate */
/* loaded from: classes10.dex */
public class C17684x1bb265e8 {

    /* renamed from: t, reason: collision with root package name */
    public static volatile boolean f243894t;

    /* renamed from: a, reason: collision with root package name */
    public int f243895a;

    /* renamed from: b, reason: collision with root package name */
    public int f243896b;

    /* renamed from: c, reason: collision with root package name */
    public int f243897c;

    /* renamed from: d, reason: collision with root package name */
    public int f243898d;

    /* renamed from: e, reason: collision with root package name */
    public int f243899e;

    /* renamed from: f, reason: collision with root package name */
    public int f243900f;

    /* renamed from: g, reason: collision with root package name */
    public int f243901g;

    /* renamed from: h, reason: collision with root package name */
    public int f243902h;

    /* renamed from: i, reason: collision with root package name */
    public float f243903i;

    /* renamed from: j, reason: collision with root package name */
    public float f243904j;

    /* renamed from: k, reason: collision with root package name */
    public int f243905k;

    /* renamed from: l, reason: collision with root package name */
    public int f243906l;

    /* renamed from: m, reason: collision with root package name */
    public int f243907m;

    /* renamed from: n, reason: collision with root package name */
    public int f243908n;

    /* renamed from: o, reason: collision with root package name */
    public int f243909o;

    /* renamed from: p, reason: collision with root package name */
    public int f243910p;

    /* renamed from: q, reason: collision with root package name */
    public int f243911q;

    /* renamed from: r, reason: collision with root package name */
    public int f243912r;

    /* renamed from: s, reason: collision with root package name */
    public int f243913s;

    /* renamed from: GetAuQaLevel */
    private static native float m69138x17cdd5ea(java.lang.String str, float f17, float f18, int i17, boolean z17, boolean z18);

    /* renamed from: GetBitrate */
    private static native com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17683x770f5025 m69139xae869357(java.lang.String str, int i17, int i18, int i19, int i27, float f17, float f18, int i28, float f19, float f27, int i29, int i37, int i38, int i39, int i47, boolean z17);

    public static float a(java.lang.String str, float f17, float f18, int i17, boolean z17, boolean z18) {
        g();
        return m69138x17cdd5ea(kk.w.a(str, false), f17, f18, i17, z17, z18);
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17683x770f5025 b(java.lang.String str, int i17, int i18, int i19, int i27, float f17, float f18, int i28, float f19, float f27, int i29, int i37, int i38, int i39, int i47, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.a aVar) {
        g();
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17683x770f5025 m69139xae869357 = m69139xae869357(kk.w.a(str, false), i17, i18, i19, i27, f17, f18, i28, f19, f27, i29, i37, i38, i39, i47, z17);
        if (m69139xae869357 == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get null result from GetBitrateVFS: ");
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdaptiveAdjustBitrate", sb6.toString());
            return null;
        }
        if (aVar.f243914a) {
            m69139xae869357.f37978xe49e1188 = ((m69139xae869357.f37978xe49e1188 + 8) >> 4) << 4;
            m69139xae869357.f37980xce669d45 = ((m69139xae869357.f37980xce669d45 + 8) >> 4) << 4;
            java.lang.String str2 = "size[" + m69139xae869357.f37980xce669d45 + "x" + m69139xae869357.f37978xe49e1188 + "]";
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("modified GetBitrateVFS align 16, size:");
            sb7.append(str2);
            sb7.append(" Scene:");
            sb7.append(i28);
            sb7.append(" stack: ");
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb7.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdaptiveAdjustBitrate", sb7.toString());
        } else {
            java.lang.String str3 = "size[" + m69139xae869357.f37980xce669d45 + "x" + m69139xae869357.f37978xe49e1188 + "]";
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("modified GetBitrateVFS abort, size:");
            sb8.append(str3);
            sb8.append(" Scene:");
            sb8.append(i28);
            sb8.append(" stack: ");
            boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb8.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdaptiveAdjustBitrate", sb8.toString());
        }
        return m69139xae869357;
    }

    public static int d(int i17, int i18, int i19, int i27, float f17) {
        g();
        return m69140xa3fe746(i17, i18, i19, i27, f17);
    }

    public static int e(int i17, int i18, int i19, int i27, float f17) {
        g();
        return m69141xfb9f9289(i17, i18, i19, i27, f17);
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17683x770f5025 f(java.lang.String str, int i17, int i18, int i19, int i27, float f17, float f18, int i28, float f19, float f27, int i29, int i37) {
        g();
        return m69142x7efde67a(kk.w.a(str, false), i17, i18, i19, i27, f17, f18, i28, f19, f27, i29, i37);
    }

    public static void g() {
        if (f243894t) {
            return;
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.i.f243949a) {
            fp.d0.o("xffmpeg");
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.i.f243949a = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17684x1bb265e8.class.getClassLoader();
        fp.d0.n("adaptivebrres");
        f243894t = true;
    }

    /* renamed from: getOrignalImageQuality */
    private static native int m69140xa3fe746(int i17, int i18, int i19, int i27, float f17);

    /* renamed from: getVideoImageQuality */
    private static native int m69141xfb9f9289(int i17, int i18, int i19, int i27, float f17);

    /* renamed from: getVideoQuality */
    private static native com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17683x770f5025 m69142x7efde67a(java.lang.String str, int i17, int i18, int i19, int i27, float f17, float f18, int i28, float f19, float f27, int i29, int i37);

    public static int h(java.lang.String str, float f17, float f18, float f19, float f27, float f28) {
        g();
        return m69143x951b73b(kk.w.a(str, false), f17, f18, f19, f27, f28);
    }

    /* renamed from: useAlgorithmCheckNonBlackFrameTimeStamp */
    private static native int m69143x951b73b(java.lang.String str, float f17, float f18, float f19, float f27, float f28);

    public void c() {
        this.f243901g = 0;
        this.f243902h = 0;
        this.f243903i = 0.0f;
        this.f243904j = 0.0f;
        this.f243905k = 0;
        this.f243906l = 0;
        this.f243907m = 0;
        this.f243908n = 0;
        this.f243909o = 0;
        this.f243910p = 0;
        this.f243911q = 0;
        this.f243912r = 0;
        this.f243900f = 0;
    }

    /* renamed from: toString */
    public java.lang.String m69144x9616526c() {
        return "[ sourceVideoPath null targetHeight " + this.f243895a + " targetWidth " + this.f243896b + " targetvideoBitrate " + this.f243897c + " reMuxStartTimeMs " + this.f243898d + " reMuxEndTimeMs " + this.f243899e + " remuxScene " + this.f243900f + " abaSwitch " + this.f243901g + " qpSwitch " + this.f243902h + " swHEVCRatio " + this.f243903i + " hwHEVCRatio " + this.f243904j + " ceilingVideoBR " + this.f243905k + " flooringVideoBR " + this.f243906l + " isEnableHEVC " + this.f243907m + " abaPreset " + this.f243908n + " minQP " + this.f243910p + " maxQP " + this.f243911q + " takePhotosVideoBR " + this.f243912r + " remuxScene " + this.f243900f + "]";
    }
}
