package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes7.dex */
public final class x2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f90838d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader f90839e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f90840f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f90841g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f90842h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f90843i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(long j17, com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader, kotlin.jvm.internal.h0 h0Var, boolean z17, boolean z18, yz5.a aVar) {
        super(1);
        this.f90838d = j17;
        this.f90839e = iCommLibReader;
        this.f90840f = h0Var;
        this.f90841g = z17;
        this.f90842h = z18;
        this.f90843i = aVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String valueOf;
        java.lang.String str;
        com.tencent.mm.vfs.x1 m17;
        com.tencent.mm.vfs.x1 m18;
        com.eclipsesource.mmv8.snapshot.CreateSnapshotResult result = (com.eclipsesource.mmv8.snapshot.CreateSnapshotResult) obj;
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mm.plugin.appbrand.v8_snapshot.j3 j3Var = com.tencent.mm.plugin.appbrand.v8_snapshot.j3.f90743a;
        long j17 = this.f90838d;
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader commLibReader = this.f90839e;
        com.tencent.mm.plugin.appbrand.v8_snapshot.l3 category = ((com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo) this.f90840f.f310123d).f90668h;
        boolean z17 = this.f90841g;
        kotlin.jvm.internal.o.g(commLibReader, "commLibReader");
        kotlin.jvm.internal.o.g(category, "category");
        long uptimeMillis = android.os.SystemClock.uptimeMillis() - j17;
        com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90749a.getClass();
        if (com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90751c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", "onCreateSnapshotEnd, costTimeMs: " + uptimeMillis + ", commLibReader: " + j3Var.t(commLibReader) + ", category: " + category + ", result: " + result + ", isNodeSnapshot: " + z17);
            if (result instanceof com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Success) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreateSnapshotEnd, snapshotSize: ");
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(((com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Success) result).snapshotPath);
                java.lang.String str2 = a17.f213279f;
                if (str2 != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                    if (!str2.equals(l17)) {
                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                    }
                }
                com.tencent.mm.vfs.z2 m19 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                sb6.append((m19.a() && (m18 = m19.f213266a.m(m19.f213267b)) != null) ? m18.f213233c : 0L);
                com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", sb6.toString());
            }
        }
        if (j3Var.b()) {
            if (result instanceof com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Success) {
                com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(((com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Success) result).snapshotPath);
                java.lang.String str3 = a18.f213279f;
                if (str3 != null) {
                    java.lang.String l18 = com.tencent.mm.vfs.e8.l(str3, false, false);
                    if (!str3.equals(l18)) {
                        a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l18, a18.f213280g, a18.f213281h);
                    }
                }
                com.tencent.mm.vfs.z2 m27 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
                valueOf = java.lang.String.valueOf((m27.a() && (m17 = m27.f213266a.m(m27.f213267b)) != null) ? m17.f213233c : 0L);
                str = "1";
            } else {
                valueOf = result instanceof com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Failure ? java.lang.String.valueOf(((com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Failure) result).errno) : "-201";
                str = "0";
            }
            com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct androidWAServiceLibSnapshotQualityStruct = new com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct();
            androidWAServiceLibSnapshotQualityStruct.f55110d = 5;
            androidWAServiceLibSnapshotQualityStruct.r(j3Var.t(commLibReader));
            androidWAServiceLibSnapshotQualityStruct.s(cl.x.b());
            androidWAServiceLibSnapshotQualityStruct.f55113g = uptimeMillis;
            androidWAServiceLibSnapshotQualityStruct.p(str);
            androidWAServiceLibSnapshotQualityStruct.q(valueOf);
            androidWAServiceLibSnapshotQualityStruct.f55116j = androidWAServiceLibSnapshotQualityStruct.b("ActionParams3", category.f90775d, true);
            androidWAServiceLibSnapshotQualityStruct.f55117k = androidWAServiceLibSnapshotQualityStruct.b("ActionParams4", z17 ? "1" : "0", true);
            androidWAServiceLibSnapshotQualityStruct.k();
        }
        if (result instanceof com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Success) {
            kotlin.jvm.internal.h0 h0Var = this.f90840f;
            com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = (com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo) h0Var.f310123d;
            com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Success success = (com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Success) result;
            boolean z18 = this.f90841g;
            wxaPkgV8SnapshotInfo.getClass();
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(success.snapshotPath);
            java.lang.String snapshotPath = success.snapshotPath;
            kotlin.jvm.internal.o.f(snapshotPath, "snapshotPath");
            long B = r6Var.B();
            long C = r6Var.C();
            com.tencent.mm.plugin.appbrand.v8_snapshot.o3 o3Var = com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo.f90661v;
            java.lang.String str4 = (java.lang.String) ((jz5.n) com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo.f90662w).getValue();
            kotlin.jvm.internal.o.f(str4, "access$getCurSnapshotBaseConfig(...)");
            java.util.Map<java.lang.String, java.lang.Integer> contextNameToSnapshotIndexMap = success.contextNameToSnapshotIndexMap;
            kotlin.jvm.internal.o.f(contextNameToSnapshotIndexMap, "contextNameToSnapshotIndexMap");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                for (java.util.Map.Entry<java.lang.String, java.lang.Integer> entry : contextNameToSnapshotIndexMap.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue().intValue());
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WxaPkgV8SnapshotInfo", "generateMetaInfo, failure since " + e17);
            }
            java.lang.String str5 = (java.lang.String) ((jz5.n) com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo.f90663x).getValue();
            kotlin.jvm.internal.o.f(str5, "access$getCurSnapshotNodeFlag(...)");
            h0Var.f310123d = com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo.b(wxaPkgV8SnapshotInfo, 0, null, null, 0, null, snapshotPath, B, C, str4, jSONObject, z18, str5, 0, 0, 0, 24607, null);
            ((ku5.t0) ku5.t0.f312615d).r(new com.tencent.mm.plugin.appbrand.v8_snapshot.w2(this.f90840f), "MicroMsg.WxaCommLibV8SnapshotServiceImpl");
            if (this.f90842h) {
                com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo2 = (com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo) this.f90840f.f310123d;
                com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90749a.getClass();
                if (com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90751c) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.NodeOnlySnapshotQuickAccessible", "snapshotInfo#set, value: " + wxaPkgV8SnapshotInfo2);
                }
                if (wxaPkgV8SnapshotInfo2 == null) {
                    com.tencent.mm.sdk.platformtools.o4 a19 = com.tencent.mm.plugin.appbrand.app.q0.f75227a.a();
                    if (a19 != null) {
                        a19.remove("NodeOnlySnapshotInfo#" + com.tencent.mm.plugin.appbrand.v8_snapshot.s3.f90820d);
                    }
                } else {
                    com.tencent.mm.sdk.platformtools.o4 a27 = com.tencent.mm.plugin.appbrand.app.q0.f75227a.a();
                    if (a27 != null) {
                        java.lang.String str6 = "NodeOnlySnapshotInfo#" + com.tencent.mm.plugin.appbrand.v8_snapshot.s3.f90820d;
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put("snapshotPath", wxaPkgV8SnapshotInfo2.f90669i);
                        jSONObject2.put("snapshotLastModified", wxaPkgV8SnapshotInfo2.f90670m);
                        jSONObject2.put("snapshotLength", wxaPkgV8SnapshotInfo2.f90671n);
                        jSONObject2.put("snapshotBaseConfig", wxaPkgV8SnapshotInfo2.f90672o);
                        jSONObject2.put("snapshotMetaInfo", wxaPkgV8SnapshotInfo2.f90673p);
                        jSONObject2.put("snapshotNodeConfig", wxaPkgV8SnapshotInfo2.f90675r);
                        a27.putString(str6, jSONObject2.toString());
                    }
                }
            }
        }
        this.f90843i.invoke();
        return jz5.f0.f302826a;
    }
}
