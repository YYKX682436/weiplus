package fn2;

/* loaded from: classes5.dex */
public final class o0 extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fn2.s0 f345875a;

    public o0(fn2.s0 s0Var) {
        this.f345875a = s0Var;
    }

    @Override // ym5.m0
    public float b(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        return 0.5f;
    }

    @Override // ym5.m0
    public boolean d() {
        return false;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        hn2.d dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exposedHolders, "exposedHolders");
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next();
            bm2.i6 i6Var = k3Var instanceof bm2.i6 ? (bm2.i6) k3Var : null;
            if (i6Var != null) {
                fn2.s0 s0Var = this.f345875a;
                bm2.o6 o6Var = s0Var.f345921g;
                if (o6Var == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rvAdapter");
                    throw null;
                }
                bm2.h6 h6Var = (bm2.h6) kz5.n0.a0(o6Var.f103737t, i6Var.m8183xf806b362());
                if (h6Var != null && (dVar = h6Var.f103480b) != null && !s0Var.m129823xfba10318().contains(dVar.f364038a)) {
                    bm2.o6 o6Var2 = s0Var.f345921g;
                    if (o6Var2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rvAdapter");
                        throw null;
                    }
                    o6Var2.I(1, 3, dVar);
                    bm2.o6 o6Var3 = s0Var.f345921g;
                    if (o6Var3 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rvAdapter");
                        throw null;
                    }
                    o6Var3.I(1, 4, dVar);
                    s0Var.m129823xfba10318().add(dVar.f364038a);
                }
            }
        }
    }
}
