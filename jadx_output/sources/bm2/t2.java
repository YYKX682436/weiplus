package bm2;

/* loaded from: classes3.dex */
public final class t2 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.fq1 f22307a;

    public t2(r45.fq1 fq1Var, int i17) {
        this.f22307a = fq1Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bm2.t2) {
            return kotlin.jvm.internal.o.b(this.f22307a, ((bm2.t2) obj).f22307a);
        }
        return false;
    }

    public int hashCode() {
        r45.fq1 fq1Var = this.f22307a;
        return ((fq1Var == null ? 0 : fq1Var.hashCode()) * 31) + java.lang.Integer.hashCode(1);
    }

    public java.lang.String toString() {
        return "FinderLiveContactInfo(contact=" + this.f22307a + ", type=1)";
    }
}
