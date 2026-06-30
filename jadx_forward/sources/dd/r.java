package dd;

/* loaded from: classes9.dex */
public final class r implements com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3235x6da79b04.KindaJsEventDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f310424a;

    public r(yz5.p pVar) {
        this.f310424a = pVar;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3473x4b2b0426
    /* renamed from: kindaCloseWebViewImpl */
    public void mo24859x14baf22e(boolean z17, com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 completion) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(completion, "completion");
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3473x4b2b0426
    /* renamed from: kindaEndWithResult */
    public void mo24860x91578571(java.lang.String result, java.util.HashMap extraInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraInfo, "extraInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeixinPayService.StartKindaUseCaseImpl", "kindaEndWithResult: %s", result);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("result", new org.json.JSONObject(result));
        } catch (org.json.JSONException unused) {
            jSONObject.put("result", result);
        }
        for (java.util.Map.Entry entry : extraInfo.entrySet()) {
            try {
                try {
                    jSONObject.put((java.lang.String) entry.getKey(), new org.json.JSONObject((java.lang.String) entry.getValue()));
                } catch (org.json.JSONException unused2) {
                    jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
                }
            } catch (org.json.JSONException unused3) {
                jSONObject.put((java.lang.String) entry.getKey(), new org.json.JSONArray((java.lang.String) entry.getValue()));
            }
        }
        this.f310424a.mo149xb9724478(dd.c.j(dd.d.f310404a, jSONObject, null, 2, null), java.lang.Boolean.TRUE);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3473x4b2b0426
    /* renamed from: kindaGetType */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3560xcac27c5e mo24861xe667f7a3() {
        return com.p314xaae8f345.p347x615374d.gen.EnumC3560xcac27c5e.LITEAPP;
    }
}
