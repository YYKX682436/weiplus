package cb1;

/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final r45.jv5 f40252a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.i7 f40253b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f40254c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.pw6 f40255d;

    public i(r45.jv5 jv5Var, r45.i7 i7Var, java.lang.String applyWording, r45.pw6 pw6Var) {
        kotlin.jvm.internal.o.g(applyWording, "applyWording");
        this.f40252a = jv5Var;
        this.f40253b = i7Var;
        this.f40254c = applyWording;
        this.f40255d = pw6Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb1.i)) {
            return false;
        }
        cb1.i iVar = (cb1.i) obj;
        return kotlin.jvm.internal.o.b(this.f40252a, iVar.f40252a) && kotlin.jvm.internal.o.b(this.f40253b, iVar.f40253b) && kotlin.jvm.internal.o.b(this.f40254c, iVar.f40254c) && kotlin.jvm.internal.o.b(this.f40255d, iVar.f40255d);
    }

    public int hashCode() {
        r45.jv5 jv5Var = this.f40252a;
        int hashCode = (jv5Var == null ? 0 : jv5Var.hashCode()) * 31;
        r45.i7 i7Var = this.f40253b;
        int hashCode2 = (((hashCode + (i7Var == null ? 0 : i7Var.hashCode())) * 31) + this.f40254c.hashCode()) * 31;
        r45.pw6 pw6Var = this.f40255d;
        return hashCode2 + (pw6Var != null ? pw6Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "Info(scopeInfo=" + this.f40252a + ", alertPrivacyInfo=" + this.f40253b + ", applyWording=" + this.f40254c + ", privacyProtectInfo=" + this.f40255d + ')';
    }
}
