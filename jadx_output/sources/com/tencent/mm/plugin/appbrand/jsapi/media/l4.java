package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes10.dex */
public class l4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f81915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f81916e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f81917f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.o4 f81918g;

    public l4(com.tencent.mm.plugin.appbrand.jsapi.media.o4 o4Var, java.lang.String str, double d17, double d18) {
        this.f81918g = o4Var;
        this.f81915d = str;
        this.f81916e = d17;
        this.f81917f = d18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalVideoObject s17;
        java.lang.String u17;
        java.lang.String w17;
        java.lang.String D;
        com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData x17;
        java.lang.String str = this.f81915d;
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        boolean F = !m17.a() ? false : m17.f213266a.F(m17.f213267b);
        com.tencent.mm.plugin.appbrand.jsapi.media.o4 o4Var = this.f81918g;
        if (!F) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMultiMedia", "take media camera, mVideoFilePath is %s, the file not exist, fail", str);
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseResult jsApiChooseMultiMedia$ChooseResult = o4Var.f81962e;
            jsApiChooseMultiMedia$ChooseResult.f81663d = -2;
            o4Var.finishProcess(jsApiChooseMultiMedia$ChooseResult);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMultiMedia", "take media camera, the mVideoFilePath file exist, success");
        o4Var.f81962e.f81663d = -1;
        s17 = o4Var.s(str, false);
        if (s17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMultiMedia", "addVideoItem fail ,mVideoFilePath is %s", str);
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseResult jsApiChooseMultiMedia$ChooseResult2 = o4Var.f81962e;
            jsApiChooseMultiMedia$ChooseResult2.f81663d = -2;
            o4Var.finishProcess(jsApiChooseMultiMedia$ChooseResult2);
            return;
        }
        u17 = o4Var.u(str);
        java.lang.String r17 = !com.tencent.mm.sdk.platformtools.t8.K0(u17) ? o4Var.r(u17) : "";
        long timeInMillis = java.util.Calendar.getInstance().getTimeInMillis() / 1000;
        double d17 = -1.0d;
        if (i11.b.a(this.f81916e) && i11.b.b(this.f81917f)) {
            x17 = o4Var.x();
            if (x17 != null) {
                d17 = com.tencent.map.geolocation.sapp.TencentLocationUtils.distanceBetween(x17.f192409d, x17.f192410e, this.f81916e, this.f81917f);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiChooseMultiMedia", "calculate X fail, locData is null. video_Path: %s.", str);
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiChooseMultiMedia", "calculate X fail, lat/long is invalid. video_Path: %s.", str);
        }
        w17 = o4Var.w(timeInMillis, d17);
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseResult jsApiChooseMultiMedia$ChooseResult3 = o4Var.f81962e;
        D = com.tencent.mm.plugin.appbrand.jsapi.media.o4.D(s17.f76102d, s17.f76113o, s17.f76114p, s17.f76115q, s17.f76112n, r17, w17);
        jsApiChooseMultiMedia$ChooseResult3.f81664e = D;
        o4Var.finishProcess(o4Var.f81962e);
    }
}
