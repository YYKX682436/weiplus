package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes16.dex */
public final class ie extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.id {

    /* renamed from: g, reason: collision with root package name */
    private float f131420g;

    /* renamed from: h, reason: collision with root package name */
    private float f131421h;

    private ie(float f17, float f18, long j17) {
        super(j17);
        this.f131420g = f17;
        this.f131421h = f18;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.id
    public final void a(javax.microedition.khronos.opengles.GL10 gl10, long j17) {
        float f17 = this.f131421h;
        float f18 = this.f131420g;
        float f19 = f18 + (((f17 - f18) * ((float) j17)) / ((float) this.f131415e));
        gl10.glColor4f(f19, f19, f19, f19);
    }
}
