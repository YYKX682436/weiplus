package com.tencent.mm.plugin.appbrand.wxassistant;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/wxassistant/x;", "Lcom/tencent/mm/ipcinvoker/k0;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class x implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        java.lang.Object obj2;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle == null || (str = bundle.getString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID)) == null) {
            str = "";
        }
        int i17 = bundle != null ? bundle.getInt("state") : 0;
        boolean z17 = bundle != null ? bundle.getBoolean("dismissTask") : false;
        boolean z18 = bundle != null ? bundle.getBoolean("keepSession") : false;
        com.tencent.mm.plugin.appbrand.service.u5 u5Var = (com.tencent.mm.plugin.appbrand.service.u5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.u5.class);
        if (u5Var instanceof com.tencent.mm.plugin.appbrand.wxassistant.u0) {
            com.tencent.mm.plugin.appbrand.wxassistant.u0 u0Var = (com.tencent.mm.plugin.appbrand.wxassistant.u0) u5Var;
            u0Var.getClass();
            if (!z18) {
                u0Var.f92322o.add(str);
            }
            com.tencent.mm.plugin.appbrand.wxassistant.b3.f92136e.getClass();
            java.util.Iterator it = ((kz5.h) com.tencent.mm.plugin.appbrand.wxassistant.b3.f92140i).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((com.tencent.mm.plugin.appbrand.wxassistant.b3) obj2).f92141d == i17) {
                    break;
                }
            }
            com.tencent.mm.plugin.appbrand.wxassistant.b3 b3Var = (com.tencent.mm.plugin.appbrand.wxassistant.b3) obj2;
            if (b3Var == null) {
                b3Var = com.tencent.mm.plugin.appbrand.wxassistant.b3.f92137f;
            }
            for (java.lang.String str2 : u0Var.Ai(str)) {
                com.tencent.mm.plugin.appbrand.o6 b17 = com.tencent.mm.plugin.appbrand.l.b(str2);
                if (b17 == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandWxAssistantService", "interruptBySessionIdInAppBrandProcess: runtime not found for appId:" + str2);
                } else {
                    com.tencent.mm.plugin.appbrand.wxassistant.q2 q2Var = (com.tencent.mm.plugin.appbrand.wxassistant.q2) b17.K1(com.tencent.mm.plugin.appbrand.wxassistant.q2.class);
                    if (q2Var != null) {
                        q2Var.l1(b3Var);
                    }
                    if (z17) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWxAssistantService", "interruptBySessionIdInAppBrandProcess: finish appId:" + str2);
                        b17.l0();
                    }
                }
            }
        }
        return new android.os.Bundle();
    }
}
