package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
public class k1 extends com.tencent.mm.plugin.appbrand.jsapi.lbs.j1 {

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.lbs.c1 f81449v;

    /* renamed from: w, reason: collision with root package name */
    public u81.f f81450w;

    public void q(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        com.tencent.mm.plugin.appbrand.jsapi.lbs.c1 c1Var = this.f81449v;
        if (c1Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LbsBlinkHelper", "stopBlinkSubTitleImmediately");
            ik1.h0.b(new com.tencent.mm.plugin.appbrand.jsapi.lbs.b1(c1Var));
        }
        if (appBrandRuntime != null && this.f81450w != null) {
            appBrandRuntime.N.c(this.f81450w);
        }
        this.f81449v = null;
        this.f81450w = null;
        this.f81442r = null;
    }
}
