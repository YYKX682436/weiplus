package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes12.dex */
final class JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultTask extends com.tencent.mm.plugin.appbrand.ipc.v {
    private JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultTask() {
    }

    private void d(com.tencent.mm.autogen.events.DealQBarStrEvent dealQBarStrEvent, com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest) {
        java.lang.String str;
        int i17;
        r45.vm4 vm4Var = new r45.vm4();
        str = jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest.f78621e;
        vm4Var.f388360d = str;
        i17 = jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest.f78623g;
        vm4Var.f388361e = i17;
        ((jd0.d2) ((kd0.s2) i95.n0.c(kd0.s2.class))).Ai(dealQBarStrEvent, 0, vm4Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest) {
        com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult;
        com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult2;
        com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult3;
        com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult4;
        com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult5;
        java.lang.String str;
        java.lang.String str2;
        int i17;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        int i18;
        java.lang.String str6;
        java.lang.String str7;
        if (!(appBrandProxyUIProcessTask$ProcessRequest instanceof com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShowImageOperateSheet", "IPCProcessQRCodeResultTask request instance not valid");
            return;
        }
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.NotifyDealQBarStrResultEvent>(getActivityContext()) { // from class: com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultTask.1
            {
                this.__eventId = 1280295539;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.NotifyDealQBarStrResultEvent notifyDealQBarStrResultEvent) {
                com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultTask jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultTask = com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultTask.this;
                com.tencent.mm.ui.MMActivity activityContext = jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultTask.getActivityContext();
                am.kl klVar = notifyDealQBarStrResultEvent.f54539g;
                if (activityContext == klVar.f7167b) {
                    int i19 = klVar.f7168c;
                    if (i19 != 0) {
                        if (i19 != 1 && i19 != 2) {
                            if (i19 == 3) {
                                android.os.Bundle bundle = klVar.f7169d;
                                if (!(bundle != null && bundle.getBoolean("key_scan_qr_code_result"))) {
                                    jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultTask.finishProcess(null);
                                    dead();
                                }
                            }
                        }
                    }
                    jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultTask.finishProcess(null);
                    dead();
                }
                return false;
            }
        }.alive();
        com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest = (com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest) appBrandProxyUIProcessTask$ProcessRequest;
        com.tencent.mm.autogen.events.DealQBarStrEvent dealQBarStrEvent = new com.tencent.mm.autogen.events.DealQBarStrEvent();
        com.tencent.mm.ui.MMActivity activityContext = getActivityContext();
        am.r3 r3Var = dealQBarStrEvent.f54079g;
        r3Var.f7781b = activityContext;
        jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult = jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest.f78620d;
        r3Var.f7780a = jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult.f78644d;
        jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult2 = jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest.f78620d;
        r3Var.f7782c = jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult2.f78646f;
        jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult3 = jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest.f78620d;
        r3Var.f7783d = jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult3.f78647g;
        r3Var.f7788i = 44;
        jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult4 = jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest.f78620d;
        r3Var.f7792m = jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult4.f78645e;
        r3Var.f7794o = true;
        jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult5 = jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest.f78620d;
        r3Var.f7796q = jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult5.f78648h;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("stat_scene", 6);
        str = jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest.f78621e;
        bundle.putString("stat_app_id", str);
        str2 = jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest.f78622f;
        bundle.putString("stat_url", str2);
        i17 = jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest.f78626m;
        bundle.putInt("stat_geta8key_msg_scene", i17);
        str3 = jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest.f78624h;
        bundle.putString("stat_send_msg_user", str3);
        str4 = jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest.f78625i;
        bundle.putString("stat_chat_talker_username", str4);
        str5 = jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest.f78627n;
        bundle.putString("stat_msg_id", str5);
        i18 = jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest.f78628o;
        bundle.putInt("stat_scene", i18);
        str6 = jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest.f78629p;
        bundle.putString("stat_scene_note", str6);
        str7 = jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest.f78630q;
        bundle.putString("weapp_username", str7);
        r3Var.f7791l = bundle;
        d(dealQBarStrEvent, jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest);
        dealQBarStrEvent.e();
    }
}
