package gq1;

/* loaded from: classes13.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public gq1.d f356027a = null;

    /* renamed from: b, reason: collision with root package name */
    public double f356028b = 0.0d;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f356029c = "";

    /* renamed from: equals */
    public boolean m132006xb2c87fbf(java.lang.Object obj) {
        gq1.d dVar = this.f356027a;
        if (dVar == null || obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return java.util.Arrays.equals(((gq1.b) obj).f356027a.f356033b.f356070c, dVar.f356033b.f356070c);
    }

    /* renamed from: hashCode */
    public int m132007x8cdac1b() {
        gq1.d dVar = this.f356027a;
        if (dVar == null) {
            return 0;
        }
        return java.util.Arrays.hashCode(dVar.f356033b.f356070c);
    }
}
