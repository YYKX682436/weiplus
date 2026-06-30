package cl;

/* loaded from: classes7.dex */
public class n2 extends cl.r1 {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.ref.WeakReference f42706b = null;

    @Override // cl.r1
    public void a() {
        if (this.f42706b != null) {
            cl.m2 a17 = cl.m2.a();
            cl.q0 q0Var = (cl.q0) this.f42706b.get();
            synchronized (a17.f42700a) {
                com.tencent.mars.xlog.Log.i("MicroMsg.V8DirectApiSharedBufferLock", "hy: trigger release engine %d", java.lang.Integer.valueOf(q0Var.hashCode()));
                java.util.Iterator it = a17.f42700a.keySet().iterator();
                while (it.hasNext()) {
                    java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = (java.util.concurrent.ConcurrentLinkedQueue) a17.f42700a.get((java.lang.Integer) it.next());
                    if (concurrentLinkedQueue != null) {
                        java.util.Iterator it6 = concurrentLinkedQueue.iterator();
                        while (it6.hasNext()) {
                            cl.k2 k2Var = (cl.k2) it6.next();
                            if (k2Var.f42679b == q0Var) {
                                k2Var.f42680c.release();
                                concurrentLinkedQueue.remove(k2Var);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // cl.r1
    public void c(cl.q0 q0Var, com.eclipsesource.mmv8.V8Object v8Object) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(q0Var != null ? q0Var.hashCode() : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.V8DirectApiSharedBufferLock", "hy: trigger setup worker %d", objArr);
        this.f42706b = new java.lang.ref.WeakReference(q0Var);
        v8Object.registerJavaMethod(new cl.i2(this, q0Var), "lockSharedNativeBuffer");
        v8Object.registerJavaMethod(new cl.j2(this), "unlockSharedNativeBuffer");
    }
}
