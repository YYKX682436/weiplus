package mi4;

/* loaded from: classes9.dex */
public final class a extends ym5.m0 {
    @Override // ym5.m0
    public long c(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        long j17;
        android.view.View view;
        android.content.Context context;
        if (k3Var == null || (view = k3Var.f3639x46306858) == null || (context = view.getContext()) == null) {
            j17 = -1;
        } else {
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(hi4.m.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            j17 = ((hi4.m) a17).f363091e;
        }
        return super.c(k3Var) + j17;
    }

    @Override // ym5.m0
    public boolean d() {
        return false;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exposedHolders, "exposedHolders");
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next();
            in5.s0 s0Var = k3Var instanceof in5.s0 ? (in5.s0) k3Var : null;
            if (s0Var != null) {
                java.lang.Object obj = s0Var.f374658i;
                hi4.a aVar = obj instanceof hi4.a ? (hi4.a) obj : null;
                if (aVar != null) {
                    hi4.k kVar = hi4.m.f363088f;
                    android.content.Context context = s0Var.f374654e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    hi4.m b17 = kVar.b(context);
                    if (!ii4.b.a(aVar)) {
                        java.lang.String str = hi4.m.f363089g + b17.f363091e;
                        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar.f363074p1, str)) {
                            aVar.f363074p1 = str;
                            java.lang.String field_sessionId = aVar.f76582xbed8694c;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId, "field_sessionId");
                            kVar.d(field_sessionId, 52);
                        }
                    }
                }
            }
        }
    }
}
