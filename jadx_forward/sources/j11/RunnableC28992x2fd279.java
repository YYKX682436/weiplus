package j11;

/* renamed from: j11.h$$a */
/* loaded from: classes8.dex */
public final /* synthetic */ class RunnableC28992x2fd279 implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetContactService", "Start post recovery.");
        java.util.Iterator it = ((java.util.ArrayList) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().q(java.util.Collections.emptyList())).iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (str.endsWith("@chatroom") && ((n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true)) == null || (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.P0()) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.w0())))) {
                final java.lang.Object obj = new java.lang.Object();
                c01.o8 o8Var = new c01.o8() { // from class: j11.h$$c
                    @Override // c01.o8
                    public final void a(java.lang.String str2, boolean z17) {
                        java.lang.Object obj2 = obj;
                        synchronized (obj2) {
                            obj2.notifyAll();
                        }
                    }
                };
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GetContactService", "Chatroom nickname missing, go pull: ".concat(str));
                ((c01.k7) c01.n8.a()).b(str, 6, o8Var);
                synchronized (obj) {
                    try {
                        obj.wait();
                    } catch (java.lang.InterruptedException unused) {
                    }
                }
            }
        }
        gm0.j1.u().c().z(92, 0);
    }
}
