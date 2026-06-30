package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class l3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f271994d;

    public l3(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f271994d = c19666xfd6e2f33;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        android.view.inputmethod.InputMethodManager inputMethodManager;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$65", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f271994d;
        boolean z17 = c19666xfd6e2f33.f271501c6 == com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.b5.MODE_VOICE;
        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.p2318x633fb29.e eVar = c19666xfd6e2f33.N3;
        if (z17) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.y4 y4Var = c19666xfd6e2f33.f271488a3;
            u35.d.b(y4Var != null ? y4Var.c() : c19666xfd6e2f33.f271502d, 1, c19666xfd6e2f33.P5);
            if (c19666xfd6e2f33.f271623x0 != null) {
                c19666xfd6e2f33.X4 = false;
                eVar.b(7);
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5 k5Var = c19666xfd6e2f33.f271623x0;
                k5Var.p(k5Var.a(), c19666xfd6e2f33.M5, c19666xfd6e2f33.m75464x9cdec029());
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33.p(c19666xfd6e2f33);
            }
            yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$65", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (c19666xfd6e2f33.T3) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.y4 y4Var2 = c19666xfd6e2f33.f271488a3;
            u35.d.b(y4Var2 != null ? y4Var2.c() : c19666xfd6e2f33.f271502d, 2, c19666xfd6e2f33.P5);
        }
        if (c19666xfd6e2f33.E4.getVisibility() == 0 && 8 == c19666xfd6e2f33.D4.getVisibility()) {
            java.lang.String obj = c19666xfd6e2f33.f271494b4.getText().toString();
            if (c19666xfd6e2f33.f271623x0 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj)) {
                c19666xfd6e2f33.X4 = false;
                eVar.f256925p = c19666xfd6e2f33.f271615v6;
                eVar.f256929t = obj.length();
                b31.l lVar = b31.l.f99146a;
                java.lang.String userName = c19666xfd6e2f33.f271502d;
                java.lang.String sessionId = c19666xfd6e2f33.f271565n6;
                int length = obj.length();
                java.lang.String targetLang = c19666xfd6e2f33.f271490a5 ? c19666xfd6e2f33.f271547k6 : "";
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetLang, "targetLang");
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("target_language_code", targetLang);
                hashMap.put("text_cnt", java.lang.Integer.valueOf(length));
                hashMap.put("chat_username", userName);
                hashMap.put("stt_translate_sessionid", sessionId);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("stt_send_trans_result_succ", hashMap, 35268);
                if (1 == eVar.f256932w) {
                    eVar.b(8);
                } else {
                    eVar.b(5);
                }
                i45.j jVar = i45.j.f369948a;
                boolean a17 = jVar.a(jVar.g());
                xg3.h0 h0Var = c19666xfd6e2f33.V2;
                if (a17) {
                    c19666xfd6e2f33.U2 = c19666xfd6e2f33.f271488a3.c();
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().n0(h0Var, null);
                } else {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(h0Var);
                }
                if (c19666xfd6e2f33.C0(obj)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatFooter", "newVoice2txtSendTxtBtn click ifInterceptQuoteMsg");
                } else {
                    c19666xfd6e2f33.f271623x0.d(obj);
                }
                c19666xfd6e2f33.f271623x0.o();
                java.util.List list = c19666xfd6e2f33.f271591r6;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatFooter", "cgiReport size = %s", java.lang.Integer.valueOf(arrayList2.size()));
                    com.p314xaae8f345.mm.p2621x8fb0427b.c z07 = com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.z.Ai().z0("100235");
                    int P = z07.m77959x7b953cf2() ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) z07.t0().get("MMVoipVadOn"), 0) : 0;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatFooter", "cgiReport: abTestFlag = [%s]", java.lang.Integer.valueOf(P));
                    java.lang.String valueOf = java.lang.String.valueOf(P);
                    b31.d dVar = c19666xfd6e2f33.f271585q6;
                    dVar.getClass();
                    gm0.j1.e().j(new b31.c(dVar, new java.util.ArrayList(list), obj, valueOf, 10));
                    arrayList2.clear();
                }
                if (com.p314xaae8f345.mm.ui.w9.c(c19666xfd6e2f33.getContext()) && (inputMethodManager = c19666xfd6e2f33.U1) != null && (c22621x7603e017 = c19666xfd6e2f33.f271494b4) != null) {
                    inputMethodManager.hideSoftInputFromWindow(c22621x7603e017.getWindowToken(), 0);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$65", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
