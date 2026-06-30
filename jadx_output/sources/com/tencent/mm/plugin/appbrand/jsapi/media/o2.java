package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public class o2 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.p2 f81958d;

    public o2(com.tencent.mm.plugin.appbrand.jsapi.media.p2 p2Var) {
        this.f81958d = p2Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseImage", "cancel when select source from");
        com.tencent.mm.plugin.appbrand.m6.a(this.f81958d.f81985d.getAppId()).f85713f = false;
        com.tencent.mm.plugin.appbrand.jsapi.media.p2 p2Var = this.f81958d;
        p2Var.f81985d.a(p2Var.f81987f, p2Var.f81989h.o("cancel"));
    }
}
