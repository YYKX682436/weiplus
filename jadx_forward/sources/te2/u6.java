package te2;

/* loaded from: classes3.dex */
public final class u6 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f500006d;

    public u6(te2.p8 p8Var) {
        this.f500006d = p8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        r45.u75 u75Var;
        java.lang.String m75945x2fec8307;
        r45.h32 h32Var;
        java.lang.String string;
        int itemId = menuItem.getItemId();
        te2.p8 p8Var = this.f500006d;
        if (itemId == 7) {
            te2.p8.n7(p8Var, 10, 0, 2, null);
            te2.rc rcVar = p8Var.A1;
            r45.h32 h32Var2 = rcVar.f499924b;
            java.lang.Integer valueOf = h32Var2 != null ? java.lang.Integer.valueOf(h32Var2.m75939xb282bd08(18)) : null;
            r45.h32 h32Var3 = p8Var.f499853p1;
            if (h32Var3 == null) {
                h32Var3 = rcVar.f499924b;
            }
            if (h32Var3 != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c80) ((jz5.n) p8Var.W).mo141623x754a37bb()).e0(h32Var3, 1, new te2.g6(valueOf, p8Var));
                return;
            }
            return;
        }
        if (itemId == 1) {
            te2.rc rcVar2 = p8Var.A1;
            if (rcVar2 != null && (h32Var = rcVar2.f499924b) != null) {
                r45.h32 h32Var4 = p8Var.f499853p1;
                if ((h32Var4 != null ? h32Var4.m75939xb282bd08(5) : 0) > 0) {
                    android.app.Activity m80379x76847179 = p8Var.m80379x76847179();
                    java.lang.String string2 = p8Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573255e13);
                    r45.q65 q65Var = (r45.q65) h32Var.m75936x14adae67(10);
                    if ((q65Var != null && q65Var.m75933x41a8a7f2(0)) != false) {
                        r45.q65 q65Var2 = (r45.q65) h32Var.m75936x14adae67(10);
                        if (!(q65Var2 != null && q65Var2.m75939xb282bd08(1) == 0)) {
                            string = p8Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e18);
                            cf2.h hVar = new cf2.h(m80379x76847179, string2, string, p8Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573258e16), p8Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573256e14));
                            hVar.C();
                            hVar.R = new te2.h6(p8Var, h32Var, hVar);
                        }
                    }
                    string = p8Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e17);
                    cf2.h hVar2 = new cf2.h(m80379x76847179, string2, string, p8Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573258e16), p8Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573256e14));
                    hVar2.C();
                    hVar2.R = new te2.h6(p8Var, h32Var, hVar2);
                } else {
                    p8Var.V6(h32Var, null);
                }
            }
            te2.p8.n7(p8Var, 3, 0, 2, null);
            return;
        }
        if (itemId == 8) {
            ya2.b2 b17 = ya2.h.f542017a.b(xy2.c.e(p8Var.m80379x76847179()));
            if (b17 != null) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa i18 = ya2.d.i(b17);
                i95.m c17 = i95.n0.c(c61.ub.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                c61.ub ubVar = (c61.ub) c17;
                android.app.Activity m80379x768471792 = p8Var.m80379x76847179();
                r45.l32 l32Var = p8Var.Z;
                c61.ub.A3(ubVar, m80379x768471792, null, i18, 1012, false, null, l32Var != null ? (r45.h32) l32Var.m75936x14adae67(1) : null, false, null, null, na1.e.f72905x366c91de, null);
                p8Var.m158354x19263085().finish();
                return;
            }
            return;
        }
        if (itemId == 2) {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new te2.k6(p8Var, null), 3, null);
            te2.p8.n7(p8Var, 2, 0, 2, null);
            return;
        }
        if (itemId == 3) {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new te2.n6(p8Var, null), 3, null);
            te2.p8.n7(p8Var, 4, 0, 2, null);
            return;
        }
        if (itemId == 4) {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new te2.q6(p8Var, null), 3, null);
            return;
        }
        if (itemId == 5) {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new te2.t6(p8Var, null), 3, null);
            te2.p8.n7(p8Var, 8, 0, 2, null);
            return;
        }
        if (itemId != 6 || (u75Var = p8Var.f499863x1) == null || (m75945x2fec8307 = u75Var.m75945x2fec8307(1)) == null) {
            return;
        }
        if (!(m75945x2fec8307.length() > 0)) {
            m75945x2fec8307 = null;
        }
        if (m75945x2fec8307 != null) {
            p8Var.m7(6, 1);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", m75945x2fec8307);
            j45.l.j(p8Var.m80379x76847179(), "webview", ".ui.tools.WebViewUI", intent, null);
        }
    }
}
