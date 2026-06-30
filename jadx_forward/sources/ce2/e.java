package ce2;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ce2.d f122311a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.ma0 f122312b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.pa0 f122313c;

    public e(ce2.d type, r45.ma0 ma0Var, r45.pa0 pa0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        this.f122311a = type;
        this.f122312b = ma0Var;
        this.f122313c = pa0Var;
    }

    public final java.lang.String a() {
        java.lang.String m75945x2fec8307;
        if (this.f122311a == ce2.d.f122308d) {
            r45.ma0 ma0Var = this.f122312b;
            if (ma0Var == null || (m75945x2fec8307 = ma0Var.m75945x2fec8307(0)) == null) {
                return "";
            }
        } else {
            r45.pa0 pa0Var = this.f122313c;
            if (pa0Var == null || (m75945x2fec8307 = pa0Var.m75945x2fec8307(6)) == null) {
                return "";
            }
        }
        return m75945x2fec8307;
    }

    /* renamed from: equals */
    public boolean m14705xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce2.e)) {
            return false;
        }
        ce2.e eVar = (ce2.e) obj;
        return this.f122311a == eVar.f122311a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f122312b, eVar.f122312b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f122313c, eVar.f122313c);
    }

    /* renamed from: hashCode */
    public int m14706x8cdac1b() {
        int hashCode = this.f122311a.hashCode() * 31;
        r45.ma0 ma0Var = this.f122312b;
        int hashCode2 = (hashCode + (ma0Var == null ? 0 : ma0Var.hashCode())) * 31;
        r45.pa0 pa0Var = this.f122313c;
        return hashCode2 + (pa0Var != null ? pa0Var.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m14707x9616526c() {
        ce2.d dVar = ce2.d.f122308d;
        ce2.d dVar2 = this.f122311a;
        if (dVar2 == dVar) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("type:");
            sb6.append(dVar2);
            sb6.append(";\t");
            java.lang.Object obj = this.f122312b;
            sb6.append(pm0.b0.g(obj != null ? obj : ""));
            return sb6.toString();
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("type:");
        sb7.append(dVar2);
        sb7.append(";\t");
        java.lang.Object obj2 = this.f122313c;
        sb7.append(pm0.b0.g(obj2 != null ? obj2 : ""));
        return sb7.toString();
    }
}
