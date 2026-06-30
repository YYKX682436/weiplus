package ta1;

/* loaded from: classes7.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f498217d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ta1.t0 f498218e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ta1.q0 f498219f;

    public t(ta1.q0 q0Var, org.json.JSONObject jSONObject, ta1.t0 t0Var) {
        this.f498219f = q0Var;
        this.f498217d = jSONObject;
        this.f498218e = t0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        org.json.JSONObject jSONObject = this.f498217d;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecorderMgr", "hy: trigger editorExport " + jSONObject.toString());
            this.f498219f.f498200c.m21024xa9449b81(jSONObject.toString().getBytes(), new ta1.s(this));
        } catch (java.lang.Exception e17) {
            this.f498218e.a(1, -1, "editorExport error: " + e17.getMessage(), null);
        }
    }
}
