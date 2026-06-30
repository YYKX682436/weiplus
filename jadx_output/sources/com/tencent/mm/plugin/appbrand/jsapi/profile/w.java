package com.tencent.mm.plugin.appbrand.jsapi.profile;

/* loaded from: classes7.dex */
class w implements com.tencent.mm.ipcinvoker.j {
    private w() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        com.tencent.mm.plugin.appbrand.config.WxaProfileAttributes a17 = k91.k4.a(bundle.getString(dm.i4.COL_USERNAME), false);
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("brandIconURL", a17.f77502h);
        bundle2.putString("nickname", a17.f77500f);
        bundle2.putString("appId", a17.f77499e);
        bundle2.putInt("tradingGuaranteeFlag", a17.f77505n);
        bundle2.putInt("showRelievedBuyFlag", a17.f77506o);
        bundle2.putInt("showFinancialLicenseFlag", a17.f77509r);
        bundle2.putString(dm.i4.COL_USERNAME, bundle.getString(dm.i4.COL_USERNAME));
        bundle2.putInt("wxaTradeCommentScore", a17.f77517z);
        bundle2.putString("registerBody", a17.f77514w);
        bundle2.putInt("certificationImageType", a17.A);
        rVar.a(bundle2);
    }
}
