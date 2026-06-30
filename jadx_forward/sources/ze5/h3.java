package ze5;

/* loaded from: classes9.dex */
public class h3 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 implements we5.b {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f553493s;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.e1d);
        ze5.y2 y2Var = new ze5.y2();
        y2Var.a(xgVar, false);
        xgVar.setTag(y2Var);
        return xgVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = msgData.f475787d.f526833b;
        if (f9Var == null) {
            return false;
        }
        int itemId = item.getItemId();
        if (itemId == 111) {
            if (!com.p314xaae8f345.mm.ui.p2650x55bb7a46.la.a(f9Var)) {
                db5.e1.y(ui6.g(), ui6.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c96), "", ui6.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), null);
                return false;
            }
            java.lang.String s17 = c01.ia.s(f9Var);
            java.lang.String str = s17 != null ? s17 : "";
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.s1.c(ui6, f9Var, A(ui6, f9Var), -1, null);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(17509, 3, str);
                db5.e1.k(ui6.g(), com.p314xaae8f345.mm.R.C30867xcad56011.ie8, com.p314xaae8f345.mm.R.C30867xcad56011.ie_, com.p314xaae8f345.mm.R.C30867xcad56011.f572131zk, com.p314xaae8f345.mm.R.C30867xcad56011.b5k, true, new ze5.f3(str, ui6), new ze5.g3(ui6, f9Var, this, str));
            }
        } else if (itemId != 114) {
            if (itemId == 174) {
                ze5.z3.c(f9Var, ui6);
            }
        } else {
            if (f9Var.j() == null) {
                return false;
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.ed.b(f9Var, c01.w9.l(ui6.D(), f9Var.j(), f9Var.A0()), ui6.g(), 256);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x013a, code lost:
    
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.z4.f(r14, r8.f68099xfeae815) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f6, code lost:
    
        if (ez.v0.b(r8, r14, r0, null, 4, null) != false) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01da  */
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Q(db5.g4 r24, android.view.View r25, rd5.d r26) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ze5.h3.Q(db5.g4, android.view.View, rd5.d):boolean");
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (dVar == null) {
            return false;
        }
        com.p314xaae8f345.mm.p959x883644fd.b.d(msg, com.p314xaae8f345.mm.p959x883644fd.a.Click, dVar.f542255q, dVar.k());
        android.app.Activity g17 = dVar.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getContext(...)");
        if (te5.t.b(msg, g17)) {
            return false;
        }
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(msg.Q0(), 1);
        java.lang.String j17 = msg.j();
        if (j17 == null) {
            return false;
        }
        v05.b bVar = new v05.b();
        bVar.m126728xdc93280d(j17);
        int i17 = bVar.f513848e + 73;
        int m75939xb282bd08 = bVar.m75939xb282bd08(i17);
        int i18 = bVar.f449898d;
        if (m75939xb282bd08 != 0) {
            bVar.set(i18 + 6, java.lang.Integer.valueOf(bVar.m75939xb282bd08(i17)));
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String m75945x2fec8307 = bVar.m75945x2fec8307(i18 + 0);
        ((kt.c) i0Var).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m j18 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.j(m75945x2fec8307, false, false);
        java.lang.String t17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.t(dVar, msg);
        if (t17 == null) {
            t17 = "";
        }
        java.lang.String str = t17;
        if (j18 != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.f(dVar, bVar, str, j18, msg.I0(), dVar.x());
        }
        sc5.g gVar = sc5.g.f488105a;
        android.app.Activity g18 = dVar.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g18, "getContext(...)");
        java.lang.String str2 = dVar.f542255q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getSessionConv(...)");
        gVar.f(g18, msg, new sc5.h(str2));
        return true;
    }

    @Override // we5.b
    public rd5.d b(we5.a params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        return new ze5.x2(params);
    }

    @Override // we5.b
    public boolean c() {
        return true;
    }

    @Override // we5.b
    public void e(yb5.d ui6, rd5.d msgData, java.lang.String str, we5.y0 uiBlock) {
        java.lang.String m144874x52c258a2;
        java.lang.Integer h17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiBlock, "uiBlock");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = msgData.f475787d.f526833b;
        this.f553493s = ui6;
        uiBlock.d(new ze5.z2(ui6, f9Var));
        uiBlock.d(new ze5.a3(f9Var));
        java.lang.String U1 = f9Var.U1();
        l15.c cVar = new l15.c();
        cVar.m126728xdc93280d(U1 == null ? "" : U1);
        v05.b bVar = new v05.b();
        if (U1 == null) {
            U1 = "";
        }
        bVar.m126728xdc93280d(U1);
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        int i17 = bVar.f449898d;
        java.lang.String m75945x2fec8307 = bVar.m75945x2fec8307(i17 + 0);
        l15.b j17 = cVar.j();
        boolean z17 = false;
        int intValue = (j17 == null || (m144874x52c258a2 = j17.m144874x52c258a2()) == null || (h17 = r26.h0.h(m144874x52c258a2)) == null) ? 0 : h17.intValue();
        ((kt.c) i0Var).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m i18 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.i(m75945x2fec8307, intValue);
        ze5.u3.a(ze5.w3.f553812a, f9Var, bVar);
        int i19 = bVar.f513848e;
        if (i18 != null) {
            r(ui6, java.lang.Integer.valueOf(bVar.m75939xb282bd08(i19 + 53)), bVar.m75945x2fec8307(i17 + 0), bVar.m75939xb282bd08(i17 + 6), bVar.m75945x2fec8307(i19 + 15), f9Var);
        }
        p15.x xVar = (p15.x) bVar.m75936x14adae67(i19 + 68);
        if (xVar != null && xVar.n() == 1) {
            z17 = true;
        }
        if (z17) {
            uiBlock.d(new ze5.b3(bVar, ui6, f9Var));
        } else {
            uiBlock.d(ze5.c3.f553399d);
        }
        uiBlock.d(ze5.d3.f553407d);
        z01.m d17 = ze5.z3.d(f9Var, ui6);
        d17.D = w(ui6);
        d17.E = u(ui6);
        sb5.z zVar = (sb5.z) ui6.f542241c.a(sb5.z.class);
        d17.F = zVar != null ? ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).B1 : null;
        uiBlock.d(new ze5.e3(d17, msgData, ui6, bVar));
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public com.p314xaae8f345.mm.p2621x8fb0427b.a9 i(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.content.Context context, yb5.q talkerInfo, yb5.a componentProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talkerInfo, "talkerInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(componentProvider, "componentProvider");
        return new ze5.v3(f9Var);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 tag, yb5.d ui6, rd5.d msgData, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        ze5.y2 y2Var = tag instanceof ze5.y2 ? (ze5.y2) tag : null;
        if (y2Var != null) {
            e(ui6, msgData, str, new we5.y0(new we5.u0(y2Var)));
        }
    }
}
