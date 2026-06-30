package at4;

/* loaded from: classes9.dex */
public class w1 implements com.p314xaae8f345.mm.p2802xd031a825.ui.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ at4.x1 f95518a;

    public w1(at4.x1 x1Var) {
        this.f95518a = x1Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.p1
    public void a(java.lang.Object obj) {
        at4.x1 x1Var = this.f95518a;
        if (obj == null || !(obj instanceof java.lang.Double)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUserInfoManger", "hy: no balance info. set to negative");
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = x1Var.f95532h;
            if (c19091x9511676c != null) {
                c19091x9511676c.O2 = -1.0d;
                return;
            }
            return;
        }
        java.lang.Double d17 = (java.lang.Double) obj;
        if (d17.doubleValue() < 0.0d) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c2 = x1Var.f95532h;
        if (c19091x9511676c2 != null) {
            c19091x9511676c2.O2 = d17.doubleValue();
        }
    }
}
