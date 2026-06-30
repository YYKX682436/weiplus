package av4;

/* loaded from: classes.dex */
public final class m0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final av4.m0 f14303d = new av4.m0();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        org.json.JSONArray jSONArray;
        java.lang.Integer h17;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.SearchAiHistoryMsgsJsApi", "handleMsg");
        qu4.e eVar = (qu4.e) i95.n0.c(qu4.e.class);
        nw4.g gVar = env.f340863d;
        if (eVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SearchAiHistoryMsgsJsApi", "AIHistoryService is null");
            gVar.e(msg.f341013c, "searchAiHistoryMsgs:fail service not available", null);
            return true;
        }
        java.lang.Object obj = msg.f340790a.get("keyword");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "";
        }
        java.lang.Object obj2 = msg.f340790a.get("offset");
        java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        int intValue = (str2 == null || (h17 = r26.h0.h(str2)) == null) ? 20 : h17.intValue();
        if (str.length() == 0) {
            gVar.e(msg.f341013c, "searchAiHistoryMsgs:fail invalid keyword", null);
            return true;
        }
        try {
            jSONArray = new org.json.JSONArray(((pu4.a) eVar).Ni(str, intValue));
        } catch (java.lang.Exception unused) {
            jSONArray = new org.json.JSONArray();
        }
        gVar.e(msg.f341013c, "searchAiHistoryMsgs:ok", kz5.b1.e(new jz5.l("msgs", jSONArray)));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "searchAiHistoryMsgs";
    }
}
