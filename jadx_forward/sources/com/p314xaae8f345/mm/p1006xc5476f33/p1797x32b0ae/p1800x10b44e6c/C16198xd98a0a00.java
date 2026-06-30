package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1800x10b44e6c;

/* renamed from: com.tencent.mm.plugin.lite.dynamic_module.LiteAppModuleWx */
/* loaded from: classes7.dex */
public class C16198xd98a0a00 extends bd.d {
    private static final java.lang.String TAG = "LiteAppModuleWx";

    @bd.c(m10165xc19dc9be = false)
    /* renamed from: getAccountInfo */
    public org.json.JSONObject m65696xd71cb45() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(274436, null);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || "CN".equalsIgnoreCase(str));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("isRegInChina", valueOf);
        return new org.json.JSONObject(hashMap);
    }

    @bd.c(m10165xc19dc9be = false)
    /* renamed from: isCNPayWalletRegion */
    public boolean m65697xe922940() {
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, -1)).intValue();
        return intValue == 0 || intValue == 1;
    }
}
