package com.tencent.mm.plugin.appbrand.backgroundfetch;

@j95.b(dependencies = {com.tencent.mm.plugin.appbrand.app.PluginAppBrand.class})
/* loaded from: classes7.dex */
public class l extends i95.w implements com.tencent.mm.plugin.appbrand.backgroundfetch.s1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f76849d = new java.util.concurrent.ConcurrentHashMap(10);

    @Override // com.tencent.mm.plugin.appbrand.backgroundfetch.s1
    public long D4(java.lang.String str, int i17) {
        com.tencent.mm.ipcinvoker.type.IPCLong iPCLong = (com.tencent.mm.ipcinvoker.type.IPCLong) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC$WxappIdentity(str, i17), com.tencent.mm.plugin.appbrand.backgroundfetch.o.class);
        if (iPCLong != null) {
            return iPCLong.f68405d;
        }
        return 0L;
    }

    @Override // com.tencent.mm.plugin.appbrand.backgroundfetch.s1
    public com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel E4(final java.lang.String str, final int i17) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f76849d;
        return concurrentHashMap == null ? (com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC$WxappIdentity(str, i17), com.tencent.mm.plugin.appbrand.backgroundfetch.n.class) : (com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel) concurrentHashMap.computeIfAbsent(new com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC$WxappIdentity(str, i17), new java.util.function.Function() { // from class: com.tencent.mm.plugin.appbrand.backgroundfetch.l$$a
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.tencent.mm.plugin.appbrand.backgroundfetch.l.this.getClass();
                return (com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC$WxappIdentity(str, i17), com.tencent.mm.plugin.appbrand.backgroundfetch.n.class);
            }
        });
    }

    @Override // com.tencent.mm.plugin.appbrand.backgroundfetch.s1
    public boolean L3(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18, long j17, int i19) {
        boolean z17 = false;
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC$WxappParams(str, i17, str2, str3, str4, i18, j17, i19), com.tencent.mm.plugin.appbrand.backgroundfetch.p.class);
        if (iPCBoolean != null && iPCBoolean.f68400d) {
            z17 = true;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f76849d;
        if (concurrentHashMap != null) {
            if (z17) {
                com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel appBrandBackgroundFetchDataParcel = new com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel();
                appBrandBackgroundFetchDataParcel.f76777d = str;
                appBrandBackgroundFetchDataParcel.f76778e = i17;
                appBrandBackgroundFetchDataParcel.f76781h = str2;
                appBrandBackgroundFetchDataParcel.f76779f = str3;
                appBrandBackgroundFetchDataParcel.f76780g = str4;
                appBrandBackgroundFetchDataParcel.f76782i = i18;
                appBrandBackgroundFetchDataParcel.f76783m = j17;
                appBrandBackgroundFetchDataParcel.f76784n = i19;
                concurrentHashMap.put(new com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC$WxappIdentity(str, i17), appBrandBackgroundFetchDataParcel);
            } else {
                concurrentHashMap.remove(new com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC$WxappIdentity(str, i17));
            }
        }
        return z17;
    }

    public void wi(final java.lang.String str, final int i17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f76849d;
        if (concurrentHashMap != null) {
            concurrentHashMap.compute(new com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC$WxappIdentity(str, i17), new java.util.function.BiFunction() { // from class: com.tencent.mm.plugin.appbrand.backgroundfetch.l$$c
                @Override // java.util.function.BiFunction
                public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                    com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel appBrandBackgroundFetchDataParcel = (com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel) obj2;
                    com.tencent.mm.plugin.appbrand.backgroundfetch.l.this.getClass();
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.w9.f193053a;
                    java.lang.String str3 = str;
                    int i18 = i17;
                    com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel appBrandBackgroundFetchDataParcel2 = (com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel) com.tencent.mm.ipcinvoker.extension.l.b(str2, new com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC$WxappIdentity(str3, i18), com.tencent.mm.plugin.appbrand.backgroundfetch.n.class);
                    if (appBrandBackgroundFetchDataParcel2 == null) {
                        return appBrandBackgroundFetchDataParcel;
                    }
                    if (appBrandBackgroundFetchDataParcel != null && appBrandBackgroundFetchDataParcel.f76783m >= appBrandBackgroundFetchDataParcel2.f76783m) {
                        return appBrandBackgroundFetchDataParcel;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageIPC", "warmUpCache, updated username:%s, type:%d, time:%d", str3, java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(appBrandBackgroundFetchDataParcel2.f76783m));
                    return appBrandBackgroundFetchDataParcel2;
                }
            });
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.backgroundfetch.s1
    public boolean z6(java.lang.String str, int i17) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f76849d;
        if (concurrentHashMap != null) {
            concurrentHashMap.remove(new com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC$WxappIdentity(str, i17));
        }
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC$WxappIdentity(str, i17), com.tencent.mm.plugin.appbrand.backgroundfetch.m.class);
        return iPCBoolean != null && iPCBoolean.f68400d;
    }
}
