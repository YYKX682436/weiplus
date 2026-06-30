package ap1;

/* loaded from: classes5.dex */
public final class c implements j75.d {

    /* renamed from: a, reason: collision with root package name */
    public j75.e f12619a;

    public c(j75.e eVar, int i17, kotlin.jvm.internal.i iVar) {
        this.f12619a = (i17 & 1) != 0 ? null : eVar;
    }

    @Override // j75.d
    public void a(j75.e eVar) {
        this.f12619a = eVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ap1.c) && kotlin.jvm.internal.o.b(this.f12619a, ((ap1.c) obj).f12619a);
    }

    public int hashCode() {
        j75.e eVar = this.f12619a;
        if (eVar == null) {
            return 0;
        }
        return eVar.hashCode();
    }

    public java.lang.String toString() {
        return "PushDownActivityAction(result=" + this.f12619a + ')';
    }
}
