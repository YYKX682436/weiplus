package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes10.dex */
public class l extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.j {
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater inflater, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inflater, "inflater");
        if (view != null && view.getTag() != null) {
            return view;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(inflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570032uz);
        xgVar.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21904x129eb5b3().m79923x185eef8c(xgVar, false));
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
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg = msgData.f475787d.f526833b;
        if (item.getItemId() != 111) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.z.f287640a.o(ui6, msg);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = msgData.f475787d.f526833b;
        java.lang.Object tag = v17.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
        int d17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) tag).d();
        if (f9Var == null) {
            return true;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.x xVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.z.f287640a;
        if (xVar.d(f9Var) && !c01.ia.A(f9Var) && !c01.ia.x(f9Var)) {
            yb5.d dVar = this.f285749x;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar);
            menu.c(d17, 111, 0, dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
            xVar.n(f9Var);
        }
        menu.removeItem(116);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View v17, yb5.d ui6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        f0(ui6, msg);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.z.f287640a.l(this, v17, ui6, msg, A(ui6, msg));
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6
    public void d(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public com.p314xaae8f345.mm.p2621x8fb0427b.a9 i(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.content.Context context, yb5.q talkerInfo, yb5.a componentProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talkerInfo, "talkerInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(componentProvider, "componentProvider");
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.y(f9Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x03b8, code lost:
    
        r2 = new java.util.ArrayList();
        r3 = zj0.c.f554818a;
        r2.add(0);
        java.util.Collections.reverse(r2);
        yj0.a.d(r1, r2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$ChattingItemAppMsgFinderLiveFeedFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r1.setVisibility(((java.lang.Integer) r2.get(0)).intValue());
        yj0.a.f(r1, "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$ChattingItemAppMsgFinderLiveFeedFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0400, code lost:
    
        r1 = r12.getFinderThumb();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0406, code lost:
    
        if (r1 != null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0409, code lost:
    
        r1.setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x040c, code lost:
    
        r1 = r12.getBottomMask();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0410, code lost:
    
        if (r1 != null) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0413, code lost:
    
        r1.setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0474, code lost:
    
        r2 = (android.widget.LinearLayout) r12.f39494xbf64baf8.findViewById(com.p314xaae8f345.mm.R.id.bkg);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0480, code lost:
    
        if (r2 == null) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x04a1, code lost:
    
        if (r6.j(r14.f558892b.m75945x2fec8307(1), (r45.nw1) r14.f558892b.m75936x14adae67(24), r2, r12.getLiveId()) != false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x04a3, code lost:
    
        r3 = r14.f558892b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x04a5, code lost:
    
        if (r41 != null) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x04a7, code lost:
    
        r5 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x04ab, code lost:
    
        r6.h(r2, r3, r39, r5, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x04a9, code lost:
    
        r5 = r41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x04b2, code lost:
    
        r1 = r12.f39494xbf64baf8;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, "convertView");
        in5.o.c(r1, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.k(r12, r14, r11, r39));
        r6.p(r12, r14.f558892b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0325, code lost:
    
        r1 = (le0.x) i95.n0.c(le0.x.class);
        r4 = r39.g();
        r3 = r14.f558892b.m75945x2fec8307(29);
        ((ke0.e) r1).getClass();
        r6.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(r4, r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0347, code lost:
    
        if (r6.getVisibility() != 8) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0349, code lost:
    
        r6.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x031c, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x03af, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x027d, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0417, code lost:
    
        r4 = "";
        r1 = r12.getFinderOlympicView();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x041d, code lost:
    
        if (r1 != null) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0420, code lost:
    
        r2 = new java.util.ArrayList();
        r3 = zj0.c.f554818a;
        r2.add(8);
        java.util.Collections.reverse(r2);
        yj0.a.d(r1, r2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$ChattingItemAppMsgFinderLiveFeedFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r1.setVisibility(((java.lang.Integer) r2.get(0)).intValue());
        yj0.a.f(r1, "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$ChattingItemAppMsgFinderLiveFeedFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0469, code lost:
    
        r1 = r12.getFinderThumb();
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x046d, code lost:
    
        if (r1 != null) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0470, code lost:
    
        r1.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x025c, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01e7, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0179, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x011f, code lost:
    
        r1 = r14.f558892b.m75945x2fec8307(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x010f, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0115, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x017b, code lost:
    
        r7 = null;
        r2 = r12.getFinderNickname();
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0180, code lost:
    
        if (r2 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0183, code lost:
    
        r2.setEllipsize(android.text.TextUtils.TruncateAt.END);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0188, code lost:
    
        r2 = r12.getFinderNickname();
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x018c, code lost:
    
        if (r2 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x018f, code lost:
    
        r3 = r14.f558892b.m75945x2fec8307(21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0195, code lost:
    
        if (r3 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x019b, code lost:
    
        if (r3.length() <= 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x019d, code lost:
    
        r3 = true;
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01a2, code lost:
    
        if (r6 != r3) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01a4, code lost:
    
        r6 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01a8, code lost:
    
        if (r6 == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01aa, code lost:
    
        r1 = r14.f558892b.m75945x2fec8307(21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01ca, code lost:
    
        r2.setText(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01b1, code lost:
    
        r5 = (le0.x) i95.n0.c(le0.x.class);
        r6 = r39.g();
        r1 = r14.f558892b.m75945x2fec8307(3);
        ((ke0.e) r5).getClass();
        r1 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(r6, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01a7, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01a0, code lost:
    
        r3 = true;
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x00cf, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x00cd, code lost:
    
        if (r1 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c2, code lost:
    
        if (r1 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d0, code lost:
    
        r6 = mn2.g1.f411508a;
        r13 = r6.a();
        r1 = ((c61.i8) ((vd2.i5) i95.n0.c(vd2.i5.class))).Ai(r1, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f);
        r5 = r12.getFinderAvatar();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r5);
        r13.c(r1, r5, r6.h(mn2.f1.f411495p));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00fd, code lost:
    
        if (r3 == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ff, code lost:
    
        r3 = r14.f558892b.m75945x2fec8307(21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0105, code lost:
    
        if (r3 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x010b, code lost:
    
        if (r3.length() <= 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x010d, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0111, code lost:
    
        if (r3 != true) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0113, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0116, code lost:
    
        if (r3 == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0118, code lost:
    
        r1 = r14.f558892b.m75945x2fec8307(21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0125, code lost:
    
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r2);
        r5 = new lz5.e(r2.size() + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0133, code lost:
    
        if (r1 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0135, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0136, code lost:
    
        r5.add(r1);
        r1 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0141, code lost:
    
        if (r1.hasNext() == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0143, code lost:
    
        r2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) r1.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0149, code lost:
    
        if (r2 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x014b, code lost:
    
        r2 = r2.m76184x8010e5e4();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0151, code lost:
    
        if (r2 != null) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0153, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0154, code lost:
    
        r5.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0150, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0158, code lost:
    
        r1 = kz5.b0.a(r5);
        r2 = r12.getFinderNickname();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0160, code lost:
    
        if (r2 != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0163, code lost:
    
        r2.setEllipsize(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0167, code lost:
    
        r2 = r12.getFinderNickname();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x016b, code lost:
    
        if (r2 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x016d, code lost:
    
        r7 = null;
        zy2.s.b(r2, r1, ((kz5.l) r1).d(), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01cd, code lost:
    
        r3 = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Jj(r12.getLiveId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e3, code lost:
    
        if (r3.length() <= 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01e5, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01e8, code lost:
    
        if (r6 == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01eb, code lost:
    
        r3 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01ec, code lost:
    
        if (r3 == null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ee, code lost:
    
        r14.f558892b.set(5, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01f4, code lost:
    
        r6 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.z.f287640a;
        r5 = r14.f558892b;
        r6.q(r39, r38, r5, (r45.nw1) r5.m75936x14adae67(24), null, r11);
        r1 = r14.f558892b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, "shareObject");
        r6.e(r12, r1, r39, r11);
        r1 = r14.f558892b.m75938x746dc8a6(6);
        r2 = r14.f558892b.m75938x746dc8a6(7);
        r3 = r39.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, "getContext(...)");
        r6.c(r12, r1, r2, r3);
        r1 = r12.getFinderThumb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1);
        r1.setVisibility(0);
        r1 = r14.f558892b.m75945x2fec8307(28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0251, code lost:
    
        if (r1 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0257, code lost:
    
        if (r1.length() != 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x025a, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x025d, code lost:
    
        if (r6 != false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0268, code lost:
    
        if (r14.f558892b.m75939xb282bd08(13) == 2) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x026a, code lost:
    
        r1 = r14.f558892b.m75945x2fec8307(31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0272, code lost:
    
        if (r1 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0278, code lost:
    
        if (r1.length() != 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x027b, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x027e, code lost:
    
        if (r6 != false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x028c, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r14.f558892b.m75945x2fec8307(31), "1") == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x028e, code lost:
    
        r1 = r12.getFinderOlympicView();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0292, code lost:
    
        if (r1 == null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0294, code lost:
    
        r4 = r1.findViewById(com.p314xaae8f345.mm.R.id.fv8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, "findViewById(...)");
        r6 = r1.findViewById(com.p314xaae8f345.mm.R.id.fv9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r6, "findViewById(...)");
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).tk((android.widget.ImageView) r4, qs5.y.f448008d, com.p314xaae8f345.mm.R.C30861xcebc809e.c5e);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).tk((android.widget.ImageView) r6, qs5.y.f448009e, com.p314xaae8f345.mm.R.C30861xcebc809e.c5f);
        r2 = r1.findViewById(com.p314xaae8f345.mm.R.id.fva);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, "findViewById(...)");
        r2 = (android.widget.TextView) r2;
        r2.setTextSize(1, 14.0f);
        r6 = r1.findViewById(com.p314xaae8f345.mm.R.id.fv_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r6, "findViewById(...)");
        r6 = (android.widget.TextView) r6;
        r6.setTextSize(1, 14.0f);
        r1 = r1.findViewById(com.p314xaae8f345.mm.R.id.fvc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, "findViewById(...)");
        r1 = (android.widget.TextView) r1;
        r1.setTextSize(1, 17.0f);
        com.p314xaae8f345.mm.ui.fk.a(r2);
        com.p314xaae8f345.mm.ui.fk.a(r6);
        com.p314xaae8f345.mm.ui.fk.a(r1);
        r1 = r14.f558892b.m75945x2fec8307(29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0311, code lost:
    
        if (r1 == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0317, code lost:
    
        if (r1.length() != 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x031a, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x031d, code lost:
    
        if (r1 == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x031f, code lost:
    
        r6.setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x034d, code lost:
    
        r1 = r39.g().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.esj, r14.f558892b.m75945x2fec8307(28));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, "getString(...)");
        r32 = r12.getWidth() - (i65.a.b(r39.g(), 12) * 2);
        r4 = "";
        r3 = r26.i0.t(r1, "\n", r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x03a8, code lost:
    
        if (new android.text.StaticLayout(r3, 0, r3.length(), r2.getPaint(), r32, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() > 1) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x03aa, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x03ab, code lost:
    
        r2.setText(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x03b1, code lost:
    
        r1 = r12.getFinderOlympicView();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x03b5, code lost:
    
        if (r1 != null) goto L146;
     */
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.j, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 r38, yb5.d r39, rd5.d r40, java.lang.String r41) {
        /*
            Method dump skipped, instructions count: 1309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.l.l(com.tencent.mm.ui.chatting.viewitems.g0, yb5.d, rd5.d, java.lang.String):void");
    }
}
