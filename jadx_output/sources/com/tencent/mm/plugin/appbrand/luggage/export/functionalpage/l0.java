package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage;

/* loaded from: classes7.dex */
public final class l0 implements com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.w {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.t f85656a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage f85657b;

    /* renamed from: c, reason: collision with root package name */
    public final int f85658c;

    public l0(com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.t runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        this.f85656a = runtime;
        this.f85658c = hashCode() & 65535;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.tencent.mm.plugin.appbrand.y] */
    @Override // com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.w
    public void a(java.lang.String invokeData) {
        com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.x xVar;
        kotlin.jvm.internal.o.g(invokeData, "invokeData");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.FunctionalAPIInvokeManager.NewSDKInvokeProcess", "performInvoke with instance(" + hashCode() + ") callbackId(" + this.f85658c + ") appId(" + this.f85656a.f74803n + ") data(" + invokeData + ')');
        com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage wechatNativeExtraDataInvokeFunctionalPage = new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage(null, null, null, null, false, 0, null, null, null, null, null, 0, null, null, 16383, null);
        wechatNativeExtraDataInvokeFunctionalPage.b(new org.json.JSONObject(invokeData));
        this.f85657b = wechatNativeExtraDataInvokeFunctionalPage;
        java.lang.String str = wechatNativeExtraDataInvokeFunctionalPage.f85559e;
        java.lang.String str2 = wechatNativeExtraDataInvokeFunctionalPage.f85560f;
        java.lang.String str3 = wechatNativeExtraDataInvokeFunctionalPage.f85566o;
        java.lang.String str4 = wechatNativeExtraDataInvokeFunctionalPage.f85570s;
        if (str4 != null) {
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.n N2 = this.f85656a.N2();
            kotlin.jvm.internal.o.d(N2);
            N2.e3(str4);
        }
        com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage wechatNativeExtraDataInvokeFunctionalPage2 = this.f85657b;
        if (wechatNativeExtraDataInvokeFunctionalPage2 == null) {
            kotlin.jvm.internal.o.o("newSdkInvokeArgs");
            throw null;
        }
        java.lang.String str5 = wechatNativeExtraDataInvokeFunctionalPage2.f85571t;
        if (str5 != null) {
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.n N22 = this.f85656a.N2();
            kotlin.jvm.internal.o.d(N22);
            N22.p4(str5);
        }
        if (!(str == null || str.length() == 0)) {
            if (!(str2 == null || str2.length() == 0)) {
                com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage wechatNativeExtraDataInvokeFunctionalPage3 = this.f85657b;
                if (wechatNativeExtraDataInvokeFunctionalPage3 == null) {
                    kotlin.jvm.internal.o.o("newSdkInvokeArgs");
                    throw null;
                }
                if (wechatNativeExtraDataInvokeFunctionalPage3.f85562h) {
                    if (this.f85656a.C0().f(str) != null) {
                        com.tencent.mm.plugin.appbrand.service.c0 C0 = this.f85656a.C0();
                        kotlin.jvm.internal.o.e(C0, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.FunctionalAppService");
                        xVar = (com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.f) C0;
                    } else {
                        com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.n N23 = this.f85656a.N2();
                        kotlin.jvm.internal.o.d(N23);
                        if (N23.f(str) != null) {
                            xVar = this.f85656a.N2();
                            kotlin.jvm.internal.o.e(xVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.FunctionalPageView");
                        } else {
                            com.tencent.mm.plugin.appbrand.service.c0 C02 = this.f85656a.C0();
                            kotlin.jvm.internal.o.e(C02, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.FunctionalAppService");
                            xVar = (com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.f) C02;
                        }
                    }
                } else {
                    if (wechatNativeExtraDataInvokeFunctionalPage3 == null) {
                        kotlin.jvm.internal.o.o("newSdkInvokeArgs");
                        throw null;
                    }
                    java.lang.String str6 = wechatNativeExtraDataInvokeFunctionalPage3.f85561g;
                    if (kotlin.jvm.internal.o.b(str6, "appservice")) {
                        com.tencent.mm.plugin.appbrand.service.c0 C03 = this.f85656a.C0();
                        kotlin.jvm.internal.o.e(C03, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.FunctionalAppService");
                        xVar = (com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.f) C03;
                    } else {
                        if (!kotlin.jvm.internal.o.b(str6, "webview")) {
                            d(str3, com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.e.a("fail invalid jsapiType", str));
                            throw new java.lang.RuntimeException();
                        }
                        com.tencent.mm.plugin.appbrand.page.v5 pageView = this.f85656a.x0().getPageView();
                        kotlin.jvm.internal.o.e(pageView, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.FunctionalPageView");
                        xVar = (com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.n) pageView;
                    }
                }
                com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.k0 k0Var = new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.k0(xVar, str, str2, this);
                com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage wechatNativeExtraDataInvokeFunctionalPage4 = this.f85657b;
                if (wechatNativeExtraDataInvokeFunctionalPage4 == null) {
                    kotlin.jvm.internal.o.o("newSdkInvokeArgs");
                    throw null;
                }
                if (3 == wechatNativeExtraDataInvokeFunctionalPage4.f85563i) {
                    ui1.t.c(new ui1.a0(xVar, str, null, null, this.f85658c), new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.j0(k0Var, this, str3, str));
                    return;
                } else {
                    k0Var.invoke();
                    return;
                }
            }
        }
        d(str3, "fail invalid args");
    }

    @Override // com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.w
    public void b(com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.x component, int i17, java.lang.String callbackStr) {
        kotlin.jvm.internal.o.g(component, "component");
        kotlin.jvm.internal.o.g(callbackStr, "callbackStr");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.FunctionalAPIInvokeManager.NewSDKInvokeProcess", "onPayAheadCallback, instance(" + hashCode() + ", callbackId(" + i17 + "), callbackStr(" + callbackStr + ')');
        com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage wechatNativeExtraDataInvokeFunctionalPage = this.f85657b;
        if (wechatNativeExtraDataInvokeFunctionalPage != null) {
            uk0.a.c(new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.NewSDKInvokeProcess$NewSdkInvokeBackData(wechatNativeExtraDataInvokeFunctionalPage, callbackStr), com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.i0.f85591d, null, 4, null);
        } else {
            kotlin.jvm.internal.o.o("newSdkInvokeArgs");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.w
    public void c(com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.x component, int i17, java.lang.String data) {
        kotlin.jvm.internal.o.g(component, "component");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.FunctionalAPIInvokeManager.NewSDKInvokeProcess", "onCallback, instance(" + hashCode() + ", callbackId(" + i17 + "), data(" + data + ')');
        if (this.f85658c == i17) {
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage wechatNativeExtraDataInvokeFunctionalPage = this.f85657b;
            if (wechatNativeExtraDataInvokeFunctionalPage != null) {
                d(wechatNativeExtraDataInvokeFunctionalPage.f85566o, data);
            } else {
                kotlin.jvm.internal.o.o("newSdkInvokeArgs");
                throw null;
            }
        }
    }

    public final void d(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.FunctionalAPIInvokeManager.NewSDKInvokeProcess", "navigateBack, instance(" + hashCode() + ", invokeResult(" + str2 + ')');
        this.f85656a.m(new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.d0(this));
        com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage wechatNativeExtraDataInvokeFunctionalPage = this.f85657b;
        if (wechatNativeExtraDataInvokeFunctionalPage != null) {
            uk0.a.b(new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.NewSDKInvokeProcess$NewSdkInvokeBackData(wechatNativeExtraDataInvokeFunctionalPage, str2), com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.g0.f85587d, new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.h0(this));
        } else {
            kotlin.jvm.internal.o.o("newSdkInvokeArgs");
            throw null;
        }
    }
}
