package com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a;

/* renamed from: com.tencent.maas.moviecomposing.layout.OffsetRange */
/* loaded from: classes5.dex */
public class C4176xaeba704a {

    /* renamed from: a, reason: collision with root package name */
    public final double f130042a;

    /* renamed from: b, reason: collision with root package name */
    public final double f130043b;

    public C4176xaeba704a(double d17, double d18) {
        this.f130042a = d17;
        this.f130043b = d18;
    }

    public static com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a c() {
        return new com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a(0.0d, 0.0d);
    }

    public boolean a() {
        return java.lang.Double.compare(this.f130042a, 0.0d) == 0 && java.lang.Double.compare(this.f130043b, 0.0d) == 0;
    }

    public com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a b() {
        double d17 = this.f130042a;
        double d18 = 0.0d;
        if (java.lang.Double.isNaN(d17)) {
            d17 = 0.0d;
        }
        double d19 = this.f130043b;
        if (!java.lang.Double.isNaN(d19) && d19 >= 0.0d) {
            d18 = d19;
        }
        return new com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a(d17, d18);
    }

    /* renamed from: equals */
    public boolean m34327xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a c4176xaeba704a = (com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a) obj;
        return java.lang.Double.compare(c4176xaeba704a.f130042a, this.f130042a) == 0 && java.lang.Double.compare(c4176xaeba704a.f130043b, this.f130043b) == 0;
    }

    /* renamed from: hashCode */
    public int m34328x8cdac1b() {
        return java.util.Objects.hash(java.lang.Double.valueOf(this.f130042a), java.lang.Double.valueOf(this.f130043b));
    }

    /* renamed from: toString */
    public java.lang.String m34329x9616526c() {
        return "OffsetRange{location=" + this.f130042a + ", length=" + this.f130043b + '}';
    }
}
