package bm2;

/* loaded from: classes10.dex */
public final class v6 {

    /* renamed from: a, reason: collision with root package name */
    public final bm2.w6 f22387a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.yx1 f22388b;

    /* renamed from: c, reason: collision with root package name */
    public final bm2.u6 f22389c;

    public v6(bm2.w6 type, r45.yx1 yx1Var, bm2.u6 u6Var, int i17, kotlin.jvm.internal.i iVar) {
        yx1Var = (i17 & 2) != 0 ? null : yx1Var;
        u6Var = (i17 & 4) != 0 ? null : u6Var;
        kotlin.jvm.internal.o.g(type, "type");
        this.f22387a = type;
        this.f22388b = yx1Var;
        this.f22389c = u6Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm2.v6)) {
            return false;
        }
        bm2.v6 v6Var = (bm2.v6) obj;
        return this.f22387a == v6Var.f22387a && kotlin.jvm.internal.o.b(this.f22388b, v6Var.f22388b) && this.f22389c == v6Var.f22389c;
    }

    public int hashCode() {
        int hashCode = this.f22387a.hashCode() * 31;
        r45.yx1 yx1Var = this.f22388b;
        int hashCode2 = (hashCode + (yx1Var == null ? 0 : yx1Var.hashCode())) * 31;
        bm2.u6 u6Var = this.f22389c;
        return hashCode2 + (u6Var != null ? u6Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "SongPlayListItem(type=" + this.f22387a + ", song=" + this.f22388b + ", headerType=" + this.f22389c + ')';
    }
}
