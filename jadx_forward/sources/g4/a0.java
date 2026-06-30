package g4;

/* loaded from: classes5.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final g4.y0 f349726a;

    /* renamed from: b, reason: collision with root package name */
    public final g4.y0 f349727b;

    /* renamed from: c, reason: collision with root package name */
    public final g4.y0 f349728c;

    /* renamed from: d, reason: collision with root package name */
    public final g4.z0 f349729d;

    /* renamed from: e, reason: collision with root package name */
    public final g4.z0 f349730e;

    static {
        g4.x0 x0Var = g4.x0.f350138c;
        g4.z0 z0Var = g4.z0.f350177d;
        new g4.a0(x0Var, x0Var, x0Var, g4.z0.f350177d, null, 16, null);
    }

    public a0(g4.y0 refresh, g4.y0 prepend, g4.y0 append, g4.z0 source, g4.z0 z0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(refresh, "refresh");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prepend, "prepend");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(append, "append");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        this.f349726a = refresh;
        this.f349727b = prepend;
        this.f349728c = append;
        this.f349729d = source;
        this.f349730e = z0Var;
    }

    /* renamed from: equals */
    public boolean m130818xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(g4.a0.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.paging.CombinedLoadStates");
        }
        g4.a0 a0Var = (g4.a0) obj;
        return ((p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f349726a, a0Var.f349726a) ^ true) || (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f349727b, a0Var.f349727b) ^ true) || (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f349728c, a0Var.f349728c) ^ true) || (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f349729d, a0Var.f349729d) ^ true) || (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f349730e, a0Var.f349730e) ^ true)) ? false : true;
    }

    /* renamed from: hashCode */
    public int m130819x8cdac1b() {
        int hashCode = ((((((this.f349726a.hashCode() * 31) + this.f349727b.hashCode()) * 31) + this.f349728c.hashCode()) * 31) + this.f349729d.m130871x8cdac1b()) * 31;
        g4.z0 z0Var = this.f349730e;
        return hashCode + (z0Var != null ? z0Var.m130871x8cdac1b() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m130820x9616526c() {
        return "CombinedLoadStates(refresh=" + this.f349726a + ", prepend=" + this.f349727b + ", append=" + this.f349728c + ", source=" + this.f349729d + ", mediator=" + this.f349730e + ')';
    }

    public /* synthetic */ a0(g4.y0 y0Var, g4.y0 y0Var2, g4.y0 y0Var3, g4.z0 z0Var, g4.z0 z0Var2, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(y0Var, y0Var2, y0Var3, z0Var, (i17 & 16) != 0 ? null : z0Var2);
    }
}
