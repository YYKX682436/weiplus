package ta1;

/* loaded from: classes7.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f498190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ta1.t0 f498191e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ta1.q0 f498192f;

    public p(ta1.q0 q0Var, org.json.JSONObject jSONObject, ta1.t0 t0Var) {
        this.f498192f = q0Var;
        this.f498190d = jSONObject;
        this.f498191e = t0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        org.json.JSONObject jSONObject = this.f498190d;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecorderMgr", "hy: trigger editorUpdateTrack " + jSONObject.toString());
            this.f498192f.f498200c.m21027x3c082e55(jSONObject.toString().getBytes(), new ta1.o(this));
        } catch (java.lang.Exception e17) {
            this.f498191e.a(1, -1, "editorUpdateTrack error: " + e17.getMessage(), null);
        }
    }
}
