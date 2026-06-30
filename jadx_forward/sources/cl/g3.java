package cl;

/* loaded from: classes7.dex */
public class g3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f124180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124181e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cl.l3 f124182f;

    public g3(cl.l3 l3Var, cl.q0 q0Var, java.lang.String str) {
        this.f124182f = l3Var;
        this.f124180d = q0Var;
        this.f124181e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f124181e;
        cl.l3 l3Var = this.f124182f;
        l3Var.getClass();
        cl.q0 q0Var = this.f124180d;
        if (q0Var.f().m16392xfb85f7b0("onmessage") != 7) {
            return;
        }
        try {
            com.p159x477cd522.p160x333422.C1474xd5ce209a c1474xd5ce209a = (com.p159x477cd522.p160x333422.C1474xd5ce209a) q0Var.f().get("onmessage");
            com.p159x477cd522.p160x333422.C1469x28b0ccd7 mo16396xe8eb0f37 = q0Var.f().mo16396xe8eb0f37();
            mo16396xe8eb0f37.mo16309x34af1a(str);
            c1474xd5ce209a.m16420x2e7a5e(q0Var.f().mo16386x31ca9f38(), mo16396xe8eb0f37);
            c1474xd5ce209a.mo15825x41012807();
            mo16396xe8eb0f37.mo15825x41012807();
        } catch (com.p159x477cd522.p160x333422.AbstractC1482xef2ea8c2 e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.V8EngineWorkerManager", e17, "hy: js exception in worker!", new java.lang.Object[0]);
            l3Var.g(q0Var, e17.getMessage(), e17.m16450xc63f701c());
        }
    }
}
