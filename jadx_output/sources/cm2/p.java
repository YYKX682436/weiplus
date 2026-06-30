package cm2;

/* loaded from: classes3.dex */
public final class p implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final int f43373d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.x63 f43374e;

    /* renamed from: f, reason: collision with root package name */
    public hq0.e0 f43375f;

    /* renamed from: g, reason: collision with root package name */
    public final r45.xq1 f43376g;

    /* renamed from: h, reason: collision with root package name */
    public r45.fr1 f43377h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f43378i;

    public p(int i17, r45.x63 x63Var, hq0.e0 e0Var, r45.xq1 xq1Var, r45.fr1 fr1Var, java.lang.String str, int i18, kotlin.jvm.internal.i iVar) {
        x63Var = (i18 & 2) != 0 ? null : x63Var;
        e0Var = (i18 & 4) != 0 ? null : e0Var;
        xq1Var = (i18 & 8) != 0 ? null : xq1Var;
        fr1Var = (i18 & 16) != 0 ? null : fr1Var;
        str = (i18 & 32) != 0 ? null : str;
        this.f43373d = i17;
        this.f43374e = x63Var;
        this.f43375f = e0Var;
        this.f43376g = xq1Var;
        this.f43377h = fr1Var;
        this.f43378i = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cm2.p)) {
            return false;
        }
        cm2.p pVar = (cm2.p) obj;
        return this.f43373d == pVar.f43373d && kotlin.jvm.internal.o.b(this.f43374e, pVar.f43374e) && kotlin.jvm.internal.o.b(this.f43375f, pVar.f43375f) && kotlin.jvm.internal.o.b(this.f43376g, pVar.f43376g) && kotlin.jvm.internal.o.b(this.f43377h, pVar.f43377h) && kotlin.jvm.internal.o.b(this.f43378i, pVar.f43378i);
    }

    @Override // in5.c
    public long getItemId() {
        return 0L;
    }

    @Override // in5.c
    public int h() {
        return this.f43373d;
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f43373d) * 31;
        r45.x63 x63Var = this.f43374e;
        int hashCode2 = (hashCode + (x63Var == null ? 0 : x63Var.hashCode())) * 31;
        hq0.e0 e0Var = this.f43375f;
        int hashCode3 = (hashCode2 + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        r45.xq1 xq1Var = this.f43376g;
        int hashCode4 = (hashCode3 + (xq1Var == null ? 0 : xq1Var.hashCode())) * 31;
        r45.fr1 fr1Var = this.f43377h;
        int hashCode5 = (hashCode4 + (fr1Var == null ? 0 : fr1Var.hashCode())) * 31;
        java.lang.String str = this.f43378i;
        return hashCode5 + (str != null ? str.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "GameTogetherItem(type=" + this.f43373d + ", cardInfo=" + this.f43374e + ", cardRoot=" + this.f43375f + ", anchorTeamInfo=" + this.f43376g + ", visitorTeamInfo=" + this.f43377h + ", wording=" + this.f43378i + ')';
    }
}
