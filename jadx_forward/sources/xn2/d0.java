package xn2;

/* loaded from: classes2.dex */
public final class d0 extends gp1.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xn2.p0 f537017a;

    public d0(xn2.p0 p0Var) {
        this.f537017a = p0Var;
    }

    @Override // gp1.a0, gp1.z
    public void N0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        xn2.p0 p0Var = this.f537017a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p0Var.f537078c, "onFloatBallDeleteButtonClick " + c12886x91aa2b6d);
        boolean z17 = false;
        if (c12886x91aa2b6d != null && c12886x91aa2b6d.f174579d == 32) {
            z17 = true;
        }
        if (z17) {
            p0Var.f537083h.f305245w = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nb0.F0((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nb0) pf5.u.f435469a.e(zy2.b6.class).c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nb0.class), vn2.u0.f519920a.h(), null, 2, null);
            xn2.b bVar = p0Var.f537080e;
            java.lang.Object layoutManager = bVar != null ? ((xn2.f1) bVar).m175696x4905e9fa().getLayoutManager() : null;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
            if (c1162x665295de != null) {
                int t17 = c1162x665295de.t();
                int x17 = c1162x665295de.x();
                if (t17 != -1 && x17 != -1 && t17 <= x17) {
                    while (true) {
                        so2.j5 j5Var = (so2.j5) p0Var.j().m56388xcaeb60d0().get(t17);
                        if (j5Var instanceof zn2.a) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p0Var.f537078c, "updateVisibleFeedPlayProgress " + pm0.v.u(j5Var.mo2128x1ed62e84()) + " index=" + t17);
                            xn2.b bVar2 = p0Var.f537080e;
                            if (bVar2 != null) {
                                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mj) ((xn2.f1) bVar2).a()).mo56050xa44dd169(t17, 1, 103);
                            }
                        }
                        if (t17 == x17) {
                            break;
                        } else {
                            t17++;
                        }
                    }
                }
            }
            dw2.c0 c0Var = p0Var.f537083h.f305236n;
            if (c0Var != null) {
                c0Var.w0(p0Var.f537078c);
            }
        }
    }
}
