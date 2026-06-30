package ae1;

/* loaded from: classes7.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ae1.g f84917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y f84918e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f84919f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f84920g;

    public f(ae1.g gVar, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar, org.json.JSONObject jSONObject, int i17) {
        this.f84917d = gVar;
        this.f84918e = yVar;
        this.f84919f = jSONObject;
        this.f84920g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ae1.u uVar;
        jz5.g gVar = ae1.s.f84941a;
        ae1.g gVar2 = this.f84917d;
        ae1.v1 category = gVar2.C();
        jc1.d dVar = jc1.f.f380452h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(category, "category");
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y env = this.f84918e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        org.json.JSONObject data = this.f84919f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SmCryptoInvoker", "invoke, data: " + data);
        try {
            java.lang.String string = data.getString("type");
            java.lang.Object obj = ((java.util.Map) ((jz5.n) ae1.s.f84941a).mo141623x754a37bb()).get(category);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            ae1.a aVar = (ae1.a) ((java.util.Map) obj).get(string);
            if (aVar == null) {
                uVar = new ae1.u(dVar, null, 2, null);
            } else {
                uVar = aVar.a(new ae1.t(env, data));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SmCryptoInvoker", "invoke, result: " + uVar);
            }
        } catch (org.json.JSONException unused) {
            uVar = new ae1.u(dVar, null, 2, null);
        }
        env.a(this.f84920g, gVar2.q(null, uVar.f84944a, uVar.f84945b));
    }
}
