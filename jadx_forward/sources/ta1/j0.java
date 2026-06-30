package ta1;

/* loaded from: classes7.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f498165d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ta1.t0 f498166e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ta1.q0 f498167f;

    public j0(ta1.q0 q0Var, java.lang.String str, ta1.t0 t0Var) {
        this.f498167f = q0Var;
        this.f498165d = str;
        this.f498166e = t0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f498165d;
        ta1.t0 t0Var = this.f498166e;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecorderMgr", "hy: requestAnalyze %s", str);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, str);
            this.f498167f.f498200c.m21020xc2f032dc(jSONObject.toString().getBytes(), new ta1.i0(this));
        } catch (org.json.JSONException e17) {
            t0Var.a(1, -1, "analysis error: " + e17.getMessage(), null);
        } catch (java.lang.Exception e18) {
            t0Var.a(1, -1, "analysis error: " + e18.getMessage(), null);
        }
    }
}
