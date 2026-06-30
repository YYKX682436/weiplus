package com.p314xaae8f345.mm.p2802xd031a825.ui;

/* loaded from: classes9.dex */
public class g1 implements c01.qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f295716a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.p1 f295717b;

    public g1(java.lang.String str, com.p314xaae8f345.mm.p2802xd031a825.ui.p1 p1Var) {
        this.f295716a = str;
        this.f295717b = p1Var;
    }

    @Override // c01.qa
    public void a(com.p314xaae8f345.mm.p971x6de15a2e.s sVar) {
        com.p314xaae8f345.mm.p2802xd031a825.ui.p1 p1Var = this.f295717b;
        if (sVar == null || sVar.G() == null) {
            return;
        }
        java.lang.String str = this.f295716a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletBaseUtil ", "hy: key is null");
            return;
        }
        try {
            byte[] v17 = sVar.G().v(str);
            if (p1Var != null) {
                if (v17 != null) {
                    p1Var.a(new java.io.ObjectInputStream(new java.io.ByteArrayInputStream(v17)).readObject());
                } else {
                    p1Var.a(null);
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletBaseUtil ", "hy: deserialize failed: %s", e17.toString());
            if (p1Var != null) {
                p1Var.a(null);
            }
        }
    }
}
