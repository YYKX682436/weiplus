package rh;

/* loaded from: classes12.dex */
public abstract class x2 extends rh.z2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Number f477085a;

    public x2(java.lang.Number number) {
        this.f477085a = number;
    }

    public static rh.x2 b(java.lang.Number number) {
        if (number instanceof java.lang.Integer) {
            return new rh.v2((java.lang.Integer) number);
        }
        if (number instanceof java.lang.Long) {
            return new rh.w2((java.lang.Long) number);
        }
        if (number instanceof java.lang.Float) {
            return new rh.u2((java.lang.Float) number);
        }
        if (number instanceof java.lang.Double) {
            return new rh.t2((java.lang.Double) number);
        }
        throw new java.lang.RuntimeException("unsupported digit: " + number.getClass());
    }

    public abstract java.lang.Number a(java.lang.Number number);

    /* renamed from: equals */
    public boolean m162378xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f477085a.equals(((rh.x2) obj).f477085a);
    }

    /* renamed from: hashCode */
    public int m162379x8cdac1b() {
        return java.util.Objects.hash(this.f477085a);
    }

    /* renamed from: toString */
    public java.lang.String m162380x9616526c() {
        return java.lang.String.valueOf(this.f477085a);
    }
}
