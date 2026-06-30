package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public class f3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f79537d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask f79538e;

    public f3(com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask jsApiOperateWXData$OperateWXDataTask, java.util.LinkedList linkedList) {
        this.f79538e = jsApiOperateWXData$OperateWXDataTask;
        this.f79537d = linkedList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList = this.f79537d;
        ui1.b0 b0Var = (ui1.b0) linkedList.getFirst();
        com.tencent.mm.plugin.appbrand.jsapi.auth.a3 a3Var = new com.tencent.mm.plugin.appbrand.jsapi.auth.a3(this);
        com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask jsApiOperateWXData$OperateWXDataTask = this.f79538e;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = jsApiOperateWXData$OperateWXDataTask.f79377g.t3();
        boolean b17 = si1.d1.b(b0Var.f428030a, t37.E0());
        ui1.z a17 = ui1.w.a(jsApiOperateWXData$OperateWXDataTask.f79377g, a3Var, linkedList);
        a17.setAppBrandName(jsApiOperateWXData$OperateWXDataTask.D);
        a17.setRequestDesc(b0Var.f428031b);
        a17.setApplyWording(jsApiOperateWXData$OperateWXDataTask.I);
        a17.setNegativeButtonText(jsApiOperateWXData$OperateWXDataTask.f79375J);
        a17.setPositiveButtonText(jsApiOperateWXData$OperateWXDataTask.K);
        a17.setIconUrl(jsApiOperateWXData$OperateWXDataTask.E);
        boolean z17 = false;
        if ((t37 instanceof com.tencent.mm.plugin.appbrand.o6 ? ((com.tencent.mm.plugin.appbrand.o6) t37).u0().L1.c() : false) || !jsApiOperateWXData$OperateWXDataTask.L || android.text.TextUtils.isEmpty(jsApiOperateWXData$OperateWXDataTask.M)) {
            a17.o(false);
        } else {
            a17.o(true);
            a17.setExplainOnClickListener(new com.tencent.mm.plugin.appbrand.jsapi.auth.b3(this, a17));
        }
        boolean isEmpty = android.text.TextUtils.isEmpty(jsApiOperateWXData$OperateWXDataTask.Q);
        java.lang.String str = b0Var.f428030a;
        if (!isEmpty) {
            a17.setSimpleDetailDesc(jsApiOperateWXData$OperateWXDataTask.Q);
        } else if (b17) {
            if (android.text.TextUtils.isEmpty(si1.d1.a(str, t37))) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiOperateWXData", "error = fail:require permission desc");
                jsApiOperateWXData$OperateWXDataTask.f79377g.a(jsApiOperateWXData$OperateWXDataTask.f79379i, jsApiOperateWXData$OperateWXDataTask.f79376f.o("fail:require permission desc"));
                ((com.tencent.mm.plugin.appbrand.jsapi.auth.x2) jsApiOperateWXData$OperateWXDataTask.f79378h).a();
                return;
            }
            a17.setSimpleDetailDesc(si1.d1.a(str, t37));
        }
        if ("scope.userInfo".equals(str) || "scope.userProfileChange".equals(str)) {
            if (jsApiOperateWXData$OperateWXDataTask.f79377g.t3() instanceof com.tencent.mm.plugin.appbrand.o6) {
                jsApiOperateWXData$OperateWXDataTask.f79392v = ((com.tencent.mm.plugin.appbrand.o6) jsApiOperateWXData$OperateWXDataTask.f79377g.t3()).u0().f47276v;
            }
            if (jsApiOperateWXData$OperateWXDataTask.N != null) {
                com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0 m0Var = new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0(jsApiOperateWXData$OperateWXDataTask.f79377g.getContext(), jsApiOperateWXData$OperateWXDataTask.N, str, new com.tencent.mm.plugin.appbrand.jsapi.auth.c3(this, a17));
                a17.setItemCheckedListener(new com.tencent.mm.plugin.appbrand.jsapi.auth.d3(this, m0Var));
                a17.setOnListItemLongClickListener(new com.tencent.mm.plugin.appbrand.jsapi.auth.e3(this, a17, m0Var));
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.String str2 = jsApiOperateWXData$OperateWXDataTask.f79393w;
                java.lang.String string = jsApiOperateWXData$OperateWXDataTask.f79377g.getContext().getResources().getString(com.tencent.mm.R.string.a07);
                java.lang.String str3 = b0Var.f428030a;
                kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
                java.lang.String str4 = jsApiOperateWXData$OperateWXDataTask.f79394x;
                ((com.tencent.mm.feature.avatar.w) c0Var).getClass();
                arrayList.add(new fl1.h1(0, str2, string, str3, true, com.tencent.mm.modelavatar.z.h(str4, null, false), 0));
                a17.setSelectListItem(arrayList);
            }
        } else {
            a17.setScope(str);
        }
        if (jsApiOperateWXData$OperateWXDataTask.P.f79480d && (!r26.n0.N(r2.f79481e))) {
            z17 = true;
        }
        if (z17) {
            a17.setUserAgreementCheckBoxWording(jsApiOperateWXData$OperateWXDataTask.P.f79481e);
            a17.setIExternalToolsHelper((com.tencent.mm.plugin.appbrand.jsapi.r1) jsApiOperateWXData$OperateWXDataTask.f79377g.q(com.tencent.mm.plugin.appbrand.jsapi.r1.class));
        }
        a17.r(jsApiOperateWXData$OperateWXDataTask.f79377g);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiOperateWXData", "dialog show");
    }
}
