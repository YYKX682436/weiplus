package com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch;

@mk0.a
/* loaded from: classes.dex */
class b implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.ipcinvoker.type.IPCString, com.tencent.mm.ipcinvoker.type.IPCString> {
    private b() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataTokenParcel appBrandBackgroundFetchDataTokenParcel;
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        if (iPCString != null && !com.tencent.mm.sdk.platformtools.t8.K0(iPCString.f68406d)) {
            java.lang.String f17 = k91.k4.f(iPCString.f68406d);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(f17) && i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundfetch.t1.class) != null && (appBrandBackgroundFetchDataTokenParcel = ((com.tencent.mm.plugin.appbrand.backgroundfetch.t1) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundfetch.t1.class)).get(f17)) != null && !com.tencent.mm.sdk.platformtools.t8.K0(appBrandBackgroundFetchDataTokenParcel.f76796e)) {
                rVar.a(new com.tencent.mm.ipcinvoker.type.IPCString(appBrandBackgroundFetchDataTokenParcel.f76796e));
                return;
            }
        }
        rVar.a(new com.tencent.mm.ipcinvoker.type.IPCString());
    }
}
