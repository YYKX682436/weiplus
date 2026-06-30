package ce2;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ce2.d f40778a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.ma0 f40779b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.pa0 f40780c;

    public e(ce2.d type, r45.ma0 ma0Var, r45.pa0 pa0Var) {
        kotlin.jvm.internal.o.g(type, "type");
        this.f40778a = type;
        this.f40779b = ma0Var;
        this.f40780c = pa0Var;
    }

    public final java.lang.String a() {
        java.lang.String string;
        if (this.f40778a == ce2.d.f40775d) {
            r45.ma0 ma0Var = this.f40779b;
            if (ma0Var == null || (string = ma0Var.getString(0)) == null) {
                return "";
            }
        } else {
            r45.pa0 pa0Var = this.f40780c;
            if (pa0Var == null || (string = pa0Var.getString(6)) == null) {
                return "";
            }
        }
        return string;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce2.e)) {
            return false;
        }
        ce2.e eVar = (ce2.e) obj;
        return this.f40778a == eVar.f40778a && kotlin.jvm.internal.o.b(this.f40779b, eVar.f40779b) && kotlin.jvm.internal.o.b(this.f40780c, eVar.f40780c);
    }

    public int hashCode() {
        int hashCode = this.f40778a.hashCode() * 31;
        r45.ma0 ma0Var = this.f40779b;
        int hashCode2 = (hashCode + (ma0Var == null ? 0 : ma0Var.hashCode())) * 31;
        r45.pa0 pa0Var = this.f40780c;
        return hashCode2 + (pa0Var != null ? pa0Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        ce2.d dVar = ce2.d.f40775d;
        ce2.d dVar2 = this.f40778a;
        if (dVar2 == dVar) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("type:");
            sb6.append(dVar2);
            sb6.append(";\t");
            java.lang.Object obj = this.f40779b;
            sb6.append(pm0.b0.g(obj != null ? obj : ""));
            return sb6.toString();
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("type:");
        sb7.append(dVar2);
        sb7.append(";\t");
        java.lang.Object obj2 = this.f40780c;
        sb7.append(pm0.b0.g(obj2 != null ? obj2 : ""));
        return sb7.toString();
    }
}
