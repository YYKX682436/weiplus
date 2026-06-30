package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes5.dex */
public class v2 implements com.p314xaae8f345.mm.p669x38b6e557.g5 {
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MatrixShellService", "Stop sampling trace pid(%s)", java.lang.Integer.valueOf(intExtra));
        ph5.a.b(intExtra);
    }
}
