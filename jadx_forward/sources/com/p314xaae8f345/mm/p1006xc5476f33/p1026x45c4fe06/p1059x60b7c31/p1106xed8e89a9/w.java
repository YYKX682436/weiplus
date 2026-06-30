package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9;

/* loaded from: classes7.dex */
class w implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    private w() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11833x97996a40 a17 = k91.k4.a(bundle.getString(dm.i4.f66875xa013b0d5), false);
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("brandIconURL", a17.f159035h);
        bundle2.putString("nickname", a17.f159033f);
        bundle2.putString("appId", a17.f159032e);
        bundle2.putInt("tradingGuaranteeFlag", a17.f159038n);
        bundle2.putInt("showRelievedBuyFlag", a17.f159039o);
        bundle2.putInt("showFinancialLicenseFlag", a17.f159042r);
        bundle2.putString(dm.i4.f66875xa013b0d5, bundle.getString(dm.i4.f66875xa013b0d5));
        bundle2.putInt("wxaTradeCommentScore", a17.f159050z);
        bundle2.putString("registerBody", a17.f159047w);
        bundle2.putInt("certificationImageType", a17.A);
        rVar.a(bundle2);
    }
}
