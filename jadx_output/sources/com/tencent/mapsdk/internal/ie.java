package com.tencent.mapsdk.internal;

/* loaded from: classes16.dex */
public final class ie extends com.tencent.mapsdk.internal.id {

    /* renamed from: g, reason: collision with root package name */
    private float f49887g;

    /* renamed from: h, reason: collision with root package name */
    private float f49888h;

    private ie(float f17, float f18, long j17) {
        super(j17);
        this.f49887g = f17;
        this.f49888h = f18;
    }

    @Override // com.tencent.mapsdk.internal.id
    public final void a(javax.microedition.khronos.opengles.GL10 gl10, long j17) {
        float f17 = this.f49888h;
        float f18 = this.f49887g;
        float f19 = f18 + (((f17 - f18) * ((float) j17)) / ((float) this.f49882e));
        gl10.glColor4f(f19, f19, f19, f19);
    }
}
