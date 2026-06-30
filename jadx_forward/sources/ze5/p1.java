package ze5;

/* loaded from: classes9.dex */
public class p1 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 implements we5.b {

    /* renamed from: t, reason: collision with root package name */
    public static final ze5.h1 f553671t = new ze5.h1(null);

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f553672s;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.e1b);
        ze5.g1 g1Var = new ze5.g1();
        g1Var.a(xgVar, false);
        xgVar.setTag(g1Var);
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
                db5.e1.k(ui6.g(), com.p314xaae8f345.mm.R.C30867xcad56011.ie8, com.p314xaae8f345.mm.R.C30867xcad56011.ie_, com.p314xaae8f345.mm.R.C30867xcad56011.f572131zk, com.p314xaae8f345.mm.R.C30867xcad56011.b5k, true, new ze5.n1(str, ui6), new ze5.o1(ui6, f9Var, this, str));
            }
        } else if (itemId == 114) {
            java.lang.String j17 = f9Var.j();
            if (j17 != null && ot0.q.v(j17) != null) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.ed.b(f9Var, c01.w9.l(ui6.D(), f9Var.j(), f9Var.A0()), ui6.g(), 256);
            }
        } else if (itemId == 174) {
            ze5.g2.c(f9Var, ui6);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0105, code lost:
    
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.z4.f(r14, r8.f68099xfeae815) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c1, code lost:
    
        if (ez.v0.b(r0, r14, r1, null, 4, null) != false) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0135  */
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Q(db5.g4 r26, android.view.View r27, rd5.d r28) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ze5.p1.Q(db5.g4, android.view.View, rd5.d):boolean");
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        return f553671t.a(dVar, msg);
    }

    @Override // we5.b
    public rd5.d b(we5.a params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        return new ze5.f1(params);
    }

    @Override // we5.b
    public boolean c() {
        return true;
    }

    @Override // we5.b
    public void e(yb5.d ui6, rd5.d msgData, java.lang.String str, we5.y0 uiBlock) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiBlock, "uiBlock");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = msgData.f475787d.f526833b;
        this.f553672s = ui6;
        uiBlock.d(new ze5.i1(ui6, f9Var));
        java.lang.String U1 = f9Var.U1();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        ot0.q v17 = ot0.q.v(U1);
        h0Var.f391656d = v17;
        if (v17 != null) {
            lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
            java.lang.Object obj = h0Var.f391656d;
            java.lang.String str2 = ((ot0.q) obj).f430179d;
            int i17 = ((ot0.q) obj).G;
            ((kt.c) i0Var).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m i18 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.i(str2, i17);
            ze5.b2.a(ze5.d2.f553406a, f9Var, (ot0.q) h0Var.f391656d, null);
            if (i18 != null) {
                q(ui6, (ot0.q) h0Var.f391656d, f9Var);
            }
            if (te5.e2.e((ot0.q) h0Var.f391656d)) {
                uiBlock.d(new ze5.j1(h0Var, ui6, f9Var));
            } else {
                uiBlock.d(ze5.k1.f553575d);
            }
            uiBlock.d(ze5.l1.f553593d);
        }
        z01.m e17 = ze5.g2.e(f9Var, ui6);
        e17.D = w(ui6);
        e17.E = u(ui6);
        sb5.z zVar = (sb5.z) ui6.f542241c.a(sb5.z.class);
        e17.F = zVar != null ? ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).B1 : null;
        uiBlock.d(new ze5.m1(e17, msgData, ui6, h0Var));
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public com.p314xaae8f345.mm.p2621x8fb0427b.a9 i(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.content.Context context, yb5.q talkerInfo, yb5.a componentProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talkerInfo, "talkerInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(componentProvider, "componentProvider");
        return new ze5.c2(f9Var);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 tag, yb5.d ui6, rd5.d msgData, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        ze5.g1 g1Var = tag instanceof ze5.g1 ? (ze5.g1) tag : null;
        if (g1Var != null) {
            e(ui6, msgData, str, new we5.y0(new we5.u0(g1Var)));
        }
    }
}
