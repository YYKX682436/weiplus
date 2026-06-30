package b00;

@j95.b
/* loaded from: classes.dex */
public final class m2 extends i95.w implements c00.r3 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f98252d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f98253e;

    public m2() {
        jz5.g b17 = jz5.h.b(b00.i2.f98222d);
        jz5.g b18 = jz5.h.b(b00.k2.f98236d);
        jz5.g b19 = jz5.h.b(b00.g2.f98209d);
        jz5.g b27 = jz5.h.b(b00.j2.f98231d);
        jz5.g b28 = jz5.h.b(b00.l2.f98244d);
        jz5.g b29 = jz5.h.b(b00.h2.f98214d);
        jz5.g b37 = jz5.h.b(b00.e2.f98196d);
        jz5.g b38 = jz5.h.b(b00.f2.f98203d);
        this.f98252d = kz5.c1.k(new jz5.l(1, (java.util.Map) ((jz5.n) b17).mo141623x754a37bb()), new jz5.l(2, (java.util.Map) ((jz5.n) b18).mo141623x754a37bb()), new jz5.l(3, (java.util.Map) ((jz5.n) b19).mo141623x754a37bb()), new jz5.l(4, (java.util.Map) ((jz5.n) b37).mo141623x754a37bb()));
        this.f98253e = kz5.c1.k(new jz5.l(1, (java.util.Map) ((jz5.n) b27).mo141623x754a37bb()), new jz5.l(2, (java.util.Map) ((jz5.n) b28).mo141623x754a37bb()), new jz5.l(3, (java.util.Map) ((jz5.n) b29).mo141623x754a37bb()), new jz5.l(4, (java.util.Map) ((jz5.n) b38).mo141623x754a37bb()));
    }

    public final t00.r0 Ai(int i17, java.lang.String str) {
        java.util.Map map = (java.util.Map) this.f98252d.get(java.lang.Integer.valueOf(i17));
        if (map == null) {
            return null;
        }
        return (t00.r0) map.get(str);
    }

    public void Bi(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.String optString = data.optString("action");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMEcsHandleEcsActionService", "dispatch action:" + optString + " inScene:" + i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        t00.r0 Ai = Ai(i17, optString);
        if (Ai != null) {
            Ai.c(i17, context, data, callback, jSONObject);
        }
    }

    public org.json.JSONObject Di(int i17, android.content.Context context, org.json.JSONObject data, c00.q3 envHandler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(envHandler, "envHandler");
        java.lang.String optString = data.optString("action");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMEcsHandleEcsActionService", "processBeforeCrossToMM action:" + optString + " inScene:" + i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        t00.r0 Ai = Ai(i17, optString);
        if (Ai == null) {
            return null;
        }
        return Ai.f(i17, context, data, envHandler);
    }

    public java.util.Map wi(int i17) {
        java.util.Map map = (java.util.Map) this.f98252d.get(java.lang.Integer.valueOf(i17));
        if (map == null) {
            return kz5.q0.f395534d;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry entry : map.entrySet()) {
            hashMap.put(((t00.r0) entry.getValue()).a().f495846a, java.lang.Integer.valueOf(((t00.r0) entry.getValue()).a().f495847b));
        }
        return hashMap;
    }
}
