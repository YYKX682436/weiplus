package dk2;

/* loaded from: classes3.dex */
public final class vc {

    /* renamed from: a, reason: collision with root package name */
    public boolean f315779a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f315780b;

    public vc(boolean z17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 1) != 0 ? false : z17;
        gVar = (i17 & 2) != 0 ? null : gVar;
        this.f315779a = z17;
        this.f315780b = gVar;
    }

    /* renamed from: equals */
    public boolean m124672xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk2.vc)) {
            return false;
        }
        dk2.vc vcVar = (dk2.vc) obj;
        return this.f315779a == vcVar.f315779a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f315780b, vcVar.f315780b);
    }

    /* renamed from: hashCode */
    public int m124673x8cdac1b() {
        int hashCode = java.lang.Boolean.hashCode(this.f315779a) * 31;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f315780b;
        return hashCode + (gVar == null ? 0 : gVar.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m124674x9616526c() {
        return "GroupGiftPagingData(hasMore=" + this.f315779a + ", lastBuffer=" + this.f315780b + ')';
    }
}
