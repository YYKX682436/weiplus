package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312;

/* loaded from: classes7.dex */
public final class m0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.w {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.t f167192a;

    /* renamed from: b, reason: collision with root package name */
    public final int f167193b;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.t runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        this.f167192a = runtime;
        this.f167193b = hashCode() & 65535;
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
            java.lang.String r1 = "), appId("
            r0.append(r1)
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.t r1 = r7.f167192a
            java.lang.String r1 = r1.f156336n
            r0.append(r1)
            java.lang.String r1 = ") data("
            r0.append(r1)
            r0.append(r8)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.AppBrand.FunctionalAPIInvokeManager.WebInvokeProcess"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lbf java.lang.RuntimeException -> Ld1
            r0.<init>(r8)     // Catch: org.json.JSONException -> Lbf java.lang.RuntimeException -> Ld1
            java.lang.String r8 = "name"
            java.lang.String r8 = r0.optString(r8)     // Catch: org.json.JSONException -> Lbf java.lang.RuntimeException -> Ld1
            java.lang.String r2 = "args"
            java.lang.String r2 = r0.optString(r2)     // Catch: org.json.JSONException -> Lbf java.lang.RuntimeException -> Ld1
            java.lang.String r3 = "transitiveData"
            java.lang.String r3 = r0.optString(r3)     // Catch: org.json.JSONException -> Lbf java.lang.RuntimeException -> Ld1
            r4 = 0
            r5 = 1
            if (r8 == 0) goto L5a
            int r6 = r8.length()     // Catch: org.json.JSONException -> Lbf java.lang.RuntimeException -> Ld1
            if (r6 != 0) goto L58
            goto L5a
        L58:
            r6 = r4
            goto L5b
        L5a:
            r6 = r5
        L5b:
            if (r6 != 0) goto Lb9
            if (r2 == 0) goto L65
            int r6 = r2.length()     // Catch: org.json.JSONException -> Lbf java.lang.RuntimeException -> Ld1
            if (r6 != 0) goto L66
        L65:
            r4 = r5
        L66:
            if (r4 == 0) goto L69
            goto Lb9
        L69:
            java.lang.String r4 = "jsapiType"
            java.lang.String r0 = r0.optString(r4)     // Catch: org.json.JSONException -> Lbf java.lang.RuntimeException -> Ld1
            java.lang.String r4 = "appservice"
            boolean r4 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, r4)     // Catch: org.json.JSONException -> Lbf java.lang.RuntimeException -> Ld1
            if (r4 == 0) goto L85
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.t r0 = r7.f167192a     // Catch: org.json.JSONException -> Lbf java.lang.RuntimeException -> Ld1
            com.tencent.mm.plugin.appbrand.service.c0 r0 = r0.C0()     // Catch: org.json.JSONException -> Lbf java.lang.RuntimeException -> Ld1
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.FunctionalAppService"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r0, r3)     // Catch: org.json.JSONException -> Lbf java.lang.RuntimeException -> Ld1
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.f r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.f) r0     // Catch: org.json.JSONException -> Lbf java.lang.RuntimeException -> Ld1
            goto L9f
        L85:
            java.lang.String r4 = "webview"
            boolean r0 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, r4)     // Catch: org.json.JSONException -> Lbf java.lang.RuntimeException -> Ld1
            if (r0 == 0) goto La7
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.t r0 = r7.f167192a     // Catch: org.json.JSONException -> Lbf java.lang.RuntimeException -> Ld1
            com.tencent.mm.plugin.appbrand.page.d5 r0 = r0.x0()     // Catch: org.json.JSONException -> Lbf java.lang.RuntimeException -> Ld1
            com.tencent.mm.plugin.appbrand.page.v5 r0 = r0.m52174xaf156f4a()     // Catch: org.json.JSONException -> Lbf java.lang.RuntimeException -> Ld1
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.FunctionalPageView"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r0, r3)     // Catch: org.json.JSONException -> Lbf java.lang.RuntimeException -> Ld1
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.n r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.n) r0     // Catch: org.json.JSONException -> Lbf java.lang.RuntimeException -> Ld1
        L9f:
            java.lang.String r3 = ""
            int r4 = r7.f167193b     // Catch: org.json.JSONException -> Lbf java.lang.RuntimeException -> Ld1
            r0.p0(r8, r2, r3, r4)     // Catch: org.json.JSONException -> Lbf java.lang.RuntimeException -> Ld1
            goto Ld1
        La7:
            java.lang.String r0 = "fail invalid jsapiType"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r8)     // Catch: org.json.JSONException -> Lbf java.lang.RuntimeException -> Ld1
            java.lang.String r8 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.e.a(r0, r8)     // Catch: org.json.JSONException -> Lbf java.lang.RuntimeException -> Ld1
            r7.d(r3, r8)     // Catch: org.json.JSONException -> Lbf java.lang.RuntimeException -> Ld1
            java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch: org.json.JSONException -> Lbf java.lang.RuntimeException -> Ld1
            r8.<init>()     // Catch: org.json.JSONException -> Lbf java.lang.RuntimeException -> Ld1
            throw r8     // Catch: org.json.JSONException -> Lbf java.lang.RuntimeException -> Ld1
        Lb9:
            java.lang.String r8 = "fail invalid args"
            r7.d(r3, r8)     // Catch: org.json.JSONException -> Lbf java.lang.RuntimeException -> Ld1
            return
        Lbf:
            r8 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "performInvoke, json parse e = "
            r0.<init>(r2)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r8)
        Ld1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.m0.a(java.lang.String):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.w
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.x component, int i17, java.lang.String callbackStr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callbackStr, "callbackStr");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.FunctionalAPIInvokeManager.WebInvokeProcess", "onPreCallback, instance(" + hashCode() + ", callbackId(" + i17 + "), callbackStr(" + callbackStr + ')');
        d(null, callbackStr);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.w
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.x component, int i17, java.lang.String data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (this.f167193b == i17) {
            d(null, data);
        }
    }

    public final void d(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.FunctionalAPIInvokeManager.WebInvokeProcess", "navigateBack, instance(" + hashCode() + "), invokeResult(" + str2 + ')');
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.t tVar = this.f167192a;
        com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.h hVar = tVar.u0().f128805l1;
        if (hVar != null) {
            hVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.C12400xf4ff9b4c(str2, str));
            tVar.L2(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.r(tVar, tVar.r0()));
        }
    }
}
