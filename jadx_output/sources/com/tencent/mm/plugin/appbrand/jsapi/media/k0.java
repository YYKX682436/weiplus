package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes10.dex */
public final class k0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.t0 f81888a;

    public k0(com.tencent.mm.plugin.appbrand.jsapi.media.t0 t0Var) {
        this.f81888a = t0Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.plugin.mmsight.SightParams sightParams = (com.tencent.mm.plugin.mmsight.SightParams) obj;
        km5.b c17 = km5.u.c();
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_appbrand_use_mmrecordui, true);
        boolean z17 = bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Media_AppbrandUseMMrecord_Int, 0) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ChooseMediaWorkFlow", "useMMRecordUI %b localConfigEnable:%b", java.lang.Boolean.valueOf(fj6), java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.appbrand.jsapi.media.x xVar = com.tencent.mm.plugin.appbrand.jsapi.media.x.f82124a;
        com.tencent.mm.plugin.appbrand.jsapi.media.t0 t0Var = this.f81888a;
        if (!fj6 && !z17) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClassName(t0Var.f82060a.getF147807d(), "com.tencent.mm.plugin.mmsight.ui.SightCaptureUI");
            intent.putExtra("KEY_SIGHT_PARAMS", sightParams);
            android.app.Activity a17 = q75.a.a(t0Var.f82060a.getF147807d());
            if (a17 != null) {
                nf.g.a(a17).j(intent, new com.tencent.mm.plugin.appbrand.jsapi.media.j0(c17));
                a17.overridePendingTransition(com.tencent.mm.R.anim.f477876e0, -1);
                return xVar;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.ChooseMediaWorkFlow", "step:goSightCaptureUI context !is activity");
            com.tencent.mm.plugin.appbrand.jsapi.media.y yVar = new com.tencent.mm.plugin.appbrand.jsapi.media.y("fail:internal error invalid android context");
            c17.c(yVar);
            return yVar;
        }
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = sightParams.f148819f;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.f(videoTransPara, videoTransPara.f71195h * 1000, 9);
        f17.f155682t = java.lang.Boolean.TRUE;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        f17.f155681s = bool;
        f17.f155684v = bool;
        f17.f155687y = true;
        android.os.Bundle bundle = f17.M;
        bundle.putBoolean("key_show_top_countdown_cover", sightParams.f148829s);
        bundle.putBoolean("key_hide_operation", true);
        bundle.putInt("key_sub_scene", 1);
        bundle.putInt("key_camera_select", sightParams.f148818e);
        bundle.putInt("key_record_bitrate_ratio", 1);
        hp.b bVar = new hp.b();
        bVar.a(true);
        bVar.f(true);
        bVar.d(true);
        bVar.h(true);
        bVar.e(true);
        bVar.c(true);
        f17.f155677o = bVar.f282904a;
        f17.a(2, "com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout");
        ((pc0.i) ((vb0.n) i95.n0.c(vb0.n.class))).getClass();
        f17.a(0, com.tencent.mm.plugin.recordvideo.plugin.parent.AppBrandRecordPluginLayout.class.getName());
        android.app.Activity a18 = q75.a.a(t0Var.f82060a.getF147807d());
        if (a18 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.ChooseMediaWorkFlow", "step:goSightCaptureUI context !is activity");
            com.tencent.mm.plugin.appbrand.jsapi.media.y yVar2 = new com.tencent.mm.plugin.appbrand.jsapi.media.y("fail:internal error invalid android context");
            c17.c(yVar2);
            return yVar2;
        }
        if (a18 instanceof androidx.activity.ComponentActivity) {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new com.tencent.mm.plugin.appbrand.jsapi.media.i0(a18, f17, c17, null), 3, null);
            return xVar;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.ChooseMediaWorkFlow", "step:goSightCaptureUI context !is activity");
        com.tencent.mm.plugin.appbrand.jsapi.media.y yVar3 = new com.tencent.mm.plugin.appbrand.jsapi.media.y("fail:internal error invalid android context");
        c17.c(yVar3);
        return yVar3;
    }
}
