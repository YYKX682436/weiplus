package ed;

/* loaded from: classes9.dex */
public final class c implements q80.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ed.d f332733a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ed.a f332734b;

    public c(ed.d dVar, ed.a aVar) {
        this.f332733a = dVar;
        this.f332734b = aVar;
    }

    @Override // q80.x
    /* renamed from: onActivityResult */
    public final void mo55562x9d4787cb(int i17, int i18, android.content.Intent intent) {
        byte[] byteArrayExtra;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXPLiteAppLuckyMoneyPickEnvelopeService", "on pick envelope activity call back respCode=%d, resultCode=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 5) {
            ed.a aVar = this.f332734b;
            ed.d dVar = this.f332733a;
            try {
                if (i18 == -1) {
                    if (intent == null || (byteArrayExtra = intent.getByteArrayExtra("key_envelope_source")) == null) {
                        ed.d.a(dVar, "on pick envelope activity call back fail, info is empty", aVar);
                        return;
                    } else {
                        ed.d.b(dVar, byteArrayExtra, aVar);
                        return;
                    }
                }
                if (i18 != 0) {
                    ed.d.a(dVar, "on pick envelope activity call back fail, result code:" + i18, aVar);
                } else {
                    dVar.getClass();
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("status", ed.b.f332730e);
                    jSONObject.put("msg", "on pick envelope activity call back cancel");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXPLiteAppLuckyMoneyPickEnvelopeService", "on pick envelope activity call back cancel");
                    aVar.mo28747xc397f4dd(jSONObject);
                }
            } catch (org.json.JSONException e17) {
                ed.d.a(dVar, "on pick envelope activity call back fail, exception: " + e17 + ".message", aVar);
            }
        }
    }
}
