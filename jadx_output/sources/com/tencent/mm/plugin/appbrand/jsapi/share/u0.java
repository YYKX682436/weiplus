package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public final class u0 implements com.tencent.mm.plugin.appbrand.utils.q2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f83281a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f83282b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.share.a1 f83283c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.share.t0 f83284d;

    public u0(com.tencent.mm.plugin.appbrand.y yVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.share.a1 a1Var, com.tencent.mm.plugin.appbrand.jsapi.share.t0 t0Var) {
        this.f83281a = yVar;
        this.f83282b = i17;
        this.f83283c = a1Var;
        this.f83284d = t0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.q2
    public void a(java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiShareImageMessageToSpecificContact", "invoke, localPath: " + str);
        boolean z18 = str == null || str.length() == 0;
        com.tencent.mm.plugin.appbrand.jsapi.share.a1 a1Var = this.f83283c;
        int i17 = this.f83282b;
        com.tencent.mm.plugin.appbrand.y yVar = this.f83281a;
        if (z18) {
            yVar.a(i17, a1Var.o("fail:get image data fail"));
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.y1.f(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiShareImageMessageToSpecificContact", "invoke, %s is not image", str);
            com.tencent.mm.vfs.w6.h(str);
            yVar.a(i17, a1Var.o("fail:get image data fail"));
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.share.t0 t0Var = this.f83284d;
        t0Var.f83239g = str;
        android.content.Context f147807d = yVar.getF147807d();
        if (!(f147807d instanceof android.app.Activity)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiShareImageMessageToSpecificContact", "invoke, activity is null");
            yVar.a(i17, a1Var.o("fail:activity is null"));
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.y1.c(str)) {
            com.tencent.mm.plugin.appbrand.y yVar2 = this.f83281a;
            com.tencent.mm.plugin.appbrand.jsapi.share.t0 t0Var2 = this.f83284d;
            android.app.Activity activity = (android.app.Activity) f147807d;
            a1Var.getClass();
            yVar2.m(new com.tencent.mm.plugin.appbrand.jsapi.share.x0(activity, a1Var, new com.tencent.mm.plugin.appbrand.jsapi.share.y0(a1Var, yVar2, i17, activity), t0Var2, yVar2));
            return;
        }
        android.app.Activity activity2 = (android.app.Activity) f147807d;
        a1Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiShareImageMessageToSpecificContact", "invoke, gif");
        java.lang.String str2 = t0Var.f83239g;
        if (str2 == null) {
            str2 = "";
        }
        com.tencent.mm.plugin.appbrand.jsapi.share.ShareGifToConversationRequest shareGifToConversationRequest = new com.tencent.mm.plugin.appbrand.jsapi.share.ShareGifToConversationRequest(str2, t0Var.f83236d);
        com.tencent.mm.plugin.appbrand.jsapi.share.v0 v0Var = new com.tencent.mm.plugin.appbrand.jsapi.share.v0(activity2, yVar, i17, a1Var);
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(activity2, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, shareGifToConversationRequest, v0Var, null);
    }
}
