package zd;

/* loaded from: classes7.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f553042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f553043e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f553044f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zd.g f553045g;

    public f(zd.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, org.json.JSONObject jSONObject) {
        this.f553045g = gVar;
        this.f553042d = e9Var;
        this.f553043e = i17;
        this.f553044f = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f553042d;
        boolean mo50262x39e05d35 = e9Var.mo50262x39e05d35();
        zd.g gVar = this.f553045g;
        int i17 = this.f553043e;
        if (!mo50262x39e05d35) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WAGameJsApiCanvasToTempFilePath", "invoke JsApi insertView failed, current page view is null.");
            e9Var.a(i17, gVar.o("fail"));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 V0 = e9Var.V0();
        if (((ce.g) V0.B1(ce.g.class)) == null) {
            e9Var.a(i17, gVar.o("fail"));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b0 D = zd.g.D(V0, this.f553044f, false);
        e9Var.a(i17, gVar.p(D.f162853b, D.f162852a));
    }
}
