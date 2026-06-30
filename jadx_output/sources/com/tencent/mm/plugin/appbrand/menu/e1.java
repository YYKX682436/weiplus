package com.tencent.mm.plugin.appbrand.menu;

/* loaded from: classes7.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.menu.e1 f85949d = new com.tencent.mm.plugin.appbrand.menu.e1();

    public e1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String optString = com.tencent.mm.plugin.appbrand.menu.h1.a(com.tencent.mm.plugin.appbrand.menu.h1.f85963a).optString("FeedbackIconUrl");
        if (optString.length() == 0) {
            optString = null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TradeGuaranteeMenuSetting", "feedbackLightIconUrl#get, " + optString);
        return optString;
    }
}
