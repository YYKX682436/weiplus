package com.tencent.mapsdk.internal;

/* loaded from: classes16.dex */
public final class ij extends com.tencent.mapsdk.internal.id {

    /* renamed from: g, reason: collision with root package name */
    private float f49897g;

    /* renamed from: h, reason: collision with root package name */
    private float f49898h;

    /* renamed from: i, reason: collision with root package name */
    private float f49899i;

    /* renamed from: j, reason: collision with root package name */
    private float f49900j;

    private ij(float f17, float f18, float f19, float f27, long j17) {
        super(j17);
        this.f49897g = f17;
        this.f49898h = f18;
        this.f49899i = f19;
        this.f49900j = f27;
    }

    @Override // com.tencent.mapsdk.internal.id
    public final void a(javax.microedition.khronos.opengles.GL10 gl10, long j17) {
        float f17 = this.f49898h;
        float f18 = this.f49897g;
        float f19 = this.f49900j;
        float f27 = this.f49899i;
        float f28 = (float) j17;
        long j18 = this.f49882e;
        gl10.glTranslatef(f18 + (((f17 - f18) * f28) / ((float) j18)), f27 + (((f19 - f27) * f28) / ((float) j18)), 0.0f);
    }
}
