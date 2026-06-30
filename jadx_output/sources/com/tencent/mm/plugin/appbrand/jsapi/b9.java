package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class b9 extends ut3.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.e9 f79835d;

    public b9(com.tencent.mm.plugin.appbrand.jsapi.e9 e9Var) {
        this.f79835d = e9Var;
    }

    @Override // ut3.d
    public void k3(android.content.Context context, com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel, android.os.Bundle bundle) {
        boolean z17;
        java.lang.String str;
        java.lang.String str2 = captureDataManager$CaptureVideoNormalModel != null ? captureDataManager$CaptureVideoNormalModel.f155662f : null;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str2);
        com.tencent.mm.plugin.appbrand.jsapi.e9 e9Var = this.f79835d;
        if (K0) {
            e9Var.getMResult().f78583e = null;
            z17 = false;
        } else {
            com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenCameraForImageSearch$ChooseRequest mRequest = e9Var.getMRequest();
            if (mRequest == null || (str = mRequest.getExtras()) == null) {
                str = "{}";
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenCameraForImageSearch$ChooseResult mResult = e9Var.getMResult();
            com.tencent.mm.plugin.websearch.api.circlesearch.CircleSearchInfo a17 = com.tencent.mm.plugin.websearch.api.circlesearch.CircleSearchInfo.f181442u.a(jSONObject);
            a17.f181455s = str2;
            mResult.f78583e = a17;
            kotlin.jvm.internal.o.d(captureDataManager$CaptureVideoNormalModel);
            java.lang.Integer num = (java.lang.Integer) captureDataManager$CaptureVideoNormalModel.a().b("KEY_MEDIA_SOURCE_INT", -1);
            z17 = true;
            if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 2)) {
                z17 = false;
            }
            e9Var.getMResult().f78582d = z17 ? 7 : 6;
            int i17 = e9Var.getMResult().f78582d;
            com.tencent.mm.plugin.websearch.api.circlesearch.CircleSearchInfo circleSearchInfo = e9Var.getMResult().f78583e;
            kotlin.jvm.internal.o.d(circleSearchInfo);
            java.util.Map b17 = circleSearchInfo.b();
            tg0.f1 f1Var = (tg0.f1) i95.n0.c(tg0.f1.class);
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            ((sg0.e) f1Var).Ai(context2, 5, i17, b17);
        }
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            activity.finish();
            if (z17) {
                activity.overridePendingTransition(0, com.tencent.mm.R.anim.f477856de);
            } else {
                activity.overridePendingTransition(0, com.tencent.mm.R.anim.f477779b8);
            }
        }
        e9Var.finishProcess(e9Var.getMResult());
    }
}
