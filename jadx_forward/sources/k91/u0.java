package k91;

@j95.b
/* loaded from: classes7.dex */
public final class u0 extends i95.w implements k91.a3 {

    /* renamed from: e, reason: collision with root package name */
    public static final k91.s0 f387308e = new k91.s0(null);

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f387309d = jz5.h.b(k91.t0.f387298d);

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Ai() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f387309d).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) mo141623x754a37bb;
    }

    public k91.r0 Bi(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        k91.r0 Ni = Ni(appId);
        if (Ni != null) {
            return Ni;
        }
        k91.r0 r0Var = new k91.r0(null, 1, null);
        Ri(appId, r0Var);
        return r0Var;
    }

    public k91.r0 Di(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        k91.r0 Ni = Ni(appId);
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = appId;
        objArr[1] = java.lang.Boolean.valueOf(Ni != null);
        objArr[2] = java.lang.Integer.valueOf(android.os.Process.myPid());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PackageLoadService", "[PackageLoadInfo] getPackageLoadInfo appId=%s, result=%s, pid=%d", objArr);
        return Ni;
    }

    public final k91.r0 Ni(java.lang.String str) {
        java.lang.String t17 = Ai().t(k91.s0.a(f387308e, str));
        if (t17 == null) {
            return null;
        }
        try {
            return wi(new org.json.JSONObject(t17));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.PackageLoadService", "loadPackageLoadInfo error: %s", e17.getMessage());
            return null;
        }
    }

    public final void Ri(java.lang.String str, k91.r0 r0Var) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        for (java.util.Map.Entry entry : r0Var.f387290a.entrySet()) {
            java.lang.String str2 = (java.lang.String) entry.getKey();
            k91.m0 m0Var = (k91.m0) entry.getValue();
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("loaded", m0Var.f387205a);
            jSONObject3.put("progress", m0Var.f387206b);
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            for (java.util.Map.Entry entry2 : m0Var.f387207c.entrySet()) {
                int intValue = ((java.lang.Number) entry2.getKey()).intValue();
                k91.q0 q0Var = (k91.q0) entry2.getValue();
                org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                jSONObject5.put("needDownload", q0Var.f387262a);
                jSONObject5.put("startTime", q0Var.f387263b);
                jSONObject4.put(java.lang.String.valueOf(intValue), jSONObject5);
            }
            jSONObject3.put("hitOptimizations", jSONObject4);
            jSONObject2.put(str2, jSONObject3);
        }
        jSONObject.put("loadInfo", jSONObject2);
        Ai().D(k91.s0.a(f387308e, str), jSONObject.toString());
    }

    public void Ui(java.lang.String appId, java.lang.String moduleName, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moduleName, "moduleName");
        k91.r0 Bi = Bi(appId);
        java.util.Map map = Bi.f387290a;
        java.lang.Object obj = map.get(moduleName);
        if (obj == null) {
            obj = new k91.m0(false, 0.0f, null, 7, null);
            map.put(moduleName, obj);
        }
        ((k91.m0) obj).f387206b = f17;
        Ri(appId, Bi);
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo8845x3e5a77bb(context);
        if (com.p314xaae8f345.mm.app.v5.a(context) == com.p314xaae8f345.mm.app.v5.f135384h) {
            Ai().d();
        }
    }

    public final k91.r0 wi(org.json.JSONObject jSONObject) {
        k91.r0 r0Var = new k91.r0(null, 1, null);
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("loadInfo");
        if (optJSONObject == null) {
            return r0Var;
        }
        java.util.Iterator<java.lang.String> keys = optJSONObject.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            org.json.JSONObject jSONObject2 = optJSONObject.getJSONObject(next);
            k91.m0 m0Var = new k91.m0(jSONObject2.optBoolean("loaded", false), (float) jSONObject2.optDouble("progress", 0.0d), null, 4, null);
            org.json.JSONObject optJSONObject2 = jSONObject2.optJSONObject("hitOptimizations");
            if (optJSONObject2 != null) {
                java.util.Iterator<java.lang.String> keys2 = optJSONObject2.keys();
                while (keys2.hasNext()) {
                    java.lang.String next2 = keys2.next();
                    org.json.JSONObject jSONObject3 = optJSONObject2.getJSONObject(next2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next2);
                    m0Var.f387207c.put(java.lang.Integer.valueOf(java.lang.Integer.parseInt(next2)), new k91.q0(jSONObject3.optBoolean("needDownload", false), jSONObject3.optLong("startTime", 0L)));
                }
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next);
            r0Var.f387290a.put(next, m0Var);
        }
        return r0Var;
    }
}
