package com.tencent.mm.plugin.appbrand.backgroundfetch;

/* loaded from: classes7.dex */
public class r0 extends com.tencent.mm.plugin.appbrand.jsapi.o0 {
    private static final int CTRL_INDEX = 523;
    private static final java.lang.String NAME = "onBackgroundFetchData";

    public static void x(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        java.lang.String str = o6Var.f74803n;
        com.tencent.mm.plugin.appbrand.backgroundfetch.p0 p0Var = new com.tencent.mm.plugin.appbrand.backgroundfetch.p0(str);
        com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.B(str, p0Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandOnBackgroundFetchDataEvent", "app start listening background fetched data event, appId:%s", str);
        o6Var.N.a(new com.tencent.mm.plugin.appbrand.backgroundfetch.q0(p0Var));
    }
}
