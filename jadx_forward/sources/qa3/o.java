package qa3;

/* loaded from: classes15.dex */
public final class o implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.e {

    /* renamed from: b, reason: collision with root package name */
    public static jz5.l f442585b;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f442587d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f442588e;

    /* renamed from: f, reason: collision with root package name */
    public static xp5.f f442589f;

    /* renamed from: g, reason: collision with root package name */
    public static long f442590g;

    /* renamed from: a, reason: collision with root package name */
    public static final qa3.o f442584a = new qa3.o();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.LinkedBlockingQueue f442586c = new java.util.concurrent.LinkedBlockingQueue();

    public static final void a(qa3.o oVar, byte[] bArr) {
        oVar.getClass();
        java.lang.String str = new java.lang.String(bArr, r26.c.f450398a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppTestService", "recv ".concat(str));
        org.json.JSONArray jSONArray = new org.json.JSONArray(str);
        int length = jSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
            if (jSONObject.has("cmd")) {
                java.lang.String string = jSONObject.getString("cmd");
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("noop", string)) {
                    oVar.c(jSONObject, true, "");
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                    if (r26.i0.y(string, "debug.", false)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65407x950b97b3(jSONObject.toString());
                        oVar.c(jSONObject, true, "");
                    } else {
                        int hashCode = string.hashCode();
                        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = f442586c;
                        switch (hashCode) {
                            case -1335458389:
                                if (string.equals("delete")) {
                                    linkedBlockingQueue.add(new qa3.d(string, jSONObject));
                                    break;
                                }
                                break;
                            case 94756344:
                                if (string.equals("close")) {
                                    linkedBlockingQueue.add(new qa3.b(string, jSONObject));
                                    break;
                                }
                                break;
                            case 109757538:
                                if (string.equals("start")) {
                                    linkedBlockingQueue.add(new qa3.s(string, jSONObject));
                                    break;
                                }
                                break;
                            case 1427818632:
                                if (string.equals("download")) {
                                    linkedBlockingQueue.add(new qa3.h(string, jSONObject));
                                    break;
                                }
                                break;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiteAppTestService", "unknown cmd %cmd");
                    }
                }
            }
        }
    }

    public static final void b(qa3.o oVar) {
        oVar.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("cmd", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
        java.lang.String hexString = java.lang.Integer.toHexString(o45.wf.f424562g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(hexString, "toHexString(...)");
        java.util.Locale ROOT = java.util.Locale.ROOT;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ROOT, "ROOT");
        java.lang.String upperCase = hexString.toUpperCase(ROOT);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(upperCase, "toUpperCase(...)");
        jSONObject.put("clientVersion", "0x".concat(upperCase));
        if (gm0.j1.a()) {
            jSONObject.put("uin", new jz5.u(gm0.j1.b().h()));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiteAppTestService", "acc not ready");
            jSONObject.put("uin", 0);
        }
        qa3.j jVar = qa3.j.f442581a;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        java.lang.String BUILD_TAG = lp0.a.f401785f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(BUILD_TAG, "BUILD_TAG");
        jSONObject.put("tag", jVar.a(str, BUILD_TAG));
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274640c;
        java.lang.String TIME = lp0.a.f401784e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(TIME, "TIME");
        jSONObject.put("time", jVar.a(str2, TIME));
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppTestService", "send data: ".concat(jSONObject2));
        oVar.d(jSONObject2);
    }

    public final void c(org.json.JSONObject cmd, boolean z17, java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmd, "cmd");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("cmd", "result");
        jSONObject.put("opcmd", cmd);
        jSONObject.put("result", z17);
        jSONObject.put("errMsg", errMsg);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppTestService", "send data: ".concat(jSONObject2));
        d(jSONObject2);
    }

    public final void d(java.lang.String message) {
        if (f442588e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppTestService", "websocket sendStr: " + message + ": connectId : " + f442590g);
            xp5.f fVar = f442589f;
            if (fVar != null) {
                long j17 = f442590g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
                fVar.f537501b.m83294x6206e972(j17, message);
                return;
            }
            return;
        }
        jz5.l lVar = f442585b;
        if (lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiteAppTestService", "no socket");
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(lVar);
        java.lang.String str = (java.lang.String) lVar.f384366d;
        jz5.l lVar2 = f442585b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(lVar2);
        int intValue = ((java.lang.Number) lVar2.f384367e).intValue();
        byte[] bytes = message.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        com.p314xaae8f345.p3132xf2511bc7.C27055x4f8528b.m108926xffee89e8(str, intValue, bytes, true);
    }
}
