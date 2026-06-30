package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes10.dex */
public class n extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.j {
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater inflater, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inflater, "inflater");
        if (view != null && view.getTag() != null) {
            return view;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(inflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570075wj);
        xgVar.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21904x129eb5b3().m79923x185eef8c(xgVar, true));
        return xgVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return true;
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
        if (f9Var != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.x xVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.z.f287640a;
            if (xVar.d(f9Var) && !c01.ia.A(f9Var) && !c01.ia.x(f9Var)) {
                yb5.d dVar = this.f285749x;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar);
                menu.c(d17, 111, 0, dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
                xVar.n(f9Var);
            }
            menu.removeItem(116);
            if ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.L(f9Var, this.f285749x) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.J(f9Var.Q0())) {
                yb5.d dVar2 = this.f285749x;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar2);
                if (!dVar2.A()) {
                    menu.c(d17, 123, 0, v17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572402b40), com.p314xaae8f345.mm.R.raw.f79868x8752620f);
                }
            }
        }
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
    public void d(android.view.View v17, yb5.d ui6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (msg.k2()) {
            android.util.Pair z17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.z(msg);
            if (z17 == null || z17.second != null) {
                c01.w9.f(msg.m124847x74d37ac6(), msg.Q0());
            }
            ui6.L(true);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public com.p314xaae8f345.mm.p2621x8fb0427b.a9 i(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.content.Context context, yb5.q talkerInfo, yb5.a componentProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talkerInfo, "talkerInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(componentProvider, "componentProvider");
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.y(f9Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0318, code lost:
    
        if (r4.getVisibility() != 8) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x031a, code lost:
    
        r4.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02ef, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x037a, code lost:
    
        r15 = r12.getFinderOlympicView();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x037e, code lost:
    
        if (r15 != null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0381, code lost:
    
        r0 = new java.util.ArrayList();
        r1 = zj0.c.f554818a;
        r0.add(0);
        java.util.Collections.reverse(r0);
        yj0.a.d(r15, r0.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$ChattingItemAppMsgFinderLiveFeedTo", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r15.setVisibility(((java.lang.Integer) r0.get(0)).intValue());
        yj0.a.f(r15, "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$ChattingItemAppMsgFinderLiveFeedTo", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x03c7, code lost:
    
        r0 = r12.getFinderThumb();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x03cd, code lost:
    
        if (r0 != null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x03d0, code lost:
    
        r0.setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x03d3, code lost:
    
        r0 = r12.getBottomMask();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x03d7, code lost:
    
        if (r0 != null) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x03da, code lost:
    
        r0.setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0437, code lost:
    
        r1 = (android.widget.LinearLayout) r12.f39494xbf64baf8.findViewById(com.p314xaae8f345.mm.R.id.bkg);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0443, code lost:
    
        if (r1 == null) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x045f, code lost:
    
        if (r8.j(r10.m75945x2fec8307(1), (r45.nw1) r10.m75936x14adae67(24), r1, r12.getLiveId()) != false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0461, code lost:
    
        if (r36 != null) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0463, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0467, code lost:
    
        r8.h(r1, r10, r34, r4, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0465, code lost:
    
        r4 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x046f, code lost:
    
        r0 = r12.f39494xbf64baf8;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r13);
        in5.o.c(r0, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.m(r12, r10, r11, r34));
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0255, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x03de, code lost:
    
        r15 = r12.getFinderOlympicView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r15);
        r0 = new java.util.ArrayList();
        r2 = zj0.c.f554818a;
        r0.add(8);
        java.util.Collections.reverse(r0);
        yj0.a.d(r15, r0.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$ChattingItemAppMsgFinderLiveFeedTo", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r15.setVisibility(((java.lang.Integer) r0.get(0)).intValue());
        yj0.a.f(r15, "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$ChattingItemAppMsgFinderLiveFeedTo", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r0 = r12.getFinderThumb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r0);
        r0.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0238, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01d9, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x011c, code lost:
    
        r0 = r5.m75945x2fec8307(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x010e, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0114, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0174, code lost:
    
        r3 = null;
        r1 = r12.getFinderNickname();
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0179, code lost:
    
        if (r1 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x017c, code lost:
    
        r1.setEllipsize(android.text.TextUtils.TruncateAt.END);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0181, code lost:
    
        r1 = r12.getFinderNickname();
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0185, code lost:
    
        if (r1 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0188, code lost:
    
        r6 = r5.m75945x2fec8307(21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x018c, code lost:
    
        if (r6 == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0192, code lost:
    
        if (r6.length() <= 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0194, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0197, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0198, code lost:
    
        if (r6 != true) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x019a, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x019e, code lost:
    
        if (r6 == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01a0, code lost:
    
        r0 = r5.m75945x2fec8307(21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01bc, code lost:
    
        r1.setText(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01a5, code lost:
    
        r2 = (le0.x) i95.n0.c(le0.x.class);
        r6 = r34.g();
        r0 = r5.m75945x2fec8307(3);
        ((ke0.e) r2).getClass();
        r0 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(r6, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x019d, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0196, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x019c, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x00ce, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x00cc, code lost:
    
        if (r0 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c3, code lost:
    
        if (r0 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cf, code lost:
    
        r15 = mn2.g1.f411508a;
        r3 = r15.a();
        r0 = ((c61.i8) ((vd2.i5) i95.n0.c(vd2.i5.class))).Ai(r0, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f);
        r2 = r12.getFinderAvatar();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r2);
        r3.c(r0, r2, r15.h(mn2.f1.f411495p));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00fe, code lost:
    
        if (r13 == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0100, code lost:
    
        r3 = r5.m75945x2fec8307(21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0104, code lost:
    
        if (r3 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x010a, code lost:
    
        if (r3.length() <= 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x010c, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0110, code lost:
    
        if (r3 != true) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0112, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0115, code lost:
    
        if (r3 == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0117, code lost:
    
        r0 = r5.m75945x2fec8307(21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0120, code lost:
    
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1);
        r3 = new lz5.e(r1.size() + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x012e, code lost:
    
        if (r0 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0130, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0131, code lost:
    
        r3.add(r0);
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x013c, code lost:
    
        if (r0.hasNext() == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x013e, code lost:
    
        r1 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0144, code lost:
    
        if (r1 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0146, code lost:
    
        r1 = r1.m76184x8010e5e4();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x014c, code lost:
    
        if (r1 != null) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x014e, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x014f, code lost:
    
        r3.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x014b, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0153, code lost:
    
        r0 = kz5.b0.a(r3);
        r1 = r12.getFinderNickname();
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x015c, code lost:
    
        if (r1 != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015f, code lost:
    
        r1.setEllipsize(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0162, code lost:
    
        r1 = r12.getFinderNickname();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0166, code lost:
    
        if (r1 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0168, code lost:
    
        zy2.s.b(r1, r0, ((kz5.l) r0).d(), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0172, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01bf, code lost:
    
        r0 = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Jj(r12.getLiveId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01d5, code lost:
    
        if (r0.length() <= 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01d7, code lost:
    
        r1 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01da, code lost:
    
        if (r1 == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01dd, code lost:
    
        r0 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01de, code lost:
    
        if (r0 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01e0, code lost:
    
        r5.set(5, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01e4, code lost:
    
        r13 = "convertView";
        r8 = r4;
        r10 = r5;
        r7 = true;
        r4.q(r34, r33, r5, (r45.nw1) r5.m75936x14adae67(24), null, r11);
        r8.e(r12, r10, r34, r11);
        r0 = r10.m75938x746dc8a6(6);
        r1 = r10.m75938x746dc8a6(7);
        r2 = r34.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, "getContext(...)");
        r8.c(r12, r0, r1, r2);
        r0 = r12.getFinderThumb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r0);
        r0.setVisibility(0);
        r1 = r10.m75945x2fec8307(28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x022d, code lost:
    
        if (r1 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0233, code lost:
    
        if (r1.length() != 0) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0236, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0239, code lost:
    
        if (r6 != false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0242, code lost:
    
        if (r10.m75939xb282bd08(13) == 2) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0244, code lost:
    
        r2 = r10.m75945x2fec8307(31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x024a, code lost:
    
        if (r2 == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0250, code lost:
    
        if (r2.length() != 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0253, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0256, code lost:
    
        if (r6 != false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0262, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r10.m75945x2fec8307(31), "1") == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0264, code lost:
    
        r1 = r12.getFinderOlympicView();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0268, code lost:
    
        if (r1 == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x026a, code lost:
    
        r2 = r1.findViewById(com.p314xaae8f345.mm.R.id.fv8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, "findViewById(...)");
        r4 = r1.findViewById(com.p314xaae8f345.mm.R.id.fv9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, "findViewById(...)");
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).tk((android.widget.ImageView) r2, qs5.y.f448008d, com.p314xaae8f345.mm.R.C30861xcebc809e.c5e);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).tk((android.widget.ImageView) r4, qs5.y.f448009e, com.p314xaae8f345.mm.R.C30861xcebc809e.c5f);
        r0 = r1.findViewById(com.p314xaae8f345.mm.R.id.fva);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, "findViewById(...)");
        r0 = (android.widget.TextView) r0;
        r0.setTextSize(1, 14.0f);
        r4 = r1.findViewById(com.p314xaae8f345.mm.R.id.fv_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, "findViewById(...)");
        r4 = (android.widget.TextView) r4;
        r4.setTextSize(1, 14.0f);
        r1 = r1.findViewById(com.p314xaae8f345.mm.R.id.fvc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, "findViewById(...)");
        r1 = (android.widget.TextView) r1;
        r1.setTextSize(1, 17.0f);
        com.p314xaae8f345.mm.ui.fk.a(r0);
        com.p314xaae8f345.mm.ui.fk.a(r4);
        com.p314xaae8f345.mm.ui.fk.a(r1);
        r2 = r10.m75945x2fec8307(29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02e4, code lost:
    
        if (r2 == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02ea, code lost:
    
        if (r2.length() != 0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02ed, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02f0, code lost:
    
        if (r6 == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02f2, code lost:
    
        r4.setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x031e, code lost:
    
        r1 = r34.g().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.esj, r10.m75945x2fec8307(28));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, "getString(...)");
        r27 = r12.getWidth() - (i65.a.b(r34.g(), 12) * 2);
        r2 = r26.i0.t(r1, "\n", "", false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0374, code lost:
    
        if (new android.text.StaticLayout(r2, 0, r2.length(), r0.getPaint(), r27, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() > 1) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0376, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0377, code lost:
    
        r0.setText(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02f8, code lost:
    
        r3 = (le0.x) i95.n0.c(le0.x.class);
        r5 = r34.g();
        r1 = r10.m75945x2fec8307(29);
        ((ke0.e) r3).getClass();
        r4.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(r5, r1));
     */
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.j, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 r33, yb5.d r34, rd5.d r35, java.lang.String r36) {
        /*
            Method dump skipped, instructions count: 1306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.n.l(com.tencent.mm.ui.chatting.viewitems.g0, yb5.d, rd5.d, java.lang.String):void");
    }
}
