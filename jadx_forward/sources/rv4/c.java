package rv4;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final rv4.c f481979a = new rv4.c();

    public final org.json.JSONObject a() {
        java.lang.String u17 = ((sg0.a3) ((su4.e1) i95.n0.c(su4.e1.class))).wi().u("websearch:hotsearch:config", "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("[FTSNativeGlobalTeach] FTSGlobalTeachDataMgr", "getHotSearchConfig: " + u17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u17);
        return pv4.a.f(u17);
    }

    public final java.lang.String b() {
        java.lang.String u17 = ((sg0.a3) ((su4.e1) i95.n0.c(su4.e1.class))).wi().u("websearch:hotsearch:data", "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("[FTSNativeGlobalTeach] FTSGlobalTeachDataMgr", "getHotSearchData: " + u17);
        return u17;
    }

    public final void c(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("[FTSNativeGlobalTeach] FTSGlobalTeachDataMgr", "saveHotSearchConfig: " + jSONObject);
        ((sg0.a3) ((su4.e1) i95.n0.c(su4.e1.class))).wi().D("websearch:hotsearch:config", jSONObject.toString());
    }
}
