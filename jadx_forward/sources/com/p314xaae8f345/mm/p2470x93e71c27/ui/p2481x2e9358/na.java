package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes15.dex */
public class na implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f272058d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.oa f272059e;

    public na(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.oa oaVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        this.f272059e = oaVar;
        this.f272058d = k3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/SuggestEmoticonBubble$SuggestEmojiAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.oa oaVar = this.f272059e;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ra raVar = oaVar.f272080e;
        raVar.e("chat_emo_bubble_search", "view_clk", raVar.c());
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ra raVar2 = oaVar.f272080e;
        int m8183xf806b362 = this.f272058d.m8183xf806b362();
        if (android.text.TextUtils.isEmpty(raVar2.f272151i)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.SuggestEmoticonBubble", "Whoops! navToSearch without any input");
            raVar2.f272147e.dismiss();
        } else {
            raVar2.f(null, 0);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6948x597c7cb1 c6948x597c7cb1 = raVar2.f272157o;
            c6948x597c7cb1.f142534g = m8183xf806b362;
            c6948x597c7cb1.f142531d = 3L;
            c6948x597c7cb1.f142546s = java.lang.System.currentTimeMillis() - raVar2.f272159q;
            c6948x597c7cb1.k();
            c6948x597c7cb1.f142534g = 0L;
            if (raVar2.f272161s != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.SuggestEmoticonBubble", "Call `onSearchMore`");
                raVar2.f272161s.a(raVar2.f272151i);
            }
            raVar2.f272147e.dismiss();
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/SuggestEmoticonBubble$SuggestEmojiAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
