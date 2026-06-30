package e06;

/* loaded from: classes5.dex */
public final class d implements e06.f {

    /* renamed from: d, reason: collision with root package name */
    public final double f327738d;

    /* renamed from: e, reason: collision with root package name */
    public final double f327739e;

    public d(double d17, double d18) {
        this.f327738d = d17;
        this.f327739e = d18;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e06.f
    public boolean d(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
        return ((java.lang.Number) comparable).doubleValue() <= ((java.lang.Number) comparable2).doubleValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e06.h
    public boolean e(java.lang.Comparable comparable) {
        double doubleValue = ((java.lang.Number) comparable).doubleValue();
        return doubleValue >= this.f327738d && doubleValue <= this.f327739e;
    }

    /* renamed from: equals */
    public boolean m126617xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof e06.d)) {
            return false;
        }
        if (!mo126615x7aab3243() || !((e06.d) obj).mo126615x7aab3243()) {
            e06.d dVar = (e06.d) obj;
            if (!(this.f327738d == dVar.f327738d)) {
                return false;
            }
            if (!(this.f327739e == dVar.f327739e)) {
                return false;
            }
        }
        return true;
    }

    @Override // e06.h
    public java.lang.Comparable g() {
        return java.lang.Double.valueOf(this.f327739e);
    }

    @Override // e06.h
    public java.lang.Comparable h() {
        return java.lang.Double.valueOf(this.f327738d);
    }

    /* renamed from: hashCode */
    public int m126618x8cdac1b() {
        if (mo126615x7aab3243()) {
            return -1;
        }
        return (java.lang.Double.hashCode(this.f327738d) * 31) + java.lang.Double.hashCode(this.f327739e);
    }

    @Override // e06.h
    /* renamed from: isEmpty */
    public boolean mo126615x7aab3243() {
        return this.f327738d > this.f327739e;
    }

    /* renamed from: toString */
    public java.lang.String m126619x9616526c() {
        return this.f327738d + ".." + this.f327739e;
    }
}
