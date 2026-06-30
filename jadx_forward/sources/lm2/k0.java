package lm2;

/* loaded from: classes3.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f400949a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f400950b;

    public k0(boolean z17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f400949a = z17;
        this.f400950b = gVar;
    }

    /* renamed from: equals */
    public boolean m146010xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lm2.k0)) {
            return false;
        }
        lm2.k0 k0Var = (lm2.k0) obj;
        return this.f400949a == k0Var.f400949a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f400950b, k0Var.f400950b);
    }

    /* renamed from: hashCode */
    public int m146011x8cdac1b() {
        int hashCode = java.lang.Boolean.hashCode(this.f400949a) * 31;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f400950b;
        return hashCode + (gVar == null ? 0 : gVar.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m146012x9616526c() {
        return "BoxRedDotInfo(hasRedDot=" + this.f400949a + ", lastBuffer=" + this.f400950b + ')';
    }
}
