package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes10.dex */
public class m4 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.o4 f81941d;

    public m4(com.tencent.mm.plugin.appbrand.jsapi.media.o4 o4Var) {
        this.f81941d = o4Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMultiMedia", "cancel show the progress dialog and finish progress");
        com.tencent.mm.plugin.appbrand.jsapi.media.o4 o4Var = this.f81941d;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseResult jsApiChooseMultiMedia$ChooseResult = o4Var.f81962e;
        jsApiChooseMultiMedia$ChooseResult.f81663d = 0;
        o4Var.finishProcess(jsApiChooseMultiMedia$ChooseResult);
    }
}
