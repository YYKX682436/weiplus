package dd;

/* loaded from: classes9.dex */
public final class b extends com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 {

    /* renamed from: a, reason: collision with root package name */
    public final bd.e f310403a;

    public b(bd.e eVar) {
        this.f310403a = eVar;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619
    /* renamed from: call */
    public void mo25801x2e7a5e() {
        bd.e eVar = this.f310403a;
        if (eVar != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.putOpt("type", "delay");
            eVar.a(dd.c.j(dd.d.f310404a, jSONObject, null, 2, null), true, false);
        }
    }
}
