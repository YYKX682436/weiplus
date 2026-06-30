package n93;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln93/a;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    public final void A(boolean z17, java.lang.String str) {
        if (z17) {
            this.f224975e.d();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBot.LiteAppJsApiBrandJoinChatBotRoom", "invoke success");
        } else {
            this.f224975e.b(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ChatBot.LiteAppJsApiBrandJoinChatBotRoom", str);
        }
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBot.LiteAppJsApiBrandJoinChatBotRoom", "invoke appId: " + str + ", data: " + jSONObject + ", isFromView: " + z17);
        if (jSONObject != null) {
            java.lang.String optString = jSONObject.optString("roominfo");
            if (android.text.TextUtils.isEmpty(optString)) {
                A(false, "roomInfo is empty");
                return;
            }
            java.lang.String optString2 = jSONObject.optString("extinfo");
            if (android.text.TextUtils.isEmpty(optString2)) {
                A(false, "extInfoBase64Str is empty");
                return;
            }
            try {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d0 mo11468x92b714fd = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d0().mo11468x92b714fd(android.util.Base64.decode(optString, 0));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBot.LiteAppJsApiBrandJoinChatBotRoom", "roomInfoPB parse result success");
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w1 mo11468x92b714fd2 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w1().mo11468x92b714fd(android.util.Base64.decode(optString2, 0));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBot.LiteAppJsApiBrandJoinChatBotRoom", "extInfoPB parse result success");
                wx.e1 e1Var = (wx.e1) i95.n0.c(wx.e1.class);
                if (e1Var == null) {
                    A(false, "IChatBotUIService is null");
                    return;
                }
                java.lang.ref.WeakReference k17 = com.p314xaae8f345.mm.app.w.k();
                android.content.Context context = k17 != null ? (android.app.Activity) k17.get() : null;
                android.app.Activity activity = (android.app.Activity) com.p314xaae8f345.mm.app.w.INSTANCE.f135419h.get();
                if (context == null) {
                    context = activity != null ? activity : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo11468x92b714fd);
                ((wx.u) e1Var).wi(context, mo11468x92b714fd, mo11468x92b714fd2);
                A(true, null);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ChatBot.LiteAppJsApiBrandJoinChatBotRoom", "fail:" + e17.getMessage(), e17);
                A(false, "ChatBotVoIPRoomInfoPB parse fail");
            }
        }
    }
}
