package ty2;

/* loaded from: classes9.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final int f504650a;

    /* renamed from: b, reason: collision with root package name */
    public final bw5.q5 f504651b;

    public v(int i17, bw5.q5 q5Var) {
        this.f504650a = i17;
        this.f504651b = q5Var;
    }

    /* renamed from: equals */
    public boolean m167237xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty2.v)) {
            return false;
        }
        ty2.v vVar = (ty2.v) obj;
        return this.f504650a == vVar.f504650a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f504651b, vVar.f504651b);
    }

    /* renamed from: hashCode */
    public int m167238x8cdac1b() {
        int hashCode = java.lang.Integer.hashCode(this.f504650a) * 31;
        bw5.q5 q5Var = this.f504651b;
        return hashCode + (q5Var == null ? 0 : q5Var.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m167239x9616526c() {
        return "ViewStatus(measureWidth=" + this.f504650a + ", item=" + this.f504651b + ')';
    }
}
