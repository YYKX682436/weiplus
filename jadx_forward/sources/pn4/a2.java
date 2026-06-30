package pn4;

/* loaded from: classes5.dex */
public final class a2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pn4.t1 f438576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f438577e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(pn4.t1 t1Var, int i17, java.lang.String str, java.lang.String str2) {
        super(0);
        this.f438576d = t1Var;
        this.f438577e = str2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.t3 t3Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.t3) this.f438576d;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = t3Var.f272196b;
        android.view.View view = c19666xfd6e2f33.V4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$72", "onTranslateSuccess", "(ILjava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$72", "onTranslateSuccess", "(ILjava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c19666xfd6e2f33.E4.setEnabled(true);
        c19666xfd6e2f33.C4.setEnabled(true);
        java.lang.String str = this.f438577e;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            android.content.Context context = t3Var.f272195a;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.f293309c = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571924to);
            e4Var.c();
            c19666xfd6e2f33.T1(false, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19666xfd6e2f33.f271553l6));
            c19666xfd6e2f33.f271494b4.setText(pg5.d.a(c19666xfd6e2f33.getContext(), c19666xfd6e2f33.f271525g6));
        } else {
            ((java.util.HashMap) c19666xfd6e2f33.f271513e6).put(2, str);
            c19666xfd6e2f33.f271494b4.setText(pg5.d.a(c19666xfd6e2f33.getContext(), str));
            b31.l lVar = b31.l.f99146a;
            java.lang.String userName = c19666xfd6e2f33.f271502d;
            java.lang.String sessionId = c19666xfd6e2f33.f271565n6;
            int length = str.length();
            java.lang.String targetLang = c19666xfd6e2f33.f271547k6;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetLang, "targetLang");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("target_language_code", targetLang);
            hashMap.put("text_cnt", java.lang.Integer.valueOf(length));
            hashMap.put("chat_username", userName);
            hashMap.put("stt_translate_sessionid", sessionId);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("stt_trans_succ_disp", hashMap, 35268);
        }
        return jz5.f0.f384359a;
    }
}
