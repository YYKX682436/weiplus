package com.tencent.mm.plugin.appbrand.jsapi.fakenative;

/* JADX INFO: Access modifiers changed from: package-private */
@mk0.a
/* loaded from: classes4.dex */
public class f0 implements com.tencent.mm.ipcinvoker.j {
    private f0() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        com.tencent.mm.plugin.appbrand.jsapi.fakenative.w y07 = ((com.tencent.mm.plugin.appbrand.jsapi.fakenative.x) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.jsapi.fakenative.x.class)).y0(iPCString.f68406d);
        com.tencent.mm.plugin.appbrand.jsapi.fakenative.OpenBusinessViewUtil$BusinessAppInfoParcel openBusinessViewUtil$BusinessAppInfoParcel = new com.tencent.mm.plugin.appbrand.jsapi.fakenative.OpenBusinessViewUtil$BusinessAppInfoParcel();
        if (y07 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenBusinessViewUtil", "FetchBusinessAppInfoTask cacheKey:%s", y07.field_businessAppInfoKey);
            openBusinessViewUtil$BusinessAppInfoParcel.f80894d = y07.field_businessAppInfoKey;
            openBusinessViewUtil$BusinessAppInfoParcel.f80895e = y07.field_duration;
            openBusinessViewUtil$BusinessAppInfoParcel.f80897g = y07.field_respBuff;
            long j17 = y07.field_lastUpdateTime;
            openBusinessViewUtil$BusinessAppInfoParcel.f80896f = j17;
            if (com.tencent.mm.sdk.platformtools.t8.H1(j17) > openBusinessViewUtil$BusinessAppInfoParcel.f80895e) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OpenBusinessViewUtil", "cache is isExpired, should delete it");
                ((com.tencent.mm.plugin.appbrand.jsapi.fakenative.x) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.jsapi.fakenative.x.class)).d(iPCString.f68406d);
            }
        }
        rVar.a(openBusinessViewUtil$BusinessAppInfoParcel);
    }
}
