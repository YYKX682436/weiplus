package ta1;

/* loaded from: classes7.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f498155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ta1.t0 f498156e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ta1.q0 f498157f;

    public h(ta1.q0 q0Var, org.json.JSONObject jSONObject, ta1.t0 t0Var) {
        this.f498157f = q0Var;
        this.f498155d = jSONObject;
        this.f498156e = t0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        org.json.JSONObject jSONObject = this.f498155d;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecorderMgr", "hy: trigger remux " + jSONObject.toString());
            this.f498157f.f498200c.m21042x67608bd(jSONObject.toString().getBytes(), new ta1.g(this));
        } catch (java.lang.Exception e17) {
            this.f498156e.a(1, -1, "remux error: " + e17.getMessage(), new org.json.JSONObject());
        }
    }
}
