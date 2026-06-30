package ze5;

/* loaded from: classes9.dex */
public class y1 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6, we5.b {

    /* renamed from: t, reason: collision with root package name */
    public static final ze5.q1 f553839t = new ze5.q1(null);

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f553840s;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.e1q);
        ze5.g1 g1Var = new ze5.g1();
        g1Var.a(xgVar, true);
        xgVar.setTag(g1Var);
        return xgVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        ot0.q v17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = msgData.f475787d.f526833b;
        if (f9Var == null) {
            return false;
        }
        int itemId = item.getItemId();
        if (itemId == 111) {
            if (f9Var.k2() && (v17 = ot0.q.v(f9Var.j())) != null) {
                int i17 = v17.f430199i;
                if (i17 == 40) {
                    db5.e1.y(ui6.g(), ui6.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c96), "", ui6.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), null);
                    return false;
                }
                if (i17 == 33 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.SessionAppbrand.k(ui6.g(), null)) {
                    return false;
                }
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.s1.c(ui6, f9Var, A(ui6, f9Var), -1, null);
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

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ab, code lost:
    
        if (ez.v0.b(r8, r14, null, null, 6, null) != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00d7  */
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Q(db5.g4 r19, android.view.View r20, rd5.d r21) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ze5.y1.Q(db5.g4, android.view.View, rd5.d):boolean");
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        return f553839t.a(dVar, msg);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean a0() {
        return true;
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

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6
    public void d(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (view == null || dVar == null || f9Var == null) {
            return;
        }
        db5.e1.A(dVar.g(), dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5h), "", dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572076y2), dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new ze5.w1(f9Var, dVar), ze5.x1.f553824d);
    }

    @Override // we5.b
    public void e(yb5.d ui6, rd5.d msgData, java.lang.String str, we5.y0 uiBlock) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiBlock, "uiBlock");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = msgData.f475787d.f526833b;
        this.f553840s = ui6;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.c cVar = ui6.f542241c;
        sb5.e0 e0Var = (sb5.e0) cVar.a(sb5.e0.class);
        if (e0Var != null) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f7) e0Var).n0(f9Var);
        }
        sb5.e0 e0Var2 = (sb5.e0) cVar.a(sb5.e0.class);
        if (e0Var2 != null) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f7) e0Var2).m0(f9Var);
        }
        java.lang.String U1 = f9Var.U1();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        ot0.q v17 = ot0.q.v(U1);
        h0Var.f391656d = v17;
        if (v17 != null) {
            ze5.b2.a(ze5.d2.f553406a, f9Var, v17, null);
            if (te5.e2.e((ot0.q) h0Var.f391656d)) {
                uiBlock.d(new ze5.r1(h0Var, ui6, f9Var));
            } else {
                uiBlock.d(ze5.s1.f553719d);
            }
            uiBlock.d(new ze5.t1(this, f9Var));
        }
        z01.m e17 = ze5.g2.e(f9Var, ui6);
        e17.D = w(ui6);
        e17.E = u(ui6);
        sb5.z zVar = (sb5.z) cVar.a(sb5.z.class);
        e17.F = zVar != null ? ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).B1 : null;
        uiBlock.d(new ze5.u1(e17, msgData, ui6, h0Var));
        uiBlock.d(new ze5.v1(this, msgData, ui6));
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
