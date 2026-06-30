package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* loaded from: classes7.dex */
public class k extends com.tencent.mm.plugin.appbrand.jsapi.appdownload.i {
    public static final int CTRL_INDEX = 662;
    public static final java.lang.String NAME = "onDownloadAppStateChangeForNative";

    public static void B(com.tencent.mm.plugin.appbrand.e9 e9Var) {
        if (com.tencent.mm.plugin.appbrand.jsapi.appdownload.i.f78958m.containsKey(e9Var.getAppId())) {
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.appdownload.k kVar = new com.tencent.mm.plugin.appbrand.jsapi.appdownload.k();
        kVar.y(e9Var);
        com.tencent.mm.plugin.appbrand.jsapi.appdownload.i.x(e9Var, kVar);
    }
}
