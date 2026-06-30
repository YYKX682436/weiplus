package kj;

/* loaded from: classes12.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kj.u f389799d;

    public t(kj.u uVar) {
        this.f389799d = uVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134252a;
        java.lang.String str2 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134273v;
        boolean z17 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134272u;
        this.f389799d.getClass();
        boolean z18 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134272u;
        try {
            dj.b bVar = (dj.b) ih.d.d().a(dj.b.class);
            if (bVar == null) {
                return;
            }
            java.lang.String e17 = (z18 || !this.f389799d.f389802g.f334800n) ? lj.f.e(android.os.Looper.getMainLooper().getThread().getStackTrace()) : "";
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            oj.d.d(jSONObject, ih.d.d().f373004b);
            jSONObject.put("detail", fj.a.LAG);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, str2);
            jSONObject.put("sceneChanging", z17);
            jSONObject.put("threadStack", e17);
            jSONObject.put("isProcessForeground", z18);
            ri.d0 d0Var = new ri.d0();
            d0Var.f477393b = "Trace_EvilMethod";
            d0Var.f477395d = jSONObject;
            bVar.d(d0Var);
            oj.j.b("Matrix.AnrTracer", "happens lag : %s, scene : %s ", e17, str2);
        } catch (org.json.JSONException e18) {
            oj.j.b("Matrix.AnrTracer", "[JSONException error: %s", e18);
        }
    }
}
