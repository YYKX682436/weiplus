package ze5;

/* loaded from: classes9.dex */
public abstract class n0 extends ze5.w8 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f553634s;

    /* renamed from: t, reason: collision with root package name */
    public bw5.u8 f553635t;

    /* renamed from: u, reason: collision with root package name */
    public bw5.qe0 f553636u;

    /* JADX WARN: Removed duplicated region for block: B:108:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0179 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k0(ze5.n0 r16, java.lang.String r17, yb5.d r18, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r19, bw5.u8 r20, bw5.qe0 r21) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ze5.n0.k0(ze5.n0, java.lang.String, yb5.d, com.tencent.mm.storage.f9, bw5.u8, bw5.qe0):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ad, code lost:
    
        if (r3 == null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l0(ze5.n0 r9, java.lang.String r10, bw5.u8 r11) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ze5.n0.l0(ze5.n0, java.lang.String, bw5.u8):void");
    }

    @Override // ze5.w8, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        ot0.q v17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = msgData.f475787d.f526833b;
        if (f9Var == null || item.getItemId() != 111) {
            return false;
        }
        android.app.Activity g17 = ui6.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getContext(...)");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.j()) && (v17 = ot0.q.v(f9Var.j())) != null) {
            android.content.Intent intent = new android.content.Intent(g17, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
            intent.putExtra("Retr_Msg_Id", f9Var.m124847x74d37ac6());
            intent.putExtra("Retr_MsgTalker", f9Var.Q0());
            intent.putExtra("Retr_Msg_Type", 30);
            intent.putExtra("Multi_Retr", true);
            intent.putExtra("Retr_Msg_content", ot0.q.u(v17, null, null));
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("Retr_show_success_tips", true);
            intent.putExtra("scene_from", 17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(g17, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgEcsProductCardMvvm$ChattingItemAppMsgEcProduct", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            g17.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(g17, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgEcsProductCardMvvm$ChattingItemAppMsgEcProduct", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return true;
    }

    @Override // ze5.w8, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        yb5.d dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = msgData.f475787d.f526833b;
        if (f9Var == null || (dVar = this.f553634s) == null) {
            return false;
        }
        java.lang.Object tag = v17.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
        int d17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) tag).d();
        l15.c cVar = new l15.c();
        java.lang.String U1 = f9Var.U1();
        if (U1 == null) {
            U1 = "";
        }
        cVar.m126728xdc93280d(U1);
        v05.b k17 = cVar.k();
        if (k17 == null) {
            return false;
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String m75945x2fec8307 = k17.m75945x2fec8307(k17.f449898d + 0);
        ((kt.c) i0Var).getClass();
        if (((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).nj(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.j(m75945x2fec8307, false, false)) && !com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.k(f9Var) && !c01.ia.x(f9Var) && !com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.j(f9Var) && !com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.D(f9Var)) {
            menu.c(d17, 111, 0, dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
        }
        if (c01.ia.A(f9Var)) {
            menu.clear();
        }
        if ((f9Var.K1() || f9Var.h2() == 1) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.L(f9Var, dVar) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.J(f9Var.Q0()) && !dVar.A()) {
            menu.c(d17, 123, 0, v17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572402b40), com.p314xaae8f345.mm.R.raw.f79868x8752620f);
        }
        if (!dVar.F()) {
            menu.c(d17, 100, 0, dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6
    public void d(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar);
        db5.e1.A(dVar.g(), dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5h), "", dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572076y2), dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new ze5.j0(f9Var, dVar), ze5.k0.f553574d);
    }

    @Override // ze5.w8
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 d0(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        i95.m c17 = i95.n0.c(c00.z2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ((b00.r) ((c00.z2) c17)).f98290d.getClass();
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p722x2e7b10.p723x373aa5.C10520x8a9df0c0 c10520x8a9df0c0 = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p722x2e7b10.p723x373aa5.C10520x8a9df0c0(context, null, 0, 6, null);
        if (M()) {
            c10520x8a9df0c0.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562777ob);
            c10520x8a9df0c0.setForeground(c10520x8a9df0c0.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562704me));
            android.view.View contentView = c10520x8a9df0c0.getContentView();
            if (contentView != null) {
                contentView.setPadding(0, 0, i65.a.b(c10520x8a9df0c0.getContext(), 5), 0);
            }
        } else {
            c10520x8a9df0c0.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562715mi);
            c10520x8a9df0c0.setForeground(c10520x8a9df0c0.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562678lu));
            android.view.View contentView2 = c10520x8a9df0c0.getContentView();
            if (contentView2 != null) {
                contentView2.setPadding(i65.a.b(c10520x8a9df0c0.getContext(), 5), 0, 0, 0);
            }
        }
        return c10520x8a9df0c0;
    }

    @Override // ze5.w8
    public void h0(ze5.n8 holder, yb5.d ui6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, java.lang.String str) {
        r45.br2 br2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        super.h0(holder, ui6, msg, str);
        this.f553634s = ui6;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.c0.f280389r.c(ui6, holder.f39494xbf64baf8, msg);
        ((b00.a0) ((c00.u3) i95.n0.c(c00.u3.class))).a(holder.f39494xbf64baf8, msg, "ecs_kf_card_product", -1);
        zy2.l lVar = (zy2.l) ot0.q.v(msg.U1()).y(zy2.l.class);
        if (lVar == null || (br2Var = lVar.f558982b) == null) {
            return;
        }
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = holder.f553644c;
        if (abstractC11172x705e5905 != null) {
            abstractC11172x705e5905.setTag(com.p314xaae8f345.mm.R.id.ujc, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.b8.c(br2Var.m75945x2fec8307(7))));
        }
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a i17 = ui6.i();
        if (i17 != null) {
            p3325xe03a0797.p3326xc267989b.l.d(i17, null, null, new ze5.i0(br2Var, msg, ui6, holder, this, null), 3, null);
        }
        s40.b1 b1Var = (s40.b1) i95.n0.c(s40.b1.class);
        i95.m c17 = i95.n0.c(s40.b1.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.t6) b1Var).Ui(br2Var, "expose_commodity_card", s40.b1.E3((s40.b1) c17, br2Var, null, ui6.D() ? "group" : "chat", null, ((b00.u) ((c00.c3) i95.n0.c(c00.c3.class))).wi(msg), 8, null));
    }

    @Override // ze5.w8
    public q31.p i0(yb5.d ui6, rd5.d msgData, java.lang.String str) {
        g00.c cVar;
        w05.b bVar;
        java.lang.String str2;
        w05.h hVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo = msgData.f475787d.f526833b;
        i95.m c17 = i95.n0.c(c00.z2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        java.lang.String x17 = ui6.x();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        ((b00.r) ((c00.z2) c17)).f98290d.getClass();
        java.lang.String U1 = msgInfo.U1();
        bw5.x8 x8Var = bw5.x8.ECS_REQ_SCENE_CONVERSATION;
        if (U1 == null) {
            cVar = new g00.c(null, x8Var);
        } else {
            l15.c cVar2 = new l15.c();
            cVar2.m126728xdc93280d(U1);
            v05.b k17 = cVar2.k();
            if (k17 == null || (bVar = (w05.b) k17.m75936x14adae67(k17.f513848e + 54)) == null) {
                cVar = new g00.c(null, x8Var);
            } else {
                g00.c cVar3 = new g00.c(e00.l.c(bVar), x8Var);
                cVar3.f348921f = x17;
                java.lang.String y07 = msgInfo.y0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(y07, "getFromUsername(...)");
                cVar3.f348922g = y07;
                java.lang.String T0 = msgInfo.T0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(T0, "getToUsername(...)");
                cVar3.f348923h = T0;
                cVar3.f348924i = ((b00.u) ((c00.c3) i95.n0.c(c00.c3.class))).wi(msgInfo);
                v05.b k18 = cVar2.k();
                if (k18 == null || (hVar = (w05.h) k18.m75936x14adae67(k18.f513848e + 74)) == null || (str2 = hVar.A()) == null) {
                    str2 = "";
                }
                cVar3.f348925m = str2;
                cVar = cVar3;
            }
        }
        cVar.f348926n = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.h0(ui6, new ze5.m0(this, msgInfo, ui6, cVar));
        return cVar;
    }
}
