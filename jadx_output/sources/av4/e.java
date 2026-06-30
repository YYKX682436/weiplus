package av4;

/* loaded from: classes.dex */
public final class e extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final av4.e f14282d = new av4.e();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        ru4.f fVar;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.DeleteAiHistoryChatJsApi", "handleMsg");
        qu4.e eVar = (qu4.e) i95.n0.c(qu4.e.class);
        nw4.g gVar = env.f340863d;
        if (eVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DeleteAiHistoryChatJsApi", "AIHistoryService is null");
            gVar.e(msg.f341013c, "deleteAiHistoryChat:fail service not available", null);
            return true;
        }
        java.lang.Object obj = msg.f340790a.get("chatId");
        java.lang.String chatId = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (chatId == null || chatId.length() == 0) {
            gVar.e(msg.f341013c, "deleteAiHistoryChat:fail invalid chatId", null);
            return true;
        }
        pu4.a aVar = (pu4.a) eVar;
        kotlin.jvm.internal.o.g(chatId, "chatId");
        if (!(chatId.length() == 0) && (fVar = aVar.f358432d) != null) {
            try {
                java.util.Iterator it = fVar.D0("", chatId, Integer.MAX_VALUE).iterator();
                while (it.hasNext()) {
                    java.lang.String str = ((ru4.e) it.next()).field_searchId;
                    kotlin.jvm.internal.o.d(str);
                    if (str.length() > 0) {
                        aVar.wi(str);
                    }
                }
                fVar.y0(chatId);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("AIHistory.Service", "deleteMessagesByChatId failed: " + e17.getMessage());
            }
        }
        gVar.e(msg.f341013c, "deleteAiHistoryChat:ok", null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "deleteAiHistoryChat";
    }
}
