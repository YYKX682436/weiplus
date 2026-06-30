package com.p314xaae8f345.mm.p874xaefb6cc9;

/* loaded from: classes7.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p874xaefb6cc9.j0 f150616a = new com.p314xaae8f345.mm.p874xaefb6cc9.j0();

    public static final void a(com.p314xaae8f345.mm.p874xaefb6cc9.j0 j0Var, com.p314xaae8f345.mm.vfs.r6 r6Var) {
        j0Var.getClass();
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WVA.WVACrashInfoHelper", "onWVAHostProcessCrash: Updating crashInfo");
            org.json.JSONObject jSONObject = new org.json.JSONObject(com.p314xaae8f345.mm.vfs.s6.b(r6Var, null, 1, null));
            jSONObject.getJSONArray("crashTimes").put(java.lang.System.currentTimeMillis() / 1000);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            com.p314xaae8f345.mm.vfs.s6.d(r6Var, jSONObject2, null, 2, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("WVA.WVACrashInfoHelper", e17, "onWVAHostProcessCrash: failed", new java.lang.Object[0]);
        }
    }

    public final org.json.JSONArray b(com.p314xaae8f345.mm.vfs.r6 r6Var) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(com.p314xaae8f345.mm.vfs.s6.b(r6Var, null, 1, null));
            if (e(jSONObject)) {
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                com.p314xaae8f345.mm.vfs.s6.d(r6Var, jSONObject2, null, 2, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WVA.WVACrashInfoHelper", "resetCrashInfo");
            }
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("crashTimes");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONArray);
            return jSONArray;
        } catch (org.json.JSONException e17) {
            r6Var.l();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("WVA.WVACrashInfoHelper", e17, "crashInfoFile is invalid", new java.lang.Object[0]);
            return new org.json.JSONArray();
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("WVA.WVACrashInfoHelper", e18, "getCrashTimes failed", new java.lang.Object[0]);
            return new org.json.JSONArray();
        }
    }

    public final com.p314xaae8f345.mm.vfs.r6 c(java.lang.String appId, java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.p874xaefb6cc9.j1 j1Var = com.p314xaae8f345.mm.p874xaefb6cc9.j1.f150617a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        java.lang.String str2 = j1Var.c(appId) + "persistentFiles/";
        com.p314xaae8f345.mm.vfs.w6.u(str2);
        sb6.append(str2);
        sb6.append(str);
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(sb6.toString());
        if (!r6Var.m()) {
            r6Var.k();
            java.lang.String jSONObject = new org.json.JSONObject().put("lastResetId", 0).put("crashTimes", new org.json.JSONArray()).toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            com.p314xaae8f345.mm.vfs.s6.d(r6Var, jSONObject, null, 2, null);
        }
        return r6Var;
    }

    public final void d(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        try {
            ix5.h hVar = ix5.h.f377164b;
            java.lang.String u17 = c(appId, "guestCrashInfo.json").u();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u17, "getPath(...)");
            com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25540xa5a52a1c.m95578xfcd8de98("guestCrashInfo", u17);
            com.p314xaae8f345.mm.app.i4.a(new com.p314xaae8f345.mm.p874xaefb6cc9.i0(c(appId, "hostCrashInfo.json")));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WVA.WVACrashInfoHelper", "initCrashMonitor failed", e17);
        }
    }

    public final boolean e(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p874xaefb6cc9.r0 r0Var = com.p314xaae8f345.mm.p874xaefb6cc9.u0.f150680e;
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x Ui = ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Ui("ilinkres_c411ffeb", com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25497x5d2ac867.f46634x1dde913b);
        if (Ui == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WVA.WVACrashInfoHelper", "resetCrashInfo framework resource is null");
            return false;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.udr.u> linkedList = Ui.f299139x;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList);
        for (com.p314xaae8f345.p3133xd0ce8b26.aff.udr.u uVar : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WVA.WVACrashInfoHelper", "FrameworkUDR extInfo: " + uVar.m117632xb5884f29() + '=' + uVar.m117633x754a37bb());
            java.lang.String m117632xb5884f29 = uVar.m117632xb5884f29();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m117632xb5884f29, "getKey(...)");
            java.lang.String m117633x754a37bb = uVar.m117633x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m117633x754a37bb, "getValue(...)");
            linkedHashMap.put(m117632xb5884f29, m117633x754a37bb);
        }
        long c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.b8.c((java.lang.String) linkedHashMap.get("extId"));
        if (c17 <= jSONObject.getLong("lastResetId") || !java.lang.Boolean.parseBoolean((java.lang.String) linkedHashMap.get("RESET_CRASH_COUNT"))) {
            return false;
        }
        jSONObject.put("lastResetId", c17);
        jSONObject.put("crashTimes", new org.json.JSONArray());
        return true;
    }
}
