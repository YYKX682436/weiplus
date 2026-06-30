package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8;

/* loaded from: classes7.dex */
public abstract class l0 {
    public static void a(android.content.Context context, com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3933x11320b41 c3933x11320b41, final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 stat) {
        org.json.JSONObject jSONObject;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PreconditionUtil", "startAppOnInitConfigGot, %s", c11809xbc286be4);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.g0.a(c11809xbc286be4, stat);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        c11809xbc286be4.f158826f2 = java.lang.System.currentTimeMillis();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stat, "stat");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.h.a(c11809xbc286be4, stat)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.f170732h.a();
            java.lang.String str = c11809xbc286be4.f128810w;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getWxaLaunchInstanceId(...)");
            java.lang.String appId = c11809xbc286be4.f158811d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appId, "appId");
            a17.b(str, appId);
            if (!android.text.TextUtils.isEmpty(c11809xbc286be4.S)) {
                try {
                    jSONObject = new org.json.JSONObject(!android.text.TextUtils.isEmpty(c11809xbc286be4.S) ? c11809xbc286be4.S : c11809xbc286be4.D.f158865q);
                } catch (java.lang.Exception unused) {
                    jSONObject = new org.json.JSONObject();
                }
                java.lang.String optString = jSONObject.optString("instanceId", "");
                if (!(optString == null || optString.length() == 0)) {
                    c11809xbc286be4.i(optString);
                    c11809xbc286be4.f158831k2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7(c11809xbc286be4.f128810w, c11809xbc286be4, stat, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.u.d());
                }
                java.lang.String optString2 = jSONObject.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, "");
                if (!(optString2 == null || optString2.length() == 0)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandInitConfigLU", "resetSession(%s) %s", optString2, android.util.Log.getStackTraceString(new java.lang.Throwable()));
                    c11809xbc286be4.f128809v = optString2;
                }
            }
            android.content.Context a18 = q75.a.a(context);
            if (a18 == null) {
                a18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            }
            ym5.a1.f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.g(a18, c11809xbc286be4, stat));
            r1 = true;
        }
        if (r1) {
            if (context instanceof android.app.Activity) {
                c11809xbc286be4.f128802b2 = stat;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.u.a((android.app.Activity) context, c11809xbc286be4, stat);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppLaunchLogic", "startAppImpl [applaunch] start functional runtime, config[%s]", c11809xbc286be4);
            return;
        }
        ik1.b0 b0Var = new ik1.b0();
        try {
            com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.x x17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.C().x(context, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.a1(c11809xbc286be4, stat, c3933x11320b41), b0Var, new yz5.l() { // from class: com.tencent.mm.plugin.appbrand.launching.w2$$a
                @Override // yz5.l
                /* renamed from: invoke */
                public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                    java.lang.String processName = (java.lang.String) obj;
                    java.lang.String appId2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4.this.f158811d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processName, "processName");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId2, "appId");
                    com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(processName, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0.f149940d, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.h0.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.j0(appId2, processName));
                    return null;
                }
            });
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppLaunchLogic", "[applaunch] startAppOnInitConfigGot %s", c11809xbc286be4);
            if (x17 == com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.x.f129232d && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x2.j(c11809xbc286be4.f128810w) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppLaunchLogic", "[applaunch] init AppLaunchPrepareProcess boost instance, appId:%s, versionType:%d, instanceId:%s", c11809xbc286be4.f158811d, java.lang.Integer.valueOf(c11809xbc286be4.f158814g), c11809xbc286be4.f128810w);
                new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x2(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k) b0Var.f373357a).i(), c11809xbc286be4, stat).m();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.c6.b(21, c11809xbc286be4.f158811d, c11809xbc286be4.L, c11809xbc286be4.f158814g, c11809xbc286be4.f128817z);
            }
        } catch (android.util.AndroidRuntimeException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.AppLaunchLogic", "startAppImpl re = %s", e17);
        }
    }
}
