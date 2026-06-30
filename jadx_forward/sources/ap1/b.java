package ap1;

/* loaded from: classes.dex */
public final class b implements j75.d {

    /* renamed from: a, reason: collision with root package name */
    public j75.e f94138a;

    public b(j75.e eVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f94138a = (i17 & 1) != 0 ? null : eVar;
    }

    @Override // j75.d
    public void a(j75.e eVar) {
        this.f94138a = eVar;
    }

    /* renamed from: equals */
    public boolean m8749xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ap1.b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f94138a, ((ap1.b) obj).f94138a);
    }

    /* renamed from: hashCode */
    public int m8750x8cdac1b() {
        j75.e eVar = this.f94138a;
        if (eVar == null) {
            return 0;
        }
        return eVar.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m8751x9616526c() {
        return "HideCommonErrorAction(result=" + this.f94138a + ')';
    }
}
