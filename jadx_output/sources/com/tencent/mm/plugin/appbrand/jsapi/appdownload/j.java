package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* loaded from: classes7.dex */
public class j extends com.tencent.mm.plugin.appbrand.jsapi.appdownload.i {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "onDownloadAppStateChange";

    public static void B(com.tencent.mm.plugin.appbrand.e9 e9Var) {
        if (com.tencent.mm.plugin.appbrand.jsapi.appdownload.i.f78958m.containsKey(e9Var.getAppId())) {
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.appdownload.j jVar = new com.tencent.mm.plugin.appbrand.jsapi.appdownload.j();
        jVar.y(e9Var);
        com.tencent.mm.plugin.appbrand.jsapi.appdownload.i.x(e9Var, jVar);
    }
}
