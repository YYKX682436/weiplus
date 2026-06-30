package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class j extends java.util.LinkedHashMap {
    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(java.util.Map.Entry entry) {
        boolean z17 = size() > (com.tencent.mm.plugin.appbrand.ui.t7.h() ? 5 : 3);
        if (z17) {
            com.tencent.mm.plugin.appbrand.o6 o6Var = (com.tencent.mm.plugin.appbrand.o6) entry.getValue();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandBridge", "%s will be removed from sKeepNoRecycleRuntimeMap", o6Var.toString());
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.appbrand.i(this, o6Var));
        }
        return z17;
    }
}
