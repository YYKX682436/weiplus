package bu2;

/* loaded from: classes2.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f24504a;

    /* renamed from: b, reason: collision with root package name */
    public bq.z1 f24505b;

    /* renamed from: c, reason: collision with root package name */
    public r45.s13 f24506c;

    /* renamed from: d, reason: collision with root package name */
    public r45.nb1 f24507d;

    public f0(long j17, bq.z1 z1Var, r45.s13 s13Var, r45.nb1 nb1Var, int i17, kotlin.jvm.internal.i iVar) {
        j17 = (i17 & 1) != 0 ? java.lang.System.currentTimeMillis() : j17;
        z1Var = (i17 & 2) != 0 ? null : z1Var;
        s13Var = (i17 & 4) != 0 ? null : s13Var;
        nb1Var = (i17 & 8) != 0 ? null : nb1Var;
        this.f24504a = j17;
        this.f24505b = z1Var;
        this.f24506c = s13Var;
        this.f24507d = nb1Var;
    }

    public final bq.z1 a() {
        return this.f24505b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu2.f0)) {
            return false;
        }
        bu2.f0 f0Var = (bu2.f0) obj;
        return this.f24504a == f0Var.f24504a && kotlin.jvm.internal.o.b(this.f24505b, f0Var.f24505b) && kotlin.jvm.internal.o.b(this.f24506c, f0Var.f24506c) && kotlin.jvm.internal.o.b(this.f24507d, f0Var.f24507d);
    }

    public int hashCode() {
        int hashCode = java.lang.Long.hashCode(this.f24504a) * 31;
        bq.z1 z1Var = this.f24505b;
        int hashCode2 = (hashCode + (z1Var == null ? 0 : z1Var.hashCode())) * 31;
        r45.s13 s13Var = this.f24506c;
        int hashCode3 = (hashCode2 + (s13Var == null ? 0 : s13Var.hashCode())) * 31;
        r45.nb1 nb1Var = this.f24507d;
        return hashCode3 + (nb1Var != null ? nb1Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "CacheData(cacheTime=" + this.f24504a + ", userPage=" + this.f24505b + ", pageHeader=" + this.f24506c + ", homePage=" + this.f24507d + ')';
    }
}
