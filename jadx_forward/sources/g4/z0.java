package g4;

/* loaded from: classes5.dex */
public final class z0 {

    /* renamed from: d, reason: collision with root package name */
    public static final g4.z0 f350177d;

    /* renamed from: a, reason: collision with root package name */
    public final g4.y0 f350178a;

    /* renamed from: b, reason: collision with root package name */
    public final g4.y0 f350179b;

    /* renamed from: c, reason: collision with root package name */
    public final g4.y0 f350180c;

    static {
        g4.x0 x0Var = g4.x0.f350138c;
        f350177d = new g4.z0(x0Var, x0Var, x0Var);
    }

    public z0(g4.y0 refresh, g4.y0 prepend, g4.y0 append) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(refresh, "refresh");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prepend, "prepend");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(append, "append");
        this.f350178a = refresh;
        this.f350179b = prepend;
        this.f350180c = append;
    }

    public static g4.z0 a(g4.z0 z0Var, g4.y0 refresh, g4.y0 prepend, g4.y0 append, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            refresh = z0Var.f350178a;
        }
        if ((i17 & 2) != 0) {
            prepend = z0Var.f350179b;
        }
        if ((i17 & 4) != 0) {
            append = z0Var.f350180c;
        }
        z0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(refresh, "refresh");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prepend, "prepend");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(append, "append");
        return new g4.z0(refresh, prepend, append);
    }

    public final g4.y0 b(g4.a1 loadType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadType, "loadType");
        int ordinal = loadType.ordinal();
        if (ordinal == 0) {
            return this.f350178a;
        }
        if (ordinal == 1) {
            return this.f350179b;
        }
        if (ordinal == 2) {
            return this.f350180c;
        }
        throw new jz5.j();
    }

    public final g4.z0 c(g4.a1 loadType, g4.y0 newState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadType, "loadType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newState, "newState");
        int ordinal = loadType.ordinal();
        if (ordinal == 0) {
            return a(this, newState, null, null, 6, null);
        }
        if (ordinal == 1) {
            return a(this, null, newState, null, 5, null);
        }
        if (ordinal == 2) {
            return a(this, null, null, newState, 3, null);
        }
        throw new jz5.j();
    }

    /* renamed from: equals */
    public boolean m130870xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4.z0)) {
            return false;
        }
        g4.z0 z0Var = (g4.z0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f350178a, z0Var.f350178a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f350179b, z0Var.f350179b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f350180c, z0Var.f350180c);
    }

    /* renamed from: hashCode */
    public int m130871x8cdac1b() {
        g4.y0 y0Var = this.f350178a;
        int hashCode = (y0Var != null ? y0Var.hashCode() : 0) * 31;
        g4.y0 y0Var2 = this.f350179b;
        int hashCode2 = (hashCode + (y0Var2 != null ? y0Var2.hashCode() : 0)) * 31;
        g4.y0 y0Var3 = this.f350180c;
        return hashCode2 + (y0Var3 != null ? y0Var3.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m130872x9616526c() {
        return "LoadStates(refresh=" + this.f350178a + ", prepend=" + this.f350179b + ", append=" + this.f350180c + ")";
    }
}
