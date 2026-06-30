package bu2;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f24540a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f24541b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f24542c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f24543d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f24544e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.uy0 f24545f;

    /* renamed from: g, reason: collision with root package name */
    public final r45.xq2 f24546g;

    /* renamed from: h, reason: collision with root package name */
    public final r45.vy0 f24547h;

    public l(int i17, com.tencent.mm.protobuf.g gVar, boolean z17, boolean z18, boolean z19, r45.uy0 uy0Var, r45.xq2 xq2Var, r45.vy0 vy0Var) {
        this.f24540a = i17;
        this.f24541b = gVar;
        this.f24542c = z17;
        this.f24543d = z18;
        this.f24544e = z19;
        this.f24545f = uy0Var;
        this.f24546g = xq2Var;
        this.f24547h = vy0Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu2.l)) {
            return false;
        }
        bu2.l lVar = (bu2.l) obj;
        return this.f24540a == lVar.f24540a && kotlin.jvm.internal.o.b(this.f24541b, lVar.f24541b) && this.f24542c == lVar.f24542c && this.f24543d == lVar.f24543d && this.f24544e == lVar.f24544e && kotlin.jvm.internal.o.b(this.f24545f, lVar.f24545f) && kotlin.jvm.internal.o.b(this.f24546g, lVar.f24546g) && kotlin.jvm.internal.o.b(this.f24547h, lVar.f24547h);
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f24540a) * 31;
        com.tencent.mm.protobuf.g gVar = this.f24541b;
        int hashCode2 = (((((((hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f24542c)) * 31) + java.lang.Boolean.hashCode(this.f24543d)) * 31) + java.lang.Boolean.hashCode(this.f24544e)) * 31;
        r45.uy0 uy0Var = this.f24545f;
        int hashCode3 = (hashCode2 + (uy0Var == null ? 0 : uy0Var.hashCode())) * 31;
        r45.xq2 xq2Var = this.f24546g;
        int hashCode4 = (hashCode3 + (xq2Var == null ? 0 : xq2Var.hashCode())) * 31;
        r45.vy0 vy0Var = this.f24547h;
        return hashCode4 + (vy0Var != null ? vy0Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "Extra(pos=" + this.f24540a + ", lastBuffer=" + this.f24541b + ", upContinue=" + this.f24542c + ", downContinue=" + this.f24543d + ", hasExpand=" + this.f24544e + ", promptInfo=" + this.f24545f + ", presentHalfSheetInfo=" + this.f24546g + ", sortCtrl=" + this.f24547h + ')';
    }
}
