package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class o4 implements ui1.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79671a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ km5.b f79672b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f79673c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.u4 f79674d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f79675e;

    public o4(int i17, km5.b bVar, com.tencent.mm.plugin.appbrand.y yVar, com.tencent.mm.plugin.appbrand.jsapi.auth.u4 u4Var, java.lang.String str) {
        this.f79671a = i17;
        this.f79672b = bVar;
        this.f79673c = yVar;
        this.f79674d = u4Var;
        this.f79675e = str;
    }

    @Override // ui1.y
    public void a(int i17, java.util.ArrayList resultData, int i18, boolean z17) {
        kotlin.jvm.internal.o.g(resultData, "resultData");
        com.tencent.mars.xlog.Log.i("Luggage.WXA.JsApiOperateWXDataLU", "dialog onMsg, resultCode[" + i17 + "], callbackId[" + this.f79671a + ']');
        com.tencent.mm.plugin.appbrand.jsapi.auth.r rVar = com.tencent.mm.plugin.appbrand.jsapi.auth.r.f79700a;
        java.lang.String str = this.f79675e;
        km5.b bVar = this.f79672b;
        com.tencent.mm.plugin.appbrand.jsapi.auth.u4 u4Var = this.f79674d;
        com.tencent.mm.plugin.appbrand.y yVar = this.f79673c;
        if (i17 == 1) {
            r45.m24 J2 = com.tencent.mm.plugin.appbrand.jsapi.auth.u4.J(yVar, u4Var, str);
            J2.f380092g = 1;
            J2.f380091f = (java.lang.String) kz5.n0.Z(resultData);
            kotlin.jvm.internal.o.d(bVar);
            int i19 = com.tencent.mm.plugin.appbrand.jsapi.auth.w.f79764q0;
            u4Var.i(bVar, rVar.b(yVar, "/cgi-bin/mmbiz-bin/js-operatewxdata", J2, r45.n24.class));
            return;
        }
        if (i17 != 2) {
            bVar.a(new com.tencent.mm.plugin.appbrand.jsapi.auth.p("fail:auth canceled"));
            return;
        }
        bVar.a(new com.tencent.mm.plugin.appbrand.jsapi.auth.p("fail:auth denied"));
        r45.m24 J3 = com.tencent.mm.plugin.appbrand.jsapi.auth.u4.J(yVar, u4Var, str);
        J3.f380092g = 2;
        int i27 = com.tencent.mm.plugin.appbrand.jsapi.auth.w.f79764q0;
        rVar.b(yVar, "/cgi-bin/mmbiz-bin/js-operatewxdata", J3, r45.n24.class);
    }
}
