package com.tencent.mm.plugin.appbrand.jsapi.scanner;

/* loaded from: classes7.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiScanCode$GetA8KeyTask f82962d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f82963e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82964f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.scanner.m f82965g;

    public l(com.tencent.mm.plugin.appbrand.jsapi.scanner.m mVar, com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiScanCode$GetA8KeyTask jsApiScanCode$GetA8KeyTask, java.util.HashMap hashMap, java.lang.String str) {
        this.f82965g = mVar;
        this.f82962d = jsApiScanCode$GetA8KeyTask;
        this.f82963e = hashMap;
        this.f82964f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f82962d.x();
        com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiScanCode$GetA8KeyTask jsApiScanCode$GetA8KeyTask = this.f82962d;
        if (jsApiScanCode$GetA8KeyTask.f82937g == 26) {
            android.net.Uri parse = android.net.Uri.parse(jsApiScanCode$GetA8KeyTask.f82938h);
            if (this.f82965g.f82966a.t3().u0().f47278x.equals(parse.getQueryParameter(dm.i4.COL_USERNAME))) {
                java.lang.String queryParameter = parse.getQueryParameter(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                java.lang.String decode = java.net.URLDecoder.decode(queryParameter == null ? "" : queryParameter);
                this.f82963e.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, decode);
                com.tencent.mm.plugin.appbrand.jsapi.scanner.m mVar = this.f82965g;
                com.tencent.mm.plugin.appbrand.jsapi.scanner.p pVar = mVar.f82968c;
                com.tencent.mm.plugin.appbrand.service.c0 c0Var = mVar.f82966a;
                java.lang.String str = this.f82964f;
                pVar.getClass();
                com.tencent.mm.plugin.appbrand.o6 t37 = c0Var.t3();
                if (t37 != null && !android.text.TextUtils.isEmpty(queryParameter) && !android.text.TextUtils.isEmpty(decode) && !android.text.TextUtils.equals(queryParameter, decode)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiScanCode", "checkDecodeError decodePath=%s, doubleDecodePath=%s, result=%s", queryParameter, decode, str);
                    com.tencent.mm.autogen.mmdata.rpt.WeappJsApiScanCodePathErrorStruct weappJsApiScanCodePathErrorStruct = new com.tencent.mm.autogen.mmdata.rpt.WeappJsApiScanCodePathErrorStruct();
                    weappJsApiScanCodePathErrorStruct.f62932d = weappJsApiScanCodePathErrorStruct.b("AppId", t37.f74803n, true);
                    weappJsApiScanCodePathErrorStruct.f62933e = weappJsApiScanCodePathErrorStruct.b("AppUsername", t37.n0(), true);
                    weappJsApiScanCodePathErrorStruct.f62934f = t37.d2();
                    weappJsApiScanCodePathErrorStruct.f62935g = t37.f74805p.f77281g;
                    weappJsApiScanCodePathErrorStruct.f62936h = weappJsApiScanCodePathErrorStruct.b("InstanceId", java.lang.String.valueOf(t37.hashCode()), true);
                    weappJsApiScanCodePathErrorStruct.f62937i = weappJsApiScanCodePathErrorStruct.b("decodePath", queryParameter, true);
                    weappJsApiScanCodePathErrorStruct.f62938j = weappJsApiScanCodePathErrorStruct.b("doubleDecodePath", decode, true);
                    weappJsApiScanCodePathErrorStruct.f62939k = weappJsApiScanCodePathErrorStruct.b("result", str, true);
                    weappJsApiScanCodePathErrorStruct.k();
                }
            }
        }
        com.tencent.mm.plugin.appbrand.jsapi.scanner.m mVar2 = this.f82965g;
        mVar2.f82966a.a(mVar2.f82967b, mVar2.f82968c.p("ok", this.f82963e));
    }
}
