package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes5.dex */
public class u2 implements com.p314xaae8f345.mm.p669x38b6e557.g5 {
    @Override // com.p314xaae8f345.mm.p669x38b6e557.g5
    public void a(android.content.Intent intent) {
        if (!z65.c.a() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
            return;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.w1) ((ob0.a3) i95.n0.c(ob0.a3.class))).getClass();
        int intExtra = intent.getIntExtra("pid", -1);
        if (intExtra == -1) {
            intExtra = android.os.Process.myPid();
        }
        java.lang.String stringExtra = intent.getStringExtra("tracePath");
        int intExtra2 = intent.getIntExtra("bufferSize", 0);
        int intExtra3 = intent.getIntExtra("intervalUs", 0);
        int intExtra4 = intent.getIntExtra("durationMs", -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MatrixShellService", "Gonna sampling trace pid(%s), tracePath(%s), bufferSize(%s), intervalUs(%s), durationMs(%s)", java.lang.Integer.valueOf(intExtra), stringExtra, java.lang.Integer.valueOf(intExtra2), java.lang.Integer.valueOf(intExtra3), java.lang.Integer.valueOf(intExtra4));
        if (intExtra == android.os.Process.myPid()) {
            ph5.a.a(intExtra, stringExtra, intExtra2, intExtra3, intExtra4);
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) sh.c.n(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)).iterator();
        while (it.hasNext()) {
            m3.d dVar = (m3.d) it.next();
            if (((java.lang.Integer) dVar.f404625a).intValue() == intExtra) {
                java.lang.String str = (java.lang.String) dVar.f404626b;
                android.os.Bundle bundle = new android.os.Bundle();
                if (stringExtra != null) {
                    bundle.putString("tracePath", stringExtra);
                }
                if (intExtra2 > 0) {
                    bundle.putInt("bufferSize", intExtra2);
                }
                if (intExtra3 > 0) {
                    bundle.putInt("intervalUs", intExtra3);
                }
                if (intExtra4 > 0) {
                    bundle.putInt("durationMs", intExtra4);
                }
                com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str, bundle, ph5.a.class, new ph5.C29977x2ca3e2());
                return;
            }
        }
    }
}
