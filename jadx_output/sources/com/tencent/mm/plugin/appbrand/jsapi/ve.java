package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes4.dex */
public class ve implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.JsApiUploadWeRunData$UploadMiniAppStepTask f83518d;

    public ve(com.tencent.mm.plugin.appbrand.jsapi.JsApiUploadWeRunData$UploadMiniAppStepTask jsApiUploadWeRunData$UploadMiniAppStepTask) {
        this.f83518d = jsApiUploadWeRunData$UploadMiniAppStepTask;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var.getType() != 1949) {
            return 0;
        }
        com.tencent.mm.plugin.appbrand.jsapi.JsApiUploadWeRunData$UploadMiniAppStepTask jsApiUploadWeRunData$UploadMiniAppStepTask = this.f83518d;
        if (i17 == 0 && i18 == 0) {
            jsApiUploadWeRunData$UploadMiniAppStepTask.f78656n = true;
        } else {
            jsApiUploadWeRunData$UploadMiniAppStepTask.f78656n = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUploadWeRunData", "UploadMiniAppStepTask fail: errType %d,errCode %d,errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        }
        jsApiUploadWeRunData$UploadMiniAppStepTask.c();
        return 0;
    }
}
