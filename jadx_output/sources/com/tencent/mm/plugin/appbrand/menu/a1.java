package com.tencent.mm.plugin.appbrand.menu;

/* loaded from: classes7.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.menu.a1 f85864d = new com.tencent.mm.plugin.appbrand.menu.a1();

    public a1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String optString = com.tencent.mm.plugin.appbrand.menu.h1.a(com.tencent.mm.plugin.appbrand.menu.h1.f85963a).optString("ComplaintDarkIconUrl");
        if (optString.length() == 0) {
            optString = null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TradeGuaranteeMenuSetting", "complaintDarkIconUrl#get, " + optString);
        return optString;
    }
}
