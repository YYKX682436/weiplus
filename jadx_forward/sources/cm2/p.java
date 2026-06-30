package cm2;

/* loaded from: classes3.dex */
public final class p implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final int f124906d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.x63 f124907e;

    /* renamed from: f, reason: collision with root package name */
    public hq0.e0 f124908f;

    /* renamed from: g, reason: collision with root package name */
    public final r45.xq1 f124909g;

    /* renamed from: h, reason: collision with root package name */
    public r45.fr1 f124910h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f124911i;

    public p(int i17, r45.x63 x63Var, hq0.e0 e0Var, r45.xq1 xq1Var, r45.fr1 fr1Var, java.lang.String str, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        x63Var = (i18 & 2) != 0 ? null : x63Var;
        e0Var = (i18 & 4) != 0 ? null : e0Var;
        xq1Var = (i18 & 8) != 0 ? null : xq1Var;
        fr1Var = (i18 & 16) != 0 ? null : fr1Var;
        str = (i18 & 32) != 0 ? null : str;
        this.f124906d = i17;
        this.f124907e = x63Var;
        this.f124908f = e0Var;
        this.f124909g = xq1Var;
        this.f124910h = fr1Var;
        this.f124911i = str;
    }

    /* renamed from: equals */
    public boolean m15300xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cm2.p)) {
            return false;
        }
        cm2.p pVar = (cm2.p) obj;
        return this.f124906d == pVar.f124906d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f124907e, pVar.f124907e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f124908f, pVar.f124908f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f124909g, pVar.f124909g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f124910h, pVar.f124910h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f124911i, pVar.f124911i);
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return 0L;
    }

    @Override // in5.c
    public int h() {
        return this.f124906d;
    }

    /* renamed from: hashCode */
    public int m15301x8cdac1b() {
        int hashCode = java.lang.Integer.hashCode(this.f124906d) * 31;
        r45.x63 x63Var = this.f124907e;
        int hashCode2 = (hashCode + (x63Var == null ? 0 : x63Var.hashCode())) * 31;
        hq0.e0 e0Var = this.f124908f;
        int hashCode3 = (hashCode2 + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        r45.xq1 xq1Var = this.f124909g;
        int hashCode4 = (hashCode3 + (xq1Var == null ? 0 : xq1Var.hashCode())) * 31;
        r45.fr1 fr1Var = this.f124910h;
        int hashCode5 = (hashCode4 + (fr1Var == null ? 0 : fr1Var.hashCode())) * 31;
        java.lang.String str = this.f124911i;
        return hashCode5 + (str != null ? str.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m15302x9616526c() {
        return "GameTogetherItem(type=" + this.f124906d + ", cardInfo=" + this.f124907e + ", cardRoot=" + this.f124908f + ", anchorTeamInfo=" + this.f124909g + ", visitorTeamInfo=" + this.f124910h + ", wording=" + this.f124911i + ')';
    }
}
