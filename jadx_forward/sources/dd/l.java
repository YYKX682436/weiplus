package dd;

/* loaded from: classes9.dex */
public final class l implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f310416a;

    public l(yz5.p pVar) {
        this.f310416a = pVar;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
    /* renamed from: call */
    public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeixinPayService.openBioSettingImpl", "callback from openBioSettingImpl");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        boolean mo27542xfb7da360 = data.mo27542xfb7da360("result");
        java.lang.String mo27551x2fec8307 = data.mo27551x2fec8307("token");
        jSONObject.putOpt("result", java.lang.Boolean.valueOf(mo27542xfb7da360));
        jSONObject.putOpt("token", mo27551x2fec8307);
        this.f310416a.mo149xb9724478(dd.c.j(dd.d.f310404a, jSONObject, null, 2, null), java.lang.Boolean.FALSE);
    }
}
