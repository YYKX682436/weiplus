package mi4;

/* loaded from: classes9.dex */
public final class c extends ym5.m0 {
    @Override // ym5.m0
    public boolean d() {
        return false;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        hi4.e eVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exposedHolders, "exposedHolders");
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next();
            in5.s0 s0Var = k3Var instanceof in5.s0 ? (in5.s0) k3Var : null;
            if (s0Var != null && (eVar = (hi4.e) s0Var.f374658i) != null) {
                hi4.k kVar = hi4.m.f363088f;
                android.content.Context context = s0Var.f374654e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                java.lang.String str = hi4.m.f363089g + kVar.b(context).f363091e;
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eVar.N, str)) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
                    eVar.N = str;
                    java.lang.String field_session_id = eVar.f76597x1c3513c9;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_session_id, "field_session_id");
                    kVar.d(field_session_id, 101);
                }
            }
        }
    }
}
