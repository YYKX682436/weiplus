package ap1;

/* loaded from: classes5.dex */
public final class d implements j75.d {

    /* renamed from: a, reason: collision with root package name */
    public final ap1.e f12632a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f12633b;

    public d(ap1.e event, yz5.l lVar) {
        kotlin.jvm.internal.o.g(event, "event");
        this.f12632a = event;
        this.f12633b = lVar;
    }

    @Override // j75.d
    public void a(j75.e eVar) {
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap1.d)) {
            return false;
        }
        ap1.d dVar = (ap1.d) obj;
        return this.f12632a == dVar.f12632a && kotlin.jvm.internal.o.b(this.f12633b, dVar.f12633b);
    }

    public int hashCode() {
        int hashCode = this.f12632a.hashCode() * 31;
        yz5.l lVar = this.f12633b;
        return hashCode + (lVar == null ? 0 : lVar.hashCode());
    }

    public java.lang.String toString() {
        return "Report28098Action(event=" + this.f12632a + ", extraParam=" + this.f12633b + ')';
    }
}
