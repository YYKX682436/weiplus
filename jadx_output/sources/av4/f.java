package av4;

/* loaded from: classes.dex */
public final class f extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final av4.f f14284d = new av4.f();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.DeleteAiHistoryMsgJsApi", "handleMsg");
        qu4.e eVar = (qu4.e) i95.n0.c(qu4.e.class);
        nw4.g gVar = env.f340863d;
        if (eVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DeleteAiHistoryMsgJsApi", "AIHistoryService is null");
            gVar.e(msg.f341013c, "deleteAiHistoryMsg:fail service not available", null);
            return true;
        }
        java.lang.Object obj = msg.f340790a.get("searchId");
        java.lang.String searchId = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        boolean z17 = false;
        if (searchId == null || searchId.length() == 0) {
            gVar.e(msg.f341013c, "deleteAiHistoryMsg:fail invalid searchId", null);
            return true;
        }
        pu4.a aVar = (pu4.a) eVar;
        kotlin.jvm.internal.o.g(searchId, "searchId");
        ru4.f fVar = aVar.f358432d;
        if (fVar != null) {
            fVar.z0(searchId);
            if (!(searchId.length() == 0)) {
                try {
                    fVar.f399787d.delete("AIHistoryMessage", "searchId = ?", new java.lang.String[]{searchId});
                    z17 = true;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("AIHistory.MessageStorage", "deleteMessage failed: " + e17.getMessage());
                }
            }
            if (z17) {
                aVar.wi(searchId);
            }
        }
        if (z17) {
            gVar.e(msg.f341013c, "deleteAiHistoryMsg:ok", null);
        } else {
            gVar.e(msg.f341013c, "deleteAiHistoryMsg:fail", null);
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "deleteAiHistoryMsg";
    }
}
