package ap1;

/* loaded from: classes5.dex */
public final class c implements j75.d {

    /* renamed from: a, reason: collision with root package name */
    public j75.e f94152a;

    public c(j75.e eVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f94152a = (i17 & 1) != 0 ? null : eVar;
    }

    @Override // j75.d
    public void a(j75.e eVar) {
        this.f94152a = eVar;
    }

    /* renamed from: equals */
    public boolean m8752xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ap1.c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f94152a, ((ap1.c) obj).f94152a);
    }

    /* renamed from: hashCode */
    public int m8753x8cdac1b() {
        j75.e eVar = this.f94152a;
        if (eVar == null) {
            return 0;
        }
        return eVar.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m8754x9616526c() {
        return "PushDownActivityAction(result=" + this.f94152a + ')';
    }
}
