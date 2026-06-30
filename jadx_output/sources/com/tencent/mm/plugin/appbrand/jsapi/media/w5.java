package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes.dex */
public final class w5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f82114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82115e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f82116f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f82117g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.y5 f82118h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f82119i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f82120m;

    public w5(android.app.Activity activity, java.lang.String str, com.tencent.mm.plugin.appbrand.y yVar, org.json.JSONObject jSONObject, com.tencent.mm.plugin.appbrand.jsapi.media.y5 y5Var, int i17, boolean z17) {
        this.f82114d = activity;
        this.f82115e = str;
        this.f82116f = yVar;
        this.f82117g = jSONObject;
        this.f82118h = y5Var;
        this.f82119i = i17;
        this.f82120m = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nf.g.a(this.f82114d).f(new com.tencent.mm.plugin.appbrand.jsapi.media.v5(this.f82118h, this.f82116f, this.f82119i, this.f82120m, this.f82115e));
        java.lang.String o17 = new com.tencent.mm.vfs.r6(lp0.b.K(), "microMsg." + java.lang.System.currentTimeMillis() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG).o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiEditImage", "onPathResolve, tempOutputPath: ".concat(o17));
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider b17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.b(this.f82115e, o17);
        b17.F = 294;
        boolean z17 = false;
        b17.f155688z = false;
        com.tencent.mm.component.api.jumper.UICustomParam uICustomParam = new com.tencent.mm.component.api.jumper.UICustomParam((hp.a) null);
        java.util.Map map = uICustomParam.f64779h;
        ((java.util.HashMap) map).put("plugin_filter", java.lang.Boolean.TRUE);
        ((java.util.HashMap) map).put("plugin_poi", true);
        ((java.util.HashMap) map).put("plugin_tip", true);
        ((java.util.HashMap) map).put("plugin_menu", true);
        b17.f155677o = uICustomParam;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = this.f82116f.getRuntime();
        kotlin.jvm.internal.o.e(runtime, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC");
        if (((com.tencent.mm.plugin.appbrand.o6) runtime).e3()) {
            org.json.JSONObject jSONObject = this.f82117g;
            if (jSONObject != null && jSONObject.optBoolean("supportUndo", false)) {
                z17 = true;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiEditImage", "supportUndo, updatePhotoEditProvider");
                ((fu3.f) ((qc0.f1) i95.n0.c(qc0.f1.class))).getClass();
                fu3.e.f266880a.b(b17);
            }
        }
        ut3.m.f431182a.e(this.f82114d, this.f82118h.f82157g, com.tencent.mm.R.anim.f477876e0, -1, b17, 1, 1);
    }
}
