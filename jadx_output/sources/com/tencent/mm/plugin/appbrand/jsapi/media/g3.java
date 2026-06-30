package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public class g3 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f81816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f81817e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.z3 f81818f;

    public g3(com.tencent.mm.plugin.appbrand.jsapi.media.z3 z3Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f81818f = z3Var;
        this.f81816d = lVar;
        this.f81817e = i17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "cancel chooseMedia");
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "chooseMedia fail, onReceiveResult user cancel");
        this.f81816d.a(this.f81817e, this.f81818f.o("fail:cancel"));
    }
}
