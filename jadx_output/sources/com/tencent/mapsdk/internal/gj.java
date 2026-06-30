package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class gj {

    /* renamed from: a, reason: collision with root package name */
    public float f49587a;

    /* renamed from: b, reason: collision with root package name */
    public float f49588b;

    /* renamed from: c, reason: collision with root package name */
    public float f49589c;

    /* renamed from: d, reason: collision with root package name */
    public float f49590d = 1.0f;

    public gj() {
    }

    private com.tencent.mapsdk.internal.gj a(float[] fArr) {
        float[] fArr2 = new float[4];
        android.opengl.Matrix.multiplyMV(fArr2, 0, fArr, 0, new float[]{this.f49587a, this.f49588b, this.f49589c, this.f49590d}, 0);
        float f17 = fArr2[0];
        float f18 = fArr2[3];
        return new com.tencent.mapsdk.internal.gj(f17 / f18, fArr2[1] / f18, fArr2[2] / f18);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.mapsdk.internal.gj)) {
            return false;
        }
        com.tencent.mapsdk.internal.gj gjVar = (com.tencent.mapsdk.internal.gj) obj;
        return this.f49587a == gjVar.f49587a && this.f49588b == gjVar.f49588b && this.f49589c == gjVar.f49589c;
    }

    public final java.lang.String toString() {
        return this.f49587a + "," + this.f49588b + "," + this.f49589c;
    }

    public gj(float f17, float f18, float f19) {
        this.f49587a = f17;
        this.f49588b = f18;
        this.f49589c = f19;
    }
}
