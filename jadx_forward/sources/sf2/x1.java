package sf2;

/* loaded from: classes8.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f488887a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.gy1 f488888b;

    public x1(boolean z17, r45.gy1 gy1Var) {
        this.f488887a = z17;
        this.f488888b = gy1Var;
    }

    /* renamed from: equals */
    public boolean m164395xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf2.x1)) {
            return false;
        }
        sf2.x1 x1Var = (sf2.x1) obj;
        return this.f488887a == x1Var.f488887a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f488888b, x1Var.f488888b);
    }

    /* renamed from: hashCode */
    public int m164396x8cdac1b() {
        int hashCode = java.lang.Boolean.hashCode(this.f488887a) * 31;
        r45.gy1 gy1Var = this.f488888b;
        return hashCode + (gy1Var == null ? 0 : gy1Var.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m164397x9616526c() {
        return "ModSongExtraInfo(onlySingSegment=" + this.f488887a + ", segmentInfo=" + this.f488888b + ')';
    }
}
