package com.tencent.mm.plugin.appbrand.backgroundfetch;

/* loaded from: classes7.dex */
public class p0 implements com.tencent.mm.plugin.appbrand.ipc.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f76886a;

    public p0(java.lang.String str) {
        this.f76886a = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.l0
    public void a(java.lang.Object obj) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        if (obj instanceof com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel) {
            final com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel appBrandBackgroundFetchDataParcel = (com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel) obj;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandOnBackgroundFetchDataEvent", "app received data, appId:%s, type:%d, time:%d", this.f76886a, java.lang.Integer.valueOf(appBrandBackgroundFetchDataParcel.f76778e), java.lang.Long.valueOf(appBrandBackgroundFetchDataParcel.f76783m));
            com.tencent.mm.plugin.appbrand.backgroundfetch.s1 s1Var = (com.tencent.mm.plugin.appbrand.backgroundfetch.s1) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundfetch.s1.class);
            if (s1Var instanceof com.tencent.mm.plugin.appbrand.backgroundfetch.l) {
                com.tencent.mm.plugin.appbrand.backgroundfetch.l lVar = (com.tencent.mm.plugin.appbrand.backgroundfetch.l) s1Var;
                lVar.getClass();
                if (appBrandBackgroundFetchDataParcel != null && !android.text.TextUtils.isEmpty(appBrandBackgroundFetchDataParcel.f76777d) && (concurrentHashMap = lVar.f76849d) != null) {
                    concurrentHashMap.compute(new com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC$WxappIdentity(appBrandBackgroundFetchDataParcel.f76777d, appBrandBackgroundFetchDataParcel.f76778e), new java.util.function.BiFunction() { // from class: com.tencent.mm.plugin.appbrand.backgroundfetch.l$$b
                        @Override // java.util.function.BiFunction
                        public final java.lang.Object apply(java.lang.Object obj2, java.lang.Object obj3) {
                            com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel appBrandBackgroundFetchDataParcel2 = (com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel) obj3;
                            com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel appBrandBackgroundFetchDataParcel3 = com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel.this;
                            if (appBrandBackgroundFetchDataParcel2 != null && appBrandBackgroundFetchDataParcel2.f76783m >= appBrandBackgroundFetchDataParcel3.f76783m) {
                                return appBrandBackgroundFetchDataParcel2;
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageIPC", "resetCache, updated username:%s, type:%d, time:%d", appBrandBackgroundFetchDataParcel3.f76777d, java.lang.Integer.valueOf(appBrandBackgroundFetchDataParcel3.f76778e), java.lang.Long.valueOf(appBrandBackgroundFetchDataParcel3.f76783m));
                            return appBrandBackgroundFetchDataParcel3;
                        }
                    });
                }
            }
            java.lang.String str = this.f76886a;
            if (appBrandBackgroundFetchDataParcel == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandOnBackgroundFetchDataEvent", "dispatch, parcel is null or appid is null");
                return;
            }
            java.lang.String str2 = appBrandBackgroundFetchDataParcel.f76777d;
            int i17 = appBrandBackgroundFetchDataParcel.f76778e;
            java.lang.String str3 = appBrandBackgroundFetchDataParcel.f76781h;
            java.lang.String str4 = appBrandBackgroundFetchDataParcel.f76779f;
            java.lang.String str5 = appBrandBackgroundFetchDataParcel.f76780g;
            int i18 = appBrandBackgroundFetchDataParcel.f76782i;
            final long j17 = appBrandBackgroundFetchDataParcel.f76783m;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandOnBackgroundFetchDataEvent", "username or data is null");
                return;
            }
            final com.tencent.mm.plugin.appbrand.o6 b17 = com.tencent.mm.plugin.appbrand.l.b(str);
            if (b17 == null || b17.S || b17.L0()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandOnBackgroundFetchDataEvent", "dispatch but runtime is null or destroyed, username:%s, appId:%s, fetchType:%d, updateTime:%d", str2, str, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("timeStamp", java.lang.Long.valueOf(j17));
            hashMap.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, str4);
            hashMap.put("query", str5);
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(i18));
            hashMap.put("fetchedData", str3);
            hashMap.put("fetchType", i17 == 0 ? "pre" : "peroid");
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandOnBackgroundFetchDataEvent", "AppBrandOnBackgroundFetchDataEvent dispatch to runtime, username:%s, appId:%s, fetch type:%d, timestamp:%d", str2, str, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
            final com.tencent.mm.plugin.appbrand.backgroundfetch.r0 r0Var = new com.tencent.mm.plugin.appbrand.backgroundfetch.r0();
            r0Var.t(hashMap);
            b17.I1(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.o6$$s
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.appbrand.o6 o6Var = com.tencent.mm.plugin.appbrand.o6.this;
                    if (o6Var.Q2 == null) {
                        o6Var.Q2 = new android.util.LongSparseArray();
                    }
                    android.util.LongSparseArray longSparseArray = o6Var.Q2;
                    long j18 = j17;
                    if (longSparseArray.indexOfKey(j18) >= 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "notifyBackgroundFetchDataThrottling timestamp:%d dispatched, skip", java.lang.Long.valueOf(j18));
                        return;
                    }
                    com.tencent.mm.plugin.appbrand.service.c0 C0 = o6Var.C0();
                    com.tencent.mm.plugin.appbrand.backgroundfetch.r0 r0Var2 = r0Var;
                    r0Var2.u(C0);
                    r0Var2.m();
                    o6Var.Q2.put(j18, o6Var);
                }
            });
        }
    }
}
