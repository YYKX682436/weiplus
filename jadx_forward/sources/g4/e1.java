package g4;

/* loaded from: classes5.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public g4.y0 f349794a;

    /* renamed from: b, reason: collision with root package name */
    public g4.y0 f349795b;

    /* renamed from: c, reason: collision with root package name */
    public g4.y0 f349796c;

    /* renamed from: d, reason: collision with root package name */
    public g4.z0 f349797d;

    /* renamed from: e, reason: collision with root package name */
    public g4.z0 f349798e;

    public e1() {
        g4.x0 x0Var = g4.x0.f350138c;
        this.f349794a = x0Var;
        this.f349795b = x0Var;
        this.f349796c = x0Var;
        g4.z0 z0Var = g4.z0.f350177d;
        this.f349797d = g4.z0.f350177d;
    }

    public final g4.y0 a(g4.y0 y0Var, g4.y0 y0Var2, g4.y0 y0Var3, g4.y0 y0Var4) {
        return y0Var4 == null ? y0Var3 : (!(y0Var instanceof g4.w0) || ((y0Var2 instanceof g4.x0) && (y0Var4 instanceof g4.x0)) || (y0Var4 instanceof g4.v0)) ? y0Var4 : y0Var;
    }

    public final boolean b(g4.a1 type, boolean z17, g4.y0 state) {
        boolean b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        if (z17) {
            g4.z0 z0Var = this.f349798e;
            g4.z0 c17 = (z0Var != null ? z0Var : g4.z0.f350177d).c(type, state);
            this.f349798e = c17;
            b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c17, z0Var);
        } else {
            g4.z0 z0Var2 = this.f349797d;
            g4.z0 c18 = z0Var2.c(type, state);
            this.f349797d = c18;
            b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c18, z0Var2);
        }
        boolean z18 = !b17;
        g4.y0 y0Var = this.f349794a;
        g4.y0 y0Var2 = this.f349797d.f350178a;
        g4.z0 z0Var3 = this.f349798e;
        this.f349794a = a(y0Var, y0Var2, y0Var2, z0Var3 != null ? z0Var3.f350178a : null);
        g4.y0 y0Var3 = this.f349795b;
        g4.z0 z0Var4 = this.f349797d;
        g4.y0 y0Var4 = z0Var4.f350178a;
        g4.z0 z0Var5 = this.f349798e;
        this.f349795b = a(y0Var3, y0Var4, z0Var4.f350179b, z0Var5 != null ? z0Var5.f350179b : null);
        g4.y0 y0Var5 = this.f349796c;
        g4.z0 z0Var6 = this.f349797d;
        g4.y0 y0Var6 = z0Var6.f350178a;
        g4.z0 z0Var7 = this.f349798e;
        this.f349796c = a(y0Var5, y0Var6, z0Var6.f350180c, z0Var7 != null ? z0Var7.f350180c : null);
        return z18;
    }

    public final g4.a0 c() {
        return new g4.a0(this.f349794a, this.f349795b, this.f349796c, this.f349797d, this.f349798e);
    }
}
