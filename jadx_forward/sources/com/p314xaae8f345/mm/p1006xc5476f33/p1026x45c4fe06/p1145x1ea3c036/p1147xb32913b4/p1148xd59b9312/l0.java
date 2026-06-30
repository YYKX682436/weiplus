package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312;

/* loaded from: classes7.dex */
public final class l0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.w {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.t f167189a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.C12403xda2a3ec7 f167190b;

    /* renamed from: c, reason: collision with root package name */
    public final int f167191c;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.t runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        this.f167189a = runtime;
        this.f167191c = hashCode() & 65535;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.tencent.mm.plugin.appbrand.y] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.w
    public void a(java.lang.String invokeData) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.x xVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeData, "invokeData");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.FunctionalAPIInvokeManager.NewSDKInvokeProcess", "performInvoke with instance(" + hashCode() + ") callbackId(" + this.f167191c + ") appId(" + this.f167189a.f156336n + ") data(" + invokeData + ')');
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.C12403xda2a3ec7 c12403xda2a3ec7 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.C12403xda2a3ec7(null, null, null, null, false, 0, null, null, null, null, null, 0, null, null, 16383, null);
        c12403xda2a3ec7.b(new org.json.JSONObject(invokeData));
        this.f167190b = c12403xda2a3ec7;
        java.lang.String str = c12403xda2a3ec7.f167092e;
        java.lang.String str2 = c12403xda2a3ec7.f167093f;
        java.lang.String str3 = c12403xda2a3ec7.f167099o;
        java.lang.String str4 = c12403xda2a3ec7.f167103s;
        if (str4 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.n N2 = this.f167189a.N2();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(N2);
            N2.e3(str4);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.C12403xda2a3ec7 c12403xda2a3ec72 = this.f167190b;
        if (c12403xda2a3ec72 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("newSdkInvokeArgs");
            throw null;
        }
        java.lang.String str5 = c12403xda2a3ec72.f167104t;
        if (str5 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.n N22 = this.f167189a.N2();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(N22);
            N22.p4(str5);
        }
        if (!(str == null || str.length() == 0)) {
            if (!(str2 == null || str2.length() == 0)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.C12403xda2a3ec7 c12403xda2a3ec73 = this.f167190b;
                if (c12403xda2a3ec73 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("newSdkInvokeArgs");
                    throw null;
                }
                if (c12403xda2a3ec73.f167095h) {
                    if (this.f167189a.C0().f(str) != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 C0 = this.f167189a.C0();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(C0, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.FunctionalAppService");
                        xVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.f) C0;
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.n N23 = this.f167189a.N2();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(N23);
                        if (N23.f(str) != null) {
                            xVar = this.f167189a.N2();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(xVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.FunctionalPageView");
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 C02 = this.f167189a.C0();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(C02, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.FunctionalAppService");
                            xVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.f) C02;
                        }
                    }
                } else {
                    if (c12403xda2a3ec73 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("newSdkInvokeArgs");
                        throw null;
                    }
                    java.lang.String str6 = c12403xda2a3ec73.f167094g;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str6, "appservice")) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 C03 = this.f167189a.C0();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(C03, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.FunctionalAppService");
                        xVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.f) C03;
                    } else {
                        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str6, "webview")) {
                            d(str3, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.e.a("fail invalid jsapiType", str));
                            throw new java.lang.RuntimeException();
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 m52174xaf156f4a = this.f167189a.x0().m52174xaf156f4a();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m52174xaf156f4a, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.FunctionalPageView");
                        xVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.n) m52174xaf156f4a;
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.k0 k0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.k0(xVar, str, str2, this);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.C12403xda2a3ec7 c12403xda2a3ec74 = this.f167190b;
                if (c12403xda2a3ec74 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("newSdkInvokeArgs");
                    throw null;
                }
                if (3 == c12403xda2a3ec74.f167096i) {
                    ui1.t.c(new ui1.a0(xVar, str, null, null, this.f167191c), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.j0(k0Var, this, str3, str));
                    return;
                } else {
                    k0Var.mo152xb9724478();
                    return;
                }
            }
        }
        d(str3, "fail invalid args");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.w
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.x component, int i17, java.lang.String callbackStr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callbackStr, "callbackStr");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.FunctionalAPIInvokeManager.NewSDKInvokeProcess", "onPayAheadCallback, instance(" + hashCode() + ", callbackId(" + i17 + "), callbackStr(" + callbackStr + ')');
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.C12403xda2a3ec7 c12403xda2a3ec7 = this.f167190b;
        if (c12403xda2a3ec7 != null) {
            uk0.a.c(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.C12401x11aca2ea(c12403xda2a3ec7, callbackStr), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.i0.f167124d, null, 4, null);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("newSdkInvokeArgs");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.w
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.x component, int i17, java.lang.String data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.FunctionalAPIInvokeManager.NewSDKInvokeProcess", "onCallback, instance(" + hashCode() + ", callbackId(" + i17 + "), data(" + data + ')');
        if (this.f167191c == i17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.C12403xda2a3ec7 c12403xda2a3ec7 = this.f167190b;
            if (c12403xda2a3ec7 != null) {
                d(c12403xda2a3ec7.f167099o, data);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("newSdkInvokeArgs");
                throw null;
            }
        }
    }

    public final void d(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.FunctionalAPIInvokeManager.NewSDKInvokeProcess", "navigateBack, instance(" + hashCode() + ", invokeResult(" + str2 + ')');
        this.f167189a.m(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.d0(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.C12403xda2a3ec7 c12403xda2a3ec7 = this.f167190b;
        if (c12403xda2a3ec7 != null) {
            uk0.a.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.C12401x11aca2ea(c12403xda2a3ec7, str2), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.g0.f167120d, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.h0(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("newSdkInvokeArgs");
            throw null;
        }
    }
}
