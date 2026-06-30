package cl;

/* loaded from: classes7.dex */
public class j2 implements com.p159x477cd522.p160x333422.InterfaceC1456x656040a7 {
    public j2(cl.n2 n2Var) {
    }

    @Override // com.p159x477cd522.p160x333422.InterfaceC1456x656040a7
    /* renamed from: invoke */
    public java.lang.Object mo15014xb9724478(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881, com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7) {
        if (c1469x28b0ccd7.mo16304xbe0e3ae6() < 2 || c1469x28b0ccd7.mo16302xfb85f7b0(0) != 1 || c1469x28b0ccd7.mo16302xfb85f7b0(1) != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.V8DirectApiSharedBufferLock", "hy: v8 params error");
            return null;
        }
        int mo16294xb282bd08 = c1469x28b0ccd7.mo16294xb282bd08(0);
        int mo16294xb282bd082 = c1469x28b0ccd7.mo16294xb282bd08(1);
        cl.m2 a17 = cl.m2.a();
        synchronized (a17.f124233a) {
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = (java.util.concurrent.ConcurrentLinkedQueue) a17.f124233a.get(java.lang.Integer.valueOf(mo16294xb282bd08));
            if (concurrentLinkedQueue != null) {
                if (((cl.k2) concurrentLinkedQueue.poll()) != null) {
                    cl.k2 k2Var = (cl.k2) concurrentLinkedQueue.peek();
                    if (k2Var != null) {
                        cl.q0 q0Var = k2Var.f124212b;
                        ((cl.a) q0Var.f124257b).h(new cl.l2(a17, k2Var.f124213c, q0Var), false);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.V8DirectApiSharedBufferLock", "hy: bufferId: %d itemId: %d not found", java.lang.Integer.valueOf(mo16294xb282bd08), java.lang.Integer.valueOf(mo16294xb282bd082));
                }
            }
        }
        return null;
    }
}
