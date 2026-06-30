package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes16.dex */
public final class ih extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ig {

    /* renamed from: k, reason: collision with root package name */
    private long f131427k;

    /* renamed from: l, reason: collision with root package name */
    private long f131428l;

    private ih(float f17, float f18, float f19, float f27, long j17, long j18) {
        super(f17, f18, f19, f27, j17 + j18);
        this.f131427k = j17;
        this.f131428l = j18;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ig, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.id
    public final void a(javax.microedition.khronos.opengles.GL10 gl10, long j17) {
        float f17;
        float f18;
        float f19 = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ig) this).f131424h;
        float f27 = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ig) this).f131423g;
        float f28 = f19 - f27;
        float f29 = this.f131426j;
        float f37 = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ig) this).f131425i;
        float f38 = f29 - f37;
        long j18 = this.f131427k;
        if (j17 < j18) {
            float f39 = (float) j17;
            f17 = f27 + ((f28 * f39) / ((float) j18));
            f18 = f37 + ((f38 * f39) / ((float) j18));
        } else {
            float f47 = (float) (j17 - j18);
            long j19 = this.f131428l;
            f17 = f19 - ((f28 * f47) / ((float) j19));
            f18 = f29 - ((f38 * f47) / ((float) j19));
        }
        gl10.glScalef(f17, f18, 1.0f);
    }
}
