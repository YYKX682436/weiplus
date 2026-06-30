package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public final class z5 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f287645a;

    /* renamed from: b, reason: collision with root package name */
    public yb5.d f287646b;

    /* renamed from: c, reason: collision with root package name */
    public long f287647c;

    public z5(boolean z17) {
        this.f287645a = z17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0353  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.w5 r39, yb5.d r40, rd5.d r41, java.lang.String r42, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 r43) {
        /*
            Method dump skipped, instructions count: 1159
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.z5.a(com.tencent.mm.ui.chatting.viewitems.w5, yb5.d, rd5.d, java.lang.String, com.tencent.mm.ui.chatting.viewitems.a0):void");
    }

    public final android.view.View b(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        boolean z17 = this.f287645a;
        android.view.View xgVar = z17 ? new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.e1p) : new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.e1_);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.w5 w5Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.w5();
        w5Var.a(xgVar, z17);
        xgVar.setTag(w5Var);
        return xgVar;
    }

    public final boolean c(android.view.MenuItem menuItem, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (menuItem != null && menuItem.getItemId() == 136) {
            l15.c cVar = new l15.c();
            java.lang.String j17 = msg.j();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j17, "getContent(...)");
            cVar.m126728xdc93280d(j17);
            v05.b k17 = cVar.k();
            w05.d dVar2 = k17 != null ? (w05.d) k17.m75936x14adae67(k17.f513848e + 66) : null;
            if (dVar2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingItemAppMsgEcsGiftChatroom", "on menu quote click, ecsGiftAppMsgInfo is null");
                return false;
            }
            if (dVar2.s().isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingItemAppMsgEcsGiftChatroom", "on menu quote click, gift list empty");
                return false;
            }
            java.lang.Object obj = dVar2.s().get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("ecs_gift_quote_msg", "view_clk", kz5.b1.e(new jz5.l("order_id", ((w05.e) obj).n())), 12, false);
        }
        return false;
    }

    public final boolean d(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 chattingItem, db5.g4 menu, android.view.View v17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingItem, "chattingItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        java.lang.Object tag = v17.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
        int d17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) tag).d();
        if (f9Var == null) {
            return false;
        }
        yb5.d dVar = this.f287646b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar);
        menu.c(d17, 100, 0, dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
        return false;
    }

    public final boolean e(android.view.View v17, yb5.d ui6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgEcsGiftChatroom", "onItemClick, currentTime:" + currentTimeMillis + ", lastClickTime:" + this.f287647c);
        if (currentTimeMillis - this.f287647c < 500) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgEcsGiftChatroom", "onItemClick, click frequency limit");
            return true;
        }
        this.f287647c = currentTimeMillis;
        c00.e3 e3Var = (c00.e3) i95.n0.c(c00.e3.class);
        android.app.Activity g17 = ui6.g();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("pageOpenScene", "chatroom_msg");
        ((j00.k1) e3Var).uj(g17, msg, linkedHashMap);
        ((j00.o1) ((c00.f3) i95.n0.c(c00.f3.class))).getClass();
        ((b00.q2) ((c00.b4) i95.n0.c(c00.b4.class))).wi("EcsReportGiftMsg", 2, "");
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f1) ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fg) ui6.f542241c.a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fg.class))).getClass();
        sc5.f fVar = sc5.f.f488100a;
        if (sc5.f.f488102c) {
            fVar.e(msg, 3);
        }
        return true;
    }
}
