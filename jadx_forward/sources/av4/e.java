package av4;

/* loaded from: classes.dex */
public final class e extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final av4.e f95815d = new av4.e();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        ru4.f fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeleteAiHistoryChatJsApi", "handleMsg");
        qu4.e eVar = (qu4.e) i95.n0.c(qu4.e.class);
        nw4.g gVar = env.f422396d;
        if (eVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DeleteAiHistoryChatJsApi", "AIHistoryService is null");
            gVar.e(msg.f422546c, "deleteAiHistoryChat:fail service not available", null);
            return true;
        }
        java.lang.Object obj = msg.f422323a.get("chatId");
        java.lang.String chatId = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (chatId == null || chatId.length() == 0) {
            gVar.e(msg.f422546c, "deleteAiHistoryChat:fail invalid chatId", null);
            return true;
        }
        pu4.a aVar = (pu4.a) eVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatId, "chatId");
        if (!(chatId.length() == 0) && (fVar = aVar.f439965d) != null) {
            try {
                java.util.Iterator it = fVar.D0("", chatId, Integer.MAX_VALUE).iterator();
                while (it.hasNext()) {
                    java.lang.String str = ((ru4.e) it.next()).f66312x52baae88;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    if (str.length() > 0) {
                        aVar.wi(str);
                    }
                }
                fVar.y0(chatId);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AIHistory.Service", "deleteMessagesByChatId failed: " + e17.getMessage());
            }
        }
        gVar.e(msg.f422546c, "deleteAiHistoryChat:ok", null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "deleteAiHistoryChat";
    }
}
