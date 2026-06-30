package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes10.dex */
public class w4 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.z4 f82113d;

    public w4(com.tencent.mm.plugin.appbrand.jsapi.media.z4 z4Var) {
        this.f82113d = z4Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$ChooseResult jsApiChooseVideo$ChooseResult;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$ChooseResult jsApiChooseVideo$ChooseResult2;
        com.tencent.mm.plugin.appbrand.jsapi.media.z4 z4Var = this.f82113d;
        jsApiChooseVideo$ChooseResult = z4Var.f82168d;
        jsApiChooseVideo$ChooseResult.f81670d = 0;
        jsApiChooseVideo$ChooseResult2 = z4Var.f82168d;
        z4Var.finishProcess(jsApiChooseVideo$ChooseResult2);
    }
}
