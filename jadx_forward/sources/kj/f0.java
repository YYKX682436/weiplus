package kj;

/* loaded from: classes12.dex */
public class f0 implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        try {
            if (java.lang.System.currentTimeMillis() - com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd.C4716x16362384.f134559f < 4000) {
                return;
            }
            oj.j.c("Matrix.TouchEventLagTracer", "onTouchEventLag report", new java.lang.Object[0]);
            com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd.C4716x16362384.f134559f = java.lang.System.currentTimeMillis();
            dj.b bVar = (dj.b) ih.d.d().a(dj.b.class);
            if (bVar == null) {
                return;
            }
            java.lang.String str = com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd.C4716x16362384.f134560g;
            boolean h17 = lj.a.h();
            java.lang.String str2 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134273v;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            oj.d.d(jSONObject, ih.d.d().f373004b);
            jSONObject.put("detail", fj.a.LAG_TOUCH);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, str2);
            jSONObject.put("threadStack", str);
            jSONObject.put("isProcessForeground", h17);
            ri.d0 d0Var = new ri.d0();
            d0Var.f477393b = "Trace_EvilMethod";
            d0Var.f477395d = jSONObject;
            bVar.d(d0Var);
        } catch (java.lang.Throwable th6) {
            oj.j.b("Matrix.TouchEventLagTracer", "Matrix error, error = " + th6.getMessage(), new java.lang.Object[0]);
        }
    }
}
