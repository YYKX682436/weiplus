package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class qd implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.rd f82876d;

    public qd(com.tencent.mm.plugin.appbrand.jsapi.rd rdVar) {
        this.f82876d = rdVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        final com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult = (com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult) obj;
        if (jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiShowImageOperateSheet", "processRecognizeQRCodeLogic data null");
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.K0(jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult.f78644d)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiShowImageOperateSheet", "processRecognizeQRCodeLogic result nil");
                return;
            }
            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.jsapi.qd$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.appbrand.jsapi.md mdVar = com.tencent.mm.plugin.appbrand.jsapi.qd.this.f82876d.f82904g;
                    com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult2 = jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult;
                    mdVar.f81604a = jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult2;
                    com.tencent.mm.ui.widget.dialog.k0 k0Var = mdVar.f81605b;
                    if (k0Var != null && k0Var.i()) {
                        mdVar.d();
                    }
                    int i17 = jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult2.f78646f;
                    java.lang.String str = jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult2.f78644d;
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowImageOperateSheet", "processGetCodeInfo");
                    ((jd0.z1) ((kd0.l2) i95.n0.c(kd0.l2.class))).getClass();
                    if (!com.tencent.mm.plugin.scanner.z0.e(i17, str)) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.JsApiShowImageOperateSheet", "processGetCodeInfo is not customCode, return, codeType:" + i17);
                        return;
                    }
                    kd0.p2 p2Var = mdVar.f81610g;
                    if (p2Var == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.JsApiShowImageOperateSheet", "processGetCodeInfo sheetItemLogic == null , return");
                        return;
                    }
                    java.lang.String appId = mdVar.f81606c.getAppId();
                    kd0.f2 f2Var = new kd0.f2(str);
                    f2Var.f306635b = 5;
                    f2Var.f306636c = appId;
                    ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) p2Var).i(i17, f2Var);
                }
            });
        }
    }
}
