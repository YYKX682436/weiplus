package wx;

@j95.b
/* loaded from: classes8.dex */
public final class u extends i95.w implements wx.e1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f531972d = "ChatBotUIService";

    public void wi(android.content.Context context, com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d0 roomInfo, com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w1 w1Var) {
        android.content.Intent intent;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomInfo, "roomInfo");
        boolean F = iq.b.F(context, true);
        java.lang.String str = this.f531972d;
        if (F) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "voip conflict");
            return;
        }
        roomInfo.f297675i = com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.g0.ChatbotBizType_MPChat;
        roomInfo.f297677n[6] = true;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_mmbiz_ai_live_open, 0) == 1) {
            intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.ActivityC10499xbd0fa9ed.class);
            if (!(context instanceof android.app.Activity)) {
                intent.addFlags(268435456);
            }
            if (w1Var != null) {
                intent.putExtra("reportAiChatExtInfo", w1Var.mo14344x5f01b1f6());
            }
            intent.putExtra("room_info", roomInfo.mo14344x5f01b1f6());
            intent.putExtra("open_screen", 20);
            intent.putExtra("room_screen", 1);
        } else {
            intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.ActivityC10500x840b14c7.class);
            if (!(context instanceof android.app.Activity)) {
                intent.addFlags(268435456);
            }
            if (w1Var != null) {
                intent.putExtra("reportAiChatExtInfo", w1Var.mo14344x5f01b1f6());
            }
            intent.putExtra("room_info", roomInfo.mo14344x5f01b1f6());
            intent.putExtra("open_screen", 11);
            intent.putExtra("room_screen", 1);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startChatBotBrandAsstVoipUI");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/chatbot/ChatBotUIService", "startChatBotBrandAsstVoipUI", "(Landroid/content/Context;Lcom/tencent/wechat/aff/chatbot/ChatBotVoIPRoomInfoPB;Lcom/tencent/wechat/aff/chatbot/ReportAiChatExtInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/feature/chatbot/ChatBotUIService", "startChatBotBrandAsstVoipUI", "(Landroid/content/Context;Lcom/tencent/wechat/aff/chatbot/ChatBotVoIPRoomInfoPB;Lcom/tencent/wechat/aff/chatbot/ReportAiChatExtInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
