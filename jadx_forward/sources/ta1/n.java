package ta1;

/* loaded from: classes7.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f498178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ta1.t0 f498179e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ta1.q0 f498180f;

    public n(ta1.q0 q0Var, org.json.JSONObject jSONObject, ta1.t0 t0Var) {
        this.f498180f = q0Var;
        this.f498178d = jSONObject;
        this.f498179e = t0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        org.json.JSONObject jSONObject = this.f498178d;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecorderMgr", "hy: trigger editorCreateTrack " + jSONObject.toString());
            this.f498180f.f498200c.m21021x93138db7(jSONObject.toString().getBytes(), new ta1.m(this));
        } catch (java.lang.Exception e17) {
            this.f498179e.a(1, -1, "editorCreateTrack error: " + e17.getMessage(), null);
        }
    }
}
