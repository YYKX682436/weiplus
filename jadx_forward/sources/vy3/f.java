package vy3;

/* loaded from: classes.dex */
public final class f extends wy3.c {

    /* renamed from: e, reason: collision with root package name */
    public static final vy3.f f523002e = new vy3.f();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.String str2 = (java.lang.String) ((java.util.HashMap) msg.f422323a).get("requestId");
        java.lang.String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str4 = (java.lang.String) ((java.util.HashMap) msg.f422323a).get(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
        if (str4 == null) {
            str4 = "";
        }
        jz5.g gVar = kz3.d.f395405a;
        kz3.a aVar = (kz3.a) kz3.d.f395406b.get(str4);
        if (aVar != null && (str = aVar.f395398b) != null) {
            str3 = str;
        }
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = str4;
        objArr[1] = str2;
        objArr[2] = str3;
        objArr[3] = aVar != null ? java.lang.Integer.valueOf(aVar.f395399c) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetImageTransData", "ScanJsApi-Call:getImageTransData sessionId: %s, requestId: %s, result: %s, ocrResultType: %s", objArr);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("requestId", str2);
        hashMap.put("json", str3);
        hashMap.put("ocrResultType", java.lang.Integer.valueOf(aVar != null ? aVar.f395399c : -1));
        env.f422396d.e(msg.f422546c, msg.f422552i + ":ok", hashMap);
        return true;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "getImageTransData";
    }
}
