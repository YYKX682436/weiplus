package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31;

/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.k f162338a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.k();

    static {
        fp.d0.n("aff_biz");
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.k kVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, org.json.JSONObject data, org.json.JSONObject jSONObject) {
        kVar.getClass();
        c00.r3 r3Var = (c00.r3) i95.n0.c(c00.r3.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.b bVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.b(c0Var);
        b00.m2 m2Var = (b00.m2) r3Var;
        m2Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("action");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMEcsHandleEcsActionService", "EcsAction doOnBeforeCallback action:" + optString + " inScene:1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        t00.r0 Ai = m2Var.Ai(1, optString);
        if (Ai == null) {
            return;
        }
        Ai.e(1, data, jSONObject, bVar);
    }

    public static final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.k kVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, int i17, int i18, java.lang.String str) {
        org.json.JSONObject jSONObject;
        java.lang.String str2;
        java.lang.String str3;
        kVar.getClass();
        if (i18 != 0) {
            if (i18 == 2) {
                k0Var.getClass();
                str2 = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
                str3 = str2 != null ? str2 : "";
                java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("errno", 1);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                c0Var.a(i17, k0Var.u(str3, jSONObject2));
                return;
            }
            if (i18 == 3) {
                if (str == null) {
                    str = "";
                }
                c0Var.g("onEcsEvent", str);
                return;
            }
            k0Var.getClass();
            str2 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str3 = str2 != null ? str2 : "";
            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            c0Var.a(i17, k0Var.u(str3, jSONObject3));
            return;
        }
        if (str == null) {
            k0Var.getClass();
            str2 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str3 = str2 != null ? str2 : "";
            java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 0);
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            c0Var.a(i17, k0Var.u(str3, jSONObject4));
            return;
        }
        if (r26.n0.N(str)) {
            jSONObject = new org.json.JSONObject();
        } else if (r26.i0.p(str, "null", true)) {
            jSONObject = new org.json.JSONObject();
        } else {
            try {
                jSONObject = new org.json.JSONObject(str);
            } catch (java.lang.Exception e27) {
                kVar.e("safeCreateJson", "appbrand", str, e27);
                jSONObject = new org.json.JSONObject();
            }
        }
        k0Var.getClass();
        str2 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str3 = str2 != null ? str2 : "";
        java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        try {
            jSONObject.put("errno", 0);
        } catch (java.lang.Exception e28) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e28);
        }
        c0Var.a(i17, k0Var.u(str3, jSONObject));
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 env, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 jsapi, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsapi, "jsapi");
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsActionHandlerDispatcher", "dispatch data null");
            str2 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str = str2 != null ? str2 : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            env.a(i17, jsapi.u(str, jSONObject2));
            return;
        }
        java.lang.String optString = jSONObject.optString("action");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsActionHandlerDispatcher", "dispatch action:" + optString);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsActionHandlerDispatcher", "dispatch action nil");
            str2 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str = str2 != null ? str2 : "";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 101);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            env.a(i17, jsapi.u(str, jSONObject3));
            return;
        }
        c00.r3 r3Var = (c00.r3) i95.n0.c(c00.r3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        b00.m2 m2Var = (b00.m2) r3Var;
        m2Var.getClass();
        t00.r0 Ai = m2Var.Ai(1, optString);
        c00.o3 o3Var = Ai == null ? null : new c00.o3(Ai.g(), Ai.b());
        if (o3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsActionHandlerDispatcher", "dispatch getActionHandlerConfig null");
            java.lang.String str5 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str = str5 != null ? str5 : "";
            java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 4);
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            env.a(i17, jsapi.u(str, jSONObject4));
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dispatch config.needInMMProcess:");
        boolean z17 = o3Var.f118539a;
        sb6.append(z17);
        sb6.append(" config.needUIContext:");
        boolean z18 = o3Var.f118540b;
        sb6.append(z18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsActionHandlerDispatcher", sb6.toString());
        org.json.JSONObject Di = ((b00.m2) ((c00.r3) i95.n0.c(c00.r3.class))).Di(1, env.Z0(), jSONObject, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.b(env));
        c00.r3 r3Var2 = (c00.r3) i95.n0.c(c00.r3.class);
        android.app.Activity Z0 = env.Z0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.a aVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.a(env, jsapi, i17);
        b00.m2 m2Var2 = (b00.m2) r3Var2;
        m2Var2.getClass();
        java.lang.String optString2 = jSONObject.optString("action");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMEcsHandleEcsActionService", "processBeforeCrossToMM action:" + optString2 + " inScene:1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
        t00.r0 Ai2 = m2Var2.Ai(1, optString2);
        if (Ai2 == null ? false : Ai2.d(1, Z0, jSONObject, aVar, Di)) {
            return;
        }
        if (!z17) {
            ((b00.m2) ((c00.r3) i95.n0.c(c00.r3.class))).Bi(1, env.Z0(), jSONObject, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.a(env, jsapi, i17), Di);
            return;
        }
        if (!z18) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.ipc.C12081xc7365220(jSONObject.toString(), java.lang.String.valueOf(Di)), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.f.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.h(env, jSONObject, Di, jsapi, i17));
            return;
        }
        android.app.Activity Z02 = env.Z0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.ipc.C12079x9c685a c12079x9c685a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.ipc.C12079x9c685a(jSONObject.toString(), java.lang.String.valueOf(Di));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.g gVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.g(env, jSONObject, Di, jsapi, i17);
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.d.f159933a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.W6(Z02, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.class, c12079x9c685a, gVar, null);
    }

    public final void d(android.content.Context context, java.lang.String str, java.lang.String str2, c00.n3 n3Var) {
        org.json.JSONObject jSONObject;
        org.json.JSONObject jSONObject2 = null;
        try {
            jSONObject = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? null : new org.json.JSONObject(str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EcsActionHandlerDispatcher", "HandleEcsActionTask error:" + e17);
            jSONObject = null;
        }
        try {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                jSONObject2 = new org.json.JSONObject(str2);
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EcsActionHandlerDispatcher", "HandleEcsActionTask error:" + e18);
        }
        org.json.JSONObject jSONObject3 = jSONObject2;
        if (jSONObject != null) {
            ((b00.m2) ((c00.r3) i95.n0.c(c00.r3.class))).Bi(1, context, jSONObject, n3Var, jSONObject3);
        }
    }

    public final void e(java.lang.String methodName, java.lang.String crashProcess, java.lang.String data, java.lang.Exception e17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(methodName, "methodName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(crashProcess, "crashProcess");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EcsActionHandlerDispatcher", "EcsActionHandler:reportCrash methodName:" + methodName + " crashProcess:" + crashProcess + " data:" + data + '.');
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = "EcsActionHandlerCrash";
        objArr[1] = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(e17.getMessage());
        sb6.append(':');
        java.lang.StackTraceElement[] stackTrace = e17.getStackTrace();
        if (stackTrace != null) {
            if (!(stackTrace.length == 0)) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e);
                java.util.Iterator a17 = p3321xbce91901.jvm.p3324x21ffc6bd.c.a(stackTrace);
                while (true) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.b bVar = (p3321xbce91901.jvm.p3324x21ffc6bd.b) a17;
                    if (!bVar.hasNext()) {
                        break;
                    }
                    sb7.append(((java.lang.StackTraceElement) bVar.next()).toString());
                    sb7.append(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e);
                }
                str = sb7.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toString(...)");
                sb6.append(str);
                objArr[2] = sb6.toString();
                g0Var.d(36743, objArr);
            }
        }
        str = "";
        sb6.append(str);
        objArr[2] = sb6.toString();
        g0Var.d(36743, objArr);
    }
}
