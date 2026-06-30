package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class b3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f271719d;

    public b3(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f271719d = c19666xfd6e2f33;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$58", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        b31.l lVar = b31.l.f99146a;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f271719d;
        java.lang.String userName = c19666xfd6e2f33.f271502d;
        java.lang.String sessionId = c19666xfd6e2f33.f271565n6;
        java.lang.String currentLang = c19666xfd6e2f33.f271547k6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(currentLang, "currentLang");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "stt_change_language_btn");
        hashMap.put("current_language_code", currentLang);
        hashMap.put("chat_username", userName);
        hashMap.put("stt_translate_sessionid", sessionId);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 35268);
        c19666xfd6e2f33.C1();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.y4 y4Var = c19666xfd6e2f33.f271488a3;
        final android.app.Activity g17 = y4Var != null ? y4Var.a().g() : c19666xfd6e2f33.m75433x19263085();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("intent_key_language_name", c19666xfd6e2f33.f271542j6);
        intent.putExtra("intent_key_first_item_name", "");
        pf5.j0.a(intent, com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v.class);
        bh5.c cVar = new bh5.c();
        cVar.d(intent);
        cVar.b(com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.C18777xa4e89ccb.class);
        cVar.f102455a.f102457a = g17;
        cVar.c(true);
        cVar.f(false);
        cVar.a(com.p314xaae8f345.mm.ui.p2694xe7814c81.ActivityC22353x5623e3da.class.getName());
        cVar.i(new com.p314xaae8f345.mm.ui.zc() { // from class: com.tencent.mm.pluginsdk.ui.chat.b3$$a
            @Override // com.p314xaae8f345.mm.ui.zc
            public final void a(int i17, android.content.Intent intent2) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.b3 b3Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.b3.this;
                b3Var.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatFooter", "onActivityResult resultCode:%s, data:%s", java.lang.Integer.valueOf(i17), intent2);
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f332 = b3Var.f271719d;
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33.c(c19666xfd6e2f332);
                if (i17 != -1 || intent2 == null) {
                    return;
                }
                java.lang.String stringExtra = intent2.getStringExtra("intent_key_language_name");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                    return;
                }
                java.lang.String targetLang = intent2.getStringExtra("intent_key_language_code");
                b31.l lVar2 = b31.l.f99146a;
                java.lang.String userName2 = c19666xfd6e2f332.f271502d;
                java.lang.String sessionId2 = c19666xfd6e2f332.f271565n6;
                java.lang.String currentLang2 = c19666xfd6e2f332.f271547k6;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName2, "userName");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId2, "sessionId");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(currentLang2, "currentLang");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetLang, "targetLang");
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("current_language_code", currentLang2);
                hashMap2.put("target_language_code", targetLang);
                hashMap2.put("chat_username", userName2);
                hashMap2.put("stt_translate_sessionid", sessionId2);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("stt_clk_lang", hashMap2, 35268);
                c19666xfd6e2f332.f271542j6 = stringExtra;
                c19666xfd6e2f332.f271547k6 = targetLang;
                int i18 = pn4.c2.f438596d;
                jz5.g gVar = pn4.c2.f438599g;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) gVar).mo141623x754a37bb();
                if (o4Var != null) {
                    o4Var.D("translate_language", targetLang);
                }
                java.lang.String langName = c19666xfd6e2f332.f271542j6;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(langName, "langName");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) gVar).mo141623x754a37bb();
                if (o4Var2 != null) {
                    o4Var2.D("translate_language_name", langName);
                }
                c19666xfd6e2f332.T1(targetLang.equals("zh_CN") || targetLang.equals("zh_TW") || targetLang.equals("zh_HK") || targetLang.equals("en"), true);
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33.d(c19666xfd6e2f332, g17, targetLang);
            }
        });
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$58", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
