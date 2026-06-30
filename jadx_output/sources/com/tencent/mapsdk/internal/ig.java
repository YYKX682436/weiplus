package com.tencent.mapsdk.internal;

/* loaded from: classes16.dex */
public class ig extends com.tencent.mapsdk.internal.id {

    /* renamed from: g, reason: collision with root package name */
    protected float f49890g;

    /* renamed from: h, reason: collision with root package name */
    protected float f49891h;

    /* renamed from: i, reason: collision with root package name */
    protected float f49892i;

    /* renamed from: j, reason: collision with root package name */
    protected float f49893j;

    public ig(float f17, float f18, float f19, float f27, long j17) {
        super(j17);
        this.f49890g = f17;
        this.f49891h = f18;
        this.f49892i = f19;
        this.f49893j = f27;
    }

    @Override // com.tencent.mapsdk.internal.id
    public void a(javax.microedition.khronos.opengles.GL10 gl10, long j17) {
        float f17 = this.f49891h;
        float f18 = this.f49890g;
        float f19 = this.f49893j;
        float f27 = this.f49892i;
        float f28 = (float) j17;
        long j18 = this.f49882e;
        gl10.glScalef(f18 + (((f17 - f18) * f28) / ((float) j18)), f27 + (((f19 - f27) * f28) / ((float) j18)), 1.0f);
    }
}
