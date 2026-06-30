package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes10.dex */
public class s3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f82038d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f82039e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f82040f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f82041g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f82042h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.t3 f82043i;

    public s3(com.tencent.mm.plugin.appbrand.jsapi.media.t3 t3Var, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3, java.util.ArrayList arrayList4, java.util.ArrayList arrayList5) {
        this.f82043i = t3Var;
        this.f82038d = arrayList;
        this.f82039e = arrayList2;
        this.f82040f = arrayList3;
        this.f82041g = arrayList4;
        this.f82042h = arrayList5;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult2;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest jsApiChooseMedia$ChooseRequest;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult3;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest jsApiChooseMedia$ChooseRequest2;
        java.lang.String d07;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult4;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult5;
        java.lang.String c07;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "handle image from album is ok");
        com.tencent.mm.plugin.appbrand.jsapi.media.t3 t3Var = this.f82043i;
        jsApiChooseMedia$ChooseResult = t3Var.f82072h.f82147d;
        jsApiChooseMedia$ChooseResult.f81647d = -1;
        jsApiChooseMedia$ChooseResult2 = t3Var.f82072h.f82147d;
        jsApiChooseMedia$ChooseResult2.f81648e = "image";
        jsApiChooseMedia$ChooseRequest = t3Var.f82072h.f82148e;
        boolean z17 = jsApiChooseMedia$ChooseRequest.f81643p;
        java.util.ArrayList arrayList = this.f82039e;
        java.util.ArrayList arrayList2 = this.f82038d;
        if (z17) {
            jsApiChooseMedia$ChooseResult5 = t3Var.f82072h.f82147d;
            c07 = com.tencent.mm.plugin.appbrand.jsapi.media.y3.c0(arrayList2, arrayList, this.f82040f, this.f82041g, this.f82042h);
            jsApiChooseMedia$ChooseResult5.f81649f = c07;
        } else {
            jsApiChooseMedia$ChooseResult3 = t3Var.f82072h.f82147d;
            jsApiChooseMedia$ChooseRequest2 = t3Var.f82072h.f82148e;
            d07 = com.tencent.mm.plugin.appbrand.jsapi.media.y3.d0(arrayList2, arrayList, jsApiChooseMedia$ChooseRequest2.f81639i);
            jsApiChooseMedia$ChooseResult3.f81649f = d07;
        }
        com.tencent.mm.plugin.appbrand.jsapi.media.y3 y3Var = t3Var.f82072h;
        jsApiChooseMedia$ChooseResult4 = y3Var.f82147d;
        y3Var.finishProcess(jsApiChooseMedia$ChooseResult4);
    }
}
