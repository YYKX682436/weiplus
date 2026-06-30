package av4;

/* loaded from: classes.dex */
public final class m0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final av4.m0 f95836d = new av4.m0();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        org.json.JSONArray jSONArray;
        java.lang.Integer h17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SearchAiHistoryMsgsJsApi", "handleMsg");
        qu4.e eVar = (qu4.e) i95.n0.c(qu4.e.class);
        nw4.g gVar = env.f422396d;
        if (eVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SearchAiHistoryMsgsJsApi", "AIHistoryService is null");
            gVar.e(msg.f422546c, "searchAiHistoryMsgs:fail service not available", null);
            return true;
        }
        java.lang.Object obj = msg.f422323a.get("keyword");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "";
        }
        java.lang.Object obj2 = msg.f422323a.get("offset");
        java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        int intValue = (str2 == null || (h17 = r26.h0.h(str2)) == null) ? 20 : h17.intValue();
        if (str.length() == 0) {
            gVar.e(msg.f422546c, "searchAiHistoryMsgs:fail invalid keyword", null);
            return true;
        }
        try {
            jSONArray = new org.json.JSONArray(((pu4.a) eVar).Ni(str, intValue));
        } catch (java.lang.Exception unused) {
            jSONArray = new org.json.JSONArray();
        }
        gVar.e(msg.f422546c, "searchAiHistoryMsgs:ok", kz5.b1.e(new jz5.l("msgs", jSONArray)));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "searchAiHistoryMsgs";
    }
}
