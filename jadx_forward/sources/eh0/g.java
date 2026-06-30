package eh0;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final eh0.g f334408a = new eh0.g();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f334409b = jz5.h.b(eh0.f.f334407d);

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) f334409b).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) mo141623x754a37bb;
    }

    public final void b(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        a().remove(key);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StreamMMKVHelper", "removeStreamInfo key:%s", key);
    }

    public final void c(java.lang.String key, eh0.i info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        long j17 = info.f334411a;
        java.lang.String str = info.f334415e;
        if (j17 != 0) {
            if (!(str == null || str.length() == 0)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("msgSvrId", j17);
                jSONObject.put("msgId", info.f334412b);
                jSONObject.put("ilinkStreamId", info.f334413c);
                jSONObject.put("streamTicket", info.f334414d);
                jSONObject.put("talker", str);
                jSONObject.put("createTime", info.f334416f);
                jSONObject.put("isThinking", info.f334419i);
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                a().putString(key, jSONObject2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StreamMMKVHelper", "saveStreamInfo msgSvrId:%s, textLen:%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(info.a().length()));
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StreamMMKVHelper", "saveStreamInfo error: msgSvrId:%s, talker:%s", java.lang.Long.valueOf(j17), str);
    }
}
