package f26;

/* loaded from: classes15.dex */
public abstract class m2 implements f26.l2 {
    /* renamed from: equals */
    public boolean m128961xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f26.l2)) {
            return false;
        }
        f26.l2 l2Var = (f26.l2) obj;
        return b() == l2Var.b() && c() == l2Var.c() && mo128949xfb85f7b0().m128969xb2c87fbf(l2Var.mo128949xfb85f7b0());
    }

    /* renamed from: hashCode */
    public int m128962x8cdac1b() {
        int hashCode = c().hashCode();
        if (f26.z2.o(mo128949xfb85f7b0())) {
            return (hashCode * 31) + 19;
        }
        return (hashCode * 31) + (b() ? 17 : mo128949xfb85f7b0().m128970x8cdac1b());
    }

    /* renamed from: toString */
    public java.lang.String m128963x9616526c() {
        if (b()) {
            return "*";
        }
        if (c() == f26.d3.f340676f) {
            return mo128949xfb85f7b0().toString();
        }
        return c() + " " + mo128949xfb85f7b0();
    }
}
