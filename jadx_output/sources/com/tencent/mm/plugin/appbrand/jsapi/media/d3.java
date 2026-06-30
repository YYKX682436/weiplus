package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes10.dex */
final class d3 extends com.tencent.mm.plugin.appbrand.ipc.v {

    /* renamed from: d, reason: collision with root package name */
    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$ChooseRequest f81759d;

    /* renamed from: g, reason: collision with root package name */
    int f81762g;

    /* renamed from: h, reason: collision with root package name */
    boolean f81763h;

    /* renamed from: i, reason: collision with root package name */
    boolean f81764i;

    /* renamed from: m, reason: collision with root package name */
    double f81765m;

    /* renamed from: n, reason: collision with root package name */
    double f81766n;

    /* renamed from: o, reason: collision with root package name */
    java.lang.String f81767o;

    /* renamed from: r, reason: collision with root package name */
    private com.tencent.mm.ui.widget.dialog.u3 f81770r;

    /* renamed from: s, reason: collision with root package name */
    private android.content.DialogInterface.OnCancelListener f81771s;

    /* renamed from: e, reason: collision with root package name */
    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$ChooseResult f81760e = new com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$ChooseResult();

    /* renamed from: f, reason: collision with root package name */
    final int f81761f = hashCode() % 10000;

    /* renamed from: p, reason: collision with root package name */
    private boolean f81768p = true;

    /* renamed from: q, reason: collision with root package name */
    private java.util.HashSet<java.lang.Integer> f81769q = new java.util.HashSet<>();

    private d3() {
    }

    private void j() {
        getActivityContext().mmSetOnActivityResultCallback(this);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_send_raw_image", !this.f81759d.f81629h);
        intent.putExtra("key_force_show_raw_image_button", this.f81759d.f81630i);
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$ChooseRequest jsApiChooseImage$ChooseRequest = this.f81759d;
        intent.putExtra("key_is_raw_image_button_disable", jsApiChooseImage$ChooseRequest.f81630i && !jsApiChooseImage$ChooseRequest.f81629h);
        intent.putExtra("query_media_type", 1);
        intent.putExtra("key_force_hide_edit_image_button_after_album_take_image", true);
        intent.putExtra("album_business_tag", "album_business_bubble_media_by_jsapi_chooseimage");
        intent.putExtra("gallery_report_tag", 16);
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$ChooseRequest jsApiChooseImage$ChooseRequest2 = this.f81759d;
        boolean z17 = jsApiChooseImage$ChooseRequest2.f81627f;
        if (z17 && jsApiChooseImage$ChooseRequest2.f81628g) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseImage", "illegal scene, ignore this request");
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$ChooseResult jsApiChooseImage$ChooseResult = this.f81760e;
            jsApiChooseImage$ChooseResult.f81632d = -2;
            finishProcess(jsApiChooseImage$ChooseResult);
            return;
        }
        if (jsApiChooseImage$ChooseRequest2.f81628g) {
            intent.putExtra("show_header_view", false);
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            com.tencent.mm.ui.MMActivity activityContext = getActivityContext();
            int i17 = this.f81759d.f81626e;
            int i18 = this.f81762g;
            ((ub0.r) oVar).getClass();
            com.tencent.mm.pluginsdk.ui.tools.l7.e(activityContext, 1, i17, i18, intent);
            return;
        }
        if (z17) {
            n();
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseImage", "unknown scene, ignore this request");
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$ChooseResult jsApiChooseImage$ChooseResult2 = this.f81760e;
        jsApiChooseImage$ChooseResult2.f81632d = -2;
        finishProcess(jsApiChooseImage$ChooseResult2);
    }

    private boolean k() {
        return com.tencent.mm.sdk.platformtools.t8.w(getActivityContext()) > 200;
    }

