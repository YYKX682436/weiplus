package z43;

/* loaded from: classes8.dex */
public class b0 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f551639a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z43.a0 f551640b;

    public b0(z43.a0 a0Var, org.json.JSONObject jSONObject) {
        this.f551640b = a0Var;
        this.f551639a = jSONObject;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiOpenGameUrlWithExtraWebView", "openLiteApp failed");
        this.f551640b.A(this.f551639a);
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiOpenGameUrlWithExtraWebView", "openLiteApp success");
        this.f551640b.f224976f.d(false);
    }
}
