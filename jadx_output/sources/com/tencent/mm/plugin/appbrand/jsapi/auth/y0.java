package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f79791d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask f79792e;

    public y0(com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask jsApiAuthorize$AuthorizeTask, java.util.LinkedList linkedList) {
        this.f79792e = jsApiAuthorize$AuthorizeTask;
        this.f79791d = linkedList;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        java.util.LinkedList linkedList = this.f79791d;
        r45.jv5 jv5Var = (r45.jv5) linkedList.get(0);
        com.tencent.mm.plugin.appbrand.jsapi.auth.y yVar = new com.tencent.mm.plugin.appbrand.jsapi.auth.y(jv5Var.f378131d);
        com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask jsApiAuthorize$AuthorizeTask = this.f79792e;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = jsApiAuthorize$AuthorizeTask.f79331g.t3();
        boolean b17 = si1.d1.b(jv5Var.f378131d, t37.E0());
        com.tencent.mm.plugin.appbrand.y yVar2 = jsApiAuthorize$AuthorizeTask.f79331g;
        com.tencent.mm.plugin.appbrand.jsapi.auth.z0 z0Var = new com.tencent.mm.plugin.appbrand.jsapi.auth.z0(this, yVar);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.jv5 jv5Var2 = (r45.jv5) it.next();
            kotlin.jvm.internal.o.g(jv5Var2, "<this>");
            arrayList.add(new ui1.b0(jv5Var2.f378131d, jv5Var2.f378132e, jv5Var2.f378133f, jv5Var2.f378134g, jv5Var2.f378135h, jv5Var2.f378136i, jv5Var2.f378137m));
            it = it;
            yVar = yVar;
            b17 = b17;
        }
        final com.tencent.mm.plugin.appbrand.jsapi.auth.y yVar3 = yVar;
        boolean z18 = b17;
        ui1.z a17 = ui1.w.a(yVar2, z0Var, arrayList);
        a17.setAppBrandName(t37.E0().f305841d);
        a17.setApplyWording(jsApiAuthorize$AuthorizeTask.f79345x);
        a17.setRequestDesc(jv5Var.f378132e);
        a17.setNegativeButtonText(jsApiAuthorize$AuthorizeTask.f79346y);
        a17.setPositiveButtonText(jsApiAuthorize$AuthorizeTask.f79347z);
        a17.setIconUrl(jsApiAuthorize$AuthorizeTask.f79344w);
        a17.setIExternalToolsHelper((com.tencent.mm.plugin.appbrand.jsapi.r1) jsApiAuthorize$AuthorizeTask.f79331g.q(com.tencent.mm.plugin.appbrand.jsapi.r1.class));
        if ((t37 instanceof com.tencent.mm.plugin.appbrand.o6 ? ((com.tencent.mm.plugin.appbrand.o6) t37).u0().L1.c() : false) || !jsApiAuthorize$AuthorizeTask.A || android.text.TextUtils.isEmpty(jsApiAuthorize$AuthorizeTask.B)) {
            a17.o(false);
        } else {
            a17.o(true);
            a17.setExplainOnClickListener(new com.tencent.mm.plugin.appbrand.jsapi.auth.a1(this, a17));
        }
        if ("scope.userInfo".equals(jv5Var.f378131d)) {
            com.tencent.mm.plugin.appbrand.jsapi.auth.a0 a0Var = com.tencent.mm.plugin.appbrand.jsapi.auth.c0.f79420a;
            android.content.Context f147807d = jsApiAuthorize$AuthorizeTask.f79331g.getF147807d();
            kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
            java.lang.String str = jsApiAuthorize$AuthorizeTask.C;
            ((com.tencent.mm.feature.avatar.w) c0Var).getClass();
            a0Var.e(f147807d, com.tencent.mm.modelavatar.z.h(str, null, false), jsApiAuthorize$AuthorizeTask.D, jv5Var.f378131d, a17);
            z17 = false;
        } else if (linkedList.size() > 1) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(new fl1.h1(1, ((r45.jv5) linkedList.get(0)).f378137m, ((r45.jv5) linkedList.get(0)).f378131d, true));
            for (int i17 = 1; i17 < linkedList.size(); i17++) {
                arrayList2.add(new fl1.h1(1, ((r45.jv5) linkedList.get(i17)).f378137m, ((r45.jv5) linkedList.get(i17)).f378131d, false));
            }
            z17 = false;
            a17.setFunctionButtonVisibility(8);
            a17.setSelectListItem(arrayList2);
            a17.setScope("");
        } else {
            z17 = false;
            a17.setScope(jv5Var.f378131d);
        }
        if (!android.text.TextUtils.isEmpty(jsApiAuthorize$AuthorizeTask.G)) {
            a17.setSimpleDetailDesc(jsApiAuthorize$AuthorizeTask.G);
        } else if (z18) {
            if (android.text.TextUtils.isEmpty(si1.d1.a(jv5Var.f378131d, t37))) {
                jsApiAuthorize$AuthorizeTask.C("fail:require permission desc");
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAuthorize", "error = fail:require permission desc");
                return;
            }
            a17.setSimpleDetailDesc(si1.d1.a(jv5Var.f378131d, t37));
        }
        if (jsApiAuthorize$AuthorizeTask.P.f79480d && (!r26.n0.N(r1.f79481e))) {
            z17 = true;
        }
        if (z17) {
            a17.setUserAgreementCheckBoxWording(jsApiAuthorize$AuthorizeTask.P.f79481e);
            yVar3.f79788b = true;
            a17.setUserAgreementCheckedAlertListener(new fl1.j2() { // from class: com.tencent.mm.plugin.appbrand.jsapi.auth.y0$$a
                @Override // fl1.j2
                public final void a() {
                    com.tencent.mm.plugin.appbrand.jsapi.auth.y.this.f79789c = true;
                }
            });
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAuthorize", "Confirm dialog scope=%s desc =%s auth_desc=%s ext_desc=%s", jv5Var.f378131d, jv5Var.f378132e, jv5Var.f378135h, jv5Var.f378134g);
        jsApiAuthorize$AuthorizeTask.R = true;
        a17.r(jsApiAuthorize$AuthorizeTask.f79331g);
    }
}
