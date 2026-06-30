package cl;

/* loaded from: classes7.dex */
public class i2 implements com.eclipsesource.mmv8.JavaCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f42662a;

    public i2(cl.n2 n2Var, cl.q0 q0Var) {
        this.f42662a = q0Var;
    }

    @Override // com.eclipsesource.mmv8.JavaCallback
    public java.lang.Object invoke(com.eclipsesource.mmv8.V8Object v8Object, com.eclipsesource.mmv8.V8Array v8Array) {
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue;
        int andIncrement;
        if (v8Array.length() >= 2) {
            boolean z17 = true;
            if (v8Array.getType(0) == 1 && v8Array.getType(1) == 7) {
                int integer = v8Array.getInteger(0);
                com.eclipsesource.mmv8.V8Function v8Function = (com.eclipsesource.mmv8.V8Function) v8Array.getObject(1);
                cl.m2 a17 = cl.m2.a();
                cl.q0 q0Var = this.f42662a;
                synchronized (a17.f42700a) {
                    try {
                        if (a17.f42700a.containsKey(java.lang.Integer.valueOf(integer))) {
                            concurrentLinkedQueue = (java.util.concurrent.ConcurrentLinkedQueue) a17.f42700a.get(java.lang.Integer.valueOf(integer));
                            z17 = concurrentLinkedQueue.isEmpty();
                        } else {
                            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue2 = new java.util.concurrent.ConcurrentLinkedQueue();
                            a17.f42700a.put(java.lang.Integer.valueOf(integer), concurrentLinkedQueue2);
                            concurrentLinkedQueue = concurrentLinkedQueue2;
                        }
                        andIncrement = a17.f42701b.getAndIncrement();
                        cl.k2 k2Var = new cl.k2(andIncrement, q0Var, v8Function);
                        concurrentLinkedQueue.offer(k2Var);
                        if (z17) {
                            cl.q0 q0Var2 = k2Var.f42679b;
                            com.eclipsesource.mmv8.V8Function v8Function2 = k2Var.f42680c;
                            ((cl.a) q0Var2.f42724b).h(new cl.l2(a17, v8Function2, q0Var2), false);
                        }
                    } catch (java.lang.Throwable th6) {
                        throw th6;
                    }
                }
                return java.lang.Integer.valueOf(andIncrement);
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.V8DirectApiSharedBufferLock", "hy: v8 params error");
        return -1;
    }
}
