package com.tencent.mm.plugin.appbrand.jsapi.scanner;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/scanner/e;", "Lcom/tencent/mm/ipcinvoker/i;", "Lcom/tencent/mm/plugin/appbrand/jsapi/scanner/JsApiDetectImageCode$CheckWXAppInfoDataList;", "Lcom/tencent/mm/plugin/appbrand/jsapi/scanner/JsApiDetectImageCode$A8KeyRespDataList;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes7.dex */
public final class e implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiDetectImageCode$CheckWXAppInfoDataList, com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiDetectImageCode$A8KeyRespDataList> {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiDetectImageCode$CheckWXAppInfoDataList jsApiDetectImageCode$CheckWXAppInfoDataList = (com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiDetectImageCode$CheckWXAppInfoDataList) obj;
        if (jsApiDetectImageCode$CheckWXAppInfoDataList == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiDetectImageCode", "BatchGetA8KeyIPCTask invoke data is null");
            if (rVar != null) {
                rVar.a(new com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiDetectImageCode$A8KeyRespDataList(new java.util.ArrayList()));
                return;
            }
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("BatchGetA8KeyIPCTask invoke size=");
        java.util.List<com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiDetectImageCode$CheckWXAppInfoData> list = jsApiDetectImageCode$CheckWXAppInfoDataList.f82935d;
        sb6.append(list.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiDetectImageCode", sb6.toString());
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        for (com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiDetectImageCode$CheckWXAppInfoData jsApiDetectImageCode$CheckWXAppInfoData : list) {
            arrayList.add(new com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiDetectImageCode$A8KeyRespData(-1, ""));
        }
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(list.size());
        int i17 = 0;
        for (java.lang.Object obj2 : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiDetectImageCode$CheckWXAppInfoData jsApiDetectImageCode$CheckWXAppInfoData2 = (com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiDetectImageCode$CheckWXAppInfoData) obj2;
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiDetectImageCode", "it index=" + i17 + ", result=" + jsApiDetectImageCode$CheckWXAppInfoData2.f82932d);
            w60.k wi6 = ((v60.u) ((w60.j) i95.n0.c(w60.j.class))).wi(jsApiDetectImageCode$CheckWXAppInfoData2.f82932d, null, 36, 0, jsApiDetectImageCode$CheckWXAppInfoData2.f82933e, jsApiDetectImageCode$CheckWXAppInfoData2.f82934f, null, o45.cg.a(), new byte[0]);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("RunCgi index=");
            sb7.append(i17);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiDetectImageCode", sb7.toString());
            com.tencent.mm.modelbase.z2.d(((com.tencent.mm.modelsimple.k0) wi6).f71356e, new com.tencent.mm.plugin.appbrand.jsapi.scanner.d(arrayList, wi6, i17, atomicInteger, rVar), true);
            i17 = i18;
        }
    }
}
