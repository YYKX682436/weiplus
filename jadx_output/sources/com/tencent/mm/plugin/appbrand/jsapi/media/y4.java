package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes10.dex */
public class y4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.z4 f82156e;

    public y4(com.tencent.mm.plugin.appbrand.jsapi.media.z4 z4Var, java.lang.String str) {
        this.f82156e = z4Var;
        this.f82155d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$ChooseResult jsApiChooseVideo$ChooseResult;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$ChooseResult jsApiChooseVideo$ChooseResult2;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$ChooseRequest jsApiChooseVideo$ChooseRequest;
        com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalVideoObject i17;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$ChooseResult jsApiChooseVideo$ChooseResult3;
        com.tencent.mm.plugin.appbrand.jsapi.media.z4 z4Var = this.f82156e;
        jsApiChooseVideo$ChooseResult = z4Var.f82168d;
        jsApiChooseVideo$ChooseResult.f81670d = -1;
        jsApiChooseVideo$ChooseResult2 = z4Var.f82168d;
        jsApiChooseVideo$ChooseRequest = z4Var.f82169e;
        i17 = z4Var.i(this.f82155d, jsApiChooseVideo$ChooseRequest.f81669h);
        jsApiChooseVideo$ChooseResult2.f81671e = i17;
        jsApiChooseVideo$ChooseResult3 = z4Var.f82168d;
        z4Var.finishProcess(jsApiChooseVideo$ChooseResult3);
    }
}
