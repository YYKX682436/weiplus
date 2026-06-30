package ap1;

/* loaded from: classes5.dex */
public final class d implements j75.d {

    /* renamed from: a, reason: collision with root package name */
    public final ap1.e f94165a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f94166b;

    public d(ap1.e event, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        this.f94165a = event;
        this.f94166b = lVar;
    }

    @Override // j75.d
    public void a(j75.e eVar) {
    }

    /* renamed from: equals */
    public boolean m8756xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap1.d)) {
            return false;
        }
        ap1.d dVar = (ap1.d) obj;
        return this.f94165a == dVar.f94165a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f94166b, dVar.f94166b);
    }

    /* renamed from: hashCode */
    public int m8757x8cdac1b() {
        int hashCode = this.f94165a.hashCode() * 31;
        yz5.l lVar = this.f94166b;
        return hashCode + (lVar == null ? 0 : lVar.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m8758x9616526c() {
        return "Report28098Action(event=" + this.f94165a + ", extraParam=" + this.f94166b + ')';
    }
}
