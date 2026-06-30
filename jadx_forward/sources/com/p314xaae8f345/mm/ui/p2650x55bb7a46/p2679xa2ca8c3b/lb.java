package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class lb extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 implements com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.f, com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6, we5.b {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f285945s;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.gc f285947u;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.CharSequence f285946t = "";

    /* renamed from: v, reason: collision with root package name */
    public int f285948v = -1;

    /* renamed from: w, reason: collision with root package name */
    public int f285949w = -1;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570087wx);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya yaVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya();
        yaVar.a(xgVar, false);
        xgVar.setTag(yaVar);
        return xgVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return true;
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
        if (itemId == 103) {
            d0(f9Var);
        } else {
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
                yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                dVar.a0((android.content.Intent) arrayList.get(0));
                yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
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
                            yj0.a.d(dVar, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            dVar.a0((android.content.Intent) arrayList2.get(0));
                            yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
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
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsgMsgQuoteTo", " transform text fav failed");
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
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        int i17;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar.f475787d.f526833b;
        java.lang.String str = f9Var.G;
        boolean z17 = str != null && str.contains("announcement@all");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go goVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go) view.getTag();
        int d17 = goVar.d();
        int i18 = goVar.R;
        if (i18 == 1) {
            if (c01.ia.x(f9Var)) {
                i17 = 2;
            } else {
                i17 = 2;
                g4Var.c(d17, 102, 0, this.f285945s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3m), com.p314xaae8f345.mm.R.raw.f79692xc84ca28d);
                g4Var.c(d17, 111, 0, this.f285945s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
            }
            if (f9Var.P0() == 5) {
                g4Var.c(d17, 103, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5i), com.p314xaae8f345.mm.R.raw.f79887x15f6a8c3);
            }
            j45.l.g("favorite");
            g4Var.c(d17, 116, 0, this.f285945s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg), com.p314xaae8f345.mm.R.raw.f79735x2a2da63f);
            if (!z17 && !f9Var.t2() && ((f9Var.P0() == i17 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.L(f9Var, this.f285945s) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.J(f9Var.Q0()) && !this.f285945s.A())) {
                g4Var.c(d17, 123, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572402b40), com.p314xaae8f345.mm.R.raw.f79868x8752620f);
            }
            ot0.q v17 = ot0.q.v(f9Var.U1());
            java.lang.String str2 = v17 == null ? "" : v17.f430187f;
            if (com.p314xaae8f345.mm.app.p622xc5476f33.k.a() && com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.l2.d(str2)) {
                if (f9Var.i2() && f9Var.b2()) {
                    g4Var.c(d17, 163, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572408b46), com.p314xaae8f345.mm.R.raw.f81244x9739f9c3);
                } else {
                    g4Var.c(d17, 124, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b4a), com.p314xaae8f345.mm.R.raw.f79939xd3572d36);
                }
            }
            if (!this.f285945s.F()) {
                g4Var.c(d17, 100, 0, this.f285945s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
            }
        } else if (i18 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsgMsgQuoteTo", "翻译消息右键菜单");
            g4Var.c(d17, 141, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3m), com.p314xaae8f345.mm.R.raw.f79692xc84ca28d);
            g4Var.c(d17, com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50673x992affbf, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
            j45.l.g("favorite");
            g4Var.c(d17, com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50613xc9bdf6cd, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg), com.p314xaae8f345.mm.R.raw.f79735x2a2da63f);
            if (com.p314xaae8f345.mm.app.p622xc5476f33.k.a() && f9Var.i2() && f9Var.b2()) {
                g4Var.c(d17, 163, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572408b46), com.p314xaae8f345.mm.R.raw.f81244x9739f9c3);
                g4Var.c(d17, 164, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lsg), com.p314xaae8f345.mm.R.raw.f80466xfeba7d4f);
                qn4.y.a(g4Var, d17, view.getContext(), f9Var);
                g4Var.c(d17, 152, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3s), com.p314xaae8f345.mm.R.raw.f79736xffb29de6);
            }
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

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6
    public void d(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        d0(f9Var);
    }

    public final void d0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        boolean z17;
        if (f9Var.T2()) {
            aa0.e eVar = (aa0.e) i95.n0.c(aa0.e.class);
            ui3.b z07 = ((ri3.e) eVar).Di().z0(f9Var.Q0(), f9Var.m124847x74d37ac6());
            android.util.Pair z18 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.z(f9Var);
            if (z18 != null) {
                if (z07 != null) {
                    z07.f66416x297eb4f7 = ((java.lang.Long) z18.second).longValue();
                    z17 = ((ri3.e) ((aa0.e) i95.n0.c(aa0.e.class))).Di().P0(z07);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsgMsgQuoteTo", "resendQuoteMsg() msgQute is null!");
                    z17 = false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgMsgQuoteTo", "resendQuoteMsg result:%s msgId:%s result:%s", z18.first, z18.second, java.lang.Boolean.valueOf(z17));
            }
            if (z18 == null || z18.second != null) {
                c01.w9.f(f9Var.m124847x74d37ac6(), f9Var.Q0());
            }
            this.f285945s.L(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0194  */
    @Override // we5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(final yb5.d r21, final rd5.d r22, java.lang.String r23, we5.y0 r24) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lb.e(yb5.d, rd5.d, java.lang.String, we5.y0):void");
    }

    @Override // com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.f
    public boolean f(android.view.View view, android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar;
        if (com.p314xaae8f345.mm.ui.tk.f291489c.a()) {
            return true;
        }
        java.lang.CharSequence a17 = ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) view).a();
        android.content.Intent intent = new android.content.Intent(view.getContext(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f.class);
        intent.putExtra("key_chat_from", this.f285945s.getClass().getName());
        intent.addFlags(67108864);
        intent.putExtra("key_chat_text", a17);
        final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = null;
        if ((view.getTag() instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) && (erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag()) != null) {
            f9Var = erVar.c();
            intent.putExtra("Chat_Msg_Id", erVar.c().m124847x74d37ac6());
            intent.putExtra("Chat_User", erVar.c().Q0());
        }
        yb5.d dVar = this.f285945s;
        if (dVar != null) {
            intent.putExtra("is_group_chat", dVar.D());
            j45.l.q(this.f285945s.f542242d, intent, 1010, new j45.g() { // from class: com.tencent.mm.ui.chatting.viewitems.lb$$b
                @Override // j45.g
                /* renamed from: onActivityResult */
                public final void mo79431x9d4787cb(int i17, int i18, android.content.Intent intent2) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2;
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lb lbVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lb.this;
                    lbVar.getClass();
                    if (i17 == 1010 && i18 == 101 && (f9Var2 = f9Var) != null) {
                        java.lang.Object a18 = ok5.d.a(intent2, "kPartialQuoteContent");
                        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) lbVar.f285945s.f542241c.a(sb5.s0.class))).o0(f9Var2, a18 instanceof r15.g ? (r15.g) a18 : null);
                    }
                }
            });
        } else {
            android.content.Context context = view.getContext();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo", "onDoubleTap", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo", "onDoubleTap", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        db5.f.j(view.getContext());
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
