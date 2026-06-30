package av4;

/* loaded from: classes.dex */
public final class d extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final av4.d f95811d = new av4.d();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddOrUpdateAiHistoryMsgJsApi", "handleMsg");
        qu4.e eVar = (qu4.e) i95.n0.c(qu4.e.class);
        nw4.g gVar = env.f422396d;
        if (eVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AddOrUpdateAiHistoryMsgJsApi", "AIHistoryService is null");
            gVar.e(msg.f422546c, "addOrUpdateAiHistoryMsg:fail service not available", null);
            return true;
        }
        java.lang.Object obj = msg.f422323a.get("msg");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null || str.length() == 0) {
            gVar.e(msg.f422546c, "addOrUpdateAiHistoryMsg:fail invalid msg data", null);
            return true;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("searchId", "");
            java.lang.String optString2 = jSONObject.optString("chatId", "");
            java.lang.String optString3 = jSONObject.optString("query", "");
            long optLong = jSONObject.optLong("timeStamp", 0L);
            java.lang.String optString4 = jSONObject.optString("boxJSON", "");
            java.lang.String optString5 = jSONObject.optString("boxFTS", "");
            java.lang.String optString6 = jSONObject.optString("extInfo", "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            if (!(optString.length() == 0)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString3);
                if (!(optString3.length() == 0)) {
                    s75.d.b(new av4.c(eVar, optString, optString2, optString3, optLong, optString4, optString5, optString6, env.f422396d, msg.f422546c), "ai_history_insert_msg");
                    return true;
                }
            }
            gVar.e(msg.f422546c, "addOrUpdateAiHistoryMsg:fail invalid msg data", null);
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AddOrUpdateAiHistoryMsgJsApi", "parse msg json failed: " + e17);
            gVar.e(msg.f422546c, "addOrUpdateAiHistoryMsg:fail invalid msg data", null);
            return true;
        }
    }

    @Override // nw4.q2
    public int b() {
        return com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "addOrUpdateAiHistoryMsg";
    }
}
