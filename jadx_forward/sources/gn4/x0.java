package gn4;

/* loaded from: classes15.dex */
public class x0 extends fn4.d {
    @Override // fn4.d
    public void b(fn4.b bVar) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 mo72292x4905e9fa = bVar.mo72292x4905e9fa();
        fn4.m a17 = fn4.d.a(bVar);
        if (a17 instanceof gn4.d1) {
            gn4.d1 d1Var = (gn4.d1) a17;
            int m8183xf806b362 = d1Var != null ? d1Var.m8183xf806b362() : -1;
            if (m8183xf806b362 != bVar.Y2() && bVar.I2().f346109e) {
                bVar.I2().m();
                if (d1Var != null) {
                    bVar.o4().e(d1Var.f346117e);
                }
            }
            bVar.t();
            for (int i17 = 0; i17 < mo72292x4905e9fa.getChildCount(); i17++) {
                android.view.View childAt = mo72292x4905e9fa.getChildAt(i17);
                if (childAt.getTag() != null) {
                    gn4.d1 d1Var2 = (gn4.d1) bVar.mo72292x4905e9fa().w0(childAt);
                    if (d1Var2.m8183xf806b362() == m8183xf806b362) {
                        d1Var2.m();
                        if (!bVar.I2().f346109e) {
                            d1Var2.f355138h.s();
                        }
                    } else {
                        d1Var2.f355138h.t();
                    }
                }
            }
        }
    }

    @Override // fn4.d
    public void c(fn4.b bVar) {
        fn4.m a17 = fn4.d.a(bVar);
        if (a17 instanceof gn4.d1) {
            if (!bVar.I2().f346109e) {
                if (bVar.s1().b()) {
                    a17.s(true);
                } else {
                    a17.i().h();
                    bVar.I2().m();
                }
            }
            a17.m();
            bVar.X1(a17.u());
            bVar.o4().c();
        }
    }
}
