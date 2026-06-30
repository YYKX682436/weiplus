package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class ft {

    /* renamed from: a, reason: collision with root package name */
    public final double f49461a;

    /* renamed from: b, reason: collision with root package name */
    public final double f49462b;

    /* renamed from: c, reason: collision with root package name */
    public final double f49463c;

    /* renamed from: d, reason: collision with root package name */
    public final double f49464d;

    /* renamed from: e, reason: collision with root package name */
    public final double f49465e;

    /* renamed from: f, reason: collision with root package name */
    public final double f49466f;

    public ft(double d17, double d18, double d19, double d27) {
        this.f49461a = d17;
        this.f49462b = d19;
        this.f49463c = d18;
        this.f49464d = d27;
        this.f49465e = (d17 + d18) / 2.0d;
        this.f49466f = (d19 + d27) / 2.0d;
    }

    private boolean b(com.tencent.mapsdk.internal.ft ftVar) {
        return ftVar.f49461a >= this.f49461a && ftVar.f49463c <= this.f49463c && ftVar.f49462b >= this.f49462b && ftVar.f49464d <= this.f49464d;
    }

    public final boolean a(double d17, double d18) {
        return this.f49461a <= d17 && d17 <= this.f49463c && this.f49462b <= d18 && d18 <= this.f49464d;
    }

    public final java.lang.String toString() {
        return "Bounds{minX=" + this.f49461a + ", minY=" + this.f49462b + ", maxX=" + this.f49463c + ", maxY=" + this.f49464d + '}';
    }

    private boolean a(com.tencent.mapsdk.internal.fu fuVar) {
        return a(fuVar.f49467a, fuVar.f49468b);
    }

    private boolean a(double d17, double d18, double d19, double d27) {
        return d17 < this.f49463c && this.f49461a < d18 && d19 < this.f49464d && this.f49462b < d27;
    }

    public final boolean a(com.tencent.mapsdk.internal.ft ftVar) {
        return a(ftVar.f49461a, ftVar.f49463c, ftVar.f49462b, ftVar.f49464d);
    }
}
