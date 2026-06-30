package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes7.dex */
class d1 implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.PluginAppBrand", "current not it MM proc");
            return null;
        }
        java.lang.String str = iPCString.f68406d;
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginAppBrand", "try resolve host %s", str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int f17 = com.tencent.mm.network.n.f(str, false, arrayList);
        java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginAppBrand", "resolved dnstype %d iplist %s", java.lang.Integer.valueOf(f17), java.util.Arrays.toString(strArr));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putStringArray("NEW_DNS_IP", strArr);
        return bundle;
    }
}
