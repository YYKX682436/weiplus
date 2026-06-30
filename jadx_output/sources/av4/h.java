package av4;

/* loaded from: classes.dex */
public final class h extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final av4.h f14288d = new av4.h();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        org.json.JSONArray jSONArray;
        java.lang.Integer h17;
        java.lang.Integer h18;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.GetAiHistoryChatsJsApi", "handleMsg");
        qu4.e eVar = (qu4.e) i95.n0.c(qu4.e.class);
        nw4.g gVar = env.f340863d;
        if (eVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GetAiHistoryChatsJsApi", "AIHistoryService is null");
            gVar.e(msg.f341013c, "getAiHistoryChats:fail service not available", null);
            return true;
        }
        java.lang.Object obj = msg.f340790a.get("chatId");
        if (obj instanceof java.lang.String) {
        }
        java.lang.Object obj2 = msg.f340790a.get("chatType");
        java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        if (str != null && (h18 = r26.h0.h(str)) != null) {
            h18.intValue();
        }
        java.lang.Object obj3 = msg.f340790a.get("offset");
        java.lang.String str2 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        if (str2 != null && (h17 = r26.h0.h(str2)) != null) {
            h17.intValue();
        }
        try {
            jSONArray = new org.json.JSONArray("[]");
        } catch (java.lang.Exception unused) {
            jSONArray = new org.json.JSONArray();
        }
        gVar.e(msg.f341013c, "getAiHistoryChats:ok", kz5.b1.e(new jz5.l("chats", jSONArray)));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "getAiHistoryChats";
    }
}
