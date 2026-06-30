package cl;

/* loaded from: classes7.dex */
public class j2 implements com.eclipsesource.mmv8.JavaCallback {
    public j2(cl.n2 n2Var) {
    }

    @Override // com.eclipsesource.mmv8.JavaCallback
    public java.lang.Object invoke(com.eclipsesource.mmv8.V8Object v8Object, com.eclipsesource.mmv8.V8Array v8Array) {
        if (v8Array.length() < 2 || v8Array.getType(0) != 1 || v8Array.getType(1) != 1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.V8DirectApiSharedBufferLock", "hy: v8 params error");
            return null;
        }
        int integer = v8Array.getInteger(0);
        int integer2 = v8Array.getInteger(1);
        cl.m2 a17 = cl.m2.a();
        synchronized (a17.f42700a) {
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = (java.util.concurrent.ConcurrentLinkedQueue) a17.f42700a.get(java.lang.Integer.valueOf(integer));
            if (concurrentLinkedQueue != null) {
                if (((cl.k2) concurrentLinkedQueue.poll()) != null) {
                    cl.k2 k2Var = (cl.k2) concurrentLinkedQueue.peek();
                    if (k2Var != null) {
                        cl.q0 q0Var = k2Var.f42679b;
                        ((cl.a) q0Var.f42724b).h(new cl.l2(a17, k2Var.f42680c, q0Var), false);
                    }
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.V8DirectApiSharedBufferLock", "hy: bufferId: %d itemId: %d not found", java.lang.Integer.valueOf(integer), java.lang.Integer.valueOf(integer2));
                }
            }
        }
        return null;
    }
}
