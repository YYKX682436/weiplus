package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class r4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f79721a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79722b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.u4 f79723c;

    public r4(com.tencent.mm.plugin.appbrand.y yVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.auth.u4 u4Var) {
        this.f79721a = yVar;
        this.f79722b = i17;
        this.f79723c = u4Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.j14 j14Var;
        r45.n24 n24Var = (r45.n24) obj;
        jz5.f0 f0Var = null;
        java.lang.Integer valueOf = (n24Var == null || (j14Var = n24Var.f381015d) == null) ? null : java.lang.Integer.valueOf(j14Var.f377491d);
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        com.tencent.mm.plugin.appbrand.jsapi.auth.u4 u4Var = this.f79723c;
        int i17 = this.f79722b;
        com.tencent.mm.plugin.appbrand.y yVar = this.f79721a;
        if (valueOf != null && valueOf.intValue() == 0) {
            com.tencent.mm.protobuf.g gVar = n24Var.f381016e;
            if (gVar != null) {
                java.lang.String i18 = gVar.i();
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, i18);
                yVar.a(i17, u4Var.p("ok", hashMap));
                f0Var = f0Var2;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.e("Luggage.WXA.JsApiOperateWXDataLU", "response ok but data is NULL, appId[" + yVar.getAppId() + "], callbackId[" + i17 + ']');
                yVar.a(i17, u4Var.o("fail invalid response"));
            }
        } else if (valueOf == null) {
            yVar.a(i17, u4Var.o("fail invalid response"));
        } else {
            yVar.a(i17, u4Var.o("fail response errcode=" + valueOf + " errmsg=" + n24Var.f381015d.f377492e));
        }
        return f0Var2;
    }
}
