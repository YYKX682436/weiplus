package com.tencent.mm.plugin.appbrand.launching;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/launching/IPCUpdateStateNotifier$UpdateStateArgsParcelized;", "kotlin.jvm.PlatformType", "args", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "callback", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/plugin/appbrand/launching/IPCUpdateStateNotifier$UpdateStateArgsParcelized;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class o7<InputType, ResultType> implements com.tencent.mm.ipcinvoker.i {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.launching.o7 f84859d = new com.tencent.mm.plugin.appbrand.launching.o7();

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.launching.IPCUpdateStateNotifier$UpdateStateArgsParcelized iPCUpdateStateNotifier$UpdateStateArgsParcelized = (com.tencent.mm.plugin.appbrand.launching.IPCUpdateStateNotifier$UpdateStateArgsParcelized) obj;
        java.lang.String str = iPCUpdateStateNotifier$UpdateStateArgsParcelized.f84436d;
        final int i17 = iPCUpdateStateNotifier$UpdateStateArgsParcelized.f84437e;
        final java.lang.String str2 = iPCUpdateStateNotifier$UpdateStateArgsParcelized.f84438f;
        final ne1.j jVar = iPCUpdateStateNotifier$UpdateStateArgsParcelized.f84439g;
        final java.lang.String str3 = iPCUpdateStateNotifier$UpdateStateArgsParcelized.f84440h;
        final java.lang.String str4 = iPCUpdateStateNotifier$UpdateStateArgsParcelized.f84441i;
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo = iPCUpdateStateNotifier$UpdateStateArgsParcelized.f84442m;
        final com.tencent.mm.plugin.appbrand.o6 b17 = com.tencent.mm.plugin.appbrand.l.b(str);
        if (b17 != null) {
            b17.K("notifyUpdateState(%s) enqueue", jVar);
            final u65.a aVar = new u65.a(2, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.o6$$z
                @Override // java.lang.Runnable
                public final void run() {
                    java.lang.String str5 = str2;
                    java.lang.String str6 = str3;
                    java.lang.String str7 = str4;
                    boolean z17 = com.tencent.mm.plugin.appbrand.o6.f86162n3;
                    com.tencent.mm.plugin.appbrand.o6 o6Var = com.tencent.mm.plugin.appbrand.o6.this;
                    boolean N0 = o6Var.N0();
                    ne1.j jVar2 = jVar;
                    if (N0) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandRuntimeWC", "notifyUpdateState(%s) skip, when enableWxAssistant", jVar2);
                        return;
                    }
                    com.tencent.mm.plugin.appbrand.service.c0 C0 = o6Var.C0();
                    if (C0 == null) {
                        jVar2.getClass();
                    } else {
                        java.lang.String str8 = jVar2.f336525d;
                        java.lang.String appId = C0.getAppId();
                        java.lang.Integer valueOf = java.lang.Integer.valueOf(C0.hashCode());
                        int i18 = i17;
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Version.UpdateState[appversion]", "dispatch(%s), appId:%s, service:%d, intVersion:%d, stringVersion:%s, passThroughInfo:%s, stablePassThroughInfo:%s", str8, appId, valueOf, java.lang.Integer.valueOf(i18), str5, str6, str7);
                        java.util.HashMap hashMap = new java.util.HashMap(1);
                        java.lang.String str9 = jVar2.f336525d;
                        hashMap.put("state", str9);
                        try {
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            if (!android.text.TextUtils.isEmpty(str6)) {
                                jSONObject.put("passThroughInfo", new org.json.JSONObject(str6));
                            }
                            if (!android.text.TextUtils.isEmpty(str7)) {
                                jSONObject.put("stablePassThroughInfo", new org.json.JSONObject(str7));
                            }
                            if (jSONObject.length() > 0) {
                                hashMap.put("appContactInfo", jSONObject);
                            }
                        } catch (org.json.JSONException e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Version.UpdateState[appversion]", "dispatch(%s), appId:%s, service:%d, put passThroughInfo get Exception:%s", str9, C0.getAppId(), java.lang.Integer.valueOf(C0.hashCode()), e17);
                        }
                        hashMap.put("appVersion", java.lang.Integer.valueOf(i18));
                        hashMap.put("customVersion", str5);
                        ne1.i iVar = new ne1.i(null);
                        iVar.u(C0);
                        iVar.t(hashMap);
                        iVar.m();
                    }
                    if (ne1.j.UPDATE_READY == jVar2) {
                        com.tencent.mm.plugin.appbrand.n6 n6Var = (com.tencent.mm.plugin.appbrand.n6) o6Var.O2.b();
                        if (n6Var.f86028b.getAndSet(true) || !n6Var.f86027a.get()) {
                            return;
                        }
                        ((com.tencent.mm.plugin.appbrand.n6$$a) n6Var.f86030d).run();
                    }
                }
            });
            b17.I1(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.o6$$a0
                @Override // java.lang.Runnable
                public final void run() {
                    u65.a.this.b();
                }
            });
            if (ne1.j.UPDATE_READY == jVar && wxaPkgWrappingInfo != null && com.tencent.mm.plugin.appbrand.jsruntime.h1.a(false)) {
                com.tencent.mm.plugin.appbrand.service.i.a(b17.f74803n, wxaPkgWrappingInfo, com.tencent.mm.plugin.appbrand.utils.e3.f90415a, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.o6$$a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        u65.a.this.b();
                    }
                });
            } else {
                aVar.b();
            }
        }
        if (rVar != null) {
            uk0.a.a(rVar);
        }
    }
}
