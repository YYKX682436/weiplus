package ap1;

/* loaded from: classes5.dex */
public final class f2 implements j75.d {

    /* renamed from: a, reason: collision with root package name */
    public final ap1.p0 f12662a;

    /* renamed from: b, reason: collision with root package name */
    public j75.e f12663b;

    public f2(ap1.p0 sortBy, j75.e eVar, int i17, kotlin.jvm.internal.i iVar) {
        eVar = (i17 & 2) != 0 ? null : eVar;
        kotlin.jvm.internal.o.g(sortBy, "sortBy");
        this.f12662a = sortBy;
        this.f12663b = eVar;
    }

    @Override // j75.d
    public void a(j75.e eVar) {
        this.f12663b = eVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap1.f2)) {
            return false;
        }
        ap1.f2 f2Var = (ap1.f2) obj;
        return this.f12662a == f2Var.f12662a && kotlin.jvm.internal.o.b(this.f12663b, f2Var.f12663b);
    }

    public int hashCode() {
        int hashCode = this.f12662a.hashCode() * 31;
        j75.e eVar = this.f12663b;
        return hashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    public java.lang.String toString() {
        return "SortContactListAction(sortBy=" + this.f12662a + ", result=" + this.f12663b + ')';
    }
}
