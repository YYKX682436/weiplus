package u90;

/* loaded from: classes12.dex */
public class s implements java.lang.Runnable {
    public s(u90.t tVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetStatFeatureService", "[!] account not ready, skip calling logic@L30.");
            return;
        }
        boolean[] zArr = com.p314xaae8f345.mm.p959x883644fd.b0.f153026a;
        if (!zArr[0]) {
            synchronized (zArr) {
                if (!zArr[0]) {
                    try {
                        com.p314xaae8f345.mm.p959x883644fd.a0 Ai = com.p314xaae8f345.mm.p959x883644fd.t0.Ai();
                        java.util.Iterator it = ((java.util.ArrayList) com.p314xaae8f345.mm.p959x883644fd.b0.f153027b).iterator();
                        while (it.hasNext()) {
                            try {
                                Ai.m0((com.p314xaae8f345.mm.p959x883644fd.s) it.next());
                            } catch (java.lang.Throwable th6) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetStatStorageLogic", th6, "[-] Error.", new java.lang.Object[0]);
                            }
                        }
                    } finally {
                        com.p314xaae8f345.mm.p959x883644fd.b0.f153026a[0] = true;
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetStatFeatureService", "[+] logic@L30 called.");
    }
}
