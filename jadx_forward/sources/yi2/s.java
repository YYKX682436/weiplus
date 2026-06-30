package yi2;

/* loaded from: classes10.dex */
public final class s implements p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yi2.i0 f544121d;

    public s(yi2.i0 i0Var) {
        this.f544121d = i0Var;
    }

    public static final void a(vi2.b bVar, java.util.Map map) {
        r45.xn1 xn1Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        km2.q qVar = bVar.f519069f;
        java.lang.String m76197x6c03c64c = (qVar == null || (xn1Var = qVar.f390720r) == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa.m76197x6c03c64c();
        if (m76197x6c03c64c == null || m76197x6c03c64c.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveMicAnchorWidget", "username is null or empty");
        } else {
            map.put(m76197x6c03c64c, new hi2.a(bVar.f519069f));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a
    public void R3(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        yi2.i0 i0Var = this.f544121d;
        int u07 = i0Var.E.u0(view);
        if (u07 < 0 || u07 >= i0Var.f544054g.size()) {
            return;
        }
        java.lang.Object obj = i0Var.f544054g.get(u07);
        vi2.b bVar = obj instanceof vi2.b ? (vi2.b) obj : null;
        if (bVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveMicAnchorWidget", " dataList[position] is not FinderLiveMicAnchorWidgetConvertData");
            return;
        }
        int h17 = ((in5.c) i0Var.f544054g.get(u07)).h();
        if (h17 == 2) {
            if (i0Var.C) {
                i0Var.C = false;
                fj2.s.f344716a.d(ml2.q2.V, i0Var.f544068x, null);
                return;
            }
            return;
        }
        if (h17 == 3) {
            a(bVar, i0Var.f544070z);
            return;
        }
        if (h17 == 6) {
            a(bVar, i0Var.A);
            return;
        }
        switch (h17) {
            case 9:
                a(bVar, i0Var.B);
                return;
            case 10:
                i0Var.k();
                return;
            case 11:
                a(bVar, i0Var.f544070z);
                return;
            default:
                return;
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a
    public void p3(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
    }
}
