package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes10.dex */
public class z2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f82164d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.a3 f82165e;

    public z2(com.tencent.mm.plugin.appbrand.jsapi.media.a3 a3Var, java.util.ArrayList arrayList) {
        this.f82165e = a3Var;
        this.f82164d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.media.d3 d3Var = this.f82165e.f81694h;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$ChooseResult jsApiChooseImage$ChooseResult = d3Var.f81760e;
        jsApiChooseImage$ChooseResult.f81632d = -1;
        jsApiChooseImage$ChooseResult.f81633e = this.f82164d;
        d3Var.finishProcess(jsApiChooseImage$ChooseResult);
    }
}
