package gd;

/* loaded from: classes9.dex */
public final class c implements com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3239x7381596e.ScanWidgetLiteAppCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gd.a f352004a;

    public c(gd.a aVar) {
        this.f352004a = aVar;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3239x7381596e.ScanWidgetLiteAppCallback
    /* renamed from: onScanCallback */
    public final void mo25901xbd530961(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXPLiteAppBankCardOcrService", "get scan result and callback");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.putOpt("cardNumber", intent.getStringExtra("cardNumber"));
        jSONObject.putOpt("scanResult", intent.getStringExtra("scanResult"));
        byte[] byteArrayExtra = intent.getByteArrayExtra("imageData");
        if (byteArrayExtra != null) {
            jSONObject.putOpt("cardImgData", android.util.Base64.encodeToString(byteArrayExtra, 2));
        }
        this.f352004a.mo28756xc39f40fc(jSONObject);
    }
}
