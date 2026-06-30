package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes10.dex */
public class w3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.y3 f82112d;

    public w3(com.tencent.mm.plugin.appbrand.jsapi.media.y3 y3Var) {
        this.f82112d = y3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult2;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult3;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest jsApiChooseMedia$ChooseRequest;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult4;
        java.lang.String str3;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest jsApiChooseMedia$ChooseRequest2;
        com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalVideoObject O;
        java.lang.String str4;
        java.lang.String N;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult5;
        java.lang.String e07;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult6;
        java.lang.String str5;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult7;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult8;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult9;
        com.tencent.mm.plugin.appbrand.jsapi.media.y3 y3Var = this.f82112d;
        str = y3Var.f82149f;
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str6 = a17.f213279f;
        if (str6 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str6, false, false);
            if (!str6.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(m17.a() ? m17.f213266a.F(m17.f213267b) : false)) {
            str2 = y3Var.f82149f;
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "take media camera, mVideoFilePath is %s, the file not exist, fail", str2);
            jsApiChooseMedia$ChooseResult = y3Var.f82147d;
            jsApiChooseMedia$ChooseResult.f81647d = -2;
            jsApiChooseMedia$ChooseResult2 = y3Var.f82147d;
            y3Var.finishProcess(jsApiChooseMedia$ChooseResult2);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "take media camera, the mVideoFilePath file exist, success");
        jsApiChooseMedia$ChooseResult3 = y3Var.f82147d;
        jsApiChooseMedia$ChooseResult3.f81647d = -1;
        jsApiChooseMedia$ChooseRequest = y3Var.f82148e;
        if (jsApiChooseMedia$ChooseRequest.f81639i) {
            jsApiChooseMedia$ChooseResult9 = y3Var.f82147d;
            jsApiChooseMedia$ChooseResult9.f81648e = "mix";
        } else {
            jsApiChooseMedia$ChooseResult4 = y3Var.f82147d;
            jsApiChooseMedia$ChooseResult4.f81648e = "video";
        }
        str3 = y3Var.f82149f;
        jsApiChooseMedia$ChooseRequest2 = y3Var.f82148e;
        O = y3Var.O(str3, jsApiChooseMedia$ChooseRequest2.f81644q);
        if (O == null) {
            str5 = y3Var.f82149f;
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "addVideoItem fail ,mVideoFilePath is %s", str5);
            jsApiChooseMedia$ChooseResult7 = y3Var.f82147d;
            jsApiChooseMedia$ChooseResult7.f81647d = -2;
            jsApiChooseMedia$ChooseResult8 = y3Var.f82147d;
            y3Var.finishProcess(jsApiChooseMedia$ChooseResult8);
            return;
        }
        str4 = y3Var.f82149f;
        y3Var.T(str4);
        N = y3Var.N();
        jsApiChooseMedia$ChooseResult5 = y3Var.f82147d;
        e07 = com.tencent.mm.plugin.appbrand.jsapi.media.y3.e0(O.f76102d, N, O.f76112n, O.f76115q, O.f76114p, O.f76113o);
        jsApiChooseMedia$ChooseResult5.f81649f = e07;
        jsApiChooseMedia$ChooseResult6 = y3Var.f82147d;
        y3Var.finishProcess(jsApiChooseMedia$ChooseResult6);
    }
}
