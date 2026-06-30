package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes10.dex */
public class x2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.d3 f82126d;

    public x2(com.tencent.mm.plugin.appbrand.jsapi.media.d3 d3Var) {
        this.f82126d = d3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.MMActivity activityContext;
        com.tencent.mm.ui.MMActivity activityContext2;
        java.lang.Object b17 = com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.appbrand.jsapi.media.GetSightParamsIPCTask.TaskParams(2, 0, false), com.tencent.mm.plugin.appbrand.jsapi.media.GetSightParamsIPCTask.class);
        kotlin.jvm.internal.o.f(b17, "invokeSync(...)");
        com.tencent.mm.plugin.mmsight.SightParams sightParams = (com.tencent.mm.plugin.mmsight.SightParams) b17;
        sightParams.f148828r = false;
        sightParams.f148826p = false;
        sightParams.f148823m = lp0.b.K();
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_appbrand_use_mmrecordui, true);
        boolean z17 = bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Media_AppbrandUseMMrecord_Int, 0) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseImage", "useMMRecordUI %b localConfigEnable:%b", java.lang.Boolean.valueOf(fj6), java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.appbrand.jsapi.media.d3 d3Var = this.f82126d;
        if (!fj6 && !z17) {
            android.content.Intent intent = new android.content.Intent();
            activityContext2 = d3Var.getActivityContext();
            intent.setClassName(activityContext2, "com.tencent.mm.plugin.mmsight.ui.SightCaptureUI");
            intent.putExtra("KEY_SIGHT_PARAMS", sightParams);
            d3Var.startActivityForResult(intent, 2);
            return;
        }
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = sightParams.f148819f;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.f(videoTransPara, videoTransPara.f71195h * 1000, 9);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        f17.f155682t = bool;
        f17.f155684v = bool;
        f17.f155687y = true;
        com.tencent.mm.component.api.jumper.UICustomParam uICustomParam = new com.tencent.mm.component.api.jumper.UICustomParam((hp.a) null);
        java.util.Map map = uICustomParam.f64779h;
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        java.util.HashMap hashMap = (java.util.HashMap) map;
        hashMap.put("plugin_filter", bool2);
        hashMap.put("plugin_emoji", bool2);
        hashMap.put("plugin_text", bool2);
        hashMap.put("plugin_photo_crop", bool2);
        hashMap.put("plugin_doodle", bool2);
        f17.f155677o = uICustomParam;
        f17.M.putBoolean("key_hide_operation", true);
        f17.M.putInt("key_camera_select", sightParams.f148818e);
        f17.M.putInt("key_sub_scene", 0);
        ((pc0.i) ((vb0.n) i95.n0.c(vb0.n.class))).getClass();
        f17.a(0, com.tencent.mm.plugin.recordvideo.plugin.parent.AppBrandRecordPluginLayout.class.getName());
        qc0.c1 c1Var = (qc0.c1) i95.n0.c(qc0.c1.class);
        activityContext = d3Var.getActivityContext();
        ((pc0.e2) c1Var).wi(activityContext, f17, new com.tencent.mm.plugin.appbrand.jsapi.media.w2(this));
    }
}