    private void l(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiChooseImage", "take photo, but result is null");
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$ChooseResult jsApiChooseImage$ChooseResult = this.f81760e;
            jsApiChooseImage$ChooseResult.f81632d = -2;
            finishProcess(jsApiChooseImage$ChooseResult);
            return;
        }
        if (getActivityContext() != null && getActivityContext().getWindow() != null) {
            getActivityContext().getWindow().getDecorView().setBackgroundColor(-16777216);
        }
        ik1.h0.a().postToWorker(new com.tencent.mm.plugin.appbrand.jsapi.media.c3(this, str));
    }

    private void m(int i17) {
        this.f81771s = new com.tencent.mm.plugin.appbrand.jsapi.media.y2(this);
        this.f81770r = db5.e1.Q(getActivityContext(), getString(com.tencent.mm.R.string.f490573yv), getString(i17), true, true, this.f81771s);
    }

    private void n() {
        ik1.h0.a().postToWorker(new com.tencent.mm.plugin.appbrand.jsapi.media.x2(this));
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest) {
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$ChooseRequest jsApiChooseImage$ChooseRequest = (com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$ChooseRequest) appBrandProxyUIProcessTask$ProcessRequest;
        this.f81759d = jsApiChooseImage$ChooseRequest;
        jsApiChooseImage$ChooseRequest.f81631m = true;
        jsApiChooseImage$ChooseRequest.f81626e = java.lang.Math.max(1, java.lang.Math.min(9, jsApiChooseImage$ChooseRequest.f81626e));
        this.f81762g = 16;
        if (!k()) {
            db5.t7.makeText(getActivityContext(), getString(com.tencent.mm.R.string.f490079kb), 1).show();
        }
        j();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.v, com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String stringExtra;
        if (this.f81769q.contains(java.lang.Integer.valueOf(i17))) {
            return;
        }
        if (i18 == 0) {
            if ((i17 == 1 || i17 == 3) && !com.tencent.mm.sdk.platformtools.t8.K0(this.f81767o)) {
                com.tencent.mm.vfs.w6.h(this.f81767o);
                this.f81767o = null;
            }
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$ChooseResult jsApiChooseImage$ChooseResult = this.f81760e;
            jsApiChooseImage$ChooseResult.f81632d = 0;
            finishProcess(jsApiChooseImage$ChooseResult);
            return;
        }
        if (i17 != 1) {
            if (i17 != 2) {
                if (i17 != 3) {
                    if (i17 != 4) {
                        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$ChooseResult jsApiChooseImage$ChooseResult2 = this.f81760e;
                        jsApiChooseImage$ChooseResult2.f81632d = -2;
                        finishProcess(jsApiChooseImage$ChooseResult2);
                        return;
                    }
                }
            }
            if (intent == null) {
                com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$ChooseResult jsApiChooseImage$ChooseResult3 = this.f81760e;
                jsApiChooseImage$ChooseResult3.f81632d = 0;
                finishProcess(jsApiChooseImage$ChooseResult3);
                return;
            }
            if (i17 == 2) {
                com.tencent.mm.plugin.mmsight.SightCaptureResult sightCaptureResult = (com.tencent.mm.plugin.mmsight.SightCaptureResult) intent.getParcelableExtra("key_req_result");
                if (sightCaptureResult == null) {
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$ChooseResult jsApiChooseImage$ChooseResult4 = this.f81760e;
                    jsApiChooseImage$ChooseResult4.f81632d = 0;
                    finishProcess(jsApiChooseImage$ChooseResult4);
                    return;
                }
                stringExtra = sightCaptureResult.f148815p;
            } else if (intent.getIntExtra("key_new_sight_media_opt_code", -1) != 0) {
                com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$ChooseResult jsApiChooseImage$ChooseResult5 = this.f81760e;
                jsApiChooseImage$ChooseResult5.f81632d = 0;
                finishProcess(jsApiChooseImage$ChooseResult5);
                return;
            } else {
                stringExtra = intent.getStringExtra("key_new_sight_image_path");
                if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseImage", "choose from new sight, but path is null");
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$ChooseResult jsApiChooseImage$ChooseResult6 = this.f81760e;
                    jsApiChooseImage$ChooseResult6.f81632d = 0;
                    finishProcess(jsApiChooseImage$ChooseResult6);
                    return;
                }
            }
            this.f81767o = stringExtra;
            l(stringExtra);
            return;
        }
        if (intent == null) {
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$ChooseResult jsApiChooseImage$ChooseResult7 = this.f81760e;
            jsApiChooseImage$ChooseResult7.f81632d = 0;
            finishProcess(jsApiChooseImage$ChooseResult7);
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("CropImage_OutputPath_List");
        boolean booleanExtra = intent.getBooleanExtra("CropImage_Compress_Img", false);
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$ChooseRequest jsApiChooseImage$ChooseRequest = this.f81759d;
        boolean z17 = jsApiChooseImage$ChooseRequest.f81629h;
        boolean z18 = jsApiChooseImage$ChooseRequest.f81630i;
        boolean z19 = ((z18 ^ true) && z17) || (booleanExtra && (z18 & z17));
        boolean z27 = intent.getBooleanExtra("isTakePhoto", false) || intent.getBooleanExtra("isPreviewPhoto", false);
        boolean z28 = this.f81759d.f81629h;
        boolean z29 = this.f81759d.f81630i;
        if (z19) {
            m(com.tencent.mm.R.string.f490080kc);
        }
        boolean z37 = !z19 && com.tencent.mm.plugin.appbrand.jsapi.media.p7.f(stringArrayListExtra);
        if (z37) {
            m(com.tencent.mm.R.string.f490178n3);
        }
        ik1.h0.a().postToWorker(new com.tencent.mm.plugin.appbrand.jsapi.media.a3(this, stringArrayListExtra, z27, z19, z37));
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void onProcessInterrupted() {
        super.onProcessInterrupted();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f81770r;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f81770r = null;
        }
        this.f81769q.clear();
    }
}
