package com.tencent.mm.plugin.appbrand.jsapi.scanner;

/* loaded from: classes.dex */
public final class r implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.scanner.s f82972a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f82973b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f82974c;

    public r(com.tencent.mm.plugin.appbrand.jsapi.scanner.s sVar, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17) {
        this.f82972a = sVar;
        this.f82973b = c0Var;
        this.f82974c = i17;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.jsapi.scanner.s sVar = this.f82972a;
        if (i17 != (sVar.hashCode() & 65535)) {
            return false;
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = java.lang.Boolean.valueOf(intent != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiScanItem", "scanItem onResult requestCode: %d, resultCode: %d, data != null: %b", objArr);
        int i19 = this.f82974c;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f82973b;
        if (i18 != -1) {
            if (i18 != 0) {
                c0Var.a(i19, sVar.o("fail"));
            } else {
                c0Var.a(i19, sVar.o("cancel"));
            }
        } else if (intent != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            java.lang.String stringExtra = intent.getStringExtra("key_scan_goods_result_req_key");
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiScanItem", "scanItem onResult reqKey: %s", stringExtra);
            kotlin.jvm.internal.o.d(stringExtra);
            hashMap.put("reqKey", stringExtra);
            c0Var.a(i19, sVar.p("ok", hashMap));
        } else {
            c0Var.a(i19, sVar.o("fail"));
        }
        return true;
    }
}
