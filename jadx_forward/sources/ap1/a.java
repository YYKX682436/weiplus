package ap1;

/* loaded from: classes5.dex */
public final class a implements j75.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f94131a;

    /* renamed from: b, reason: collision with root package name */
    public j75.e f94132b;

    public a(java.util.List contactList, j75.e eVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        eVar = (i17 & 2) != 0 ? null : eVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contactList, "contactList");
        this.f94131a = contactList;
        this.f94132b = eVar;
    }

    @Override // j75.d
    public void a(j75.e eVar) {
        this.f94132b = eVar;
    }

    /* renamed from: equals */
    public boolean m8743xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap1.a)) {
            return false;
        }
        ap1.a aVar = (ap1.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f94131a, aVar.f94131a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f94132b, aVar.f94132b);
    }

    /* renamed from: hashCode */
    public int m8744x8cdac1b() {
        int hashCode = this.f94131a.hashCode() * 31;
        j75.e eVar = this.f94132b;
        return hashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m8745x9616526c() {
        return "DataSourceInitializedAction(contactList=" + this.f94131a + ", result=" + this.f94132b + ')';
    }
}
