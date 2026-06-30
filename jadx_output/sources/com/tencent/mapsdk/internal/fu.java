package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class fu implements com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate {

    /* renamed from: a, reason: collision with root package name */
    public double f49467a;

    /* renamed from: b, reason: collision with root package name */
    public double f49468b;

    public fu() {
    }

    private com.tencent.mapsdk.internal.fu b(double d17, double d18) {
        return new com.tencent.mapsdk.internal.fu(this.f49467a + d17, this.f49468b + d18);
    }

    private com.tencent.mapsdk.internal.fu c(double d17, double d18) {
        return new com.tencent.mapsdk.internal.fu(this.f49467a - d17, this.f49468b - d18);
    }

    private com.tencent.mapsdk.internal.fu d(double d17, double d18) {
        return new com.tencent.mapsdk.internal.fu(this.f49467a * d17, this.f49468b * d18);
    }

    private static boolean e(double d17, double d18) {
        return java.lang.Double.compare(d17, d18) != 0 && java.lang.Math.abs(d17 - d18) > 1.0E-6d;
    }

    public final void a(double d17, double d18) {
        this.f49467a = d17;
        this.f49468b = d18;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.tencent.mapsdk.internal.fu) {
            com.tencent.mapsdk.internal.fu fuVar = (com.tencent.mapsdk.internal.fu) obj;
            if (!e(this.f49467a, fuVar.f49467a) && !e(this.f49468b, fuVar.f49468b)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate
    public final void setX(double d17) {
        this.f49467a = d17;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate
    public final void setY(double d17) {
        this.f49468b = d17;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate
    public final void setZ(double d17) {
    }

    public final java.lang.String toString() {
        return this.f49467a + "," + this.f49468b;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate
    public final double x() {
        return this.f49467a;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate
    public final double y() {
        return this.f49468b;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate
    public final double z() {
        return 0.0d;
    }

    public fu(double d17, double d18) {
        this.f49467a = d17;
        this.f49468b = d18;
    }

    private com.tencent.mapsdk.internal.fu b(com.tencent.mapsdk.internal.fu fuVar) {
        return new com.tencent.mapsdk.internal.fu(this.f49467a - fuVar.f49467a, this.f49468b - fuVar.f49468b);
    }

    private float c(com.tencent.mapsdk.internal.fu fuVar) {
        return fuVar.b(this).b();
    }

    private com.tencent.mapsdk.internal.fu d() {
        double b17 = 1.0d / b();
        return new com.tencent.mapsdk.internal.fu(this.f49467a * b17, this.f49468b * b17);
    }

    private boolean a() {
        double d17 = this.f49467a;
        if (d17 < 0.0d || d17 > 1.0d) {
            return false;
        }
        double d18 = this.f49468b;
        return d18 >= 0.0d && d18 <= 1.0d;
    }

    private com.tencent.mapsdk.internal.fu c() {
        double b17 = 1.0d / b();
        return new com.tencent.mapsdk.internal.fu(this.f49467a * b17, this.f49468b * b17);
    }

    private com.tencent.mapsdk.internal.fu a(com.tencent.mapsdk.internal.fu fuVar) {
        return new com.tencent.mapsdk.internal.fu(this.f49467a + fuVar.f49467a, this.f49468b + fuVar.f49468b);
    }

    private float b() {
        return (float) java.lang.Math.hypot(this.f49467a, this.f49468b);
    }

    private com.tencent.mapsdk.internal.fu a(double d17) {
        return new com.tencent.mapsdk.internal.fu(this.f49467a * d17, this.f49468b * d17);
    }

    private com.tencent.mapsdk.internal.fu a(int i17) {
        double d17 = this.f49467a;
        double d18 = this.f49468b;
        int i18 = 0;
        while (i18 < i17) {
            double d19 = -d17;
            i18++;
            d17 = d18;
            d18 = d19;
        }
        return new com.tencent.mapsdk.internal.fu(d17, d18);
    }

    private com.tencent.mapsdk.internal.fu a(float f17) {
        double d17 = f17;
        return new com.tencent.mapsdk.internal.fu((float) ((java.lang.Math.cos(d17) * this.f49467a) - (java.lang.Math.sin(d17) * this.f49468b)), (float) ((java.lang.Math.sin(d17) * this.f49467a) + (java.lang.Math.cos(d17) * this.f49468b)));
    }

    private com.tencent.mapsdk.internal.fu a(com.tencent.mapsdk.internal.fu fuVar, float f17) {
        com.tencent.mapsdk.internal.fu b17 = b(fuVar);
        double d17 = f17;
        com.tencent.mapsdk.internal.fu fuVar2 = new com.tencent.mapsdk.internal.fu((float) ((java.lang.Math.cos(d17) * b17.f49467a) - (java.lang.Math.sin(d17) * b17.f49468b)), (float) ((java.lang.Math.sin(d17) * b17.f49467a) + (java.lang.Math.cos(d17) * b17.f49468b)));
        return new com.tencent.mapsdk.internal.fu(fuVar2.f49467a + fuVar.f49467a, fuVar2.f49468b + fuVar.f49468b);
    }
}
