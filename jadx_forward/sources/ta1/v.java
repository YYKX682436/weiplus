package ta1;

/* loaded from: classes7.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f498221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ta1.t0 f498222e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ta1.q0 f498223f;

    public v(ta1.q0 q0Var, org.json.JSONObject jSONObject, ta1.t0 t0Var) {
        this.f498223f = q0Var;
        this.f498221d = jSONObject;
        this.f498222e = t0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        org.json.JSONObject jSONObject = this.f498221d;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecorderMgr", "hy: trigger editorRemove " + jSONObject.toString());
            this.f498223f.f498200c.m21026xbe668051(jSONObject.toString().getBytes(), new ta1.u(this));
        } catch (java.lang.Exception e17) {
            this.f498222e.a(1, -1, "editorRemove error: " + e17.getMessage(), null);
        }
    }
}
