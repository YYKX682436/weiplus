package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class u4 extends com.tencent.mm.plugin.appbrand.jsapi.auth.n0 implements com.tencent.mm.plugin.appbrand.jsapi.auth.w {

    @java.lang.Deprecated
    public static final int CTRL_INDEX = 79;

    @java.lang.Deprecated
    public static final java.lang.String NAME = "operateWXData";

    public static final r45.m24 J(com.tencent.mm.plugin.appbrand.y yVar, com.tencent.mm.plugin.appbrand.jsapi.auth.u4 u4Var, java.lang.String str) {
        r45.m24 m24Var = new r45.m24();
        m24Var.f380089d = yVar.getAppId();
        kotlin.jvm.internal.o.d(str);
        u4Var.getClass();
        byte[] bytes = str.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        m24Var.f380090e = new com.tencent.mm.protobuf.g(bytes, 0, bytes.length);
        m24Var.f380093h = yVar.t3().f74805p.f77281g;
        r45.nd7 nd7Var = new r45.nd7();
        u4Var.c(nd7Var, yVar);
        m24Var.f380094i = nd7Var;
        return m24Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.n0
    public void C(com.tencent.mm.plugin.appbrand.jsapi.ff invokeContext, com.tencent.mm.plugin.appbrand.jsapi.auth.o oVar) {
        kotlin.jvm.internal.o.g(invokeContext, "invokeContext");
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) invokeContext.f81013b;
        java.lang.String optString = invokeContext.f81014c.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, null);
        int i17 = invokeContext.f81016e;
        if (optString == null) {
            yVar.a(i17, o("fail:invalid data"));
            return;
        }
        ((km5.q) com.tencent.mm.plugin.appbrand.jsapi.auth.r.f79700a.b(yVar, "/cgi-bin/mmbiz-bin/js-operatewxdata", J(yVar, this, optString), r45.n24.class).q(new com.tencent.mm.plugin.appbrand.jsapi.auth.q4(yVar, this, i17, optString)).h(new com.tencent.mm.plugin.appbrand.jsapi.auth.r4(yVar, i17, this)).a(new com.tencent.mm.plugin.appbrand.jsapi.auth.s4(oVar))).t(lm5.d.f319600a, new com.tencent.mm.plugin.appbrand.jsapi.auth.t4(oVar, yVar, i17, this));
    }
}
