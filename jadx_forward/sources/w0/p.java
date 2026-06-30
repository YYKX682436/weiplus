package w0;

/* loaded from: classes14.dex */
public final class p implements w0.h {

    /* renamed from: d, reason: collision with root package name */
    public static final w0.x f523388d = w0.b0.a(w0.i.f523372d, w0.j.f523373d);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f523389a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f523390b;

    /* renamed from: c, reason: collision with root package name */
    public w0.s f523391c;

    public p(java.util.Map savedStates) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(savedStates, "savedStates");
        this.f523389a = savedStates;
        this.f523390b = new java.util.LinkedHashMap();
    }

    public void a(java.lang.Object key, yz5.p content, n0.o oVar, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-111644091);
        y0Var.U(-1530021272);
        y0Var.W(207, key);
        y0Var.U(1516495192);
        y0Var.U(-3687241);
        java.lang.Object y17 = y0Var.y();
        if (y17 == n0.n.f415153a) {
            w0.s sVar = this.f523391c;
            if (!(sVar == null ? true : sVar.b(key))) {
                throw new java.lang.IllegalArgumentException(("Type of the key " + key + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
            y17 = new w0.l(this, key);
            y0Var.g0(y17);
        }
        y0Var.o(false);
        w0.l lVar = (w0.l) y17;
        n0.n1.a(new n0.i3[]{w0.w.f523400a.b(lVar.f523377c)}, content, y0Var, (i17 & 112) | 8);
        n0.d2.c(jz5.f0.f384359a, new w0.n(this, key, lVar), y0Var, 0);
        y0Var.o(false);
        if (y0Var.f415317y && y0Var.E.f415109h == y0Var.f415318z) {
            y0Var.f415318z = -1;
            y0Var.f415317y = false;
        }
        y0Var.o(false);
        y0Var.o(false);
        n0.f4 q17 = y0Var.q();
        if (q17 == null) {
            return;
        }
        ((n0.l3) q17).f415141d = new w0.o(this, key, content, i17);
    }
}
