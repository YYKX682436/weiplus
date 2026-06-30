package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes10.dex */
public class y2 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.d3 f82146d;

    public y2(com.tencent.mm.plugin.appbrand.jsapi.media.d3 d3Var) {
        this.f82146d = d3Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.appbrand.jsapi.media.d3 d3Var = this.f82146d;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$ChooseResult jsApiChooseImage$ChooseResult = d3Var.f81760e;
        jsApiChooseImage$ChooseResult.f81632d = 0;
        d3Var.finishProcess(jsApiChooseImage$ChooseResult);
    }
}
