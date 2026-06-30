package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes7.dex */
public class g8 implements java.lang.Runnable {
    public g8(com.tencent.mm.plugin.appbrand.app.PluginAppBrand pluginAppBrand) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.app.wa waVar = new com.tencent.mm.plugin.appbrand.app.wa();
        if (pd.e.f353437a != null) {
            com.tencent.mars.xlog.Log.e("Luggage.LuggageBoot", "do not setup more than once.");
        } else {
            pd.e.f353437a = waVar;
            waVar.b(new pd.a());
        }
    }
}
