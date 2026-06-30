package sd;

/* loaded from: classes8.dex */
public class k0 implements td.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f488147a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f488148b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sd.l0 f488149c;

    public k0(sd.l0 l0Var, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f488149c = l0Var;
        this.f488147a = str;
        this.f488148b = jSONObject;
    }

    @Override // td.e
    public void a(td.d dVar) {
        if (dVar == td.d.PASS) {
            od.l d17 = this.f488149c.d();
            d17.getClass();
            d17.f426051c.a(new od.d(this.f488147a, this.f488148b));
        }
    }
}
