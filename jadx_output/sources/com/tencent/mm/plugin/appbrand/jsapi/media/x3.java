package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes10.dex */
public class x3 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.y3 f82127d;

    public x3(com.tencent.mm.plugin.appbrand.jsapi.media.y3 y3Var) {
        this.f82127d = y3Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult2;
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "cancel show the progress dialog and finish progress");
        com.tencent.mm.plugin.appbrand.jsapi.media.y3 y3Var = this.f82127d;
        jsApiChooseMedia$ChooseResult = y3Var.f82147d;
        jsApiChooseMedia$ChooseResult.f81647d = 0;
        jsApiChooseMedia$ChooseResult2 = y3Var.f82147d;
        y3Var.finishProcess(jsApiChooseMedia$ChooseResult2);
    }
}
