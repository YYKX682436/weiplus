package bm2;

/* loaded from: classes3.dex */
public final class t2 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.fq1 f103840a;

    public t2(r45.fq1 fq1Var, int i17) {
        this.f103840a = fq1Var;
    }

    /* renamed from: equals */
    public boolean m10771xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bm2.t2) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f103840a, ((bm2.t2) obj).f103840a);
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m10772x8cdac1b() {
        r45.fq1 fq1Var = this.f103840a;
        return ((fq1Var == null ? 0 : fq1Var.hashCode()) * 31) + java.lang.Integer.hashCode(1);
    }

    /* renamed from: toString */
    public java.lang.String m10773x9616526c() {
        return "FinderLiveContactInfo(contact=" + this.f103840a + ", type=1)";
    }
}
