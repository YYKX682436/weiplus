package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes5.dex */
public class a3 implements com.p314xaae8f345.mm.p669x38b6e557.g5 {
    @Override // com.p314xaae8f345.mm.p669x38b6e557.g5
    public void a(android.content.Intent intent) {
        if (!z65.c.a() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
            return;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.w1 w1Var = (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.w1) ((ob0.a3) i95.n0.c(ob0.a3.class));
        w1Var.getClass();
        int intExtra = intent.getIntExtra("seconds", 1);
        if (intExtra > 0) {
            w1Var.Ri(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, intExtra);
        }
    }
}
