package ae1;

/* loaded from: classes7.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ae1.g f3384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.service.y f3385e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f3386f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3387g;

    public f(ae1.g gVar, com.tencent.luggage.sdk.jsapi.component.service.y yVar, org.json.JSONObject jSONObject, int i17) {
        this.f3384d = gVar;
        this.f3385e = yVar;
        this.f3386f = jSONObject;
        this.f3387g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ae1.u uVar;
        jz5.g gVar = ae1.s.f3408a;
        ae1.g gVar2 = this.f3384d;
        ae1.v1 category = gVar2.C();
        jc1.d dVar = jc1.f.f298919h;
        kotlin.jvm.internal.o.g(category, "category");
        com.tencent.luggage.sdk.jsapi.component.service.y env = this.f3385e;
        kotlin.jvm.internal.o.g(env, "env");
        org.json.JSONObject data = this.f3386f;
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SmCryptoInvoker", "invoke, data: " + data);
        try {
            java.lang.String string = data.getString("type");
            java.lang.Object obj = ((java.util.Map) ((jz5.n) ae1.s.f3408a).getValue()).get(category);
            kotlin.jvm.internal.o.d(obj);
            ae1.a aVar = (ae1.a) ((java.util.Map) obj).get(string);
            if (aVar == null) {
                uVar = new ae1.u(dVar, null, 2, null);
            } else {
                uVar = aVar.a(new ae1.t(env, data));
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SmCryptoInvoker", "invoke, result: " + uVar);
            }
        } catch (org.json.JSONException unused) {
            uVar = new ae1.u(dVar, null, 2, null);
        }
        env.a(this.f3387g, gVar2.q(null, uVar.f3411a, uVar.f3412b));
    }
}
