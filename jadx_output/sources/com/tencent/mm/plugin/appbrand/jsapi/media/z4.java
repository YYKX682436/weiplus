package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes10.dex */
final class z4 extends com.tencent.mm.plugin.appbrand.ipc.v {

    /* renamed from: d, reason: collision with root package name */
    private com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$ChooseResult f82168d = new com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$ChooseResult();

    /* renamed from: e, reason: collision with root package name */
    private com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$ChooseRequest f82169e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f82170f;

    /* renamed from: g, reason: collision with root package name */
    private com.tencent.mm.ui.widget.dialog.u3 f82171g;

    /* renamed from: h, reason: collision with root package name */
    private android.content.DialogInterface.OnCancelListener f82172h;

    private z4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalVideoObject i(java.lang.String str, boolean z17) {
        gp.d dVar;
        int P;
        int P2;
        if (z17) {
            try {
                str = com.tencent.mm.plugin.appbrand.jsapi.media.t7.e(str);
            } catch (java.lang.Exception e17) {
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseVideo", "addVideoItem, remux failed, exp = %s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            }
        }
        try {
            dVar = new gp.d();
            dVar.setDataSource(str);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseVideo", "addVideoItem, MetaDataRetriever setDataSource failed, e = %s", e18);
            dVar = null;
        }
        if (dVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseVideo", "addVideoItem, null meta data");
            return null;
        }
        int P3 = com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(24), 0);
        if (P3 == 90 || P3 == 270) {
            P = com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(19), 0);
            P2 = com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(18), 0);
        } else {
            P = com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(18), 0);
            P2 = com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(19), 0);
        }
        int P4 = com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(9), 0);
        try {
            dVar.release();
        } catch (java.io.IOException unused) {
        }
        com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalVideoObject appBrandLocalVideoObject = (com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalVideoObject) com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager.c(this.f82169e.f81665d, str, com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalVideoObject.class, "mp4", false);
        if (appBrandLocalVideoObject == null) {
            return null;
        }
        appBrandLocalVideoObject.f76112n = (P4 + 500) / 1000;
        appBrandLocalVideoObject.f76114p = P;
        appBrandLocalVideoObject.f76115q = P2;
        appBrandLocalVideoObject.f76113o = com.tencent.mm.vfs.w6.k(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseVideo", "addVideoItem, return %s", appBrandLocalVideoObject);
        return appBrandLocalVideoObject;
    }

    private static int j(java.lang.String str) {
        int i17;
        boolean a17 = d61.c.a(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseVideo", "checkRemux, isMp4 = %b", java.lang.Boolean.valueOf(a17));
        if (a17) {
            i17 = ((com.tencent.mm.feature.sight.api.ISightJNIService) i95.n0.c(com.tencent.mm.feature.sight.api.ISightJNIService.class)).shouldRemuxingVFS(str, com.tencent.mm.plugin.appbrand.jsapi.appdownload.q1.CTRL_INDEX, 500, 26214400, 300000.0d, 1000000);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseVideo", "checkRemux, ret = %d", java.lang.Integer.valueOf(i17));
        } else {
            i17 = com.tencent.tinker.loader.shareutil.ShareConstants.ERROR_LOAD_GET_INTENT_FAIL;
        }
        if (i17 == -1 || !a17) {
            long k17 = com.tencent.mm.vfs.w6.k(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseVideo", "fileLength = %d", java.lang.Long.valueOf(k17));
            i17 = k17 > 26214400 ? -1 : 1;
        }
        switch (i17) {
            case -6:
            case -5:
            case -4:
            case -3:
            case -2:
            case -1:
                return -50002;
            case 0:
                return -50006;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return 1;
            default:
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseVideo", "unknown check type");
                return -50001;
        }
    }

    private void k() {
        getActivityContext().mmSetOnActivityResultCallback(this);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_send_raw_image", false);
        intent.putExtra("query_media_type", 2);
        intent.putExtra("GalleryUI_SkipVideoSizeLimit", true);
        intent.putExtra("gallery_report_tag", 16);
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$ChooseRequest jsApiChooseVideo$ChooseRequest = this.f82169e;
        boolean z17 = jsApiChooseVideo$ChooseRequest.f81667f;
        if (z17 && jsApiChooseVideo$ChooseRequest.f81668g) {
            this.f82170f = com.tencent.mm.vfs.w6.i(lp0.b.m() + "microMsg." + java.lang.System.currentTimeMillis() + ".mp4", false);
            intent.putExtra("record_video_force_sys_camera", true);
            intent.putExtra("record_video_quality", 1);
            intent.putExtra("record_video_time_limit", this.f82169e.f81666e);
            intent.putExtra("video_full_path", this.f82170f);
            ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).wi(getActivityContext(), 4, 1, 7, intent);
            return;
        }
        if (!z17) {
            if (!jsApiChooseVideo$ChooseRequest.f81668g) {
                com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$ChooseResult jsApiChooseVideo$ChooseResult = this.f82168d;
                jsApiChooseVideo$ChooseResult.f81670d = -2;
                finishProcess(jsApiChooseVideo$ChooseResult);
                return;
            } else {
                intent.putExtra("show_header_view", false);
                ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).wi(getActivityContext(), 4, 1, 16, intent);
                return;
            }
        }
        this.f82170f = com.tencent.mm.vfs.w6.i(lp0.b.m() + "microMsg." + java.lang.System.currentTimeMillis() + ".mp4", false);
        int i17 = this.f82169e.f81666e;
        vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
        com.tencent.mm.ui.MMActivity activityContext = getActivityContext();
        java.lang.String str = this.f82170f;
        ((ub0.r) oVar).getClass();
        com.tencent.mm.pluginsdk.ui.tools.l7.i(activityContext, str, 5, i17, 0, 1, false);
    }

    private boolean l() {
        return com.tencent.mm.sdk.platformtools.t8.w(getActivityContext()) > 200;
    }

    private static java.lang.String m(java.lang.String str) {
        if (j(str) != -50006) {
            return str;
        }
        int[] iArr = new int[2];
        ((vf0.l1) ((wf0.g1) i95.n0.c(wf0.g1.class))).getClass();
        com.tencent.mm.pluginsdk.model.c3.d(str, iArr, 640, 480);
        int i17 = iArr[0];
        int i18 = iArr[1];
        java.lang.String str2 = lp0.b.m() + "microMsg." + java.lang.System.currentTimeMillis() + ".mp4";
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseVideo", "remuxIfNeed [%s] to [%s], result %d, resolution:[%d, %d]", str, str2, java.lang.Integer.valueOf(((com.tencent.mm.feature.sight.api.ISightJNIService) i95.n0.c(com.tencent.mm.feature.sight.api.ISightJNIService.class)).remuxingVFS(str, str2, i17, i18, com.tencent.mm.plugin.sight.base.d.f162408c, com.tencent.mm.plugin.sight.base.d.f162407b, 8, 2, 25.0f, com.tencent.mm.plugin.sight.base.d.f162409d, null, 0, false, 0, 51)), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        return str2;
    }

    private void n() {
        this.f82172h = new com.tencent.mm.plugin.appbrand.jsapi.media.w4(this);
        this.f82171g = db5.e1.Q(getActivityContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490081kd), true, true, this.f82172h);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest) {
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$ChooseRequest jsApiChooseVideo$ChooseRequest = (com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$ChooseRequest) appBrandProxyUIProcessTask$ProcessRequest;
        this.f82169e = jsApiChooseVideo$ChooseRequest;
        jsApiChooseVideo$ChooseRequest.f81666e = java.lang.Math.min(java.lang.Math.max(jsApiChooseVideo$ChooseRequest.f81666e, 60), 0);
        if (!l()) {
            db5.t7.makeText(getActivityContext(), getString(com.tencent.mm.R.string.f490081kd), 1).show();
        }
        k();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.v, com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i18 == 0) {
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$ChooseResult jsApiChooseVideo$ChooseResult = this.f82168d;
            jsApiChooseVideo$ChooseResult.f81670d = 0;
            finishProcess(jsApiChooseVideo$ChooseResult);
            return;
        }
        if (-1 != i18) {
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$ChooseResult jsApiChooseVideo$ChooseResult2 = this.f82168d;
            jsApiChooseVideo$ChooseResult2.f81670d = -2;
            finishProcess(jsApiChooseVideo$ChooseResult2);
            return;
        }
        if (i17 == 4) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("key_select_video_list");
            if (com.tencent.mm.sdk.platformtools.t8.L0(stringArrayListExtra)) {
                com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$ChooseResult jsApiChooseVideo$ChooseResult3 = this.f82168d;
                jsApiChooseVideo$ChooseResult3.f81670d = -2;
                finishProcess(jsApiChooseVideo$ChooseResult3);
                return;
            } else {
                java.lang.String i19 = com.tencent.mm.vfs.w6.i(stringArrayListExtra.get(0), false);
                n();
                java.util.Set set = com.tencent.mm.plugin.appbrand.utils.s0.f90550a;
                ik1.h0.a().postToWorker(new com.tencent.mm.plugin.appbrand.jsapi.media.y4(this, i19));
                return;
            }
        }
        if (i17 != 5) {
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$ChooseResult jsApiChooseVideo$ChooseResult4 = this.f82168d;
            jsApiChooseVideo$ChooseResult4.f81670d = -2;
            finishProcess(jsApiChooseVideo$ChooseResult4);
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(this.f82170f)) {
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$ChooseResult jsApiChooseVideo$ChooseResult5 = this.f82168d;
            jsApiChooseVideo$ChooseResult5.f81670d = -2;
            finishProcess(jsApiChooseVideo$ChooseResult5);
        } else {
            n();
            java.util.Set set2 = com.tencent.mm.plugin.appbrand.utils.s0.f90550a;
            ik1.h0.a().postToWorker(new com.tencent.mm.plugin.appbrand.jsapi.media.x4(this));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void onProcessInterrupted() {
        super.onProcessInterrupted();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f82171g;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f82171g = null;
        }
    }
}
