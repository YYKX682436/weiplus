package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* loaded from: classes7.dex */
public final class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f81202d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f81203e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f81204f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f81205g;

    public e1(java.lang.String str, com.tencent.mm.plugin.appbrand.e9 e9Var, java.lang.String str2, org.json.JSONObject jSONObject) {
        this.f81202d = str;
        this.f81203e = e9Var;
        this.f81204f = str2;
        this.f81205g = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f81202d;
        if (str != null) {
            int hashCode = str.hashCode();
            java.lang.String str2 = this.f81204f;
            com.tencent.mm.plugin.appbrand.e9 e9Var = this.f81203e;
            switch (hashCode) {
                case -1867169789:
                    if (str.equals(ya.b.SUCCESS)) {
                        db5.t7.h(e9Var.getF147807d(), str2);
                        return;
                    }
                    return;
                case 3135262:
                    if (str.equals("fail")) {
                        db5.t7.g(e9Var.getF147807d(), str2);
                        return;
                    }
                    return;
                case 3387192:
                    if (str.equals(com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE)) {
                        db5.t7.m(e9Var.getF147807d(), str2);
                        return;
                    }
                    return;
                case 336650556:
                    if (str.equals("loading")) {
                        com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShowFinderLiveToast$ShowLoadingDialogRequest jsApiShowFinderLiveToast$ShowLoadingDialogRequest = new com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShowFinderLiveToast$ShowLoadingDialogRequest();
                        jsApiShowFinderLiveToast$ShowLoadingDialogRequest.b(this.f81205g.toString());
                        android.content.Context f147807d = e9Var.getF147807d();
                        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
                        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(f147807d, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, jsApiShowFinderLiveToast$ShowLoadingDialogRequest, null, null);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
