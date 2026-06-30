package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class md {

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.Set f81603j;

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult f81604a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f81605b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.n7 f81606c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f81607d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f81608e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Rect f81609f;

    /* renamed from: g, reason: collision with root package name */
    public kd0.p2 f81610g;

    /* renamed from: h, reason: collision with root package name */
    public final im5.a f81611h = new com.tencent.mm.plugin.appbrand.jsapi.md$$a(this);

    /* renamed from: i, reason: collision with root package name */
    public final u81.f f81612i = new com.tencent.mm.plugin.appbrand.jsapi.sd(this);

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        f81603j = hashSet;
        hashSet.add(3);
    }

    public md(com.tencent.mm.plugin.appbrand.page.n7 n7Var, java.lang.String str, java.lang.String str2, android.graphics.Rect rect) {
        this.f81606c = n7Var;
        this.f81607d = str;
        this.f81608e = str2;
        this.f81609f = rect;
        kd0.x2 x2Var = (kd0.x2) i95.n0.c(kd0.x2.class);
        android.content.Context context = n7Var.getContext();
        com.tencent.mm.plugin.appbrand.jsapi.td tdVar = new com.tencent.mm.plugin.appbrand.jsapi.td(this);
        ((jd0.q2) x2Var).getClass();
        this.f81610g = new com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic(context, tdVar);
    }

    public static void a(com.tencent.mm.plugin.appbrand.jsapi.md mdVar) {
        mdVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowImageOperateSheet", "processQRCodeResultLogic");
        com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult = mdVar.f81604a;
        if (jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult == null || com.tencent.mm.sdk.platformtools.t8.K0(jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult.f78644d)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiShowImageOperateSheet", "processQRCodeResultLogic result nil");
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest = new com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest();
        jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest.f78620d = mdVar.f81604a;
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = mdVar.f81606c;
        jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest.f78621e = n7Var.getAppId();
        jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest.f78622f = n7Var.X1();
        jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest.f78623g = n7Var.getRuntime().g2();
        if (n7Var.getRuntime() != null && n7Var.getRuntime().u0() != null && n7Var.getRuntime().u0().f47269b2 != null) {
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = n7Var.getRuntime().u0();
            jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest.f78626m = u07.f47269b2.f87803v;
            jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest.f78624h = u07.f47269b2.f87801t;
            jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest.f78625i = u07.f47269b2.f87802u;
            jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest.f78627n = u07.f47269b2.f87800s;
            jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest.f78628o = u07.f47269b2.f87790f;
            jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest.f78629p = u07.f47269b2.f87791g;
            jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest.f78630q = u07.f47278x;
        }
        android.content.Context context = n7Var.getContext();
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(context, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest, null, null);
        com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult2 = mdVar.f81604a;
        mdVar.c(jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult2.f78646f, jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult2.f78644d, true, true);
    }

    public final void b(com.tencent.mm.plugin.appbrand.utils.c0 c0Var) {
        java.lang.String str = this.f81608e;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f81606c;
        if (K0) {
            com.tencent.mm.plugin.appbrand.utils.d0.c(n7Var, this.f81607d, null, c0Var);
            return;
        }
        com.tencent.mm.vfs.r6 allocTempFile = n7Var.getFileSystem().allocTempFile("showSheet_base64_" + java.lang.System.currentTimeMillis());
        if (allocTempFile == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShowImageOperateSheet", "loadImage failed for allocTempFile");
            return;
        }
        java.lang.String o17 = allocTempFile.o();
        byte[] decode = android.util.Base64.decode(str, 0);
        com.tencent.mm.vfs.w6.S(o17, decode, 0, decode.length);
        c0Var.a(o17);
    }

    public final void c(int i17, java.lang.String str, boolean z17, boolean z18) {
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07;
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f81606c;
        if (n7Var == null || n7Var.getRuntime() == null || (u07 = n7Var.getRuntime().u0()) == null) {
            return;
        }
        java.lang.String str2 = u07.f47276v;
        java.lang.String appId = n7Var.getAppId();
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = u07.f47269b2;
        int i18 = appBrandStatObject != null ? appBrandStatObject.f87790f : 0;
        kd0.d2 d2Var = (kd0.d2) i95.n0.c(kd0.d2.class);
        java.lang.String Y1 = n7Var.Y1();
        java.lang.String X1 = n7Var.X1();
        ((jd0.a) d2Var).getClass();
        com.tencent.mm.plugin.scanner.a.f158657a.b(str2, i18, appId, false, Y1, i17, str, z17, z18, X1);
    }

    public void d() {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f81606c;
        n7Var.j(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.jsapi.md$$b
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.appbrand.jsapi.md mdVar = com.tencent.mm.plugin.appbrand.jsapi.md.this;
                boolean z17 = mdVar.f81606c.getRuntime().S;
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowImageOperateSheet", "showBottomSheet appId:%s, destroyed:%b, imageUrl:%s", mdVar.f81606c.getAppId(), java.lang.Boolean.valueOf(z17), mdVar.f81607d);
                if (z17) {
                    mdVar.f81605b = null;
                    return;
                }
                android.content.Context context = mdVar.f81606c.getContext();
                if (mdVar.f81605b == null) {
                    com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
                    mdVar.f81605b = k0Var;
                    k0Var.d().getDecorView().addOnAttachStateChangeListener(new com.tencent.mm.plugin.appbrand.jsapi.ud(mdVar));
                    if (context instanceof im5.b) {
                        ((im5.b) context).keep(mdVar.f81611h);
                    }
                }
                com.tencent.mm.ui.widget.dialog.k0 k0Var2 = mdVar.f81605b;
                k0Var2.f211872n = new com.tencent.mm.plugin.appbrand.jsapi.vd(mdVar);
                k0Var2.f211881s = new com.tencent.mm.plugin.appbrand.jsapi.wd(mdVar);
                k0Var2.p(new com.tencent.mm.plugin.appbrand.jsapi.xd(mdVar));
                if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
                    return;
                }
                mdVar.f81605b.v();
            }
        }, nf.o.a(n7Var.getContext()) ? 100 : 0);
    }
}
