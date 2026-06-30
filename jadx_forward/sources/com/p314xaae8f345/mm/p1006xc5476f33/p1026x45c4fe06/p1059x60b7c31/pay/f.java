package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.f f164129a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.f();

    /* renamed from: b, reason: collision with root package name */
    public static final android.util.SparseArray f164130b = new android.util.SparseArray();

    public static final boolean b(android.app.Activity context, yz5.l function) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(function, "function");
        return c(context, function, null);
    }

    public static final boolean c(android.app.Activity context, yz5.l function, nf.j jVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(function, "function");
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            function.mo146xb9724478(context);
            return true;
        }
        try {
            int hashCode = function.hashCode();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.C12203xd792d405 c12203xd792d405 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.C12203xd792d405(hashCode);
            int mo50397x4930e041 = c12203xd792d405.mo50397x4930e041();
            if (jVar != null) {
                nf.g.a(context).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.e(mo50397x4930e041, jVar));
            }
            f164130b.put(hashCode, function);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.d.b(context, c12203xd792d405, null);
            return true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandJsApiPayUtils", th6, "waitForMMActivityResult startLogicProxy", new java.lang.Object[0]);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0021, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r9.optString("appId")) != false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a A[Catch: Exception -> 0x00be, TRY_ENTER, TryCatch #0 {Exception -> 0x00be, blocks: (B:41:0x0019, B:10:0x003a, B:12:0x0043, B:15:0x0058, B:18:0x0060, B:22:0x0079, B:24:0x0083, B:25:0x00a0, B:27:0x00a5, B:29:0x00b6, B:30:0x00ba, B:35:0x008c, B:3:0x0023, B:5:0x0029), top: B:40:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058 A[Catch: Exception -> 0x00be, TRY_LEAVE, TryCatch #0 {Exception -> 0x00be, blocks: (B:41:0x0019, B:10:0x003a, B:12:0x0043, B:15:0x0058, B:18:0x0060, B:22:0x0079, B:24:0x0083, B:25:0x00a0, B:27:0x00a5, B:29:0x00b6, B:30:0x00ba, B:35:0x008c, B:3:0x0023, B:5:0x0029), top: B:40:0x0019 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 r7, org.json.JSONObject r8, org.json.JSONObject r9, java.lang.String r10, boolean r11) {
        /*
            java.lang.String r0 = "env"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r0)
            java.lang.String r0 = "data"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r0)
            java.lang.String r0 = "jsapiName"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r0)
            java.lang.String r0 = "requestPayment"
            java.lang.String r1 = "customAppId"
            r2 = 1
            java.lang.String r3 = "appId"
            r4 = 0
            if (r9 == 0) goto L23
            java.lang.String r5 = r9.optString(r3)     // Catch: java.lang.Exception -> Lbe
            boolean r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r5)     // Catch: java.lang.Exception -> Lbe
            if (r5 == 0) goto L33
        L23:
            boolean r5 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r10, r0)     // Catch: java.lang.Exception -> Lbe
            if (r5 == 0) goto L35
            java.lang.String r5 = r8.optString(r1)     // Catch: java.lang.Exception -> Lbe
            boolean r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r5)     // Catch: java.lang.Exception -> Lbe
            if (r5 != 0) goto L35
        L33:
            r5 = r2
            goto L36
        L35:
            r5 = r4
        L36:
            java.lang.String r6 = "key_appbrand_from_username"
            if (r5 != 0) goto L58
            java.lang.String r9 = r7.mo48798x74292566()     // Catch: java.lang.Exception -> Lbe
            r8.put(r3, r9)     // Catch: java.lang.Exception -> Lbe
            if (r11 == 0) goto L57
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r7 = r7.mo32091x9a3f0ba2()     // Catch: java.lang.Exception -> Lbe
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r7 = r7.u0()     // Catch: java.lang.Exception -> Lbe
            java.lang.String r9 = "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r7, r9)     // Catch: java.lang.Exception -> Lbe
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4) r7     // Catch: java.lang.Exception -> Lbe
            java.lang.String r7 = r7.f128811x     // Catch: java.lang.Exception -> Lbe
            r8.put(r6, r7)     // Catch: java.lang.Exception -> Lbe
        L57:
            return r2
        L58:
            boolean r10 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r10, r0)     // Catch: java.lang.Exception -> Lbe
            java.lang.String r0 = "optString(...)"
            if (r10 == 0) goto L8c
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r7 = r7.mo32091x9a3f0ba2()     // Catch: java.lang.Exception -> Lbe
            java.lang.String r9 = "null cannot be cast to non-null type com.tencent.luggage.sdk.runtime.AppBrandRuntimeLU"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r7, r9)     // Catch: java.lang.Exception -> Lbe
            ze.n r7 = (ze.n) r7     // Catch: java.lang.Exception -> Lbe
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r7 = r7.u0()     // Catch: java.lang.Exception -> Lbe
            int r7 = r7.f128817z     // Catch: java.lang.Exception -> Lbe
            r9 = 7
            if (r7 != r9) goto L76
            r7 = r2
            goto L77
        L76:
            r7 = r4
        L77:
            if (r7 == 0) goto L8b
            java.lang.String r7 = r8.optString(r1)     // Catch: java.lang.Exception -> Lbe
            boolean r7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r7)     // Catch: java.lang.Exception -> Lbe
            if (r7 != 0) goto L8b
            java.lang.String r7 = r8.optString(r1)     // Catch: java.lang.Exception -> Lbe
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r7, r0)     // Catch: java.lang.Exception -> Lbe
            goto La0
        L8b:
            return r4
        L8c:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r9)     // Catch: java.lang.Exception -> Lbe
            java.lang.String r9 = r9.optString(r3)     // Catch: java.lang.Exception -> Lbe
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r9, r0)     // Catch: java.lang.Exception -> Lbe
            com.tencent.mm.plugin.appbrand.jsapi.pay.f r10 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.f.f164129a     // Catch: java.lang.Exception -> Lbe
            boolean r7 = r10.a(r7, r9)     // Catch: java.lang.Exception -> Lbe
            if (r7 != 0) goto L9f
            return r4
        L9f:
            r7 = r9
        La0:
            r8.put(r3, r7)     // Catch: java.lang.Exception -> Lbe
            if (r11 == 0) goto Lbd
            java.lang.String r9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a     // Catch: java.lang.Exception -> Lbe
            com.tencent.mm.ipcinvoker.type.IPCString r10 = new com.tencent.mm.ipcinvoker.type.IPCString     // Catch: java.lang.Exception -> Lbe
            r10.<init>(r7)     // Catch: java.lang.Exception -> Lbe
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsapi.pay.a> r7 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.a.class
            java.lang.Object r7 = com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(r9, r10, r7)     // Catch: java.lang.Exception -> Lbe
            com.tencent.mm.ipcinvoker.type.IPCString r7 = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) r7     // Catch: java.lang.Exception -> Lbe
            if (r7 == 0) goto Lb9
            java.lang.String r7 = r7.f149939d     // Catch: java.lang.Exception -> Lbe
            goto Lba
        Lb9:
            r7 = 0
        Lba:
            r8.put(r6, r7)     // Catch: java.lang.Exception -> Lbe
        Lbd:
            return r2
        Lbe:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "wrapAppIdWithCustomAppIdLogic exp:"
            r8.<init>(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.String r8 = "MicroMsg.AppBrandJsApiPayUtils"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r8, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.f.d(com.tencent.mm.plugin.appbrand.jsapi.d0, org.json.JSONObject, org.json.JSONObject, java.lang.String, boolean):boolean");
    }

    public final boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo32091x9a3f0ba2 = d0Var.mo32091x9a3f0ba2();
        if (!((mo32091x9a3f0ba2 != null ? mo32091x9a3f0ba2.u0() : null) instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApiPayUtils", "isCustomAppIdValid AppBrandInitConfigWC not valid");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 u07 = d0Var.mo32091x9a3f0ba2().u0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(u07, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC");
        org.json.JSONArray optJSONArray = new org.json.JSONObject(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4) u07).N.f158988r).optJSONArray("call_plugin_info");
        if (optJSONArray == null) {
            return true;
        }
        int length = optJSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.String optString = optJSONArray.getJSONObject(i17).optString("plugin_id");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJsApiPayUtils", "canRequestPaymentUseCustomAppId pluginId:%s customAppId:%s", optString, str);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, str)) {
                return true;
            }
        }
        return false;
    }
}
