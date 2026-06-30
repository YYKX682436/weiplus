package com.tencent.maas.utils;

/* loaded from: classes5.dex */
public class MJVideoClassifierResult {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f48568a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f48569b;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f48570c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f48571d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f48572e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f48573f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f48574g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f48575h;

    public MJVideoClassifierResult(int[] iArr, int[] iArr2, float[] fArr, int[] iArr3, float[] fArr2, float[] fArr3, int[] iArr4, int[] iArr5, float[] fArr4) {
        this.f48568a = iArr;
        this.f48569b = iArr2;
        this.f48570c = fArr;
        this.f48571d = iArr3;
        this.f48572e = fArr2;
        this.f48573f = fArr3;
        this.f48574g = new java.util.HashMap(iArr4.length);
        for (int i17 = 0; i17 < iArr4.length; i17++) {
            this.f48574g.put(java.lang.Integer.valueOf(iArr4[i17]), java.lang.Integer.valueOf(iArr5[i17]));
        }
        this.f48575h = fArr4;
    }

    public java.lang.String toString() {
        return "MJVideoClassifierResult{VisionTaskOutLabels=" + java.util.Arrays.toString(this.f48568a) + ", VisionTaskExceedsThreshold=" + java.util.Arrays.toString(this.f48569b) + ", VisionTaskOutScores=" + java.util.Arrays.toString(this.f48570c) + ", AudioTaskOutLabels=" + java.util.Arrays.toString(this.f48571d) + ", AudioTaskOutScores=" + java.util.Arrays.toString(this.f48572e) + ", LastVersionOutScores=" + java.util.Arrays.toString(this.f48573f) + ", Clusters=" + this.f48574g.toString() + ", EmbeddingFeature=" + java.util.Arrays.toString(this.f48575h) + '}';
    }
}
