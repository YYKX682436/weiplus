package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public final class mm extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f286119s;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater inflater, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inflater, "inflater");
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(inflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.x_);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.jm jmVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.jm();
        jmVar.a(xgVar, false);
        xgVar.setTag(jmVar);
        return xgVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean N() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = msgData.f475787d.f526833b;
        if (item.getItemId() != 111) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.om.f286747a.b(ui6, f9Var);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = msgData.f475787d.f526833b;
        if (f9Var == null) {
            return true;
        }
        java.lang.Object tag = v17.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
        int d17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) tag).d();
        yb5.d dVar = this.f286119s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar);
        menu.c(d17, 111, 0, dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
        menu.removeItem(116);
        if ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.L(f9Var, this.f286119s) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.J(f9Var.Q0())) {
            yb5.d dVar2 = this.f286119s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar2);
            if (!dVar2.A()) {
                menu.c(d17, 123, 0, v17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572402b40), com.p314xaae8f345.mm.R.raw.f79868x8752620f);
                return true;
            }
        }
        yb5.d dVar3 = this.f286119s;
        if (dVar3 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar3);
            if (!dVar3.F()) {
                menu.c(d17, 100, 0, v17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View v17, yb5.d ui6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6
    public void d(android.view.View v17, yb5.d ui6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (msg.A0() == 1 && msg.mo78013xfb85f7b0() == 67) {
            msg.m78015x9dfe85a();
            ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(msg.m124847x74d37ac6(), msg, true);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.li liVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.li) ((sb5.k1) ui6.f542241c.a(sb5.k1.class));
            liVar.getClass();
            if (msg.K2()) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(liVar.f280113d.x(), "medianote")) {
                    ((e21.z0) c01.d9.b().w()).c(new e21.n(msg.Q0(), msg.I0()));
                }
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.ic.b(msg);
                liVar.f280113d.L(true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0044, code lost:
    
        if ((r8.f385550a.length() == 0) != false) goto L9;
     */
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 r8, yb5.d r9, rd5.d r10, java.lang.String r11) {
        /*
            r7 = this;
            java.lang.String r11 = "tag"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r11)
            java.lang.String r11 = "ui"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r11)
            java.lang.String r11 = "msgData"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r11)
            we5.a r11 = r10.f475787d
            com.tencent.mm.storage.f9 r11 = r11.f526833b
            r7.f286119s = r9
            r1 = r8
            com.tencent.mm.ui.chatting.viewitems.jm r1 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.jm) r1
            android.view.View r8 = r1.f39493x8ad70635
            int r0 = r1.f285810f
            r1.m80053x54fd00d3(r8, r0)
            java.lang.Class<j41.y> r8 = j41.y.class
            i95.m r8 = i95.n0.c(r8)
            j41.y r8 = (j41.y) r8
            java.lang.String r0 = r11.j()
            l41.b2 r8 = (l41.b2) r8
            r8.getClass()
            k41.k0 r8 = k41.o0.b(r0)
            r0 = 0
            r2 = 1
            if (r8 == 0) goto L46
            java.lang.String r3 = r8.f385550a
            int r3 = r3.length()
            if (r3 != 0) goto L43
            r3 = r2
            goto L44
        L43:
            r3 = r0
        L44:
            if (r3 == 0) goto L4d
        L46:
            java.lang.String r3 = "MicroMsg.ChattingItemOpenIMKefuNameCard"
            java.lang.String r4 = "fillingOpenIMKefuCard content invalid"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r4)
        L4d:
            com.tencent.mm.ui.chatting.viewitems.nm r3 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.om.f286747a
            r3.a(r9, r8, r1)
            android.view.View r3 = r1.f39493x8ad70635
            com.tencent.mm.ui.chatting.viewitems.er r4 = new com.tencent.mm.ui.chatting.viewitems.er
            boolean r5 = r9.D()
            if (r8 == 0) goto L60
            java.lang.String r6 = r8.f385550a
            if (r6 != 0) goto L62
        L60:
            java.lang.String r6 = ""
        L62:
            r4.<init>(r10, r5, r1, r6)
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r8 = r8.f385556g
            java.lang.String r6 = "kefu_card_ticket"
            r5.putString(r6, r8)
            r4.f285437J = r5
            r3.setTag(r4)
            android.view.View r8 = r1.f39493x8ad70635
            com.tencent.mm.ui.chatting.viewitems.km r3 = new com.tencent.mm.ui.chatting.viewitems.km
            r3.<init>(r9)
            r8.setOnClickListener(r3)
            android.view.View r8 = r1.f39493x8ad70635
            com.tencent.mm.ui.chatting.viewitems.q0 r3 = r7.u(r9)
            r8.setOnLongClickListener(r3)
            android.view.View r8 = r1.f39493x8ad70635
            com.tencent.mm.ui.chatting.manager.c r3 = r9.f542241c
            java.lang.Class<sb5.z> r4 = sb5.z.class
            yn.e r3 = r3.a(r4)
            sb5.z r3 = (sb5.z) r3
            com.tencent.mm.ui.chatting.adapter.k r3 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) r3
            com.tencent.mm.ui.chatting.e6 r3 = r3.B1
            r8.setOnTouchListener(r3)
            int r8 = r11.P0()
            r11 = 2
            if (r8 >= r11) goto La4
            r0 = r2
        La4:
            r7.Z(r1, r0, r2)
            java.lang.String r3 = r9.t()
            boolean r4 = r9.D()
            r0 = r7
            r2 = r10
            r5 = r9
            r6 = r7
            r0.V(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.mm.l(com.tencent.mm.ui.chatting.viewitems.g0, yb5.d, rd5.d, java.lang.String):void");
    }
}
