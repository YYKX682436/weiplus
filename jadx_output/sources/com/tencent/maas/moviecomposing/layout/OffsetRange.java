package com.tencent.maas.moviecomposing.layout;

/* loaded from: classes5.dex */
public class OffsetRange {

    /* renamed from: a, reason: collision with root package name */
    public final double f48509a;

    /* renamed from: b, reason: collision with root package name */
    public final double f48510b;

    public OffsetRange(double d17, double d18) {
        this.f48509a = d17;
        this.f48510b = d18;
    }

    public static com.tencent.maas.moviecomposing.layout.OffsetRange c() {
        return new com.tencent.maas.moviecomposing.layout.OffsetRange(0.0d, 0.0d);
    }

    public boolean a() {
        return java.lang.Double.compare(this.f48509a, 0.0d) == 0 && java.lang.Double.compare(this.f48510b, 0.0d) == 0;
    }

    public com.tencent.maas.moviecomposing.layout.OffsetRange b() {
        double d17 = this.f48509a;
        double d18 = 0.0d;
        if (java.lang.Double.isNaN(d17)) {
            d17 = 0.0d;
        }
        double d19 = this.f48510b;
        if (!java.lang.Double.isNaN(d19) && d19 >= 0.0d) {
            d18 = d19;
        }
        return new com.tencent.maas.moviecomposing.layout.OffsetRange(d17, d18);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.tencent.maas.moviecomposing.layout.OffsetRange offsetRange = (com.tencent.maas.moviecomposing.layout.OffsetRange) obj;
        return java.lang.Double.compare(offsetRange.f48509a, this.f48509a) == 0 && java.lang.Double.compare(offsetRange.f48510b, this.f48510b) == 0;
    }

    public int hashCode() {
        return java.util.Objects.hash(java.lang.Double.valueOf(this.f48509a), java.lang.Double.valueOf(this.f48510b));
    }

    public java.lang.String toString() {
        return "OffsetRange{location=" + this.f48509a + ", length=" + this.f48510b + '}';
    }
}
