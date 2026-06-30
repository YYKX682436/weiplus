package com.tencent.mm.plugin.appbrand.ipc;

/* loaded from: classes8.dex */
public class a0 implements android.webkit.ValueCallback {
    public a0(com.tencent.mm.plugin.appbrand.ipc.AppBrandTaskProxyUI appBrandTaskProxyUI) {
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTaskProxyUI", "updateRetCallback onReceiveValue ret = %d", (java.lang.Integer) obj);
    }
}
