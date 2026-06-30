package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes10.dex */
public final class i8 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f285703a;

    /* renamed from: b, reason: collision with root package name */
    public yb5.d f285704b;

    public i8(boolean z17) {
        this.f285703a = z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0343  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 r35, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21906x55a50a7f r36, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.q r37, yb5.d r38, rd5.d r39, java.lang.String r40) {
        /*
            Method dump skipped, instructions count: 987
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i8.a(com.tencent.mm.ui.chatting.viewitems.a0, com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFinderOrder$AppMsgFinderOrderHolder, com.tencent.mm.ui.chatting.adapter.q, yb5.d, rd5.d, java.lang.String):void");
    }

    public final android.view.View b(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        boolean z17 = this.f285703a;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg xgVar = z17 ? new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570036v3) : new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570079wn);
        xgVar.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21906x55a50a7f().m79977x59bc66e(xgVar, !z17));
        return xgVar;
    }

    public final boolean c(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 chattingItem, db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingItem, "chattingItem");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar != null ? dVar.f475787d.f526833b : null;
        if (g4Var == null || view == null) {
            return false;
        }
        yb5.d dVar2 = this.f285704b;
        if (dVar2 != null) {
            if (this.f285703a) {
                java.lang.Object tag = view.getTag();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) tag).d();
                if (f9Var != null) {
                    g4Var.removeItem(116);
                }
            } else {
                java.lang.Object tag2 = view.getTag();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag2, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
                int d17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) tag2).d();
                if (f9Var != null) {
                    g4Var.removeItem(116);
                    if ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.L(f9Var, dVar2) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.J(f9Var.Q0()) && !dVar2.A()) {
                        g4Var.c(d17, 123, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572402b40), com.p314xaae8f345.mm.R.raw.f79868x8752620f);
                    }
                }
            }
        }
        return true;
    }

    public final boolean d(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        ot0.q v17 = ot0.q.v(msg.U1());
        if (v17 == null || dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgFinderOrder", "onItemClick content is null");
        } else {
            r45.un2 un2Var = ((zy2.j) v17.y(zy2.j.class)).f558959b;
            android.app.Activity g17 = dVar.g();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getContext(...)");
            java.lang.String m75945x2fec8307 = un2Var.m75945x2fec8307(6);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            java.lang.String m75945x2fec83072 = un2Var.m75945x2fec8307(7);
            java.lang.String str = m75945x2fec83072 != null ? m75945x2fec83072 : "";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgFinderOrder", "enterShoppingWeApp appId:" + m75945x2fec8307 + ",enterPath:" + str);
            l81.b1 b1Var = new l81.b1();
            b1Var.f398547b = m75945x2fec8307;
            b1Var.f398555f = str;
            b1Var.f398565k = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.p0.f34638x366c91de;
            ((c61.i8) ((vd2.i5) i95.n0.c(vd2.i5.class))).getClass();
            b1Var.f398549c = zl2.q4.f555466a.x();
            b1Var.G = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1(true, 0, null, false, null, false, null, k91.t2.f387301f, false, false, null, null, false, false, null, false, 0, null, 0, 0, 0, false, false, false, null, false, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.CustomSubjectInfo.f158919f, 0, false, null, false, 0, false, false, false, false, null, null, null, false, null, null, false, -67108994, 2047, null);
            b1Var.L = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.h8();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(g17, b1Var);
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.c0.f280389r.b(dVar, view, msg);
        ((b00.a0) ((c00.u3) i95.n0.c(c00.u3.class))).aj("view_clk", msg, "ecs_kf_card_order");
        return true;
    }

    public final void e(android.view.View v17, yb5.d ui6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (this.f285703a || !msg.k2()) {
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.z(msg);
        c01.w9.f(msg.m124847x74d37ac6(), msg.Q0());
        ui6.L(true);
    }
}
