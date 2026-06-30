package ap1;

/* loaded from: classes5.dex */
public final class g2 implements j75.d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f94202a;

    /* renamed from: b, reason: collision with root package name */
    public j75.e f94203b;

    public g2(boolean z17, j75.e eVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        eVar = (i17 & 2) != 0 ? null : eVar;
        this.f94202a = z17;
        this.f94203b = eVar;
    }

    @Override // j75.d
    public void a(j75.e eVar) {
        this.f94203b = eVar;
    }

    /* renamed from: equals */
    public boolean m8768xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap1.g2)) {
            return false;
        }
        ap1.g2 g2Var = (ap1.g2) obj;
        return this.f94202a == g2Var.f94202a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f94203b, g2Var.f94203b);
    }

    /* renamed from: hashCode */
    public int m8769x8cdac1b() {
        int hashCode = java.lang.Boolean.hashCode(this.f94202a) * 31;
        j75.e eVar = this.f94203b;
        return hashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m8770x9616526c() {
        return "ToggleAllSelectAction(selectAll=" + this.f94202a + ", result=" + this.f94203b + ')';
    }
}
