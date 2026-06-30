package dd1;

/* loaded from: classes7.dex */
public class c implements dd1.b {
    public void a(android.content.Context context, org.json.JSONObject data, dd1.a callback) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        boolean b17 = fd1.d.b();
        boolean a17 = fd1.d.a();
        boolean c17 = fd1.d.c();
        android.content.ComponentName componentName = new android.content.ComponentName(context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.hce.C12193x5bbe54ab.class.getCanonicalName());
        android.nfc.cardemulation.CardEmulation cardEmulation = android.nfc.cardemulation.CardEmulation.getInstance(android.nfc.NfcAdapter.getDefaultAdapter(context));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HceStateService", "component name: " + componentName);
        if (cardEmulation.isDefaultServiceForCategory(componentName, "payment")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HceStateService", "now is NFC Default Application");
            z17 = true;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HceStateService", "not NFC Default Application, isAutoSet: %b");
            z17 = false;
        }
        java.lang.String str = true & true ? "ok" : null;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("errCode", (java.lang.Object) 0);
        jSONObject.put("errMsg", str);
        jSONObject.put("isNFCSupported", b17);
        jSONObject.put("isHCESupported", a17);
        jSONObject.put("isNFCOpened", c17);
        jSONObject.put("isDefaultWalletApp", z17);
        callback.b(jSONObject);
    }
}
