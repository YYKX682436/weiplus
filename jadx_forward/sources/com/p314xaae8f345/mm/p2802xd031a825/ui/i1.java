package com.p314xaae8f345.mm.p2802xd031a825.ui;

/* loaded from: classes9.dex */
public class i1 implements c01.qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f295723a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.n1 f295724b;

    public i1(java.lang.String[] strArr, com.p314xaae8f345.mm.p2802xd031a825.ui.n1 n1Var) {
        this.f295723a = strArr;
        this.f295724b = n1Var;
    }

    @Override // c01.qa
    public void a(com.p314xaae8f345.mm.p971x6de15a2e.s sVar) {
        com.p314xaae8f345.mm.p2802xd031a825.ui.n1 n1Var = this.f295724b;
        if (sVar == null || sVar.G() == null) {
            return;
        }
        java.lang.String[] strArr = this.f295723a;
        if (strArr == null || strArr.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletBaseUtil ", "hy: keys is null");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.String str : strArr) {
            try {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletBaseUtil ", "hy: key is null");
                } else {
                    byte[] v17 = sVar.G().v(str);
                    if (v17 != null) {
                        hashMap.put(str, new java.io.ObjectInputStream(new java.io.ByteArrayInputStream(v17)).readObject());
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletBaseUtil ", "hy: deserialize failed: %s", e17.toString());
                if (n1Var != null) {
                    n1Var.a(null);
                    return;
                }
                return;
            }
        }
        if (n1Var != null) {
            n1Var.a(hashMap);
        }
    }
}
