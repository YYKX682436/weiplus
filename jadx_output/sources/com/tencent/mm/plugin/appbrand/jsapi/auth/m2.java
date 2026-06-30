package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public class m2 implements k80.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.n2 f79637a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79638b;

    public m2(com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin$LoginTask jsApiLogin$LoginTask, com.tencent.mm.plugin.appbrand.jsapi.auth.n2 n2Var, int i17) {
        this.f79637a = n2Var;
        this.f79638b = i17;
    }

    @Override // k80.l
    public void a(int i17, int i18, java.lang.String str, k80.m mVar) {
        java.lang.String str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLogin", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        com.tencent.mm.plugin.appbrand.jsapi.auth.n2 n2Var = this.f79637a;
        if (i17 != 0 || i18 != 0) {
            if (i17 != 4) {
                ((com.tencent.mm.plugin.appbrand.jsapi.auth.h2) n2Var).a(-1, "confirm cgi fail", new com.tencent.mm.plugin.appbrand.jsapi.errno.AppBrandErrorInfoParcelable(jc1.f.f298924m));
                return;
            }
            com.tencent.mm.plugin.appbrand.jsapi.errno.AppBrandErrorInfoParcelable appBrandErrorInfoParcelable = new com.tencent.mm.plugin.appbrand.jsapi.errno.AppBrandErrorInfoParcelable();
            appBrandErrorInfoParcelable.f80866d = 1000;
            if (mVar != null) {
                bl0.d dVar = (bl0.d) mVar;
                if (dVar.H() != null && dVar.H().f377509d != null && dVar.H().f377509d.f377493f != 0) {
                    appBrandErrorInfoParcelable.f80866d = dVar.H().f377509d.f377493f;
                }
            }
            if (i18 == -3003) {
                appBrandErrorInfoParcelable.f80866d = 1003;
                str2 = "fail:meet server frequency limit";
            } else {
                str2 = "";
            }
            ((com.tencent.mm.plugin.appbrand.jsapi.auth.h2) n2Var).a(-1, str2, appBrandErrorInfoParcelable);
            return;
        }
        if (!(mVar instanceof k80.m)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLogin", "not jslogin cgi reqeust");
            ((com.tencent.mm.plugin.appbrand.jsapi.auth.h2) n2Var).a(-1, com.tencent.map.sdk.comps.vis.VisualLayer.OnLayerStatusChangedListener.LayerStatusMsg.MSG_ERR_INTERNAL_ERROR, new com.tencent.mm.plugin.appbrand.jsapi.errno.AppBrandErrorInfoParcelable(jc1.f.f298915d));
            return;
        }
        if (this.f79638b == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLogin", "press reject button");
            ((com.tencent.mm.plugin.appbrand.jsapi.auth.h2) n2Var).a(i18, "auth deny", new com.tencent.mm.plugin.appbrand.jsapi.errno.AppBrandErrorInfoParcelable(jc1.f.f298921j));
            return;
        }
        r45.j24 H = ((bl0.d) mVar).H();
        r45.j14 j14Var = H.f377509d;
        int i19 = j14Var.f377491d;
        java.lang.String str3 = j14Var.f377492e;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLogin", "stev NetSceneJSLoginConfirm jsErrcode %d", java.lang.Integer.valueOf(i19));
        if (i19 != 0) {
            com.tencent.mm.plugin.appbrand.jsapi.errno.AppBrandErrorInfoParcelable appBrandErrorInfoParcelable2 = new com.tencent.mm.plugin.appbrand.jsapi.errno.AppBrandErrorInfoParcelable();
            appBrandErrorInfoParcelable2.f80866d = H.f377509d.f377493f;
            ((com.tencent.mm.plugin.appbrand.jsapi.auth.h2) n2Var).a(i19, str3, appBrandErrorInfoParcelable2);
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLogin", "onSceneEnd NetSceneJSLoginConfirm %s errnoInfo.errno:%d", str3, java.lang.Integer.valueOf(appBrandErrorInfoParcelable2.f80866d));
            return;
        }
        java.lang.String str4 = H.f377510e;
        com.tencent.mm.plugin.appbrand.jsapi.auth.h2 h2Var = (com.tencent.mm.plugin.appbrand.jsapi.auth.h2) n2Var;
        h2Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLogin", "onSuccess !");
        com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin$LoginTask jsApiLogin$LoginTask = h2Var.f79569a;
        jsApiLogin$LoginTask.f79364q = str4;
        jsApiLogin$LoginTask.f79365r = "ok";
        jsApiLogin$LoginTask.c();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLogin", "resp data code [%s]", str4);
    }
}
