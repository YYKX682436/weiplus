package com.tencent.mm.plugin.appbrand.jsapi;

@mk0.a
/* loaded from: classes7.dex */
final class ee implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeParam, com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult> {

    /* renamed from: d, reason: collision with root package name */
    public boolean f80810d = false;

    private ee() {
    }

    public final void a(final com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeParam jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeParam, final com.tencent.mm.ipcinvoker.r rVar, boolean z17) {
        java.lang.String str = z17 ? jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeParam.f78643e : jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeParam.f78642d;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowImageOperateSheet", "doRecognizeLogic mIsBakPathUsed:%b useBak:%b path:%s", java.lang.Boolean.valueOf(this.f80810d), java.lang.Boolean.valueOf(z17), str);
        this.f80810d = z17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            if (rVar != null) {
                rVar.a(null);
                return;
            }
            return;
        }
        final ik1.b0 b0Var = new ik1.b0();
        final ik1.b0 b0Var2 = new ik1.b0();
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        final java.lang.String str2 = str;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent>(this, a0Var) { // from class: com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognize$1
            {
                this.__eventId = 812146647;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent) {
                com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent2 = recogQBarOfImageFileResultEvent;
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowImageOperateSheet", "IPCQRCodeRecognize callback");
                if (b0Var.f291824a != null) {
                    ((com.tencent.mm.sdk.event.IListener) b0Var.f291824a).dead();
                }
                if (b0Var2.f291824a != null) {
                    ((com.tencent.mm.sdk.event.IListener) b0Var2.f291824a).dead();
                }
                if (!str2.equals(recogQBarOfImageFileResultEvent2.f54661g.f6368a)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.JsApiShowImageOperateSheet", "IPCQRCodeRecognize file path no same recognizeFilePath:%s filePath:%s", str2, recogQBarOfImageFileResultEvent2.f54661g.f6368a);
                    return false;
                }
                com.tencent.mm.pluginsdk.ui.tools.s6 s6Var = com.tencent.mm.pluginsdk.ui.tools.s6.f191898a;
                java.lang.String e17 = s6Var.e(recogQBarOfImageFileResultEvent2);
                int c17 = s6Var.c(recogQBarOfImageFileResultEvent2);
                int d17 = s6Var.d(recogQBarOfImageFileResultEvent2);
                if (rVar == null) {
                    return false;
                }
                com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult = new com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult();
                jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult.f78644d = e17;
                jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult.f78645e = recogQBarOfImageFileResultEvent2.f54661g.f6368a;
                jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult.f78646f = c17;
                jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult.f78647g = d17;
                jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult.f78648h = com.tencent.mm.pluginsdk.ui.tools.s6.b(recogQBarOfImageFileResultEvent2);
                rVar.a(jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult);
                return false;
            }
        };
        b0Var.f291824a = iListener;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent> iListener2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognize$2
            {
                this.__eventId = 1700407223;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent recogQBarOfImageFileFailedEvent) {
                com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent recogQBarOfImageFileFailedEvent2 = recogQBarOfImageFileFailedEvent;
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowImageOperateSheet", "IPCQRCodeRecognize failed : mIsBakPathUsed:%b", java.lang.Boolean.valueOf(com.tencent.mm.plugin.appbrand.jsapi.ee.this.f80810d));
                if (b0Var.f291824a != null) {
                    ((com.tencent.mm.sdk.event.IListener) b0Var.f291824a).dead();
                }
                if (b0Var2.f291824a != null) {
                    ((com.tencent.mm.sdk.event.IListener) b0Var2.f291824a).dead();
                }
                if (!str2.equals(recogQBarOfImageFileFailedEvent2.f54660g.f6278a)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.JsApiShowImageOperateSheet", "IPCQRCodeRecognize failed : file path no same recognizeFilePath:%s filePath:%s", str2, recogQBarOfImageFileFailedEvent2.f54660g.f6278a);
                    return false;
                }
                com.tencent.mm.plugin.appbrand.jsapi.ee eeVar = com.tencent.mm.plugin.appbrand.jsapi.ee.this;
                if (eeVar.f80810d) {
                    return false;
                }
                eeVar.a(jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeParam, rVar, true);
                return false;
            }
        };
        b0Var2.f291824a = iListener2;
        iListener.alive();
        iListener2.alive();
        com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent recogQBarOfImageFileEvent = new com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent();
        recogQBarOfImageFileEvent.f54659g.f6174a = java.lang.System.currentTimeMillis();
        am.aq aqVar = recogQBarOfImageFileEvent.f54659g;
        aqVar.f6175b = str;
        aqVar.f6177d = com.tencent.mm.plugin.appbrand.jsapi.md.f81603j;
        recogQBarOfImageFileEvent.e();
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeParam jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeParam = (com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeParam) obj;
        if (jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeParam == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShowImageOperateSheet", "IPCQRCodeRecognize data null");
        } else {
            a(jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeParam, rVar, false);
        }
    }
}
