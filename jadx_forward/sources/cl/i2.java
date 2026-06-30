package cl;

/* loaded from: classes7.dex */
public class i2 implements com.p159x477cd522.p160x333422.InterfaceC1456x656040a7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f124195a;

    public i2(cl.n2 n2Var, cl.q0 q0Var) {
        this.f124195a = q0Var;
    }

    @Override // com.p159x477cd522.p160x333422.InterfaceC1456x656040a7
    /* renamed from: invoke */
    public java.lang.Object mo15014xb9724478(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881, com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7) {
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue;
        int andIncrement;
        if (c1469x28b0ccd7.mo16304xbe0e3ae6() >= 2) {
            boolean z17 = true;
            if (c1469x28b0ccd7.mo16302xfb85f7b0(0) == 1 && c1469x28b0ccd7.mo16302xfb85f7b0(1) == 7) {
                int mo16294xb282bd08 = c1469x28b0ccd7.mo16294xb282bd08(0);
                com.p159x477cd522.p160x333422.C1474xd5ce209a c1474xd5ce209a = (com.p159x477cd522.p160x333422.C1474xd5ce209a) c1469x28b0ccd7.mo16297x2817c635(1);
                cl.m2 a17 = cl.m2.a();
                cl.q0 q0Var = this.f124195a;
                synchronized (a17.f124233a) {
                    try {
                        if (a17.f124233a.containsKey(java.lang.Integer.valueOf(mo16294xb282bd08))) {
                            concurrentLinkedQueue = (java.util.concurrent.ConcurrentLinkedQueue) a17.f124233a.get(java.lang.Integer.valueOf(mo16294xb282bd08));
                            z17 = concurrentLinkedQueue.isEmpty();
                        } else {
                            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue2 = new java.util.concurrent.ConcurrentLinkedQueue();
                            a17.f124233a.put(java.lang.Integer.valueOf(mo16294xb282bd08), concurrentLinkedQueue2);
                            concurrentLinkedQueue = concurrentLinkedQueue2;
                        }
                        andIncrement = a17.f124234b.getAndIncrement();
                        cl.k2 k2Var = new cl.k2(andIncrement, q0Var, c1474xd5ce209a);
                        concurrentLinkedQueue.offer(k2Var);
                        if (z17) {
                            cl.q0 q0Var2 = k2Var.f124212b;
                            com.p159x477cd522.p160x333422.C1474xd5ce209a c1474xd5ce209a2 = k2Var.f124213c;
                            ((cl.a) q0Var2.f124257b).h(new cl.l2(a17, c1474xd5ce209a2, q0Var2), false);
                        }
                    } catch (java.lang.Throwable th6) {
                        throw th6;
                    }
                }
                return java.lang.Integer.valueOf(andIncrement);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.V8DirectApiSharedBufferLock", "hy: v8 params error");
        return -1;
    }
}
