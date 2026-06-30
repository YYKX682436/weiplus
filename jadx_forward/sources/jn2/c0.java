package jn2;

/* loaded from: classes5.dex */
public final class c0 extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jn2.f0 f382098a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sf2.x f382099b;

    public c0(jn2.f0 f0Var, sf2.x xVar) {
        this.f382098a = f0Var;
        this.f382099b = xVar;
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
        r45.ay1 ay1Var;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exposedHolders, "exposedHolders");
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next();
            jn2.b1 b1Var = k3Var instanceof jn2.b1 ? (jn2.b1) k3Var : null;
            if (b1Var != null) {
                int m8183xf806b362 = b1Var.m8183xf806b362();
                jn2.f0 f0Var = this.f382098a;
                jn2.c1 c1Var = f0Var.f382133f;
                if (c1Var == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rvAdapter");
                    throw null;
                }
                jn2.w0 w0Var = (jn2.w0) kz5.n0.a0(c1Var.f382107n, m8183xf806b362);
                if (w0Var != null && (str = (ay1Var = w0Var.f382273a).f451883d) != null) {
                    java.util.Set set = f0Var.f382145u;
                    if (!set.contains(str)) {
                        set.add(str);
                        r45.ch6 ch6Var = f0Var.f382138n;
                        r45.in inVar = f0Var.f382141q;
                        sf2.x xVar = this.f382099b;
                        xVar.getClass();
                        te2.a9.f499416a.a(xVar.h7(), 2, inVar, ch6Var, ay1Var);
                    }
                }
            }
        }
    }
}
