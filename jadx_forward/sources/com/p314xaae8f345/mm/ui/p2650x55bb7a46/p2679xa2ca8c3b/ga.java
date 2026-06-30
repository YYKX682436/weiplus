package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class ga extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 implements com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.f, com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f285553s;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ia f285555u;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.CharSequence f285554t = "";

    /* renamed from: v, reason: collision with root package name */
    public int f285556v = -1;

    /* renamed from: w, reason: collision with root package name */
    public int f285557w = -1;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570083wt);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q9 q9Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q9();
        q9Var.a(xgVar, true);
        xgVar.setTag(q9Var);
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
                yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                dVar.a0((android.content.Intent) arrayList.get(0));
                yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return false;
            }
            if (itemId == 179) {
                qn4.y.c(dVar.g(), f9Var, null, dVar);
                return true;
            }
            if (itemId != 124 && itemId != 125) {
                if (itemId == 151) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.m(dVar, f9Var.Q0(), f9Var.m124847x74d37ac6(), 2);
                    return false;
                }
                if (itemId == 152) {
                    ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym) ((sb5.l2) dVar.f542241c.a(sb5.l2.class))).o0(f9Var);
                } else if (itemId != 163 && itemId != 164) {
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
                            yj0.a.d(dVar, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            dVar.a0((android.content.Intent) arrayList2.get(0));
                            yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
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
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsgGroupSolitatireTo", " transform text fav failed");
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
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym) ((sb5.l2) dVar.f542241c.a(sb5.l2.class))).t0(menuItem, f9Var);
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        int i17;
        int i18;
        int i19;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar.f475787d.f526833b;
        java.lang.String str = f9Var.G;
        boolean z17 = str != null && str.contains("announcement@all");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go goVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go) view.getTag();
        int d17 = goVar.d();
        int i27 = goVar.R;
        if (i27 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsgGroupSolitatireTo", "接龙消息右键菜单");
            if (x63.g.G(f9Var)) {
                java.lang.String string = this.f285553s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fsr);
                i17 = 2;
                i18 = com.p314xaae8f345.mm.R.C30867xcad56011.b3m;
                i19 = com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24;
                g4Var.c(d17, 151, 0, string, com.p314xaae8f345.mm.R.raw.f79691x8cdb2c3e);
            } else {
                i17 = 2;
                i18 = com.p314xaae8f345.mm.R.C30867xcad56011.b3m;
                i19 = com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24;
            }
            if (!c01.ia.x(f9Var)) {
                g4Var.c(d17, 102, 0, this.f285553s.s().getString(i18), com.p314xaae8f345.mm.R.raw.f79692xc84ca28d);
                g4Var.c(d17, 111, 0, this.f285553s.s().getString(i19), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
            }
            if (f9Var.P0() == 5) {
                g4Var.c(d17, 103, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5i), com.p314xaae8f345.mm.R.raw.f79887x15f6a8c3);
            }
            j45.l.g("favorite");
            g4Var.c(d17, 116, 0, this.f285553s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg), com.p314xaae8f345.mm.R.raw.f79735x2a2da63f);
            if (!z17 && !f9Var.t2() && ((f9Var.P0() == i17 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.L(f9Var, this.f285553s) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.J(f9Var.Q0()) && !this.f285553s.A())) {
                g4Var.c(d17, 123, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572402b40), com.p314xaae8f345.mm.R.raw.f79868x8752620f);
            }
            if (com.p314xaae8f345.mm.app.p622xc5476f33.k.a()) {
                if (f9Var.i2() && f9Var.b2()) {
                    g4Var.c(d17, 163, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572408b46), com.p314xaae8f345.mm.R.raw.f81244x9739f9c3);
                } else {
                    g4Var.c(d17, 124, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b4a), com.p314xaae8f345.mm.R.raw.f79939xd3572d36);
                }
            }
            if (!this.f285553s.F()) {
                g4Var.c(d17, 100, 0, this.f285553s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
            }
        } else if (i27 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsgGroupSolitatireTo", "翻译消息右键菜单");
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

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6
    public void d(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        d0(f9Var);
    }

    public final void d0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var.H2()) {
            y63.a L0 = ((t63.e) i95.n0.c(t63.e.class)).Bi().L0(f9Var.Q0(), f9Var.W1(), true);
            if (L0 != null && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B0(L0.f66137xae937411, f9Var.m124847x74d37ac6())) {
                L0.f66137xae937411 = 0L;
                ((t63.e) i95.n0.c(t63.e.class)).Bi().W0(L0, true);
            }
            android.util.Pair z17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.z(f9Var);
            if (z17 != null && z17.second != null) {
                x63.p Ai = ((t63.e) i95.n0.c(t63.e.class)).Ai();
                long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
                long longValue = ((java.lang.Long) z17.second).longValue();
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = Ai.f533799a;
                android.util.Pair pair = (android.util.Pair) concurrentHashMap.remove(java.lang.Long.valueOf(m124847x74d37ac6));
                java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = Ai.f533800b;
                java.lang.Boolean bool = (java.lang.Boolean) concurrentHashMap2.remove(java.lang.Long.valueOf(m124847x74d37ac6));
                if (pair != null) {
                    concurrentHashMap.put(java.lang.Long.valueOf(longValue), pair);
                    concurrentHashMap2.put(java.lang.Long.valueOf(longValue), bool);
                }
            }
            if (z17 == null || z17.second != null) {
                c01.w9.f(f9Var.m124847x74d37ac6(), f9Var.Q0());
            }
            this.f285553s.L(true);
        }
    }

    @Override // com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.f
    public boolean f(android.view.View view, android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar;
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ja.b(view)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgGroupSolitatireTo", "onDoubleTap solitaire fold double click");
            return true;
        }
        java.lang.CharSequence a17 = ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) view).a();
        android.content.Intent intent = new android.content.Intent(view.getContext(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f.class);
        intent.addFlags(67108864);
        intent.putExtra("key_chat_text", a17);
        intent.putExtra("key_chat_from", view.getContext().getClass().getName());
        if ((view.getTag() instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) && (erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag()) != null) {
            intent.putExtra("Chat_Msg_Id", erVar.c().m124847x74d37ac6());
            intent.putExtra("Chat_User", erVar.c().Q0());
        }
        yb5.d dVar = this.f285553s;
        if (dVar != null) {
            intent.putExtra("is_group_chat", dVar.D());
        }
        android.content.Context context = view.getContext();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireTo", "onDoubleTap", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireTo", "onDoubleTap", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        db5.f.j(view.getContext());
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public com.p314xaae8f345.mm.p2621x8fb0427b.a9 i(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.content.Context context, yb5.q qVar, yb5.a aVar) {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.un(f9Var);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        int i17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io ioVar;
        java.lang.String str2;
        android.view.ViewStub viewStub;
        java.lang.String str3;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q9 q9Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q9) g0Var;
        this.f285553s = dVar;
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f7) ((sb5.e0) dVar.f542241c.a(sb5.e0.class))).n0(f9Var);
        q9Var.f286862b.setTag(com.p314xaae8f345.mm.R.id.bon, java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
        q9Var.f286862b.setTag(com.p314xaae8f345.mm.R.id.rfh, f9Var.Q0());
        q9Var.f286862b.setTag(com.p314xaae8f345.mm.R.id.bom, java.lang.Boolean.TRUE);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ja.a(dVar, q9Var);
        ot0.q v17 = ot0.q.v(f9Var.U1());
        yd5.h.f542632a.a(q9Var.f286862b, f9Var, dVar.D(), str);
        android.os.Bundle c17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bo.c(f9Var, dVar, str);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.l1.f272786g.b(c17, k01.d.a(f9Var.Q0()));
        if (v17 == null || v17.f430199i != 53) {
            return;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = q9Var.f286862b.getContext();
        java.lang.String str4 = v17.f430187f;
        int m84164x40077844 = (int) q9Var.f286862b.m84164x40077844();
        le0.r rVar = le0.x.P0;
        android.text.SpannableString fj6 = ((ke0.e) xVar).fj(context, str4, m84164x40077844, 4, c17, rVar);
        java.lang.String c18 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ja.c(q9Var.f286862b.getContext(), dVar, v17.f430187f, fj6, q9Var.f286862b, f9Var, 4);
        q9Var.f286862b.setClickable(true);
        java.util.ArrayList arrayList = q9Var.f286869i;
        if (fj6 != null) {
            android.text.SpannableString fj7 = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).fj(q9Var.f286862b.getContext(), c18, (int) q9Var.f286862b.m84164x40077844(), 1, c17, rVar);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0[] z0VarArr = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0[]) fj7.getSpans(0, fj6.length(), com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0.class);
            arrayList.clear();
            for (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0 z0Var : z0VarArr) {
                int[] iArr = {fj7.getSpanStart(z0Var), fj7.getSpanEnd(z0Var), com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.y(z0Var)};
                if (iArr[1] - iArr[0] < c18.length()) {
                    arrayList.add(iArr);
                }
            }
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str5 = v17.f430179d;
        ((kt.c) i0Var).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(str5);
        java.lang.String str6 = (h17 == null || (str3 = h17.f67372x453d1e07) == null || str3.trim().length() <= 0) ? v17.H : h17.f67372x453d1e07;
        java.lang.String str7 = v17.f430179d;
        if (str7 == null || str7.length() <= 0 || !com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.y(str6)) {
            q9Var.f286863c.setVisibility(8);
        } else {
            q9Var.f286863c.setText(dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572424b65, ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Vi(dVar.g(), h17, str6)));
            q9Var.f286863c.setVisibility(0);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.r(dVar, q9Var.f286863c, v17.f430179d);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.w(dVar, q9Var.f286863c, v17.f430179d);
        }
        if (x63.g.G(f9Var)) {
            q9Var.f286863c.setText(dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fsw));
            q9Var.f286863c.setVisibility(0);
            q9Var.f286863c.setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.z9(this, f9Var, dVar));
        }
        Z(q9Var, f9Var.P0() < 2, true);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go goVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go(dVar2, dVar.D(), q9Var, null);
        boolean k17 = ti3.i.k(f9Var);
        android.content.Context context2 = q9Var.f286862b.getContext();
        q9Var.f286862b.setTag(com.p314xaae8f345.mm.R.id.nwp, java.lang.Boolean.TRUE);
        if (q9Var.f286865e == null) {
            rl5.r rVar2 = new rl5.r(context2, q9Var.f286862b);
            q9Var.f286865e = rVar2;
            rVar2.L = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.aa(this, dVar, q9Var, f9Var);
            rVar2.C = true;
            rVar2.f478888y = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ba(this, context2, k17);
            rVar2.f478887x = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ca(this, q9Var, context2, dVar);
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q0 u17 = u(dVar);
        wl5.v x17 = x(u(dVar));
        wl5.x xVar2 = q9Var.f286866f;
        if (xVar2 != null) {
            xVar2.c();
        }
        int[] iArr2 = new int[2];
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = q9Var.f286862b;
        if (c22624x85d69039 != null) {
            c22624x85d69039.getLocationInWindow(iArr2);
            int i18 = iArr2[0];
            if (i18 == 0) {
                android.graphics.Rect rect = new android.graphics.Rect();
                q9Var.f286862b.getGlobalVisibleRect(rect);
                i18 = rect.left;
            }
            i17 = i18;
        } else {
            i17 = 0;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690392 = q9Var.f286862b;
        rl5.r rVar3 = q9Var.f286865e;
        if (this.f285555u == null) {
            this.f285555u = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ia(this.f285553s);
        }
        wl5.o oVar = new wl5.o(c22624x85d690392, rVar3, x17, this.f285555u, q9Var.f286867g);
        oVar.f528656g = com.p314xaae8f345.mm.R.C30859x5a72f63.f560343hv;
        oVar.f528657h = 18;
        oVar.f528655f = com.p314xaae8f345.mm.R.C30859x5a72f63.f560341ht;
        if (i17 != 0) {
            oVar.a(i17 + com.p314xaae8f345.mm.ui.zk.e(q9Var.f286862b.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9));
        }
        wl5.x xVar3 = new wl5.x(oVar);
        q9Var.f286866f = xVar3;
        q9Var.f286868h = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ha(xVar3);
        xVar3.f528692d = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.da(this);
        if (arrayList.size() > 0) {
            java.util.ArrayList arrayList2 = q9Var.f286866f.f528705q;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
        }
        u17.f286826h = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ea(this, q9Var);
        q9Var.f286866f.Y = q9Var.f286868h;
        q9Var.f286862b.m84180x74caf26a(this);
        q9Var.f286862b.setTag(goVar);
        q9Var.f286862b.m81372xd77b7e83(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.fa(this, q9Var));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io ioVar2 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io.NoTransform;
        boolean a17 = com.p314xaae8f345.mm.app.p622xc5476f33.k.a();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.c cVar = dVar.f542241c;
        if (a17) {
            str2 = (f9Var.i2() && f9Var.b2()) ? f9Var.W0() : null;
            ioVar = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym) ((sb5.l2) cVar.a(sb5.l2.class))).v0(f9Var);
        } else {
            ioVar = ioVar2;
            str2 = null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && ioVar == ioVar2) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5 c21917xeb4fc2b5 = q9Var.f286872l;
            if (c21917xeb4fc2b5 != null) {
                c21917xeb4fc2b5.setVisibility(8);
            }
        } else {
            if (q9Var.f286872l == null && (viewStub = q9Var.f286871k) != null) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5 c21917xeb4fc2b52 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5) viewStub.inflate();
                q9Var.f286872l = c21917xeb4fc2b52;
                c21917xeb4fc2b52.c();
            }
            android.os.Bundle a18 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.l1.f272786g.a(k01.d.a(f9Var.Q0()));
            le0.x xVar4 = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context3 = q9Var.f286862b.getContext();
            int m84164x400778442 = (int) q9Var.f286862b.m84164x40077844();
            java.lang.String a19 = c01.n2.a("" + f9Var.I0());
            c01.l2 c19 = c01.n2.d().c(a19, true);
            c19.i("prePublishId", "msg_" + f9Var.I0());
            c19.i("preUsername", A(this.f285553s, f9Var));
            c19.i("preChatName", z(this.f285553s, f9Var));
            le0.r rVar4 = le0.x.P0;
            ((ke0.e) xVar4).getClass();
            android.text.SpannableString s17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.s(context3, str2, m84164x400778442, 1, a18, a19, 0, rVar4, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsgGroupSolitatireTo", "spannableString：%s", s17);
            q9Var.f286872l.e(s17, ioVar, f9Var.m124847x74d37ac6());
            q9Var.f286872l.m80030x6e632093(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.U0()) ? dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jxn) : f9Var.U0());
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go goVar2 = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go(dVar2, dVar.D(), q9Var, null);
                goVar2.R = 2;
                q9Var.f286872l.setTag(goVar2);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5 c21917xeb4fc2b53 = q9Var.f286872l;
                if (this.f285555u == null) {
                    this.f285555u = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ia(this.f285553s);
                }
                c21917xeb4fc2b53.setOnClickListener(this.f285555u);
                q9Var.f286872l.m80031x74caf26a(this);
                q9Var.f286872l.setOnTouchListener(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) cVar.a(sb5.z.class))).B1);
                q9Var.f286872l.setOnLongClickListener(u(dVar));
                q9Var.f286872l.setVisibility(0);
            }
        }
        V(q9Var, dVar2, dVar.t(), dVar.D(), dVar, this);
    }
}
