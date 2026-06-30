package com.tencent.mm.plugin.appbrand;

/* renamed from: com.tencent.mm.plugin.appbrand.if, reason: invalid class name */
/* loaded from: classes7.dex */
public class Cif implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f78343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f78344e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f78345f;

    public Cif(java.lang.String str, int i17, java.lang.String str2) {
        this.f78343d = str;
        this.f78344e = i17;
        this.f78345f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SinglePageModeLogic", "cleanData");
        v81.e eVar = (v81.e) i95.n0.c(v81.e.class);
        java.lang.String str = this.f78343d;
        try {
            com.tencent.mm.plugin.appbrand.jsapi.file.l2.l(kk.v.a(eVar.Z3(str)), str).cleanupDirectory();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SinglePageModeLogic", "clean SinglePageNotFlattern appId=%s e=%s", str, e17);
        }
        int i17 = this.f78344e;
        com.tencent.mars.xlog.Log.i("MicroMsg.SinglePageModeLogic", "cleanStorage scheme:%d", java.lang.Integer.valueOf(i17));
        boolean a17 = k91.z0.a(i17);
        java.lang.String str2 = this.f78345f;
        if (a17) {
            ((com.tencent.mm.plugin.appbrand.luggage.customize.b) ((oe.a) nd.f.a(oe.a.class))).b(str, i17, str2).k(2, str);
        } else if (i17 == 3) {
            ((com.tencent.mm.plugin.appbrand.luggage.customize.b) ((oe.a) nd.f.a(oe.a.class))).b(str, i17, str2).k(2, str);
            com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiClearStorageTask jsApiClearStorageTask = new com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiClearStorageTask();
            jsApiClearStorageTask.f83343f = str;
            jsApiClearStorageTask.f83344g = 2;
            jsApiClearStorageTask.s();
        } else {
            com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiClearStorageTask jsApiClearStorageTask2 = new com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiClearStorageTask();
            jsApiClearStorageTask2.f83343f = str;
            jsApiClearStorageTask2.f83344g = 2;
            jsApiClearStorageTask2.s();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SinglePageModeLogic", "cleanData done");
    }
}
