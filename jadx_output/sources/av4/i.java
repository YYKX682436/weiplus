package av4;

/* loaded from: classes.dex */
public final class i extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final av4.i f14291d = new av4.i();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String str;
        org.json.JSONArray jSONArray;
        java.lang.Integer h17;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.GetAiHistoryMsgsWithSearchIdJsApi", "handleMsg");
        qu4.e eVar = (qu4.e) i95.n0.c(qu4.e.class);
        nw4.g gVar = env.f340863d;
        if (eVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GetAiHistoryMsgsWithSearchIdJsApi", "AIHistoryService is null");
            gVar.e(msg.f341013c, "getAiHistoryMsgsWithSearchId:fail service not available", null);
            return true;
        }
        java.lang.Object obj = msg.f340790a.get("searchId");
        java.lang.String str2 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.Object obj2 = msg.f340790a.get("chatId");
        java.lang.String str3 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        java.lang.String str4 = str3 != null ? str3 : "";
        java.lang.Object obj3 = msg.f340790a.get("offset");
        java.lang.String str5 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        int intValue = (str5 == null || (h17 = r26.h0.h(str5)) == null) ? 0 : h17.intValue();
        pu4.a aVar = (pu4.a) eVar;
        try {
            ru4.f fVar = aVar.f358432d;
            java.util.List D0 = fVar != null ? fVar.D0(str2, str4, intValue) : kz5.p0.f313996d;
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            java.util.Iterator it = D0.iterator();
            while (it.hasNext()) {
                jSONArray2.put(aVar.Di((ru4.e) it.next()));
            }
            str = jSONArray2.toString();
            kotlin.jvm.internal.o.d(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("AIHistory.Service", "getMessages failed: " + e17.getMessage());
            str = "[]";
        }
        try {
            jSONArray = new org.json.JSONArray(str);
        } catch (java.lang.Exception unused) {
            jSONArray = new org.json.JSONArray();
        }
        gVar.e(msg.f341013c, "getAiHistoryMsgsWithSearchId:ok", kz5.b1.e(new jz5.l("msgs", jSONArray)));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "getAiHistoryMsgsWithSearchId";
    }
}
