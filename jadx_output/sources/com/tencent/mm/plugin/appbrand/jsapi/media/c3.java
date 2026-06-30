package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes10.dex */
public class c3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f81736d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.d3 f81737e;

    public c3(com.tencent.mm.plugin.appbrand.jsapi.media.d3 d3Var, java.lang.String str) {
        this.f81737e = d3Var;
        this.f81736d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseImage", "take photo, result[%s]", this.f81736d);
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.jsapi.media.b3(this));
    }
}
