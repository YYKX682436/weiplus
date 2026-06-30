package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class e3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f271828d;

    public e3(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f271828d = c19666xfd6e2f33;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$59", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        b31.l lVar = b31.l.f99146a;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f271828d;
        java.lang.String userName = c19666xfd6e2f33.f271502d;
        java.lang.String sessionId = c19666xfd6e2f33.f271565n6;
        boolean z17 = c19666xfd6e2f33.Y4;
        int i17 = !z17 ? 1 : 0;
        int i18 = z17 ? 2 : 1;
        java.lang.String currentLang = c19666xfd6e2f33.f271547k6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(currentLang, "currentLang");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "stt_read_aloud_btn");
        hashMap.put("current_language_code", currentLang);
        hashMap.put("chat_username", userName);
        hashMap.put("stt_translate_sessionid", sessionId);
        hashMap.put("after_clk_status", java.lang.Integer.valueOf(i17));
        hashMap.put("current_btn_type", java.lang.Integer.valueOf(i18));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 35268);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33.c(c19666xfd6e2f33);
        if (c19666xfd6e2f33.Y4) {
            c19666xfd6e2f33.C1();
            yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$59", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        c19666xfd6e2f33.Y4 = true;
        java.lang.String obj = c19666xfd6e2f33.f271494b4.getText().toString();
        java.lang.Long valueOf = java.lang.Long.valueOf((obj + c19666xfd6e2f33.f271547k6).hashCode() & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatFooter", "startTextToSpeech  id:%s，transLanguageCode: %s ", valueOf, c19666xfd6e2f33.f271547k6);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(pg5.d.a(c19666xfd6e2f33.getContext(), obj));
        spannableStringBuilder.setSpan(c19666xfd6e2f33.f271495b5, 0, spannableStringBuilder.length(), 33);
        c19666xfd6e2f33.f271494b4.setText(spannableStringBuilder);
        gm0.j1.b().c();
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new pn4.l()).a(pn4.p.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        if (true ^ com.p314xaae8f345.mm.vfs.w6.j(((pn4.p) a17).N6() + "/stream/" + valueOf.longValue())) {
            android.view.View view2 = c19666xfd6e2f33.f271563n4;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$59", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$59", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c19666xfd6e2f33.f271557m4.setVisibility(8);
        }
        r45.iy3 iy3Var = r45.iy3.CHINESE;
        if ("en".equals(c19666xfd6e2f33.f271547k6)) {
            iy3Var = r45.iy3.ENGLISH;
        }
        r45.iy3 iy3Var2 = iy3Var;
        java.lang.String string = c19666xfd6e2f33.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.pcf);
        gm0.j1.b().c();
        p012xc85e97e9.p093xedfae76a.c1 a18 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new pn4.l()).a(pn4.p.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
        ((pn4.p) a18).O6(obj, valueOf.longValue(), new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.d3(this, obj, string), false, r45.jy3.Translate, iy3Var2);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$59", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
