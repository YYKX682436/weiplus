package com.p314xaae8f345.p457x3304c6.p483x6a710b1;

/* renamed from: com.tencent.maas.utils.MJVideoClassifierResult */
/* loaded from: classes5.dex */
public class C4204xc1bc4e9c {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f130101a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f130102b;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f130103c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f130104d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f130105e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f130106f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f130107g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f130108h;

    public C4204xc1bc4e9c(int[] iArr, int[] iArr2, float[] fArr, int[] iArr3, float[] fArr2, float[] fArr3, int[] iArr4, int[] iArr5, float[] fArr4) {
        this.f130101a = iArr;
        this.f130102b = iArr2;
        this.f130103c = fArr;
        this.f130104d = iArr3;
        this.f130105e = fArr2;
        this.f130106f = fArr3;
        this.f130107g = new java.util.HashMap(iArr4.length);
        for (int i17 = 0; i17 < iArr4.length; i17++) {
            this.f130107g.put(java.lang.Integer.valueOf(iArr4[i17]), java.lang.Integer.valueOf(iArr5[i17]));
        }
        this.f130108h = fArr4;
    }

    /* renamed from: toString */
    public java.lang.String m34708x9616526c() {
        return "MJVideoClassifierResult{VisionTaskOutLabels=" + java.util.Arrays.toString(this.f130101a) + ", VisionTaskExceedsThreshold=" + java.util.Arrays.toString(this.f130102b) + ", VisionTaskOutScores=" + java.util.Arrays.toString(this.f130103c) + ", AudioTaskOutLabels=" + java.util.Arrays.toString(this.f130104d) + ", AudioTaskOutScores=" + java.util.Arrays.toString(this.f130105e) + ", LastVersionOutScores=" + java.util.Arrays.toString(this.f130106f) + ", Clusters=" + this.f130107g.toString() + ", EmbeddingFeature=" + java.util.Arrays.toString(this.f130108h) + '}';
    }
}
