package md3;

/* loaded from: classes4.dex */
public final class q extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "openEcsJumpInfo";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 param) {
        android.content.Context context;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        java.lang.String optString = param.optString("ecsJumpInfo", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        if (optString.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MBJsApiOpenEcsJumpInfo", "error: ecsJumpInfo is empty");
            s().mo146xb9724478(j(lc3.x.f399470d, "ecsJumpInfo is empty"));
            return;
        }
        java.lang.String optString2 = param.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBJsApiOpenEcsJumpInfo", "jump, ecsJumpInfo: " + optString + ", extraData: " + optString2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
        org.json.JSONObject jSONObject = null;
        if (optString2.length() > 0) {
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString2);
                jSONObject2.put("nativeExtraData", new org.json.JSONObject(jSONObject2.toString()));
                jSONObject = jSONObject2;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MBJsApiOpenEcsJumpInfo", "failed to parse extraData: " + e17);
            }
        }
        lc3.e eVar = this.f399423a;
        if (eVar == null || (context = eVar.B0()) == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        pq.a aVar = new pq.a(context);
        aVar.b(jSONObject);
        i95.m c17 = i95.n0.c(pq.q.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        pq.q.se((pq.q) c17, aVar, optString, null, 4, null);
        s().mo146xb9724478(k());
    }
}
