package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes16.dex */
public final class ij extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.id {

    /* renamed from: g, reason: collision with root package name */
    private float f131430g;

    /* renamed from: h, reason: collision with root package name */
    private float f131431h;

    /* renamed from: i, reason: collision with root package name */
    private float f131432i;

    /* renamed from: j, reason: collision with root package name */
    private float f131433j;

    private ij(float f17, float f18, float f19, float f27, long j17) {
        super(j17);
        this.f131430g = f17;
        this.f131431h = f18;
        this.f131432i = f19;
        this.f131433j = f27;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.id
    public final void a(javax.microedition.khronos.opengles.GL10 gl10, long j17) {
        float f17 = this.f131431h;
        float f18 = this.f131430g;
        float f19 = this.f131433j;
        float f27 = this.f131432i;
        float f28 = (float) j17;
        long j18 = this.f131415e;
        gl10.glTranslatef(f18 + (((f17 - f18) * f28) / ((float) j18)), f27 + (((f19 - f27) * f28) / ((float) j18)), 0.0f);
    }
}
