package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class t6 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.u6 f83460a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f83461b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f83462c;

    public t6(com.tencent.mm.plugin.appbrand.jsapi.u6 u6Var, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, int i17) {
        this.f83460a = u6Var;
        this.f83461b = d0Var;
        this.f83462c = i17;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.jsapi.u6 u6Var = this.f83460a;
        if (i17 != u6Var.f83501g) {
            return false;
        }
        int i19 = this.f83462c;
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = this.f83461b;
        if (intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("key_callback");
            if (stringExtra == null) {
                stringExtra = "";
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiJumpToOfflinePay", "callback: %s", stringExtra);
            d0Var.a(i19, u6Var.o(stringExtra));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14954, h45.y.f278968a, "jumpToOfflinePay:ok");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiJumpToOfflinePay", "callback fail");
            d0Var.a(i19, u6Var.o("fail"));
            if (!h45.y.c()) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14954, h45.y.f278968a, "jumpToOfflinePay:fail");
            }
        }
        if (h45.y.c()) {
            return true;
        }
        h45.y.f278968a = null;
        return true;
    }
}
