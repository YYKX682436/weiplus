package ap1;

/* loaded from: classes5.dex */
public final class h2 implements j75.d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12677a;

    /* renamed from: b, reason: collision with root package name */
    public final ap1.a0 f12678b;

    /* renamed from: c, reason: collision with root package name */
    public j75.e f12679c;

    public h2(boolean z17, ap1.a0 item, j75.e eVar, int i17, kotlin.jvm.internal.i iVar) {
        eVar = (i17 & 4) != 0 ? null : eVar;
        kotlin.jvm.internal.o.g(item, "item");
        this.f12677a = z17;
        this.f12678b = item;
        this.f12679c = eVar;
    }

    @Override // j75.d
    public void a(j75.e eVar) {
        this.f12679c = eVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap1.h2)) {
            return false;
        }
        ap1.h2 h2Var = (ap1.h2) obj;
        return this.f12677a == h2Var.f12677a && kotlin.jvm.internal.o.b(this.f12678b, h2Var.f12678b) && kotlin.jvm.internal.o.b(this.f12679c, h2Var.f12679c);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Boolean.hashCode(this.f12677a) * 31) + this.f12678b.hashCode()) * 31;
        j75.e eVar = this.f12679c;
        return hashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    public java.lang.String toString() {
        return "ToggleSelectAction(switchToSelect=" + this.f12677a + ", item=" + this.f12678b + ", result=" + this.f12679c + ')';
    }
}
