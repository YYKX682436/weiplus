package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes9.dex */
public class e3 implements com.tencent.mm.ui.widget.snackbar.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.JsApiAddToFavorites$IPCFavResult f80762a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.g3 f80763b;

    public e3(com.tencent.mm.plugin.appbrand.jsapi.g3 g3Var, com.tencent.mm.plugin.appbrand.jsapi.JsApiAddToFavorites$IPCFavResult jsApiAddToFavorites$IPCFavResult) {
        this.f80763b = g3Var;
        this.f80762a = jsApiAddToFavorites$IPCFavResult;
    }

    @Override // com.tencent.mm.ui.widget.snackbar.h
    public void a() {
    }

    @Override // com.tencent.mm.ui.widget.snackbar.h
    public void onHide() {
        this.f80763b.finishProcess(this.f80762a);
    }

    @Override // com.tencent.mm.ui.widget.snackbar.h
    public void onShow() {
    }
}
