package kj;

/* loaded from: classes12.dex */
public class n implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        try {
            dj.b bVar = (dj.b) ih.d.d().a(dj.b.class);
            if (bVar == null) {
                return;
            }
            java.lang.String a17 = lj.f.a();
            boolean h17 = lj.a.h();
            java.lang.String str = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134273v;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            oj.d.d(jSONObject, ih.d.d().f373004b);
            jSONObject.put("detail", fj.a.LAG_IDLE_HANDLER);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, str);
            jSONObject.put("threadStack", a17);
            jSONObject.put("isProcessForeground", h17);
            ri.d0 d0Var = new ri.d0();
            d0Var.f477393b = "Trace_EvilMethod";
            d0Var.f477395d = jSONObject;
            bVar.d(d0Var);
            oj.j.b("Matrix.IdleHandlerLagTracer", "happens idle handler Lag : %s ", jSONObject.toString());
        } catch (java.lang.Throwable th6) {
            oj.j.b("Matrix.IdleHandlerLagTracer", "Matrix error, error = " + th6.getMessage(), new java.lang.Object[0]);
        }
    }
}
