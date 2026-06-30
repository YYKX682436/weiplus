package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class k9 extends dm.j7 {
    public static final l75.e0 K = dm.j7.initAutoDBInfo(dm.j7.class);

    /* renamed from: J, reason: collision with root package name */
    public transient boolean f84719J;

    public boolean equals(java.lang.Object obj) {
        r45.o54 o54Var;
        r45.b10 b10Var;
        r45.mc7 mc7Var;
        r45.t1 t1Var;
        r45.d25 d25Var;
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.launching.k9)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.launching.k9 k9Var = (com.tencent.mm.plugin.appbrand.launching.k9) obj;
        return this.field_appId.equals(k9Var.field_appId) && (o54Var = this.field_launchAction) != null && ik1.d0.a(o54Var, k9Var.field_launchAction) && (b10Var = this.field_jsapiInfo) != null && ik1.d0.a(b10Var, k9Var.field_jsapiInfo) && (mc7Var = this.field_hostInfo) != null && ik1.d0.a(mc7Var, k9Var.field_hostInfo) && (t1Var = this.field_actionsheetInfo) != null && ik1.d0.a(t1Var, k9Var.field_actionsheetInfo) && (d25Var = this.field_operationInfo) != null && ik1.d0.a(d25Var, k9Var.field_operationInfo) && u46.l.c(this.field_opConfig, k9Var.field_opConfig) && this.field_expiredAtTimestampSeconds == k9Var.field_expiredAtTimestampSeconds && u46.l.c(this.field_openId, k9Var.field_openId);
    }

    @Override // dm.j7, l75.f0
    public l75.e0 getDBInfo() {
        return K;
    }

    public void t0(r45.v54 v54Var) {
        this.field_launchAction = v54Var.f387902d;
        this.field_jsapiInfo = v54Var.f387903e;
        this.field_hostInfo = v54Var.f387904f;
        this.field_actionsheetInfo = v54Var.f387906h;
        this.field_operationInfo = v54Var.f387907i;
        this.field_opConfig = v54Var.f387910o;
        long b17 = ik1.c0.b(v54Var.f387912q);
        if (b17 > 0) {
            this.field_expiredAtTimestampSeconds = c01.id.e() + b17;
        } else {
            this.field_expiredAtTimestampSeconds = 0L;
        }
        this.field_openId = v54Var.f387913r;
        this.field_showThirdBusiTips = v54Var.f387914s;
        r45.s54 s54Var = v54Var.f387915t;
        this.field_switchList = s54Var;
        java.lang.Object[] objArr = new java.lang.Object[2];
        boolean z17 = false;
        objArr[0] = java.lang.Boolean.valueOf(s54Var != null);
        r45.s54 s54Var2 = v54Var.f387915t;
        if (s54Var2 != null && s54Var2.f385519d) {
            z17 = true;
        }
        objArr[1] = java.lang.Boolean.valueOf(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.LaunchWxaAppInfo", "switch_list:%b,  tencent_map_download_guide:%b", objArr);
    }

    public void u0(com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC appBrandSysConfigWC) {
        com.tencent.mm.protobuf.g gVar;
        r45.t1 t1Var = this.field_actionsheetInfo;
        appBrandSysConfigWC.f77341y0 = t1Var != null && t1Var.f386053d;
        appBrandSysConfigWC.f77338l1 = t1Var != null && t1Var.f386054e;
        appBrandSysConfigWC.f77339p1 = t1Var != null && t1Var.f386056g;
        appBrandSysConfigWC.f77340x1 = t1Var != null ? t1Var.f386055f : 0;
        if (t1Var == null || (gVar = t1Var.f386057h) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.LaunchWxaAppInfo", "fillLaunchConfig, appId:%s, field_actionsheetInfo null", this.field_appId);
            appBrandSysConfigWC.f77342y1 = null;
        } else {
            appBrandSysConfigWC.f77342y1 = gVar.f192156a;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.LaunchWxaAppInfo", "fillLaunchConfig, appId:%s, has field_actionsheetInfo", this.field_appId);
        }
        r45.d25 d25Var = this.field_operationInfo;
        if (d25Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(d25Var.f372013d)) {
            appBrandSysConfigWC.D = this.field_operationInfo.f372013d;
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(appBrandSysConfigWC.D).getJSONObject(com.tencent.tencentmap.mapsdk.maps.TencentMapInitializer.KEY_AGREE_PRIVACY);
                appBrandSysConfigWC.f305848n = jSONObject.getInt("banLocationIfEmptyDesc") == 1;
                appBrandSysConfigWC.f305849o = jSONObject.getInt("banGetWifiListIfEmptyDesc") == 1;
            } catch (org.json.JSONException unused) {
                appBrandSysConfigWC.f305848n = false;
                appBrandSysConfigWC.f305849o = false;
            }
            java.lang.String str = appBrandSysConfigWC.D;
            appBrandSysConfigWC.f305845h = true;
            appBrandSysConfigWC.f305846i = true;
            appBrandSysConfigWC.f305847m = true;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandSysConfigUtil", "operationInfo nil");
            } else {
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject(str).getJSONObject("bgKeepAlive");
                    appBrandSysConfigWC.f305845h = jSONObject2.optInt("music", 1) == 1;
                    appBrandSysConfigWC.f305846i = jSONObject2.optInt(ya.b.LOCATION, 1) == 1;
                    appBrandSysConfigWC.f305847m = jSONObject2.optInt("bluetooth", 1) == 1;
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandSysConfigUtil", "assembleBgKeepAliveConfigByOperationInfo operationInfo:%s", str);
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandSysConfigUtil", "assembleBgKeepAliveConfigByOperationInfo exp:%s", e17);
                }
            }
        }
        appBrandSysConfigWC.A = new com.tencent.luggage.sdk.config.LaunchWxaAppInfoParcelized(new com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle(this.field_jsapiInfo), null, this.field_opConfig, false, false, null, this.field_showThirdBusiTips, 0, com.tencent.mm.plugin.appbrand.appcache.o8.f75709a.b());
        appBrandSysConfigWC.f47298x0 = this.field_openId;
        r45.s54 s54Var = this.field_switchList;
        appBrandSysConfigWC.H1 = s54Var != null && s54Var.f385519d;
    }

    public final boolean v0(java.lang.String str) {
        r45.d25 d25Var = this.field_operationInfo;
        if (d25Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(d25Var.f372013d)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(this.field_operationInfo.f372013d);
                if (!jSONObject.has("jumpWeAppFromLongPressCodeBanInfo")) {
                    return false;
                }
                org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("jumpWeAppFromLongPressCodeBanInfo");
                if (jSONObject2.has(str)) {
                    return jSONObject2.optInt(str, 0) == 1;
                }
                return false;
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.LaunchWxaAppInfo", "[banjump] shouldBanJumpInternal fail", e17);
            }
        }
        return false;
    }
}
