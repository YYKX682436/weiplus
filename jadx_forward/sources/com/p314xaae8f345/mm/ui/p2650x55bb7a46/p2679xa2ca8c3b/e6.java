package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes7.dex */
public final class e6 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f285377s;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if ((view != null ? view.getTag() : null) != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569984e10);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.d6 d6Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.d6();
        d6Var.a(xgVar);
        xgVar.setTag(d6Var);
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
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = msgData.f475787d.f526833b;
        return false;
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
            return false;
        }
        yb5.d dVar = this.f285377s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar);
        menu.c(d17, 100, 0, dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public com.p314xaae8f345.mm.p2621x8fb0427b.a9 i(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.content.Context context, yb5.q qVar, yb5.a componentProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(componentProvider, "componentProvider");
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.f6(f9Var);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 holder, yb5.d ui6, rd5.d msgData, java.lang.String str) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = msgData.f475787d.f526833b;
        this.f285377s = ui6;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.d6 d6Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.d6) holder;
        ot0.q v17 = ot0.q.v(f9Var != null ? f9Var.U1() : null);
        if (v17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMsgEcsKFDynamicCardViewHolder", "content is null");
        } else {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f0 f0Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f0) v17.y(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f0.class);
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMsgEcsKFDynamicCardViewHolder", "AppContentEcsKFCardPiece is null");
            } else {
                java.lang.String str3 = f0Var.f273151c;
                java.lang.String str4 = f0Var.f273150b;
                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = d6Var.f285305b;
                if (c1073x7e08a787 != null) {
                    if (!(c1073x7e08a787.getChildCount() > 0 && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c1073x7e08a787.getTag(), str3))) {
                        c1073x7e08a787 = null;
                    }
                    if (c1073x7e08a787 != null) {
                        c1073x7e08a787.removeAllViews();
                    }
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMsgEcsKFDynamicCardViewHolder", "AppContentEcsKFCardPiece.frameSetName is null");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgEcsKFDynamicCardViewHolder", "framesetname : " + str3 + ", framesetData : " + str4);
                    if (((a12.s) ((a12.k) i95.n0.c(a12.k.class))).wi(java.lang.Integer.valueOf(f0Var.f273152d))) {
                        if (f0Var.f273153e) {
                            android.view.View view = d6Var.f285306c;
                            if (view != null) {
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                                arrayList.add(0);
                                java.util.Collections.reverse(arrayList);
                                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgEcsKFDynamicCard$AppMsgEcsKFDynamicCardViewHolder", "parseMsgInfo", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgEcsKFDynamicCard$AppMsgEcsKFDynamicCardViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                                yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgEcsKFDynamicCard$AppMsgEcsKFDynamicCardViewHolder", "parseMsgInfo", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgEcsKFDynamicCard$AppMsgEcsKFDynamicCardViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7872 = d6Var.f285305b;
                            if (c1073x7e08a7872 != null) {
                                c1073x7e08a7872.m7181x8e6ff544((int) c1073x7e08a7872.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561755rt));
                                c1073x7e08a7872.setPadding((int) c1073x7e08a7872.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.afe), 0, 0, 0);
                                int dimension = (int) c1073x7e08a7872.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561410hq);
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLayout_marginTop", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
                                android.view.ViewGroup.LayoutParams layoutParams = c1073x7e08a7872.getLayoutParams();
                                android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                                if (marginLayoutParams2 != null) {
                                    marginLayoutParams2.topMargin = dimension;
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLayout_marginTop", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
                                int dimension2 = (int) c1073x7e08a7872.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561410hq);
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLayout_marginBottom", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
                                android.view.ViewGroup.LayoutParams layoutParams2 = c1073x7e08a7872.getLayoutParams();
                                marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
                                if (marginLayoutParams != null) {
                                    marginLayoutParams.bottomMargin = dimension2;
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLayout_marginBottom", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
                            }
                        } else {
                            android.view.View view2 = d6Var.f285306c;
                            if (view2 != null) {
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                                arrayList2.add(8);
                                java.util.Collections.reverse(arrayList2);
                                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgEcsKFDynamicCard$AppMsgEcsKFDynamicCardViewHolder", "parseMsgInfo", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgEcsKFDynamicCard$AppMsgEcsKFDynamicCardViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                                yj0.a.f(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgEcsKFDynamicCard$AppMsgEcsKFDynamicCardViewHolder", "parseMsgInfo", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgEcsKFDynamicCard$AppMsgEcsKFDynamicCardViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7873 = d6Var.f285305b;
                            if (c1073x7e08a7873 != null) {
                                int dimension3 = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561410hq);
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLayout_marginLeft", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
                                android.view.ViewGroup.LayoutParams layoutParams3 = c1073x7e08a7873.getLayoutParams();
                                marginLayoutParams = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
                                if (marginLayoutParams != null) {
                                    marginLayoutParams.leftMargin = dimension3;
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLayout_marginLeft", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
                            }
                        }
                        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7874 = d6Var.f285305b;
                        if (c1073x7e08a7874 != null) {
                            a12.k kVar = (a12.k) i95.n0.c(a12.k.class);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str4);
                            a12.s sVar = (a12.s) kVar;
                            sVar.getClass();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsKFDynamicCardService", "setFrameSetView bizHandle:" + sVar.f82060h);
                            iq0.c Bi = sVar.Bi();
                            if (Bi != null) {
                                i95.m c17 = i95.n0.c(gq0.t.class);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                                gq0.t.Ve((gq0.t) c17, Bi, null, c1073x7e08a7874, str3, str4, 0, new a12.r(str3, sVar), 34, null);
                                str2 = str3;
                            } else {
                                str2 = str3;
                            }
                            c1073x7e08a7874.setTag(str2);
                        } else {
                            str2 = str3;
                        }
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                        sb5.n0 n0Var = (sb5.n0) ui6.f542241c.a(sb5.n0.class);
                        if (n0Var != null) {
                            java.util.HashMap hashMap = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.w9) n0Var).f281694e;
                            hashMap.put(str2, d6Var);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsKFComponent", "frameSetNameholdermap size:" + hashMap.size());
                        }
                        a12.k kVar2 = (a12.k) i95.n0.c(a12.k.class);
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.c6 c6Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.c6(ui6, f9Var, str);
                        a12.s sVar2 = (a12.s) kVar2;
                        sVar2.getClass();
                        sVar2.f82062m = new java.lang.ref.WeakReference(c6Var);
                    }
                }
            }
        }
        android.view.View view3 = holder.f39494xbf64baf8;
        if (view3 != null) {
            ((b00.a0) ((c00.u3) i95.n0.c(c00.u3.class))).a(view3, f9Var, "ecs_kf_card_dynamic", -1);
        }
    }
}
