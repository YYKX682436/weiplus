package cl;

/* loaded from: classes7.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f124305d;

    public u0(cl.q0 q0Var) {
        this.f124305d = q0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.J2V8.V8ContextEngine", "destroy");
        cl.q0 q0Var = this.f124305d;
        com.p314xaae8f345.mm.p2809x52b77bcb.C22921x2bd339e4 c22921x2bd339e4 = q0Var.f124262g;
        if (c22921x2bd339e4 != null) {
            c22921x2bd339e4.m83357x5cd39ffa();
            q0Var.f124262g = null;
        }
        java.util.Iterator it = q0Var.f124261f.iterator();
        while (it.hasNext()) {
            ((cl.r1) it.next()).a();
        }
        q0Var.f124261f.clear();
        com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad f17 = q0Var.f();
        if (f17 != null) {
            try {
                f17.m16407x41012807();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.J2V8.V8ContextEngine", "destroy :%s", e17);
            }
        }
    }
}
