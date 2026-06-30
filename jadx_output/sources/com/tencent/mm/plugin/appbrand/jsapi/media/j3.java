package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public class j3 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f81860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f81861e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.z3 f81862f;

    public j3(com.tencent.mm.plugin.appbrand.jsapi.media.z3 z3Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f81862f = z3Var;
        this.f81860d = lVar;
        this.f81861e = i17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "chooseMedia fail, onReceiveResult user cancel");
        this.f81860d.a(this.f81861e, this.f81862f.o("fail:cancel"));
    }
}
