package gj0;

/* loaded from: classes12.dex */
public final class d extends gj0.b {
    @Override // gj0.b
    public int b() {
        boolean z17;
        try {
            z17 = !com.p314xaae8f345.mm.p2499xd05e7f95.C19819x7bfc77ed.m77342x316510(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RecoveryFuse", th6, "recovery init fail", new java.lang.Object[0]);
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z17 = false;
        }
        return z17 ? 1 : 0;
    }

    @Override // gj0.b
    public java.lang.String c() {
        return "recovery";
    }
}
