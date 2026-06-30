package ap1;

/* loaded from: classes.dex */
public final class b implements j75.d {

    /* renamed from: a, reason: collision with root package name */
    public j75.e f12605a;

    public b(j75.e eVar, int i17, kotlin.jvm.internal.i iVar) {
        this.f12605a = (i17 & 1) != 0 ? null : eVar;
    }

    @Override // j75.d
    public void a(j75.e eVar) {
        this.f12605a = eVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ap1.b) && kotlin.jvm.internal.o.b(this.f12605a, ((ap1.b) obj).f12605a);
    }

    public int hashCode() {
        j75.e eVar = this.f12605a;
        if (eVar == null) {
            return 0;
        }
        return eVar.hashCode();
    }

    public java.lang.String toString() {
        return "HideCommonErrorAction(result=" + this.f12605a + ')';
    }
}
