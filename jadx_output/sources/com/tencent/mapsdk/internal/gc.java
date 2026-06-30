package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class gc implements com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate, java.lang.Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public static final double f49563a = 2.003750834E7d;

    /* renamed from: b, reason: collision with root package name */
    public double f49564b = Double.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public double f49565c = Double.MIN_VALUE;

    public gc(double d17, double d18) {
        setX(d17);
        setY(d18);
    }

    private double a() {
        return this.f49564b;
    }

    private double b() {
        return this.f49565c;
    }

    private com.tencent.mapsdk.internal.gc c() {
        return new com.tencent.mapsdk.internal.gc(this.f49565c, this.f49564b);
    }

    public final /* synthetic */ java.lang.Object clone() {
        return new com.tencent.mapsdk.internal.gc(this.f49565c, this.f49564b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj.hashCode() != hashCode() || !(obj instanceof com.tencent.mapsdk.internal.gc)) {
            return false;
        }
        com.tencent.mapsdk.internal.gc gcVar = (com.tencent.mapsdk.internal.gc) obj;
        return java.lang.Double.doubleToLongBits(gcVar.f49565c) == java.lang.Double.doubleToLongBits(this.f49565c) && java.lang.Double.doubleToLongBits(gcVar.f49564b) == java.lang.Double.doubleToLongBits(this.f49564b);
    }

    public final int hashCode() {
        long doubleToLongBits = java.lang.Double.doubleToLongBits(this.f49565c);
        long doubleToLongBits2 = java.lang.Double.doubleToLongBits(this.f49564b);
        return ((((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32))) + 31) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate
    public final void setX(double d17) {
        this.f49565c = java.lang.Math.max(-2.003750834E7d, java.lang.Math.min(2.003750834E7d, d17));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate
    public final void setY(double d17) {
        this.f49564b = java.lang.Math.max(-2.003750834E7d, java.lang.Math.min(2.003750834E7d, d17));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate
    public final void setZ(double d17) {
    }

    public final java.lang.String toString() {
        return "x=" + this.f49565c + ",y=" + this.f49564b;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate
    public final double x() {
        return this.f49565c;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate
    public final double y() {
        return this.f49564b;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate
    public final double z() {
        return 0.0d;
    }
}
