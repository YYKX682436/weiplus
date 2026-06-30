package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class v9 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f83513a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f83514b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.w9 f83515c;

    public v9(com.tencent.mm.plugin.appbrand.jsapi.w9 w9Var, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, int i17) {
        this.f83515c = w9Var;
        this.f83513a = d0Var;
        this.f83514b = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.jsapi.w9 w9Var = this.f83515c;
        if (i17 != w9Var.f83723g) {
            return false;
        }
        int i19 = this.f83514b;
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = this.f83513a;
        if (intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("key_callback");
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenOfflinePayView", "callback: %s", stringExtra);
            d0Var.a(i19, w9Var.o(stringExtra));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14954, h45.y.f278968a, "openOfflinePayView:ok");
        } else {
            d0Var.a(i19, w9Var.o("fail"));
            if (!h45.y.c()) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14954, h45.y.f278968a, "openOfflinePayView:fail");
            }
        }
        if (h45.y.c()) {
            return true;
        }
        h45.y.f278968a = null;
        return true;
    }
}
