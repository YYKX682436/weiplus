package jn2;

/* loaded from: classes5.dex */
public final class o extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jn2.w f382191a;

    public o(jn2.w wVar) {
        this.f382191a = wVar;
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
                jn2.w wVar = this.f382191a;
                jn2.c1 c1Var = wVar.f382270x;
                if (c1Var == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchAdapter");
                    throw null;
                }
                jn2.w0 w0Var = (jn2.w0) kz5.n0.a0(c1Var.f382107n, b1Var.m8183xf806b362());
                if (w0Var != null && (str = (ay1Var = w0Var.f382273a).f451883d) != null) {
                    java.util.Set set = wVar.E;
                    if (!set.contains(str)) {
                        set.add(str);
                        sf2.x xVar = wVar.f382255f;
                        xVar.getClass();
                        te2.a9.f499416a.a(xVar.h7(), 2, null, null, ay1Var);
                    }
                }
            }
        }
    }
}
