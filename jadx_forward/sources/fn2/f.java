package fn2;

/* loaded from: classes5.dex */
public final class f extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fn2.s f345786a;

    public f(fn2.s sVar) {
        this.f345786a = sVar;
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
                fn2.s sVar = this.f345786a;
                bm2.h6 h6Var = (bm2.h6) kz5.n0.a0(sVar.f345910p.f103737t, i6Var.m8183xf806b362());
                if (h6Var != null && (dVar = h6Var.f103480b) != null) {
                    java.util.Set set = sVar.f345911q;
                    if (!set.contains(dVar.f364038a)) {
                        sVar.f345910p.I(1, 3, dVar);
                        set.add(dVar.f364038a);
                    }
                }
            }
        }
    }
}
