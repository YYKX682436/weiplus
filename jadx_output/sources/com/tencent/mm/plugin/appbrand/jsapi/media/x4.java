package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes10.dex */
public class x4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.z4 f82128d;

    public x4(com.tencent.mm.plugin.appbrand.jsapi.media.z4 z4Var) {
        this.f82128d = z4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$ChooseResult jsApiChooseVideo$ChooseResult;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$ChooseResult jsApiChooseVideo$ChooseResult2;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$ChooseResult jsApiChooseVideo$ChooseResult3;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$ChooseResult jsApiChooseVideo$ChooseResult4;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$ChooseRequest jsApiChooseVideo$ChooseRequest;
        com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalVideoObject i17;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$ChooseResult jsApiChooseVideo$ChooseResult5;
        com.tencent.mm.plugin.appbrand.jsapi.media.z4 z4Var = this.f82128d;
        str = z4Var.f82170f;
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str3 = a17.f213279f;
        if (str3 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(m17.a() ? m17.f213266a.F(m17.f213267b) : false)) {
            jsApiChooseVideo$ChooseResult = z4Var.f82168d;
            jsApiChooseVideo$ChooseResult.f81670d = -2;
            jsApiChooseVideo$ChooseResult2 = z4Var.f82168d;
            z4Var.finishProcess(jsApiChooseVideo$ChooseResult2);
            return;
        }
        jsApiChooseVideo$ChooseResult3 = z4Var.f82168d;
        jsApiChooseVideo$ChooseResult3.f81670d = -1;
        jsApiChooseVideo$ChooseResult4 = z4Var.f82168d;
        str2 = z4Var.f82170f;
        jsApiChooseVideo$ChooseRequest = z4Var.f82169e;
        i17 = z4Var.i(str2, jsApiChooseVideo$ChooseRequest.f81669h);
        jsApiChooseVideo$ChooseResult4.f81671e = i17;
        jsApiChooseVideo$ChooseResult5 = z4Var.f82168d;
        z4Var.finishProcess(jsApiChooseVideo$ChooseResult5);
    }
}
