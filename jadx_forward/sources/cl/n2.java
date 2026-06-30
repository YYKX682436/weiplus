package cl;

/* loaded from: classes7.dex */
public class n2 extends cl.r1 {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.ref.WeakReference f124239b = null;

    @Override // cl.r1
    public void a() {
        if (this.f124239b != null) {
            cl.m2 a17 = cl.m2.a();
            cl.q0 q0Var = (cl.q0) this.f124239b.get();
            synchronized (a17.f124233a) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.V8DirectApiSharedBufferLock", "hy: trigger release engine %d", java.lang.Integer.valueOf(q0Var.hashCode()));
                java.util.Iterator it = a17.f124233a.keySet().iterator();
                while (it.hasNext()) {
                    java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = (java.util.concurrent.ConcurrentLinkedQueue) a17.f124233a.get((java.lang.Integer) it.next());
                    if (concurrentLinkedQueue != null) {
                        java.util.Iterator it6 = concurrentLinkedQueue.iterator();
                        while (it6.hasNext()) {
                            cl.k2 k2Var = (cl.k2) it6.next();
                            if (k2Var.f124212b == q0Var) {
                                k2Var.f124213c.mo15825x41012807();
                                concurrentLinkedQueue.remove(k2Var);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // cl.r1
    public void c(cl.q0 q0Var, com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(q0Var != null ? q0Var.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.V8DirectApiSharedBufferLock", "hy: trigger setup worker %d", objArr);
        this.f124239b = new java.lang.ref.WeakReference(q0Var);
        c1477x4679881.mo16337x1af320a6(new cl.i2(this, q0Var), "lockSharedNativeBuffer");
        c1477x4679881.mo16337x1af320a6(new cl.j2(this), "unlockSharedNativeBuffer");
    }
}
