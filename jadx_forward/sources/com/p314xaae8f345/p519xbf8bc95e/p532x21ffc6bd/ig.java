package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes16.dex */
public class ig extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.id {

    /* renamed from: g, reason: collision with root package name */
    protected float f131423g;

    /* renamed from: h, reason: collision with root package name */
    protected float f131424h;

    /* renamed from: i, reason: collision with root package name */
    protected float f131425i;

    /* renamed from: j, reason: collision with root package name */
    protected float f131426j;

    public ig(float f17, float f18, float f19, float f27, long j17) {
        super(j17);
        this.f131423g = f17;
        this.f131424h = f18;
        this.f131425i = f19;
        this.f131426j = f27;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.id
    public void a(javax.microedition.khronos.opengles.GL10 gl10, long j17) {
        float f17 = this.f131424h;
        float f18 = this.f131423g;
        float f19 = this.f131426j;
        float f27 = this.f131425i;
        float f28 = (float) j17;
        long j18 = this.f131415e;
        gl10.glScalef(f18 + (((f17 - f18) * f28) / ((float) j18)), f27 + (((f19 - f27) * f28) / ((float) j18)), 1.0f);
    }
}
