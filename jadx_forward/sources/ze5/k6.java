package ze5;

/* loaded from: classes9.dex */
public final class k6 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qk implements we5.b {
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.e1y);
        ze5.m6 m6Var = new ze5.m6();
        m6Var.a(xgVar, false);
        xgVar.setTag(m6Var);
        return xgVar;
    }

    @Override // we5.b
    public rd5.d b(we5.a params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        return new ze5.n6(params);
    }

    @Override // we5.b
    public boolean c() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // we5.b
    public void e(yb5.d ui6, rd5.d msgData, java.lang.String str, we5.y0 uiBlocks) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiBlocks, "uiBlocks");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = msgData.f475787d.f526833b;
        this.f286909s = ui6;
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 N = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(f9Var.z0());
        if (N == null) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.y4 y4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.y4(f9Var.j());
        z01.k kVar = new z01.k();
        boolean z17 = y4Var.f277888c;
        android.app.Activity g17 = ui6.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getContext(...)");
        af5.y0.a(kVar, f9Var, N, z17, g17);
        N.D2 = f9Var.Q0();
        uiBlocks.d(new ze5.h6(this, f9Var, N, ui6));
        if (N.k() && !y4Var.f277888c) {
            y4Var.f277888c = true;
            f9Var.d1(y4Var.d());
            f9Var.r1(pt0.f0.f439742b1.n(f9Var.Q0(), f9Var.m124847x74d37ac6()).P0());
            com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u();
            g9Var.getClass();
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("content", f9Var.j());
            contentValues.put("status", java.lang.Integer.valueOf(f9Var.P0()));
            if (g9Var.Pb(g9Var.P8(f9Var.m124847x74d37ac6(), f9Var.Q0()))) {
                up5.w wVar = new up5.w();
                i17 = ot0.z2.f430355a.u1(g9Var.f275522r, g9Var.P8(f9Var.m124847x74d37ac6(), f9Var.Q0()), wVar, g95.e0.l(wVar, contentValues), f9Var.m124847x74d37ac6());
            } else {
                i17 = g9Var.f275522r.p(g9Var.P8(f9Var.m124847x74d37ac6(), f9Var.Q0()), contentValues, "msgId=?", new java.lang.String[]{java.lang.String.valueOf(f9Var.m124847x74d37ac6())});
            }
            if (i17 != 0) {
                g9Var.m145262xf35bbb4();
                g9Var.m0(new xg3.l0(f9Var.Q0(), "update", f9Var, 0));
            }
        }
        uiBlocks.d(new ze5.i6(msgData, ui6, kVar, this));
        uiBlocks.d(new ze5.j6(this, msgData, ui6));
        com.p314xaae8f345.mm.p2621x8fb0427b.a9 a9Var = f9Var.f275460g2;
        ze5.l6 l6Var = a9Var instanceof ze5.l6 ? (ze5.l6) a9Var : null;
        if (l6Var == null) {
            return;
        }
        wd5.b model = l6Var.f553603d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(model, "model");
        com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e quoteItem = l6Var.f553604e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(quoteItem, "quoteItem");
        uiBlocks.d(new lf5.e(ui6, f9Var, this, model, quoteItem));
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public com.p314xaae8f345.mm.p2621x8fb0427b.a9 i(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.content.Context context, yb5.q qVar, yb5.a componentProvider) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(componentProvider, "componentProvider");
        wd5.b bVar = new wd5.b();
        java.lang.String j17 = f9Var != null ? f9Var.j() : null;
        if (!(j17 == null || j17.length() == 0)) {
            r15.b bVar2 = new r15.b();
            bVar2.m126728xdc93280d(j17);
            bVar.k(bVar2.n());
        }
        if (qVar == null || (str = qVar.f542275a) == null) {
            str = "";
        }
        return new ze5.l6(bVar, lf5.g.c(bVar, str));
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 tag, yb5.d ui6, rd5.d msgData, java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        ze5.m6 m6Var = tag instanceof ze5.m6 ? (ze5.m6) tag : null;
        if (m6Var != null) {
            e(ui6, msgData, userName, new we5.y0(new we5.u0(m6Var)));
        }
    }
}
