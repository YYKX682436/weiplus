package ap1;

/* loaded from: classes5.dex */
public final class a implements j75.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f12598a;

    /* renamed from: b, reason: collision with root package name */
    public j75.e f12599b;

    public a(java.util.List contactList, j75.e eVar, int i17, kotlin.jvm.internal.i iVar) {
        eVar = (i17 & 2) != 0 ? null : eVar;
        kotlin.jvm.internal.o.g(contactList, "contactList");
        this.f12598a = contactList;
        this.f12599b = eVar;
    }

    @Override // j75.d
    public void a(j75.e eVar) {
        this.f12599b = eVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap1.a)) {
            return false;
        }
        ap1.a aVar = (ap1.a) obj;
        return kotlin.jvm.internal.o.b(this.f12598a, aVar.f12598a) && kotlin.jvm.internal.o.b(this.f12599b, aVar.f12599b);
    }

    public int hashCode() {
        int hashCode = this.f12598a.hashCode() * 31;
        j75.e eVar = this.f12599b;
        return hashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    public java.lang.String toString() {
        return "DataSourceInitializedAction(contactList=" + this.f12598a + ", result=" + this.f12599b + ')';
    }
}
