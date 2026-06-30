package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public class l2 implements k80.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.n2 f79626a;

    public l2(com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin$LoginTask jsApiLogin$LoginTask, com.tencent.mm.plugin.appbrand.jsapi.auth.n2 n2Var) {
        this.f79626a = n2Var;
    }

    @Override // k80.j
    public void a(int i17, int i18, java.lang.String str, k80.k kVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLogin", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        java.lang.String str2 = "";
        com.tencent.mm.plugin.appbrand.jsapi.auth.n2 n2Var = this.f79626a;
        if (i17 != 0 || i18 != 0) {
            if (i17 != 4) {
                ((com.tencent.mm.plugin.appbrand.jsapi.auth.h2) n2Var).a(-1, java.lang.String.format("cgi fail(%d,%d)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), new com.tencent.mm.plugin.appbrand.jsapi.errno.AppBrandErrorInfoParcelable(jc1.f.f298924m));
                return;
            }
            com.tencent.mm.plugin.appbrand.jsapi.errno.AppBrandErrorInfoParcelable appBrandErrorInfoParcelable = new com.tencent.mm.plugin.appbrand.jsapi.errno.AppBrandErrorInfoParcelable();
            appBrandErrorInfoParcelable.f80866d = 1000;
            if (kVar != null) {
                bl0.c cVar = (bl0.c) kVar;
                if (cVar.H() != null && cVar.H().f379086d != null && cVar.H().f379086d.f377493f != 0) {
                    appBrandErrorInfoParcelable.f80866d = cVar.H().f379086d.f377493f;
                }
            }
            if (i18 == -3003) {
                appBrandErrorInfoParcelable.f80866d = 1003;
                str2 = "fail:meet server frequency limit";
            }
            ((com.tencent.mm.plugin.appbrand.jsapi.auth.h2) n2Var).a(-1, str2, appBrandErrorInfoParcelable);
            return;
        }
        if (kVar != null) {
            bl0.c cVar2 = (bl0.c) kVar;
            if (cVar2.H() != null && cVar2.H().f379086d != null) {
                r45.l24 H = cVar2.H();
                r45.j14 j14Var = H.f379086d;
                int i19 = j14Var.f377491d;
                java.lang.String str3 = j14Var.f377492e;
                java.lang.String str4 = H.f379095p;
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLogin", "stev NetSceneJSLogin jsErrcode %d", java.lang.Integer.valueOf(i19));
                if (i19 != -12000) {
                    if (i19 == 0) {
                        java.lang.String str5 = H.f379087e;
                        com.tencent.mm.plugin.appbrand.jsapi.auth.h2 h2Var = (com.tencent.mm.plugin.appbrand.jsapi.auth.h2) n2Var;
                        h2Var.getClass();
                        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLogin", "onSuccess !");
                        com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin$LoginTask jsApiLogin$LoginTask = h2Var.f79569a;
                        jsApiLogin$LoginTask.f79364q = str5;
                        jsApiLogin$LoginTask.f79365r = "ok";
                        jsApiLogin$LoginTask.c();
                        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLogin", "resp data code [%s]", str5);
                        return;
                    }
                    com.tencent.mm.plugin.appbrand.jsapi.errno.AppBrandErrorInfoParcelable appBrandErrorInfoParcelable2 = new com.tencent.mm.plugin.appbrand.jsapi.errno.AppBrandErrorInfoParcelable();
                    int i27 = H.f379086d.f377493f;
                    appBrandErrorInfoParcelable2.f80866d = i27;
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLogin", "resp data errno:%d", java.lang.Integer.valueOf(i27));
                    if (i19 == -12001) {
                        ((com.tencent.mm.plugin.appbrand.jsapi.auth.h2) n2Var).a(i19, str3, appBrandErrorInfoParcelable2);
                        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLogin", "onSceneEnd NetSceneJSLogin Invalid Scope %s", str3);
                        return;
                    } else if (i19 == -12002) {
                        ((com.tencent.mm.plugin.appbrand.jsapi.auth.h2) n2Var).a(i19, str3, appBrandErrorInfoParcelable2);
                        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLogin", "onSceneEnd NetSceneJSLogin Invalid Data %s", str3);
                        return;
                    } else if (i19 == -12003) {
                        ((com.tencent.mm.plugin.appbrand.jsapi.auth.h2) n2Var).a(i19, str3, appBrandErrorInfoParcelable2);
                        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLogin", "onSceneEnd NetSceneJSLogin Invalid ApiName %s", str3);
                        return;
                    } else {
                        ((com.tencent.mm.plugin.appbrand.jsapi.auth.h2) n2Var).a(i19, str3, appBrandErrorInfoParcelable2);
                        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLogin", "onSceneEnd NetSceneJSLogin %s", str3);
                        return;
                    }
                }
                java.util.LinkedList linkedList = H.f379088f;
                java.lang.String str6 = H.f379089g;
                java.lang.String str7 = H.f379090h;
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLogin", "stev appName %s, appIconUrl %s", str6, str7);
                com.tencent.mm.plugin.appbrand.jsapi.auth.h2 h2Var2 = (com.tencent.mm.plugin.appbrand.jsapi.auth.h2) n2Var;
                h2Var2.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLogin", "onConfirm !");
                int size = linkedList.size();
                com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin$LoginTask jsApiLogin$LoginTask2 = h2Var2.f79569a;
                jsApiLogin$LoginTask2.f79372y = size;
                for (int i28 = 0; i28 < jsApiLogin$LoginTask2.f79372y; i28++) {
                    r45.jv5 jv5Var = (r45.jv5) linkedList.get(i28);
                    try {
                        jsApiLogin$LoginTask2.f79373z.putByteArray(i28 + "", jv5Var.toByteArray());
                    } catch (java.io.IOException e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLogin", "IOException %s", e17.getMessage());
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiLogin", e17, "", new java.lang.Object[0]);
                        jsApiLogin$LoginTask2.f79365r = "fail";
                        jsApiLogin$LoginTask2.E = new com.tencent.mm.plugin.appbrand.jsapi.errno.AppBrandErrorInfoParcelable(jc1.b.f298875a);
                        jsApiLogin$LoginTask2.c();
                        return;
                    }
                }
                jsApiLogin$LoginTask2.f79369v = str4;
                jsApiLogin$LoginTask2.f79370w = str6;
                jsApiLogin$LoginTask2.f79371x = str7;
                jsApiLogin$LoginTask2.f79365r = "needConfirm";
                jsApiLogin$LoginTask2.c();
                return;
            }
        }
        ((com.tencent.mm.plugin.appbrand.jsapi.auth.h2) n2Var).a(-1, java.lang.String.format("cgi fail response null", new java.lang.Object[0]), new com.tencent.mm.plugin.appbrand.jsapi.errno.AppBrandErrorInfoParcelable(jc1.f.f298925n));
    }
}
