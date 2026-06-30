package ap1;

/* loaded from: classes5.dex */
public final class f2 implements j75.d {

    /* renamed from: a, reason: collision with root package name */
    public final ap1.p0 f94195a;

    /* renamed from: b, reason: collision with root package name */
    public j75.e f94196b;

    public f2(ap1.p0 sortBy, j75.e eVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        eVar = (i17 & 2) != 0 ? null : eVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sortBy, "sortBy");
        this.f94195a = sortBy;
        this.f94196b = eVar;
    }

    @Override // j75.d
    public void a(j75.e eVar) {
        this.f94196b = eVar;
    }

    /* renamed from: equals */
    public boolean m8765xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap1.f2)) {
            return false;
        }
        ap1.f2 f2Var = (ap1.f2) obj;
        return this.f94195a == f2Var.f94195a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f94196b, f2Var.f94196b);
    }

    /* renamed from: hashCode */
    public int m8766x8cdac1b() {
        int hashCode = this.f94195a.hashCode() * 31;
        j75.e eVar = this.f94196b;
        return hashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m8767x9616526c() {
        return "SortContactListAction(sortBy=" + this.f94195a + ", result=" + this.f94196b + ')';
    }
}
