package sc3;

/* loaded from: classes7.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f487973d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(sc3.k1 k1Var) {
        super(0);
        this.f487973d = k1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        oc3.a aVar;
        java.util.Iterator<java.lang.String> keys;
        java.util.Iterator<java.lang.String> keys2;
        bf3.g0 g0Var = bf3.g0.f101160a;
        sc3.k1 k1Var = this.f487973d;
        jc3.x xVar = k1Var.f488019r;
        if (xVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgManagement");
            throw null;
        }
        java.nio.ByteBuffer c17 = g0Var.c(xVar, "magicbrush.json");
        java.lang.String str = k1Var.Q;
        if (c17 != null) {
            java.lang.String charBuffer = java.nio.charset.StandardCharsets.UTF_8.decode(c17).toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(charBuffer, "toString(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "mbBizConfigInfo txt: ".concat(charBuffer));
            oc3.a aVar2 = oc3.a.f425859c;
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.HashMap hashMap2 = new java.util.HashMap();
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(charBuffer);
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("plugins");
                if (optJSONObject != null && (keys2 = optJSONObject.keys()) != null) {
                    while (keys2.hasNext()) {
                        java.lang.String next = keys2.next();
                        org.json.JSONObject jSONObject2 = optJSONObject.getJSONObject(next);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONObject2);
                        java.lang.String string = jSONObject2.getString("version");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                        java.lang.String string2 = jSONObject2.getString("provider");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                        hashMap.put(next, new oc3.b(string, r26.i0.t(string2, "wx2f3fb5db9f226462", "MagicSclPublicService", false)));
                        optJSONObject = optJSONObject;
                    }
                }
                org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("publicservices");
                if (optJSONObject2 != null && (keys = optJSONObject2.keys()) != null) {
                    while (keys.hasNext()) {
                        java.lang.String next2 = keys.next();
                        org.json.JSONObject jSONObject3 = optJSONObject2.getJSONObject(next2);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next2);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONObject3);
                        java.lang.String string3 = jSONObject3.getString("version");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                        java.lang.String string4 = jSONObject3.getString("provider");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
                        hashMap2.put(next2, new oc3.b(string3, r26.i0.t(string4, "wx2f3fb5db9f226462", "MagicSclPublicService", false)));
                    }
                }
                aVar = new oc3.a(hashMap, hashMap2);
            } catch (org.json.JSONException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBBizConfigInfo", "generate biz config failed, src = ".concat(charBuffer));
                aVar = oc3.a.f425859c;
            }
            if (aVar != null) {
                return aVar;
            }
        }
        oc3.a aVar3 = oc3.a.f425859c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "Read MB config = " + aVar3);
        return aVar3;
    }
}
