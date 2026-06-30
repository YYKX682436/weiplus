package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes10.dex */
public class u3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f82086d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f82087e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.v3 f82088f;

    public u3(com.tencent.mm.plugin.appbrand.jsapi.media.v3 v3Var, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        this.f82088f = v3Var;
        this.f82086d = arrayList;
        this.f82087e = arrayList2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest jsApiChooseMedia$ChooseRequest;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult2;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult3;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest jsApiChooseMedia$ChooseRequest2;
        java.lang.String d07;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult4;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult5;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "handle image from album is ok");
        com.tencent.mm.plugin.appbrand.jsapi.media.v3 v3Var = this.f82088f;
        jsApiChooseMedia$ChooseResult = v3Var.f82102g.f82147d;
        jsApiChooseMedia$ChooseResult.f81647d = -1;
        jsApiChooseMedia$ChooseRequest = v3Var.f82102g.f82148e;
        if (jsApiChooseMedia$ChooseRequest.f81639i) {
            jsApiChooseMedia$ChooseResult5 = v3Var.f82102g.f82147d;
            jsApiChooseMedia$ChooseResult5.f81648e = "mix";
        } else {
            jsApiChooseMedia$ChooseResult2 = v3Var.f82102g.f82147d;
            jsApiChooseMedia$ChooseResult2.f81648e = "image";
        }
        jsApiChooseMedia$ChooseResult3 = v3Var.f82102g.f82147d;
        jsApiChooseMedia$ChooseRequest2 = v3Var.f82102g.f82148e;
        d07 = com.tencent.mm.plugin.appbrand.jsapi.media.y3.d0(this.f82086d, this.f82087e, jsApiChooseMedia$ChooseRequest2.f81639i);
        jsApiChooseMedia$ChooseResult3.f81649f = d07;
        com.tencent.mm.plugin.appbrand.jsapi.media.y3 y3Var = v3Var.f82102g;
        jsApiChooseMedia$ChooseResult4 = y3Var.f82147d;
        y3Var.finishProcess(jsApiChooseMedia$ChooseResult4);
    }
}
