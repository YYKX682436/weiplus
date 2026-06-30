package rv4;

/* loaded from: classes12.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f482087a;

    public t() {
        java.lang.String u17 = ((sg0.a3) ((su4.e1) i95.n0.c(su4.e1.class))).wi().u("s1s-guess:pagecache", "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("[FTSNativeGlobalTeach] FTSGlobalTeachDataMgr", "getPageCache: " + u17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u17);
        org.json.JSONObject f17 = pv4.a.f(u17);
        this.f482087a = f17 == null ? new org.json.JSONObject() : f17;
    }

    public final void a() {
        org.json.JSONObject jsonObject = this.f482087a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonObject, "jsonObject");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("[FTSNativeGlobalTeach] FTSGlobalTeachDataMgr", "savePageCache: " + jsonObject);
        ((sg0.a3) ((su4.e1) i95.n0.c(su4.e1.class))).wi().D("s1s-guess:pagecache", jsonObject.toString());
    }
}
