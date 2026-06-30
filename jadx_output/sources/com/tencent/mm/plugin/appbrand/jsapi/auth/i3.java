package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public class i3 implements th1.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.j3 f79588a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask f79589b;

    public i3(com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask jsApiOperateWXData$OperateWXDataTask, java.lang.String str, com.tencent.mm.plugin.appbrand.jsapi.auth.j3 j3Var) {
        this.f79589b = jsApiOperateWXData$OperateWXDataTask;
        this.f79588a = j3Var;
    }

    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        th1.g gVar = (th1.g) m1Var;
        com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask jsApiOperateWXData$OperateWXDataTask = this.f79589b;
        jsApiOperateWXData$OperateWXDataTask.getClass();
        try {
            o45.ah respObj = gVar.getReqResp().getRespObj();
            jsApiOperateWXData$OperateWXDataTask.f79396x1 = respObj.getProfile();
            jsApiOperateWXData$OperateWXDataTask.f79399y1 = respObj.getMMNativeNetTaskAdapterProfile();
        } catch (java.lang.NullPointerException unused) {
        }
        if (jsApiOperateWXData$OperateWXDataTask.X) {
            jsApiOperateWXData$OperateWXDataTask.f79386p1 = java.lang.System.currentTimeMillis();
        } else {
            jsApiOperateWXData$OperateWXDataTask.f79398y0 = java.lang.System.currentTimeMillis();
        }
        com.tencent.mm.plugin.appbrand.jsapi.auth.j3 j3Var = this.f79588a;
        if (i17 != 0 || i18 != 0) {
            ((com.tencent.mm.plugin.appbrand.jsapi.auth.z2) j3Var).a(java.lang.String.format("cgi fail(%d,%d)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0);
            return;
        }
        if (gVar == null || jsApiOperateWXData$OperateWXDataTask.f79388r == 2) {
            return;
        }
        com.tencent.mm.modelbase.o oVar = gVar.f419320d;
        r45.n24 n24Var = oVar == null ? null : (r45.n24) oVar.f70711b.f70700a;
        r45.j14 j14Var = n24Var.f381015d;
        if (j14Var == null) {
            ((com.tencent.mm.plugin.appbrand.jsapi.auth.z2) j3Var).a("cgi fail response null", 0);
            return;
        }
        int i19 = j14Var.f377491d;
        java.lang.String str2 = j14Var.f377492e;
        r45.jv5 jv5Var = n24Var.f381017f;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (jv5Var != null) {
            linkedList.add(jv5Var);
        }
        java.lang.String str3 = n24Var.f381018g;
        java.lang.String str4 = n24Var.f381019h;
        if (i19 != -12000) {
            if (i19 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiOperateWXData", "onSceneEnd NetSceneJSOperateWxData Failed %s", str2);
                ((com.tencent.mm.plugin.appbrand.jsapi.auth.z2) j3Var).a(str2, i19);
                return;
            }
            com.tencent.mm.protobuf.g gVar2 = n24Var.f381016e;
            if (gVar2 == null) {
                ((com.tencent.mm.plugin.appbrand.jsapi.auth.z2) j3Var).a(com.tencent.map.sdk.comps.vis.VisualLayer.OnLayerStatusChangedListener.LayerStatusMsg.MSG_ERR_INTERNAL_ERROR, i19);
                return;
            }
            java.lang.String i27 = gVar2.i();
            com.tencent.mm.plugin.appbrand.jsapi.auth.z2 z2Var = (com.tencent.mm.plugin.appbrand.jsapi.auth.z2) j3Var;
            z2Var.getClass();
            if (com.tencent.mm.plugin.appbrand.jsapi.auth.k4.f79623g == null) {
                com.tencent.mm.plugin.appbrand.jsapi.auth.k4.f79623g = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_appbrand_android_operatewxdata_ipc_optimization, false));
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiOperateWXData", "isIpcOptimization= %s", com.tencent.mm.plugin.appbrand.jsapi.auth.k4.f79623g);
            boolean booleanValue = com.tencent.mm.plugin.appbrand.jsapi.auth.k4.f79623g.booleanValue();
            com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask jsApiOperateWXData$OperateWXDataTask2 = z2Var.f79808a;
            if (booleanValue) {
                if (i27.getBytes().length < 200000) {
                    jsApiOperateWXData$OperateWXDataTask2.f79384p = null;
                    jsApiOperateWXData$OperateWXDataTask2.f79383o = i27;
                } else {
                    z2Var.b(i27);
                }
                jsApiOperateWXData$OperateWXDataTask2.f79382n = null;
            } else {
                z2Var.b(i27);
            }
            jsApiOperateWXData$OperateWXDataTask2.f79400z = "ok";
            jsApiOperateWXData$OperateWXDataTask2.c();
            return;
        }
        jsApiOperateWXData$OperateWXDataTask.X = true;
        jsApiOperateWXData$OperateWXDataTask.I = n24Var.f381024p;
        jsApiOperateWXData$OperateWXDataTask.K = n24Var.f381023o;
        jsApiOperateWXData$OperateWXDataTask.f79375J = n24Var.f381022n;
        r45.i7 i7Var = n24Var.f381026r;
        if (i7Var != null) {
            jsApiOperateWXData$OperateWXDataTask.L = i7Var.f376773d;
            jsApiOperateWXData$OperateWXDataTask.M = i7Var.f376774e;
            if (k01.j.f303039a.b(null, jsApiOperateWXData$OperateWXDataTask.f79397y)) {
                java.lang.String mPrivacyInfo = jsApiOperateWXData$OperateWXDataTask.M;
                kotlin.jvm.internal.o.g(mPrivacyInfo, "mPrivacyInfo");
                jsApiOperateWXData$OperateWXDataTask.M = r26.i0.t(mPrivacyInfo, "小游戏", "轻游戏", false);
            }
        }
        r45.sv6 sv6Var = n24Var.f381025q;
        if (sv6Var != null) {
            jsApiOperateWXData$OperateWXDataTask.N = new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserAvatarInfo(sv6Var);
        }
        r45.pw6 pw6Var = n24Var.f381027s;
        if (pw6Var != null) {
            jsApiOperateWXData$OperateWXDataTask.P = new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserPrivacyProtectInfo(pw6Var);
        }
        com.tencent.mm.plugin.appbrand.jsapi.auth.z2 z2Var2 = (com.tencent.mm.plugin.appbrand.jsapi.auth.z2) j3Var;
        z2Var2.getClass();
        int size = linkedList.size();
        com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask jsApiOperateWXData$OperateWXDataTask3 = z2Var2.f79808a;
        jsApiOperateWXData$OperateWXDataTask3.G = size;
        int i28 = 0;
        while (true) {
            if (i28 >= jsApiOperateWXData$OperateWXDataTask3.G) {
                break;
            }
            r45.jv5 jv5Var2 = (r45.jv5) linkedList.get(i28);
            try {
                jsApiOperateWXData$OperateWXDataTask3.H.put(i28 + "", jv5Var2.toByteArray());
                i28++;
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiOperateWXData", "IOException %s", e17.getMessage());
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.JsApiOperateWXData", e17, "", new java.lang.Object[0]);
                jsApiOperateWXData$OperateWXDataTask3.f79400z = "fail";
                jsApiOperateWXData$OperateWXDataTask3.c();
                return;
            }
        }
        jsApiOperateWXData$OperateWXDataTask3.D = str3;
        jsApiOperateWXData$OperateWXDataTask3.E = str4;
        jsApiOperateWXData$OperateWXDataTask3.f79400z = "needConfirm";
        if (linkedList.size() <= 0) {
            jsApiOperateWXData$OperateWXDataTask3.c();
            return;
        }
        r45.jv5 jv5Var3 = (r45.jv5) linkedList.get(0);
        java.lang.String str5 = jv5Var3.f378136i;
        jsApiOperateWXData$OperateWXDataTask3.Q = str5 != null ? str5 : "";
        if (!"scope.userInfo".equals(jv5Var3.f378131d)) {
            jsApiOperateWXData$OperateWXDataTask3.c();
            return;
        }
        java.lang.String l17 = c01.z1.l();
        jsApiOperateWXData$OperateWXDataTask3.f79393w = l17;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiOperateWXData", "userNickName=".concat(l17));
        com.tencent.mm.plugin.appbrand.jsapi.auth.c0.f79420a.a(c01.z1.r(), new com.tencent.mm.plugin.appbrand.jsapi.auth.y2(z2Var2));
    }
}
