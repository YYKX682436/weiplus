package ap1;

/* loaded from: classes5.dex */
public final class h2 implements j75.d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f94210a;

    /* renamed from: b, reason: collision with root package name */
    public final ap1.a0 f94211b;

    /* renamed from: c, reason: collision with root package name */
    public j75.e f94212c;

    public h2(boolean z17, ap1.a0 item, j75.e eVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        eVar = (i17 & 4) != 0 ? null : eVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f94210a = z17;
        this.f94211b = item;
        this.f94212c = eVar;
    }

    @Override // j75.d
    public void a(j75.e eVar) {
        this.f94212c = eVar;
    }

    /* renamed from: equals */
    public boolean m8771xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap1.h2)) {
            return false;
        }
        ap1.h2 h2Var = (ap1.h2) obj;
        return this.f94210a == h2Var.f94210a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f94211b, h2Var.f94211b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f94212c, h2Var.f94212c);
    }

    /* renamed from: hashCode */
    public int m8772x8cdac1b() {
        int hashCode = ((java.lang.Boolean.hashCode(this.f94210a) * 31) + this.f94211b.m8747x8cdac1b()) * 31;
        j75.e eVar = this.f94212c;
        return hashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m8773x9616526c() {
        return "ToggleSelectAction(switchToSelect=" + this.f94210a + ", item=" + this.f94211b + ", result=" + this.f94212c + ')';
    }
}
