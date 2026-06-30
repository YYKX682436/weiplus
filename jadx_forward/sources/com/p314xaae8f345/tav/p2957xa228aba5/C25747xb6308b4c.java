package com.p314xaae8f345.tav.p2957xa228aba5;

/* renamed from: com.tencent.tav.coremedia.Transform */
/* loaded from: classes15.dex */
public class C25747xb6308b4c {

    /* renamed from: degrees */
    public float f47898x5c296b27;

    /* renamed from: scaleX */
    public final float f47899xc9de204e;

    /* renamed from: scaleY */
    public final float f47900xc9de204f;

    /* renamed from: translateX */
    public final float f47901x995d38ca;

    /* renamed from: translateY */
    public final float f47902x995d38cb;

    public C25747xb6308b4c(float f17, float f18, float f19, float f27, float f28) {
        this.f47899xc9de204e = f17;
        this.f47900xc9de204f = f18;
        this.f47901x995d38ca = f19;
        this.f47902x995d38cb = f27;
        this.f47898x5c296b27 = f28;
    }

    /* renamed from: instanceFromScale */
    public static com.p314xaae8f345.tav.p2957xa228aba5.C25747xb6308b4c m97307xd75f1eab(float f17, float f18) {
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25747xb6308b4c(f17, f18, 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: instanceFromTranslate */
    public static com.p314xaae8f345.tav.p2957xa228aba5.C25747xb6308b4c m97308x6ee16e2f(float f17, float f18) {
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25747xb6308b4c(1.0f, 1.0f, f17, f18, 0.0f);
    }

    /* renamed from: toMatrix */
    public android.graphics.Matrix m97309x8ace8a1c() {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postRotate(this.f47898x5c296b27);
        matrix.postScale(this.f47899xc9de204e, this.f47900xc9de204f);
        matrix.postTranslate(this.f47901x995d38ca, this.f47902x995d38cb);
        return matrix;
    }
}
