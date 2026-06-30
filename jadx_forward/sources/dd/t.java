package dd;

/* loaded from: classes9.dex */
public final class t implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f310426a;

    public t(yz5.p pVar) {
        this.f310426a = pVar;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
    /* renamed from: call */
    public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
        java.lang.String mo27567xcc31ba03 = abstractC3411xcfaed72e != null ? abstractC3411xcfaed72e.mo27567xcc31ba03() : null;
        if (mo27567xcc31ba03 == null) {
            mo27567xcc31ba03 = "";
        }
        try {
            this.f310426a.mo149xb9724478(dd.c.j(dd.d.f310404a, new org.json.JSONObject(mo27567xcc31ba03), null, 2, null), java.lang.Boolean.TRUE);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeixinPayService.StartKindaUseCaseImpl", "startUseCase json parse failed: %s", mo27567xcc31ba03);
        }
    }
}
