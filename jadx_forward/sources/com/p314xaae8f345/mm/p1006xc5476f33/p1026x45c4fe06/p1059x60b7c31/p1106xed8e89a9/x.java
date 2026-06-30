package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9;

/* loaded from: classes9.dex */
class x implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    private x() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("editText", "");
        ot0.q qVar = new ot0.q();
        qVar.f430187f = bundle.getString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        qVar.f430199i = bundle.getInt("type");
        qVar.f430206j2 = bundle.getString("appbrandUsername");
        qVar.f430210k2 = bundle.getString("appbrandAppId");
        qVar.f430214l2 = bundle.getInt("appbrandType");
        qVar.L1 = bundle.getString("publisherId");
        qVar.f430267z = bundle.getString("thumburl");
        qVar.f430207k = bundle.getString("url");
        qVar.f430255w = bundle.getString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        qVar.f430259x = bundle.getString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        ot0.a aVar = new ot0.a();
        aVar.f429892o = bundle.getInt("appbrandTradingGuaranteeFlag");
        aVar.f429893p = bundle.getInt("showRelievedBuyFlag");
        aVar.f429896s = bundle.getInt("showFinancialLicenseFlag");
        aVar.L = bundle.getInt("wxaTradeCommentScore", 0);
        aVar.M = bundle.getString("registerBody");
        aVar.N = bundle.getInt("certificationImageType", 0);
        qVar.f(aVar);
        java.util.Iterator<java.lang.String> it = bundle.getStringArrayList("toUserList").iterator();
        while (it.hasNext()) {
            java.lang.String next = it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareSpecificWeapp", "sendAppMsg, username=" + next);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361 c5990xd50ae361 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361();
                am.mt mtVar = c5990xd50ae361.f136285g;
                mtVar.f88895a = next;
                mtVar.f88896b = string;
                mtVar.f88897c = c01.e2.C(next);
                mtVar.f88898d = 0;
                c5990xd50ae361.e();
            }
            ot0.k1 a17 = ot0.j1.a();
            java.lang.String string2 = bundle.getString("appbrandAppId");
            java.lang.String string3 = bundle.getString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            ((ez.w0) a17).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.I(qVar, string2, string3, next, null, null);
        }
    }
}
