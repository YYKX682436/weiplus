package ed1;

/* loaded from: classes15.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public ed1.i f332782a;

    public static /* synthetic */ org.json.JSONObject e(ed1.k kVar, java.lang.String str, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: makeSuccJson");
        }
        if ((i17 & 1) != 0) {
            str = "ok";
        }
        return kVar.d(str);
    }

    public final java.util.List a(android.content.Context mContext, dd1.a mCallback) {
        java.util.List<java.lang.String> aidsForService;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mContext, "mContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mCallback, "mCallback");
        android.nfc.NfcAdapter defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(mContext);
        if (defaultAdapter != null) {
            android.nfc.cardemulation.CardEmulation cardEmulation = android.nfc.cardemulation.CardEmulation.getInstance(defaultAdapter);
            return (cardEmulation == null || (aidsForService = cardEmulation.getAidsForService(new android.content.ComponentName(mContext, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.hce.C12193x5bbe54ab.class), "payment")) == null) ? new java.util.ArrayList() : aidsForService;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HceApiBaseService", "NfcAdapter is null when register aids");
        mCallback.b(b("NfcAdapter is null when register aids"));
        return new java.util.ArrayList();
    }

    public final org.json.JSONObject b(java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("errCode", -1);
        jSONObject.put("errMsg", errMsg);
        return jSONObject;
    }

    public final org.json.JSONObject c(int i17, java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("errCode", i17);
        jSONObject.put("errMsg", str);
        return jSONObject;
    }

    public final org.json.JSONObject d(java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("errCode", (java.lang.Object) 0);
        jSONObject.put("errMsg", str);
        return jSONObject;
    }
}
