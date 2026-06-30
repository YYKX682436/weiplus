package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public final class q4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f34711x366c91de = 983;

    /* renamed from: NAME */
    private static final java.lang.String f34712x24728b = "checkStrangerContactListIsFriend";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject data, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCheckStrangerIsFriend", "invoke JsApiCheckStrangerIsFriend! " + data);
        if ((lVar != null ? lVar.mo50352x76847179() : null) == null) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        org.json.JSONObject optJSONObject = data.optJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        bundle.putString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37645x68f5f8be, optJSONObject != null ? optJSONObject.toString() : null);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.o4.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p4(lVar, i17, this));
    }
}
