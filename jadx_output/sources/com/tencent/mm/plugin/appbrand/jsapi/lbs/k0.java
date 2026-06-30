package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes13.dex */
public class k0 implements com.tencent.mm.ui.widget.dialog.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f81446a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f81447b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.lbs.v0 f81448c;

    public k0(com.tencent.mm.plugin.appbrand.jsapi.lbs.v0 v0Var, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17) {
        this.f81448c = v0Var;
        this.f81446a = e9Var;
        this.f81447b = i17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.h2
    public void onDismiss() {
        com.tencent.mm.plugin.appbrand.jsapi.lbs.v0 v0Var = this.f81448c;
        v0Var.f81503t = false;
        if (v0Var.f81504u) {
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.lbs.v0.E(v0Var, this.f81446a, this.f81447b, v0Var.o("cancel"));
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenMapApp", "onDismiss: none callback, cancel");
    }
}
