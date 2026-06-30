package com.tencent.mm.plugin.appbrand.menu;

/* loaded from: classes7.dex */
public final class g1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.menu.g1 f85952d = new com.tencent.mm.plugin.appbrand.menu.g1();

    public g1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        try {
            java.lang.String str = com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b().f77218p1;
            return str != null ? new org.json.JSONObject(str) : new org.json.JSONObject();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TradeGuaranteeMenuSetting", "tradeGuaranteeMenuSettingJson#get, fail since " + e17);
            return new org.json.JSONObject();
        }
    }
}
