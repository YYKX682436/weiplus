package com.tencent.mm.advertise.impl.jsapi;

/* loaded from: classes.dex */
public final class l extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return com.tencent.mm.plugin.appbrand.ad.jsapi.c.NAME;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("slotid");
        java.lang.String instanceName = e().f344331a;
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        java.lang.String s07 = r26.n0.s0(instanceName, "-", instanceName);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            s().invoke(i(lc3.x.f317937d));
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.w9.f193053a;
        kotlin.jvm.internal.o.d(optString);
        com.tencent.mm.ipcinvoker.extension.l.a(str, new com.tencent.mm.advertise.impl.jsapi.MBJsApiClearAdPushMsg$RequestType(optString, s07), com.tencent.mm.advertise.impl.jsapi.i.class, new com.tencent.mm.advertise.impl.jsapi.k(this));
    }
}
