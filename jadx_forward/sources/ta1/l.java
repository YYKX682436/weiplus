package ta1;

/* loaded from: classes7.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f498171d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ta1.t0 f498172e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ta1.q0 f498173f;

    public l(ta1.q0 q0Var, org.json.JSONObject jSONObject, ta1.t0 t0Var) {
        this.f498173f = q0Var;
        this.f498171d = jSONObject;
        this.f498172e = t0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        org.json.JSONObject jSONObject = this.f498171d;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecorderMgr", "hy: trigger editorGetTrack " + jSONObject.toString());
            this.f498173f.f498200c.m21025x528e6022(jSONObject.toString().getBytes(), new ta1.k(this));
        } catch (java.lang.Exception e17) {
            this.f498172e.a(1, -1, "editorGetTrack error: " + e17.getMessage(), null);
        }
    }
}
