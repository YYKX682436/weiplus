package av4;

/* loaded from: classes.dex */
public final class b extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final av4.b f14265d = new av4.b();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.AddOrUpdateAiHistoryChatJsApi", "handleMsg");
        qu4.e eVar = (qu4.e) i95.n0.c(qu4.e.class);
        nw4.g gVar = env.f340863d;
        if (eVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AddOrUpdateAiHistoryChatJsApi", "AIHistoryService is null");
            gVar.e(msg.f341013c, "addOrUpdateAiHistoryChat:fail service not available", null);
            return true;
        }
        java.lang.Object obj = msg.f340790a.get("chat");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null || str.length() == 0) {
            gVar.e(msg.f341013c, "addOrUpdateAiHistoryChat:fail invalid chat data", null);
            return true;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("chatId", "");
            jSONObject.optLong("chatType", 0L);
            java.lang.String title = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
            java.lang.String extInfo = jSONObject.optString("extInfo", "");
            kotlin.jvm.internal.o.d(optString);
            if (optString.length() == 0) {
                gVar.e(msg.f341013c, "addOrUpdateAiHistoryChat:fail invalid chat data", null);
                return true;
            }
            kotlin.jvm.internal.o.g(title, "title");
            kotlin.jvm.internal.o.g(extInfo, "extInfo");
            gVar.e(msg.f341013c, "addOrUpdateAiHistoryChat:ok", null);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AddOrUpdateAiHistoryChatJsApi", "parse chat json failed: " + e17);
            gVar.e(msg.f341013c, "addOrUpdateAiHistoryChat:fail invalid chat data", null);
            return true;
        }
    }

    @Override // nw4.q2
    public int b() {
        return com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "addOrUpdateAiHistoryChat";
    }
}
