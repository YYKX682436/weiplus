package n04;

/* loaded from: classes11.dex */
public class l implements u13.i {
    @Override // u13.h
    public boolean b(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        e23.p0 p0Var = (e23.p0) gVar;
        ((s50.k0) ((u50.w) i95.n0.c(u50.w.class))).aj(gVar.i(), 0L);
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(p0Var.f328460s) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(p0Var.f328460s)) {
            boolean G = c01.e2.G(p0Var.f328460s);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.f9 f9Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.SessionOa;
            if (!G) {
                java.lang.String str = p0Var.f328460s;
                if ((str != null && str.equalsIgnoreCase("findersayhisessionholder")) && !f9Var.k(view.getContext(), null)) {
                    return true;
                }
            } else if (!f9Var.k(view.getContext(), null)) {
                return true;
            }
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.GlobalWeCom.k(view.getContext(), null)) {
            return true;
        }
        int i17 = p0Var.f328459r;
        if (i17 == 0) {
            android.content.Intent putExtra = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15602xdcd786c2.class).putExtra("Search_Scene", p0Var.f505298h).putExtra("key_conv", p0Var.f328460s).putExtra("key_query", p0Var.i()).putExtra("key_count", 1);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(putExtra);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/search/ui/item/handler/FTSMessageDataItemClickHandler", "onItemClick", "(Landroid/content/Context;Landroid/view/View;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/search/ui/item/handler/FTSMessageDataItemClickHandler", "onItemClick", "(Landroid/content/Context;Landroid/view/View;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
        if (i17 == 1) {
            rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
            java.lang.String str2 = p0Var.f328460s;
            ((qv.o) u2Var).getClass();
            if (r01.z.j(str2)) {
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.l(new android.content.Intent().putExtra("Contact_User", p0Var.f328460s), context);
            } else {
                rv.u2 u2Var2 = (rv.u2) i95.n0.c(rv.u2.class);
                java.lang.String str3 = p0Var.f328460s;
                ((qv.o) u2Var2).getClass();
                if (r01.z.g(str3)) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("Contact_User", p0Var.f328460s);
                    intent.addFlags(67108864);
                    intent.putExtra("biz_chat_from_scene", 5);
                    j45.l.u(context, ".ui.bizchat.BizChatConversationUI", intent, null);
                } else if (r01.z.l(p0Var.f328460s)) {
                    qk.o b17 = r01.z.b(p0Var.f328460s);
                    java.lang.String z07 = b17 == null ? null : b17.z0();
                    if (z07 == null) {
                        z07 = "";
                    }
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("rawUrl", z07);
                    intent2.putExtra("useJs", true);
                    intent2.putExtra("srcUsername", p0Var.f328460s);
                    intent2.putExtra("bizofstartfrom", "enterpriseHomeSubBrand");
                    intent2.addFlags(67108864);
                    j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent2, null);
                } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.C3(p0Var.f328460s)) {
                    java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(p0Var.f505295e.f432664c);
                    android.content.Intent intent3 = new android.content.Intent();
                    intent3.putExtra("Chat_User", p0Var.f328458q.f432722g);
                    intent3.putExtra("finish_direct", true);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    boolean a17 = z65.c.a();
                    e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
                    if (e0Var != null) {
                        a17 = ((h62.d) e0Var).fj(e42.d0.clicfg_android_appbrand_contact_support_send_video, a17);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandContactABTests", "isSupportSendVideo#get, " + a17);
                    if (!a17) {
                        intent3.putExtra("key_need_send_video", false);
                    }
                    intent3.putExtra("from_global_search", true);
                    intent3.putExtra("msg_local_id", p0Var.f328458q.f432719d);
                    intent3.putExtra("highlight_keyword_list", P1);
                    intent3.putExtra("app_brand_chatting_from_scene_new", 5);
                    j45.l.u(context, ".ui.chatting.AppBrandServiceChattingUI", intent3, null);
                } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.a4(p0Var.f328460s)) {
                    android.content.Intent putExtra2 = new android.content.Intent().putExtra("Chat_User", p0Var.f328460s).putExtra("Chat_Self", ((f63.e) ((f63.h) ((u53.e0) i95.n0.c(u53.e0.class))).Ai(p0Var.f328460s)).t0()).putExtra("finish_direct", true);
                    putExtra2.putExtra("chat_from_scene", 5);
                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.j(putExtra2, context);
                } else {
                    android.content.Intent putExtra3 = new android.content.Intent().putExtra("Chat_User", p0Var.f328460s).putExtra("finish_direct", true).putExtra("from_global_search", true).putExtra("msg_local_id", p0Var.f328458q.f432719d).putExtra("highlight_keyword_list", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(p0Var.f505295e.f432664c));
                    putExtra3.putExtra("chat_from_scene", 5);
                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.j(putExtra3, context);
                }
            }
        } else {
            rv.u2 u2Var3 = (rv.u2) i95.n0.c(rv.u2.class);
            java.lang.String str5 = p0Var.f328460s;
            ((qv.o) u2Var3).getClass();
            if (r01.z.g(str5)) {
                android.content.Intent intent4 = new android.content.Intent();
                intent4.putExtra("Contact_User", p0Var.f328460s);
                intent4.addFlags(67108864);
                intent4.putExtra("biz_chat_from_scene", 5);
                j45.l.u(context, ".ui.bizchat.BizChatConversationUI", intent4, null);
            } else if (r01.z.l(p0Var.f328460s)) {
                qk.o b18 = r01.z.b(p0Var.f328460s);
                java.lang.String z08 = b18 == null ? null : b18.z0();
                if (z08 == null) {
                    z08 = "";
                }
                android.content.Intent intent5 = new android.content.Intent();
                intent5.putExtra("rawUrl", z08);
                intent5.putExtra("useJs", true);
                intent5.putExtra("srcUsername", p0Var.f328460s);
                intent5.putExtra("bizofstartfrom", "enterpriseHomeSubBrand");
                intent5.addFlags(67108864);
                j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent5, null);
            } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.a4(p0Var.f328460s)) {
                android.content.Intent putExtra4 = new android.content.Intent().putExtra("Chat_User", p0Var.f328460s).putExtra("Chat_Self", ((f63.e) ((f63.h) ((u53.e0) i95.n0.c(u53.e0.class))).Ai(p0Var.f328460s)).t0()).putExtra("finish_direct", true);
                putExtra4.putExtra("chat_from_scene", 5);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.j(putExtra4, context);
            } else if (p0Var instanceof e23.p1) {
                e23.p1 p1Var = (e23.p1) p0Var;
                android.content.Intent putExtra5 = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15603x4567ab29.class).putExtra("Search_Scene", p1Var.f505298h).putExtra("key_talker_query", p1Var.B.f432736u.f432662a).putExtra("key_talker", p1Var.B.f432720e).putExtra("key_conv", p1Var.f328460s).putExtra("key_query", p1Var.i()).putExtra("detail_type", p1Var.C);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(putExtra5);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/search/ui/item/handler/FTSMessageDataItemClickHandler", "onItemClick", "(Landroid/content/Context;Landroid/view/View;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/search/ui/item/handler/FTSMessageDataItemClickHandler", "onItemClick", "(Landroid/content/Context;Landroid/view/View;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                android.content.Intent putExtra6 = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15602xdcd786c2.class).putExtra("Search_Scene", p0Var.f505298h).putExtra("key_conv", p0Var.f328460s).putExtra("key_query", p0Var.i()).putExtra("key_count", p0Var.f328459r);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(putExtra6);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(context, arrayList3.toArray(), "com/tencent/mm/plugin/search/ui/item/handler/FTSMessageDataItemClickHandler", "onItemClick", "(Landroid/content/Context;Landroid/view/View;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList3.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/search/ui/item/handler/FTSMessageDataItemClickHandler", "onItemClick", "(Landroid/content/Context;Landroid/view/View;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
        return true;
    }
}
