package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes10.dex */
public class r3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f82023d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f82024e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.y3 f82025f;

    public r3(com.tencent.mm.plugin.appbrand.jsapi.media.y3 y3Var, java.util.ArrayList arrayList, boolean z17) {
        this.f82025f = y3Var;
        this.f82023d = arrayList;
        this.f82024e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult2;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult3;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult4;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult5;
        com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalVideoObject O;
        java.lang.String N;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult6;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult7;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult8;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult9;
        java.lang.String str4;
        com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalVideoObject O2;
        java.lang.String str5;
        java.lang.String N2;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult10;
        java.lang.String e07;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult11;
        java.lang.String str6;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult12;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult13;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult14;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult15;
        java.util.ArrayList arrayList = this.f82023d;
        int size = arrayList.size();
        boolean z17 = this.f82024e;
        int i17 = -1;
        com.tencent.mm.vfs.z2 z2Var = null;
        com.tencent.mm.plugin.appbrand.jsapi.media.y3 y3Var = this.f82025f;
        if (size != 1) {
            if (arrayList.size() > 1) {
                jsApiChooseMedia$ChooseResult = y3Var.f82147d;
                jsApiChooseMedia$ChooseResult.f81647d = -2;
                org.json.JSONStringer jSONStringer = new org.json.JSONStringer();
                try {
                    jSONStringer.array();
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        java.lang.String str7 = (java.lang.String) it.next();
                        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str7);
                        java.lang.String str8 = a17.f213279f;
                        if (str8 != null) {
                            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str8, r8, r8);
                            if (!str8.equals(l17)) {
                                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                            }
                        }
                        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, z2Var);
                        if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "take media local, the path file exist, success, path:%s", str7);
                            jsApiChooseMedia$ChooseResult4 = y3Var.f82147d;
                            jsApiChooseMedia$ChooseResult4.f81647d = i17;
                            jsApiChooseMedia$ChooseResult5 = y3Var.f82147d;
                            jsApiChooseMedia$ChooseResult5.f81648e = "video";
                            O = y3Var.O(str7, z17);
                            if (O == null) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "addVideoItem fail ,videoFilePath is %s", str7);
                                r8 = false;
                            } else {
                                y3Var.T(str7);
                                N = y3Var.N();
                                com.tencent.mm.plugin.appbrand.jsapi.media.y3.d(jSONStringer, O.f76102d, N, O.f76112n, O.f76115q, O.f76114p, O.f76113o);
                            }
                        } else {
                            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "take media local, videoFilePath is %s, the file not exist, fail", str7);
                        }
                        i17 = -1;
                        z2Var = null;
                        r8 = false;
                    }
                    jSONStringer.endArray();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiChooseMedia", e17, "", new java.lang.Object[0]);
                }
                jsApiChooseMedia$ChooseResult2 = y3Var.f82147d;
                jsApiChooseMedia$ChooseResult2.f81649f = jSONStringer.toString();
                jsApiChooseMedia$ChooseResult3 = y3Var.f82147d;
                y3Var.finishProcess(jsApiChooseMedia$ChooseResult3);
                return;
            }
            return;
        }
        y3Var.f82149f = com.tencent.mm.vfs.w6.i((java.lang.String) arrayList.get(0), false);
        str = y3Var.f82149f;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "take media local, mVideoFilePath is  null, fail");
            jsApiChooseMedia$ChooseResult14 = y3Var.f82147d;
            jsApiChooseMedia$ChooseResult14.f81647d = -2;
            jsApiChooseMedia$ChooseResult15 = y3Var.f82147d;
            y3Var.finishProcess(jsApiChooseMedia$ChooseResult15);
            return;
        }
        str2 = y3Var.f82149f;
        com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(str2);
        java.lang.String str9 = a18.f213279f;
        if (str9 != null) {
            java.lang.String l18 = com.tencent.mm.vfs.e8.l(str9, false, false);
            if (!str9.equals(l18)) {
                a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l18, a18.f213280g, a18.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
        if (!(m18.a() ? m18.f213266a.F(m18.f213267b) : false)) {
            str3 = y3Var.f82149f;
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "take media local, mVideoFilePath is %s, the file not exist, fail", str3);
            jsApiChooseMedia$ChooseResult6 = y3Var.f82147d;
            jsApiChooseMedia$ChooseResult6.f81647d = -2;
            jsApiChooseMedia$ChooseResult7 = y3Var.f82147d;
            y3Var.finishProcess(jsApiChooseMedia$ChooseResult7);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "take media local, the mVideoFilePath file exist, success");
        jsApiChooseMedia$ChooseResult8 = y3Var.f82147d;
        jsApiChooseMedia$ChooseResult8.f81647d = -1;
        jsApiChooseMedia$ChooseResult9 = y3Var.f82147d;
        jsApiChooseMedia$ChooseResult9.f81648e = "video";
        str4 = y3Var.f82149f;
        O2 = y3Var.O(str4, z17);
        if (O2 == null) {
            str6 = y3Var.f82149f;
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "addVideoItem fail ,mVideoFilePath is %s", str6);
            jsApiChooseMedia$ChooseResult12 = y3Var.f82147d;
            jsApiChooseMedia$ChooseResult12.f81647d = -2;
            jsApiChooseMedia$ChooseResult13 = y3Var.f82147d;
            y3Var.finishProcess(jsApiChooseMedia$ChooseResult13);
            return;
        }
        str5 = y3Var.f82149f;
        y3Var.T(str5);
        N2 = y3Var.N();
        jsApiChooseMedia$ChooseResult10 = y3Var.f82147d;
        e07 = com.tencent.mm.plugin.appbrand.jsapi.media.y3.e0(O2.f76102d, N2, O2.f76112n, O2.f76115q, O2.f76114p, O2.f76113o);
        jsApiChooseMedia$ChooseResult10.f81649f = e07;
        jsApiChooseMedia$ChooseResult11 = y3Var.f82147d;
        y3Var.finishProcess(jsApiChooseMedia$ChooseResult11);
    }
}
