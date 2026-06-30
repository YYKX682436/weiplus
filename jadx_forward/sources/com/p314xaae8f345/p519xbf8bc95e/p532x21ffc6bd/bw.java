package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class bw implements com.tencent.mapsdk.internal.gd.a {

    /* renamed from: a, reason: collision with root package name */
    public static final double f130581a = 1.0d;

    /* renamed from: d, reason: collision with root package name */
    private static final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gg f130582d = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gg(1.0d);

    /* renamed from: b, reason: collision with root package name */
    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu f130583b;

    /* renamed from: c, reason: collision with root package name */
    double f130584c;

    public bw(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, double d17) {
        this.f130583b = f130582d.d(c26041x873d1d26);
        if (d17 >= 0.0d) {
            this.f130584c = d17;
        } else {
            this.f130584c = 1.0d;
        }
    }

    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 b() {
        return f130582d.b(this.f130583b);
    }

    private double c() {
        return this.f130584c;
    }

    @Override // com.tencent.mapsdk.internal.gd.a
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a() {
        return this.f130583b;
    }

    private void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        this.f130583b = f130582d.d(c26041x873d1d26);
    }

    private void a(double d17) {
        if (d17 >= 0.0d) {
            this.f130584c = d17;
        } else {
            this.f130584c = 1.0d;
        }
    }

    public bw(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        this(c26041x873d1d26, 1.0d);
    }
}
