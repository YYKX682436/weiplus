package sd;

/* loaded from: classes8.dex */
public class j0 implements td.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sd.e f488141a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sd.l0 f488142b;

    public j0(sd.l0 l0Var, sd.e eVar) {
        this.f488142b = l0Var;
        this.f488141a = eVar;
    }

    @Override // td.e
    public void a(td.d dVar) {
        sd.e eVar = this.f488141a;
        if (eVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.LuggageRuntime", "Null Event, Ignore");
            return;
        }
        if (dVar == td.d.PASS) {
            od.l d17 = this.f488142b.d();
            java.lang.String b17 = eVar.b();
            org.json.JSONObject a17 = eVar.a();
            d17.getClass();
            d17.f426051c.a(new od.d(b17, a17));
        }
    }
}
