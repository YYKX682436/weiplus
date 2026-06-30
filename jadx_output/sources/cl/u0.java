package cl;

/* loaded from: classes7.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f42772d;

    public u0(cl.q0 q0Var) {
        this.f42772d = q0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.J2V8.V8ContextEngine", "destroy");
        cl.q0 q0Var = this.f42772d;
        com.tencent.mm.weapp_core.PerformanceNowUs performanceNowUs = q0Var.f42729g;
        if (performanceNowUs != null) {
            performanceNowUs.destroy();
            q0Var.f42729g = null;
        }
        java.util.Iterator it = q0Var.f42728f.iterator();
        while (it.hasNext()) {
            ((cl.r1) it.next()).a();
        }
        q0Var.f42728f.clear();
        com.eclipsesource.mmv8.V8Context f17 = q0Var.f();
        if (f17 != null) {
            try {
                f17.release();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.J2V8.V8ContextEngine", "destroy :%s", e17);
            }
        }
    }
}
