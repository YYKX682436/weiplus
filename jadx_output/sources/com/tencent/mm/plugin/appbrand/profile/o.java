package com.tencent.mm.plugin.appbrand.profile;

/* loaded from: classes7.dex */
public abstract class o implements com.tencent.mm.plugin.appbrand.profile.d {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f87695d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.e9 f87696e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJni f87697f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f87698g;

    /* renamed from: h, reason: collision with root package name */
    public double f87699h;

    /* renamed from: i, reason: collision with root package name */
    public double f87700i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f87701m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f87702n;

    public o() {
        int i17 = sj1.l.f408371a;
        int i18 = sj1.l.f408371a;
        this.f87695d = i18 == 0 || i18 == 3;
    }

    public static final void c(org.json.JSONArray jSONArray, org.json.JSONArray jSONArray2, org.json.JSONArray jSONArray3, org.json.JSONArray jSONArray4, com.luggage.trace.ProfileInfo profileInfo) {
        if (profileInfo != null) {
            java.util.Iterator<com.luggage.trace.Frame> it = profileInfo.getFrameList().iterator();
            while (it.hasNext()) {
                com.luggage.trace.Frame next = it.next();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, next.getName());
                jSONObject.put("category", next.getCategory());
                jSONObject.put("startTime", next.getStartTime());
                jSONObject.put("endTime", next.getEndTime());
                jSONObject.put("thread", next.getThread());
                jSONArray.put(jSONObject);
            }
            java.util.Iterator<com.luggage.trace.Event> it6 = profileInfo.getEventList().iterator();
            while (it6.hasNext()) {
                com.luggage.trace.Event next2 = it6.next();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, next2.getName());
                jSONObject2.put("category", next2.getCategory());
                jSONObject2.put("startTime", next2.getStartTime());
                jSONObject2.put("thread", next2.getThread());
                jSONArray2.put(jSONObject2);
            }
            java.util.Iterator<com.luggage.trace.ScreenShotInfo> it7 = profileInfo.getScreenShotInfoList().iterator();
            while (it7.hasNext()) {
                com.luggage.trace.ScreenShotInfo next3 = it7.next();
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("startTime", next3.getStartTime());
                jSONObject3.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, next3.getData());
                jSONArray3.put(jSONObject3);
            }
            java.util.Iterator<com.luggage.trace.MemoryUsages> it8 = profileInfo.getMemoryUsagesList().iterator();
            while (it8.hasNext()) {
                com.luggage.trace.MemoryUsages next4 = it8.next();
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                jSONObject4.put("startTime", next4.getStartTime());
                jSONObject4.put("allUsed", next4.getAllUsed());
                jSONObject4.put("jsHeapSizeUsed", next4.getJsHeapSizeUsed());
                jSONArray4.put(jSONObject4);
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.profile.d
    public void I() {
        sj1.b c17;
        com.tencent.mars.xlog.Log.i("Luggage.LuggageProfileManager", "profileStart");
        this.f87698g = true;
        this.f87699h = com.luggage.trace.TracerJni.INSTANCE.nativeCurrentMicroseconds();
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f87696e;
        if (e9Var != null) {
            if (!this.f87701m) {
                this.f87701m = true;
                return;
            }
            sj1.b c18 = sj1.l.c(java.lang.String.valueOf(e9Var.getComponentId()));
            if (c18 != null) {
                c18.i();
            }
            java.lang.String appId = e9Var.getAppId();
            if (appId == null || (c17 = sj1.l.c(appId)) == null) {
                return;
            }
            c17.i();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.profile.d
    public java.lang.String L1() {
        java.lang.String appId;
        com.luggage.trace.ProfileInfo profileInfo;
        com.luggage.trace.ProfileInfo profileInfo2;
        com.tencent.mars.xlog.Log.i("Luggage.LuggageProfileManager", "profileStop start");
        this.f87698g = false;
        this.f87700i = com.luggage.trace.TracerJni.INSTANCE.nativeCurrentMicroseconds();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        org.json.JSONArray jSONArray3 = new org.json.JSONArray();
        org.json.JSONArray jSONArray4 = new org.json.JSONArray();
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f87696e;
        java.lang.String str = "";
        if (e9Var != null) {
            sj1.b c17 = sj1.l.c(java.lang.String.valueOf(e9Var != null ? java.lang.Integer.valueOf(e9Var.getComponentId()) : null));
            if (c17 != null) {
                c17.e("");
                profileInfo2 = c17.h();
            } else {
                profileInfo2 = null;
            }
            c(jSONArray, jSONArray2, jSONArray3, jSONArray4, profileInfo2);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("profileStop profileInfo:");
            sb6.append(profileInfo2 != null ? profileInfo2.toJsonString() : null);
            com.tencent.mars.xlog.Log.i("Luggage.LuggageProfileManager", sb6.toString());
        }
        com.tencent.mm.plugin.appbrand.e9 e9Var2 = this.f87696e;
        if (e9Var2 != null && (appId = e9Var2.getAppId()) != null) {
            sj1.b c18 = sj1.l.c(appId);
            if (c18 != null) {
                c18.e("");
                profileInfo = c18.h();
            } else {
                profileInfo = null;
            }
            c(jSONArray, jSONArray2, jSONArray3, jSONArray4, profileInfo);
        }
        try {
            pb.d dVar = com.luggage.trace.ProfileInfo.Companion;
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.x2.f193072b;
            com.tencent.mm.plugin.appbrand.e9 e9Var3 = this.f87696e;
            java.lang.String appId2 = e9Var3 != null ? e9Var3.getAppId() : null;
            if (appId2 != null) {
                str = appId2;
            }
            java.lang.String str3 = ((com.tencent.mm.ipcinvoker.type.IPCString) com.tencent.mm.ipcinvoker.d0.f(str2, new com.tencent.mm.ipcinvoker.type.IPCString(str), com.tencent.mm.plugin.appbrand.profile.n.f87694a.getClass())).f68406d;
            com.tencent.mars.xlog.Log.i("Luggage.LuggageProfileManager", "mainProcessProfileInfo value:" + str3);
            kotlin.jvm.internal.o.f(str3, "apply(...)");
            c(jSONArray, jSONArray2, jSONArray3, jSONArray4, dVar.a(str3));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("Luggage.LuggageProfileManager", "mainProcessProfileInfo obtain fail e:" + e17);
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("frames", jSONArray);
        jSONObject.put("events", jSONArray2);
        jSONObject.put("startTime", this.f87699h);
        jSONObject.put("endTime", this.f87700i);
        jSONObject.put("screenshots", jSONArray3);
        jSONObject.put("memoryUsages", jSONArray4);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        com.tencent.mars.xlog.Log.i("Luggage.LuggageProfileManager", "profileStop result:".concat(jSONObject2));
        return jSONObject2;
    }

    public abstract void a(com.tencent.mm.plugin.appbrand.e9 e9Var);

    public abstract void b(java.lang.String str);

    public void d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("unInit componentId:");
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f87696e;
        sb6.append(e9Var != null ? java.lang.Integer.valueOf(e9Var.getComponentId()) : null);
        sb6.append(" appId:");
        com.tencent.mm.plugin.appbrand.e9 e9Var2 = this.f87696e;
        sb6.append(e9Var2 != null ? e9Var2.getAppId() : null);
        com.tencent.mars.xlog.Log.i("Luggage.LuggageProfileManager", sb6.toString());
        com.tencent.mm.plugin.appbrand.e9 e9Var3 = this.f87696e;
        sj1.b j17 = sj1.l.j(java.lang.String.valueOf(e9Var3 != null ? java.lang.Integer.valueOf(e9Var3.getComponentId()) : null));
        if (j17 != null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("this:");
            sb7.append(this);
            sb7.append(" unInit componentId:");
            com.tencent.mm.plugin.appbrand.e9 e9Var4 = this.f87696e;
            sb7.append(e9Var4 != null ? java.lang.Integer.valueOf(e9Var4.getComponentId()) : null);
            com.tencent.mars.xlog.Log.i("Luggage.LuggageProfileManager", sb7.toString());
            j17.release();
        }
        com.tencent.mm.plugin.appbrand.e9 e9Var5 = this.f87696e;
        sj1.b j18 = sj1.l.j(java.lang.String.valueOf(e9Var5 != null ? e9Var5.getAppId() : null));
        if (j18 != null) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("this:");
            sb8.append(this);
            sb8.append(" unInit appId:");
            com.tencent.mm.plugin.appbrand.e9 e9Var6 = this.f87696e;
            sb8.append(e9Var6 != null ? e9Var6.getAppId() : null);
            com.tencent.mars.xlog.Log.i("Luggage.LuggageProfileManager", sb8.toString());
            j18.release();
        }
        com.tencent.mars.xlog.Log.i("Luggage.LuggageProfileManager", "unInit done");
    }

    @Override // com.tencent.mm.plugin.appbrand.profile.b
    public void m(java.lang.String data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (this.f87695d) {
            if (!this.f87702n) {
                com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJni appBrandCommonBindingJni = this.f87697f;
                if (appBrandCommonBindingJni != null) {
                    appBrandCommonBindingJni.startInspectorOnJS(0);
                }
                this.f87702n = true;
            }
            com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJni appBrandCommonBindingJni2 = this.f87697f;
            if (appBrandCommonBindingJni2 != null) {
                appBrandCommonBindingJni2.sendInspectorMsg(0, data);
            }
            com.tencent.mars.xlog.Log.i("Luggage.LuggageProfileManager", "sendInspectMessage msg:".concat(data));
        }
    }
}
