package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes11.dex */
public class t2 implements com.p314xaae8f345.mm.p669x38b6e557.g5 {
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
        if (intExtra == android.os.Process.myPid()) {
            com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd.C4713xf13e442a.j();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MatrixShellService", "Send signal 3 to self");
        } else {
            android.os.Process.sendSignal(intExtra, 3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MatrixShellService", "Send signal 3 to pid(%s)", java.lang.Integer.valueOf(intExtra));
        }
    }
}
