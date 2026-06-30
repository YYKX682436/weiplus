package av4;

/* loaded from: classes.dex */
public final class b extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final av4.b f95798d = new av4.b();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddOrUpdateAiHistoryChatJsApi", "handleMsg");
        qu4.e eVar = (qu4.e) i95.n0.c(qu4.e.class);
        nw4.g gVar = env.f422396d;
        if (eVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AddOrUpdateAiHistoryChatJsApi", "AIHistoryService is null");
            gVar.e(msg.f422546c, "addOrUpdateAiHistoryChat:fail service not available", null);
            return true;
        }
        java.lang.Object obj = msg.f422323a.get("chat");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null || str.length() == 0) {
            gVar.e(msg.f422546c, "addOrUpdateAiHistoryChat:fail invalid chat data", null);
            return true;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("chatId", "");
            jSONObject.optLong("chatType", 0L);
            java.lang.String title = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "");
            java.lang.String extInfo = jSONObject.optString("extInfo", "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            if (optString.length() == 0) {
                gVar.e(msg.f422546c, "addOrUpdateAiHistoryChat:fail invalid chat data", null);
                return true;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
            gVar.e(msg.f422546c, "addOrUpdateAiHistoryChat:ok", null);
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AddOrUpdateAiHistoryChatJsApi", "parse chat json failed: " + e17);
            gVar.e(msg.f422546c, "addOrUpdateAiHistoryChat:fail invalid chat data", null);
            return true;
        }
    }

    @Override // nw4.q2
    public int b() {
        return com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "addOrUpdateAiHistoryChat";
    }
}
