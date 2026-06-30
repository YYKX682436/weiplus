package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes4.dex */
public final class p implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f84877d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f84878e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int[] f84879f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f84880g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader f84881h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84882i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f84883m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f84884n;

    public p(java.lang.String str, int i17, int[] iArr, java.lang.String str2, com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader, int i18, long j17, java.lang.String str3) {
        this.f84877d = str;
        this.f84878e = i17;
        this.f84879f = iArr;
        this.f84880g = str2;
        this.f84881h = iCommLibReader;
        this.f84882i = i18;
        this.f84883m = j17;
        this.f84884n = str3;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        java.lang.String str;
        r45.k50 k50Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.j50 j50Var = new r45.j50();
        j50Var.f377585e = this.f84877d;
        int i17 = this.f84878e;
        j50Var.f377584d = i17;
        boolean z17 = true;
        j50Var.f377589i = 1;
        int[] iArr = this.f84879f;
        kotlin.jvm.internal.o.d(iArr);
        int length = iArr.length;
        int i18 = 0;
        while (true) {
            str = this.f84880g;
            if (i18 >= length) {
                break;
            }
            int i19 = iArr[i18];
            java.util.LinkedList linkedList = j50Var.f377588h;
            r45.es0 es0Var = new r45.es0();
            es0Var.f373698d = i19;
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader = this.f84881h;
            int[] iArr2 = iArr;
            int i27 = this.f84882i;
            if (i19 == 1) {
                int P = com.tencent.mm.sdk.platformtools.t8.P(iCommLibReader != null ? iCommLibReader.qe("privacyApiVersion") : null, 0);
                if (iCommLibReader != null) {
                    iCommLibReader.W0();
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("popup_type", 2);
                jSONObject.put("version_type", i17);
                jSONObject.put("version", P);
                jSONObject.put("use_privacy_check", true);
                jSONObject.put("app_version", i27);
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                es0Var.f373699e = jSONObject2;
            } else if (i19 == 2) {
                int a17 = k91.g3.f305592a.a(str);
                if (a17 != 0) {
                    es0Var.f373699e = new org.json.JSONObject().put("ext_flag", a17).toString();
                }
            } else if (i19 == 4) {
                java.lang.String W0 = iCommLibReader != null ? iCommLibReader.W0() : null;
                if (W0 == null) {
                    W0 = "";
                }
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("lib_version", W0);
                jSONObject3.put("app_version", i27);
                java.lang.String jSONObject4 = jSONObject3.toString();
                kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
                es0Var.f373699e = jSONObject4;
            }
            linkedList.add(es0Var);
            i18++;
            iArr = iArr2;
        }
        lVar.f70664a = j50Var;
        lVar.f70665b = new r45.k50();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxabusiness/coldstartfetchdata";
        lVar.f70667d = 4024;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.f b17 = com.tencent.mm.modelbase.l3.b(lVar.a(), com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f84883m;
        java.util.LinkedList<r45.cb0> linkedList2 = (b17 == null || (k50Var = (r45.k50) b17.f70618d) == null) ? null : k50Var.f378380e;
        if (linkedList2 != null && !linkedList2.isEmpty()) {
            z17 = false;
        }
        java.lang.String str2 = this.f84884n;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCgiPrefetchBeforeLaunch", "batchPrefetch for instanceId:" + str2 + ", appId:" + str + ", get empty resp, cost:" + elapsedRealtime + "ms");
        } else {
            for (r45.cb0 cb0Var : linkedList2) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("batchPrefetch for instanceId:");
                sb6.append(str2);
                sb6.append(", appId:");
                sb6.append(str);
                sb6.append(", get resp:");
                kotlin.jvm.internal.o.d(cb0Var);
                sb6.append("{errcode:" + cb0Var.f371425f + ", fetch_type:" + cb0Var.f371423d + ", resp_data:" + cb0Var.f371424e + '}');
                sb6.append(", cost:");
                sb6.append(elapsedRealtime);
                sb6.append("ms");
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCgiPrefetchBeforeLaunch", sb6.toString());
            }
        }
        return b17;
    }
}
