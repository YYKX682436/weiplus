package com.tencent.mm.plugin.appbrand.menu;

/* loaded from: classes7.dex */
public final class c1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.menu.c1 f85867d = new com.tencent.mm.plugin.appbrand.menu.c1();

    public c1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        org.json.JSONObject optJSONObject = com.tencent.mm.plugin.appbrand.menu.h1.a(com.tencent.mm.plugin.appbrand.menu.h1.f85963a).optJSONObject("ComplaintWording");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TradeGuaranteeMenuSetting", "complaintWordingPack#get, " + optJSONObject);
        return optJSONObject;
    }
}
