package av4;

/* loaded from: classes.dex */
public final class d extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final av4.d f14278d = new av4.d();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.AddOrUpdateAiHistoryMsgJsApi", "handleMsg");
        qu4.e eVar = (qu4.e) i95.n0.c(qu4.e.class);
        nw4.g gVar = env.f340863d;
        if (eVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AddOrUpdateAiHistoryMsgJsApi", "AIHistoryService is null");
            gVar.e(msg.f341013c, "addOrUpdateAiHistoryMsg:fail service not available", null);
            return true;
        }
        java.lang.Object obj = msg.f340790a.get("msg");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null || str.length() == 0) {
            gVar.e(msg.f341013c, "addOrUpdateAiHistoryMsg:fail invalid msg data", null);
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
            kotlin.jvm.internal.o.d(optString);
            if (!(optString.length() == 0)) {
                kotlin.jvm.internal.o.d(optString3);
                if (!(optString3.length() == 0)) {
                    s75.d.b(new av4.c(eVar, optString, optString2, optString3, optLong, optString4, optString5, optString6, env.f340863d, msg.f341013c), "ai_history_insert_msg");
                    return true;
                }
            }
            gVar.e(msg.f341013c, "addOrUpdateAiHistoryMsg:fail invalid msg data", null);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AddOrUpdateAiHistoryMsgJsApi", "parse msg json failed: " + e17);
            gVar.e(msg.f341013c, "addOrUpdateAiHistoryMsg:fail invalid msg data", null);
            return true;
        }
    }

    @Override // nw4.q2
    public int b() {
        return com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "addOrUpdateAiHistoryMsg";
    }
}
