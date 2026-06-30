package vd2;

/* loaded from: classes3.dex */
public final class r2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f517410a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f517411b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f517412c;

    public r2(java.util.ArrayList preList, java.util.ArrayList sufList, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preList, "preList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sufList, "sufList");
        this.f517410a = preList;
        this.f517411b = sufList;
        this.f517412c = gVar;
    }

    /* renamed from: equals */
    public boolean m171666xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd2.r2)) {
            return false;
        }
        vd2.r2 r2Var = (vd2.r2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f517410a, r2Var.f517410a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f517411b, r2Var.f517411b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f517412c, r2Var.f517412c);
    }

    /* renamed from: hashCode */
    public int m171667x8cdac1b() {
        int hashCode = ((this.f517410a.hashCode() * 31) + this.f517411b.hashCode()) * 31;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f517412c;
        return hashCode + (gVar == null ? 0 : gVar.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m171668x9616526c() {
        return "SideBarDataCache(preList=" + this.f517410a + ", sufList=" + this.f517411b + ", lastBuffer=" + this.f517412c + ')';
    }
}
