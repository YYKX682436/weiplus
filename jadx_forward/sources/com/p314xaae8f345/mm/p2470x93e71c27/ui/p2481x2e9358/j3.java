package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class j3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f271963d;

    public j3(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f271963d = c19666xfd6e2f33;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$63", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f271963d;
        if (c19666xfd6e2f33.T3) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.y4 y4Var = c19666xfd6e2f33.f271488a3;
            java.lang.String chatUsername = y4Var != null ? y4Var.c() : c19666xfd6e2f33.f271502d;
            int i17 = c19666xfd6e2f33.P5;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatUsername, "chatUsername");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("view_id", "voice_cancel_btn");
            hashMap.put("chat_username", chatUsername);
            hashMap.put("voice_stop_sence", java.lang.Integer.valueOf(i17));
            hashMap.put("voice_page_status", 1);
            hashMap.put("voice_sessionid", u35.d.f505968a);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 35963);
        }
        c19666xfd6e2f33.X4 = false;
        c19666xfd6e2f33.N3.b(6);
        c19666xfd6e2f33.f271623x0.o();
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$63", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
