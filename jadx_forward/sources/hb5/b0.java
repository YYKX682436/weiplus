package hb5;

/* loaded from: classes9.dex */
public class b0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21587xf1094a47 f361684d;

    public b0(com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21587xf1094a47 activityC21587xf1094a47) {
        this.f361684d = activityC21587xf1094a47;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        long j18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/bizchat/BizChatSearchUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21587xf1094a47 activityC21587xf1094a47 = this.f361684d;
        hb5.k0 item = activityC21587xf1094a47.f279467o.getItem(i17);
        int i18 = item.f361743a;
        if (i18 == 1 || i18 == 2) {
            java.lang.Object obj = item.f361744b;
            if (obj instanceof s01.h) {
                s01.h hVar = (s01.h) obj;
                if (hVar != null) {
                    j18 = hVar.f69168x92559640;
                }
                j18 = -1;
            } else {
                if (obj instanceof r45.uj) {
                    r45.xj xjVar = ((r45.uj) obj).f468940d;
                    java.lang.String str = activityC21587xf1094a47.f279459d;
                    s01.a0 a0Var = new s01.a0();
                    a0Var.f65840x13fe5d2b = xjVar.f471686d;
                    a0Var.f65841xdde069b = xjVar.f471687e;
                    a0Var.f65836x75756b18 = str;
                    a0Var.f65837x35be6339 = xjVar.f471689g;
                    a0Var.f65839x776e2b6b = xjVar.f471690h;
                    a0Var.f65833xd21ffea8 = xjVar.f471688f;
                    a0Var.f65834x53f3fff9 = xjVar.f471692m;
                    if (!r01.q3.Vi().J0(a0Var) ? r01.q3.Vi().mo880xb970c2b9(a0Var) : true) {
                        s01.h hVar2 = new s01.h();
                        hVar2.f69169xf75e5c37 = a0Var.f65840x13fe5d2b;
                        hVar2.f69170x75756b18 = a0Var.f65836x75756b18;
                        hVar2.f69171x736d1fa8 = a0Var.f65841xdde069b;
                        hVar2.f69173x73703457 = 1;
                        s01.h m17 = s01.r.m(hVar2);
                        if (m17 != null) {
                            s01.b J0 = r01.q3.aj().J0(m17.f69168x92559640);
                            J0.f69064xa6206081 = m17.f69168x92559640;
                            J0.f69079xa35b5abb = 0;
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(J0.f69065x75756b18)) {
                                J0.f69065x75756b18 = m17.f69170x75756b18;
                                long currentTimeMillis = java.lang.System.currentTimeMillis();
                                J0.f69074x2c252eb3 = currentTimeMillis;
                                J0.f69071x225ba391 = currentTimeMillis;
                            }
                            if (!r01.q3.aj().n1(J0)) {
                                r01.q3.aj().mo880xb970c2b9(J0);
                            }
                            j18 = m17.f69168x92559640;
                        }
                    }
                }
                j18 = -1;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC21587xf1094a47.f279459d) && j18 >= 0) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Chat_User", activityC21587xf1094a47.f279459d);
                intent.putExtra("key_biz_chat_id", j18);
                intent.putExtra("finish_direct", true);
                intent.putExtra("key_need_send_video", false);
                intent.putExtra("key_is_biz_chat", true);
                j45.l.u(activityC21587xf1094a47.mo55332x76847179(), ".ui.chatting.ChattingUI", intent, null);
            }
        } else if (i18 == 6) {
            try {
                r45.co coVar = (r45.co) ((fb5.n) item.f361744b).f342431b;
                if (coVar != null) {
                    boolean l17 = r01.z.l(coVar.f453209d);
                    rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
                    java.lang.String str2 = coVar.f453209d;
                    ((qv.o) u2Var).getClass();
                    boolean g17 = r01.z.g(str2);
                    qk.o b17 = r01.z.b(coVar.f453209d);
                    java.lang.String z07 = b17 == null ? null : b17.z0();
                    if (z07 == null) {
                        z07 = "";
                    }
                    if (l17) {
                        android.content.Intent intent2 = new android.content.Intent();
                        intent2.putExtra("rawUrl", z07);
                        intent2.putExtra("useJs", true);
                        intent2.putExtra("srcUsername", coVar.f453209d);
                        intent2.putExtra("bizofstartfrom", "enterpriseHomeSubBrand");
                        intent2.addFlags(67108864);
                        j45.l.j(activityC21587xf1094a47.mo55332x76847179(), "webview", ".ui.tools.WebViewUI", intent2, null);
                        activityC21587xf1094a47.T6(b17, 2);
                    } else if (g17) {
                        android.content.Intent intent3 = new android.content.Intent();
                        intent3.putExtra("Contact_User", coVar.f453209d);
                        intent3.addFlags(67108864);
                        intent3.putExtra("biz_chat_from_scene", 3);
                        j45.l.u(activityC21587xf1094a47.mo55332x76847179(), ".ui.bizchat.BizChatConversationUI", intent3, null);
                    } else {
                        android.content.Intent intent4 = new android.content.Intent();
                        intent4.addFlags(67108864);
                        intent4.putExtra("finish_direct", true);
                        intent4.putExtra("Chat_User", coVar.f453209d);
                        intent4.putExtra("chat_from_scene", 2);
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC21587xf1094a47.mo55332x76847179();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandService.BrandServiceApplication", "startChattingUI");
                        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.j(intent4, mo55332x76847179);
                        activityC21587xf1094a47.T6(b17, 1);
                    }
                }
            } catch (java.lang.Throwable unused) {
            }
        } else if (i18 == 3) {
            if (((java.lang.Integer) item.f361744b).intValue() == 1) {
                android.content.Intent intent5 = new android.content.Intent(activityC21587xf1094a47.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21587xf1094a47.class);
                intent5.putExtra("enterprise_biz_name", activityC21587xf1094a47.f279459d);
                intent5.putExtra("biz_chat_search_scene", 2);
                intent5.putExtra("biz_chat_search_text", activityC21587xf1094a47.f279464i.g());
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent5);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(activityC21587xf1094a47, arrayList2.toArray(), "com/tencent/mm/ui/bizchat/BizChatSearchUI", "goToMoreUserUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activityC21587xf1094a47.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(activityC21587xf1094a47, "com/tencent/mm/ui/bizchat/BizChatSearchUI", "goToMoreUserUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (((java.lang.Integer) item.f361744b).intValue() == 2) {
                android.content.Intent intent6 = new android.content.Intent(activityC21587xf1094a47.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21587xf1094a47.class);
                intent6.putExtra("enterprise_biz_name", activityC21587xf1094a47.f279459d);
                intent6.putExtra("biz_chat_search_scene", 3);
                intent6.putExtra("biz_chat_search_text", activityC21587xf1094a47.f279464i.g());
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(intent6);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(activityC21587xf1094a47, arrayList3.toArray(), "com/tencent/mm/ui/bizchat/BizChatSearchUI", "goToMoreGroupUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activityC21587xf1094a47.startActivity((android.content.Intent) arrayList3.get(0));
                yj0.a.f(activityC21587xf1094a47, "com/tencent/mm/ui/bizchat/BizChatSearchUI", "goToMoreGroupUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (((java.lang.Integer) item.f361744b).intValue() == 3) {
                android.content.Intent intent7 = new android.content.Intent(activityC21587xf1094a47.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21587xf1094a47.class);
                intent7.putExtra("enterprise_biz_name", activityC21587xf1094a47.f279459d);
                intent7.putExtra("enterprise_biz_father_name", activityC21587xf1094a47.f279460e);
                intent7.putExtra("biz_chat_search_scene", 4);
                intent7.putExtra("biz_chat_search_text", activityC21587xf1094a47.f279464i.g());
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(intent7);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(activityC21587xf1094a47, arrayList4.toArray(), "com/tencent/mm/ui/bizchat/BizChatSearchUI", "goToMoreAppUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activityC21587xf1094a47.startActivity((android.content.Intent) arrayList4.get(0));
                yj0.a.f(activityC21587xf1094a47, "com/tencent/mm/ui/bizchat/BizChatSearchUI", "goToMoreAppUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/bizchat/BizChatSearchUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
