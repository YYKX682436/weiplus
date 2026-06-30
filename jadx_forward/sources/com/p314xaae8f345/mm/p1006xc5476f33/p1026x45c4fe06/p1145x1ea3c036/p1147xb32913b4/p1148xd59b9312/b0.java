package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312;

/* loaded from: classes7.dex */
public final class b0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.w {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.t f167107a;

    /* renamed from: b, reason: collision with root package name */
    public int f167108b;

    /* renamed from: c, reason: collision with root package name */
    public final android.util.SparseArray f167109c;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.t runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        this.f167107a = runtime;
        this.f167109c = new android.util.SparseArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005d  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "invokeData"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "performInvoke with instance("
            r0.<init>(r1)
            int r1 = r7.hashCode()
            r0.append(r1)
            java.lang.String r1 = ") appId("
            r0.append(r1)
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.t r1 = r7.f167107a
            java.lang.String r1 = r1.f156336n
            r0.append(r1)
            java.lang.String r1 = ") data("
            r0.append(r1)
            r0.append(r8)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.AppBrand.FunctionalAPIInvokeManager.LegacySDKInvokeProcess"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            r0.<init>(r8)     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            java.lang.String r8 = "name"
            java.lang.String r8 = r0.optString(r8)     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            java.lang.String r2 = "args"
            java.lang.String r2 = r0.optString(r2)     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            java.lang.String r3 = "transitiveData"
            java.lang.String r3 = r0.optString(r3)     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            r4 = 0
            r5 = 1
            if (r8 == 0) goto L5a
            int r6 = r8.length()     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            if (r6 != 0) goto L58
            goto L5a
        L58:
            r6 = r4
            goto L5b
        L5a:
            r6 = r5
        L5b:
            if (r6 != 0) goto Lc6
            if (r2 == 0) goto L65
            int r6 = r2.length()     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            if (r6 != 0) goto L66
        L65:
            r4 = r5
        L66:
            if (r4 == 0) goto L69
            goto Lc6
        L69:
            java.lang.String r4 = "jsapiType"
            java.lang.String r0 = r0.optString(r4)     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            java.lang.String r4 = "appservice"
            boolean r4 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, r4)     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            if (r4 == 0) goto L85
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.t r0 = r7.f167107a     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            com.tencent.mm.plugin.appbrand.service.c0 r0 = r0.C0()     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            java.lang.String r4 = "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.FunctionalAppService"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r0, r4)     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.f r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.f) r0     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            goto L9f
        L85:
            java.lang.String r4 = "webview"
            boolean r0 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, r4)     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            if (r0 == 0) goto Lb4
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.t r0 = r7.f167107a     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            com.tencent.mm.plugin.appbrand.page.d5 r0 = r0.x0()     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            com.tencent.mm.plugin.appbrand.page.v5 r0 = r0.m52174xaf156f4a()     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            java.lang.String r4 = "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.FunctionalPageView"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r0, r4)     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.n r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.n) r0     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
        L9f:
            int r4 = r7.f167108b     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            int r4 = r4 + r5
            r7.f167108b = r4     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            android.util.SparseArray r5 = r7.f167109c     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.y r6 = new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.y     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            r6.<init>(r3)     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            r5.put(r4, r6)     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            java.lang.String r3 = ""
            r0.p0(r8, r2, r3, r4)     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            goto Lde
        Lb4:
            java.lang.String r0 = "fail invalid jsapiType"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r8)     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            java.lang.String r8 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.e.a(r0, r8)     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            r7.d(r3, r8)     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            r8.<init>()     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            throw r8     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
        Lc6:
            java.lang.String r8 = "fail invalid args"
            r7.d(r3, r8)     // Catch: org.json.JSONException -> Lcc java.lang.RuntimeException -> Lde
            return
        Lcc:
            r8 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "performInvoke, json parse e = "
            r0.<init>(r2)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r8)
        Lde:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.b0.a(java.lang.String):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.w
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.x component, int i17, java.lang.String callbackStr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callbackStr, "callbackStr");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.FunctionalAPIInvokeManager.LegacySDKInvokeProcess", "onPreCallback, instance(" + hashCode() + ", callbackId(" + i17 + "), callbackStr(" + callbackStr + ')');
        c(component, i17, callbackStr);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.w
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.x component, int i17, java.lang.String data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        android.util.SparseArray sparseArray = this.f167109c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.a0 a0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.a0) sparseArray.get(i17, null);
        if (a0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.y) {
            sparseArray.remove(i17);
            d(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.y) a0Var).f167204a, data);
        } else if (a0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.z) {
            sparseArray.remove(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.t tVar = this.f167107a;
            android.app.Activity r07 = tVar.r0();
            if (r07 != null) {
                r07.moveTaskToBack(true);
            }
            tVar.l0();
        }
    }

    public final void d(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.FunctionalAPIInvokeManager.LegacySDKInvokeProcess", "navigateBack, instance(" + hashCode() + "), invokeResult(" + str2 + ')');
        int i17 = this.f167108b + 1;
        this.f167108b = i17;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, str2);
        jSONObject2.put("transitiveData", str);
        jSONObject.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099, jSONObject2);
        java.lang.String jSONObject3 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
        this.f167109c.put(i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.z.f167205a);
        this.f167107a.C0().p0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.e8.f34118x24728b, jSONObject3, "", i17);
    }
}
