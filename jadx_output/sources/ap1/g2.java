package ap1;

/* loaded from: classes5.dex */
public final class g2 implements j75.d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12669a;

    /* renamed from: b, reason: collision with root package name */
    public j75.e f12670b;

    public g2(boolean z17, j75.e eVar, int i17, kotlin.jvm.internal.i iVar) {
        eVar = (i17 & 2) != 0 ? null : eVar;
        this.f12669a = z17;
        this.f12670b = eVar;
    }

    @Override // j75.d
    public void a(j75.e eVar) {
        this.f12670b = eVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap1.g2)) {
            return false;
        }
        ap1.g2 g2Var = (ap1.g2) obj;
        return this.f12669a == g2Var.f12669a && kotlin.jvm.internal.o.b(this.f12670b, g2Var.f12670b);
    }

    public int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.f12669a) * 31;
        j75.e eVar = this.f12670b;
        return hashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    public java.lang.String toString() {
        return "ToggleAllSelectAction(selectAll=" + this.f12669a + ", result=" + this.f12670b + ')';
    }
}
