package f26;

/* loaded from: classes15.dex */
public abstract class r implements f26.c2 {

    /* renamed from: a, reason: collision with root package name */
    public int f340746a;

    public abstract boolean b(o06.j jVar);

    /* renamed from: equals */
    public boolean m128975xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f26.c2) || obj.hashCode() != m128976x8cdac1b()) {
            return false;
        }
        f26.c2 c2Var = (f26.c2) obj;
        if (c2Var.mo9613x99879e0().size() != mo9613x99879e0().size()) {
            return false;
        }
        o06.j i17 = i();
        o06.j i18 = c2Var.i();
        if (i18 == null) {
            return false;
        }
        if ((h26.m.f(i17) || r16.i.p(i17)) ? false : true) {
            if ((h26.m.f(i18) || r16.i.p(i18)) ? false : true) {
                return b(i18);
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m128976x8cdac1b() {
        int i17 = this.f340746a;
        if (i17 != 0) {
            return i17;
        }
        o06.j i18 = i();
        int m148889x8cdac1b = !h26.m.f(i18) && !r16.i.p(i18) ? r16.i.g(i18).m148889x8cdac1b() : java.lang.System.identityHashCode(this);
        this.f340746a = m148889x8cdac1b;
        return m148889x8cdac1b;
    }
}
