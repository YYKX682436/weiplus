package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class ab extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 implements com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.f, we5.b {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f284825s;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.gc f284827u;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.CharSequence f284826t = "";

    /* renamed from: v, reason: collision with root package name */
    public int f284828v = -1;

    /* renamed from: w, reason: collision with root package name */
    public int f284829w = -1;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570043vc);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya yaVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya();
        yaVar.a(xgVar, true);
        xgVar.setTag(yaVar);
        return xgVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        int t17;
        int t18;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        int itemId = menuItem.getItemId();
        if (itemId == 102) {
            java.lang.String str = ot0.q.v(c01.w9.l(dVar.C(), f9Var.j(), f9Var.A0())).f430187f;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(str);
            w04.a.INSTANCE.A9(1, f9Var.I0() + "", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o0(str));
            return false;
        }
        if (itemId == 111) {
            android.content.Intent intent = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
            intent.putExtra("Retr_Msg_content", c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0()));
            intent.putExtra("Retr_Msg_Type", 2);
            intent.putExtra("Retr_Msg_Id", f9Var.m124847x74d37ac6());
            intent.putExtra("Retr_MsgTalker", f9Var.Q0());
            intent.putExtra("scene_from", 17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            dVar.a0((android.content.Intent) arrayList.get(0));
            yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return false;
        }
        if (itemId == 152) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym) ((sb5.l2) dVar.f542241c.a(sb5.l2.class))).o0(f9Var);
        } else {
            if (itemId == 179) {
                qn4.y.c(dVar.g(), f9Var, null, dVar);
                return true;
            }
            if (itemId == 124 || itemId == 125 || itemId == 163 || itemId == 164) {
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym) ((sb5.l2) dVar.f542241c.a(sb5.l2.class))).t0(menuItem, f9Var);
            } else {
                switch (itemId) {
                    case 141:
                        java.lang.String W0 = f9Var.W0();
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(W0)) {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(W0);
                        }
                        db5.e1.T(dVar.g(), dVar.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571894st));
                        return true;
                    case com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50673x992affbf /* 142 */:
                        android.content.Intent intent2 = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
                        java.lang.String W02 = f9Var.W0();
                        if (dVar.D() && !((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) dVar.f542241c.a(sb5.f.class))).f280286r && (t17 = c01.w9.t(W02)) != -1) {
                            W02 = W02.substring(t17 + 1).trim();
                        }
                        if (f9Var.X2()) {
                            intent2.putExtra("Retr_Msg_content", W02);
                            intent2.putExtra("Retr_Msg_Type", 6);
                        } else {
                            intent2.putExtra("Retr_Msg_content", W02);
                            intent2.putExtra("Retr_Msg_Type", 4);
                        }
                        intent2.putExtra("scene_from", 17);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(intent2);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(dVar, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        dVar.a0((android.content.Intent) arrayList2.get(0));
                        yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        return true;
                    case com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50613xc9bdf6cd /* 143 */:
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
                        java.lang.String W03 = f9Var.W0();
                        if (dVar.D() && !((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) dVar.f542241c.a(sb5.f.class))).f280286r && (t18 = c01.w9.t(W03)) != -1) {
                            W03 = W03.substring(t18 + 1).trim();
                        }
                        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.m(c5303xc75d2f73, W03, 1);
                        am.c4 c4Var = c5303xc75d2f73.f135623g;
                        c4Var.f87857j = dVar.f542250l;
                        c4Var.f87860m = 43;
                        r45.bq0 bq0Var = c4Var.f87848a;
                        if (bq0Var == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsgMsgQuoteFrom", " transform text fav failed");
                            break;
                        } else {
                            r45.jq0 jq0Var = bq0Var.f452495d;
                            if (jq0Var != null) {
                                jq0Var.e(f9Var.Q0());
                                jq0Var.j(c01.z1.r());
                                c5303xc75d2f73.e();
                                return true;
                            }
                        }
                        break;
                    default:
                        return false;
                }
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar.f475787d.f526833b;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go goVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go) view.getTag();
        int d17 = goVar.d();
        int i17 = goVar.R;
        if (i17 == 1) {
            if (!c01.ia.x(f9Var)) {
                g4Var.c(d17, 102, 0, this.f284825s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3m), com.p314xaae8f345.mm.R.raw.f79692xc84ca28d);
                g4Var.c(d17, 111, 0, this.f284825s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
            }
            j45.l.g("favorite");
            g4Var.c(d17, 116, 0, this.f284825s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg), com.p314xaae8f345.mm.R.raw.f79735x2a2da63f);
            ot0.q v17 = ot0.q.v(f9Var.U1());
            java.lang.String str = v17 == null ? "" : v17.f430187f;
            if (com.p314xaae8f345.mm.app.p622xc5476f33.k.a() && com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.l2.d(str)) {
                if (f9Var.i2() && f9Var.b2()) {
                    g4Var.c(d17, 163, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572408b46), com.p314xaae8f345.mm.R.raw.f81244x9739f9c3);
                } else {
                    g4Var.c(d17, 124, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b4a), com.p314xaae8f345.mm.R.raw.f79939xd3572d36);
                }
            }
            if (!this.f284825s.F()) {
                g4Var.c(d17, 100, 0, this.f284825s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
            }
            if (c01.ia.A(f9Var)) {
                g4Var.clear();
                if (!this.f284825s.F()) {
                    g4Var.c(d17, 100, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
                }
            }
        } else if (i17 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsgMsgQuoteFrom", "翻译消息右键菜单");
            g4Var.c(d17, 141, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3m), com.p314xaae8f345.mm.R.raw.f79692xc84ca28d);
            g4Var.c(d17, com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50673x992affbf, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
            j45.l.g("favorite");
            g4Var.c(d17, com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50613xc9bdf6cd, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg), com.p314xaae8f345.mm.R.raw.f79735x2a2da63f);
            if (!com.p314xaae8f345.mm.app.p622xc5476f33.k.a() || !f9Var.i2() || !f9Var.b2()) {
                return false;
            }
            g4Var.c(d17, 163, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572408b46), com.p314xaae8f345.mm.R.raw.f81244x9739f9c3);
            g4Var.c(d17, 164, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lsg), com.p314xaae8f345.mm.R.raw.f80466xfeba7d4f);
            qn4.y.a(g4Var, d17, view.getContext(), f9Var);
            g4Var.c(d17, 152, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3s), com.p314xaae8f345.mm.R.raw.f79736xffb29de6);
            return false;
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return false;
    }

    @Override // we5.b
    public rd5.d b(we5.a aVar) {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.za(aVar);
    }

    @Override // we5.b
    public boolean c() {
        boolean z17 = od5.b.f426188a;
        return j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.p2519x9a3d88b9.C20080x2b02f0d3()) == 1;
    }

    @Override // we5.b
    public void e(final yb5.d dVar, final rd5.d dVar2, java.lang.String str, we5.y0 y0Var) {
        final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        this.f284825s = dVar;
        y0Var.c(new we5.t0() { // from class: com.tencent.mm.ui.chatting.viewitems.ab$$h
            @Override // we5.t0
            public final void a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya yaVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya) g0Var;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ab abVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ab.this;
                yb5.d dVar3 = dVar;
                abVar.f284825s = dVar3;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f7 f7Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f7) ((sb5.e0) dVar3.f542241c.a(sb5.e0.class));
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = f9Var;
                f7Var.n0(f9Var2);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.c0.x0(dVar3, yaVar.f39494xbf64baf8, f9Var2);
                yaVar.f287584b.setTag(com.p314xaae8f345.mm.R.id.bon, java.lang.Long.valueOf(f9Var2.m124847x74d37ac6()));
                yaVar.f287584b.setTag(com.p314xaae8f345.mm.R.id.rfh, f9Var2.Q0());
                yaVar.f287584b.setTag(com.p314xaae8f345.mm.R.id.bom, java.lang.Boolean.TRUE);
            }
        });
        if (j65.e.b() && j65.e.f()) {
            y0Var.c(new we5.t0() { // from class: com.tencent.mm.ui.chatting.viewitems.ab$$m
                @Override // we5.t0
                public final void a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var) {
                    java.lang.Boolean bool = java.lang.Boolean.TRUE;
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya.b(com.p314xaae8f345.mm.p2621x8fb0427b.f9.this, (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya) g0Var, dVar, bool);
                }
            });
        }
        final ot0.q v17 = ot0.q.v(f9Var.U1());
        int h17 = i65.a.h(dVar.g(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561161b3);
        if (v17 == null || v17.f430199i != 57) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 a17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.dc.a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.dc.b(dVar.D(), dVar.x(), f9Var.m124847x74d37ac6(), f9Var.Q0(), v17.f430258w2, "handleQuoteMsgFillingFrom"), v17.f430258w2);
        final ti3.l c17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.hc.c(dVar, h17, f9Var, a17, v17.f430258w2);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.app.Activity g17 = dVar.g();
        ((ke0.e) xVar).getClass();
        final android.text.SpannableString i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(g17, c17.f501160b);
        final r15.f b17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.hc.b(v17.f430258w2.f231026r, a17, dVar.g());
        y0Var.c(new we5.t0() { // from class: com.tencent.mm.ui.chatting.viewitems.ab$$n
            @Override // we5.t0
            public final void a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya yaVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya) g0Var;
                r15.f fVar = r15.f.this;
                final android.text.SpannableString spannableString = i17;
                if (fVar != null) {
                    yaVar.f287585c.setText(pl5.c.a(new android.text.SpannableStringBuilder(spannableString), c17.f501161c, fVar.f450177a, fVar.f450178b, new yz5.p() { // from class: com.tencent.mm.ui.chatting.viewitems.ab$$g
                        @Override // yz5.p
                        /* renamed from: invoke */
                        public final java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
                            return java.lang.Boolean.valueOf(((android.text.style.ImageSpan[]) spannableString.getSpans(((java.lang.Integer) obj).intValue(), ((java.lang.Integer) obj2).intValue(), android.text.style.ImageSpan.class)).length > 0);
                        }
                    }));
                } else {
                    yaVar.f287585c.setText(spannableString);
                }
                yaVar.f287585c.setTag(v17.f430258w2);
            }
        });
        final f21.a m07 = f21.r0.wi().m0(dVar.x());
        final int intValue = ((java.lang.Integer) c01.d9.b().p().l(12311, -2)).intValue();
        y0Var.c(new we5.t0() { // from class: com.tencent.mm.ui.chatting.viewitems.ab$$o
            @Override // we5.t0
            public final void a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya yaVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya) g0Var;
                f21.a aVar = f21.a.this;
                yb5.d dVar3 = dVar;
                if ((aVar == null || aVar.f340366b == -2) && (aVar != null || intValue == -2)) {
                    yaVar.f287585c.setTextColor(dVar3.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560405ji));
                    yaVar.f287599q.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.apt);
                } else {
                    if (com.p314xaae8f345.mm.ui.bk.C()) {
                        yaVar.f287599q.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.czg);
                    } else {
                        yaVar.f287599q.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.czh);
                    }
                    yaVar.f287585c.setTextColor(dVar3.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adg));
                }
            }
        });
        final int m17 = ti3.i.m(a17);
        java.lang.String str2 = null;
        if (m17 != -1) {
            y0Var.c(new we5.t0() { // from class: com.tencent.mm.ui.chatting.viewitems.ab$$p
                @Override // we5.t0
                public final void a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya yaVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya) g0Var;
                    yaVar.f287586d.setVisibility(0);
                    yb5.d dVar3 = yb5.d.this;
                    android.app.Activity context = dVar3.g();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                    pf5.z zVar = pf5.z.f435481a;
                    if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    ((la5.l0) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(la5.l0.class)).m42291x53d8522f("quote_img", dVar3.g().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b2g));
                    android.app.Activity context2 = dVar3.g();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
                    if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    ((la5.u) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(la5.u.class)).m42291x53d8522f("quote_img", dVar3.g().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b2g));
                    yaVar.f287585c.setMaxWidth((int) (com.p314xaae8f345.mm.ui.zk.a(dVar3.g(), com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10111xba02d508) / i65.a.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)));
                    android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) yaVar.f287585c.getLayoutParams();
                    layoutParams.removeRule(15);
                    layoutParams.addRule(10);
                    layoutParams.topMargin = com.p314xaae8f345.mm.ui.zk.e(dVar3.g(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
                    layoutParams.rightMargin = 0;
                    yaVar.f287585c.setGravity(48);
                    yaVar.f287585c.setIncludeFontPadding(false);
                    yaVar.f287585c.setLayoutParams(layoutParams);
                    yaVar.f287588f.setVisibility(0);
                    if (m17 == 2) {
                        yaVar.f287587e.setVisibility(0);
                    } else {
                        yaVar.f287587e.setVisibility(8);
                    }
                    yaVar.f287586d.setVisibility(0);
                    yaVar.f287586d.setImageBitmap(null);
                }
            });
            com.p314xaae8f345.mm.ui.p2740x696c9db.e3 e3Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.e3(null);
            boolean o17 = ti3.i.o(dVar.g(), null, e3Var, a17, true);
            y0Var.b(e3Var, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bb(this));
            if (!o17) {
                y0Var.c(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21921x5840021());
            }
        } else {
            y0Var.c(new we5.t0() { // from class: com.tencent.mm.ui.chatting.viewitems.ab$$c
                @Override // we5.t0
                public final void a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya yaVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya) g0Var;
                    yb5.d dVar3 = yb5.d.this;
                    yaVar.f287585c.setMaxWidth((int) (com.p314xaae8f345.mm.ui.zk.a(dVar3.g(), com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4451x33e61cdb.f18263x2b3a4fa4) / i65.a.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)));
                    android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) yaVar.f287585c.getLayoutParams();
                    layoutParams.rightMargin = com.p314xaae8f345.mm.ui.zk.e(dVar3.g(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
                    layoutParams.topMargin = com.p314xaae8f345.mm.ui.zk.e(dVar3.g(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561176bi);
                    layoutParams.removeRule(10);
                    layoutParams.addRule(15);
                    yaVar.f287585c.setGravity(19);
                    yaVar.f287585c.setLayoutParams(layoutParams);
                    yaVar.f287588f.setVisibility(8);
                    yaVar.f287586d.setVisibility(8);
                    yaVar.f287587e.setVisibility(8);
                }
            });
        }
        y0Var.c(new we5.t0() { // from class: com.tencent.mm.ui.chatting.viewitems.ab$$d
            @Override // we5.t0
            public final void a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya yaVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya) g0Var;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ab abVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ab.this;
                abVar.getClass();
                ti3.l lVar = c17;
                if (lVar.f501159a) {
                    yaVar.f287585c.setVisibility(0);
                    android.view.View view = yaVar.f39493x8ad70635;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom", "lambda$filling$8", "(Lcom/tencent/mm/plugin/msgquote/model/MsgQuoteHelp$QuoteSummaryResult;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$AppMsgMsgQuoteViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom", "lambda$filling$8", "(Lcom/tencent/mm/plugin/msgquote/model/MsgQuoteHelp$QuoteSummaryResult;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$AppMsgMsgQuoteViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view2 = yaVar.f39493x8ad70635;
                    yb5.d dVar3 = dVar;
                    view2.setOnLongClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.db(abVar, yaVar, dVar3, f9Var));
                    yaVar.f39493x8ad70635.setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.eb(abVar, yaVar, dVar3));
                } else {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(lVar.f501160b)) {
                        yaVar.f287585c.setVisibility(8);
                    }
                    android.view.View view3 = yaVar.f39493x8ad70635;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom", "lambda$filling$8", "(Lcom/tencent/mm/plugin/msgquote/model/MsgQuoteHelp$QuoteSummaryResult;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$AppMsgMsgQuoteViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom", "lambda$filling$8", "(Lcom/tencent/mm/plugin/msgquote/model/MsgQuoteHelp$QuoteSummaryResult;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$AppMsgMsgQuoteViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                yaVar.f287584b.setClickable(true);
            }
        });
        android.os.Bundle a18 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.m1.a(dVar.D(), k01.d.a(f9Var.Q0()));
        final android.text.SpannableString fj6 = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).fj(dVar.g(), v17.f430187f, i65.a.h(dVar.g(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia), 1, a18, le0.x.P0);
        final boolean k17 = ti3.i.k(f9Var);
        y0Var.c(new we5.t0() { // from class: com.tencent.mm.ui.chatting.viewitems.ab$$e
            @Override // we5.t0
            public final void a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var) {
                yb5.d dVar3 = dVar;
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = f9Var;
                boolean z17 = k17;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya yaVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya) g0Var;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ab abVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ab.this;
                abVar.getClass();
                yaVar.f287584b.c(fj6, android.widget.TextView.BufferType.SPANNABLE, null);
                android.content.Context context = yaVar.f287584b.getContext();
                yaVar.f287584b.setTag(com.p314xaae8f345.mm.R.id.nwp, java.lang.Boolean.TRUE);
                if (yaVar.f287591i == null) {
                    rl5.r rVar = new rl5.r(context, yaVar.f287584b);
                    yaVar.f287591i = rVar;
                    rVar.L = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.fb(abVar, dVar3, yaVar, f9Var2);
                    rVar.C = true;
                    rVar.f478888y = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.gb(abVar, context, yaVar, z17, dVar3, f9Var2);
                    rVar.f478887x = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.hb(abVar, yaVar, context, dVar3, f9Var2);
                }
            }
        });
        if (c01.ia.A(f9Var) || c01.ia.x(f9Var)) {
            y0Var.c(new we5.t0() { // from class: com.tencent.mm.ui.chatting.viewitems.ab$$i
                @Override // we5.t0
                public final void a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya yaVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya) g0Var;
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ab abVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ab.this;
                    abVar.getClass();
                    yaVar.f287584b.setTag(com.p314xaae8f345.mm.R.id.nwp, java.lang.Boolean.FALSE);
                    yaVar.f287584b.setOnTouchListener(yaVar.f287593k);
                    yaVar.f287584b.setOnLongClickListener(abVar.u(dVar));
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = yaVar.f287584b;
                    if (abVar.f284827u == null) {
                        abVar.f284827u = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.gc(abVar.f284825s);
                    }
                    c22624x85d69039.setOnClickListener(abVar.f284827u);
                }
            });
        } else {
            y0Var.c(new we5.t0() { // from class: com.tencent.mm.ui.chatting.viewitems.ab$$f
                @Override // we5.t0
                public final void a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya yaVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya) g0Var;
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ab abVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ab.this;
                    abVar.getClass();
                    int i18 = c01.ia.i(f9Var);
                    int i19 = 0;
                    if (i18 <= 0 || i18 >= wl5.y.o(yaVar.f287584b).length()) {
                        i18 = 0;
                    }
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q0 u17 = abVar.u(dVar);
                    wl5.v x17 = abVar.x(u17);
                    wl5.x xVar2 = yaVar.f287592j;
                    if (xVar2 != null) {
                        xVar2.c();
                    }
                    int[] iArr = new int[2];
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = yaVar.f287584b;
                    if (c22624x85d69039 != null) {
                        c22624x85d69039.getLocationInWindow(iArr);
                        i19 = iArr[0];
                        if (i19 == 0) {
                            android.graphics.Rect rect = new android.graphics.Rect();
                            yaVar.f287584b.getGlobalVisibleRect(rect);
                            i19 = rect.left;
                        }
                    }
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690392 = yaVar.f287584b;
                    rl5.r rVar = yaVar.f287591i;
                    if (abVar.f284827u == null) {
                        abVar.f284827u = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.gc(abVar.f284825s);
                    }
                    wl5.o oVar = new wl5.o(c22624x85d690392, rVar, x17, abVar.f284827u, yaVar.f287593k);
                    oVar.f528656g = com.p314xaae8f345.mm.R.C30859x5a72f63.a3y;
                    oVar.f528657h = 18;
                    oVar.f528655f = com.p314xaae8f345.mm.R.C30859x5a72f63.f560393j6;
                    if (i19 != 0) {
                        oVar.a(i19 + com.p314xaae8f345.mm.ui.zk.e(yaVar.f287584b.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
                    }
                    wl5.x xVar3 = new wl5.x(oVar);
                    yaVar.f287592j = xVar3;
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wb wbVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wb(xVar3);
                    xVar3.f528692d = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ib(abVar);
                    u17.f286826h = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.jb(abVar, yaVar);
                    xVar3.C = i18;
                    xVar3.Y = wbVar;
                }
            });
        }
        y0Var.c(new we5.t0() { // from class: com.tencent.mm.ui.chatting.viewitems.ab$$j
            @Override // we5.t0
            public final void a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya yaVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya) g0Var;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ab abVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ab.this;
                abVar.getClass();
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go goVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go(dVar2, dVar.D(), yaVar, null);
                yaVar.f287584b.m84180x74caf26a(abVar);
                yaVar.f287584b.setTag(goVar);
                yaVar.f287584b.m81372xd77b7e83(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.kb(abVar, yaVar));
                yaVar.f287584b.m84175x8dd5167d(Integer.MAX_VALUE);
            }
        });
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io ioVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io.NoTransform;
        if (com.p314xaae8f345.mm.app.p622xc5476f33.k.a()) {
            if (f9Var.i2() && f9Var.b2()) {
                str2 = f9Var.W0();
            }
            ioVar = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym) ((sb5.l2) dVar.f542241c.a(sb5.l2.class))).v0(f9Var);
        }
        final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io ioVar2 = ioVar;
        final java.lang.String str3 = str2;
        y0Var.c(new we5.t0() { // from class: com.tencent.mm.ui.chatting.viewitems.ab$$k
            @Override // we5.t0
            public final void a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var) {
                java.lang.String str4;
                android.view.ViewStub viewStub;
                java.lang.String str5 = str3;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya yaVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya) g0Var;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ab abVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ab.this;
                abVar.getClass();
                boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io ioVar3 = ioVar2;
                if (K0 && ioVar3 == com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io.NoTransform) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5 c21917xeb4fc2b5 = yaVar.f287598p;
                    if (c21917xeb4fc2b5 != null) {
                        c21917xeb4fc2b5.setVisibility(8);
                        return;
                    }
                    return;
                }
                if (yaVar.f287598p == null && (viewStub = yaVar.f287597o) != null) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5 c21917xeb4fc2b52 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5) viewStub.inflate();
                    yaVar.f287598p = c21917xeb4fc2b52;
                    c21917xeb4fc2b52.c();
                }
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context = yaVar.f287584b.getContext();
                int m84164x40077844 = (int) yaVar.f287584b.m84164x40077844();
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = f9Var;
                if (f9Var2 != null) {
                    java.lang.String a19 = c01.n2.a("" + f9Var2.I0());
                    c01.l2 c18 = c01.n2.d().c(a19, true);
                    c18.i("prePublishId", "msg_" + f9Var2.I0());
                    c18.i("preUsername", abVar.A(abVar.f284825s, f9Var2));
                    c18.i("preChatName", abVar.z(abVar.f284825s, f9Var2));
                    str4 = a19;
                } else {
                    str4 = null;
                }
                android.text.SpannableString rj6 = ((ke0.e) xVar2).rj(context, str5, m84164x40077844, 1, null, str4);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsgMsgQuoteFrom", "spannableString：%s", rj6);
                yaVar.f287598p.e(rj6, ioVar3, f9Var2.m124847x74d37ac6());
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5 c21917xeb4fc2b53 = yaVar.f287598p;
                boolean K02 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var2.U0());
                yb5.d dVar3 = dVar;
                c21917xeb4fc2b53.m80030x6e632093(K02 ? dVar3.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jxn) : f9Var2.U0());
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                    return;
                }
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go goVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go(dVar2, dVar3.D(), yaVar, null);
                goVar.R = 2;
                yaVar.f287598p.setTag(goVar);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5 c21917xeb4fc2b54 = yaVar.f287598p;
                if (abVar.f284827u == null) {
                    abVar.f284827u = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.gc(abVar.f284825s);
                }
                c21917xeb4fc2b54.setOnClickListener(abVar.f284827u);
                yaVar.f287598p.m80031x74caf26a(abVar);
                yaVar.f287598p.setOnTouchListener(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) dVar3.f542241c.a(sb5.z.class))).B1);
                yaVar.f287598p.setOnLongClickListener(abVar.u(dVar3));
                yaVar.f287598p.setVisibility(0);
            }
        });
        y0Var.c(new we5.t0() { // from class: com.tencent.mm.ui.chatting.viewitems.ab$$l
            @Override // we5.t0
            public final void a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var) {
                android.widget.TextView textView;
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = f9Var;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya yaVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya) g0Var;
                android.widget.LinearLayout linearLayout = yaVar.f287594l;
                if (linearLayout == null || (textView = yaVar.f287595m) == null) {
                    return;
                }
                we5.e eVar = we5.v.f526926x;
                yb5.d dVar3 = yb5.d.this;
                eVar.a(dVar3, linearLayout, textView, f9Var2, dVar3.g());
                java.lang.String spannableString = fj6.toString();
                java.lang.String x17 = dVar3.x();
                if (spannableString == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemTextFrom", "requestAutoTranslate talker is null or msg is null!");
                    return;
                }
                go.d dVar4 = go.d.f355229a;
                if (dVar4.c(x17) == 2 && f9Var2.A0() == 0 && !f9Var2.i2() && com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.l2.c(spannableString)) {
                    if (go.d.f355231c.containsKey(java.lang.Long.valueOf(f9Var2.m124847x74d37ac6()))) {
                        return;
                    }
                    dVar4.f(f9Var2);
                }
            }
        });
    }

    @Override // com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.f
    public boolean f(android.view.View view, android.view.MotionEvent motionEvent) {
        if (com.p314xaae8f345.mm.ui.tk.f291489c.a()) {
            return true;
        }
        android.content.Intent intent = new android.content.Intent(view.getContext(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f.class);
        intent.putExtra("key_chat_from", this.f284825s.getClass().getName());
        intent.addFlags(67108864);
        final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag();
        if (erVar != null) {
            java.lang.CharSequence a17 = ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) view).a();
            intent.putExtra("Chat_Msg_Id", erVar.c().m124847x74d37ac6());
            intent.putExtra("Chat_User", erVar.c().Q0());
            intent.putExtra("key_chat_text", a17);
            yb5.d dVar = this.f284825s;
            if (dVar != null) {
                intent.putExtra("is_group_chat", dVar.D());
                j45.l.q(this.f284825s.f542242d, intent, 1010, new j45.g() { // from class: com.tencent.mm.ui.chatting.viewitems.ab$$a
                    @Override // j45.g
                    /* renamed from: onActivityResult */
                    public final void mo79431x9d4787cb(int i17, int i18, android.content.Intent intent2) {
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ab abVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ab.this;
                        abVar.getClass();
                        if (i17 == 1010 && i18 == 101) {
                            java.lang.Object a18 = ok5.d.a(intent2, "kPartialQuoteContent");
                            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) abVar.f284825s.f542241c.a(sb5.s0.class))).o0(erVar.c(), a18 instanceof r15.g ? (r15.g) a18 : null);
                        }
                    }
                });
            } else {
                android.content.Context context = view.getContext();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom", "onDoubleTap", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom", "onDoubleTap", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            db5.f.j(view.getContext());
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public com.p314xaae8f345.mm.p2621x8fb0427b.a9 i(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.content.Context context, yb5.q qVar, yb5.a aVar) {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xb(f9Var, context, qVar);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        e(dVar, dVar2, str, we5.y0.a((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya) g0Var));
    }
}
