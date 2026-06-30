package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes10.dex */
public class k4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f81890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f81891e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f81892f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f81893g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.o4 f81894h;

    public k4(com.tencent.mm.plugin.appbrand.jsapi.media.o4 o4Var, boolean z17, java.lang.String str, double d17, double d18) {
        this.f81894h = o4Var;
        this.f81890d = z17;
        this.f81891e = str;
        this.f81892f = d17;
        this.f81893g = d18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.media.o4 o4Var;
        java.lang.String w17;
        java.lang.String C;
        com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData x17;
        java.lang.String str = this.f81891e;
        com.tencent.mm.plugin.appbrand.jsapi.media.o4 o4Var2 = this.f81894h;
        boolean z17 = this.f81890d;
        java.lang.String t17 = z17 ? o4Var2.t(str) : str;
        com.tencent.mm.plugin.appbrand.jsapi.media.p4 C2 = com.tencent.mm.plugin.appbrand.jsapi.media.q4.C(t17);
        com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject b17 = com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager.b(o4Var2.f81961d.f81650d, t17, null, z17 | true);
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMultiMedia", "handle image from mm-sight camera, get null obj from path: %s", str);
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseResult jsApiChooseMultiMedia$ChooseResult = o4Var2.f81962e;
            jsApiChooseMultiMedia$ChooseResult.f81663d = -2;
            o4Var2.finishProcess(jsApiChooseMultiMedia$ChooseResult);
            return;
        }
        long timeInMillis = java.util.Calendar.getInstance().getTimeInMillis() / 1000;
        double d17 = -1.0d;
        if (i11.b.a(this.f81892f) && i11.b.b(this.f81893g)) {
            x17 = o4Var2.x();
            if (x17 != null) {
                o4Var = o4Var2;
                d17 = com.tencent.map.geolocation.sapp.TencentLocationUtils.distanceBetween(x17.f192409d, x17.f192410e, this.f81892f, this.f81893g);
            } else {
                o4Var = o4Var2;
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiChooseMultiMedia", "calculate X fail, locData is null. pic_Path: %s.", str);
            }
        } else {
            o4Var = o4Var2;
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiChooseMultiMedia", "calculate X fail, lat/long is invalid. pic_Path: %s.", str);
        }
        w17 = o4Var.w(timeInMillis, d17);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMultiMedia", "handle image from mm-sight is done.");
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseResult jsApiChooseMultiMedia$ChooseResult2 = o4Var.f81962e;
        jsApiChooseMultiMedia$ChooseResult2.f81663d = -1;
        C = com.tencent.mm.plugin.appbrand.jsapi.media.o4.C(b17.f76102d, b17.f76107i, C2.f81991a, C2.f81992b, C2.f81993c, w17);
        jsApiChooseMultiMedia$ChooseResult2.f81664e = C;
        o4Var.finishProcess(o4Var.f81962e);
    }
}
