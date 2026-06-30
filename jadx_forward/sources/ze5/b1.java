package ze5;

/* loaded from: classes9.dex */
public abstract class b1 extends ze5.w8 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f553365s;

    /* renamed from: t, reason: collision with root package name */
    public w05.a f553366t;

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
            intent.putExtra("Retr_Msg_Type", 37);
            intent.putExtra("Multi_Retr", true);
            intent.putExtra("Retr_Msg_content", ot0.q.u(v17, null, null));
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("Retr_show_success_tips", true);
            intent.putExtra("scene_from", 17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(g17, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgEcsShopWindowCardMvvm$ChattingItemAppMsgEcsShopWindowCard", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            g17.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(g17, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgEcsShopWindowCardMvvm$ChattingItemAppMsgEcsShopWindowCard", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
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
        if (f9Var == null || (dVar = this.f553365s) == null) {
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

    @Override // ze5.w8, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6
    public void d(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar);
        db5.e1.A(dVar.g(), dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5h), "", dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572076y2), dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new ze5.x0(f9Var, dVar), ze5.y0.f553838d);
    }

    @Override // ze5.w8
    public void h0(ze5.n8 holder, yb5.d ui6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, java.lang.String str) {
        bw5.g9 g9Var;
        bw5.g9 g9Var2;
        java.lang.String d17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        super.h0(holder, ui6, msg, str);
        this.f553365s = ui6;
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = holder.f553644c;
        if (abstractC11172x705e5905 != null) {
            c00.k4 k4Var = (c00.k4) abstractC11172x705e5905.m48328xa0ab20ce();
            if (((k4Var == null || (g9Var2 = ((g00.f) k4Var).f348931d) == null || (d17 = g9Var2.d()) == null) ? 0 : com.p314xaae8f345.mm.p2621x8fb0427b.m2.a(d17)) != 0) {
                c00.k4 k4Var2 = (c00.k4) abstractC11172x705e5905.m48328xa0ab20ce();
                java.lang.String c17 = (k4Var2 == null || (g9Var = ((g00.f) k4Var2).f348931d) == null) ? null : g9Var.c();
                if (!(c17 == null || c17.length() == 0)) {
                    abstractC11172x705e5905.setPadding(i65.a.b(abstractC11172x705e5905.getContext(), 5), 0, i65.a.b(abstractC11172x705e5905.getContext(), 5), 0);
                }
            }
            if (M()) {
                abstractC11172x705e5905.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562777ob);
                abstractC11172x705e5905.setForeground(abstractC11172x705e5905.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562704me));
                android.view.View contentView = abstractC11172x705e5905.getContentView();
                if (contentView != null) {
                    contentView.setPadding(0, 0, i65.a.b(abstractC11172x705e5905.getContext(), 5), 0);
                }
            } else {
                abstractC11172x705e5905.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562715mi);
                abstractC11172x705e5905.setForeground(abstractC11172x705e5905.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562678lu));
                android.view.View contentView2 = abstractC11172x705e5905.getContentView();
                if (contentView2 != null) {
                    contentView2.setPadding(i65.a.b(abstractC11172x705e5905.getContext(), 5), 0, 0, 0);
                }
            }
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.c0.f280389r.c(ui6, holder.f39494xbf64baf8, msg);
        ((b00.a0) ((c00.u3) i95.n0.c(c00.u3.class))).a(holder.f553644c, msg, "ecs_kf_card_shop", -1);
        l15.c cVar = new l15.c();
        java.lang.String U1 = msg.U1();
        if (U1 == null) {
            U1 = "";
        }
        cVar.m126728xdc93280d(U1);
        v05.b k17 = cVar.k();
        this.f553366t = k17 != null ? (w05.a) k17.m75936x14adae67(k17.f513848e + 56) : null;
        android.view.View view = holder.f39494xbf64baf8;
        if (view != null) {
            ym5.a1.h(view, new ze5.t0(this, msg));
        }
        java.lang.String x17 = ui6.x();
        java.lang.String d18 = g95.e0.d(msg);
        java.lang.Integer valueOf = ui6.D() ? java.lang.Integer.valueOf(((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(ui6.x())) : null;
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(holder.f39494xbf64baf8, "chatting_item_appmsg_new_finder_shop_container_view");
        aVar.Ai(holder.f39494xbf64baf8, new ze5.u0(this));
        android.view.View view2 = holder.f39494xbf64baf8;
        jz5.l[] lVarArr = new jz5.l[7];
        lVarArr[0] = new jz5.l("card_id", java.lang.Long.valueOf(msg.I0()));
        lVarArr[1] = new jz5.l("card_type", 1);
        w05.a aVar2 = this.f553366t;
        lVarArr[2] = new jz5.l("app_query", aVar2 != null ? aVar2.B() : null);
        lVarArr[3] = new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, ui6.D() ? "2" : "1");
        lVarArr[4] = new jz5.l("chatroomid", x17);
        lVarArr[5] = new jz5.l("share_username", d18);
        lVarArr[6] = new jz5.l("chatroomuv", valueOf);
        java.util.Map k18 = kz5.c1.k(lVarArr);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : k18.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        aVar.gk(view2, linkedHashMap);
        aVar.Tj(holder.f39494xbf64baf8, 40, 12, false);
        w05.a aVar3 = this.f553366t;
        java.lang.String m173053x93d5ac12 = aVar3 != null ? aVar3.m173053x93d5ac12() : null;
        if (m173053x93d5ac12 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ChattingItemAppMsgEcShopMvvm", "refreshShopCardInfo, finderUsername is null!");
            return;
        }
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e59052 = holder.f553644c;
        if (abstractC11172x705e59052 != null) {
            abstractC11172x705e59052.setTag(com.p314xaae8f345.mm.R.id.ujc, m173053x93d5ac12);
        }
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a i17 = ui6.i();
        if (i17 != null) {
            p3325xe03a0797.p3326xc267989b.l.d(i17, null, null, new ze5.w0(msg, ui6, holder, m173053x93d5ac12, this, null), 3, null);
        }
    }

    @Override // ze5.w8
    public q31.p i0(yb5.d ui6, rd5.d msgData, java.lang.String str) {
        g00.f fVar;
        w05.a aVar;
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
            fVar = new g00.f(null, x8Var);
        } else {
            l15.c cVar = new l15.c();
            cVar.m126728xdc93280d(U1);
            v05.b k17 = cVar.k();
            if (k17 == null || (aVar = (w05.a) k17.m75936x14adae67(k17.f513848e + 56)) == null) {
                fVar = new g00.f(null, x8Var);
            } else {
                g00.f fVar2 = new g00.f(e00.l.f(aVar), x8Var);
                fVar2.f348933f = x17;
                java.lang.String y07 = msgInfo.y0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(y07, "getFromUsername(...)");
                fVar2.f348934g = y07;
                java.lang.String T0 = msgInfo.T0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(T0, "getToUsername(...)");
                fVar2.f348935h = T0;
                fVar2.f348936i = ((b00.u) ((c00.c3) i95.n0.c(c00.c3.class))).wi(msgInfo);
                fVar = fVar2;
            }
        }
        fVar.f348938n = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.h0(ui6, new ze5.a1(ui6, msgInfo, fVar, this));
        return fVar;
    }
}
