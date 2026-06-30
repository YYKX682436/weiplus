package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class a3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f271707d;

    public a3(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f271707d = c19666xfd6e2f33;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$57", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = pn4.c2.f438596d;
        jz5.g gVar = pn4.c2.f438599g;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) gVar).mo141623x754a37bb();
        java.lang.String langCode = o4Var != null ? o4Var.u("translate_language", pn4.c2.f438597e) : null;
        b31.l lVar = b31.l.f99146a;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f271707d;
        java.lang.String userName = c19666xfd6e2f33.f271502d;
        java.lang.String sessionId = c19666xfd6e2f33.f271565n6;
        boolean z17 = c19666xfd6e2f33.f271490a5;
        int i18 = !z17 ? 1 : 0;
        java.lang.String currentLang = z17 ? langCode : "";
        java.lang.String targetLang = z17 ? "" : langCode;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(currentLang, "currentLang");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetLang, "targetLang");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "stt_translate_btn");
        hashMap.put("current_language_code", currentLang);
        hashMap.put("chat_username", userName);
        hashMap.put("stt_translate_sessionid", sessionId);
        hashMap.put("after_clk_status", java.lang.Integer.valueOf(i18));
        hashMap.put("target_language_code", targetLang);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 35268);
        c19666xfd6e2f33.C1();
        if (c19666xfd6e2f33.f271490a5) {
            c19666xfd6e2f33.T1(false, false);
            c19666xfd6e2f33.f271494b4.setText("");
            c19666xfd6e2f33.f271494b4.setText(pg5.d.a(c19666xfd6e2f33.getContext(), c19666xfd6e2f33.f271537i6));
        } else {
            c19666xfd6e2f33.f271553l6 = c19666xfd6e2f33.f271542j6;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.y4 y4Var = c19666xfd6e2f33.f271488a3;
            android.app.Activity g17 = y4Var != null ? y4Var.a().g() : c19666xfd6e2f33.m75433x19263085();
            android.content.Context context = c19666xfd6e2f33.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) gVar).mo141623x754a37bb();
            c19666xfd6e2f33.f271542j6 = o4Var2 != null ? o4Var2.u("translate_language_name", pn4.c2.f438598f) : null;
            c19666xfd6e2f33.f271547k6 = langCode;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(langCode, "langCode");
            c19666xfd6e2f33.T1(langCode.equals("zh_CN") || langCode.equals("zh_TW") || langCode.equals("zh_HK") || langCode.equals("en"), true);
            java.lang.String obj = c19666xfd6e2f33.f271494b4.getText().toString();
            c19666xfd6e2f33.f271537i6 = obj;
            c19666xfd6e2f33.f271525g6 = obj;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33.d(c19666xfd6e2f33, g17, langCode);
        }
        c19666xfd6e2f33.f271490a5 = !c19666xfd6e2f33.f271490a5;
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$57", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
