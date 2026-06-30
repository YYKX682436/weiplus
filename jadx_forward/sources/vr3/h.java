package vr3;

/* loaded from: classes11.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final r45.s5 f521164a;

    /* renamed from: b, reason: collision with root package name */
    public final wr3.n0 f521165b;

    public h(r45.s5 s5Var, wr3.n0 n0Var) {
        this.f521164a = s5Var;
        this.f521165b = n0Var;
    }

    /* renamed from: equals */
    public boolean m172544xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vr3.h)) {
            return false;
        }
        vr3.h hVar = (vr3.h) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521164a, hVar.f521164a) && this.f521165b == hVar.f521165b;
    }

    /* renamed from: hashCode */
    public int m172545x8cdac1b() {
        r45.s5 s5Var = this.f521164a;
        int hashCode = (s5Var == null ? 0 : s5Var.hashCode()) * 31;
        wr3.n0 n0Var = this.f521165b;
        return hashCode + (n0Var != null ? n0Var.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m172546x9616526c() {
        return "OutBoxData(msg=" + this.f521164a + ", status=" + this.f521165b + ')';
    }
}
