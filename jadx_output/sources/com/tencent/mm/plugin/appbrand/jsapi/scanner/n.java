package com.tencent.mm.plugin.appbrand.jsapi.scanner;

/* loaded from: classes7.dex */
public class n implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w60.k f82969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiScanCode$GetA8KeyTask f82970e;

    public n(com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiScanCode$GetA8KeyTask jsApiScanCode$GetA8KeyTask, w60.k kVar) {
        this.f82970e = jsApiScanCode$GetA8KeyTask;
        this.f82969d = kVar;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiScanCode$GetA8KeyTask jsApiScanCode$GetA8KeyTask = this.f82970e;
        if (i17 != 0 || i18 != 0) {
            jsApiScanCode$GetA8KeyTask.f82937g = -1;
            jsApiScanCode$GetA8KeyTask.c();
            return 0;
        }
        w60.k kVar = this.f82969d;
        jsApiScanCode$GetA8KeyTask.f82937g = ((com.tencent.mm.modelsimple.k0) kVar).K();
        if (jsApiScanCode$GetA8KeyTask.f82937g != 26) {
            jsApiScanCode$GetA8KeyTask.f82938h = "";
        } else {
            jsApiScanCode$GetA8KeyTask.f82938h = ((com.tencent.mm.modelsimple.k0) kVar).Q();
        }
        jsApiScanCode$GetA8KeyTask.c();
        return 0;
    }
}
