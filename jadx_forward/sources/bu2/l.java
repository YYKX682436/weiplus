package bu2;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f106073a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f106074b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f106075c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f106076d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f106077e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.uy0 f106078f;

    /* renamed from: g, reason: collision with root package name */
    public final r45.xq2 f106079g;

    /* renamed from: h, reason: collision with root package name */
    public final r45.vy0 f106080h;

    public l(int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, boolean z17, boolean z18, boolean z19, r45.uy0 uy0Var, r45.xq2 xq2Var, r45.vy0 vy0Var) {
        this.f106073a = i17;
        this.f106074b = gVar;
        this.f106075c = z17;
        this.f106076d = z18;
        this.f106077e = z19;
        this.f106078f = uy0Var;
        this.f106079g = xq2Var;
        this.f106080h = vy0Var;
    }

    /* renamed from: equals */
    public boolean m11301xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu2.l)) {
            return false;
        }
        bu2.l lVar = (bu2.l) obj;
        return this.f106073a == lVar.f106073a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f106074b, lVar.f106074b) && this.f106075c == lVar.f106075c && this.f106076d == lVar.f106076d && this.f106077e == lVar.f106077e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f106078f, lVar.f106078f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f106079g, lVar.f106079g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f106080h, lVar.f106080h);
    }

    /* renamed from: hashCode */
    public int m11302x8cdac1b() {
        int hashCode = java.lang.Integer.hashCode(this.f106073a) * 31;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f106074b;
        int hashCode2 = (((((((hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f106075c)) * 31) + java.lang.Boolean.hashCode(this.f106076d)) * 31) + java.lang.Boolean.hashCode(this.f106077e)) * 31;
        r45.uy0 uy0Var = this.f106078f;
        int hashCode3 = (hashCode2 + (uy0Var == null ? 0 : uy0Var.hashCode())) * 31;
        r45.xq2 xq2Var = this.f106079g;
        int hashCode4 = (hashCode3 + (xq2Var == null ? 0 : xq2Var.hashCode())) * 31;
        r45.vy0 vy0Var = this.f106080h;
        return hashCode4 + (vy0Var != null ? vy0Var.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m11303x9616526c() {
        return "Extra(pos=" + this.f106073a + ", lastBuffer=" + this.f106074b + ", upContinue=" + this.f106075c + ", downContinue=" + this.f106076d + ", hasExpand=" + this.f106077e + ", promptInfo=" + this.f106078f + ", presentHalfSheetInfo=" + this.f106079g + ", sortCtrl=" + this.f106080h + ')';
    }
}
