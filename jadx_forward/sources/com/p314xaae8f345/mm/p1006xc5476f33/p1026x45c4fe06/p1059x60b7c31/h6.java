package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public final class h6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34350x366c91de = 916;

    /* renamed from: NAME */
    public static final java.lang.String f34351x24728b = "getRandomValues";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar == null) {
            return;
        }
        int optInt = jSONObject != null ? jSONObject.optInt("length", -1) : -1;
        if (optInt <= 0) {
            lVar.a(i17, o("fail: illegal length"));
            return;
        }
        byte[] bArr = new byte[optInt];
        new java.security.SecureRandom().nextBytes(bArr);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.nio.ByteBuffer e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.e(bArr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "wrapDirectByteBuffer(...)");
        linkedHashMap.put("randomValues", e17);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3.FAIL_SIZE_EXCEED_LIMIT != com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.d(lVar.mo50357xcd94f799(), linkedHashMap, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3) lVar.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3.class))) {
            lVar.a(i17, p("ok", linkedHashMap));
        } else {
            lVar.a(i17, o("fail: internal error"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiGetRandomValues", "invoke, convert NativeBuffer fail");
        }
    }
}
