package com.tencent.mm.minigame;

/* loaded from: classes7.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.minigame.j0 f69083a = new com.tencent.mm.minigame.j0();

    public static final void a(com.tencent.mm.minigame.j0 j0Var, com.tencent.mm.vfs.r6 r6Var) {
        j0Var.getClass();
        try {
            com.tencent.mars.xlog.Log.i("WVA.WVACrashInfoHelper", "onWVAHostProcessCrash: Updating crashInfo");
            org.json.JSONObject jSONObject = new org.json.JSONObject(com.tencent.mm.vfs.s6.b(r6Var, null, 1, null));
            jSONObject.getJSONArray("crashTimes").put(java.lang.System.currentTimeMillis() / 1000);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            com.tencent.mm.vfs.s6.d(r6Var, jSONObject2, null, 2, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("WVA.WVACrashInfoHelper", e17, "onWVAHostProcessCrash: failed", new java.lang.Object[0]);
        }
    }

    public final org.json.JSONArray b(com.tencent.mm.vfs.r6 r6Var) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(com.tencent.mm.vfs.s6.b(r6Var, null, 1, null));
            if (e(jSONObject)) {
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                com.tencent.mm.vfs.s6.d(r6Var, jSONObject2, null, 2, null);
                com.tencent.mars.xlog.Log.i("WVA.WVACrashInfoHelper", "resetCrashInfo");
            }
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("crashTimes");
            kotlin.jvm.internal.o.d(jSONArray);
            return jSONArray;
        } catch (org.json.JSONException e17) {
            r6Var.l();
            com.tencent.mars.xlog.Log.printErrStackTrace("WVA.WVACrashInfoHelper", e17, "crashInfoFile is invalid", new java.lang.Object[0]);
            return new org.json.JSONArray();
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("WVA.WVACrashInfoHelper", e18, "getCrashTimes failed", new java.lang.Object[0]);
            return new org.json.JSONArray();
        }
    }

    public final com.tencent.mm.vfs.r6 c(java.lang.String appId, java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.minigame.j1 j1Var = com.tencent.mm.minigame.j1.f69084a;
        kotlin.jvm.internal.o.g(appId, "appId");
        java.lang.String str2 = j1Var.c(appId) + "persistentFiles/";
        com.tencent.mm.vfs.w6.u(str2);
        sb6.append(str2);
        sb6.append(str);
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(sb6.toString());
        if (!r6Var.m()) {
            r6Var.k();
            java.lang.String jSONObject = new org.json.JSONObject().put("lastResetId", 0).put("crashTimes", new org.json.JSONArray()).toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            com.tencent.mm.vfs.s6.d(r6Var, jSONObject, null, 2, null);
        }
        return r6Var;
    }

    public final void d(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        try {
            ix5.h hVar = ix5.h.f295631b;
            java.lang.String u17 = c(appId, "guestCrashInfo.json").u();
            kotlin.jvm.internal.o.f(u17, "getPath(...)");
            com.tencent.shadow.dynamic.host.HostOpenPathDelegate.addHostOpenPath("guestCrashInfo", u17);
            com.tencent.mm.app.i4.a(new com.tencent.mm.minigame.i0(c(appId, "hostCrashInfo.json")));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("WVA.WVACrashInfoHelper", "initCrashMonitor failed", e17);
        }
    }

    public final boolean e(org.json.JSONObject jSONObject) {
        com.tencent.mm.minigame.r0 r0Var = com.tencent.mm.minigame.u0.f69147e;
        com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Ui("ilinkres_c411ffeb", com.tencent.shadow.core.common.HostConstants.FRAMEWORK_APPID);
        if (Ui == null) {
            com.tencent.mars.xlog.Log.e("WVA.WVACrashInfoHelper", "resetCrashInfo framework resource is null");
            return false;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.LinkedList<com.tencent.wechat.aff.udr.u> linkedList = Ui.f217606x;
        kotlin.jvm.internal.o.d(linkedList);
        for (com.tencent.wechat.aff.udr.u uVar : linkedList) {
            com.tencent.mars.xlog.Log.i("WVA.WVACrashInfoHelper", "FrameworkUDR extInfo: " + uVar.getKey() + '=' + uVar.getValue());
            java.lang.String key = uVar.getKey();
            kotlin.jvm.internal.o.f(key, "getKey(...)");
            java.lang.String value = uVar.getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            linkedHashMap.put(key, value);
        }
        long c17 = com.tencent.mm.sdk.platformtools.b8.c((java.lang.String) linkedHashMap.get("extId"));
        if (c17 <= jSONObject.getLong("lastResetId") || !java.lang.Boolean.parseBoolean((java.lang.String) linkedHashMap.get("RESET_CRASH_COUNT"))) {
            return false;
        }
        jSONObject.put("lastResetId", c17);
        jSONObject.put("crashTimes", new org.json.JSONArray());
        return true;
    }
}
