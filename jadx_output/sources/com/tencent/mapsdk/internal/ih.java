package com.tencent.mapsdk.internal;

/* loaded from: classes16.dex */
public final class ih extends com.tencent.mapsdk.internal.ig {

    /* renamed from: k, reason: collision with root package name */
    private long f49894k;

    /* renamed from: l, reason: collision with root package name */
    private long f49895l;

    private ih(float f17, float f18, float f19, float f27, long j17, long j18) {
        super(f17, f18, f19, f27, j17 + j18);
        this.f49894k = j17;
        this.f49895l = j18;
    }

    @Override // com.tencent.mapsdk.internal.ig, com.tencent.mapsdk.internal.id
    public final void a(javax.microedition.khronos.opengles.GL10 gl10, long j17) {
        float f17;
        float f18;
        float f19 = ((com.tencent.mapsdk.internal.ig) this).f49891h;
        float f27 = ((com.tencent.mapsdk.internal.ig) this).f49890g;
        float f28 = f19 - f27;
        float f29 = this.f49893j;
        float f37 = ((com.tencent.mapsdk.internal.ig) this).f49892i;
        float f38 = f29 - f37;
        long j18 = this.f49894k;
        if (j17 < j18) {
            float f39 = (float) j17;
            f17 = f27 + ((f28 * f39) / ((float) j18));
            f18 = f37 + ((f38 * f39) / ((float) j18));
        } else {
            float f47 = (float) (j17 - j18);
            long j19 = this.f49895l;
            f17 = f19 - ((f28 * f47) / ((float) j19));
            f18 = f29 - ((f38 * f47) / ((float) j19));
        }
        gl10.glScalef(f17, f18, 1.0f);
    }
}
