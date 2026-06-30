package ta1;

/* loaded from: classes7.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f498162d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ta1.t0 f498163e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ta1.q0 f498164f;

    public j(ta1.q0 q0Var, org.json.JSONObject jSONObject, ta1.t0 t0Var) {
        this.f498164f = q0Var;
        this.f498162d = jSONObject;
        this.f498163e = t0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        org.json.JSONObject jSONObject = this.f498162d;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecorderMgr", "hy: trigger editorCreate " + jSONObject.toString());
            this.f498164f.f498200c.m21022xa58128c9(jSONObject.toString().getBytes(), new ta1.i(this));
        } catch (java.lang.Exception e17) {
            this.f498163e.a(1, -1, "editorCreate error: " + e17.getMessage(), null);
        }
    }
}
