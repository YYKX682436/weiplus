package com.tencent.kinda.framework.module.impl;

/* loaded from: classes9.dex */
public class TenpayCgiImpl implements com.tencent.kinda.gen.TenpayCgi {
    private static final java.lang.String TAG = "WXP";

    @Override // com.tencent.kinda.gen.TenpayCgi
    public void request(int i17, java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> hashMap, java.util.HashMap<java.lang.String, java.lang.String> hashMap2, com.tencent.kinda.gen.TenpayCgiCallback tenpayCgiCallback) {
        java.lang.String.format("requestTenpay: cgiId:%d", java.lang.Integer.valueOf(i17));
        com.tencent.kinda.framework.module.impl.NetSceneTenpay netSceneTenpay = new com.tencent.kinda.framework.module.impl.NetSceneTenpay(i17, str, hashMap, hashMap2, tenpayCgiCallback);
        gm0.j1.i();
        gm0.j1.n().f273288b.g(netSceneTenpay);
        java.lang.String.format("MMCore.getNetSceneQueue().doScene %s", netSceneTenpay);
    }
}
