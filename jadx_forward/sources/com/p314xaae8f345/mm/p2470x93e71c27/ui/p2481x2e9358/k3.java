package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f271977d;

    public k3(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f271977d = c19666xfd6e2f33;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$64", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f271977d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatFooter", "onClick sendVoiceBtn, newVoice2txtMode:%s", c19666xfd6e2f33.f271501c6);
        if (c19666xfd6e2f33.f271501c6 != com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.b5.MODE_VOICE) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.y4 y4Var = c19666xfd6e2f33.f271488a3;
            java.lang.String chatUsername = y4Var != null ? y4Var.c() : c19666xfd6e2f33.f271502d;
            int i17 = c19666xfd6e2f33.P5;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatUsername, "chatUsername");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("view_id", "voice_send_original_btn");
            hashMap.put("chat_username", chatUsername);
            hashMap.put("voice_page_status", 2);
            hashMap.put("voice_stop_sence", java.lang.Integer.valueOf(i17));
            hashMap.put("voice_sessionid", u35.d.f505968a);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 35963);
            if (c19666xfd6e2f33.f271623x0 != null) {
                c19666xfd6e2f33.X4 = false;
                c19666xfd6e2f33.N3.b(7);
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5 k5Var = c19666xfd6e2f33.f271623x0;
                k5Var.p(k5Var.a(), c19666xfd6e2f33.M5, c19666xfd6e2f33.m75464x9cdec029());
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33.p(c19666xfd6e2f33);
            }
            yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$64", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.y4 y4Var2 = c19666xfd6e2f33.f271488a3;
        java.lang.String chatUsername2 = y4Var2 != null ? y4Var2.c() : c19666xfd6e2f33.f271502d;
        int i18 = c19666xfd6e2f33.P5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatUsername2, "chatUsername");
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("view_id", "voice_convert_text_btn");
        hashMap2.put("chat_username", chatUsername2);
        hashMap2.put("voice_page_status", 1);
        hashMap2.put("voice_stop_sence", java.lang.Integer.valueOf(i18));
        hashMap2.put("voice_sessionid", u35.d.f505968a);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap2, 35963);
        c19666xfd6e2f33.f271507d6 = c19666xfd6e2f33.f271501c6;
        c19666xfd6e2f33.f271501c6 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.b5.MODE_TRANS;
        boolean z17 = c19666xfd6e2f33.f271559m6;
        c19666xfd6e2f33.I1();
        c19666xfd6e2f33.f271517f4.setVisibility(8);
        c19666xfd6e2f33.f271505d4.setVisibility(8);
        c19666xfd6e2f33.P1();
        if (z17) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33.e(c19666xfd6e2f33);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33.f(c19666xfd6e2f33);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.p2318x633fb29.c cVar = c19666xfd6e2f33.f271571o6;
            cVar.getClass();
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            cVar.f256907m = false;
            c19666xfd6e2f33.f271571o6.b();
            z21.j0 j0Var = c19666xfd6e2f33.f271571o6.f256902e;
            if (j0Var != null) {
                j0Var.f551173w = true;
            }
            c19666xfd6e2f33.f271494b4.setText("");
            android.view.View view2 = c19666xfd6e2f33.V4;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$64", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$64", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c19666xfd6e2f33.f271494b4.setCursorVisible(false);
        }
        c19666xfd6e2f33.E4.setText(c19666xfd6e2f33.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nk8));
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$64", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
