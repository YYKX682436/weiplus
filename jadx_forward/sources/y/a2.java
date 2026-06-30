package y;

/* loaded from: classes14.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    public final y.i1 f539839a;

    /* renamed from: b, reason: collision with root package name */
    public final y.t1 f539840b;

    /* renamed from: c, reason: collision with root package name */
    public final y.u f539841c;

    public a2(y.i1 i1Var, y.t1 t1Var, y.u uVar, y.n1 n1Var) {
        this.f539839a = i1Var;
        this.f539840b = t1Var;
        this.f539841c = uVar;
    }

    /* renamed from: equals */
    public boolean m176198xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y.a2)) {
            return false;
        }
        y.a2 a2Var = (y.a2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f539839a, a2Var.f539839a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f539840b, a2Var.f539840b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f539841c, a2Var.f539841c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(null, null);
    }

    /* renamed from: hashCode */
    public int m176199x8cdac1b() {
        y.i1 i1Var = this.f539839a;
        int m176216x8cdac1b = (i1Var == null ? 0 : i1Var.m176216x8cdac1b()) * 31;
        y.t1 t1Var = this.f539840b;
        int m176232x8cdac1b = (m176216x8cdac1b + (t1Var == null ? 0 : t1Var.m176232x8cdac1b())) * 31;
        y.u uVar = this.f539841c;
        return ((m176232x8cdac1b + (uVar == null ? 0 : uVar.m176235x8cdac1b())) * 31) + 0;
    }

    /* renamed from: toString */
    public java.lang.String m176200x9616526c() {
        return "TransitionData(fade=" + this.f539839a + ", slide=" + this.f539840b + ", changeSize=" + this.f539841c + ", scale=null)";
    }

    public /* synthetic */ a2(y.i1 i1Var, y.t1 t1Var, y.u uVar, y.n1 n1Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? null : i1Var, (i17 & 2) != 0 ? null : t1Var, (i17 & 4) != 0 ? null : uVar, (i17 & 8) != 0 ? null : n1Var);
    }
}
