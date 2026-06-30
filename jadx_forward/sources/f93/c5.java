package f93;

/* loaded from: classes3.dex */
public final class c5 {

    /* renamed from: a, reason: collision with root package name */
    public int f341838a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f341839b;

    /* renamed from: c, reason: collision with root package name */
    public final f93.r5 f341840c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.z3 f341841d;

    public c5(int i17, java.lang.String str, f93.r5 r5Var, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        str = (i18 & 2) != 0 ? null : str;
        r5Var = (i18 & 4) != 0 ? null : r5Var;
        z3Var = (i18 & 8) != 0 ? null : z3Var;
        this.f341838a = i17;
        this.f341839b = str;
        this.f341840c = r5Var;
        this.f341841d = z3Var;
    }

    /* renamed from: equals */
    public boolean m129209xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f93.c5)) {
            return false;
        }
        f93.c5 c5Var = (f93.c5) obj;
        return this.f341838a == c5Var.f341838a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f341839b, c5Var.f341839b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f341840c, c5Var.f341840c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f341841d, c5Var.f341841d);
    }

    /* renamed from: hashCode */
    public int m129210x8cdac1b() {
        int hashCode = java.lang.Integer.hashCode(this.f341838a) * 31;
        java.lang.String str = this.f341839b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        f93.r5 r5Var = this.f341840c;
        int m129228x8cdac1b = (hashCode2 + (r5Var == null ? 0 : r5Var.m129228x8cdac1b())) * 31;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f341841d;
        return m129228x8cdac1b + (z3Var != null ? z3Var.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m129211x9616526c() {
        return "ItemInfo(type=" + this.f341838a + ", title=" + this.f341839b + ", label=" + this.f341840c + ", contact=" + this.f341841d + ')';
    }
}
