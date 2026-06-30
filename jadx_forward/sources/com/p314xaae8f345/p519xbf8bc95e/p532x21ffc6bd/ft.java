package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class ft {

    /* renamed from: a, reason: collision with root package name */
    public final double f130994a;

    /* renamed from: b, reason: collision with root package name */
    public final double f130995b;

    /* renamed from: c, reason: collision with root package name */
    public final double f130996c;

    /* renamed from: d, reason: collision with root package name */
    public final double f130997d;

    /* renamed from: e, reason: collision with root package name */
    public final double f130998e;

    /* renamed from: f, reason: collision with root package name */
    public final double f130999f;

    public ft(double d17, double d18, double d19, double d27) {
        this.f130994a = d17;
        this.f130995b = d19;
        this.f130996c = d18;
        this.f130997d = d27;
        this.f130998e = (d17 + d18) / 2.0d;
        this.f130999f = (d19 + d27) / 2.0d;
    }

    private boolean b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ft ftVar) {
        return ftVar.f130994a >= this.f130994a && ftVar.f130996c <= this.f130996c && ftVar.f130995b >= this.f130995b && ftVar.f130997d <= this.f130997d;
    }

    public final boolean a(double d17, double d18) {
        return this.f130994a <= d17 && d17 <= this.f130996c && this.f130995b <= d18 && d18 <= this.f130997d;
    }

    /* renamed from: toString */
    public final java.lang.String m36730x9616526c() {
        return "Bounds{minX=" + this.f130994a + ", minY=" + this.f130995b + ", maxX=" + this.f130996c + ", maxY=" + this.f130997d + '}';
    }

    private boolean a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu fuVar) {
        return a(fuVar.f131000a, fuVar.f131001b);
    }

    private boolean a(double d17, double d18, double d19, double d27) {
        return d17 < this.f130996c && this.f130994a < d18 && d19 < this.f130997d && this.f130995b < d27;
    }

    public final boolean a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ft ftVar) {
        return a(ftVar.f130994a, ftVar.f130996c, ftVar.f130995b, ftVar.f130997d);
    }
}
